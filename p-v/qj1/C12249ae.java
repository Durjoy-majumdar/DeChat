package qj1;

import a14.C0000n0;
import a14.C53965x0;
import android.view.View;
import androidx.camera.core.FocusMeteringAction;
import fy3.C32227p;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.plugin.FinderLiveScreenClearPlugin$checkFrameScaleTipsShow$1", mo125469f = "FinderLiveScreenClearPlugin.kt", mo125470l = {235}, mo125471m = "invokeSuspend")
/* renamed from: qj1.ae */
public final class C12249ae extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f35326d;

    /* renamed from: e */
    public final /* synthetic */ C63163zd f35327e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12249ae(C63163zd zdVar, C15601d<? super C12249ae> dVar) {
        super(2, dVar);
        this.f35327e = zdVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C12249ae(this.f35327e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C12249ae) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f35326d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            View view = this.f35327e.f179232w;
            if (view != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveScreenClearPlugin$checkFrameScaleTipsShow$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveScreenClearPlugin$checkFrameScaleTipsShow$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            this.f35327e.mo88084c1(1);
            this.f35326d = 1;
            if (C53965x0.m60607b(FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION, this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.f35327e.mo88082a1();
        return C13598b0.f38549a;
    }
}
