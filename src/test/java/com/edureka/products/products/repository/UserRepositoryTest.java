package com.edureka.products.products.repository;

import com.edureka.products.products.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
//@Rollback(value = false)
class UserRepositoryTest {

    @Autowired
    private UserRepository repository;

    @Test
    public void saveFirstUser(){
//        User user = new User(1,"Darshan","Patel","pateld0995@gmail.com","Test1234",true,"male","1-Days");
//        repository.save(user);
    }
}
