package vetores;

import model.Aluno;

public class Vetor {
    // Declarando e Inicializando um array de Aluno com capacidade 100.
    private Object[] objects = new Object[100000];
    private int totalDeObjects = 0;
    private int totalDeAlunos = 0;
    private Aluno[] alunos = new Aluno[100000];
    public void adiciona(Aluno aluno) {
      /*  for (int i = 0; i < this.alunos.length; i++) {
            if (this.alunos[i] == null) {
                this.alunos[i] = aluno;
                break;
            }
        }*/
        this.garanteEspaco();
        this.alunos[this.totalDeAlunos] = aluno;
        this.totalDeAlunos++;
    }
    public void adiciona(int posicao, Aluno aluno) {
        this.garanteEspaco();
        if(!this.posicaoValida(posicao)){
            throw new IllegalArgumentException("Posição Inválida");
        }
        for(int i = this.totalDeAlunos -1; i >= posicao; i--){
            this.alunos[i+1] = this.alunos[i];
        }
        this.alunos[posicao] = aluno;
        this.totalDeAlunos++;

    }
    public Object pega(int posicao) {
        if(!this.posicaoOcupada(posicao)){
            throw new IllegalArgumentException("Posicao Inválida");
        }
        return this.objects[posicao];
    }
    public void remove(int posicao) {
        if(!this.posicaoOcupada(posicao)){
            throw new IllegalArgumentException("posicâo");
        }
        for (int i = posicao; i<this.totalDeAlunos -1; i++){
            this.alunos[i]= this.alunos[i+1];
        }

        this.totalDeObjects--;
    }
    public boolean contem(Object objcet) {
        for (int i = 0; i < this.totalDeObjects; i++){
            if (objcet.equals(this.objects[i])) {
                return true;
            }
        }
// implementação
        return false;
    }
    public int tamanho() {

        return this.totalDeAlunos;
    }
    public String toString() {
        if(this.totalDeAlunos == 0){
            return "[]";
        }
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i = 0; i < this.totalDeAlunos - 1; i++){
            builder.append(this.alunos[i]);
            builder.append(", ");
        }
        builder.append(this.alunos[this.totalDeAlunos -1]);
        builder.append("]");

        return builder.toString();
    }
    private boolean posicaoOcupada(int posicao){
        return posicao >= 0 && posicao <  this.totalDeAlunos;
    }
    private boolean posicaoValida(int posicao ){
        return  posicao >= 0 && posicao <= this.totalDeAlunos;
    }
    private void garanteEspaco(){
        if(this.totalDeAlunos == this.alunos.length){
            Aluno[] novoArray = new Aluno[this.alunos.length * 2];
            for(int i = 0; i < this.alunos.length; i++){
                novoArray[i] =  this.alunos[i];
            }

            this.alunos = novoArray;
        }
    }
    public void lastIndexOf(Object objeto) {
// implementação
    }
    public void indexOf(Object objeto) {
// implementação
    }
    public void clear() {
// implementação
    }
    public void remove(Object objeto) {
// implementação
    }
}
