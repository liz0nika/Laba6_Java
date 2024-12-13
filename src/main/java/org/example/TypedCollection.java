package org.example;

import java.util.*;

// реалізація загального списку, підтримується двозв’язаним списком.
public class TypedCollection<T> implements List<T> {

    // вузол, що представляє елемент у двозв’язаному списку
    // кожен вузол містить значення, посилання на наступний вузол і посилання на попередній вузол.
    private static class Node<T> {
        T value; // значення, що зберігається в цьому вузлі.
        Node<T> next; // посилання на наступний вузол.
        Node<T> prev; // посилання на попередній вузол.

        Node(T value) {
            this.value = value;
        }
    }

    private Node<T> head; // перший вузол списку.
    private Node<T> tail; // останній вузол списку.
    private int size; // кількість елементів у колекції.

    // конструктор для створення пустого TypedCollection
    public TypedCollection() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // конструктор, який приймає один елемент для ініціалізації колекції
    public TypedCollection(T element) {
        this();
        add(element);
    }

    // конструктор, який приймає стандартну колекцію для ініціалізації колекції
    public TypedCollection(Collection<? extends T> collection) {
        this();
        this.addAll(collection);
    }

    // повертає кількість елементів в колекції
    @Override
    public int size() {
        return size;
    }

    // перевірка чи пуста колекція, true - якщо немає елементів
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    // перевірка чи містить колекція певний елемент.
    @Override
    public boolean contains(Object o) {
        return indexOf(o) != -1;
    }

    // повертає ітератор для обходу елементів колекції
    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {
            private Node<T> current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                if (current == null) {
                    throw new NoSuchElementException();
                }
                T value = current.value;
                current = current.next;
                return value;
            }
        };
    }

    // повертає масив, що містить усі елементи колекції
    @Override
    public Object[] toArray() {
        Object[] array = new Object[size];
        int index = 0;
        for (Node<T> current = head; current != null; current = current.next) {
            array[index++] = current.value;
        }
        return array;
    }

    // заповнює  масив елементами колекції
    @Override
    public <U> U[] toArray(U[] a) {
        if (a.length < size) {
            a = Arrays.copyOf(a, size);
        }
        int index = 0;
        Object[] result = a;
        for (Node<T> current = head; current != null; current = current.next) {
            result[index++] = current.value;
        }
        if (a.length > size) {
            a[size] = null;
        }
        return a;
    }

    // додає елемент у кінець колекції
    @Override
    public boolean add(T t) {
        Node<T> newNode = new Node<>(t);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
        return true;
    }

    @Override
    public void add(int index, T element) {
        throw new UnsupportedOperationException("add at index not supported");
    }

    // видаляє перше входження елемента з колекції
    @Override
    public boolean remove(Object o) {
        for (Node<T> current = head; current != null; current = current.next) {
            if (Objects.equals(current.value, o)) {
                removeNode(current);
                return true;
            }
        }
        return false;
    }

    // видаляє вузол зі списку
    private void removeNode(Node<T> node) {
        if (node.prev != null) {
            node.prev.next = node.next;
        } else {
            head = node.next;
        }
        if (node.next != null) {
            node.next.prev = node.prev;
        } else {
            tail = node.prev;
        }
        size--;
    }

    // перевірка чи колекція містить усі елементи іншої колекції
    @Override
    public boolean containsAll(Collection<?> c) {
        for (Object element : c) {
            if (!contains(element)) {
                return false;
            }
        }
        return true;
    }

    // додає всі елементи з іншої колекції
    @Override
    public boolean addAll(Collection<? extends T> c) {
        for (T element : c) {
            add(element);
        }
        return !c.isEmpty();
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        throw new UnsupportedOperationException("addAll at index not supported");
    }

    // видаляє всі елементи, що є в іншій колекції
    @Override
    public boolean removeAll(Collection<?> c) {
        boolean modified = false;
        for (Object element : c) {
            modified |= remove(element);
        }
        return modified;
    }

    // залишає тільки ті елементи, що є в іншій колекції
    @Override
    public boolean retainAll(Collection<?> c) {
        boolean modified = false;
        for (Node<T> current = head; current != null;) {
            Node<T> next = current.next;
            if (!c.contains(current.value)) {
                removeNode(current);
                modified = true;
            }
            current = next;
        }
        return modified;
    }

    // очищає колекцію
    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    // повертає елемент за індексом
    @Override
    public T get(int index) {
        return getNode(index).value;
    }

    // повертає вузол за індексом
    private Node<T> getNode(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    // заміна елемента за індексом на новий
    @Override
    public T set(int index, T element) {
        Node<T> node = getNode(index);
        T oldValue = node.value;
        node.value = element;
        return oldValue;
    }

    // видаляє елемент за індексом
    @Override
    public T remove(int index) {
        Node<T> node = getNode(index);
        T value = node.value;
        removeNode(node);
        return value;
    }

    // повертає індекс першого входження елемента
    @Override
    public int indexOf(Object o) {
        int index = 0;
        for (Node<T> current = head; current != null; current = current.next) {
            if (Objects.equals(current.value, o)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    // повертає індекс останнього входження елемента
    @Override
    public int lastIndexOf(Object o) {
        int index = size - 1;
        for (Node<T> current = tail; current != null; current = current.prev) {
            if (Objects.equals(current.value, o)) {
                return index;
            }
            index--;
        }
        return -1;
    }

    // listIterator не підтримується.
    @Override
    public ListIterator<T> listIterator() {
        throw new UnsupportedOperationException("listIterator not supported");
    }

    // listIterator з індексом не підтримується.
    @Override
    public ListIterator<T> listIterator(int index) {
        throw new UnsupportedOperationException("listIterator not supported");
    }

    // subList не підтримується.
    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException("subList not supported");
    }
}
