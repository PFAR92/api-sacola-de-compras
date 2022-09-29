package me.dio.sacola.service.impl;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import me.dio.sacola.enumeration.FormaPagamento;
import me.dio.sacola.model.Item;
import me.dio.sacola.model.Sacola;
import me.dio.sacola.repository.SacolaRepository;
import me.dio.sacola.resource.dto.ItemDto;
import me.dio.sacola.service.SacolaService;

@Service
@RequiredArgsConstructor

public class SacolaServiceImpl implements SacolaService{
    private final SacolaRepository sacolaRepository;

    @Override
    public Item incluirItemNaSacola(ItemDto itemDto) {
        return null;
    }

    @Override
    public Sacola verSacola(Long id) {
        return sacolaRepository.findById(id).orElseThrow(
            () -> {
                throw new RuntimeException("Essa sacola não existe!");
            }
        );
    }

    @Override
    public Sacola fecharSacola(Long id, int numeroFormaPagamento) {

        Sacola sacola = verSacola(id);
        if (sacola.getItens().isEmpty()) {
            throw new RuntimeException("Inclua itens na sacola!");
        }

        FormaPagamento formaPagamento = numeroFormaPagamento == 0 ? FormaPagamento.DINHEIRO : FormaPagamento.MAQUINETA;

        sacola.setFormaPagamento(formaPagamento);
        sacola.setFechada(true);
        return sacolaRepository.save(sacola);

    }
    
}
