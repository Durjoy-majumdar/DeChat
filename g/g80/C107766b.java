package g80;

import a14.C0000n0;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import android.opengl.EGL14;
import android.os.Handler;
import android.os.HandlerThread;
import b14.C54392a;
import b14.C54394c;
import com.tencent.p014mm.sdk.platformtools.Log;
import eu3.C58834h;
import eu3.C97749e;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import rx3.C13598b0;
import v70.C111387b;
import w80.C111742d;
import wx3.C15601d;
import wx3.C66212f;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: g80.b */
public abstract class C107766b implements C111387b {

    /* renamed from: d */
    public boolean f322527d;

    /* renamed from: e */
    public final List<Runnable> f322528e;

    /* renamed from: f */
    public HandlerThread f322529f;

    /* renamed from: g */
    public C0000n0 f322530g;

    /* renamed from: h */
    public C111742d.C65942b f322531h;

    /* renamed from: i */
    public Object f322532i;

    @C91590f(mo125468c = "com.tencent.mm.media.camera.render.BaseCustomRenderCallback$renderLaunch$1", mo125469f = "BaseCustomRenderCallback.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: g80.b$a */
    public static final class C107767a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C107766b f322533d;

        /* renamed from: e */
        public final /* synthetic */ boolean f322534e;

        /* renamed from: f */
        public final /* synthetic */ Runnable f322535f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107767a(C107766b bVar, boolean z, Runnable runnable, C15601d<? super C107767a> dVar) {
            super(2, dVar);
            this.f322533d = bVar;
            this.f322534e = z;
            this.f322535f = runnable;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C107767a(this.f322533d, this.f322534e, this.f322535f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C107767a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            if (this.f322533d.f322531h != null || !this.f322534e) {
                this.f322535f.run();
                return C13598b0.f38549a;
            }
            Log.m105924i("MicroMsg.BaseCustomRenderCallback", "renderLaunch not exec for egl not ready");
            return C13598b0.f38549a;
        }
    }

    public C107766b(boolean z, int i, C8480h hVar) {
        this.f322527d = (i & 1) != 0 ? false : z;
        this.f322528e = Collections.synchronizedList(new ArrayList());
        this.f322532i = new Object();
        if (this.f322527d) {
            int i2 = C58834h.f168432b;
            HandlerThread a = C97749e.m126093a("Heavy-GLThread", -2);
            a.start();
            Handler handler = new Handler(a.getLooper());
            int i3 = C54394c.f152601a;
            this.f322530g = C53930o0.m60554a(new C54392a(handler, (String) null, false));
            this.f322529f = a;
        }
    }

    /* renamed from: f */
    public static /* synthetic */ void m146002f(C107766b bVar, boolean z, Runnable runnable, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = true;
            }
            bVar.mo158193d(z, runnable);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: renderLaunch");
    }

    /* renamed from: b */
    public Object mo149730b(C15601d<? super C13598b0> dVar) {
        C0000n0 n0Var = this.f322530g;
        if (n0Var != null) {
            C53930o0.m60556c(n0Var, (CancellationException) null);
        }
        HandlerThread handlerThread = this.f322529f;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        return C13598b0.f38549a;
    }

    /* renamed from: c */
    public final void mo158192c() {
        synchronized (this.f322532i) {
            List<Runnable> list = this.f322528e;
            C87412m.m108593f(list, "todoList");
            if (!list.isEmpty()) {
                List<Runnable> list2 = this.f322528e;
                C87412m.m108593f(list2, "todoList");
                for (Runnable run : list2) {
                    run.run();
                }
                this.f322528e.clear();
            }
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }

    /* renamed from: d */
    public final void mo158193d(boolean z, Runnable runnable) {
        C87412m.m108594g(runnable, "runnable");
        if (this.f322530g != null) {
            HandlerThread handlerThread = this.f322529f;
            boolean z2 = true;
            if (handlerThread == null || !handlerThread.isAlive()) {
                z2 = false;
            }
            if (z2) {
                C0000n0 n0Var = this.f322530g;
                if (n0Var != null) {
                    C53895h.m60466d(n0Var, (C66212f) null, (C53934p0) null, new C107767a(this, z, runnable, (C15601d<? super C107767a>) null), 3, (Object) null);
                    return;
                }
                return;
            }
        }
        synchronized (this.f322532i) {
            this.f322528e.add(runnable);
        }
    }

    /* renamed from: i */
    public Object mo149731i(C15601d<? super C13598b0> dVar) {
        if (this.f322527d) {
            mo158193d(false, new C107765a(this, EGL14.eglGetCurrentContext()));
        }
        return C13598b0.f38549a;
    }
}
