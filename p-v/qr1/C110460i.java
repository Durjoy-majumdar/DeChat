package qr1;

import android.os.HandlerThread;
import android.view.Surface;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import p80.C110194c;
import rx3.C13598b0;
import w80.C111742d;

/* renamed from: qr1.i */
public final class C110460i extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C110461j f330314d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110460i(C110461j jVar) {
        super(0);
        this.f330314d = jVar;
    }

    public Object invoke() {
        Log.m105924i(this.f330314d.f330317c, "release");
        C110194c cVar = this.f330314d.f330324j;
        if (cVar != null) {
            cVar.close();
        }
        Surface surface = this.f330314d.f330322h;
        if (surface != null) {
            surface.release();
        }
        this.f330314d.f330325k.mo154914b();
        C110194c cVar2 = this.f330314d.f330327m;
        if (cVar2 != null) {
            cVar2.close();
        }
        C111742d.C65942b bVar = this.f330314d.f330318d;
        if (bVar != null) {
            C111742d.f334647a.mo163471q(bVar);
        }
        HandlerThread handlerThread = this.f330314d.f330319e;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        C110461j jVar = this.f330314d;
        jVar.f330319e = null;
        jVar.f330320f = null;
        return C13598b0.f38549a;
    }
}
