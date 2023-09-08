package p301cd;

import android.view.Surface;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: cd.q$$h */
public final /* synthetic */ class q$$h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C80005q f234360d;

    /* renamed from: e */
    public final /* synthetic */ Surface f234361e;

    public /* synthetic */ q$$h(C80005q qVar, Surface surface) {
        this.f234360d = qVar;
        this.f234361e = surface;
    }

    public final void run() {
        C80005q qVar = this.f234360d;
        Surface surface = this.f234361e;
        Log.m105925i(qVar.mo110227w(), "*** handler(%s) handlePluginReady", qVar.mo122122p());
        qVar.f234326h = surface;
        C79999m mVar = qVar.f234327i;
        if (mVar != null) {
            mVar.setSurface(surface);
            qVar.f234325g.mo120982w(surface);
            qVar.mo110221q();
        }
    }
}
