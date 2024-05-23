import java.lang.reflect.Array;

public class CaixaTexto extends Componente {
    int[] Array;

    public CaixaTexto (String Descricao, int Largura){
        super(Descricao);
        this.Array = new int[Largura];
    }
    @Override
    public void desenhar(){
        System.out.println("[" + getDescricao() + "]");
    }
}
