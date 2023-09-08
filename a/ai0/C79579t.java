package ai0;

import com.tencent.p014mm.plugin.appbrand.p026ui.C84563l4;

/* renamed from: ai0.t */
public class C79579t implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f233357d;

    /* renamed from: e */
    public final /* synthetic */ String f233358e;

    /* renamed from: f */
    public final /* synthetic */ C79575q f233359f;

    public C79579t(C79575q qVar, boolean z, String str) {
        this.f233359f = qVar;
        this.f233357d = z;
        this.f233358e = str;
    }

    public void run() {
        C84563l4 d = this.f233359f.mo109686d();
        if (d != null) {
            d.mo117201k(this.f233357d, this.f233358e);
        }
    }
}
