package ua.delsix.app.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import ua.delsix.app.models.User;

import java.util.List;

@Component
public class UserDAO {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public UserDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<User> index() {
        return jdbcTemplate.query("SELECT * FROM app_user", new BeanPropertyRowMapper<>(User.class));
    }

    public User show(int id) {
        return jdbcTemplate.queryForObject("SELECT * FROM app_user WHERE id=?",
                new BeanPropertyRowMapper<>(User.class),
                id);
    }

    public void save(User user) {
        jdbcTemplate.update("INSERT INTO app_user (name, email, date_of_registration, password) VALUES" +
                "(?, ?, NOW(), ?)",
                user.getName(),
                user.getEmail(),
                user.getPassword());
    }
}
