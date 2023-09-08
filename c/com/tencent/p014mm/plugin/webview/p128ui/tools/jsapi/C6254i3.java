package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import com.tencent.p014mm.plugin.webview.model.C6065x;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import java.util.HashMap;
import java.util.Map;
import ob0.C11385n;
import ob0.C117747y;
import t83.C13851h1;
import te3.C52309zu1;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.i3 */
public class C6254i3 implements C11385n {

    /* renamed from: d */
    public final /* synthetic */ C13851h1 f23039d;

    /* renamed from: e */
    public final /* synthetic */ MsgHandler f23040e;

    public C6254i3(MsgHandler msgHandler, C13851h1 h1Var) {
        this.f23040e = msgHandler;
        this.f23039d = h1Var;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (i == 0 && i2 == 0) {
            HashMap hashMap = new HashMap();
            hashMap.put("ticket", ((C52309zu1) ((C6065x) yVar).f22364e.f127056b.f127083a).f146228d);
            this.f23040e.mo7210k5(this.f23039d, "get_wechat_verify_ticket:ok ticket", hashMap);
        } else {
            Log.m105920e("MicroMsg.MsgHandler", "doGetWechatVerifyTicket, errType = " + i + ", errCode = " + i2);
            this.f23040e.mo7210k5(this.f23039d, "get_wechat_verify_ticket:fail ticket", (Map<String, Object>) null);
        }
        C86709a0.m107524d().mo123470p(1097, this);
    }
}
