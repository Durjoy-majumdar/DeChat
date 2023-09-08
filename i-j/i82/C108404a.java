package i82;

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

/* renamed from: i82.a */
public final class C108404a implements Runnable {

    /* renamed from: o */
    public static int f324593o;

    /* renamed from: d */
    public final BlockingQueue<Runnable> f324594d;

    /* renamed from: e */
    public final EGLContext f324595e;

    /* renamed from: f */
    public final C32226l<C108404a, C13598b0> f324596f;

    /* renamed from: g */
    public final long f324597g;

    /* renamed from: h */
    public volatile boolean f324598h = true;

    /* renamed from: i */
    public final int f324599i;

    /* renamed from: j */
    public final String f324600j;

    /* renamed from: n */
    public C111742d.C65942b f324601n;

    public C108404a(BlockingQueue<Runnable> blockingQueue, EGLContext eGLContext, C32226l<? super C108404a, C13598b0> lVar, long j) {
        C87412m.m108594g(blockingQueue, "workerQueue");
        C87412m.m108594g(eGLContext, "sharedEGLContext");
        C87412m.m108594g(lVar, "onComplete");
        this.f324594d = blockingQueue;
        this.f324595e = eGLContext;
        this.f324596f = lVar;
        this.f324597g = j;
        int i = f324593o;
        f324593o = i + 1;
        this.f324599i = i;
        this.f324600j = "MicroMsg.MTR.GLEnvironmentRunnable-" + i;
    }

    public void run() {
        Object obj;
        StringBuilder sb;
        String str;
        C13598b0 b0Var;
        Log.m105924i(this.f324600j, "start run, shareContext " + this.f324595e);
        if (Build.VERSION.SDK_INT >= 28) {
            Process.setThreadPriority(-10);
        } else {
            Process.setThreadPriority(-1);
        }
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.m168114constructorimpl(C111742d.f334647a.mo163466j((Surface) null, (SurfaceTexture) null, 1, 1, this.f324595e));
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
            Log.m105924i(this.f324600j, "eglMakeCurrent");
        } else {
            Log.m105920e(this.f324600j, "create gl environment error");
            this.f324598h = false;
            bVar = null;
        }
        this.f324601n = bVar;
        try {
            Log.m105924i(this.f324600j, "enter loop " + this.f324599i);
            while (this.f324598h) {
                long j = this.f324597g;
                Runnable poll = j > 0 ? this.f324594d.poll(j, TimeUnit.MILLISECONDS) : this.f324594d.take();
                if (poll != null) {
                    poll.run();
                    b0Var = C13598b0.f38549a;
                } else {
                    b0Var = null;
                }
                if (b0Var == null) {
                    this.f324598h = false;
                    Log.m105928w(this.f324600j, "timeout, quit");
                }
            }
            Log.m105924i(this.f324600j, "quit loop " + this.f324599i);
            this.f324596f.invoke(this);
            str = this.f324600j;
            sb = new StringBuilder();
        } catch (InterruptedException e) {
            Log.m105928w(this.f324600j, "on interrupt " + this.f324599i + ' ' + e + ' ');
            this.f324596f.invoke(this);
            str = this.f324600j;
            sb = new StringBuilder();
        } catch (Throwable th4) {
            this.f324596f.invoke(this);
            Log.m105924i(this.f324600j, "release gl environment " + this.f324599i);
            C111742d.f334647a.mo163471q(this.f324601n);
            throw th4;
        }
        sb.append("release gl environment ");
        sb.append(this.f324599i);
        Log.m105924i(str, sb.toString());
        C111742d.f334647a.mo163471q(this.f324601n);
    }
}
