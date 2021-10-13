package com.company;

import java.util.ArrayList;

public class MyListIterator<T> {
    ArrayList<T> arrayList;
    Integer index = 0;
    T element;

    public MyListIterator(ArrayList<T> arrayList) {
        this.arrayList = arrayList;
    }

    public boolean hasNext() {
        return arrayList.size() > index;
    }

    public T next() {
        T buffer = arrayList.get(index++);
        return buffer;
    }

    public boolean hasPrevious() {
        if (arrayList.size() > 0) {
            return index >= 1;
        } else {
            return false;
        }
    }

    public T previous() {
        T buffer = arrayList.get(--index);
        return buffer;
    }

    public int nextIndex() {
        if (index < arrayList.size() - 1) {
            return index;
        } else {
            return arrayList.size();
        }
    }

    public int previousIndex() {
        if (index < arrayList.size() - 1 || index != 0) {
            return index - 1;
        } else {
            return -1;
        }
    }

    public void remove() {
        arrayList.remove((int) index);
    }

    public void set(T element) {
        arrayList.set(index - 1, element);
    }

    public void add(T element) {
        arrayList.add(index, element);
    }

}
