package com.nazax.prova.service;

import com.nazax.prova.dtos.MovimentoDTO;
import com.nazax.prova.models.Movimento;
import com.nazax.prova.repository.MovimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class MovimentoService {

    @Autowired
    private MovimentoRepository movimentoRepository;

    public List<MovimentoDTO> listarTodos() {
        return movimentoRepository.findAll().stream()
                .map(movimento -> new MovimentoDTO(movimento.getId(), movimento.getDataMovimento(), movimento.getValor(), movimento.getClassificacao(), movimento.getObservacao()))
                .collect(Collectors.toList());
    }

    public MovimentoDTO salvar(MovimentoDTO movimentoDTO) {
        Movimento movimento = new Movimento();
        movimento.setDataMovimento(movimentoDTO.getDataMovimento());
        movimento.setValor(movimentoDTO.getValor());
        movimento.setClassificacao(movimentoDTO.getClassificacao());
        movimento.setObservacao(movimentoDTO.getObservacao());

        Movimento savedMovimento = movimentoRepository.save(movimento);
        return new MovimentoDTO(savedMovimento.getId(), savedMovimento.getDataMovimento(), savedMovimento.getValor(), savedMovimento.getClassificacao(), savedMovimento.getObservacao());
    }

    public MovimentoDTO atualizar(Long id, MovimentoDTO movimentoDTO) {
        Optional<Movimento> optionalMovimento = movimentoRepository.findById(id);
        if (optionalMovimento.isPresent()) {
            Movimento movimento = optionalMovimento.get();
            movimento.setDataMovimento(movimentoDTO.getDataMovimento());
            movimento.setValor(movimentoDTO.getValor());
            movimento.setClassificacao(movimentoDTO.getClassificacao());
            movimento.setObservacao(movimentoDTO.getObservacao());
            Movimento updatedMovimento = movimentoRepository.save(movimento);
            return new MovimentoDTO(updatedMovimento.getId(), updatedMovimento.getDataMovimento(), updatedMovimento.getValor(), updatedMovimento.getClassificacao(), updatedMovimento.getObservacao());
        }
        return null;
    }

    public boolean excluir(Long id) {
        Optional<Movimento> optionalMovimento = movimentoRepository.findById(id);
        if (optionalMovimento.isPresent()) {
            movimentoRepository.delete(optionalMovimento.get());
            return true;
        }
        return false;
    }
}