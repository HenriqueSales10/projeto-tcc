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
public class Alunos {
    private String matricula;
    private String nome;
    private String sobrenome;
    private String turma;
    private String telefonePais;
    private String emailPais;

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
      
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTelefonePais() {
        return telefonePais;
    }

    public void setTelefonePais(String telefonePais) {
        this.telefonePais = telefonePais;
    }

    public String getEmailPais() {
        return emailPais;
    }

    public void setEmailPais(String emailPais) {
        this.emailPais = emailPais;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    
}
