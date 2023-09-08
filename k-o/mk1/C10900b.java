package mk1;

import a14.C0000n0;
import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import kotlin.ResultKt;
import mk1.C10906h;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.ui.livepost.FinderLivePostForNearby$handleConfirmPostLive$1", mo125469f = "FinderLivePostForNearby.kt", mo125470l = {216}, mo125471m = "invokeSuspend")
/* renamed from: mk1.b */
public final class C10900b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f32524d;

    /* renamed from: e */
    public final /* synthetic */ C10905g f32525e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10900b(C10905g gVar, C15601d<? super C10900b> dVar) {
        super(2, dVar);
        this.f32525e = gVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C10900b(this.f32525e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C10900b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f32524d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C10906h hVar = this.f32525e.f32532f;
            this.f32524d = 1;
            obj = hVar.mo11118g((C10906h.C10907a) null, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C10906h.C10912c cVar = (C10906h.C10912c) obj;
        if (cVar instanceof C10906h.C10912c.C10913a) {
            Log.m105924i("Finder.FinderLivePostForNearby", "handleConfirmPostLive failed, errCode:" + ((C10906h.C10912c.C10913a) cVar).f32546a);
        } else if (cVar instanceof C10906h.C10912c.C10915c) {
            Log.m105924i("Finder.FinderLivePostForNearby", "handleConfirmPostLive continueLive");
            this.f32525e.f32532f.mo11113b(((C10906h.C10912c.C10915c) cVar).f32548a);
        } else if (cVar instanceof C10906h.C10912c.C10914b) {
            Log.m105924i("Finder.FinderLivePostForNearby", "handleConfirmPostLive success");
            this.f32525e.f32532f.mo11114c((Intent) null, ((C10906h.C10912c.C10914b) cVar).f32547a, false);
        }
        return C13598b0.f38549a;
    }
}
