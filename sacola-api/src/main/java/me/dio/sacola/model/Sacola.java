package me.dio.sacola.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import me.dio.sacola.enumeration.FormaPagamento;

@Entity
public class Sacola {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JsonIgnore
    private Cliente cliente;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Item> items;
    private Double valorTotal;

    @Enumerated
    private FormaPagamento FormaPagamento;
    private boolean fechada;

    

    public Sacola() {
    }



    public Sacola(long id, Cliente cliente, List<Item> items, Double valorTotal,
            me.dio.sacola.enumeration.FormaPagamento formaPagamento, boolean fechada) {
        this.id = id;
        this.cliente = cliente;
        this.items = items;
        this.valorTotal = valorTotal;
        FormaPagamento = formaPagamento;
        this.fechada = fechada;
    }



    public long getId() {
        return id;
    }



    public void setId(long id) {
        this.id = id;
    }



    public Cliente getCliente() {
        return cliente;
    }



    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }



    public List<Item> getItems() {
        return items;
    }



    public void setItems(List<Item> items) {
        this.items = items;
    }



    public Double getValorTotal() {
        return valorTotal;
    }



    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }



    public FormaPagamento getFormaPagamento() {
        return FormaPagamento;
    }



    public void setFormaPagamento(FormaPagamento formaPagamento) {
        FormaPagamento = formaPagamento;
    }



    public boolean isFechada() {
        return fechada;
    }



    public void setFechada(boolean fechada) {
        this.fechada = fechada;
    }  
    
    

    
}
