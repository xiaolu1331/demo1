package com.example1.demo1.bootlaunch.config;

import java.io.IOException;
import java.util.Optional;
import java.util.Properties;

import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.support.DefaultPropertySourceFactory;
import org.springframework.core.io.support.EncodedResource;
/**
 * MinPropertySourceFactory support properties and yaml file
 *
 */
public class MinPropertySourceFactory extends DefaultPropertySourceFactory {
  @Override
  public PropertySource<?> createPropertySource(String name, EncodedResource resource)
      throws IOException {
    String sourceName = Optional.ofNullable(name).orElse(resource.getResource().getFilename());
    if (!resource.getResource().exists()) {
      // return an empty Properties
      return new PropertiesPropertySource(sourceName, new Properties());
    } else if (sourceName.endsWith(".yml") || sourceName.endsWith(".yaml")) {
      Properties propertiesFromYaml = loadYaml(resource);
      return new PropertiesPropertySource(sourceName, propertiesFromYaml);
    } else {
      return super.createPropertySource(name, resource);
    }
  }
  /**
   * load yaml file to properties
   *
   * @param resource
   * @return
   * @throws IOException
   */
  private Properties loadYaml(EncodedResource resource) throws IOException {
    YamlPropertiesFactoryBean factory = new YamlPropertiesFactoryBean();
    factory.setResources(resource.getResource());
    factory.afterPropertiesSet();
    return factory.getObject();
  }
}
//@PropertySource
//@PropertySource(
//    value = {"core.yml", "key.properties"},
//    factory = CompositePropertySourceFactory.class)

  
