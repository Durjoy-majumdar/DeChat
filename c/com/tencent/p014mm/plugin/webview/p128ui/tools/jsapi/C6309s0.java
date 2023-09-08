package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.os.Bundle;
import com.tencent.p014mm.autogen.events.WebViewCloseWindowEvent;
import java.util.Map;
import t83.C13851h1;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.s0 */
public class C6309s0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Bundle f23168d;

    /* renamed from: e */
    public final /* synthetic */ Map f23169e;

    /* renamed from: f */
    public final /* synthetic */ C13851h1 f23170f;

    /* renamed from: g */
    public final /* synthetic */ MsgHandler f23171g;

    public C6309s0(MsgHandler msgHandler, Bundle bundle, Map map, C13851h1 h1Var) {
        this.f23171g = msgHandler;
        this.f23168d = bundle;
        this.f23169e = map;
        this.f23170f = h1Var;
    }

    public void run() {
        try {
            this.f23171g.f22715x.Ef0();
            this.f23171g.f22715x.mo7036d(this.f23168d);
            new WebViewCloseWindowEvent().publish();
            this.f23169e.put("err_code", 0);
            this.f23169e.put("err_msg", "ok");
            this.f23171g.mo7210k5(this.f23170f, "close window and next:ok", this.f23169e);
        } catch (Exception e) {
            this.f23171g.mo7146C5(e, this.f23169e);
        }
    }
}
