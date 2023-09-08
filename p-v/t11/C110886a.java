package t11;

import a14.C53896h0;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;
import android.os.HandlerThread;
import com.tencent.p014mm.sdk.platformtools.Log;
import eu3.C58834h;
import eu3.C97749e;
import fy3.C32226l;
import gy3.C87411a;
import gy3.C87412m;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import q11.C110332a;
import q11.C110334c;
import q11.C110336f;
import rx3.C13598b0;
import rx3.C36570n;
import t11.C110892b;
import u11.C111099b;
import w80.C111742d;
import wx3.C66212f;

/* renamed from: t11.a */
public final class C110886a extends C53896h0 implements Closeable {

    /* renamed from: e */
    public C110336f f331690e;

    /* renamed from: f */
    public Thread f331691f;

    /* renamed from: g */
    public final LinkedBlockingQueue<Runnable> f331692g = new LinkedBlockingQueue<>();

    /* renamed from: h */
    public final LinkedBlockingDeque<Runnable> f331693h = new LinkedBlockingDeque<>();

    /* renamed from: i */
    public final ArrayList<C110332a> f331694i = new ArrayList<>();

    /* renamed from: t11.a$a */
    public static final class C110887a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C110892b.C110893a f331695d;

        /* renamed from: e */
        public final /* synthetic */ C110886a f331696e;

        /* renamed from: f */
        public final /* synthetic */ Runnable f331697f;

        public C110887a(C110892b.C110893a aVar, C110886a aVar2, Runnable runnable) {
            this.f331695d = aVar;
            this.f331696e = aVar2;
            this.f331697f = runnable;
        }

