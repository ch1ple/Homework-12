public class Main {

    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        System.out.println("Задача 1");
        Author julWern = new Author("Жуль", "Верн");
        Book captain = new Book("Пятнадцатилетний капитан", julWern, 1978);
        // В инструкции к домашнему заданию написано, что тип полей в классе Book должен быть Author, я немного это не понял
        System.out.println("Название книги = " + captain.getName());
        System.out.println("Автор = " + julWern.getName() + " " + julWern.getSurName());
        System.out.println("Год публикации = " + captain.getPublicationDate());
        captain.setPublicationDate(1999);
        System.out.println("Обновленный год публикации = " + captain.getPublicationDate());
        Author arthurHailey = new Author("Артур", "Хейли");
        Book airport = new Book("Аэропорт", new Author("Артур", "Хейли"), 1968);
        // Попробовал разными способами выводить имя автора, но оба варианта выводит непонятные символы
        // поэтому остановился на том, что отдельно вывожу имя автора
        System.out.println("Название книги = " + airport.getName());
        System.out.println("Автор = " + arthurHailey.getName() + " " + arthurHailey.getSurName());
        System.out.println("Год публикации = " + airport.getPublicationDate());
    }
}