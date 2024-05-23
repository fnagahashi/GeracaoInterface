public class GrupoRadio  extends Componente{
    private String Opcao;
    public GrupoRadio(String Descricao, String Opcao){
        super(Descricao);
        this.Opcao = Opcao;
    }
    @Override
    public void desenhar(){
        System.out.println("()"+ getDescricao() + "()" + Opcao );;
    }

}
