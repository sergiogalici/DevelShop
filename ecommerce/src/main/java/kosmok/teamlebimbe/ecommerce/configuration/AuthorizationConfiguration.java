package kosmok.teamlebimbe.ecommerce.configuration;

import it.pasqualecavallo.studentsmaterial.authorization_framework.config.DefinitelyBasicAuthorizationFrameworkAutoconfiguration;


import org.springframework.context.annotation.Configuration;

import org.springframework.context.annotation.Import;



@Configuration
@Import(DefinitelyBasicAuthorizationFrameworkAutoconfiguration.class)
public class AuthorizationConfiguration {

}