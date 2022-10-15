package work.hdjava.dyn.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * Author suncl
 * Date: 2022/10/15 10:03
 * Description:  该文件的描述
 */
@Configuration
public class DataSourceConfig {

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.druid.datasource1")
    public DataSource dataSource1(){
        return DruidDataSourceBuilder.create().build();
    }
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.druid.datasource2")
    public DataSource dataSource2(){
        return DruidDataSourceBuilder.create().build();
    }
}
