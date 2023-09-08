package androidx.compose.p002ui.platform;

import a14.C0000n0;
import android.view.View;
import com.tencent.p014mm.C0966R;
import d14.C58042h;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import p175j0.C60661k1;
import p175j0.C60670m1;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "androidx.compose.ui.platform.WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1", mo125469f = "WindowRecomposer.android.kt", mo125470l = {233}, mo125471m = "invokeSuspend")
/* renamed from: androidx.compose.ui.platform.s2 */
public final class C54186s2 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f152135d;

    /* renamed from: e */
    public final /* synthetic */ C60661k1 f152136e;

    /* renamed from: f */
    public final /* synthetic */ View f152137f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54186s2(C60661k1 k1Var, View view, C15601d<? super C54186s2> dVar) {
        super(2, dVar);
        this.f152136e = k1Var;
        this.f152137f = view;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C54186s2(this.f152136e, this.f152137f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C54186s2) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f152135d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C60661k1 k1Var = this.f152136e;
            this.f152135d = 1;
            Object g = C58042h.m67198g(k1Var.f172798o, new C60670m1((C15601d<? super C60670m1>) null), this);
            if (g != aVar) {
                g = C13598b0.f38549a;
            }
            if (g == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th) {
                if (C54196x2.m60894b(this.f152137f) == this.f152136e) {
                    View view = this.f152137f;
                    C87412m.m108594g(view, "<this>");
                    view.setTag(C0966R.C0970id.f5839q1, (Object) null);
                }
                throw th;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (C54196x2.m60894b(this.f152137f) == this.f152136e) {
            View view2 = this.f152137f;
            C87412m.m108594g(view2, "<this>");
            view2.setTag(C0966R.C0970id.f5839q1, (Object) null);
        }
        return C13598b0.f38549a;
    }
}
