package p301cd;

import com.tencent.p014mm.plugin.appbrand.jsapi.xwebplugin.live.C83127a;
import com.tencent.p014mm.sdk.platformtools.Log;
import lo0.C88603c;
import p954dd.C86224a;

/* renamed from: cd.q$$n */
public final /* synthetic */ class q$$n implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C80005q f234370d;

    /* renamed from: e */
    public final /* synthetic */ int f234371e;

    public /* synthetic */ q$$n(C80005q qVar, int i) {
        this.f234370d = qVar;
        this.f234371e = i;
    }

    public final void run() {
        boolean z;
        C79999m mVar;
        C80005q qVar = this.f234370d;
        int i = this.f234371e;
        Log.m105925i(qVar.mo110227w(), "*** handler(%s) handleWebViewBackground, type:%s", qVar.mo122122p(), Integer.valueOf(i));
        qVar.f234320J = true;
        C86224a aVar = qVar.f234330o;
        if (aVar != null) {
            C83127a d = ((C88603c) aVar).mo123047d(qVar.f234331p);
            if (d != null) {
                z = d.mo115367k(qVar, i);
            } else {
                Log.m105918d("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "shouldInterceptEnterBackground, no state manager");
                z = false;
            }
            if (!z && (mVar = qVar.f234327i) != null && i == 4) {
                ((C79998d0) mVar).mo21072c();
            }
            if (qVar.f234327i != null) {
                if (qVar.f234324N.mo125355a(qVar.f234331p)) {
                    Log.m105924i(qVar.mo110227w(), "handleWebViewBackground runnable, i am pip player, do not pause");
                } else if (i == 3) {
                    Log.m105924i(qVar.mo110227w(), "handleWebViewBackgroundInternal, type back");
                    ((C79998d0) qVar.f234327i).mo33715d(true);
                } else {
                    Log.m105924i(qVar.mo110227w(), "handleWebViewBackgroundInternal, type others");
                    ((C79998d0) qVar.f234327i).mo33715d(false);
                }
            }
        }
        qVar.f234314D.disable();
    }
}
