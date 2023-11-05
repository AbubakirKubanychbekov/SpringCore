package globalPackage.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Book {
    @Value("${name}")
    private String name;
    private Library library;

    public Book() {
    }

    public Book(String name, Library library) {
        System.out.println("Class book : constructor ");
        this.name = name;
        this.library = library;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }
}
