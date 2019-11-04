package life.curry.communtiy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("life.curry.communtiy.mapper")
@SpringBootApplication
public class CommuntiyApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommuntiyApplication.class, args);
    }

}
