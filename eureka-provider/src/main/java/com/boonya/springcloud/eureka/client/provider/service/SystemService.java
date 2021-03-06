package com.boonya.springcloud.eureka.client.provider.service;

/**
 * @Copyright: 2019-2021
 * @FileName: SystemService.java
 * @Author: PJL
 * @Date: 2020/10/13 13:37
 * @Description: 系统服务接口
 */
public interface SystemService {

    /**
     * 获取系统版本号
     *
     * @return
     */
    String getVersion();

    /**
     * 获取操作系统信息
     *
     * @return
     */
    String getOsInfo();
}
