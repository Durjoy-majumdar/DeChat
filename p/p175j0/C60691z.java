package p175j0;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53916l;
import a14.C53921m;
import android.view.Choreographer;
import f14.C58901s;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.Result;
import kotlin.ResultKt;
import p175j0.C60683t0;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: j0.z */
public final class C60691z implements C60683t0 {

    /* renamed from: d */
    public static final C60691z f172858d = new C60691z();

    /* renamed from: e */
    public static final Choreographer f172859e = ((Choreographer) C53895h.m60467e(C58901s.f168555a.mo74590i0(), new C60692a((C15601d<? super C60692a>) null)));

    @C91590f(mo125468c = "androidx.compose.runtime.DefaultChoreographerFrameClock$choreographer$1", mo125469f = "ActualAndroid.android.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: j0.z$a */
    public static final class C60692a extends C91594j implements C32227p<C0000n0, C15601d<? super Choreographer>, Object> {
        public C60692a(C15601d<? super C60692a> dVar) {
            super(2, dVar);
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C60692a(dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            C0000n0 n0Var = (C0000n0) obj;
            return new C60692a((C15601d) obj2).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            return Choreographer.getInstance();
        }
    }

    /* renamed from: j0.z$b */
    public static final class C60693b extends C87413o implements C32226l<Throwable, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ Choreographer.FrameCallback f172860d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60693b(Choreographer.FrameCallback frameCallback) {
            super(1);
            this.f172860d = frameCallback;
        }

        public Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            C60691z.f172859e.removeFrameCallback(this.f172860d);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: j0.z$c */
    public static final class C60694c implements Choreographer.FrameCallback {

        /* renamed from: d */
        public final /* synthetic */ C53916l<R> f172861d;

        /* renamed from: e */
        public final /* synthetic */ C32226l<Long, R> f172862e;

        public C60694c(C53916l<? super R> lVar, C32226l<? super Long, ? extends R> lVar2) {
            this.f172861d = lVar;
            this.f172862e = lVar2;
        }

        public final void doFrame(long j) {
            Object obj;
            C53916l<R> lVar = this.f172861d;
            C60691z zVar = C60691z.f172858d;
            C32226l<Long, R> lVar2 = this.f172862e;
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

    static {
        C53896h0 h0Var = C53872d1.f151117a;
    }

    /* renamed from: d */
    public <R> Object mo74976d(C32226l<? super Long, ? extends R> lVar, C15601d<? super R> dVar) {
        C53921m mVar = new C53921m(C66447b.m78392b(dVar), 1);
        mVar.mo74609p();
        C60694c cVar = new C60694c(mVar, lVar);
        f172859e.postFrameCallback(cVar);
        mVar.mo74599v(new C60693b(cVar));
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
