package work.hdjava.dyn.dao;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import work.hdjava.dyn.entity.UniversityRank;

/**
 * (UniversityRank)表数据库访问层
 *
 * @author makejava
 * @since 2022-10-15 11:27:38
 */
@Mapper
public interface UniversityRankDao extends BaseMapper<UniversityRank> {

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<UniversityRank> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<UniversityRank> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<UniversityRank> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<UniversityRank> entities);

    List<UniversityRank> selectAll();
}

