package org.example.mapper;

import org.apache.ibatis.annotations.Select;
import org.example.domain.Video;
import org.springframework.stereotype.Repository;

/**
 * @Author yeyc
 * @Description 描述类的作用
 * @Date 2024/12/10
 * @Param
 * @Exception
 **/

@Repository
public interface VideoMapper {
    @Select("select * from video where id = #{id}")
    Video findById(Integer id);
}
