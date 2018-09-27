package br.com.fontana.loja.funcionario.dao;


import br.com.fontana.loja.funcionario.entity.TbFunc;
import br.com.fontana.loja.funcionario.response.FuncionarioResponse;

import java.util.List;
import java.util.Map;

public interface FuncionarioDAO {

    /**
     * Busca a matricula do gerente classico se houver, senao volta a propria matricula
     * @param nrMatrFunc
     * @return numero da matricula
     */
    public Long obterMatrGerenteClassico(Long nrMatrFunc);

    /**
     * Retorna os dados do funcionario coma matricula informada
     * @param nrMatrFunc
     * @return dados do funcionario
     * @see FuncionarioResponse
     */
    public FuncionarioResponse pesquisaDadosGerente(Long nrMatrFunc);

    /**
     * Retorna o gerente do segmento do cliente na agencia
     * @param tpUor
     * @param cdUor
     * @param penumpers
     * @return
     * @see TbFunc
     */
    public Map<Long, TbFunc> obterGerSegCliAgencia(Short tpUor, Short cdUor, String penumpers);

    /**
     * Retorna funcionarios relacionados ao cliente
     * @param penumper
     * @return List<TbFunc>
     * @see TbFunc
     */
    public List<TbFunc> obterFuncRelCliente(Long penumper);

    /**
     * Busca funcionarios por matricula
     * @param matricula
     * @return TbFunc
     * @see TbFunc
     */
    public TbFunc obterFuncionario(Long matricula);

    /**
     * Retorna se funcionario tem permissao para fazer abordagem
     * @param matricula
     * @return
     */
    public boolean obterPermissaoAbordagem(Long matricula);

    /**
     * Retorna os dados de funcionario se este for um cliente
     * @param penumper
     * @return TbFunc
     * @see TbFunc
     */
    public TbFunc obterFuncionarioCliente(Long penumper);
}
