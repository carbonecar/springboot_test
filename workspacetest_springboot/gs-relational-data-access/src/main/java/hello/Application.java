package hello;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class Application implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String args[]) {
        SpringApplication.run(Application.class, args);
    }

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public void run(String... strings) throws Exception {

        log.info("Creating tables");

        //jdbcTemplate.execute("DROP TABLE customers IF EXISTS");
       jdbcTemplate.execute("CREATE TABLE customers(id integer not null GENERATED ALWAYS AS IDENTITY (START WITH 1 INCREMENT BY 1), first_name VARCHAR(255), last_name VARCHAR(255))");

        // Split up the array of whole names into an array of first/last names
        
        List<Object[]> splitUpNames = new ArrayList<Object[]>();
        splitUpNames.add(new Object[]{"Johon", "Woo"});
        splitUpNames.add(new Object[]{"Jeff", "Dean"});
        splitUpNames.add(new Object[]{"Josh","Block"});
        splitUpNames.add(new Object[]{"Josh Long"});
        

        // Use a Java 8 stream to print out each tuple of the list
       
        // Uses JdbcTemplate's batchUpdate operation to bulk load data
        
        jdbcTemplate.batchUpdate("INSERT INTO customers(first_name, last_name) VALUES (?,?)", splitUpNames);

        log.info("Querying for customer records where first_name = 'Josh':");
        /*jdbcTemplate.query(
                "SELECT id, first_name, last_name FROM customers WHERE first_name = ?", new Object[] { "Josh" },
                (rs, rowNum) -> new Customer(rs.getLong("id"), rs.getString("first_name"), rs.getString("last_name"))
        ).forEach(customer -> log.info(customer.toString()));*/
    }
}
