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
@MapperScan(basePackages = SchoolMyBatisConfig.WORK_HDJAVA_MAPPER_DAO_SCHOOL,
        sqlSessionFactoryRef= SchoolMyBatisConfig.SCHOOL_SQL_SESSION_FACTORY)
public class SchoolMyBatisConfig {

    public static final String WORK_HDJAVA_MAPPER_DAO_SCHOOL = "work.hdjava.mapper.dao.school";
    public static final String SPRING_DATASOURCE_DRUID_DATASOURCE_1 = "spring.datasource.druid.datasource1";
    public static final String CLASSPATH_MAPPER_SCHOOL_XML = "classpath:mapper/school/*.xml";
    public static final String SCHOOL_SQL_SESSION_FACTORY = "schoolSqlSessionFactory";

    @Bean
    @ConfigurationProperties(prefix = SPRING_DATASOURCE_DRUID_DATASOURCE_1)
    public DataSource dataSource1() {
        // 底层会自动拿到spring.datasource中的配置， 创建一个DruidDataSource
        return DruidDataSourceBuilder.create().build();
    }
    @Bean
    @Primary
    public SqlSessionFactory schoolSqlSessionFactory()
            throws Exception {
        final SqlSessionFactoryBean sessionFactory = new
                SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource1());
        // 指定主库对应的mapper.xml文件
        sessionFactory.setMapperLocations(new
                PathMatchingResourcePatternResolver()
                .getResources(CLASSPATH_MAPPER_SCHOOL_XML));
        return sessionFactory.getObject();
    }
    @Bean
    public DataSourceTransactionManager schoolTransactionManager(){
        DataSourceTransactionManager dataSourceTransactionManager = new
                DataSourceTransactionManager();
        dataSourceTransactionManager.setDataSource(dataSource1());
        return dataSourceTransactionManager;
    }
    @Bean
    public TransactionTemplate schoolTransactionTemplate(){
        return new TransactionTemplate(schoolTransactionManager());
    }
}