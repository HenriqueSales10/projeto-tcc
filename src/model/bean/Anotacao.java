/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author henri
 */
public class Anotacao {
   private String matricula;
    private String nome;
    private String sobrenome;
     private String turma;
    private String tipoInfracao;
    private String tipoInfracao2;
    private String tipoInfracao3;
    private String observacao;

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public String getTipoInfracao() {
        return tipoInfracao;
    }

    public void setTipoInfracao(String tipoInfracao) {
        this.tipoInfracao = tipoInfracao;
    }

    public String getTipoInfracao2() {
        return tipoInfracao2;
    }

    public void setTipoInfracao2(String tipoInfracao2) {
        this.tipoInfracao2 = tipoInfracao2;
    }

    public String getTipoInfracao3() {
        return tipoInfracao3;
    }

    public void setTipoInfracao3(String tipoInfracao3) {
        this.tipoInfracao3 = tipoInfracao3;
    }
 public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    
}
