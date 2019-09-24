/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Administrador
 */
public class Prefeitura {
    private Integer nrfuncionario;
    private String endereco;
    private String nome;
    private Integer codigo;

    public Integer getNrfuncionario() {
        return nrfuncionario;
    }

    public void setNrfuncionario(Integer nrfuncionario) {
        this.nrfuncionario = nrfuncionario;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Prefeitura{" + "nome=" + nome + '}';
    }
    
}
