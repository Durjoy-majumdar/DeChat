package ca3;

import com.tencent.p014mm.sdk.platformtools.Log;
import in0.C87760d;
import nc3.C34767b;

/* renamed from: ca3.n */
public final class C16908n implements C34767b.C21622a {

    /* renamed from: a */
    public final /* synthetic */ C16886m f45724a;

    public C16908n(C16886m mVar) {
        this.f45724a = mVar;
    }

    /* renamed from: a */
    public void mo17997a(boolean z) {
        Log.m105924i(this.f45724a.mo17980x(), "onPause: loss focus");
        C87760d dVar = this.f45724a.f45684n;
        if (dVar != null) {
            dVar.setMute(true);
        }
    }

    public void onResume() {
        Log.m105924i(this.f45724a.mo17980x(), "onResume: gain focus");
        C87760d dVar = this.f45724a.f45684n;
        if (dVar != null) {
            dVar.setMute(false);
        }
    }

    public void onStop() {
        Log.m105924i(this.f45724a.mo17980x(), "onStop: loss focus");
        this.f45724a.mo17982z();
    }
}
