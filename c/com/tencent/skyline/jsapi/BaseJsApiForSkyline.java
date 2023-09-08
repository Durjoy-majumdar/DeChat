package com.tencent.skyline.jsapi;

import com.tencent.skyline.jsapi.SkylineJsApiExecutor;
import gy3.C87412m;
import kotlin.Metadata;
import org.json.JSONObject;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\f\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\b\u0010\u000e\u001a\u00020\rH&¨\u0006\u0011"}, mo182094d2 = {"Lcom/tencent/skyline/jsapi/BaseJsApiForSkyline;", "Lcom/tencent/skyline/jsapi/SkylineJsApiExecutor;", "EXECUTOR", "", "env", "Lorg/json/JSONObject;", "data", "", "callbackId", "Lrx3/b0;", "dispatchToDart", "(Lcom/tencent/skyline/jsapi/SkylineJsApiExecutor;Lorg/json/JSONObject;I)V", "invoke", "", "getName", "<init>", "()V", "skyline_release"}, mo182095k = 1, mo182096mv = {1, 6, 0})
public abstract class BaseJsApiForSkyline<EXECUTOR extends SkylineJsApiExecutor> {
    public final void dispatchToDart(EXECUTOR executor, JSONObject jSONObject, int i) {
        C87412m.m108594g(executor, "env");
        C87412m.m108594g(jSONObject, "data");
        executor.dispatchJsApiCall(getName(), jSONObject, i);
    }

    public abstract String getName();

    public void invoke(EXECUTOR executor, JSONObject jSONObject, int i) {
        C87412m.m108594g(executor, "env");
        C87412m.m108594g(jSONObject, "data");
        dispatchToDart(executor, jSONObject, i);
    }
}
