package g03;

import android.graphics.SurfaceTexture;
import fy3.C32226l;
import rx3.C13598b0;

/* renamed from: g03.s */
public final class C107690s implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C32226l<SurfaceTexture, C13598b0> f322197d;

    /* renamed from: e */
    public final /* synthetic */ C107681p f322198e;

    public C107690s(C32226l<? super SurfaceTexture, C13598b0> lVar, C107681p pVar) {
        this.f322197d = lVar;
        this.f322198e = pVar;
    }

    public final void run() {
        C32226l<SurfaceTexture, C13598b0> lVar = this.f322197d;
        if (lVar != null) {
            lVar.invoke(this.f322198e.f322171o);
        }
    }
}
