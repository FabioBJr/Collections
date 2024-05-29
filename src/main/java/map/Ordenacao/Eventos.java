package main.java.map;

public class Eventos {

    private String evento;
    private String atracao;

    public Eventos(String evento, String atracao) {
        this.evento = evento;
        this.atracao = atracao;
    }

    public String getEvento() {
        return evento;
    }

    public String getAtracao() {
        return atracao;
    }

    @Override
    public String toString() {
        return "Eventos{" +
                "evento='" + evento + '\'' +
                ", atracao='" + atracao + '\'' +
                '}';
    }
}
