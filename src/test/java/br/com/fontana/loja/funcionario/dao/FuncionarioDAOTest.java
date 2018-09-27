package br.com.fontana.loja.funcionario.dao;

import br.com.fontana.loja.funcionario.dao.FuncionarioDAO;
import br.com.fontana.loja.funcionario.entity.TbFunc;
import br.com.fontana.loja.funcionario.response.FuncionarioResponse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by te40744 on 20/09/2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class FuncionarioDAOTest {

    @Autowired
    private FuncionarioDAO funcionarioDAO;

    @Test
    @Transactional
    public void buscaDadoGerente(){

        FuncionarioResponse func = funcionarioDAO.pesquisaDadosGerente(625582L);
        assertThat(func).isNotNull();

    }

    @Test
    @Transactional
    public void obterMatrGerenteClassico(){

        Long matr = funcionarioDAO.obterMatrGerenteClassico(625582L);
        assertThat(matr).isNotNull();
    }

    @Test
    @Transactional
    public void obterGerSegCliAgencia(){

        Map<Long, TbFunc> mapDao = funcionarioDAO.obterGerSegCliAgencia(Short.parseShort("1"),Short.parseShort("1"),"10|19");
        assertThat(mapDao).isNotEmpty();
    }

    @Test
    @Transactional
    public void obterFuncRelCliente(){

        List<TbFunc> tb1 = this.funcionarioDAO.obterFuncRelCliente(43641598L);
        assertThat(tb1).isNotEmpty();
    }

    @Test
    @Transactional
    public void obterFuncPorMatricula(){

        TbFunc tb1 = this.funcionarioDAO.obterFuncionario(440584L);
        assertThat(tb1).isNotNull();
    }

    @Test
    @Transactional
    public void verificaPermissaoAbordTest(){

        Boolean b = this.funcionarioDAO.obterPermissaoAbordagem(679677L);
        assertThat(b).isFalse();
    }

    @Test
    @Transactional
    public void obterFuncionarioCliente(){

        TbFunc tb1 = this.funcionarioDAO.obterFuncionarioCliente(11772112L);
        assertThat(tb1).isNotNull();
    }
}
