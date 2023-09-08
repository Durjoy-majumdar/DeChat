package tj2;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import bl3.C39818r;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87412m;
import java.util.LinkedList;
import kotlin.ResultKt;
import mp3.C88819d;
import q40.C89456b;
import rx3.C13598b0;
import ve3.C52851s;
import ve3.C52855u;
import vj2.C52937g;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.ringtone.history.RingtoneHistoryManager$getHistoryRingBack$1", mo125469f = "RingtoneHistoryManager.kt", mo125470l = {63}, mo125471m = "invokeSuspend")
/* renamed from: tj2.i */
public final class C52350i extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f146323d;

    /* renamed from: e */
    public final /* synthetic */ long f146324e;

    /* renamed from: f */
    public final /* synthetic */ C13962j f146325f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52350i(long j, C13962j jVar, C15601d<? super C52350i> dVar) {
        super(2, dVar);
        this.f146324e = j;
        this.f146325f = jVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C52350i(this.f146324e, this.f146325f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C52350i) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f146323d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C52937g gVar = new C52937g(this.f146324e);
            this.f146323d = 1;
            obj = C89456b.m111831a(gVar, 0, (C88819d) null, this, 3, (Object) null);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Exception e) {
                Log.m105920e("MicroMsg.RingtoneHistoryManager", "getHistoryRingBack failed: " + e.getMessage());
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C52855u uVar = (C52855u) obj;
        C52348b bVar = (C52348b) C39818r.f106831a.mo62444c(this.f146325f.getActivity()).mo75002a(C52348b.class);
        LinkedList<C52851s> linkedList = uVar.f147633e;
        C87412m.m108593f(linkedList, "resp.Infos");
        boolean z = uVar.f147632d;
        bVar.getClass();
        bVar.f146318e = z;
        C53895h.m60466d(bVar.getMainScope(), (C66212f) null, (C53934p0) null, new C64945a(z, linkedList, bVar, (C15601d<? super C64945a>) null), 3, (Object) null);
        return C13598b0.f38549a;
    }
}
