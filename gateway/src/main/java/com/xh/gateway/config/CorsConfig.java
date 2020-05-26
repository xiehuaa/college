package com.xh.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;
import org.springframework.web.util.pattern.PathPatternParser;

/**
 * 跨域配置
 *
 * @author XieHua
 * @date 2020-05-23
 */
@Configuration
public class CorsConfig {
    // 请求头
    private static final String ALLOWED_HEADERS = "*";
    private static final String ALLOWED_METHODS = "*";
    private static final String ALLOWED_ORIGIN = "*";
    private static final Boolean ALLOWED_CREDENTIALS = true;
    private static final Long MAX_AGE = 3600L;

    @Bean
    public CorsWebFilter corsFilter() {
        CorsConfiguration configuration = new CorsConfiguration();
        configuration.setAllowCredentials(ALLOWED_CREDENTIALS);
        configuration.addAllowedOrigin(ALLOWED_ORIGIN);
        configuration.addAllowedHeader(ALLOWED_HEADERS);
        configuration.addAllowedMethod(ALLOWED_METHODS);
        configuration.setMaxAge(MAX_AGE);

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource(new PathPatternParser());
        source.registerCorsConfiguration("/**", configuration);

        return new CorsWebFilter(source);
    }
}
