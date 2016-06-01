package hu.kalee.math.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by Moondancer83 on 2016.05.31..
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"hu.kalee.math"})
public class LibConfig {
}
