package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;

public class Response<T extends Result> {
    private T zzdm;

    public Response() {
    }

    public Response(T t) {
        this.zzdm = t;
    }

    public T getResult() {
        return this.zzdm;
    }

    public void setResult(T t) {
        this.zzdm = t;
    }
}
