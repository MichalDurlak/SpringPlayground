package pl.michaldurlak.SpringPlayground.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import pl.michaldurlak.SpringPlayground.domain.University;

@Configuration
@PropertySource("classpath:university.properties")
@Import(MainConfig.class)
public class CastleConfig {

    @Bean(name="university",initMethod = "startBeanUniversity",destroyMethod = "removeBeanUniversity")
    @Value("${my.university.name:WSB}")
    public University university(String universityName){
        University university = new University();
        university.setName( universityName);
        return university;
    }

}
