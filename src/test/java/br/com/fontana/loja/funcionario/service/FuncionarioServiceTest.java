package br.com.fontana.loja.funcionario.service;

import br.com.fontana.loja.funcionario.response.FuncionarioResponse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by te40744 on 20/09/2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class FuncionarioServiceTest {

    @Autowired
    private FuncionarioService funcionarioService;

    @Test
    public void buscaDadoGerente(){

        FuncionarioResponse func = funcionarioService.pesquisaDadosGerente(625582L);
        assertThat(func).isNotNull();
    }

    @Test
    public void obterMatrGerenteClassico(){

        Long matr = funcionarioService.obterMatrGerenteClassico(625582L);
        assertThat(matr).isNotNull();
    }

    @Test
    public void obterGerSegCliAgencia(){

        Map<Long, FuncionarioResponse> mapSer = funcionarioService.obterGerSegCliAgencia(Short.parseShort("1"),Short.parseShort("1"),"10|19");
        assertThat(mapSer).isNotEmpty();
    }

    @Test
    public void obterFuncRelCliente(){

        List<FuncionarioResponse> lst = this.funcionarioService.obterFuncRelCliente(43641598L);
        assertThat(lst).isNotEmpty();
    }

    @Test
    public void obterFuncPorMatricula(){

        FuncionarioResponse tb1 = this.funcionarioService.obterFuncionario(440584L);
        assertThat(tb1).isNotNull();
    }

    @Test
    public void verificaPermissaoAbordTest(){

        Boolean b = this.funcionarioService.obterPermissaoAbordagem(679677L);
        assertThat(b).isFalse();
    }

    @Test
    public void obterFuncionarioCliente(){

        FuncionarioResponse tb1 = this.funcionarioService.obterFuncionarioCliente(11772112L);
        assertThat(tb1).isNotNull();
    }
}


