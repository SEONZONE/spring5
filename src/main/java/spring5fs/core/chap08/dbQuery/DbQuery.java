package spring5fs.core.chap08.dbQuery;

import org.springframework.jdbc.core.JdbcTemplate;
import spring5fs.core.chap08.spring.MemberDao;

import javax.sql.DataSource;
public class DbQuery {
    private JdbcTemplate jdbcTemplate;
    public DbQuery(DataSource dataSource){
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
}
