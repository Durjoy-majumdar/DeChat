package com.tencent.p014mm.plugin.topstory.p113ui.webview;

import android.webkit.ValueCallback;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.topstory.ui.webview.e$$g */
public class e$$g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ JSONObject f249144d;

    /* renamed from: e */
    public final /* synthetic */ C19391e f249145e;

    public e$$g(C19391e eVar, JSONObject jSONObject) {
        this.f249145e = eVar;
        this.f249144d = jSONObject;
    }

    public void run() {
        this.f249145e.f54731d.evaluateJavascript(String.format("javascript:window.activity_state_change && activity_state_change(%s)", new Object[]{this.f249144d.toString()}), (ValueCallback<String>) null);
    }
}
