package model;

public class Candidato {

    public String name;
    private String setor;
    private String caminho;
    private int number;
    private int voto;

    public Candidato(String name, String setor, String caminho, int number) {
    }

    public Candidato() {
    }

    ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getVoto() {
        return voto;
    }

    public void setVoto(int voto) {
        this.voto = voto;
    }

    
    public String getCaminho() {
        return caminho;
    }

    public void setCaminho(String caminho) {
        this.caminho = caminho;
    }
    public String toString() {

        return number + " " + name + " " + setor;
    }

}
