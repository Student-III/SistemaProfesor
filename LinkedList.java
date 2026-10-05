package com.mycompany.sistemaprofesor;

public class LinkedList<t> implements IList<t> {

    private Node<t> first;
    private int size;

    public LinkedList() {
        this.size = 0;
    }

    @Override
    public void add(t t) {
        Node<t> node = new Node<t>(t);
        if (isEmpty()) {
            first = node;
        } else {
            Node<t> cursor = first;
            while (cursor.getNext() != null) {
                cursor = cursor.getNext();
            }
            cursor.setNext(node);
        }
        size++;
    }

    @Override
    public void add(t t, int index) {
        if (index >= 0 && index <= size) {
            if (index == 0) {
                first = new Node<t>(t, first);
            } else {
                Node<t> cursor = first;
                for (int i = 0; i < index - 1; i++) {
                    cursor = cursor.getNext();
                }
                Node<t> node = new Node<t>(t);
                node.setNext(cursor.getNext());
                cursor.setNext(node);
            }
            size++;

        } else {
            throw new UnsupportedOperationException("Fuera de rango");
        }
    }

    @Override
    public t remove(int index) {
        if (index > 0 && index < size) {
            Node<t> aux;
            if (index == 0) {
                aux = first;
                first = first.getNext();
            } else {
                Node<t> cursor = first;
                for (int i = 0; i < index - 1; i++) {
                    cursor = cursor.getNext();
                }
                aux = cursor.getNext();
                cursor.setNext(aux.getNext());
            }
            size--;
            return aux.getInfo();
        } else {
            throw new UnsupportedOperationException("Numero fuera de rango ");
        }

    }

    @Override
    public t get(int index) {
        if (index >= 0 && index < size) {
            Node<t> cursor = first;
            for (int i = 0; i < index; i++) {
                cursor = cursor.getNext();
            }
            return cursor.getInfo();
        } else {
            throw new UnsupportedOperationException("Fuera de rango");
        }

    }

    @Override
    public int CantProfesores() {
        return size;
    }

    @Override
    public void clear() {
        first = null;
        size=0;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    public void Proxcambio(LinkedList<Profesor> prof) {
        Node<Profesor> cursor = prof.first;
        while (cursor != null) {
            if (cursor.info.getEdad() > 26) {
                System.out.println(cursor.info.getNombre());
            }

            cursor = cursor.next;
        }

    }

    public void MostrarLista(LinkedList<Profesor> prof) {
        //tuve que hacerlo con do while ya que con el while no me salio   
        boolean var;
        do {
            var = false;
            Node<Profesor> cursor = prof.first;

            while (cursor != null && cursor.next != null) {
                //lo que hago es cambiar solamente la informacion de los nodos ya que cambiar los nodos como tal es un lio
                if (cursor.info.getEdad() < cursor.next.info.getEdad()) {
                    Profesor temp = cursor.info;
                    cursor.info = cursor.next.info;
                    cursor.next.info = temp;

                    var= true;
                }
                cursor = cursor.next;
            }
        } while (var);
        Node<Profesor> cursor = prof.first;
        while (cursor != null) {
            System.out.println(cursor.info.getNombre() + " - " + cursor.info.getEdad());
            cursor = cursor.next;
        }
    }
}
