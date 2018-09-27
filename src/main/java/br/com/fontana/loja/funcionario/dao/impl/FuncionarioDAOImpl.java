package br.com.fontana.loja.funcionario.dao.impl;

import br.com.fontana.loja.funcionario.dao.FuncionarioDAO;
import br.com.fontana.loja.funcionario.entity.*;
import br.com.fontana.loja.funcionario.response.FuncionarioResponse;
import org.hibernate.Session;
import org.hibernate.procedure.ProcedureCall;
import org.hibernate.result.Output;
import org.hibernate.result.ResultSetOutput;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.math.BigDecimal;
import java.util.*;

@Repository
public class FuncionarioDAOImpl implements FuncionarioDAO{

    @PersistenceContext
    private EntityManager entityManager;

    public Long obterMatrGerenteClassico(Long p_nrMatrFunc){

        Long ret = p_nrMatrFunc;
        Session session = entityManager.unwrap(Session.class);
        ProcedureCall call = session.createStoredProcedureCall(ProceduresFec.getGerenteClassico());

        call.registerParameter(1, Long.class, ParameterMode.IN).bindValue(p_nrMatrFunc);
        call.registerParameter(2, Class.class,ParameterMode.REF_CURSOR);

        Output output = call.getOutputs().getCurrent();
        if (output.isResultSet()) {
            List<BigDecimal> postComments = ((ResultSetOutput) output).getResultList();

            if(postComments!=null)
                ret = postComments.get(0).longValue();
        }

        return ret;
    }

    public FuncionarioResponse pesquisaDadosGerente(Long matriculaFuncLogado) {

        Session session = entityManager.unwrap(Session.class);
        ProcedureCall call = session.createStoredProcedureCall(ProceduresFec.getDadosGerente());

        FuncionarioResponse funcionario = null;

        call.registerParameter(1, Long.class, ParameterMode.IN).bindValue(matriculaFuncLogado);
        call.registerParameter(2, Class.class,ParameterMode.REF_CURSOR);

        ResultSetOutput output = (ResultSetOutput) call.getOutputs().getCurrent();
        if (output.isResultSet()) {
            List<Object[]> result = output.getResultList();
            Object[] obj = result.get(0);

            funcionario = new FuncionarioResponse();
            if(obj[0]!=null)
                funcionario.setMatricula(Long.parseLong(obj[0].toString()));
            if(obj[1]!=null)
                funcionario.setNome(obj[1].toString());
            if(obj[2]!=null)
                funcionario.setTipoUniorg(Short.parseShort(obj[2].toString()));
            if(obj[3]!=null)
                funcionario.setCodigoUniorg(Short.parseShort(obj[3].toString()));
            if(obj[4]!=null)
                funcionario.setNomeUniorg(obj[4].toString());
            if(obj[5]!=null)
                funcionario.setNomePorteAgencia(obj[5].toString());
            if(obj[6]!=null)
                funcionario.setInPermiteJustGereGeral(obj[6].toString());
        }

        return funcionario;
    }


    public Map<Long, TbFunc> obterGerSegCliAgencia(Short tpUor, Short cdUor, String penumpers) {

        Map<Long, TbFunc> mapaRetorno = null;
        Session session = entityManager.unwrap(Session.class);
        ProcedureCall call = session.createStoredProcedureCall(ProceduresFec.getSpConGerenteAgencia());

        call.registerParameter(1, String.class, ParameterMode.IN).bindValue(penumpers);
        call.registerParameter(2, Short.class, ParameterMode.IN).bindValue(tpUor);
        call.registerParameter(3, Short.class, ParameterMode.IN).bindValue(cdUor);
        call.registerParameter(4, Class.class,ParameterMode.REF_CURSOR);

        ResultSetOutput output = (ResultSetOutput) call.getOutputs().getCurrent();
        if (output.isResultSet()) {
            List<Object[]> result = output.getResultList();
            mapaRetorno = new HashMap<>();
            for(int i=0;i<result.size();i++){
                Object[] obj = result.get(i);
                TbFunc f = new TbFunc();
                f.setNrMatrFunc(Long.parseLong(obj[1].toString()));
                f.setNmFunc(obj[2].toString());

                if ((obj[3] != null) && (obj[4] != null)) {
                    final TbUorBncr tbUor = new TbUorBncr();
                    TbUorBncrId tbUorId = null;
                    tbUorId = new TbUorBncrId(Short.parseShort(obj[3].toString()), Short.parseShort(obj[4].toString()));
                    tbUor.setId(tbUorId);
                    f.setTbUorBncr(tbUor);
                }

                if(obj[0] != null) {
                    Long penumper = Long.parseLong(obj[0].toString());
                    mapaRetorno.computeIfAbsent(penumper,p -> f);
                }
            }
        }

        return mapaRetorno;
    }

