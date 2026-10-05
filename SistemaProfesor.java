
package com.mycompany.sistemaprofesor;

public class SistemaProfesor {

    public static void main(String[] args) {
        // ============================================================
        // CASO 1: Lista con 3 profesores (caso normal)
        // ============================================================
        System.out.println("=== CASO 1: Lista con 3 profesores ===");
        LinkedList<Profesor> lista1 = new LinkedList<>();
        lista1.add(new Profesor("Leo", 22, "Instructor"));
        lista1.add(new Profesor("Pepe", 98, "Instructor"));
        lista1.add(new Profesor("Jose", 99, "Instructor"));

        System.out.println("Cantidad de profesores: " + lista1.CantProfesores());
        System.out.println("-- Proxcambio (mayores de 26) --");
        lista1.Proxcambio(lista1);
        System.out.println("-- MostrarLista (mayor a menor) --");
        lista1.MostrarLista(lista1);
        System.out.println();

        // ============================================================
        // CASO 2: Lista vacía
        // ============================================================
        System.out.println("=== CASO 2: Lista vacía ===");
        LinkedList<Profesor> lista2 = new LinkedList<>();

        System.out.println("Cantidad de profesores: " + lista2.CantProfesores());
        System.out.println("-- Proxcambio --");
        lista2.Proxcambio(lista2);   // No debe imprimir nada ni fallar
        System.out.println("-- MostrarLista --");
        lista2.MostrarLista(lista2); // No debe imprimir nada ni fallar
        System.out.println();

        // ============================================================
        // CASO 3: Un solo profesor
        // ============================================================
        System.out.println("=== CASO 3: Un solo profesor ===");
        LinkedList<Profesor> lista3 = new LinkedList<>();
        lista3.add(new Profesor("Ana", 30, "Titular"));

        System.out.println("Cantidad de profesores: " + lista3.CantProfesores());
        System.out.println("-- Proxcambio --");
        lista3.Proxcambio(lista3);
        System.out.println("-- MostrarLista --");
        lista3.MostrarLista(lista3);
        System.out.println();

        // ============================================================
        // CASO 4: Ninguno mayor de 26 (Proxcambio no imprime nada)
        // ============================================================
        System.out.println("=== CASO 4: Ninguno mayor de 26 ===");
        LinkedList<Profesor> lista4 = new LinkedList<>();
        lista4.add(new Profesor("Luis", 20, "Instructor"));
        lista4.add(new Profesor("Marta", 25, "Asistente"));
        lista4.add(new Profesor("Pedro", 26, "Instructor")); // 26 NO es > 26

        System.out.println("Cantidad de profesores: " + lista4.CantProfesores());
        System.out.println("-- Proxcambio (no debería imprimir nada) --");
        lista4.Proxcambio(lista4);
        System.out.println("-- MostrarLista --");
        lista4.MostrarLista(lista4);
        System.out.println();

        // ============================================================
        // CASO 5: Todos mayores de 26
        // ============================================================
        System.out.println("=== CASO 5: Todos mayores de 26 ===");
        LinkedList<Profesor> lista5 = new LinkedList<>();
        lista5.add(new Profesor("Carlos", 40, "Titular"));
        lista5.add(new Profesor("Sofia", 35, "Asociado"));
        lista5.add(new Profesor("Diego", 50, "Titular"));

        System.out.println("Cantidad de profesores: " + lista5.CantProfesores());
        System.out.println("-- Proxcambio (debería imprimir los 3) --");
        lista5.Proxcambio(lista5);
        System.out.println("-- MostrarLista --");
        lista5.MostrarLista(lista5);
        System.out.println();

        // ============================================================
        // CASO 6: Lista ya ordenada de mayor a menor
        // ============================================================
        System.out.println("=== CASO 6: Ya ordenada de mayor a menor ===");
        LinkedList<Profesor> lista6 = new LinkedList<>();
        lista6.add(new Profesor("A", 60, "Titular"));
        lista6.add(new Profesor("B", 50, "Titular"));
        lista6.add(new Profesor("C", 40, "Titular"));

        System.out.println("Cantidad de profesores: " + lista6.CantProfesores());
        System.out.println("-- MostrarLista (debe quedar igual) --");
        lista6.MostrarLista(lista6);
        System.out.println();

        // ============================================================
        // CASO 7: Edades repetidas
        // ============================================================
        System.out.println("=== CASO 7: Edades repetidas ===");
        LinkedList<Profesor> lista7 = new LinkedList<>();
        lista7.add(new Profesor("X", 30, "Instructor"));
        lista7.add(new Profesor("Y", 30, "Instructor"));
        lista7.add(new Profesor("Z", 30, "Instructor"));

        System.out.println("Cantidad de profesores: " + lista7.CantProfesores());
        System.out.println("-- Proxcambio (imprime los 3) --");
        lista7.Proxcambio(lista7);
        System.out.println("-- MostrarLista (orden indistinto) --");
        lista7.MostrarLista(lista7);
        System.out.println();

        // ============================================================
        // CASO 8: Orden inverso (peor caso para Bubble Sort)
        // ============================================================
        System.out.println("=== CASO 8: Orden inverso (peor caso) ===");
        LinkedList<Profesor> lista8 = new LinkedList<>();
        lista8.add(new Profesor("Menor", 20, "Instructor"));
        lista8.add(new Profesor("Medio", 40, "Asociado"));
        lista8.add(new Profesor("Mayor", 60, "Titular"));

        System.out.println("Cantidad de profesores: " + lista8.CantProfesores());
        System.out.println("-- MostrarLista (debe quedar 60, 40, 20) --");
        lista8.MostrarLista(lista8);
        System.out.println();

        // ============================================================
        // CASO 9: Muchos elementos
        // ============================================================
        System.out.println("=== CASO 9: Muchos elementos ===");
        LinkedList<Profesor> lista9 = new LinkedList<>();
        lista9.add(new Profesor("P1", 25, "Instructor"));
        lista9.add(new Profesor("P2", 55, "Titular"));
        lista9.add(new Profesor("P3", 33, "Asociado"));
        lista9.add(new Profesor("P4", 47, "Titular"));
        lista9.add(new Profesor("P5", 29, "Asistente"));
        lista9.add(new Profesor("P6", 61, "Titular"));
        lista9.add(new Profesor("P7", 38, "Asociado"));

        System.out.println("Cantidad de profesores: " + lista9.CantProfesores());
        System.out.println("-- Proxcambio (mayores de 26) --");
        lista9.Proxcambio(lista9);
        System.out.println("-- MostrarLista (61,55,47,38,33,29,25) --");
        lista9.MostrarLista(lista9);
        System.out.println();
    }
}

