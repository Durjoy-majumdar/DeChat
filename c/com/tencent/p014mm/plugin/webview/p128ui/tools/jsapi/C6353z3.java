package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.content.Intent;
import com.tencent.p014mm.p136ui.MMFragmentActivity$$f;
import com.tencent.p014mm.plugin.lite.LiteAppCenter;
import eb0.C75592q0;
import rx3.C13604l;
import sx3.C90363p0;
import t83.C13851h1;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.z3 */
public final class C6353z3 implements MMFragmentActivity$$f {

    /* renamed from: a */
    public final /* synthetic */ C13851h1 f23264a;

    /* renamed from: b */
    public final /* synthetic */ C6203a4 f23265b;

    public C6353z3(C13851h1 h1Var, C6203a4 a4Var) {
        this.f23264a = h1Var;
        this.f23265b = a4Var;
    }

    public void mmOnActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1) {
            Object obj = this.f23264a.f38983a.get("liteAppUuid");
            String str = obj instanceof String ? (String) obj : null;
            if (str == null) {
                str = "0";
            }
            LiteAppCenter.publishGlobalEventToTopPage(Long.parseLong(str), "onBindMobileChange", C6203a4.m6494a(this.f23265b, new C13604l("bindMobile", C75592q0.m90773c())));
            this.f23265b.f22901a.mo7210k5(this.f23264a, "ok", C90363p0.m113143b(new C13604l("err_msg", "ok")));
            return;
        }
        this.f23265b.f22901a.mo7210k5(this.f23264a, "cancel", C90363p0.m113143b(new C13604l("err_msg", "cancel")));
    }
}
