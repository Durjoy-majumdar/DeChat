package on1;

import a14.C0000n0;
import a14.C53973z1;
import androidx.lifecycle.C0125s;
import cm1.C0740i2;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87413o;
import i31.C117134d;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.newloader.PreloadLoader$preload$1", mo125469f = "PreloadLoader.kt", mo125470l = {25}, mo125471m = "invokeSuspend")
/* renamed from: on1.g0 */
public final class C11525g0 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f33843d;

    /* renamed from: e */
    public final /* synthetic */ C0125s f33844e;

    /* renamed from: f */
    public final /* synthetic */ C11545o<C0740i2> f33845f;

    /* renamed from: on1.g0$a */
    public static final class C11526a extends C87413o implements C32224a<C11545o<C0740i2>> {

        /* renamed from: d */
        public final /* synthetic */ C11545o<C0740i2> f33846d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11526a(C11545o<C0740i2> oVar) {
            super(0);
            this.f33846d = oVar;
        }

        public Object invoke() {
            return this.f33846d;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11525g0(C0125s sVar, C11545o<C0740i2> oVar, C15601d<? super C11525g0> dVar) {
        super(2, dVar);
        this.f33844e = sVar;
        this.f33845f = oVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C11525g0(this.f33844e, this.f33845f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C11525g0) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f33843d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C11518e0 e0Var = new C11518e0(new C11526a(this.f33845f), (C53973z1) null, this.f33844e, 2, (C8480h) null);
            this.f33843d = 1;
            if (C117134d.m165172f(e0Var, this) == aVar) {
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
