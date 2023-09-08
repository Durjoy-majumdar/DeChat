package q11;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Build;
import android.os.Process;
import android.view.Surface;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Result;
import kotlin.ResultKt;
import rx3.C13598b0;
import w80.C111742d;

/* renamed from: q11.a */
public final class C110332a implements Runnable {

    /* renamed from: o */
    public static int f330046o;

    /* renamed from: d */
    public final BlockingQueue<Runnable> f330047d;

    /* renamed from: e */
    public final EGLContext f330048e;

    /* renamed from: f */
    public final C32226l<C110332a, C13598b0> f330049f;

    /* renamed from: g */
    public final long f330050g;

    /* renamed from: h */
    public volatile boolean f330051h = true;

    /* renamed from: i */
    public final int f330052i;

    /* renamed from: j */
    public final String f330053j;

    /* renamed from: n */
    public C111742d.C65942b f330054n;

    public C110332a(BlockingQueue<Runnable> blockingQueue, EGLContext eGLContext, C32226l<? super C110332a, C13598b0> lVar, long j) {
        C87412m.m108594g(blockingQueue, "workerQueue");
        C87412m.m108594g(eGLContext, "sharedEGLContext");
        C87412m.m108594g(lVar, "onComplete");
        this.f330047d = blockingQueue;
        this.f330048e = eGLContext;
        this.f330049f = lVar;
        this.f330050g = j;
        int i = f330046o;
        f330046o = i + 1;
        this.f330052i = i;
        this.f330053j = "MicroMsg.MTR.GLEnvironmentRunnable-" + i;
    }

    public void run() {
        Object obj;
        StringBuilder sb;
        String str;
        C13598b0 b0Var;
        Log.m105924i(this.f330053j, "start run, shareContext " + this.f330048e);
        if (Build.VERSION.SDK_INT >= 28) {
            Process.setThreadPriority(-10);
        } else {
            Process.setThreadPriority(-1);
        }
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.m168114constructorimpl(C111742d.f334647a.mo163466j((Surface) null, (SurfaceTexture) null, 1, 1, this.f330048e));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.m168114constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m168120isFailureimpl(obj)) {
            obj = null;
        }
        C111742d.C65942b bVar = (C111742d.C65942b) obj;
        if (bVar != null) {
            EGLDisplay eGLDisplay = bVar.f189591a;
            EGLSurface eGLSurface = bVar.f189592b;
            EGLSurface eGLSurface2 = eGLSurface == null ? EGL14.EGL_NO_SURFACE : eGLSurface;
            if (eGLSurface == null) {
                eGLSurface = EGL14.EGL_NO_SURFACE;
            }
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface2, eGLSurface, bVar.f189593c);
            Log.m105924i(this.f330053j, "eglMakeCurrent");
        } else {
            Log.m105920e(this.f330053j, "create gl environment error");
            this.f330051h = false;
            bVar = null;
        }
        this.f330054n = bVar;
        try {
            Log.m105924i(this.f330053j, "enter loop " + this.f330052i);
            while (this.f330051h) {
                long j = this.f330050g;
                Runnable poll = j > 0 ? this.f330047d.poll(j, TimeUnit.MILLISECONDS) : this.f330047d.take();
                if (poll != null) {
                    poll.run();
                    b0Var = C13598b0.f38549a;
                } else {
                    b0Var = null;
                }
                if (b0Var == null) {
                    this.f330051h = false;
                    Log.m105928w(this.f330053j, "timeout, quit");
                }
            }
            Log.m105924i(this.f330053j, "quit loop " + this.f330052i);
            this.f330049f.invoke(this);
            str = this.f330053j;
            sb = new StringBuilder();
        } catch (InterruptedException e) {
            Log.m105928w(this.f330053j, "on interrupt " + this.f330052i + ' ' + e + ' ');
            this.f330049f.invoke(this);
            str = this.f330053j;
            sb = new StringBuilder();
        } catch (Throwable th4) {
            this.f330049f.invoke(this);
            Log.m105924i(this.f330053j, "release gl environment " + this.f330052i);
            C111742d.f334647a.mo163471q(this.f330054n);
            throw th4;
        }
        sb.append("release gl environment ");
        sb.append(this.f330052i);
        Log.m105924i(str, sb.toString());
        C111742d.f334647a.mo163471q(this.f330054n);
    }
}
