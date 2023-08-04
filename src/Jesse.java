public class Jesse {

    //Molde pra criar o Jesse

    //private serve para dificultarmos o acesso direto das nossas variaveis
    private String nome;
    private int idade;
    private String carisma;
    private String burrice;
    private String talentoEmFazerCristal;

    //a função get serve para pegarmos o nosso valor e retornar o mesmo
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    //a função set serve para alterarmos o nosso dado
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCarisma() {
        return carisma;
    }

    public void setCarisma(String carisma) {
        this.carisma = carisma;
    }

    public String getBurrice() {
        return burrice;
    }

    public void setBurrice(String burrice) {
        this.burrice = burrice;
    }

    public String getTalentoEmFazerCristal() {
        return talentoEmFazerCristal;
    }

    public void setTalentoEmFazerCristal(String talentoEmFazerCristal) {
        this.talentoEmFazerCristal = talentoEmFazerCristal;
    }
}

