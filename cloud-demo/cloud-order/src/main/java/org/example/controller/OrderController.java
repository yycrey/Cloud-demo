package org.example.controller;

import org.apache.ibatis.annotations.Param;
import org.example.domain.Video;
import org.example.domain.VideoOrder;
import org.example.feign.VideoFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Author yeyc
 * @Description 描述类的作用
 * @Date 2024/12/11
 * @Param
 * @Exception
 **/
@RestController
@RequestMapping("api/v1/order")
public class OrderController {
    @Autowired
    private RestTemplate restTemplate;;
    @Autowired
    private DiscoveryClient discoveryClient;
    @Autowired
    private VideoFeign  videoFeign;

    @GetMapping("getOrder")
    public Object getOrder(@Param("id") int id){
//        List<ServiceInstance> instances = discoveryClient.getInstances("cloud-video");
//        ServiceInstance serviceInstance = instances.get(0);
//        Video videoOrders =   restTemplate.getForObject("http://cloud-video/api/v1/video/findById?id="+id,Video.class);
        try{
            Video videoOrders = videoFeign.findById(id);

            if(null != videoOrders){
                return videoOrders;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return new VideoOrder();
    }

}
