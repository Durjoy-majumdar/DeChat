package l82;

import a14.C53896h0;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;
import android.os.HandlerThread;
import c92.C104328f;
import com.tencent.p014mm.sdk.platformtools.Log;
import eu3.C58834h;
import eu3.C97749e;
import fy3.C32226l;
import gy3.C87411a;
import gy3.C87412m;
import i82.C108404a;
import i82.C108406c;
import i82.C108408f;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import l82.C109284b;
import m82.C109548c;
import rx3.C13598b0;
import rx3.C36570n;
import w80.C111742d;
import wx3.C66212f;

/* renamed from: l82.a */
public final class C109278a extends C53896h0 implements Closeable {

    /* renamed from: e */
    public C108408f f327172e;

    /* renamed from: f */
    public Thread f327173f;

    /* renamed from: g */
    public final LinkedBlockingQueue<Runnable> f327174g = new LinkedBlockingQueue<>();

    /* renamed from: h */
    public final LinkedBlockingDeque<Runnable> f327175h = new LinkedBlockingDeque<>();

    /* renamed from: i */
    public final ArrayList<C108404a> f327176i = new ArrayList<>();

    /* renamed from: l82.a$a */
    public static final class C109279a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C109284b.C109285a f327177d;

        /* renamed from: e */
        public final /* synthetic */ C109278a f327178e;

        /* renamed from: f */
        public final /* synthetic */ Runnable f327179f;

        public C109279a(C109284b.C109285a aVar, C109278a aVar2, Runnable runnable) {
            this.f327177d = aVar;
            this.f327178e = aVar2;
            this.f327179f = runnable;
        }

