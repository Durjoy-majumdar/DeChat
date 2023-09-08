package il1;

import a14.C0000n0;
import a14.C53965x0;
import androidx.camera.core.FocusMeteringAction;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.widget.FinderLiveCameraOptFilterWidget$launchDismissValueJob$1", mo125469f = "FinderLiveCameraOptFilterWidget.kt", mo125470l = {255}, mo125471m = "invokeSuspend")
/* renamed from: il1.m1 */
public final class C46269m1 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f124723d;

    /* renamed from: e */
    public final /* synthetic */ C60413h1 f124724e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46269m1(C60413h1 h1Var, C15601d<? super C46269m1> dVar) {
        super(2, dVar);
        this.f124724e = h1Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C46269m1(this.f124724e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C46269m1) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f124723d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.f124723d = 1;
            if (C53965x0.m60607b(FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION, this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.f124724e.f172245c.setVisibility(4);
        return C13598b0.f38549a;
    }
}
