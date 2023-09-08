package com.tencent.map.tools.net.http;

public interface HttpResponseListener<T> {
    void onFailure(int i, String str, Throwable th);

    void onSuccess(int i, T t);
}