        public final void run() {
            C111742d.C65942b bVar;
            C111742d.C65942b bVar2;
            EGLSurface eGLSurface;
            if (!((C109284b.C109285a.C109288c) this.f327177d).f327188a.f327922e) {
                Log.m105924i("MicroMsg.MTR.GLDispatcher", "surface not inUse " + ((C109284b.C109285a.C109288c) this.f327177d).f327188a);
                return;
            }
            C109278a aVar = this.f327178e;
            C108408f fVar = aVar.f327172e;
            C109548c.C109549a aVar2 = ((C109284b.C109285a.C109288c) this.f327177d).f327188a;
            aVar.getClass();
            if (!(fVar == null || (bVar2 = fVar.f324611e) == null)) {
                if (aVar2.f327922e && ((eGLSurface = aVar2.f327920c) == null || C87412m.m108589b(eGLSurface, EGL14.EGL_NO_SURFACE))) {
                    C109548c.C109550b a = aVar2.mo160777a();
                    Object obj = null;
                    if ((a != null ? a.getRenderTarget() : null) != null) {
                        Log.m105924i("MicroMsg.MTR.GLDispatcher", "eglCreateSurface for " + aVar2);
                        C109548c.C109550b a2 = aVar2.mo160777a();
                        if (a2 != null) {
                            obj = a2.getRenderTarget();
                        }
                        if (obj != null) {
                            aVar2.f327920c = C111742d.f334647a.mo163465h(bVar2.f189591a, obj);
                            EGLDisplay eGLDisplay = bVar2.f189591a;
                            C87412m.m108594g(eGLDisplay, "<set-?>");
                            aVar2.f327921d = eGLDisplay;
                        }
                    }
                }
                EGLDisplay eGLDisplay2 = bVar2.f189591a;
                EGLSurface eGLSurface2 = aVar2.f327920c;
                EGLSurface eGLSurface3 = eGLSurface2 == null ? EGL14.EGL_NO_SURFACE : eGLSurface2;
                if (eGLSurface2 == null) {
                    eGLSurface2 = EGL14.EGL_NO_SURFACE;
                }
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface3, eGLSurface2, bVar2.f189593c);
            }
            this.f327179f.run();
            C109278a aVar3 = this.f327178e;
            C108408f fVar2 = aVar3.f327172e;
            C109548c.C109549a aVar4 = ((C109284b.C109285a.C109288c) this.f327177d).f327188a;
            aVar3.getClass();
            if (!(fVar2 == null || (bVar = fVar2.f324611e) == null)) {
                C111742d.C111743a aVar5 = C111742d.f334647a;
                EGLDisplay eGLDisplay3 = bVar.f189591a;
                EGLSurface eGLSurface4 = aVar4.f327920c;
                if (eGLSurface4 == null) {
                    eGLSurface4 = EGL14.EGL_NO_SURFACE;
                }
                aVar5.mo163474t(eGLDisplay3, eGLSurface4);
            }
            C109548c.C109550b a3 = ((C109284b.C109285a.C109288c) this.f327177d).f327188a.mo160777a();
            if (a3 != null) {
                a3.mo150849b();
            }
        }
    }

    /* renamed from: l82.a$b */
    public static final class C109280b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C109278a f327180d;

        /* renamed from: l82.a$b$a */
        public /* synthetic */ class C109281a extends C87411a implements C32226l<C108404a, C13598b0> {
            public C109281a(Object obj) {
                super(1, obj, ArrayList.class, "remove", "remove(Ljava/lang/Object;)Z", 8);
            }

            public Object invoke(Object obj) {
                C108404a aVar = (C108404a) obj;
                C87412m.m108594g(aVar, "p0");
                ((ArrayList) this.f253295d).remove(aVar);
                return C13598b0.f38549a;
            }
        }

        public C109280b(C109278a aVar) {
            this.f327180d = aVar;
        }

        public final void run() {
            C111742d.C65942b bVar;
            EGLContext eGLContext;
            C109278a aVar = this.f327180d;
            if (aVar.f327173f == null) {
                C108408f fVar = aVar.f327172e;
                if (fVar == null || (bVar = fVar.f324611e) == null || (eGLContext = bVar.f189593c) == null) {
                    Log.m105920e("MicroMsg.MTR.GLDispatcher", "main gl context is null");
                    return;
                }
                C108404a aVar2 = new C108404a(aVar.f327175h, eGLContext, new C109281a(aVar.f327176i), -1);
                C109278a aVar3 = this.f327180d;
                aVar3.f327173f = aVar3.mo160512i0(aVar2);
            }
        }
    }

    /* renamed from: l82.a$c */
    public /* synthetic */ class C109282c extends C87411a implements C32226l<C108404a, C13598b0> {
        public C109282c(Object obj) {
            super(1, obj, ArrayList.class, "remove", "remove(Ljava/lang/Object;)Z", 8);
        }

        public Object invoke(Object obj) {
            C108404a aVar = (C108404a) obj;
            C87412m.m108594g(aVar, "p0");
            ((ArrayList) this.f253295d).remove(aVar);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: l82.a$d */
    public static final class C109283d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C108404a f327181d;

        /* renamed from: e */
        public final /* synthetic */ HandlerThread f327182e;

        public C109283d(C108404a aVar, HandlerThread handlerThread) {
            this.f327181d = aVar;
            this.f327182e = handlerThread;
        }

        public final void run() {
            Log.m105924i("MicroMsg.MTR.GLDispatcher", "runGlEnvironmentRunnable " + this.f327181d.f324600j + " enter loop");
            this.f327181d.run();
            this.f327182e.quitSafely();
            Log.m105924i("MicroMsg.MTR.GLDispatcher", "runGlEnvironmentRunnable " + this.f327181d.f324600j + " quit loop");
        }
    }

    /* renamed from: S */
    public void mo74497S(C66212f fVar, Runnable runnable) {
        C111742d.C65942b bVar;
        EGLContext eGLContext;
        C87412m.m108594g(fVar, "context");
        C87412m.m108594g(runnable, "block");
        C109284b bVar2 = (C109284b) fVar.get(C109284b.f327183e);
        C109284b.C109285a aVar = bVar2 != null ? bVar2.f327186d : null;
        if (aVar instanceof C109284b.C109285a.C109286a) {
            mo160513j0(this.f327172e, runnable);
        } else if (aVar instanceof C109284b.C109285a.C109288c) {
            mo160513j0(this.f327172e, new C109279a(aVar, this, runnable));
        } else if (aVar instanceof C109284b.C109285a.C109289d) {
            if (this.f327173f == null) {
                mo160513j0(this.f327172e, new C109280b(this));
            }
            this.f327175h.offer(runnable);
        } else if (aVar instanceof C109284b.C109285a.C109287b) {
            mo160513j0(this.f327172e, runnable);
        } else {
            if (this.f327176i.isEmpty() || (this.f327174g.size() > this.f327176i.size() && this.f327176i.size() < 5)) {
                C108408f fVar2 = this.f327172e;
                if (fVar2 == null || (bVar = fVar2.f324611e) == null || (eGLContext = bVar.f189593c) == null) {
                    Log.m105920e("MicroMsg.MTR.GLDispatcher", "main gl context is null");
                    return;
                }
                C108404a aVar2 = new C108404a(this.f327174g, eGLContext, new C109282c(this.f327176i), 10000);
                this.f327176i.add(aVar2);
                C104328f fVar3 = C104328f.f308805a;
                C104328f.f308823s = Math.max(C104328f.f308823s, this.f327176i.size());
                mo160512i0(aVar2);
            }
            this.f327174g.offer(runnable);
        }
    }

    public void close() {
        Log.m105924i("MicroMsg.MTR.GLDispatcher", "close");
        Iterator<C108404a> it = this.f327176i.iterator();
        while (it.hasNext()) {
            it.next().f324598h = false;
        }
        this.f327174g.clear();
        this.f327175h.clear();
        Thread thread = this.f327173f;
        if (thread != null) {
            thread.interrupt();
        }
        this.f327173f = null;
        C108408f fVar = this.f327172e;
        if (fVar != null) {
            ((Handler) ((C36570n) fVar.f324610d).getValue()).post(new C108406c(fVar));
            ((HandlerThread) ((C36570n) fVar.f324609c).getValue()).quitSafely();
        }
        this.f327172e = null;
    }

    /* renamed from: i0 */
    public final Thread mo160512i0(C108404a aVar) {
        Log.m105924i("MicroMsg.MTR.GLDispatcher", "runGlEnvironmentRunnable " + aVar.f324600j);
        String str = aVar.f324600j;
        int i = C58834h.f168432b;
        HandlerThread a = C97749e.m126093a(str, -4);
        a.start();
        new Handler(a.getLooper()).post(new C109283d(aVar, a));
        return a;
    }

    /* renamed from: j0 */
    public final void mo160513j0(C108408f fVar, Runnable runnable) {
        if (fVar == null || C87412m.m108589b((HandlerThread) ((C36570n) fVar.f324609c).getValue(), Thread.currentThread())) {
            runnable.run();
            return;
        }
        Handler handler = fVar.f324608b ? (Handler) ((C36570n) fVar.f324610d).getValue() : null;
        if (handler != null) {
            handler.post(runnable);
        }
    }
}
