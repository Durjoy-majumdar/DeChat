package e14;

import a14.C53873d2;
import d14.C45253g;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.Result;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import wx3.C66217g;
import xx3.C15911a;
import yx3.C66704d;
import yx3.C66705e;
import z04.C66725r;

/* renamed from: e14.w */
public final class C58510w<T> extends C66704d implements C45253g<T> {

    /* renamed from: d */
    public final C45253g<T> f167543d;

    /* renamed from: e */
    public final C66212f f167544e;

    /* renamed from: f */
    public final int f167545f;

    /* renamed from: g */
    public C66212f f167546g;

    /* renamed from: h */
    public C15601d<? super C13598b0> f167547h;

    /* renamed from: e14.w$a */
    public static final class C58511a extends C87413o implements C32227p<Integer, C66212f.C66215b, Integer> {

        /* renamed from: d */
        public static final C58511a f167548d = new C58511a();

        public C58511a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            C66212f.C66215b bVar = (C66212f.C66215b) obj2;
            return Integer.valueOf(((Number) obj).intValue() + 1);
        }
    }

    public C58510w(C45253g<? super T> gVar, C66212f fVar) {
        super(C7584t.f25853d, C66217g.f190253d);
        this.f167543d = gVar;
        this.f167544e = fVar;
        this.f167545f = ((Number) fVar.fold(0, C58511a.f167548d)).intValue();
    }

    public Object emit(T t, C15601d<? super C13598b0> dVar) {
        try {
            Object f = mo83430f(dVar, t);
            return f == C15911a.COROUTINE_SUSPENDED ? f : C13598b0.f38549a;
        } catch (Throwable th) {
            this.f167546g = new C58504q(th, dVar.getContext());
            throw th;
        }
    }

    /* renamed from: f */
    public final Object mo83430f(C15601d<? super C13598b0> dVar, T t) {
        C66212f context = dVar.getContext();
        C53873d2.m60392d(context);
        C66212f fVar = this.f167546g;
        if (fVar != context) {
            if (fVar instanceof C58504q) {
                throw new IllegalStateException(C66725r.m78728b("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((C58504q) fVar).f167538d + ", but then emission attempt of value '" + t + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            } else if (((Number) context.fold(0, new C58514y(this))).intValue() == this.f167545f) {
                this.f167546g = context;
            } else {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f167544e + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
        }
        this.f167547h = dVar;
        Object invoke = C58512x.f167549a.invoke(this.f167543d, t, this);
        if (!C87412m.m108589b(invoke, C15911a.COROUTINE_SUSPENDED)) {
            this.f167547h = null;
        }
        return invoke;
    }

    public C66705e getCallerFrame() {
        C15601d<? super C13598b0> dVar = this.f167547h;
        if (dVar instanceof C66705e) {
            return (C66705e) dVar;
        }
        return null;
    }

    public C66212f getContext() {
        C66212f fVar = this.f167546g;
        return fVar == null ? C66217g.f190253d : fVar;
    }

    public StackTraceElement getStackTraceElement() {
        return null;
    }

    public Object invokeSuspend(Object obj) {
        Throwable r0 = Result.m168117exceptionOrNullimpl(obj);
        if (r0 != null) {
            this.f167546g = new C58504q(r0, getContext());
        }
        C15601d<? super C13598b0> dVar = this.f167547h;
        if (dVar != null) {
            dVar.resumeWith(obj);
        }
        return C15911a.COROUTINE_SUSPENDED;
    }

    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
