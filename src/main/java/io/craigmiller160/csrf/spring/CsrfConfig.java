package io.craigmiller160.csrf.spring;

import org.apache.catalina.filters.RestCsrfPreventionFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CsrfConfig {

    @Bean
    public FilterRegistrationBean<RestCsrfPreventionFilter> restCsrfPreventionFilter() {
        final var filter = new RestCsrfPreventionFilter();
        filter.setDenyStatus(403);
        final var filterRegistration = new FilterRegistrationBean<>(filter);
        filterRegistration.setOrder(Integer.MIN_VALUE);
        return filterRegistration;
    }

}
