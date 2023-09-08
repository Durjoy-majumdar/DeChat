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

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.plugin.FinderLiveAnchorPreviewPlugin$checkFrameScaleTipsShow$1", mo125469f = "FinderLiveAnchorPreviewPlugin.kt", mo125470l = {156, 159}, mo125471m = "invokeSuspend")
/* renamed from: qj1.j3 */
public final class C35911j3 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f95802d;

    /* renamed from: e */
    public final /* synthetic */ C62815i3 f95803e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C35911j3(C62815i3 i3Var, C15601d<? super C35911j3> dVar) {
        super(2, dVar);
        this.f95803e = i3Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C35911j3(this.f95803e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C35911j3) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f95802d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.f95802d = 1;
            if (C53965x0.m60607b(1000, this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            C62815i3.m73901Z0(this.f95803e);
            return C13598b0.f38549a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C62815i3.m73902a1(this.f95803e, 1);
        View view = this.f95803e.f178295t;
        if (view != null) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorPreviewPlugin$checkFrameScaleTipsShow$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorPreviewPlugin$checkFrameScaleTipsShow$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f95802d = 2;
        if (C53965x0.m60607b(FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION, this) == aVar) {
            return aVar;
        }
        C62815i3.m73901Z0(this.f95803e);
        return C13598b0.f38549a;
    }
}
