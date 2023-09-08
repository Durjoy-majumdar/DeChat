package p004b0;

import a14.C0000n0;
import d14.C45252f;
import d14.C45253g;
import d14.C58012a;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87413o;
import kotlin.ResultKt;
import my3.C61594j;
import my3.C61595o;
import p175j0.C108500f2;
import p175j0.C60690y0;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "androidx.compose.foundation.lazy.LazyListItemProviderImplKt$rememberItemProvider$1", mo125469f = "LazyListItemProviderImpl.kt", mo125470l = {50}, mo125471m = "invokeSuspend")
/* renamed from: b0.q */
public final class C54383q extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f152571d;

    /* renamed from: e */
    public final /* synthetic */ C103953l0 f152572e;

    /* renamed from: f */
    public final /* synthetic */ C60690y0<C61594j> f152573f;

    /* renamed from: b0.q$a */
    public static final class C28187a extends C87413o implements C32224a<C61594j> {

        /* renamed from: d */
        public final /* synthetic */ C103953l0 f77682d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C28187a(C103953l0 l0Var) {
            super(0);
            this.f77682d = l0Var;
        }

        public Object invoke() {
            int e = (this.f77682d.mo145571e() / 30) * 30;
            return C61595o.m72301i(Math.max(e - 100, 0), e + 30 + 100);
        }
    }

    /* renamed from: b0.q$b */
    public static final class C54384b implements C45253g<C61594j> {

        /* renamed from: d */
        public final /* synthetic */ C60690y0<C61594j> f152574d;

        public C54384b(C60690y0<C61594j> y0Var) {
            this.f152574d = y0Var;
        }

        public Object emit(Object obj, C15601d dVar) {
            this.f152574d.setValue((C61594j) obj);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54383q(C103953l0 l0Var, C60690y0<C61594j> y0Var, C15601d<? super C54383q> dVar) {
        super(2, dVar);
        this.f152572e = l0Var;
        this.f152573f = y0Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C54383q(this.f152572e, this.f152573f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C54383q) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f152571d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C45252f f = C108500f2.m146999f(new C28187a(this.f152572e));
            C54384b bVar = new C54384b(this.f152573f);
            this.f152571d = 1;
            if (((C58012a) f).mo31880a(bVar, this) == aVar) {
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
