package com.ecommerce.backend.service;

import com.ecommerce.backend.entity.Produto;
import com.ecommerce.backend.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;
import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    public ProdutoRepository produtoRepository;

    public List<Produto> buscarTodos(){
        return produtoRepository.findAll();
    }

    public Produto inserir(Produto produto){
        produto.setDataCriacao(new Date());
        Produto produtoNovo = produtoRepository.saveAndFlush(produto);
        return produtoNovo;
    }

    public Produto alterar(Produto produto){
        produto.setDataCriacao(new Date());
        Produto produtoNovo = produtoRepository.saveAndFlush(produto);
        return produtoNovo;
    }

    public void excluir(Long id){
        Produto produto = produtoRepository.findById(id).get();
        produtoRepository.delete(produto);
    }
}
