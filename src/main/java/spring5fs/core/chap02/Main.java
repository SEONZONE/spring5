package spring5fs.core.chap02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring5fs.core.chap01.AppContent;
import spring5fs.core.chap01.Greeter;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppContent.class);
        Greeter g1 = ctx.getBean("greeter",Greeter.class);
        Greeter g2 = ctx.getBean("greeter",Greeter.class);

        System.out.println("결과는 !? (g1 == g2)" + (g1 == g2) );
        ctx.close();
    }
}
