import java.util.Map;
import java.util.HashMap;

public class SistemaBiblioteca {

    private Map<String, Material> catalogo = new HashMap<>();

    public void registrarMaterial(Material m) {

    }

    public void buscarMaterial(String codigo) {

    }

    public void mostrarCatalogo() {

        for (Map.Entry<String, Material> entrada : catalogo.entrySet()) {
            System.out.println("Clave: " + entrada.getKey() + ", Valor: " + entrada.getValue());
        }
    }
}
