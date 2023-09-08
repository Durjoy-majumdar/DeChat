package ga0;

import a14.C0000n0;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import mp3.C88819d;
import ob0.C47350c;
import ob0.C89132b;
import q40.C89456b;
import rx3.C13598b0;
import te3.C64738tt2;
import te3.C64758ut2;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.mj_template.compose_widget.model.CgiHelper$recommendMusic$2", mo125469f = "CgiHelper.kt", mo125470l = {81}, mo125471m = "invokeSuspend")
/* renamed from: ga0.a */
public final class C59399a extends C91594j implements C32227p<C0000n0, C15601d<? super C64758ut2>, Object> {

    /* renamed from: d */
    public int f169752d;

    /* renamed from: e */
    public final /* synthetic */ List<String> f169753e;

    /* renamed from: f */
    public final /* synthetic */ long f169754f;

    /* renamed from: g */
    public final /* synthetic */ long f169755g;

    /* renamed from: h */
    public final /* synthetic */ long f169756h;

    /* renamed from: i */
    public final /* synthetic */ int f169757i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59399a(List<String> list, long j, long j2, long j3, int i, C15601d<? super C59399a> dVar) {
        super(2, dVar);
        this.f169753e = list;
        this.f169754f = j;
        this.f169755g = j2;
        this.f169756h = j3;
        this.f169757i = i;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C59399a(this.f169753e, this.f169754f, this.f169755g, this.f169756h, this.f169757i, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C59399a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f169752d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            List<String> list = this.f169753e;
            long j = this.f169754f;
            long j2 = this.f169755g;
            long j3 = this.f169756h;
            int i2 = this.f169757i;
            Result.Companion companion = Result.Companion;
            C64738tt2 tt22 = new C64738tt2();
            tt22.f185673e = 0.0f;
            tt22.f185674f = 0.0f;
            tt22.f185675g = C59401d.m69311a(C59401d.f169764a, list);
            tt22.f185678j = j;
            tt22.f185677i = j2;
            tt22.f185676h = j3;
            tt22.f185672d = i2;
            C47350c.C47352b bVar = new C47350c.C47352b();
            bVar.f127069d = 341;
            bVar.f127068c = "/cgi-bin/micromsg-bin/getrecommendedmusiclist";
            bVar.f127066a = tt22;
            bVar.f127067b = new C64758ut2();
            C47350c a = bVar.mo72403a();
            C89132b bVar2 = new C89132b();
            bVar2.mo123453j(a);
            this.f169752d = 1;
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
        obj2 = Result.m168114constructorimpl((C64758ut2) obj);
        Throwable r0 = Result.m168117exceptionOrNullimpl(obj2);
        if (r0 != null) {
            Log.printErrStackTrace("MicroMsg.CgiHelper", r0, "recommendMusic cgi error", new Object[0]);
        }
        if (Result.m168120isFailureimpl(obj2)) {
            return null;
        }
        return obj2;
    }
}
