package e14;

import a14.C0000n0;
import a14.C53876e0;
import a14.C53895h;
import a14.C53934p0;
import c14.C54624g;
import c14.C54629k;
import c14.C54646u;
import c14.C54647v;
import c14.C54649x;
import d14.C45252f;
import fy3.C32226l;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: e14.n */
public final class C58496n<T> extends C58482g<T> {

    /* renamed from: g */
    public final Iterable<C45252f<T>> f167514g;

    @C91590f(mo125468c = "kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge$collectTo$2$1", mo125469f = "Merge.kt", mo125470l = {96}, mo125471m = "invokeSuspend")
    /* renamed from: e14.n$a */
    public static final class C58497a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f167515d;

        /* renamed from: e */
        public final /* synthetic */ C45252f<T> f167516e;

        /* renamed from: f */
        public final /* synthetic */ C58515z<T> f167517f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58497a(C45252f<? extends T> fVar, C58515z<T> zVar, C15601d<? super C58497a> dVar) {
            super(2, dVar);
            this.f167516e = fVar;
            this.f167517f = zVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C58497a(this.f167516e, this.f167517f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C58497a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f167515d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C45252f<T> fVar = this.f167516e;
                C58515z<T> zVar = this.f167517f;
                this.f167515d = 1;
                if (fVar.mo31880a(zVar, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13598b0.f38549a;
        }
    }

    public C58496n(Iterable<? extends C45252f<? extends T>> iterable, C66212f fVar, int i, C54624g gVar) {
        super(fVar, i, gVar);
        this.f167514g = iterable;
    }

    /* renamed from: g */
    public Object mo82812g(C54647v<? super T> vVar, C15601d<? super C13598b0> dVar) {
        C58515z zVar = new C58515z(vVar);
        for (C45252f<T> aVar : this.f167514g) {
            C53895h.m60466d(vVar, (C66212f) null, (C53934p0) null, new C58497a(aVar, zVar, (C15601d<? super C58497a>) null), 3, (Object) null);
        }
        return C13598b0.f38549a;
    }

    /* renamed from: h */
    public C58482g<T> mo82813h(C66212f fVar, int i, C54624g gVar) {
        return new C58496n(this.f167514g, fVar, i, gVar);
    }

    /* renamed from: j */
    public C54649x<T> mo82818j(C0000n0 n0Var) {
        C66212f fVar = this.f167473d;
        int i = this.f167474e;
        C58481f fVar2 = new C58481f(this, (C15601d<? super C58481f>) null);
        C54624g gVar = C54624g.SUSPEND;
        C53934p0 p0Var = C53934p0.DEFAULT;
        C54646u uVar = new C54646u(C53876e0.m60398b(n0Var, fVar), C54629k.m61479a(i, gVar, (C32226l) null, 4, (Object) null));
        uVar.mo74473y0(p0Var, uVar, fVar2);
        return uVar;
    }
}
