package com.tencent.skyline.jsapi;

import gy3.C87412m;
import kotlin.Metadata;
import org.json.JSONObject;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002J \u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH&R&\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u00028\u0004@\u0004X.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, mo182094d2 = {"Lcom/tencent/skyline/jsapi/SkylineJsApiExecutor;", "", "Lcom/tencent/skyline/jsapi/SkylineJsApiInvoker;", "invoker", "Lrx3/b0;", "attach", "", "jsapiName", "Lorg/json/JSONObject;", "data", "", "callbackId", "dispatchJsApiCall", "mInvoker", "Lcom/tencent/skyline/jsapi/SkylineJsApiInvoker;", "getMInvoker", "()Lcom/tencent/skyline/jsapi/SkylineJsApiInvoker;", "setMInvoker", "(Lcom/tencent/skyline/jsapi/SkylineJsApiInvoker;)V", "<init>", "()V", "skyline_release"}, mo182095k = 1, mo182096mv = {1, 6, 0})
public abstract class SkylineJsApiExecutor {
    public SkylineJsApiInvoker<?> mInvoker;

    public final void attach(SkylineJsApiInvoker<?> skylineJsApiInvoker) {
        C87412m.m108594g(skylineJsApiInvoker, "invoker");
        setMInvoker(skylineJsApiInvoker);
    }

    public abstract void dispatchJsApiCall(String str, JSONObject jSONObject, int i);

    public final SkylineJsApiInvoker<?> getMInvoker() {
        SkylineJsApiInvoker<?> skylineJsApiInvoker = this.mInvoker;
        if (skylineJsApiInvoker != null) {
            return skylineJsApiInvoker;
        }
        C87412m.m108603p("mInvoker");
        throw null;
    }

    public final void setMInvoker(SkylineJsApiInvoker<?> skylineJsApiInvoker) {
        C87412m.m108594g(skylineJsApiInvoker, "<set-?>");
        this.mInvoker = skylineJsApiInvoker;
    }
}
