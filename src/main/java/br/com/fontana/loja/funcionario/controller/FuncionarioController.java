package br.com.fontana.loja.funcionario.controller;

import br.com.fontana.loja.funcionario.response.FuncionarioResponse;
import br.com.fontana.loja.funcionario.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * Created by te40744 on 20/09/2017.
 */
@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

    private FuncionarioService funcionarioService;

    @Autowired
    public FuncionarioController(FuncionarioService funcionarioService){
        this.funcionarioService = funcionarioService;
    }

    @RequestMapping(value = "/{matricula}", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<FuncionarioResponse> buscarFuncionario(@PathVariable("matricula") Long matricula) {

        FuncionarioResponse c = funcionarioService.obterFuncionario(matricula);

        if (c == null) {
            throw new ResourceNotFoundException();
        }

        return new ResponseEntity<>(c, HttpStatus.OK);
    }

    @RequestMapping(value = "dados/gerente/{matricula}", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<FuncionarioResponse> buscarDadosGerente(@PathVariable("matricula") Long matricula) {

        FuncionarioResponse c = funcionarioService.pesquisaDadosGerente(matricula);

        if (c == null) {
            throw new ResourceNotFoundException();
        }

        return new ResponseEntity<>(c, HttpStatus.OK);
    }

    @RequestMapping(value = "gerente/segmento/cliente/{tpUor}/{cdUor}/{penumpers}", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Map<Long, FuncionarioResponse>> obterGerSegCliAgencia(@PathVariable("tpUor") Short tpUor, @PathVariable("cdUor") Short cdUor, @PathVariable("penumpers") String penumpers) {

        Map<Long, FuncionarioResponse> maps = funcionarioService.obterGerSegCliAgencia(tpUor,cdUor,penumpers);

        if (maps == null) {
            throw new ResourceNotFoundException();
        }

        return new ResponseEntity<>(maps, HttpStatus.OK);
    }

    @RequestMapping(value = "gerente/classico/{matricula}", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Long> buscarMatriculaClassico(@PathVariable("matricula") Long matricula) {

        Long c = funcionarioService.obterMatrGerenteClassico(matricula);

        if (c == null) {
            throw new ResourceNotFoundException();
        }

        return new ResponseEntity<>(c, HttpStatus.OK);
    }

    @RequestMapping(value = "clientes/{penumper}", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<List<FuncionarioResponse>> buscarFuncRelCliente(@PathVariable("penumper") Long penumper) {

        List<FuncionarioResponse> lst = funcionarioService.obterFuncRelCliente(penumper);

        if (lst == null) {
            throw new ResourceNotFoundException();
        }

        return new ResponseEntity<>(lst, HttpStatus.OK);
    }

    @RequestMapping(value = "permissao/abordagem/{matricula}", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Boolean> verificaPermissaoAbordagem(@PathVariable("matricula") Long matricula) {

        Boolean b = funcionarioService.obterPermissaoAbordagem(matricula);

        return new ResponseEntity<>(b, HttpStatus.OK);
    }

    @RequestMapping(value = "cliente/{penumper}", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<FuncionarioResponse> obterFuncionarioCliente(@PathVariable("penumper") Long penumper) {

        FuncionarioResponse c = funcionarioService.obterFuncionarioCliente(penumper);
        if (c == null) {
            throw new ResourceNotFoundException();
        }

        return new ResponseEntity<>(c, HttpStatus.OK);
    }

}
