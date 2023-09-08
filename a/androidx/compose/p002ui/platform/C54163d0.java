package androidx.compose.p002ui.platform;

import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import f14.C58901s;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.List;
import p175j0.C60683t0;
import p834a3.C103298d;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import sx3.C64190k;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: androidx.compose.ui.platform.d0 */
public final class C54163d0 extends C53896h0 {

    /* renamed from: r */
    public static final C13601g<C66212f> f152101r = C36568h.m40985a(C54164a.f152113d);

    /* renamed from: s */
    public static final ThreadLocal<C66212f> f152102s = new C54165b();

    /* renamed from: e */
    public final Choreographer f152103e;

    /* renamed from: f */
    public final Handler f152104f;

    /* renamed from: g */
    public final Object f152105g = new Object();

    /* renamed from: h */
    public final C64190k<Runnable> f152106h = new C64190k<>();

    /* renamed from: i */
    public List<Choreographer.FrameCallback> f152107i = new ArrayList();

    /* renamed from: j */
    public List<Choreographer.FrameCallback> f152108j = new ArrayList();

    /* renamed from: n */
    public boolean f152109n;

    /* renamed from: o */
    public boolean f152110o;

    /* renamed from: p */
    public final C54167e0 f152111p = new C54167e0(this);

    /* renamed from: q */
    public final C60683t0 f152112q;

    /* renamed from: androidx.compose.ui.platform.d0$a */
    public static final class C54164a extends C87413o implements C32224a<C66212f> {

        /* renamed from: d */
        public static final C54164a f152113d = new C54164a();

        public C54164a() {
            super(0);
        }

        public Object invoke() {
            Choreographer choreographer;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                choreographer = Choreographer.getInstance();
            } else {
                C53896h0 h0Var = C53872d1.f151117a;
                choreographer = (Choreographer) C53895h.m60467e(C58901s.f168555a, new C54162c0((C15601d<? super C54162c0>) null));
            }
            C87412m.m108593f(choreographer, "if (isMainThread()) Chor…eographer.getInstance() }");
            Handler a = C103298d.m136811a(Looper.getMainLooper());
            C87412m.m108593f(a, "createAsync(Looper.getMainLooper())");
            C54163d0 d0Var = new C54163d0(choreographer, a, (C8480h) null);
            return d0Var.plus(d0Var.f152112q);
        }
    }

    /* renamed from: androidx.compose.ui.platform.d0$b */
    public static final class C54165b extends ThreadLocal<C66212f> {
        public Object initialValue() {
            Choreographer instance = Choreographer.getInstance();
            C87412m.m108593f(instance, "getInstance()");
            Looper myLooper = Looper.myLooper();
            if (myLooper != null) {
                Handler a = C103298d.m136811a(myLooper);
                C87412m.m108593f(a, "createAsync(\n           …d\")\n                    )");
                C54163d0 d0Var = new C54163d0(instance, a, (C8480h) null);
                return d0Var.plus(d0Var.f152112q);
            }
            throw new IllegalStateException("no Looper on this thread".toString());
        }
    }

    /* renamed from: androidx.compose.ui.platform.d0$c */
    public static final class C54166c {
        public C54166c(C8480h hVar) {
        }
    }

    static {
        new C54166c((C8480h) null);
    }

    public C54163d0(Choreographer choreographer, Handler handler, C8480h hVar) {
        this.f152103e = choreographer;
        this.f152104f = handler;
        this.f152112q = new C54168f0(choreographer);
    }

    /* renamed from: i0 */
    public static final void m60883i0(C54163d0 d0Var) {
        Runnable removeFirst;
        boolean z;
        do {
            synchronized (d0Var.f152105g) {
                C64190k<Runnable> kVar = d0Var.f152106h;
                removeFirst = kVar.isEmpty() ? null : kVar.removeFirst();
            }
            while (removeFirst != null) {
                removeFirst.run();
                synchronized (d0Var.f152105g) {
                    C64190k<Runnable> kVar2 = d0Var.f152106h;
                    removeFirst = kVar2.isEmpty() ? null : kVar2.removeFirst();
                }
            }
            synchronized (d0Var.f152105g) {
                z = false;
                if (d0Var.f152106h.isEmpty()) {
                    d0Var.f152109n = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }

    /* renamed from: S */
    public void mo74497S(C66212f fVar, Runnable runnable) {
        C87412m.m108594g(fVar, "context");
        C87412m.m108594g(runnable, "block");
        synchronized (this.f152105g) {
            this.f152106h.addLast(runnable);
            if (!this.f152109n) {
                this.f152109n = true;
                this.f152104f.post(this.f152111p);
                if (!this.f152110o) {
                    this.f152110o = true;
                    this.f152103e.postFrameCallback(this.f152111p);
                }
            }
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }
}
