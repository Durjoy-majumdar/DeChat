package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import java.util.HashMap;
import rx3.C13598b0;
import s43.C13621b;
import t83.C13851h1;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.k1 */
public class C6263k1 implements C32226l<C13621b, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C13851h1 f23060d;

    /* renamed from: e */
    public final /* synthetic */ MsgHandler f23061e;

    public C6263k1(MsgHandler msgHandler, C13851h1 h1Var) {
        this.f23061e = msgHandler;
        this.f23060d = h1Var;
    }

    public Object invoke(Object obj) {
        C13621b bVar = (C13621b) obj;
        Log.m105925i("MicroMsg.MsgHandler", "[WeCoin] consumeWeCoin onSuccess, data:%s", Long.valueOf(bVar.f38589a));
        HashMap hashMap = new HashMap();
        hashMap.put("balance", Long.valueOf(bVar.f38589a));
        MsgHandler msgHandler = this.f23061e;
        C13851h1 h1Var = this.f23060d;
        msgHandler.mo7210k5(h1Var, this.f23060d.f38996i + ":ok", hashMap);
        this.f23061e.getClass();
        return null;
    }
}
