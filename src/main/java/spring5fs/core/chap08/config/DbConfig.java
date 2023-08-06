package spring5fs.core.chap08.config;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DbConfig {
    @Bean(destroyMethod = "close")
    public DataSource dataSource() {
        DataSource ds = new DataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306?characterEncoding=utf8&serverTimezone=UTC/spring5");
        ds.setUsername("seonzone");
        ds.setPassword("2409");
        ds.setInitialSize(2);
        ds.setMaxActive(10); //커넥션 풀
        return ds;
    }
}