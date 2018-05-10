package apple.pangzi.boot.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: zzh
 * @Date: 2018/5/10
 * @Version: V1.0.0
 * @Update: 更新说明
 */
@RestController
public class TestController {

    @RequestMapping("test")
    public String test(){
        return "test";
    }
}
