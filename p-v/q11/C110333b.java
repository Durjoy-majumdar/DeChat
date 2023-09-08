package q11;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import com.tencent.p014mm.sdk.platformtools.Log;
import kotlin.Result;
import kotlin.ResultKt;
import rx3.C36570n;
import w80.C111742d;

/* renamed from: q11.b */
public final class C110333b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C110336f f330055d;

    /* renamed from: e */
    public final /* synthetic */ EGLContext f330056e;

    public C110333b(C110336f fVar, EGLContext eGLContext) {
        this.f330055d = fVar;
        this.f330056e = eGLContext;
    }

    public final void run() {
        Object obj;
        C110336f fVar = this.f330055d;
        EGLContext eGLContext = this.f330056e;
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.m168114constructorimpl(C111742d.f334647a.mo163466j((Surface) null, (SurfaceTexture) null, 1, 1, eGLContext));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.m168114constructorimpl(ResultKt.createFailure(th));
        }
        C111742d.C65942b bVar = null;
        if (Result.m168120isFailureimpl(obj)) {
            obj = null;
        }
        C111742d.C65942b bVar2 = (C111742d.C65942b) obj;
        if (bVar2 != null) {
            C110336f fVar2 = this.f330055d;
            EGLDisplay eGLDisplay = bVar2.f189591a;
            EGLSurface eGLSurface = bVar2.f189592b;
            EGLSurface eGLSurface2 = eGLSurface == null ? EGL14.EGL_NO_SURFACE : eGLSurface;
            if (eGLSurface == null) {
                eGLSurface = EGL14.EGL_NO_SURFACE;
            }
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface2, eGLSurface, bVar2.f189593c);
            Log.m105924i(fVar2.f330060a, "eglMakeCurrent");
            bVar = bVar2;
        } else {
            C110336f fVar3 = this.f330055d;
            ((Handler) ((C36570n) fVar3.f330063d).getValue()).post(new C110334c(fVar3));
            ((HandlerThread) ((C36570n) fVar3.f330062c).getValue()).quitSafely();
            Log.m105920e(fVar3.f330060a, "create gl environment error");
        }
        fVar.f330064e = bVar;
        this.f330055d.f330061b = true;
    }
}
