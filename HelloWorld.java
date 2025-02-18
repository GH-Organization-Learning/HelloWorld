import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

void main() {
    System.out.println("Hello World!");
    System.out.println("Date: " + LocalDateTime.now()
            .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"))
    );
}