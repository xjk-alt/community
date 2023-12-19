package com.nowcoder.community.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;

@Configuration  //表示是个普通的配置类，配置类是引入别人代码中方法装配到bean
public class AlphaConfig {

    @Bean
    //方法名就是bean的名字
    public SimpleDateFormat simpleDateFormat() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    }

}
