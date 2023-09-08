package androidx.compose.p002ui.platform;

import a14.C53916l;
import a14.C53921m;
import android.view.Choreographer;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.Result;
import kotlin.ResultKt;
import p175j0.C60683t0;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66210e;
import wx3.C66212f;
import xx3.C66447b;

/* renamed from: androidx.compose.ui.platform.f0 */
public final class C54168f0 implements C60683t0 {

    /* renamed from: d */
    public final Choreographer f152115d;

    /* renamed from: androidx.compose.ui.platform.f0$a */
    public static final class C54169a extends C87413o implements C32226l<Throwable, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C54163d0 f152116d;

        /* renamed from: e */
        public final /* synthetic */ Choreographer.FrameCallback f152117e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54169a(C54163d0 d0Var, Choreographer.FrameCallback frameCallback) {
            super(1);
            this.f152116d = d0Var;
            this.f152117e = frameCallback;
        }

        public Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            C54163d0 d0Var = this.f152116d;
            Choreographer.FrameCallback frameCallback = this.f152117e;
            d0Var.getClass();
            C87412m.m108594g(frameCallback, "callback");
            synchronized (d0Var.f152105g) {
                d0Var.f152107i.remove(frameCallback);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: androidx.compose.ui.platform.f0$b */
    public static final class C54170b extends C87413o implements C32226l<Throwable, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C54168f0 f152118d;

        /* renamed from: e */
        public final /* synthetic */ Choreographer.FrameCallback f152119e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54170b(C54168f0 f0Var, Choreographer.FrameCallback frameCallback) {
            super(1);
            this.f152118d = f0Var;
            this.f152119e = frameCallback;
        }

        public Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            this.f152118d.f152115d.removeFrameCallback(this.f152119e);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: androidx.compose.ui.platform.f0$c */
    public static final class C54171c implements Choreographer.FrameCallback {

        /* renamed from: d */
        public final /* synthetic */ C53916l<R> f152120d;

        /* renamed from: e */
        public final /* synthetic */ C32226l<Long, R> f152121e;

        public C54171c(C53916l<? super R> lVar, C54168f0 f0Var, C32226l<? super Long, ? extends R> lVar2) {
            this.f152120d = lVar;
            this.f152121e = lVar2;
        }

        public final void doFrame(long j) {
            Object obj;
            C53916l<R> lVar = this.f152120d;
            C32226l<Long, R> lVar2 = this.f152121e;
            try {
                Result.Companion companion = Result.Companion;
                obj = Result.m168114constructorimpl(lVar2.invoke(Long.valueOf(j)));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.m168114constructorimpl(ResultKt.createFailure(th));
            }
            lVar.resumeWith(obj);
        }
    }

    public C54168f0(Choreographer choreographer) {
        C87412m.m108594g(choreographer, "choreographer");
        this.f152115d = choreographer;
    }

    /* renamed from: d */
    public <R> Object mo74976d(C32226l<? super Long, ? extends R> lVar, C15601d<? super R> dVar) {
        C66212f context = dVar.getContext();
        int i = C66210e.f190250O0;
        C66212f.C66215b bVar = context.get(C66210e.C66211a.f190251d);
        C54163d0 d0Var = bVar instanceof C54163d0 ? (C54163d0) bVar : null;
        C53921m mVar = new C53921m(C66447b.m78392b(dVar), 1);
        mVar.mo74609p();
        C54171c cVar = new C54171c(mVar, this, lVar);
        if (d0Var == null || !C87412m.m108589b(d0Var.f152103e, this.f152115d)) {
            this.f152115d.postFrameCallback(cVar);
            mVar.mo74599v(new C54170b(this, cVar));
        } else {
            synchronized (d0Var.f152105g) {
                d0Var.f152107i.add(cVar);
                if (!d0Var.f152110o) {
                    d0Var.f152110o = true;
                    d0Var.f152103e.postFrameCallback(d0Var.f152111p);
                }
                C13598b0 b0Var = C13598b0.f38549a;
            }
            mVar.mo74599v(new C54169a(d0Var, cVar));
        }
        return mVar.mo74608o();
    }

    public <R> R fold(R r, C32227p<? super R, ? super C66212f.C66215b, ? extends R> pVar) {
        C87412m.m108594g(pVar, "operation");
        return pVar.invoke(r, this);
    }

    public <E extends C66212f.C66215b> E get(C66212f.C15602c<E> cVar) {
        C87412m.m108594g(cVar, "key");
        return C66212f.C66215b.C66216a.m78145a(this, cVar);
    }

    public C66212f.C15602c<?> getKey() {
        return C60683t0.C60684a.f172855d;
    }

    public C66212f minusKey(C66212f.C15602c<?> cVar) {
        C87412m.m108594g(cVar, "key");
        return C66212f.C66215b.C66216a.m78146b(this, cVar);
    }

    public C66212f plus(C66212f fVar) {
        C87412m.m108594g(fVar, "context");
        return C66212f.C66213a.m78144a(this, fVar);
    }
}
