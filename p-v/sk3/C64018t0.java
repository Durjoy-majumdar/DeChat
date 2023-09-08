package sk3;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53915k2;
import a14.C53965x0;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import f14.C58901s;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.ui.chatting.search.multi.uic.FTSMultiTabViewUIC$observeQueryState$1$1", mo125469f = "FTSMultiTabViewUIC.kt", mo125470l = {224, 225}, mo125471m = "invokeSuspend")
/* renamed from: sk3.t0 */
public final class C64018t0 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f181495d;

    /* renamed from: e */
    public final /* synthetic */ C64009r0 f181496e;

    @C91590f(mo125468c = "com.tencent.mm.ui.chatting.search.multi.uic.FTSMultiTabViewUIC$observeQueryState$1$1$1", mo125469f = "FTSMultiTabViewUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: sk3.t0$a */
    public static final class C64019a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C64009r0 f181497d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64019a(C64009r0 r0Var, C15601d<? super C64019a> dVar) {
            super(2, dVar);
            this.f181497d = r0Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C64019a(this.f181497d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C64019a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            WeImageView weImageView = this.f181497d.f181465o;
            if (weImageView != null) {
                weImageView.setVisibility(8);
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C64018t0(C64009r0 r0Var, C15601d<? super C64018t0> dVar) {
        super(2, dVar);
        this.f181496e = r0Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C64018t0(this.f181496e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C64018t0) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f181495d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.f181495d = 1;
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
        C64019a aVar2 = new C64019a(this.f181496e, (C15601d<? super C64019a>) null);
        this.f181495d = 2;
        if (C53895h.m60469g(k2Var, aVar2, this) == aVar) {
            return aVar;
        }
        return C13598b0.f38549a;
    }
}
