public class Macaco {
    String nome;
    String bucho;

    public void comer(String alimento){
        bucho = alimento;
    }

    public String verBucho(){
        return bucho;
    }

    public String digerir(){
        bucho = "Vazio";
        return bucho;
    }

    public void nome(String novoNome){
        nome = novoNome;
    }

    public String mostrarNome(){
        return nome;
    }
}
