package com.mediastep.beecow.catalog.config;

import com.mediastep.beecow.catalog.client.CatalogServiceClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackageClasses = CatalogServiceClient.class)
public class CatalogSharedConfig {

}
