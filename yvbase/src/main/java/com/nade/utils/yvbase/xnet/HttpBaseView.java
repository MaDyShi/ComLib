package com.nade.utils.yvbase.xnet;

public interface HttpBaseView {

    void httpSuccess(String bean);
    void httpSuccessCode(String bean);
    void httpError(Throwable ex);
}