    public List<TbFunc> obterFuncRelCliente(Long penumper) {

        Session session = entityManager.unwrap(Session.class);
        ProcedureCall call = session.createStoredProcedureCall(ProceduresFec.getSpDadosGerenteCliente());

        call.registerParameter(1, Long.class, ParameterMode.IN).bindValue(penumper);
        call.registerParameter(2, Class.class,ParameterMode.REF_CURSOR);

        List<TbFunc> lista = null;

        ResultSetOutput output = (ResultSetOutput) call.getOutputs().getCurrent();
        if (output.isResultSet()) {
            List<Object[]> result = output.getResultList();
            lista = new ArrayList<>();
            for(int i=0;i<result.size();i++){
                Object[] obj = result.get(i);
                TbFunc f = new TbFunc();

                f.setTpCargFunc(obj[13].toString());
                f.setNrMatrFunc(Long.parseLong(obj[0].toString()));
                f.setNmFunc(obj[1].toString());

                if ((obj[2] != null) && (obj[3] != null)) {
                    TbUorBncr tbUor = new TbUorBncr();
                    TbUorBncrId tbUorId = null;
                    tbUorId = new TbUorBncrId(Short.parseShort(obj[2].toString()), Short.parseShort(obj[3].toString()));
                    tbUor.setId(tbUorId);
                    if(obj[4] != null)
                        tbUor.setNmUor(obj[4].toString());

                    f.setTbUorBncr(tbUor);
                }

                if (obj[5] != null) {
                    f.setNmEmail(obj[5].toString());
                }

                if (obj[6] != null) {
                    f.setCdDddTelf(Short.parseShort(obj[6].toString()));
                }

                if (obj[7] != null) {
                    f.setNrTelf(Long.parseLong(obj[7].toString()));
                }

                if(obj[9] != null) {
                    List<TbFuncCart> funcCarts = new ArrayList<>();
                    TbFuncCartId funcCartId = new TbFuncCartId(obj[9].toString(), f.getNrMatrFunc());
                    TbFuncCart funcCart = new TbFuncCart(funcCartId);
                    funcCarts.add(funcCart);
                    f.setTbFuncCarts(funcCarts);
                }

                if (obj[8] != null) {
                    f.setDtAdms((Date) obj[8]);
                }

                if (obj[10] != null) {
                    f.setIndMaiorRelac(obj[10].toString());
                }

                if (obj[14] != null) {
                    TbCatgFunc catgFunc = new TbCatgFunc();
                    catgFunc.setDsCatgAbrv(obj[14].toString());
                    f.setTbCatgFunc(catgFunc);
                }

                lista.add(f);
            }
        }

        return lista;
    }

    public TbFunc obterFuncionario(final Long matricula) {
        return entityManager.find(TbFunc.class, matricula);
    }

    public boolean obterPermissaoAbordagem(Long matricula){

        StringBuilder sql = new StringBuilder();
        sql.append("SELECT COUNT(*) FROM TbFunc f");
        sql.append(" WHERE f.tbUorBncr.id.tpUor IN (1, 2, 3, 7, 11, 19, 20, 25, 26, 29, 30, 33, 159)");
        sql.append(" AND f.nrMatrFunc = :matricula");
        sql.append(" AND f.tpCargFunc <> 'CX'");

        Query query = entityManager.createQuery(sql.toString()).setParameter("matricula",matricula);
        Long val = (Long) query.getSingleResult();

        return (val > 0);
    }

    public TbFunc obterFuncionarioCliente(Long penumper){

        StringBuilder sql = new StringBuilder();
        sql.append("SELECT c FROM TbFunc c WHERE c.cdPess IN (SELECT c1.cdPess ");
        sql.append("FROM TbClie c1, TbClie c2 WHERE c2.cdPess = :penumper ");
        sql.append("AND c1.nrCpfCnpj = c2.nrCpfCnpj AND c1.dtNascCnst = c2.dtNascCnst)");
        sql.append("AND c.tpSituFunc NOT IN ('R')");

        Query query = entityManager.createQuery(sql.toString(), TbFunc.class).setParameter("penumper", penumper);
        return (TbFunc) query.getSingleResult();

    }
}
