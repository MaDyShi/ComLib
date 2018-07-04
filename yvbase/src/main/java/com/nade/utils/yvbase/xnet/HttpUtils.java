package com.nade.utils.yvbase.xnet;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import org.xutils.common.Callback;
import org.xutils.http.HttpMethod;
import org.xutils.http.RequestParams;

import org.xutils.x;

/**
 * 作者: Nade_S on 2018/5/25.
 * 网络助手
 * get 请求
 * post 请求
 * bindimg 绑定图片
 * getheader 获取头参数
 *
 */

public class HttpUtils {


    /**
     * get
     * @param params 请求体
     * @param view
     */


    public static void xGET(RequestParams params, final HttpBaseView view){

            x.http().get(params, new Callback.CommonCallback<String>() {
                @Override
                public void onSuccess(String result) {
                    JSONObject object = JSON.parseObject(result);
                    Integer status = object.getInteger("status");
                    if (status==1){
                        view.httpSuccess(result);
                    }else {
                        view.httpSuccessCode(result);
                    }
                }

                @Override
                public void onError(Throwable ex, boolean isOnCallback) {
                    view.httpError(ex);
                }

                @Override
                public void onCancelled(CancelledException cex) {

                }

                @Override
                public void onFinished() {

                }
            });

    }

    /**
     * post
     * @param params
     * @param view
     */
    public static void xPost(RequestParams params, final HttpBaseView view){

            x.http().post(params, new Callback.CommonCallback<String>() {
                @Override
                public void onSuccess(String result) {
                    JSONObject object = JSON.parseObject(result);
                    Integer status = object.getInteger("status");
                    if (status==1){
                        view.httpSuccess(result);
                    }else {
                        view.httpSuccessCode(result);
                    }
                }

                @Override
                public void onError(Throwable ex, boolean isOnCallback) {
                    view.httpError(ex);
                }

                @Override
                public void onCancelled(CancelledException cex) {

                }

                @Override
                public void onFinished() {

                }
            });


    }


    /**
     * put 请求
     * @param params
     * @param view
     */
    public static void xPut(RequestParams params, final HttpBaseView view){
        x.http().request(HttpMethod.PUT, params, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                JSONObject object = JSON.parseObject(result);
                Integer status = object.getInteger("status");
                if (status==1){
                    view.httpSuccess(result);
                }else {
                    view.httpSuccessCode(result);
                }
            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {
                view.httpError(ex);
            }

            @Override
            public void onCancelled(CancelledException cex) {

            }

            @Override
            public void onFinished() {

            }
        });

    }

}
