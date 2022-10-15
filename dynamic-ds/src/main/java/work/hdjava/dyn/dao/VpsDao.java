package work.hdjava.dyn.dao;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import work.hdjava.dyn.entity.Vps;

/**
 * (Vps)表数据库访问层
 *
 * @author makejava
 * @since 2022-10-15 11:11:59
 */
@Mapper
public interface VpsDao extends BaseMapper<Vps> {

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Vps> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Vps> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Vps> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Vps> entities);

    List<Vps> selectAll();
}

