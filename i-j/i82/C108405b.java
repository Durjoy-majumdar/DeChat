package i82;

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

/* renamed from: i82.b */
public final class C108405b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C108408f f324602d;

    /* renamed from: e */
    public final /* synthetic */ EGLContext f324603e;

    public C108405b(C108408f fVar, EGLContext eGLContext) {
        this.f324602d = fVar;
        this.f324603e = eGLContext;
    }

    public final void run() {
        Object obj;
        C108408f fVar = this.f324602d;
        EGLContext eGLContext = this.f324603e;
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
            C108408f fVar2 = this.f324602d;
            EGLDisplay eGLDisplay = bVar2.f189591a;
            EGLSurface eGLSurface = bVar2.f189592b;
            EGLSurface eGLSurface2 = eGLSurface == null ? EGL14.EGL_NO_SURFACE : eGLSurface;
            if (eGLSurface == null) {
                eGLSurface = EGL14.EGL_NO_SURFACE;
            }
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface2, eGLSurface, bVar2.f189593c);
            Log.m105924i(fVar2.f324607a, "eglMakeCurrent");
            bVar = bVar2;
        } else {
            C108408f fVar3 = this.f324602d;
            ((Handler) ((C36570n) fVar3.f324610d).getValue()).post(new C108406c(fVar3));
            ((HandlerThread) ((C36570n) fVar3.f324609c).getValue()).quitSafely();
            Log.m105920e(fVar3.f324607a, "create gl environment error");
        }
        fVar.f324611e = bVar;
        this.f324602d.f324608b = true;
    }
}
