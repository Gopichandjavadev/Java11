package java11;

import java.time.Duration;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

public class OptionalEmpty {

    public static void main(String[] args) {
       
        TimeUnit c = TimeUnit.DAYS;
        

        System.out.println(c.convert(Duration.ofHours(24)));
        

        System.out.println(c.convert(Duration.ofHours(50)));
        
        Optional str = Optional.empty();
        
        System.out.println(str.isEmpty());
        
        Optional str1 = Optional.of("TonyStark");
        
        str1.isEmpty();
        

    }

}
