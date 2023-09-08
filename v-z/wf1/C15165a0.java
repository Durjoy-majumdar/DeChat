package wf1;

import a14.C0000n0;
import a14.C53965x0;
import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C8479f0;
import gy3.C87413o;
import kotlin.ResultKt;
import o40.C61926c;
import qo3.C89779i0;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.feed.ui.uic.FinderLiveGiftPkgUIC$makeOrder$delayJob$1", mo125469f = "FinderLiveGiftPkgUIC.kt", mo125470l = {651}, mo125471m = "invokeSuspend")
/* renamed from: wf1.a0 */
public final class C15165a0 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f41302d;

    /* renamed from: e */
    public final /* synthetic */ C15193l f41303e;

    /* renamed from: f */
    public final /* synthetic */ C8479f0<C89779i0> f41304f;

    /* renamed from: wf1.a0$a */
    public static final class C15166a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C8479f0<C89779i0> f41305d;

        /* renamed from: e */
        public final /* synthetic */ C15193l f41306e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15166a(C8479f0<C89779i0> f0Var, C15193l lVar) {
            super(0);
            this.f41305d = f0Var;
            this.f41306e = lVar;
        }

        public Object invoke() {
            this.f41305d.f27484d = C89779i0.m112248e(this.f41306e.getContext(), this.f41306e.getContext().getString(C0966R.string.a4d), true, 3, (DialogInterface.OnCancelListener) null);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15165a0(C15193l lVar, C8479f0<C89779i0> f0Var, C15601d<? super C15165a0> dVar) {
        super(2, dVar);
        this.f41303e = lVar;
        this.f41304f = f0Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C15165a0(this.f41303e, this.f41304f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C15165a0) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f41302d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.f41302d = 1;
            if (C53965x0.m60607b(1000, this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (this.f41303e.getActivity().isFinishing() || this.f41303e.getActivity().isDestroyed()) {
            return C13598b0.f38549a;
        }
        C61926c.m72668M(new C15166a(this.f41304f, this.f41303e));
        return C13598b0.f38549a;
    }
}
