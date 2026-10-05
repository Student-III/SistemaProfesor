# Sistema de Gestión de Profesores

Proyecto académico en Java que implementa una lista simplemente enlazada
genérica desde cero, aplicada a la gestión de profesores con filtrado por
edad y ordenamiento descendente.

El objetivo es comprender el funcionamiento interno de las estructuras
dinámicas, la programación genérica, el uso de interfaces y el manejo de
excepciones.

---

## Tabla de Contenidos

- Descripción General
- Características
- Estructura del Proyecto
- Tecnologías Utilizadas
- Instalación y Ejecución
- Descripción de Clases
- Manejo de Excepciones
- Casos de Uso
- Casos de Prueba
- Salida del Programa
- Bugs Conocidos
- Mejoras Futuras
- Autor

---

## Descripción General

Este repositorio contiene un sistema de gestión de profesores desarrollado
como proyecto académico. Se compone de dos partes:

1. Estructura de datos personalizada: Una implementación propia de una lista
   simplemente enlazada genérica (LinkedList<T>) que implementa la interfaz
   IList<T>, con operaciones de inserción, eliminación, búsqueda y recorrido.

2. Aplicación del sistema: Uso de LinkedList<Profesor> para gestionar
   profesores, filtrarlos por edad y ordenarlos de mayor a menor.

Cada entidad del dominio (Profesor) incluye validaciones que garantizan la
integridad de los datos.

---

## Características

- Lista enlazada genérica implementada desde cero (LinkedList<T>).
- Interfaz genérica IList<T> que define el contrato de la lista.
- Nodo genérico Node<T> con referencia al siguiente elemento.
- Operaciones completas: add, add(index), remove, get, CantProfesores,
  clear, isEmpty.
- Entidad Profesor con encapsulamiento.
- Método Proxcambio para filtrar profesores por edad.
- Método MostrarLista para ordenar de mayor a menor con Bubble Sort.
- Manejo de excepciones mediante UnsupportedOperationException.
- Código organizado en el paquete com.mycompany.sistemaprofesor.

---

## Estructura del Proyecto

SistemaProfesor/
|
+-- src/
|   +-- main/
|       +-- java/
|           +-- com/
|               +-- mycompany/
|                   +-- sistemaprofesor/
|                       +-- Profesor.java         Entidad Profesor
|                       +-- Node.java             Nodo genérico
|                       +-- IList.java            Interfaz genérica
|                       +-- LinkedList.java       Implementación propia
|                       +-- SistemaProfesor.java  Clase principal (main)
|
+-- README.txt

---

## Tecnologías Utilizadas

| Tecnología | Versión | Uso                          |
|------------|---------|------------------------------|
| Java       | 21+     | Lenguaje principal           |
| NetBeans   | 29+     | IDE de desarrollo (opcional) |
| Git        | 5.0+    | Control de versiones         |

---

## Instalación y Ejecución

### Requisitos previos

- JDK 17 o superior instalado.
- NetBeans, IntelliJ IDEA o Eclipse (opcional).
- Git para clonar el repositorio.

### Pasos

1. Clonar el repositorio:

   git clone https://github.com/Student-III/SistemaProfesor.git
   cd SistemaProfesor

