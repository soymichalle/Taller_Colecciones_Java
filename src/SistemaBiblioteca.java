import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class SistemaBiblioteca {

    private Map<String, Material> catalogo = new HashMap<>();
    private Map<String, List<String>> listaEspera = new HashMap<>();
    private Set<String> miembros = new HashSet<>();

    public void registrarMaterial(Material m) {

        catalogo.put(m.getCodigo(), m);
    }

    public Material buscarMaterial(String codigo) {

        return catalogo.get(codigo);
    }

    public void mostrarCatalogo() {

        for (Map.Entry<String, Material> entrada : catalogo.entrySet()) {
            System.out.print(entrada.getKey());
            entrada.getValue().mostrarInfo();
        }
    }

    public void agregarEspera(String codigoMaterial, String usuario) {

        if (!listaEspera.containsKey(codigoMaterial)) {

            List<String> lista = new ArrayList<>();

            lista.add(usuario);

            listaEspera.put(codigoMaterial,lista);

        } else {

            List<String> lista = listaEspera.get(codigoMaterial);
            lista.add(usuario);
        }
    }

    public String siguienteEnEspera(String codigoMaterial) {

        List<String> lista = listaEspera.get(codigoMaterial);

        if (lista == null || lista.isEmpty()) {
            return null;
        }

        String primerUsuario =  lista.remove(0);

        return primerUsuario;

    }

    public boolean registrarMiembro(String usuario) {

        return miembros.add(usuario);
    }

    public boolean tieneMembresía(String usuario) {

        return miembros.contains(usuario);
    }
}