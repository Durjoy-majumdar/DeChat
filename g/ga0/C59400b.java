package ga0;

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
import te3.C64626pc;
import te3.C64653qc;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.mj_template.compose_widget.model.CgiHelper$searchMMMusic$2", mo125469f = "CgiHelper.kt", mo125470l = {57}, mo125471m = "invokeSuspend")
/* renamed from: ga0.b */
public final class C59400b extends C91594j implements C32227p<C0000n0, C15601d<? super C64653qc>, Object> {

    /* renamed from: d */
    public int f169758d;

    /* renamed from: e */
    public final /* synthetic */ long f169759e;

    /* renamed from: f */
    public final /* synthetic */ String f169760f;

    /* renamed from: g */
    public final /* synthetic */ int f169761g;

    /* renamed from: h */
    public final /* synthetic */ int f169762h;

    /* renamed from: i */
    public final /* synthetic */ long f169763i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59400b(long j, String str, int i, int i2, long j2, C15601d<? super C59400b> dVar) {
        super(2, dVar);
        this.f169759e = j;
        this.f169760f = str;
        this.f169761g = i;
        this.f169762h = i2;
        this.f169763i = j2;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C59400b(this.f169759e, this.f169760f, this.f169761g, this.f169762h, this.f169763i, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C59400b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f169758d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            long j = this.f169759e;
            String str = this.f169760f;
            int i2 = this.f169761g;
            int i3 = this.f169762h;
            long j2 = this.f169763i;
            Result.Companion companion = Result.Companion;
            C64626pc pcVar = new C64626pc();
            pcVar.f184809e = j;
            pcVar.f184810f = str;
            pcVar.f184811g = i2;
            pcVar.f184812h = i3;
            pcVar.f184813i = j2;
            C47350c.C47352b bVar = new C47350c.C47352b();
            bVar.f127069d = 3645;
            bVar.f127068c = "/cgi-bin/micromsg-bin/sprbgmsearch";
            bVar.f127066a = pcVar;
            bVar.f127067b = new C64653qc();
            C47350c a = bVar.mo72403a();
            C89132b bVar2 = new C89132b();
            bVar2.mo123453j(a);
            this.f169758d = 1;
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
        obj2 = Result.m168114constructorimpl((C64653qc) obj);
        Throwable r0 = Result.m168117exceptionOrNullimpl(obj2);
        if (r0 != null) {
            Log.printErrStackTrace("MicroMsg.CgiHelper", r0, "searchMMMusic cgi error", new Object[0]);
        }
        if (Result.m168120isFailureimpl(obj2)) {
            return null;
        }
        return obj2;
    }
}
