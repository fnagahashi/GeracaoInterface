import java.util.Objects;
public class Componente {
    private String Descricao;

    public String getDescricao() {
        return Descricao;
    }
    public Componente(String Descricao){
        this.Descricao = Objects.requireNonNull(Descricao);
        if(Descricao.isBlank()){
            throw new IllegalArgumentException("A descrição do componente é obrigatoria");
        }
    }
    public void desenhar(){
        System.out.println(getDescricao());
    }
}