2. Compilar el proyecto:

   javac -d out src/main/java/com/mycompany/sistemaprofesor/*.java

3. Ejecutar la clase principal:

   java -cp out com.mycompany.sistemaprofesor.SistemaProfesor

---

## Descripción de Clases

### Profesor

Representa a un profesor del sistema.

Atributos:

| Campo            | Tipo   | Descripción           |
|------------------|--------|-----------------------|
| nombre           | String | Nombre del profesor   |
| edad             | int    | Edad del profesor     |
| categoriadocente | String | Categoría docente     |

Ejemplo de uso:

   Profesor p1 = new Profesor("Leo", 22, "Instructor");

---

### Node<T>

Nodo genérico que almacena la información y una referencia al siguiente nodo.

Atributos:

| Campo | Tipo    | Descripción                  |
|-------|---------|------------------------------|
| info  | T       | Información almacenada       |
| next  | Node<T> | Referencia al siguiente nodo |

Constructores:

   public Node(T info);
   public Node(T info, Node<T> next);

Métodos:

   getInfo() / setInfo(T info)
   getNext() / setNext(Node<T> next)

---

### IList<T>

Interfaz genérica que define el contrato de la lista.

   public interface IList<T> {
       void add(T t);
       void add(T t, int index);
       T remove(int index);
       T get(int index);
       int CantProfesores();
       void clear();
       boolean isEmpty();
   }

---

### LinkedList<T>

Implementación propia de una lista simplemente enlazada que implementa
IList<T>.

Atributos:

| Campo | Tipo    | Descripción                       |
|-------|---------|-----------------------------------|
| first | Node<T> | Referencia al primer nodo         |
| size  | int     | Cantidad de elementos en la lista |

Métodos principales:

| Método                     | Descripción                                          |
|----------------------------|------------------------------------------------------|
| add(T t)                   | Agrega un elemento al final de la lista              |
| add(T t, int index)        | Agrega un elemento en la posición indicada           |
| remove(int index)          | Elimina y retorna el elemento en la posición dada    |
| get(int index)             | Retorna el elemento en la posición indicada          |
| CantProfesores()           | Retorna la cantidad de elementos                     |
| clear()                    | Vacía la lista                                       |
| isEmpty()                  | Indica si la lista está vacía                        |
| Proxcambio(LinkedList)     | Imprime los profesores con edad mayor a 26           |
| MostrarLista(LinkedList)   | Ordena de mayor a menor edad e imprime cada profesor |

Nota: remove(int index) presenta limitaciones conocidas (ver Bugs Conocidos).

---

### SistemaProfesor

Clase principal con el método main. Crea instancias de profesores, las
agrega a la lista y ejecuta los métodos Proxcambio y MostrarLista.

---

## Manejo de Excepciones

| Excepción                       | Cuándo se lanza                                  |
|---------------------------------|--------------------------------------------------|
| UnsupportedOperationException   | Al acceder a un índice fuera de rango en LinkedList |

Ejemplo de captura:

   try {
       lista.get(-1);
   } catch (UnsupportedOperationException ex) {
       System.out.println("Error: " + ex.getMessage());
   }

---

## Casos de Uso

1. Registrar profesores en una lista enlazada propia.
2. Filtrar profesores mayores de 26 años con Proxcambio.
3. Ordenar profesores de mayor a menor edad con MostrarLista.
4. Validar accesos fuera de rango mediante excepciones.
5. Comparar el comportamiento de una lista enlazada propia frente a ArrayList.

---

## Casos de Prueba

La clase SistemaProfesor incluye escenarios para validar los métodos
principales:

Casos positivos (activos por defecto):

   LinkedList<Profesor> lista = new LinkedList<>();
   lista.add(new Profesor("Leo", 22, "Instructor"));
   lista.add(new Profesor("Pepe", 98, "Instructor"));
   lista.add(new Profesor("Jose", 99, "Instructor"));

   lista.Proxcambio(lista);
   lista.MostrarLista(lista);

Casos límite recomendados:

| Caso                  | Qué valida                       |
|-----------------------|----------------------------------|
| Lista vacía           | No lanza excepciones             |
| Un solo profesor      | Casos límite en bucles           |
| Ninguno mayor de 26   | Proxcambio no imprime nada       |
| Todos mayores de 26   | Proxcambio imprime todos         |
| Lista ya ordenada     | MostrarLista no altera el orden  |
| Edades repetidas      | Estabilidad del ordenamiento     |
| Orden inverso         | Peor caso de Bubble Sort         |

Excepciones en LinkedList:

| Caso               | Excepción esperada              |
|--------------------|---------------------------------|
| get(-1)            | UnsupportedOperationException   |
| get(size)          | UnsupportedOperationException   |
| add(t, -1)         | UnsupportedOperationException   |
| add(t, size + 1)   | UnsupportedOperationException   |
| remove(-1)         | UnsupportedOperationException   |
| remove(size)       | UnsupportedOperationException   |

---

## Autor

Leosbel Novales Sierra
Estudiante de Ingeniería Informática
Correo: leosung25@gmail.com
GitHub: https://github.com/Student-III

---

## Contribuciones

Las contribuciones son bienvenidas. Si deseas mejorar este proyecto:

1. Haz un fork del repositorio.
2. Crea una rama: git checkout -b feature/nueva-funcionalidad
3. Realiza tus cambios y haz commit: git commit -m "Añade nueva funcionalidad"
4. Sube los cambios: git push origin feature/nueva-funcionalidad
5. Abre un Pull Request.

---

Nota: Este proyecto es de carácter académico y tiene como finalidad reforzar
los conceptos de estructuras de datos, programación genérica y manejo de
excepciones en Java.
