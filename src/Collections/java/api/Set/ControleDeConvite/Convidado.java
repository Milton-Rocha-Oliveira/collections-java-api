package Collections.java.api.Set.ControleDeConvite;

import java.util.Objects;

public class Convidado {
    //atributo
    private String nome;
    private int codigoConvite;
    //Construtor da classe objeto
    public Convidado(String nome, int convite) {
        this.nome = nome;
        this.codigoConvite = convite;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }
    //compara as entradas da lista, se baseando nos codigos dos convites
    //e exclui entradas com o mesmo codigo, deixando somente a primeira entrada
    //do codigo de convite
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Convidado convidado = (Convidado) o;
        return getCodigoConvite() == convidado.getCodigoConvite();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getCodigoConvite());
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "nome='" + nome + '\'' +
                ", convite=" + codigoConvite +
                '}';
    }
}
