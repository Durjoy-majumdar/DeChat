package com.tencent.skyline.jsapi;

import com.tencent.skyline.jsapi.SkylineJsApiExecutor;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import org.json.JSONObject;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001\u001cB\u000f\u0012\u0006\u0010\u0019\u001a\u00028\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ&\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nJ \u0010\u000f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006R\u0014\u0010\u0010\u001a\u00028\u00008\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R(\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00130\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R(\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00170\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015¨\u0006\u001d"}, mo182094d2 = {"Lcom/tencent/skyline/jsapi/SkylineJsApiInvoker;", "Lcom/tencent/skyline/jsapi/SkylineJsApiExecutor;", "EXECUTOR", "", "", "jsapiName", "Lorg/json/JSONObject;", "data", "", "callbackId", "Lcom/tencent/skyline/jsapi/SkylineJsApiInvoker$SkylineJsApiCallback;", "callback", "Lrx3/b0;", "invoke", "reason", "onCallback", "mSkylineJsApiExecutor", "Lcom/tencent/skyline/jsapi/SkylineJsApiExecutor;", "", "Lcom/tencent/skyline/jsapi/BaseJsApiForSkyline;", "mJsApiMap", "Ljava/util/Map;", "", "Ljava/lang/ref/WeakReference;", "mJsApiCallbackMap", "executor", "<init>", "(Lcom/tencent/skyline/jsapi/SkylineJsApiExecutor;)V", "SkylineJsApiCallback", "skyline_release"}, mo182095k = 1, mo182096mv = {1, 6, 0})
public final class SkylineJsApiInvoker<EXECUTOR extends SkylineJsApiExecutor> {
    private Map<Integer, WeakReference<SkylineJsApiCallback>> mJsApiCallbackMap = new HashMap();
    private Map<String, ? extends BaseJsApiForSkyline<EXECUTOR>> mJsApiMap;
    private final EXECUTOR mSkylineJsApiExecutor;

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¨\u0006\n"}, mo182094d2 = {"Lcom/tencent/skyline/jsapi/SkylineJsApiInvoker$SkylineJsApiCallback;", "", "", "callbackId", "", "reason", "Lorg/json/JSONObject;", "data", "Lrx3/b0;", "callback", "skyline_release"}, mo182095k = 1, mo182096mv = {1, 6, 0})
    public interface SkylineJsApiCallback {
        void callback(int i, String str, JSONObject jSONObject);
    }

    public SkylineJsApiInvoker(EXECUTOR executor) {
        C87412m.m108594g(executor, "executor");
        this.mSkylineJsApiExecutor = executor;
        JsApiPoolForSkyline jsApiPoolForSkyline = JsApiPoolForSkyline.INSTANCE;
        jsApiPoolForSkyline.init();
        this.mJsApiMap = jsApiPoolForSkyline.getJsApiMap();
        executor.attach(this);
    }

    public final void invoke(String str, JSONObject jSONObject, int i, SkylineJsApiCallback skylineJsApiCallback) {
        C87412m.m108594g(str, "jsapiName");
        C87412m.m108594g(jSONObject, "data");
        C87412m.m108594g(skylineJsApiCallback, "callback");
        if (this.mJsApiMap.containsKey(str)) {
            BaseJsApiForSkyline baseJsApiForSkyline = (BaseJsApiForSkyline) this.mJsApiMap.get(str);
            if (baseJsApiForSkyline != null) {
                baseJsApiForSkyline.invoke(this.mSkylineJsApiExecutor, jSONObject, i);
            }
            this.mJsApiCallbackMap.put(Integer.valueOf(i), new WeakReference(skylineJsApiCallback));
        }
    }

    public final void onCallback(int i, String str, JSONObject jSONObject) {
        SkylineJsApiCallback skylineJsApiCallback;
        C87412m.m108594g(str, TPReportKeys.PlayerStep.PLAYER_REASON);
        WeakReference weakReference = this.mJsApiCallbackMap.get(Integer.valueOf(i));
        if (weakReference != null && (skylineJsApiCallback = (SkylineJsApiCallback) weakReference.get()) != null) {
            skylineJsApiCallback.callback(i, str, jSONObject);
        }
    }
}
