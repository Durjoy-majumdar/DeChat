package zo1;

import a14.C0000n0;
import a14.C53965x0;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.replay.plugin.ReplayerPlugin$fluentCheck$2", mo125469f = "ReplayerPlugin.kt", mo125470l = {69}, mo125471m = "invokeSuspend")
/* renamed from: zo1.m0 */
public final class C16360m0 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f43737d;

    /* renamed from: e */
    public final /* synthetic */ C32224a<C13598b0> f43738e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16360m0(C32224a<C13598b0> aVar, C15601d<? super C16360m0> dVar) {
        super(2, dVar);
        this.f43738e = aVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C16360m0(this.f43738e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C16360m0) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f43737d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.f43737d = 1;
            if (C53965x0.m60607b(3000, this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Log.m105924i("FinderLiveReplayerPlugin", "detachBlock timeout");
        this.f43738e.invoke();
        return C13598b0.f38549a;
    }
}
