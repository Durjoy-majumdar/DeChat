package qr1;

import android.graphics.SurfaceTexture;
import android.os.HandlerThread;
import android.os.Looper;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: qr1.f */
public final class C110456f implements SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: d */
    public final /* synthetic */ C110461j f330309d;

    /* renamed from: qr1.f$a */
    public static final class C110457a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ SurfaceTexture f330310d;

        /* renamed from: e */
        public final /* synthetic */ C110461j f330311e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110457a(SurfaceTexture surfaceTexture, C110461j jVar) {
            super(0);
            this.f330310d = surfaceTexture;
            this.f330311e = jVar;
        }

        public Object invoke() {
            this.f330310d.updateTexImage();
            C110461j.m150367a(this.f330311e, this.f330310d.getTimestamp());
            return C13598b0.f38549a;
        }
    }

    public C110456f(C110461j jVar) {
        this.f330309d = jVar;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        Looper myLooper = Looper.myLooper();
        HandlerThread handlerThread = this.f330309d.f330319e;
        if (C87412m.m108589b(myLooper, handlerThread != null ? handlerThread.getLooper() : null)) {
            surfaceTexture.updateTexImage();
            C110461j.m150367a(this.f330309d, surfaceTexture.getTimestamp());
            return;
        }
        C110461j jVar = this.f330309d;
        jVar.mo161947b(new C110457a(surfaceTexture, jVar));
    }
}
