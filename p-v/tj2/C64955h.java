package tj2;

import a14.C0000n0;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import kotlin.ResultKt;
import mp3.C88819d;
import pj2.C62323d;
import q40.C89456b;
import rx3.C13598b0;
import ve3.C65679e0;
import ve3.C65681f0;
import ve3.C65682g;
import ve3.C65686z0;
import vj2.C52933c;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.ringtone.history.RingtoneHistoryManager$doDeleteHistoryRingBack$1", mo125469f = "RingtoneHistoryManager.kt", mo125470l = {47}, mo125471m = "invokeSuspend")
/* renamed from: tj2.h */
public final class C64955h extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f187035d;

    /* renamed from: e */
    public final /* synthetic */ C62323d f187036e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C64955h(C62323d dVar, C15601d<? super C64955h> dVar2) {
        super(2, dVar2);
        this.f187036e = dVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C64955h(this.f187036e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C64955h) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f187035d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C65686z0 z0Var = new C65686z0();
            C62323d dVar = this.f187036e;
            z0Var.f189027d = dVar.mo87403e().f189020d;
            C65682g gVar = dVar.mo87403e().f189022f;
            C65679e0 e0Var = null;
            z0Var.f189029f = gVar != null ? gVar.f188994d : null;
            C65681f0 f0Var = dVar.mo87403e().f189021e;
            if (f0Var != null) {
                e0Var = f0Var.f188985d;
            }
            z0Var.f189028e = e0Var;
            C52933c cVar = new C52933c(z0Var);
            this.f187035d = 1;
            if (C89456b.m111831a(cVar, 0, (C88819d) null, this, 3, (Object) null) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Exception e) {
                Log.m105920e("MicroMsg.RingtoneHistoryManager", "doDeleteHistoryRingBack failed: " + e.getMessage());
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C13598b0.f38549a;
    }
}
