package org.example.feign;

import org.example.domain.Video;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author yeyc
 * @Description 描述类的作用
 * @Date 2024/12/11
 * @Param
 * @Exception
 **/
@FeignClient(name = "cloud-video")
public interface VideoFeign {

    @GetMapping("/api/v1/video/findById")
    Video findById(@RequestParam("id")int id);
}
