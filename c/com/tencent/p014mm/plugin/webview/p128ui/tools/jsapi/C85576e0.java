package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import b30.C79663d;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import java.util.Map;
import p209nt.C89091f;
import t83.C13851h1;
import te3.C49713hj2;
import te3.C49717hk2;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.e0 */
public class C85576e0 implements C89091f.C89092a {

    /* renamed from: a */
    public final /* synthetic */ C13851h1 f249457a;

    /* renamed from: b */
    public final /* synthetic */ MsgHandler$$o0 f249458b;

    /* renamed from: c */
    public final /* synthetic */ int f249459c;

    /* renamed from: d */
    public final /* synthetic */ MsgHandler f249460d;

    public C85576e0(MsgHandler msgHandler, C13851h1 h1Var, MsgHandler$$o0 msgHandler$$o0, int i) {
        this.f249460d = msgHandler;
        this.f249457a = h1Var;
        this.f249458b = msgHandler$$o0;
        this.f249459c = i;
    }

    /* renamed from: a */
    public void mo114566a(int i, int i2, String str, C89091f fVar) {
        Log.m105925i("MicroMsg.MsgHandler", "onSceneEnd errType = %d, errCode = %d ,errMsg = %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        if (i != 0 || i2 != 0) {
            this.f249460d.mo7210k5(this.f249457a, "login:fail", (Map<String, Object>) null);
            ((MsgHandler$$h) this.f249458b).mo7246a();
        } else if (!(fVar instanceof C89091f)) {
        } else {
            if (this.f249459c == 2) {
                Log.m105918d("MicroMsg.MsgHandler", "press reject button");
                ((MsgHandler$$h) this.f249458b).mo7246a();
                return;
            }
            C49717hk2 j1 = ((C79663d) fVar).mo109788j1();
            C49713hj2 hj22 = j1.f134699d;
            int i3 = hj22.f134688d;
            String str2 = hj22.f134689e;
            Log.m105925i("MicroMsg.MsgHandler", "stev NetSceneJSLoginConfirm jsErrcode %d", Integer.valueOf(i3));
            if (i3 == 0) {
                String str3 = j1.f134700e;
                HashMap hashMap = new HashMap();
                hashMap.put("code", str3);
                this.f249460d.mo7210k5(this.f249457a, "login:ok", hashMap);
                ((MsgHandler$$h) this.f249458b).mo7246a();
                Log.m105919d("MicroMsg.MsgHandler", "resp data code [%s]", str3);
                return;
            }
            this.f249460d.mo7210k5(this.f249457a, "login:fail", (Map<String, Object>) null);
            ((MsgHandler$$h) this.f249458b).mo7246a();
            Log.m105921e("MicroMsg.MsgHandler", "onSceneEnd NetSceneJSLoginConfirm %s", str2);
        }
    }
}
