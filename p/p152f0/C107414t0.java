package p152f0;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import a14.C53973z1;
import fy3.C32227p;
import kotlin.ResultKt;
import p190l1.C109119z;
import p759y.C112209d0;
import p759y.C112242j;
import p759y.C112256m;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2", mo125469f = "LongPressTextDragObserver.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: f0.t0 */
public final class C107414t0 extends C91594j implements C32227p<C0000n0, C15601d<? super C53973z1>, Object> {

    /* renamed from: d */
    public /* synthetic */ Object f321403d;

    /* renamed from: e */
    public final /* synthetic */ C109119z f321404e;

    /* renamed from: f */
    public final /* synthetic */ C107351i1 f321405f;

    @C91590f(mo125468c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$1", mo125469f = "LongPressTextDragObserver.kt", mo125470l = {82}, mo125471m = "invokeSuspend")
    /* renamed from: f0.t0$a */
    public static final class C107415a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f321406d;

        /* renamed from: e */
        public final /* synthetic */ C109119z f321407e;

        /* renamed from: f */
        public final /* synthetic */ C107351i1 f321408f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107415a(C109119z zVar, C107351i1 i1Var, C15601d<? super C107415a> dVar) {
            super(2, dVar);
            this.f321407e = zVar;
            this.f321408f = i1Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C107415a(this.f321407e, this.f321408f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C107415a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f321406d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C109119z zVar = this.f321407e;
                C107351i1 i1Var = this.f321408f;
                this.f321406d = 1;
                Object b = C112209d0.m153116b(zVar, new C107440z0(i1Var, (C15601d<? super C107440z0>) null), this);
                if (b != aVar) {
                    b = C13598b0.f38549a;
                }
                if (b == aVar) {
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

    @C91590f(mo125468c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$2", mo125469f = "LongPressTextDragObserver.kt", mo125470l = {85}, mo125471m = "invokeSuspend")
    /* renamed from: f0.t0$b */
    public static final class C107416b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f321409d;

        /* renamed from: e */
        public final /* synthetic */ C109119z f321410e;

        /* renamed from: f */
        public final /* synthetic */ C107351i1 f321411f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107416b(C109119z zVar, C107351i1 i1Var, C15601d<? super C107416b> dVar) {
            super(2, dVar);
            this.f321410e = zVar;
            this.f321411f = i1Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C107416b(this.f321410e, this.f321411f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C107416b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f321409d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C109119z zVar = this.f321410e;
                C107351i1 i1Var = this.f321411f;
                this.f321409d = 1;
                C107428v0 v0Var = new C107428v0(i1Var);
                C107431w0 w0Var = new C107431w0(i1Var);
                C107434x0 x0Var = new C107434x0(i1Var);
                C107437y0 y0Var = new C107437y0(i1Var);
                float f = C112242j.f336066a;
                Object b = C112209d0.m153116b(zVar, new C112256m(v0Var, y0Var, x0Var, w0Var, (C15601d<? super C112256m>) null), this);
                if (b != aVar) {
                    b = C13598b0.f38549a;
                }
                if (b != aVar) {
                    b = C13598b0.f38549a;
                }
                if (b == aVar) {
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C107414t0(C109119z zVar, C107351i1 i1Var, C15601d<? super C107414t0> dVar) {
        super(2, dVar);
        this.f321404e = zVar;
        this.f321405f = i1Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C107414t0 t0Var = new C107414t0(this.f321404e, this.f321405f, dVar);
        t0Var.f321403d = obj;
        return t0Var;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C107414t0) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        C0000n0 n0Var = (C0000n0) this.f321403d;
        C53895h.m60466d(n0Var, (C66212f) null, (C53934p0) null, new C107415a(this.f321404e, this.f321405f, (C15601d<? super C107415a>) null), 3, (Object) null);
        return C53895h.m60466d(n0Var, (C66212f) null, (C53934p0) null, new C107416b(this.f321404e, this.f321405f, (C15601d<? super C107416b>) null), 3, (Object) null);
    }
}
