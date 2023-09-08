package xx3;

import fy3.C32227p;
import gy3.C24564k0;
import gy3.C87412m;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import wx3.C66217g;
import yx3.C66704d;
import yx3.C66706h;
import yx3.C91589a;

/* renamed from: xx3.b */
public class C66447b {

    /* renamed from: xx3.b$a */
    public static final class C66448a extends C66706h {

        /* renamed from: d */
        public int f191203d;

        /* renamed from: e */
        public final /* synthetic */ C32227p f191204e;

        /* renamed from: f */
        public final /* synthetic */ Object f191205f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66448a(C15601d dVar, C32227p pVar, Object obj) {
            super(dVar);
            this.f191204e = pVar;
            this.f191205f = obj;
            C87412m.m108592e(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        public Object invokeSuspend(Object obj) {
            int i = this.f191203d;
            if (i == 0) {
                this.f191203d = 1;
                ResultKt.throwOnFailure(obj);
                C87412m.m108592e(this.f191204e, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda-1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda-1>, kotlin.Any?>");
                C32227p pVar = this.f191204e;
                C24564k0.m30741e(pVar, 2);
                return pVar.invoke(this.f191205f, this);
            } else if (i == 1) {
                this.f191203d = 2;
                ResultKt.throwOnFailure(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    /* renamed from: xx3.b$b */
    public static final class C66449b extends C66704d {

        /* renamed from: d */
        public int f191206d;

        /* renamed from: e */
        public final /* synthetic */ C32227p f191207e;

        /* renamed from: f */
        public final /* synthetic */ Object f191208f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66449b(C15601d dVar, C66212f fVar, C32227p pVar, Object obj) {
            super(dVar, fVar);
            this.f191207e = pVar;
            this.f191208f = obj;
            C87412m.m108592e(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        public Object invokeSuspend(Object obj) {
            int i = this.f191206d;
            if (i == 0) {
                this.f191206d = 1;
                ResultKt.throwOnFailure(obj);
                C87412m.m108592e(this.f191207e, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda-1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda-1>, kotlin.Any?>");
                C32227p pVar = this.f191207e;
                C24564k0.m30741e(pVar, 2);
                return pVar.invoke(this.f191208f, this);
            } else if (i == 1) {
                this.f191206d = 2;
                ResultKt.throwOnFailure(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    /* renamed from: a */
    public static final <R, T> C15601d<C13598b0> m78391a(C32227p<? super R, ? super C15601d<? super T>, ? extends Object> pVar, R r, C15601d<? super T> dVar) {
        C87412m.m108594g(pVar, "<this>");
        C87412m.m108594g(dVar, "completion");
        if (pVar instanceof C91589a) {
            return ((C91589a) pVar).create(r, dVar);
        }
        C66212f context = dVar.getContext();
        return context == C66217g.f190253d ? new C66448a(dVar, pVar, r) : new C66449b(dVar, context, pVar, r);
    }

    /* renamed from: b */
    public static final <T> C15601d<T> m78392b(C15601d<? super T> dVar) {
        C15601d<Object> intercepted;
        C87412m.m108594g(dVar, "<this>");
        C66704d dVar2 = dVar instanceof C66704d ? (C66704d) dVar : null;
        return (dVar2 == null || (intercepted = dVar2.intercepted()) == null) ? dVar : intercepted;
    }
}
