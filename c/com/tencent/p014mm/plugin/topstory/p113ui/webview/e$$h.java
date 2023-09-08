package com.tencent.p014mm.plugin.topstory.p113ui.webview;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import java.util.Map;
import t83.C13848e;

/* renamed from: com.tencent.mm.plugin.topstory.ui.webview.e$$h */
public class e$$h implements C13848e {

    /* renamed from: a */
    public final /* synthetic */ C19391e f249146a;

    public e$$h(C19391e eVar) {
        this.f249146a = eVar;
    }

    /* renamed from: a */
    public void mo10774a(String str, String str2, Map<String, Object> map) {
        Log.m105925i("MicroMsg.TopStory.TopStoryWebViewJSApi", "doCallBack, callbackId:%s, ret:%s, retValue:%s", str, str2, map);
        HashMap hashMap = new HashMap();
        hashMap.put("err_msg", str2);
        if (map != null) {
            hashMap.putAll(map);
        }
        this.f249146a.mo25053k(str, hashMap);
    }
}
