package com.tencent.skyline.jsapi;

import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import gy3.C8480h;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import jt3.a$$a;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;
import p172io.flutter.plugin.common.BinaryMessenger;
import p172io.flutter.plugin.common.JSONMethodCodec;
import p172io.flutter.plugin.common.MethodCall;
import p172io.flutter.plugin.common.MethodChannel;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001a\u0010\u000b\u001a\f\u0012\u0004\u0012\u00020\n\u0012\u0002\b\u00030\t2\u0006\u0010\b\u001a\u00020\u0002H\u0002J \u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, mo182094d2 = {"Lcom/tencent/skyline/jsapi/JsApiMethodChannelExecutor;", "Lcom/tencent/skyline/jsapi/SkylineJsApiExecutor;", "Lorg/json/JSONObject;", "data", "", "callbackId", "Lrx3/b0;", "addDartJsApiInvokeData", "src", "", "", "json2HashMap", "jsapiName", "dispatchJsApiCall", "Lio/flutter/plugin/common/MethodChannel;", "mJsApiMethodChannel", "Lio/flutter/plugin/common/MethodChannel;", "Lio/flutter/plugin/common/BinaryMessenger;", "binaryMessenger", "<init>", "(Lio/flutter/plugin/common/BinaryMessenger;)V", "Companion", "skyline_release"}, mo182095k = 1, mo182096mv = {1, 6, 0})
public final class JsApiMethodChannelExecutor extends SkylineJsApiExecutor {
    public static final Companion Companion = new Companion((C8480h) null);
    private static final String SKYLINE_JSAPI_KEY_CALLBACK_ID = "skyline_invoke_callback_id";
    private static final String SKYLINE_JSAPI_NAME = "skyline/jsapi_method_channel";
    private static final String TAG = "Skyline.MethodChannelExecutor";
    private MethodChannel mJsApiMethodChannel;

    @Metadata(mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/skyline/jsapi/JsApiMethodChannelExecutor$Companion;", "", "()V", "SKYLINE_JSAPI_KEY_CALLBACK_ID", "", "SKYLINE_JSAPI_NAME", "TAG", "skyline_release"}, mo182095k = 1, mo182096mv = {1, 6, 0}, mo182098xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C8480h hVar) {
            this();
        }
    }

    public JsApiMethodChannelExecutor(BinaryMessenger binaryMessenger) {
        C87412m.m108594g(binaryMessenger, "binaryMessenger");
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, SKYLINE_JSAPI_NAME, JSONMethodCodec.INSTANCE);
        methodChannel.setMethodCallHandler(new a$$a(this));
        this.mJsApiMethodChannel = methodChannel;
    }

    private final void addDartJsApiInvokeData(JSONObject jSONObject, int i) {
        jSONObject.put(SKYLINE_JSAPI_KEY_CALLBACK_ID, i);
    }

    private final Map<String, ?> json2HashMap(JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        C87412m.m108593f(keys, "src.keys()");
        HashMap hashMap = new HashMap();
        while (keys.hasNext()) {
            String next = keys.next();
            String string = jSONObject.getString(next);
            C87412m.m108593f(string, "src.getString(name)");
            hashMap.put(next, string);
        }
        return hashMap;
    }

    /* access modifiers changed from: private */
    /* renamed from: lambda-1$lambda-0  reason: not valid java name */
    public static final void m168907lambda1$lambda0(JsApiMethodChannelExecutor jsApiMethodChannelExecutor, MethodCall methodCall, MethodChannel.Result result) {
        C87412m.m108594g(jsApiMethodChannelExecutor, "this$0");
        C87412m.m108594g(methodCall, "call");
        C87412m.m108594g(result, "result");
        if (C87412m.m108589b(methodCall.method, "Skyline.JsApi.Callback")) {
            try {
                Object obj = methodCall.arguments;
                if (obj != null) {
                    JSONObject jSONObject = (JSONObject) obj;
                    int i = jSONObject.getInt(SKYLINE_JSAPI_KEY_CALLBACK_ID);
                    String string = jSONObject.getString("skyline_invoke_callback_reason");
                    JSONObject optJSONObject = jSONObject.optJSONObject("skyline_invoke_callback_data");
                    SkylineJsApiInvoker<?> mInvoker = jsApiMethodChannelExecutor.getMInvoker();
                    C87412m.m108593f(string, TPReportKeys.PlayerStep.PLAYER_REASON);
                    mInvoker.onCallback(i, string, optJSONObject);
                    result.success((Object) null);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
            } catch (JSONException e) {
                result.error("error", e.getMessage(), (Object) null);
            }
        } else {
            C87412m.m108600m(methodCall.method, " not support.");
            result.notImplemented();
        }
    }

    public void dispatchJsApiCall(String str, JSONObject jSONObject, int i) {
        C87412m.m108594g(str, "jsapiName");
        C87412m.m108594g(jSONObject, "data");
        addDartJsApiInvokeData(jSONObject, i);
        this.mJsApiMethodChannel.invokeMethod(str, json2HashMap(jSONObject));
    }
}
