public class CaixaVerificacao extends Componente {
    public CaixaVerificacao(String Descricao){
        super(Descricao);
    }

    @Override
    public void desenhar(){
        System.out.println("[ ] " + getDescricao());
    }

}
