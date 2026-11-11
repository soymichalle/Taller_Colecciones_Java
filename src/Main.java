public class Main {

    public static void main(String[] args) {

        System.out.print("===== BIENVENIDO AL SISTEMA DE BIBLIOTECA =====\n");
        SistemaBiblioteca biblioteca = new SistemaBiblioteca();

        System.out.println("\n===== REGISTRO DE MATERIALES =====");

        Libro libro1 = new Libro(
                "BK-001", "Bodas de Sandre", 1850, true,
                "Anonimo", "978-0132350884"
        );

        Libro libro2 = new Libro(
                "BK-002", "Java para principiantes", 2020, false,
                "Autor X", "978-1234567890"
        );

        Revista revista1 = new Revista(
                "RV-001", "Ciencia Hoy", 2024, true,
                "15", "Ciencia"
        );

        Revista revista2 = new Revista(
                "RV-002", "La de Miranda Priesly", 2025, true,
                "20", "Moda y tendencias"
        );

        biblioteca.registrarMaterial(libro1);
        biblioteca.registrarMaterial(libro2);
        biblioteca.registrarMaterial(revista1);
        biblioteca.registrarMaterial(revista2);

        System.out.println("Materiales registrados correctamente.");

        System.out.println("\n===== BÚSQUEDA DE MATERIALES =====");

        Material encontrado = biblioteca.buscarMaterial("BK-001");

        if (encontrado != null) {
            encontrado.mostrarInfo();
        } else {
            System.out.println("Material no encontrado.");
        }

        Material inexistente = biblioteca.buscarMaterial("BK-999");

        if (inexistente != null) {
            inexistente.mostrarInfo();
        } else {
            System.out.println("El material BK-999 no existe.");
        }

        System.out.println("\n===== LISTA DE ESPERA =====");

        biblioteca.agregarEspera("BK-002", "Ana");
        biblioteca.agregarEspera("BK-002", "Pedro");
        biblioteca.agregarEspera("BK-002", "Laura");

        System.out.println("Usuarios agregados a la lista de espera.");

        System.out.println("Siguiente usuario: "
                + biblioteca.siguienteEnEspera("BK-002"));

        System.out.println("Siguiente usuario: "
                + biblioteca.siguienteEnEspera("BK-002"));

        System.out.println("\n===== REGISTRO DE MEMBRESÍAS =====");

        System.out.println("Registrar Ana: "
                + biblioteca.registrarMiembro("Ana"));

        System.out.println("Registrar Pedro: "
                + biblioteca.registrarMiembro("Pedro"));

        System.out.println("Registrar Laura: "
                + biblioteca.registrarMiembro("Laura"));

        System.out.println("Registrar Ana nuevamente: "
                + biblioteca.registrarMiembro("Ana"));

        // Consultar membresías
        System.out.println("¿Ana tiene membresía?: "
                + biblioteca.tieneMembresía("Ana"));

        System.out.println("¿Carlos tiene membresía?: "
                + biblioteca.tieneMembresía("Carlos"));

        System.out.println("\n===== CATÁLOGO COMPLETO =====");

        biblioteca.mostrarCatalogo();

        System.out.println("\n===== FIN =====");

    }
}