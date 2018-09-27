package br.com.fontana.loja.funcionario.service.impl;


import br.com.fontana.loja.funcionario.dao.FuncionarioDAO;
import br.com.fontana.loja.funcionario.entity.TbFunc;
import br.com.fontana.loja.funcionario.entity.TbFuncCart;
import br.com.fontana.loja.funcionario.entity.TbUorBncr;
import br.com.fontana.loja.funcionario.entity.TbUorBncrId;
import br.com.fontana.loja.funcionario.response.FuncionarioResponse;
import br.com.fontana.loja.funcionario.service.FuncionarioService;
import br.com.fontana.loja.funcionario.util.FormatUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by te40744 on 06/09/2017.
 */
@Service
public class FuncionarioServiceImpl implements FuncionarioService {

    @Autowired
    public FuncionarioServiceImpl(FuncionarioDAO funcionarioDAO){
        this.funcionarioDAO = funcionarioDAO;
    }

    private FuncionarioDAO funcionarioDAO;

    @Transactional(readOnly = true)
    public Long obterMatrGerenteClassico(Long p_nrMatrFunc){
        return funcionarioDAO.obterMatrGerenteClassico(p_nrMatrFunc);
    }


    @Transactional(readOnly = true)
    public FuncionarioResponse pesquisaDadosGerente(Long matriculaFuncLogado){
        return funcionarioDAO.pesquisaDadosGerente(matriculaFuncLogado);
    }

    @Transactional(readOnly = true)
    public Map<Long, FuncionarioResponse> obterGerSegCliAgencia(Short tpUor, Short cdUor, String penumpers) {

        Map<Long, FuncionarioResponse> mapRetorno = null;

        Map<Long, TbFunc> mapDao = funcionarioDAO.obterGerSegCliAgencia(tpUor,cdUor,penumpers);

        if(!mapDao.isEmpty()) {
            mapRetorno = new HashMap<Long, FuncionarioResponse>();

            for (Long penumper : mapDao.keySet()) {
                FuncionarioResponse funcDbDto = toFuncionarioDbDTO(mapDao.get(penumper), true, false);
                mapRetorno.put(penumper, funcDbDto);
            }
        }

        return mapRetorno;
    }

    @Transactional(readOnly = true)
    public List<FuncionarioResponse> obterFuncRelCliente(Long penumper){

        List<TbFunc> tb1;
        List<FuncionarioResponse> funcionarios = null;

        tb1 = this.funcionarioDAO.obterFuncRelCliente(penumper);
        if (!tb1.isEmpty()) {

            funcionarios = new ArrayList<>();

            for (final TbFunc f : tb1) {
                funcionarios.add(toFuncionarioDbDTO(f, true, false));
            }
        }

        return funcionarios;
    }

    @Transactional(readOnly = true)
    public FuncionarioResponse obterFuncionario(Long matricula){
        FuncionarioResponse resp = null;
        TbFunc tb = funcionarioDAO.obterFuncionario(matricula);

        if(tb != null){
            resp = toFuncionarioDbDTO(tb,false,true);
        }

        return resp;
    }

    @Transactional(readOnly = true)
    public boolean obterPermissaoAbordagem(Long matricula) {
        return funcionarioDAO.obterPermissaoAbordagem(matricula);
    }

    @Transactional(readOnly = true)
    public FuncionarioResponse obterFuncionarioCliente(Long penumper) {
        FuncionarioResponse resp = null;
        TbFunc tb = funcionarioDAO.obterFuncionarioCliente(penumper);

        if(tb != null){
            resp = toFuncionarioDbDTO(tb,false,true);
        }

        return resp;
    }

    private FuncionarioResponse toFuncionarioDbDTO(TbFunc f, boolean carregaCarteira, boolean verificaClassico) {

        Short tpUor = null;
        Short cdUor = null;
        String nmUor = null;
        String indicadorGerenteSelect = "N";

        if (f.getTbUorBncr() != null) {
            TbUorBncr tb2 = f.getTbUorBncr();

            if (tb2.getId() != null) {
                TbUorBncrId tb2Id = tb2.getId();
                tpUor = tb2Id.getTpUor();
                cdUor = tb2Id.getCdUor();
                nmUor = tb2.getNmUor();
            }

            if (StringUtils.isNotBlank(tb2.getTpClafAltaRend())) {
                if (StringUtils.equalsIgnoreCase(tb2.getTpClafAltaRend(), "SE")) {
                    indicadorGerenteSelect = "S";
                }
            }
        }

        String carteira = null;

        if (carregaCarteira) {
            List<TbFuncCart> tb3 = f.getTbFuncCarts();

            if (!tb3.isEmpty()) {
                carteira = tb3.get(0).getId().getCdCart();
            }
        }

        String codigoCargo = null;
        String tipoCargo = null;
        String nomeCargo = null;
        String tipoClienteCateg = null;

        if (f.getTbCarg() != null) {
            codigoCargo = f.getTbCarg().getCdCarg();
            tipoCargo = f.getTpCargFunc() == null ? "NA" : f.getTpCargFunc();
            nomeCargo = f.getTbCarg().getNmCarg();
            tipoClienteCateg = String.valueOf(f.getTbCatgFunc().getTpPessCatg());
        }

        Long codigoCategoria = f.getTbCatgFunc() != null ? new Long(f.getTbCatgFunc().getCdCatg()) : null;
        String descCategAbrev = f.getTbCatgFunc() != null ? f.getTbCatgFunc().getDsCatgAbrv():"";

        Long matrGerente = f.getNrMatrFunc();
        if (verificaClassico) {
                matrGerente = this.funcionarioDAO.obterMatrGerenteClassico(f.getNrMatrFunc());
        }

        FuncionarioResponse funcResponse = new FuncionarioResponse();
                funcResponse.setMatricula(f.getNrMatrFunc());
                funcResponse.setNome(f.getNmFunc());
                funcResponse.setTipoUniorg(tpUor);
                funcResponse.setCodigoUniorg(cdUor);
                funcResponse.setNomeUniorg(nmUor);
                funcResponse.setEmail(StringUtils.trimToEmpty(f.getNmEmail()));
                funcResponse.setNumeroDDD(f.getCdDddTelf());
                funcResponse.setNumeroTelefone(f.getNrTelf());
                funcResponse.setCarteira(carteira);
                funcResponse.setDataAdmissao(FormatUtils.parseDate(f.getDtAdms(),false));
                funcResponse.setIndicadorMaiorRelacionamentoCliente(f.getIndMaiorRelac());
                funcResponse.setIndicadorGerenteSelect(indicadorGerenteSelect);
                funcResponse.setCodigoCargo(codigoCargo);
                funcResponse.setTipoCargo(tipoCargo == null ? f.getTpCargFunc() : tipoCargo);
                funcResponse.setNomeCargo(nomeCargo);
                funcResponse.setMatrGerenteClassico(matrGerente);
                funcResponse.setGerenteClassico(!f.getNrMatrFunc().equals(matrGerente));
                funcResponse.setDsPerfil(f.getDsPerfMbsFunc());
                funcResponse.setDsSigla(f.getDsSiglSistFunc());
                funcResponse.setCodigoCategoria(codigoCategoria);
                funcResponse.setDescCategAbrev(descCategAbrev);
                funcResponse.setTipoClienteCateg(tipoClienteCateg);
                funcResponse.setTipoClassifGerente(f.getTbUorBncr() != null && f.getTbUorBncr().getTpClafAltaRend() != null ? f.getTbUorBncr().getTpClafAltaRend() : "");


        return funcResponse;
    }


}
