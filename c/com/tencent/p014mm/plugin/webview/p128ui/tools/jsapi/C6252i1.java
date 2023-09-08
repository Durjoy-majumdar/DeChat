package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import com.tencent.p014mm.sdk.platformtools.Log;
import ie3.C76328d;
import java.util.HashMap;
import t83.C13851h1;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.i1 */
public class C6252i1 implements C76328d.C76329a {

    /* renamed from: a */
    public final /* synthetic */ C13851h1 f23035a;

    /* renamed from: b */
    public final /* synthetic */ MsgHandler f23036b;

    public C6252i1(MsgHandler msgHandler, C13851h1 h1Var) {
        this.f23036b = msgHandler;
        this.f23035a = h1Var;
    }

    /* renamed from: b */
    public void mo7300b(String str) {
        Log.m105924i("MicroMsg.MsgHandler", "secureTunnel callback fail");
        HashMap hashMap = new HashMap();
        hashMap.put("err_desc", str);
        this.f23036b.mo7210k5(this.f23035a, "secureTunnel:fail", hashMap);
    }

    public void onSuccess(String str) {
        Log.m105924i("MicroMsg.MsgHandler", "secureTunnel callback success");
        HashMap hashMap = new HashMap();
        hashMap.put("respbuf", str);
        this.f23036b.mo7210k5(this.f23035a, "secureTunnel:ok", hashMap);
    }
}
