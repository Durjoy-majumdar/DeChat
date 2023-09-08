package ga0;

import a14.C0000n0;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import kotlin.Result;
import kotlin.ResultKt;
import mp3.C88819d;
import ob0.C47350c;
import ob0.C89132b;
import pe3.C89349b;
import q40.C89456b;
import rx3.C13598b0;
import te3.r64;
import te3.s64;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.mj_template.compose_widget.model.CgiHelper$searchMusic$2", mo125469f = "CgiHelper.kt", mo125470l = {41}, mo125471m = "invokeSuspend")
/* renamed from: ga0.c */
public final class C8256c extends C91594j implements C32227p<C0000n0, C15601d<? super s64>, Object> {

    /* renamed from: d */
    public int f27193d;

    /* renamed from: e */
    public final /* synthetic */ C89349b f27194e;

    /* renamed from: f */
    public final /* synthetic */ String f27195f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8256c(C89349b bVar, String str, C15601d<? super C8256c> dVar) {
        super(2, dVar);
        this.f27194e = bVar;
        this.f27195f = str;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C8256c(this.f27194e, this.f27195f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C8256c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f27193d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C89349b bVar = this.f27194e;
            String str = this.f27195f;
            Result.Companion companion = Result.Companion;
            r64 r64 = new r64();
            r64.f140735f = bVar;
            r64.f140734e = str;
            r64.f140733d = 1;
            C47350c.C47352b bVar2 = new C47350c.C47352b();
            bVar2.f127069d = 11030;
            bVar2.f127068c = "/cgi-bin/micromsg-bin/mmsnsbgmsearch";
            bVar2.f127066a = r64;
            bVar2.f127067b = new s64();
            C47350c a = bVar2.mo72403a();
            C89132b bVar3 = new C89132b();
            bVar3.mo123453j(a);
            this.f27193d = 1;
            obj = C89456b.m111831a(bVar3, 0, (C88819d) null, this, 3, (Object) null);
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
        obj2 = Result.m168114constructorimpl((s64) obj);
        Throwable r0 = Result.m168117exceptionOrNullimpl(obj2);
        if (r0 != null) {
            Log.printErrStackTrace("MicroMsg.CgiHelper", r0, "search music cgi error", new Object[0]);
        }
        if (Result.m168120isFailureimpl(obj2)) {
            return null;
        }
        return obj2;
    }
}
