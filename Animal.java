package br.com.devsgeeknerd.zoologico.classes;

public classe Animal {
    private String nome;
    private String especie;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void emitirBarulho() {
        System.out.println("Barulho do animal");
    }

    public boolean ehAdulto() {
        return idade >= 1;
    }
}
