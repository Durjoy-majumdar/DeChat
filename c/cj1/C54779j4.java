package cj1;

import a14.C0000n0;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.model.FinderLiveRotationHelper$changeScreenToLandscape$1$1", mo125469f = "FinderLiveRotationHelper.kt", mo125470l = {58}, mo125471m = "invokeSuspend")
/* renamed from: cj1.j4 */
public final class C54779j4 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f153548d;

    /* renamed from: e */
    public final /* synthetic */ C54792m4 f153549e;

    /* renamed from: f */
    public final /* synthetic */ MMFinderUI f153550f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54779j4(C54792m4 m4Var, MMFinderUI mMFinderUI, C15601d<? super C54779j4> dVar) {
        super(2, dVar);
        this.f153549e = m4Var;
        this.f153550f = mMFinderUI;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C54779j4(this.f153549e, this.f153550f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C54779j4) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f153548d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C54792m4 m4Var = this.f153549e;
            MMFinderUI mMFinderUI = this.f153550f;
            C87412m.m108593f(mMFinderUI, "this@apply");
            this.f153548d = 1;
            obj = C54792m4.m61659a(m4Var, mMFinderUI, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (((Boolean) obj).booleanValue()) {
            return C13598b0.f38549a;
        }
        Log.m105924i(this.f153549e.f153610b, "changeScreenToLandscape failed, no permission");
        return C13598b0.f38549a;
    }
}
