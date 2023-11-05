package globalPackage.entity;

import org.springframework.stereotype.Component;

@Component
public class DetectiveBook implements Library{
    public void nameOfBook() {
        System.out.println("Sherlok Holms");
    }
}
