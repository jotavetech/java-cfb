// interface é um contrato que obriga a implementação dos métodos
// que estão dentro dela

public interface SerVivo {
    public void mover();
    public void comer(int massa);
    public void info();
    // variáveis dentro de interfaces são constantes
    public Boolean vivo = true;
}
