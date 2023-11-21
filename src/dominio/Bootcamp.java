package src.dominio;

import java.time.LocalDate;

public class Bootcamp {
    private String nome;
    private String Descricao;
    private final LocalDate dataInicio = LocalDate.now();
    private final LocalDate dataFim = dataInicio.plusDays(90);

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bootcamp bootcamp)) return false;

        if (!getNome().equals(bootcamp.getNome())) return false;
        if (!getDescricao().equals(bootcamp.getDescricao())) return false;
        if (!getDataInicio().equals(bootcamp.getDataInicio())) return false;
        return getDataFim().equals(bootcamp.getDataFim());
    }

    @Override
    public int hashCode() {
        int result = getNome().hashCode();
        result = 31 * result + getDescricao().hashCode();
        result = 31 * result + getDataInicio().hashCode();
        result = 31 * result + getDataFim().hashCode();
        return result;
    }
}
