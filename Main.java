//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SimuladorInterface simulador = new SimuladorInterface();
        simulador.add (new Rotulo("Nome:"));
        simulador.add(new CaixaTexto("Informe o seu nome", 50));
        simulador.add(new Rotulo("CPF: "));
        simulador.add(new CaixaTexto("000.000.000-00", 14));
        simulador.add(new CaixaVerificacao("Aceito os termos e politicas de uso"));
        simulador.add(new GrupoRadio("Sim","Nao"));
        simulador.desenhar();
    }
}