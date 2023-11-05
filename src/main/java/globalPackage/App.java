package globalPackage;

import globalPackage.entity.Book;
import globalPackage.entity.DetectiveBook;
import globalPackage.entity.RomanceBook;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext();

      DetectiveBook detectiveBook = applicationContext.getBean("detective_book", DetectiveBook.class);

        RomanceBook romanceBook = applicationContext.getBean("romance_book", RomanceBook.class);

       Book book = applicationContext.getBean("book", Book.class);
        System.out.println(book);
        detectiveBook.nameOfBook();

    }
}
