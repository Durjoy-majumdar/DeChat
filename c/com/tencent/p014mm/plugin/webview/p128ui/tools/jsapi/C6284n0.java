package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32228q;
import java.util.HashMap;
import rx3.C13598b0;
import t83.C13851h1;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.n0 */
public class C6284n0 implements C32228q<String, String, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f23104d;

    /* renamed from: e */
    public final /* synthetic */ C13851h1 f23105e;

    /* renamed from: f */
    public final /* synthetic */ MsgHandler f23106f;

    public C6284n0(MsgHandler msgHandler, String str, C13851h1 h1Var) {
        this.f23106f = msgHandler;
        this.f23104d = str;
        this.f23105e = h1Var;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        String str = (String) obj;
        String str2 = (String) obj2;
        Integer num = (Integer) obj3;
        Log.m105925i("MicroMsg.MsgHandler", "doGetFinderLivePreviewUrl errCode:%s", num);
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("ret", num);
            hashMap.put("url", str);
            hashMap.put("requestId", this.f23104d);
        } catch (Exception e) {
            Log.m105928w("MicroMsg.MsgHandler", "doGetFinderLivePreviewUrl" + e.getMessage());
        }
        this.f23106f.mo7210k5(this.f23105e, "onGetFinderLivePreviewUrl:ok", hashMap);
        return null;
    }
}
