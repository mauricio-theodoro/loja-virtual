package com.ecommerce.backend.controller;

import com.ecommerce.backend.entity.Permissao;
import com.ecommerce.backend.service.PermissaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/permissao")
public class PermissaoController {

    @Autowired
    private PermissaoService permissaoService;

    @GetMapping("/")
    public List<Permissao> buscarTodos(){
        return permissaoService.buscarTodos();
    }

    @PostMapping("/inserir")
    public Permissao inserir(@RequestBody Permissao permissao){
        return permissaoService.inserir(permissao);
    }

    @PutMapping("/alterar")
    public Permissao alterar(@RequestBody Permissao permissao){
        return permissaoService.alterar(permissao);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable("id") Long id){
        permissaoService.excluir(id);
        return ResponseEntity.ok().build();
    }
}
