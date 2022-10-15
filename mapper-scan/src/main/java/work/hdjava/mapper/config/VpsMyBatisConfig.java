package work.hdjava.mapper.config;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.support.TransactionTemplate;

import javax.sql.DataSource;

/**
 * Author suncl
 * Date: 2022/10/15 10:03
 * Description:  该文件的描述
 */
@Configuration
@MapperScan(basePackages = VpsMyBatisConfig.WORK_HDJAVA_MAPPER_DAO_VPS,
        sqlSessionFactoryRef= VpsMyBatisConfig.VPS_SQL_SESSION_FACTORY)
public class VpsMyBatisConfig {

    public static final String WORK_HDJAVA_MAPPER_DAO_VPS = "work.hdjava.mapper.dao.vps";
    public static final String VPS_SQL_SESSION_FACTORY = "vpsSqlSessionFactory";
    public static final String SPRING_DATASOURCE_DRUID_DATASOURCE_2 = "spring.datasource.druid.datasource2";
    public static final String CLASSPATH_MAPPER_VPS_XML = "classpath:mapper/vps/*.xml";

    @Bean
    @ConfigurationProperties(prefix = SPRING_DATASOURCE_DRUID_DATASOURCE_2)
    public DataSource dataSource2() {
        // 底层会自动拿到spring.datasource中的配置， 创建一个DruidDataSource
        return DruidDataSourceBuilder.create().build();
    }
    @Bean
    @Primary
    public SqlSessionFactory vpsSqlSessionFactory()
            throws Exception {
        final SqlSessionFactoryBean sessionFactory = new
                SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource2());
        // 指定主库对应的mapper.xml文件
        sessionFactory.setMapperLocations(new
                PathMatchingResourcePatternResolver()
                .getResources(CLASSPATH_MAPPER_VPS_XML));
        return sessionFactory.getObject();
    }
    @Bean
    public DataSourceTransactionManager vpsTransactionManager(){
        DataSourceTransactionManager dataSourceTransactionManager = new
                DataSourceTransactionManager();
        dataSourceTransactionManager.setDataSource(dataSource2());
        return dataSourceTransactionManager;
    }
    @Bean
    public TransactionTemplate vpsTransactionTemplate(){
        return new TransactionTemplate(vpsTransactionManager());
    }
}