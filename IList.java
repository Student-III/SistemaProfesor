
package com.mycompany.sistemaprofesor;


public interface IList<t> {
    void add(t t);
    void add(t t, int index);
    t remove(int index);
    t get(int index);
    int CantProfesores();
    void clear();
    boolean isEmpty();
}
