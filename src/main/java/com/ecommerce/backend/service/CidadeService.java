package com.ecommerce.backend.service;

import com.ecommerce.backend.entity.Cidade;
import com.ecommerce.backend.repository.CidadeReposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CidadeService {

    @Autowired
    private CidadeReposity cidadeReposity;

    public List<Cidade> buscarTodos(){
        return cidadeReposity.findAll();
    }
    public Cidade inserir(Cidade cidade){
        cidade.setDataCriacao(new Date());
        Cidade cidadeNovo = cidadeReposity.saveAndFlush(cidade);
        return cidadeNovo;
    }
    public Cidade alterar(Cidade cidade){
        cidade.setDataAtualizacao(new Date());
        return cidadeReposity.saveAndFlush(cidade);
    }
    public void excluir(Long id){
        Cidade cidade = cidadeReposity.findById(id).get();
        cidadeReposity.delete(cidade);
    }

}
