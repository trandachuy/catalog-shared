package com.mediastep.beecow.catalog;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan(basePackages = {"com.mediastep.beecow.catalog"})
@EnableAutoConfiguration
@PropertySource("classpath:application.properties")
public class CatalogSharedApplication {
}
