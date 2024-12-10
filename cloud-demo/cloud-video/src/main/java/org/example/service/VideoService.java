package org.example.service;

import org.example.domain.Video;
import org.example.service.impl.VideoServiceImpl;

/**
 * @Author yeyc
 * @Description 描述类的作用
 * @Date 2024/12/10
 * @Param
 * @Exception
 **/
public interface VideoService  {
    Video findById(Integer id);
}
