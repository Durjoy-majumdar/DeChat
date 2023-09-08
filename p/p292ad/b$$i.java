package p292ad;

import android.view.Surface;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: ad.b$$i */
public final /* synthetic */ class b$$i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C79502b f233123d;

    /* renamed from: e */
    public final /* synthetic */ Surface f233124e;

    public /* synthetic */ b$$i(C79502b bVar, Surface surface) {
        this.f233123d = bVar;
        this.f233124e = surface;
    }

    public final void run() {
        C79502b bVar = this.f233123d;
        Surface surface = this.f233124e;
        Log.m105925i(bVar.mo109516v(), "*** handler(%s) handlePluginReady", bVar.mo122122p());
        bVar.f233096g = surface;
        if (bVar.f233097h != null) {
            if (!bVar.f233091R.get()) {
                bVar.f233097h.setSurface(bVar.f233096g);
            } else {
                Log.m105924i(bVar.mo109516v(), "setSurface, JustPlayAudio");
            }
            bVar.mo109512r();
        }
    }
}
