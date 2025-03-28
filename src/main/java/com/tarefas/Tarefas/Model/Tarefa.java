package com.tarefas.Tarefas.Model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tarefa")
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String descricao;

    @Column(nullable = false)
    private LocalDate dataCriacao;

    @Column(nullable = false)
    private LocalDate dataPrevista;

    private LocalDate dataEncerramento;

    @Enumerated(EnumType.ORDINAL)
    @Column(nullable = false)
    private SituacaoTarefa situacao;

    public Tarefa() {}

    public Tarefa(String descricao, LocalDate dataCriacao, LocalDate dataPrevista, LocalDate dataEncerramento, SituacaoTarefa situacao) {
        this.descricao = descricao;
        this.dataCriacao = dataCriacao;
        this.dataPrevista = dataPrevista;
        this.dataEncerramento = dataEncerramento;
        this.situacao = situacao;
    }

    public Integer getId() { return id; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public LocalDate getDataCriacao() { return dataCriacao; }
    public LocalDate getDataPrevista() { return dataPrevista; }
    public LocalDate getDataEncerramento() { return dataEncerramento; }
    public void setDataEncerramento(LocalDate dataEncerramento) { this.dataEncerramento = dataEncerramento; }
    public SituacaoTarefa getSituacao() { return situacao; }
    public void setSituacao(SituacaoTarefa situacao) { this.situacao = situacao; }
}
