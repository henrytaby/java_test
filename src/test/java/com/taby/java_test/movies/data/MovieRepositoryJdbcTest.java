package com.taby.java_test.movies.data;

import com.taby.java_test.movies.model.Genre;
import com.taby.java_test.movies.model.Movie;

import org.junit.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.init.ScriptUtils;

import javax.sql.DataSource;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
public class MovieRepositoryJdbcTest {

    @Test
    public void load_all_movies() throws SQLException {
        // crear base de datos en memorias,
        DataSource dataSource =
                new DriverManagerDataSource("jdbc:h2:mem:test;MODE=MYSQL", "sa", "sa");
        // Ejecutar un script
        ScriptUtils.executeSqlScript(dataSource.getConnection(),new ClassPathResource("sql-scripts/test-data.sql"));

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        MovieRepositoryJdbc movieRepository = new MovieRepositoryJdbc(jdbcTemplate);

        Collection<Movie> movies = movieRepository.findAll();

        assertThat( movies, is(Arrays.asList(
                new Movie(1,"Dark Knight",152, Genre.ACTION),
                new Movie(2,"Memento",113,Genre.THRILLER),
                new Movie(3,"Matrix",136,Genre.ACTION)
        )));

    }
}