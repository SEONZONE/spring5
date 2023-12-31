package spring5fs.core.chap06.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import spring5fs.core.chap06.config.AppCtx;
import spring5fs.core.chap06.spring.Client;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

        Client client = ctx.getBean(Client.class);
        client.send();

        ctx.close();
    }
}
