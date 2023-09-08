package gu1;

import a10.C112713c;
import a14.C0000n0;
import com.tencent.matrix.lifecycle.C80401d;
import com.tencent.matrix.lifecycle.owners.ProcessDeepBackgroundOwner;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.flutter.base.AutoReleaseEngineGroupHelper$destroyEngineGroup$1", mo125469f = "AutoReleaseEngineGroupHelper.kt", mo125470l = {78}, mo125471m = "invokeSuspend")
/* renamed from: gu1.d */
public final class C116987d extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f350553d;

    /* renamed from: e */
    public final /* synthetic */ C116989f f350554e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C116987d(C116989f fVar, C15601d<? super C116987d> dVar) {
        super(2, dVar);
        this.f350554e = fVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C116987d(this.f350554e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C116987d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f350553d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str = this.f350554e.f350560e;
            Log.m105924i(str, "auto destroy engineGroup, isActive:" + this.f350554e.f350556a.f337471e);
            C116989f fVar = this.f350554e;
            if (fVar.f350556a.f337471e) {
                ProcessDeepBackgroundOwner.INSTANCE.removeLifecycleCallback((C80401d) fVar.f350563h);
                C112713c cVar = this.f350554e.f350556a;
                this.f350553d = 1;
                if (cVar.mo164454a(this) == aVar) {
                    return aVar;
                }
            }
            return C13598b0.f38549a;
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.f350554e.f350559d.invoke();
        return C13598b0.f38549a;
    }
}
