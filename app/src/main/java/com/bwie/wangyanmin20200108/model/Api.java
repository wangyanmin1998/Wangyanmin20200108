package com.bwie.wangyanmin20200108.model;

import io.reactivex.Observable;
import retrofit2.http.GET;

/*
 *@auther:王彦敏
 *@Date: 2020/1/8
 *@Time:19:44
 *@Description:
 * */
public interface Api {
    @GET("commodity/v1/commodityList")
    Observable getHomeData();
}
