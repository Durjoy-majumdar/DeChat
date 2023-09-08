package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Map;
import m53.C10762h;
import t83.C13851h1;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.j1 */
public class C6257j1 implements C10762h<Void> {

    /* renamed from: a */
    public final /* synthetic */ C13851h1 f23050a;

    /* renamed from: b */
    public final /* synthetic */ MsgHandler f23051b;

    public C6257j1(MsgHandler msgHandler, C13851h1 h1Var) {
        this.f23051b = msgHandler;
        this.f23050a = h1Var;
    }

    /* renamed from: a */
    public void mo605a(int i, int i2, String str) {
        Log.m105925i("MicroMsg.MsgHandler", "[WeCoin] showRechargeFoodsDialog onFailed,errorType:%s,errorCode:%s, msg:%s", Integer.valueOf(i), Integer.valueOf(i2), str);
        if (i2 == -3) {
            MsgHandler msgHandler = this.f23051b;
            C13851h1 h1Var = this.f23050a;
            msgHandler.mo7210k5(h1Var, this.f23050a.f38996i + ":cancel", (Map<String, Object>) null);
            return;
        }
        MsgHandler msgHandler2 = this.f23051b;
        C13851h1 h1Var2 = this.f23050a;
        msgHandler2.mo7210k5(h1Var2, this.f23050a.f38996i + ":fail", (Map<String, Object>) null);
    }

    public void onSuccess(Object obj) {
        Log.m105925i("MicroMsg.MsgHandler", "[WeCoin] showRechargeFoodsDialog onSuccess,data:%s", (Void) obj);
        MsgHandler msgHandler = this.f23051b;
        C13851h1 h1Var = this.f23050a;
        msgHandler.mo7210k5(h1Var, this.f23050a.f38996i + ":ok", (Map<String, Object>) null);
    }
}
