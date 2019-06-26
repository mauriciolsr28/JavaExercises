
package horadosistema;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class HoraDoSistema {

    
    public static void main(String[] args) {
    Date relogio = new Date();    
        System.out.println("A hora do Sistema é:");
       
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        
        //LocalDateTime.now().format(DateTimeFormatter.ISO_DATE)
        
    }
    
}
