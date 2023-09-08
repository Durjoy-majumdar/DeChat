package k33;

import a14.C0000n0;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import kotlin.Result;
import kotlin.ResultKt;
import mp3.C88819d;
import ob0.C47350c;
import ob0.C89132b;
import q40.C89456b;
import rx3.C13598b0;
import te3.ae4;
import te3.be4;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.voiceprint.model.CgiHelper$switchOpVoicePrint$2", mo125469f = "CgiHelper.kt", mo125470l = {25}, mo125471m = "invokeSuspend")
/* renamed from: k33.a */
public final class C9560a extends C91594j implements C32227p<C0000n0, C15601d<? super be4>, Object> {

    /* renamed from: d */
    public int f29784d;

    /* renamed from: e */
    public final /* synthetic */ int f29785e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9560a(int i, C15601d<? super C9560a> dVar) {
        super(2, dVar);
        this.f29785e = i;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C9560a(this.f29785e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C9560a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f29784d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            int i2 = this.f29785e;
            Result.Companion companion = Result.Companion;
            ae4 ae4 = new ae4();
            ae4.f130475d = i2;
            C47350c.C47352b bVar = new C47350c.C47352b();
            bVar.f127069d = 615;
            bVar.f127068c = "/cgi-bin/micromsg-bin/switchopvoiceprint";
            bVar.f127066a = ae4;
            bVar.f127067b = new be4();
            C47350c a = bVar.mo72403a();
            C89132b bVar2 = new C89132b();
            bVar2.mo123453j(a);
            this.f29784d = 1;
            obj = C89456b.m111831a(bVar2, 0, (C88819d) null, this, 3, (Object) null);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.m168114constructorimpl(ResultKt.createFailure(th));
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        obj2 = Result.m168114constructorimpl((be4) obj);
        Throwable r0 = Result.m168117exceptionOrNullimpl(obj2);
        if (r0 != null) {
            Log.printErrStackTrace("MicroMsg.CgiHelper", r0, "switchOpError", new Object[0]);
        }
        if (Result.m168120isFailureimpl(obj2)) {
            return null;
        }
        return obj2;
    }
}
