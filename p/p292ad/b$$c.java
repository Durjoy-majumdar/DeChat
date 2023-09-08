package p292ad;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: ad.b$$c */
public final /* synthetic */ class b$$c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C79502b f233116d;

    public /* synthetic */ b$$c(C79502b bVar) {
        this.f233116d = bVar;
    }

    public final void run() {
        C79502b bVar = this.f233116d;
        Log.m105925i(bVar.mo109516v(), "*** handler(%s) handleWebViewDestroy", bVar.mo122122p());
        bVar.mo109501B();
    }
}
