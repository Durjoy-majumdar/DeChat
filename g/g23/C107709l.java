package g23;

import android.opengl.EGLExt;
import android.os.HandlerThread;
import android.view.Surface;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import eu3.C58834h;
import eu3.C97749e;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import w80.C111742d;

/* renamed from: g23.l */
public class C107709l extends C107715p {

    /* renamed from: e */
    public C111742d.C65942b f322273e;

    /* renamed from: f */
    public HandlerThread f322274f = C97749e.m126093a("VLogRemuxSurface_EncodeThread", -4);

    /* renamed from: g */
    public MMHandler f322275g;

    /* renamed from: h */
    public int f322276h;

    /* renamed from: i */
    public int f322277i;

    /* renamed from: g23.l$a */
    public static final class C107710a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C107709l f322278d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107710a(C107709l lVar) {
            super(0);
            this.f322278d = lVar;
        }

        public Object invoke() {
            C111742d.C65942b bVar = this.f322278d.f322273e;
            if (bVar != null) {
                Log.m105918d("MicroMsg.VLog.VLogRemuxSurface", "VLogRelease into eglEnvironment?.let");
                C111742d.f334647a.mo163471q(bVar);
            }
            this.f322278d.mo158116b();
            this.f322278d.f322274f.quitSafely();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: g23.l$b */
    public static final class C107711b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C32224a f322279d;

        public C107711b(C32224a aVar) {
            this.f322279d = aVar;
        }

        public final /* synthetic */ void run() {
            this.f322279d.invoke();
        }
    }

    public C107709l(int i, int i2) {
        super(i, i2);
        int i3 = C58834h.f168432b;
    }

    /* renamed from: a */
    public void mo158115a(Surface surface) {
        this.f322300d = surface;
        StringBuilder sb = new StringBuilder();
        sb.append("[OpenGL] init egl environment before, surface: ");
        sb.append(surface);
        sb.append(", eglEnv: ");
        C111742d.C65942b bVar = this.f322273e;
        sb.append(bVar != null ? bVar.f189593c : null);
        Log.m105924i("MicroMsg.VLog.VLogRemuxSurface", sb.toString());
        Log.m105924i("MicroMsg.VLog.VLogRemuxSurface", "initGL");
        this.f322274f.start();
        this.f322275g = new MMHandler(this.f322274f.getLooper());
        mo158117c(new C107708k(this));
    }

    /* renamed from: b */
    public void mo158116b() {
        MMHandler mMHandler = this.f322275g;
        if (mMHandler != null) {
            mMHandler.removeCallbacksAndMessages((Object) null);
        }
    }

    /* renamed from: c */
    public void mo158117c(C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "task");
        MMHandler mMHandler = this.f322275g;
        if (mMHandler != null) {
            mMHandler.post(new C107711b(aVar));
        }
    }

    /* renamed from: d */
    public void mo158118d() {
        StringBuilder sb = new StringBuilder();
        sb.append("[OpenGL] VLogRelease release egl environment, surface: ");
        sb.append(this.f322300d);
        sb.append(", eglEnv: ");
        C111742d.C65942b bVar = this.f322273e;
        sb.append(bVar != null ? bVar.f189593c : null);
        Log.printInfoStack("MicroMsg.VLog.VLogRemuxSurface", sb.toString(), new Object[0]);
        mo158117c(new C107710a(this));
    }

    /* renamed from: e */
    public void mo158119e(long j) {
        long j2 = (long) 1000;
        long j3 = j * j2 * j2;
        C111742d.C65942b bVar = this.f322273e;
        if (bVar != null) {
            EGLExt.eglPresentationTimeANDROID(bVar.f189591a, bVar.f189592b, j3);
        }
        C111742d.C111743a aVar = C111742d.f334647a;
        aVar.mo163460c("eglPresentationTimeANDROID", "MicroMsg.GLEnvironmentUtil");
        C111742d.C65942b bVar2 = this.f322273e;
        if (bVar2 != null) {
            aVar.mo163474t(bVar2.f189591a, bVar2.f189592b);
        }
    }
}
