public class Revista extends Material{

    private Long numeroEdicion;
    private String tematica;

    public Revista(String codigo, String titulo, int anio, boolean disponible, Long numeroEdicion, String tematica) {
        super(codigo, titulo, anio, disponible);
        this.numeroEdicion = numeroEdicion;
        this.tematica = tematica;
    }

    @Override
    public String getTipo() {
        return "Revista";
    }
}