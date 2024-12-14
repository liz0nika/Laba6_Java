Інтерфейс, який реалізує колекція - List.
Внутрішня структура колекції - двозв'язний список.

TypedCollection — це реалізація загального списку на основі двозв'язаного списку, яка підтримує основні операції списку. Ця колекція дозволяє додавати, видаляти, отримувати елементи, а також виконувати інші стандартні операції колекцій.

Конструктори:
    пустий список
    ініціалізація одним елементом
    ініціалізація з існуючої колекції

Основні операції: 
    додавання
    видалення
    отримання елементів за індексом
    перевірка наявності елемента
    очищення списку тощо.

Основні методи
    size(): Повертає кількість елементів у колекції
    isEmpty(): Перевіряє, чи пуста колекція
    contains(Object o): Перевіряє, чи містить колекція певний елемент
    add(T t): Додає елемент у кінець колекції
    remove(Object o): Видаляє перше входження елемента з колекції
    toArray(): Повертає масив, що містить усі елементи колекції
    clear(): Очищає колекцію
    get(int index): Повертає елемент за індексом
    set(int index, T element): Замінює елемент за індексом
    indexOf(Object o): Повертає індекс першого входження елемента
    lastIndexOf(Object o): Повертає індекс останнього входження елемента

Обмеження: 
    методи add(int index, T element), addAll(int index, Collection<? extends T> c), listIterator(), listIterator(int index) та subList(int fromIndex, int toIndex) не підтримуються
    не підтримується модифікація під час ітерації через Iterator

Приклад використання

<img width="845" alt="Знімок екрана 2024-12-14 о 15 24 45" src="https://github.com/user-attachments/assets/109419a7-fc14-4a55-8f87-f403200643b0" />


Результат виконання коду

<img width="470" alt="Знімок екрана 2024-12-14 о 15 25 07" src="https://github.com/user-attachments/assets/80f1eaa6-29db-40f7-88f4-7ad35e25f63c" />