        public final void run() {
            C111742d.C65942b bVar;
            C111742d.C65942b bVar2;
            EGLSurface eGLSurface;
            if (!((C110892b.C110893a.C110896c) this.f331695d).f331705a.f332695e) {
                Log.m105924i("MicroMsg.MTR.GLDispatcher", "surface not inUse " + ((C110892b.C110893a.C110896c) this.f331695d).f331705a);
                return;
            }
            C110886a aVar = this.f331696e;
            C110336f fVar = aVar.f331690e;
            C111099b.C111100a aVar2 = ((C110892b.C110893a.C110896c) this.f331695d).f331705a;
            aVar.getClass();
            if (!(fVar == null || (bVar2 = fVar.f330064e) == null)) {
                if (aVar2.f332695e && ((eGLSurface = aVar2.f332693c) == null || C87412m.m108589b(eGLSurface, EGL14.EGL_NO_SURFACE))) {
                    C111099b.C111101b a = aVar2.mo162848a();
                    Object obj = null;
                    if ((a != null ? a.getRenderTarget() : null) != null) {
                        Log.m105924i("MicroMsg.MTR.GLDispatcher", "eglCreateSurface for " + aVar2);
                        C111099b.C111101b a2 = aVar2.mo162848a();
                        if (a2 != null) {
                            obj = a2.getRenderTarget();
                        }
                        if (obj != null) {
                            aVar2.f332693c = C111742d.f334647a.mo163465h(bVar2.f189591a, obj);
                            EGLDisplay eGLDisplay = bVar2.f189591a;
                            C87412m.m108594g(eGLDisplay, "<set-?>");
                            aVar2.f332694d = eGLDisplay;
                        }
                    }
                }
                EGLDisplay eGLDisplay2 = bVar2.f189591a;
                EGLSurface eGLSurface2 = aVar2.f332693c;
                EGLSurface eGLSurface3 = eGLSurface2 == null ? EGL14.EGL_NO_SURFACE : eGLSurface2;
                if (eGLSurface2 == null) {
                    eGLSurface2 = EGL14.EGL_NO_SURFACE;
                }
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface3, eGLSurface2, bVar2.f189593c);
            }
            this.f331697f.run();
            C110886a aVar3 = this.f331696e;
            C110336f fVar2 = aVar3.f331690e;
            C111099b.C111100a aVar4 = ((C110892b.C110893a.C110896c) this.f331695d).f331705a;
            aVar3.getClass();
            if (!(fVar2 == null || (bVar = fVar2.f330064e) == null)) {
                C111742d.C111743a aVar5 = C111742d.f334647a;
                EGLDisplay eGLDisplay3 = bVar.f189591a;
                EGLSurface eGLSurface4 = aVar4.f332693c;
                if (eGLSurface4 == null) {
                    eGLSurface4 = EGL14.EGL_NO_SURFACE;
                }
                aVar5.mo163474t(eGLDisplay3, eGLSurface4);
            }
            C111099b.C111101b a3 = ((C110892b.C110893a.C110896c) this.f331695d).f331705a.mo162848a();
            if (a3 != null) {
                a3.mo149459b();
            }
        }
    }

    /* renamed from: t11.a$b */
    public static final class C110888b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C110886a f331698d;

        /* renamed from: t11.a$b$a */
        public /* synthetic */ class C110889a extends C87411a implements C32226l<C110332a, C13598b0> {
            public C110889a(Object obj) {
                super(1, obj, ArrayList.class, "remove", "remove(Ljava/lang/Object;)Z", 8);
            }

            public Object invoke(Object obj) {
                C110332a aVar = (C110332a) obj;
                C87412m.m108594g(aVar, "p0");
                ((ArrayList) this.f253295d).remove(aVar);
                return C13598b0.f38549a;
            }
        }

        public C110888b(C110886a aVar) {
            this.f331698d = aVar;
        }

        public final void run() {
            C111742d.C65942b bVar;
            EGLContext eGLContext;
            C110886a aVar = this.f331698d;
            if (aVar.f331691f == null) {
                C110336f fVar = aVar.f331690e;
                if (fVar == null || (bVar = fVar.f330064e) == null || (eGLContext = bVar.f189593c) == null) {
                    Log.m105920e("MicroMsg.MTR.GLDispatcher", "main gl context is null");
                    return;
                }
                C110332a aVar2 = new C110332a(aVar.f331693h, eGLContext, new C110889a(aVar.f331694i), -1);
                C110886a aVar3 = this.f331698d;
                aVar3.f331691f = aVar3.mo162588i0(aVar2);
            }
        }
    }

    /* renamed from: t11.a$c */
    public /* synthetic */ class C110890c extends C87411a implements C32226l<C110332a, C13598b0> {
        public C110890c(Object obj) {
            super(1, obj, ArrayList.class, "remove", "remove(Ljava/lang/Object;)Z", 8);
        }

        public Object invoke(Object obj) {
            C110332a aVar = (C110332a) obj;
            C87412m.m108594g(aVar, "p0");
            ((ArrayList) this.f253295d).remove(aVar);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: t11.a$d */
    public static final class C110891d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C110332a f331699d;

        /* renamed from: e */
        public final /* synthetic */ HandlerThread f331700e;

        public C110891d(C110332a aVar, HandlerThread handlerThread) {
            this.f331699d = aVar;
            this.f331700e = handlerThread;
        }

        public final void run() {
            Log.m105924i("MicroMsg.MTR.GLDispatcher", "runGlEnvironmentRunnable " + this.f331699d.f330053j + " enter loop");
            this.f331699d.run();
            this.f331700e.quitSafely();
            Log.m105924i("MicroMsg.MTR.GLDispatcher", "runGlEnvironmentRunnable " + this.f331699d.f330053j + " quit loop");
        }
    }

    /* renamed from: S */
    public void mo74497S(C66212f fVar, Runnable runnable) {
        C111742d.C65942b bVar;
        EGLContext eGLContext;
        C87412m.m108594g(fVar, "context");
        C87412m.m108594g(runnable, "block");
        C110892b bVar2 = (C110892b) fVar.get(C110892b.f331701e);
        C110892b.C110893a aVar = bVar2 != null ? bVar2.f331703d : null;
        if (aVar instanceof C110892b.C110893a.C110894a) {
            mo162589j0(this.f331690e, runnable);
        } else if (aVar instanceof C110892b.C110893a.C110896c) {
            mo162589j0(this.f331690e, new C110887a(aVar, this, runnable));
        } else if (aVar instanceof C110892b.C110893a.C110897d) {
            if (this.f331691f == null) {
                mo162589j0(this.f331690e, new C110888b(this));
            }
            this.f331693h.offer(runnable);
        } else if (aVar instanceof C110892b.C110893a.C110895b) {
            mo162589j0(this.f331690e, runnable);
        } else {
            if (this.f331694i.isEmpty() || (this.f331692g.size() > this.f331694i.size() && this.f331694i.size() < 5)) {
                C110336f fVar2 = this.f331690e;
                if (fVar2 == null || (bVar = fVar2.f330064e) == null || (eGLContext = bVar.f189593c) == null) {
                    Log.m105920e("MicroMsg.MTR.GLDispatcher", "main gl context is null");
                    return;
                }
                C110332a aVar2 = new C110332a(this.f331692g, eGLContext, new C110890c(this.f331694i), 10000);
                this.f331694i.add(aVar2);
                mo162588i0(aVar2);
            }
            this.f331692g.offer(runnable);
        }
    }

    public void close() {
        Log.m105924i("MicroMsg.MTR.GLDispatcher", "close");
        Iterator<C110332a> it = this.f331694i.iterator();
        while (it.hasNext()) {
            it.next().f330051h = false;
        }
        this.f331692g.clear();
        this.f331693h.clear();
        Thread thread = this.f331691f;
        if (thread != null) {
            thread.interrupt();
        }
        this.f331691f = null;
        C110336f fVar = this.f331690e;
        if (fVar != null) {
            ((Handler) ((C36570n) fVar.f330063d).getValue()).post(new C110334c(fVar));
            ((HandlerThread) ((C36570n) fVar.f330062c).getValue()).quitSafely();
        }
        this.f331690e = null;
    }

    /* renamed from: i0 */
    public final Thread mo162588i0(C110332a aVar) {
        Log.m105924i("MicroMsg.MTR.GLDispatcher", "runGlEnvironmentRunnable " + aVar.f330053j);
        String str = aVar.f330053j;
        int i = C58834h.f168432b;
        HandlerThread a = C97749e.m126093a(str, -4);
        a.start();
        new Handler(a.getLooper()).post(new C110891d(aVar, a));
        return a;
    }

    /* renamed from: j0 */
    public final void mo162589j0(C110336f fVar, Runnable runnable) {
        if (fVar == null || C87412m.m108589b((HandlerThread) ((C36570n) fVar.f330062c).getValue(), Thread.currentThread())) {
            runnable.run();
            return;
        }
        Handler handler = fVar.f330061b ? (Handler) ((C36570n) fVar.f330063d).getValue() : null;
        if (handler != null) {
            handler.post(runnable);
        }
    }
}
