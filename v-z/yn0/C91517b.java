package yn0;

import com.tencent.p014mm.plugin.appbrand.jsapi.webview.C83107f;
import gy3.C87412m;

/* renamed from: yn0.b */
public final class C91517b implements C83107f {

    /* renamed from: a */
    public final C91521g f262325a;

    public C91517b(C91521g gVar) {
        C87412m.m108594g(gVar, "view");
        this.f262325a = gVar;
    }

    /* renamed from: a */
    public void mo74055a(String str) {
    }

    public int getBinderID() {
        return hashCode();
    }

    /* renamed from: t */
    public void mo74060t() {
    }

    /* renamed from: u */
    public void mo74061u(String str) {
    }

    /* renamed from: v */
    public void mo74062v(String str) {
        this.f262325a.getJsBridgeComponentDelegate().mo109652f("onMiniProgramMessage", str, 0);
    }
}
