package org.example.controller;

import org.apache.ibatis.annotations.Param;
import org.example.domain.Video;
import org.example.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author yeyc
 * @Description 描述类的作用
 * @Date 2024/12/10
 * @Param
 * @Exception
 **/
@RestController
@RequestMapping("/api/v1/video")
public class VideoController {
    @Autowired
    private VideoService videoService;
    @GetMapping("findById")
    public Video findAll(@Param("id") int id, HttpServletRequest request){
        Video video = videoService.findById(id);
        video.setServiceInfo("serviceName:"+request.getServerName()+";servicePort"+request.getServerPort());
        return video;
    }
}
