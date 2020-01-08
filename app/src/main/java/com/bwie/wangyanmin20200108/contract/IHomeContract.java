package com.bwie.wangyanmin20200108.contract;

import com.bwie.wangyanmin20200108.model.Bean;

/*
 *@auther:王彦敏
 *@Date: 2020/1/8
 *@Time:19:38
 *@Description:
 * */
public interface IHomeContract {

    interface IView{
        void onHomeSuccess(Bean bean);
        void onHomeFailure(Throwable throwble);
    }

    interface IPresenter{
        void getHomeData();
    }

    interface IModel{
        void getHomeData(IHomeCallback iHomeCallback);
        interface IHomeCallback{
            void onHomeSuccess(Bean bean);
            void onHomeFailure(Throwable throwble);
        }
    }


}
