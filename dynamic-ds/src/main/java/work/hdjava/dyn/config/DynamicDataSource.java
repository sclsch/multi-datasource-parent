package work.hdjava.dyn.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.sql.DataSource;
import javax.xml.crypto.Data;
import java.util.HashMap;
import java.util.Map;

/**
 * Author suncl
 * Date: 2022/10/15 9:57
 * Description:  动态数据源
 */
@Component
@Primary
public class DynamicDataSource extends AbstractRoutingDataSource {
    //数据源标识
    public static ThreadLocal<String> name = new ThreadLocal<>();

    @Resource(name = "dataSource1")
    private DataSource dataSource1;
    @Resource(name = "dataSource2")
    private DataSource dataSource2;
    @Override
    protected Object determineCurrentLookupKey() {
        return name.get();
    }

    @Override
    public void afterPropertiesSet() {
        Map<Object,Object> dataSourceMap = new HashMap<>();
        dataSourceMap.put("dataSource1",dataSource1);
        dataSourceMap.put("dataSource2",dataSource2);
        super.setTargetDataSources(dataSourceMap);
        super.setDefaultTargetDataSource(dataSource1);
        super.afterPropertiesSet();
    }
}
