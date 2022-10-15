package work.hdjava.dyn.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import work.hdjava.dyn.annotation.DS;
import work.hdjava.dyn.config.DynamicDataSource;

/**
 * Author suncl
 * Date: 2022/10/15 17:50
 * Description:  处理数据源注解
 */
@Component
@Aspect
@Slf4j
public class DynamicDataSourceAspect implements Ordered {

    @Before("within(work.hdjava.dyn.controller.*) && @annotation(ds)")
    public void before(JoinPoint point, DS ds){
        String value = ds.value();
        DynamicDataSource.name.set(value);
        log.info("value:{}",value);
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
