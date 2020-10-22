package com.detroitlabs.tacolocojavachallenge;

import com.detroitlabs.tacolocojavachallenge.entity.Menu;
import com.detroitlabs.tacolocojavachallenge.repository.MenuRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.*;

@SpringBootApplication
@EnableSwagger2
public class TacoLocoJavaChallengeApplication implements CommandLineRunner {

    @Autowired
    private MenuRepo menuRepo;

    public static void main(String[] args) {
        SpringApplication.run(TacoLocoJavaChallengeApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        /** Initializing menu from ORM itself which can be used from @database in real problem **/
        List<Menu> menuList = new ArrayList<>();
        Menu menuOne = new Menu("Veggie Taco",2.5f);
        Menu menuTwo= new Menu("Chicken Taco",3f);
        Menu menuThree= new Menu("Beef Taco",3f);
        Menu menuFour = new Menu("Chorizo Taco",3.5f);

        Collections.addAll(menuList,menuOne,menuTwo,menuThree,menuFour);
        menuRepo.saveAll(menuList);

    }
}
