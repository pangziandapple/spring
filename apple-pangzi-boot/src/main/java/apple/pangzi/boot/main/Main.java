package apple.pangzi.boot.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Description:
 * @Author: zzh
 * @Date: 2018/5/10
 * @Version: V1.0.0
 * @Update: 更新说明
 */
@SpringBootApplication
@ComponentScan("apple.pangzi.boot.web")
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class,"org.springframework.web.context.ContextLoaderListener");
    }
}
