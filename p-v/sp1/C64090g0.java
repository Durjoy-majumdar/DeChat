package sp1;

import a14.C0000n0;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C8478d0;
import gy3.C87413o;
import kotlin.ResultKt;
import rx3.C13598b0;
import sk1.C63965x;
import te3.C64370fp1;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingBubbleWidget$parseShowBox$1", mo125469f = "FinderLiveShoppingBubbleWidget.kt", mo125470l = {540}, mo125471m = "invokeSuspend")
/* renamed from: sp1.g0 */
public final class C64090g0 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f181719d;

    /* renamed from: e */
    public final /* synthetic */ C64075c0 f181720e;

    /* renamed from: f */
    public final /* synthetic */ C63965x f181721f;

    /* renamed from: g */
    public final /* synthetic */ C8478d0 f181722g;

    /* renamed from: sp1.g0$a */
    public static final class C64091a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C64075c0 f181723d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64091a(C64075c0 c0Var) {
            super(0);
            this.f181723d = c0Var;
        }

        public Object invoke() {
            ViewGroup viewGroup = this.f181723d.f181667n;
            if ((viewGroup != null ? viewGroup.getTag() : null) != null) {
                this.f181723d.getPlugin().mo87807b1(true);
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C64090g0(C64075c0 c0Var, C63965x xVar, C8478d0 d0Var, C15601d<? super C64090g0> dVar) {
        super(2, dVar);
        this.f181720e = c0Var;
        this.f181721f = xVar;
        this.f181722g = d0Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C64090g0(this.f181720e, this.f181721f, this.f181722g, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C64090g0) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f181719d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C64075c0 c0Var = this.f181720e;
            C64068b0 b0Var = c0Var.f181651A;
            if (b0Var != null) {
                String str = c0Var.f181664h;
                C64370fp1 fp12 = this.f181721f.f181346s;
                LinearLayout linearLayout = c0Var.f181678y;
                int i2 = this.f181722g.f27483d;
                C64091a aVar2 = new C64091a(c0Var);
                this.f181719d = 1;
                if (b0Var.mo88820c(str, fp12, false, linearLayout, i2, aVar2, this) == aVar) {
                    return aVar;
                }
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C13598b0.f38549a;
    }
}
