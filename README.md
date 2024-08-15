# Java RESTful API 

## Diagrama de classes

```mermaid
classDiagram
    class Store {
        Book[] book
        Bicycle bicycle
    }

    class Book {
        String category
        String author
        String title
        Float price
        String isbn
    }

    class Bicycle {
        String color
        Float price
    }

    Store "1" *-- "N" Book
    Store "1" *-- "N" Bicycle
```

