package tj2;

import a14.C0000n0;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import kotlin.ResultKt;
import mp3.C88819d;
import q40.C89456b;
import rx3.C13598b0;
import vj2.C14879b;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.ringtone.history.RingtoneHistoryManager$doClearHistoryRingBack$1", mo125469f = "RingtoneHistoryManager.kt", mo125470l = {28}, mo125471m = "invokeSuspend")
/* renamed from: tj2.g */
public final class C13961g extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f39208d;

    public C13961g(C15601d<? super C13961g> dVar) {
        super(2, dVar);
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C13961g(dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        C0000n0 n0Var = (C0000n0) obj;
        return new C13961g((C15601d) obj2).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f39208d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C14879b bVar = new C14879b();
            this.f39208d = 1;
            if (C89456b.m111831a(bVar, 3000, (C88819d) null, this, 2, (Object) null) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Exception e) {
                Log.m105920e("MicroMsg.RingtoneHistoryManager", "ClearAllHistoryRingBackCgi failed: " + e.getMessage());
                return C13598b0.f38549a;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C13598b0.f38549a;
    }
}
