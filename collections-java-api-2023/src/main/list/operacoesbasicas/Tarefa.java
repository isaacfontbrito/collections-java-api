package main.list.operacoesbasicas;

public class Tarefa {
    //atributo
    private String descricao;

    public Tarefa (String descricao){
      this.descricao = descricao;  
    }

    public String getDescricao(){
        return descricao;
    }

    @Override
    public String toString() {
      return "Tarefa{" + "decrição='" + descricao + '\'' + '}';
    }
}
