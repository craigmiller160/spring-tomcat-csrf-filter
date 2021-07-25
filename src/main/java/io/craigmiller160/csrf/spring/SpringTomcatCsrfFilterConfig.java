package io.craigmiller160.csrf.spring;

import org.apache.catalina.filters.RestCsrfPreventionFilter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringTomcatCsrfFilterConfig {

    @Bean
    // TODO add docs for this property
    @ConditionalOnProperty(value = "csrf.disable-csrf", havingValue = "false", matchIfMissing = true)
    public FilterRegistrationBean<RestCsrfPreventionFilter> restCsrfPreventionFilter() {
        final var filter = new RestCsrfPreventionFilter();
        filter.setDenyStatus(403);
        final var filterRegistration = new FilterRegistrationBean<>(filter);
        filterRegistration.setOrder(Integer.MIN_VALUE);
        return filterRegistration;
    }

}
