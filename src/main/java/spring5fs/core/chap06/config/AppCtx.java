package spring5fs.core.chap06.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring5fs.core.chap06.spring.Client;
import spring5fs.core.chap06.spring.Client2;

@Configuration
public class AppCtx {
    @Bean
    public Client client() {
        Client client = new Client();
        client.setHost("host");
        return client;
    }

    @Bean(initMethod = "connect",destroyMethod = "close")
    public Client2 client2() {
        Client2 client2 = new Client2();
        client2.setHost("seonzone");
        return client2;
    }
}