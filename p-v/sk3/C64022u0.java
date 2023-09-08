package sk3;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53915k2;
import a14.C53965x0;
import android.widget.TextView;
import f14.C58901s;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.ui.chatting.search.multi.uic.FTSMultiTabViewUIC$observeQueryState$1$2", mo125469f = "FTSMultiTabViewUIC.kt", mo125470l = {234, 235}, mo125471m = "invokeSuspend")
/* renamed from: sk3.u0 */
public final class C64022u0 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f181504d;

    /* renamed from: e */
    public final /* synthetic */ C64009r0 f181505e;

    @C91590f(mo125468c = "com.tencent.mm.ui.chatting.search.multi.uic.FTSMultiTabViewUIC$observeQueryState$1$2$1", mo125469f = "FTSMultiTabViewUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: sk3.u0$a */
    public static final class C64023a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C64009r0 f181506d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64023a(C64009r0 r0Var, C15601d<? super C64023a> dVar) {
            super(2, dVar);
            this.f181506d = r0Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C64023a(this.f181506d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C64023a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            TextView textView = this.f181506d.f181464n;
            if (textView != null) {
                textView.setVisibility(8);
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C64022u0(C64009r0 r0Var, C15601d<? super C64022u0> dVar) {
        super(2, dVar);
        this.f181505e = r0Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C64022u0(this.f181505e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C64022u0) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f181504d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.f181504d = 1;
            if (C53965x0.m60607b(1500, this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            return C13598b0.f38549a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C53896h0 h0Var = C53872d1.f151117a;
        C53915k2 k2Var = C58901s.f168555a;
        C64023a aVar2 = new C64023a(this.f181505e, (C15601d<? super C64023a>) null);
        this.f181504d = 2;
        if (C53895h.m60469g(k2Var, aVar2, this) == aVar) {
            return aVar;
        }
        return C13598b0.f38549a;
    }
}
