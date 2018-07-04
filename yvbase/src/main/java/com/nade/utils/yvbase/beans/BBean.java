package com.nade.utils.yvbase.beans;

/**
 * 作者: Nade_S on 2018/7/4.
 */

public class BBean {
    private int status;// 是否请求成功 1 成功 0 错误码
    private int failure; // 请求失败码

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getFailure() {
        return failure;
    }

    public void setFailure(int failure) {
        this.failure = failure;
    }
}
