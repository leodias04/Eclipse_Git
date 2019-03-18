package br.fsj.model;

public class Professor extends Pessoa {

	 private float salario;
	    private String endereco;
	    private String telefone;
	        
	    public float getSalario() {
	        return salario;
	    }
	    public void setSalario(float salario) {
	        this.salario = salario;
	    }
	    public String getEndereco() {
	        return endereco;
	    }
	    public void setEndereco(String endereco) {
	        this.endereco = endereco;
	    }
	    public String getTelefone() {
	        return telefone;
	    }
	    public void setTelefone(String telefone) {
	        this.telefone = telefone;
	    }
	    

}
