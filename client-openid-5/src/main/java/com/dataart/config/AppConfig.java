package com.dataart.config;

import com.dataart.oidc.userinfo.DataArtOidcUserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.client.oidc.userinfo.OidcUserRequest;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserService;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;

@Configuration
public class AppConfig {

    @Bean
    public OAuth2UserService<OidcUserRequest, OidcUser> oidcUserOAuth2UserService() {
        return new DataArtOidcUserService();
    }
}
