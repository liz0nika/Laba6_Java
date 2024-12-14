Інтерфейс, який реалізує колекція - List.
Внутрішня структура колекції - двозв'язний список.

TypedCollection — це реалізація загального списку на основі двозв'язаного списку, яка підтримує основні операції списку. Ця колекція дозволяє додавати, видаляти, отримувати елементи, а також виконувати інші стандартні операції колекцій.

Конструктори:
- пустий список
- ініціалізація одним елементом
- ініціалізація з існуючої колекції

<img width="800" alt="Знімок екрана 2024-12-14 о 15 32 12" src="https://github.com/user-attachments/assets/3d292b62-db77-40ed-8cbb-6b40f62c77cd" />

Основні операції: 
- додавання
- видалення
- отримання елементів за індексом
- перевірка наявності елемента
- очищення списку тощо.

Основні методи
- size(): Повертає кількість елементів у колекції

<img width="491" alt="Знімок екрана 2024-12-14 о 15 32 29" src="https://github.com/user-attachments/assets/14932d62-dbb4-45a6-8c83-ae93bf2aa21d" />

- isEmpty(): Перевіряє, чи пуста колекція

<img width="488" alt="Знімок екрана 2024-12-14 о 15 32 45" src="https://github.com/user-attachments/assets/524ea367-7887-4471-be21-184882e09f32" />

- contains(Object o): Перевіряє, чи містить колекція певний елемент

<img width="414" alt="Знімок екрана 2024-12-14 о 15 33 02" src="https://github.com/user-attachments/assets/1ac0b564-6c8a-4859-978e-6774df7c2736" />

- add(T t): Додає елемент у кінець колекції
<img width="347" alt="Знімок екрана 2024-12-14 о 15 34 30" src="https://github.com/user-attachments/assets/346a132a-36c1-4785-bac4-fd835feb8380" />

- remove(Object o): Видаляє перше входження елемента з колекції

<img width="610" alt="Знімок екрана 2024-12-14 о 15 34 43" src="https://github.com/user-attachments/assets/324a1dc9-4223-48ea-b203-c80dc15a15c0" />

- toArray(): Повертає масив, що містить усі елементи колекції
- clear(): Очищає колекцію

<img width="367" alt="Знімок екрана 2024-12-14 о 15 35 14" src="https://github.com/user-attachments/assets/865d8edf-557e-4c8c-af63-dc3341a449c0" />

- get(int index): Повертає елемент за індексом

<img width="384" alt="Знімок екрана 2024-12-14 о 15 35 48" src="https://github.com/user-attachments/assets/39f55983-44b7-419d-b545-024f6160b80d" />

- set(int index, T element): Замінює елемент за індексом

<img width="378" alt="Знімок екрана 2024-12-14 о 15 36 04" src="https://github.com/user-attachments/assets/13c88c5c-eee2-4738-9f3d-7019a7bcb68f" />

- indexOf(Object o): Повертає індекс першого входження елемента

<img width="655" alt="Знімок екрана 2024-12-14 о 15 36 15" src="https://github.com/user-attachments/assets/d45cc5cc-a271-4251-9b3e-201dfe984e32" />

- lastIndexOf(Object o): Повертає індекс останнього входження елемента

<img width="644" alt="Знімок екрана 2024-12-14 о 15 36 26" src="https://github.com/user-attachments/assets/4892fd25-da64-4f16-b6e8-2c5b67c5644c" />

Приклад використання

<img width="845" alt="Знімок екрана 2024-12-14 о 15 24 45" src="https://github.com/user-attachments/assets/109419a7-fc14-4a55-8f87-f403200643b0" />

Результат виконання коду

<img width="470" alt="Знімок екрана 2024-12-14 о 15 25 07" src="https://github.com/user-attachments/assets/80f1eaa6-29db-40f7-88f4-7ad35e25f63c" />



