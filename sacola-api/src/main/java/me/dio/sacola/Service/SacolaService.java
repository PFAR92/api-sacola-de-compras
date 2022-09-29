package me.dio.sacola.Service;

import me.dio.sacola.model.Item;
import me.dio.sacola.model.Sacola;

public interface SacolaService {
    Item incluirItemNaSacola();
    Sacola verSacola(Long id);
    Sacola fecharSacola(Long id, int formaPagamento);
}
