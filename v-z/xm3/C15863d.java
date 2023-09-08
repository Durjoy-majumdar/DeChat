package xm3;

import a14.C0000n0;
import android.view.View;
import fy3.C32227p;
import gy3.C8479f0;
import kotlin.ResultKt;
import rx3.C13598b0;
import tm3.C78056e;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.ui.mvvm.uic.base.MultiSelectModeUIC$onCreate$1$7$1$1", mo125469f = "MultiSelectModeUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: xm3.d */
public final class C15863d extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C8479f0<View> f42712d;

    /* renamed from: e */
    public final /* synthetic */ C78056e f42713e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15863d(C8479f0<View> f0Var, C78056e eVar, C15601d<? super C15863d> dVar) {
        super(2, dVar);
        this.f42712d = f0Var;
        this.f42713e = eVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C15863d(this.f42712d, this.f42713e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C15863d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        View view = (View) this.f42712d.f27484d;
        if (view != null) {
            this.f42713e.f228797a.invoke(view);
        }
        this.f42712d.f27484d = null;
        return C13598b0.f38549a;
    }
}
