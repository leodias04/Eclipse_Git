package br.fsj.model;

public class Aluno  extends Pessoa{

	private float nota1;
    private float nota2;
    private float media;
    private String matricula;
    private String situacao;
    
    public String getSituacao() {
        return situacao;
    }
    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    public float getNota1() {
        return nota1;
    }
    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }
    public float getNota2() {
        return nota2;
    }
    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }
    public float getMedia() {
        return media;
    }
    public void setMedia(float media) {
        this.media = media;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public void calcularMedia(float n1, float n2){
        this.media = (nota1+nota2)/2;
        if(media<7){
            this.situacao = "reprovado";
        }
        else{
            
            this.situacao ="aprovado";
        }
            
    }
}
