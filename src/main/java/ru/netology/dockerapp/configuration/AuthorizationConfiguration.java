package ru.netology.dockerapp.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.netology.dockerapp.repository.UserRepository;
import ru.netology.dockerapp.service.AuthorizationService;

@Configuration
public class AuthorizationConfiguration {

    @Bean
    public UserRepository userRepository() {
        return new UserRepository();
    }

    @Bean
    public AuthorizationService service(UserRepository userRepository) {
        return new AuthorizationService(userRepository);
    }

}
