package com.tencent.p014mm.plugin.topstory.p113ui.webview;

import android.webkit.ValueCallback;
import com.tencent.p014mm.plugin.websearch.webview.WebSearchWebView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.topstory.ui.webview.a */
public class C43261a {
    /* renamed from: a */
    public static void m46837a(C19391e eVar, String str, String str2) {
        WebSearchWebView webSearchWebView;
        try {
            if (!Util.isNullOrNil(str)) {
                String nullAsNil = Util.nullAsNil(str2);
                Log.m105925i("MicroMsg.TopStory.TopStoryJsEventNotifier", "notifyJsEvent %s %s", str, nullAsNil);
                String format = String.format("javascript:window['%s'] && %s(%s)", new Object[]{str, str, nullAsNil});
                if (eVar != null && (webSearchWebView = eVar.f54731d) != null) {
                    webSearchWebView.evaluateJavascript(format, (ValueCallback<String>) null);
                }
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.TopStory.TopStoryJsEventNotifier", e, "notifyJsEvent", new Object[0]);
        }
    }
}
