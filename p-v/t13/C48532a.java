package t13;

import a14.C0000n0;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import kotlin.ResultKt;
import mp3.C88819d;
import q40.C89456b;
import rx3.C13598b0;
import s13.C48217a;
import ve3.C65686z0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.vibrate.util.VibrateFileHelper$processVibrateFile$1", mo125469f = "VibrateFileHelper.kt", mo125470l = {16}, mo125471m = "invokeSuspend")
/* renamed from: t13.a */
public final class C48532a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f129797d;

    /* renamed from: e */
    public final /* synthetic */ C65686z0 f129798e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48532a(C65686z0 z0Var, C15601d<? super C48532a> dVar) {
        super(2, dVar);
        this.f129798e = z0Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C48532a(this.f129798e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C48532a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f129797d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C48217a aVar2 = new C48217a(this.f129798e);
            this.f129797d = 1;
            if (C89456b.m111831a(aVar2, 0, (C88819d) null, this, 3, (Object) null) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Exception unused) {
                Log.m105920e("MicroMsg.VibrateFileHelper", "error in get cgi process ringback");
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C13598b0.f38549a;
    }
}
