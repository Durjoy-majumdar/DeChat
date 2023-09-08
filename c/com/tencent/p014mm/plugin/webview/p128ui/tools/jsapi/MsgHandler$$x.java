package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import java.util.Map;
import p232rw.C77575r;
import t83.C13851h1;
import u73.C101980n;
import u73.C101983r;
import wx3.C15601d;
import wx3.C66212f;
import wx3.C66217g;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler$$x */
public class MsgHandler$$x implements C15601d<C77575r> {

    /* renamed from: d */
    public final /* synthetic */ C13851h1 f22869d;

    /* renamed from: e */
    public final /* synthetic */ int f22870e;

    /* renamed from: f */
    public final /* synthetic */ MsgHandler f22871f;

    public MsgHandler$$x(MsgHandler msgHandler, C13851h1 h1Var, int i) {
        this.f22871f = msgHandler;
        this.f22869d = h1Var;
        this.f22870e = i;
    }

    public C66212f getContext() {
        return C66217g.f190253d;
    }

    public void resumeWith(Object obj) {
        if (obj instanceof C77575r) {
            C77575r rVar = (C77575r) obj;
            if (rVar.f226147b == -1 && rVar.f226148c == 0) {
                String str = rVar.f226149d.f226143b;
                if (str == null || str.equals("")) {
                    this.f22871f.mo7210k5(this.f22869d, "doOpenCamera:fail", (Map<String, Object>) null);
                    return;
                }
                try {
                    C101983r rVar2 = new C101983r();
                    rVar2.f300283b = this.f22871f.f22697d;
                    rVar2.f300288g = str;
                    rVar2.f300290i = this.f22870e;
                    rVar2.f300285d = 17;
                    ((C101980n) C86312j.m106911c(C101980n.class)).mo134683D6(rVar2);
                    this.f22871f.mo7210k5(this.f22869d, "doOpenCamera:success", (Map<String, Object>) null);
                    return;
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.MsgHandler", "doOpenCamera fail, ex = ", e);
                    this.f22871f.mo7210k5(this.f22869d, "doOpenCamera:fail", (Map<String, Object>) null);
                }
            }
        }
        Log.m105920e("MicroMsg.MsgHandler", "doOpenCamera fail 2");
        this.f22871f.mo7210k5(this.f22869d, "doOpenCamera:fail", (Map<String, Object>) null);
    }
}
