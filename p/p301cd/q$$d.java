package p301cd;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: cd.q$$d */
public final /* synthetic */ class q$$d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C80005q f234354d;

    public /* synthetic */ q$$d(C80005q qVar) {
        this.f234354d = qVar;
    }

    public final void run() {
        C80005q qVar = this.f234354d;
        Log.m105925i(qVar.mo110227w(), "*** handler(%s) handleWebViewForeground", qVar.mo122122p());
        qVar.f234320J = false;
        C79999m mVar = qVar.f234327i;
        if (mVar != null) {
            mVar.mo33714b();
        }
        qVar.f234314D.enable();
    }
}
