package globalPackage.entity;

import org.springframework.stereotype.Component;

@Component
public class RomanceBook implements Library{
    public void nameOfBook() {
        System.out.println("Anjelika and king ");
    }
}
