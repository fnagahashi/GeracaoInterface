import java.util.ArrayList;
import java.util.Objects;

public class SimuladorInterface {
    private ArrayList<Componente> Componentes = new ArrayList<>();
    public void add(Componente componente){
        Componentes.add(Objects.requireNonNull(componente));
    }
    public void desenhar(){
        for (Componente componente : Componentes){
            componente.desenhar();
        }
    }

    public ArrayList<Componente> getComponentes() {
        return Componentes;
    }

}
