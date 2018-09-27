package br.com.fontana.loja.funcionario.service;


import br.com.fontana.loja.funcionario.response.FuncionarioResponse;

import java.util.List;
import java.util.Map;

/**
 * Created by te40744 on 06/09/2017.
 */
public interface FuncionarioService {

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
     * @see FuncionarioResponse
     */
    public Map<Long, FuncionarioResponse> obterGerSegCliAgencia(Short tpUor, Short cdUor, String penumpers);

    /**
     * Retorna funcionarios relacionados ao cliente
     * @param penumper
     * @return List<FuncionarioResponse>
     * @see FuncionarioResponse
     */
    public List<FuncionarioResponse> obterFuncRelCliente(Long penumper);

    /**
     * Busca funcuionario por matricula
     * @param matricula
     * @return FuncionarioResponse
     * @see FuncionarioResponse
     */
    public FuncionarioResponse obterFuncionario(Long matricula);

    /**
     * Retorna se funcionario tem permissao para fazer abordagem
     * @param matricula
     * @return
     */
    public boolean obterPermissaoAbordagem(Long matricula);

    /**
     * Retorna os dados de funcionario se este for um cliente
     * @param penumper
     * @return FuncionarioResponse
     * @see FuncionarioResponse
     */
    public FuncionarioResponse obterFuncionarioCliente(Long penumper);
}
