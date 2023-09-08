package ha0;

import a14.C0000n0;
import com.tencent.maas.instamovie.MJMovieSession;
import com.tencent.maas.instamovie.base.MJError;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.mj_template.maas.MaasMovieSessionManager$realExport$3$1", mo125469f = "MaasMovieSessionManager.kt", mo125470l = {450}, mo125471m = "invokeSuspend")
/* renamed from: ha0.g0 */
public final class C59779g0 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f170670d;

    /* renamed from: e */
    public final /* synthetic */ C108183c0 f170671e;

    /* renamed from: ha0.g0$a */
    public static final class C59780a extends C87413o implements C32226l<MJMovieSession.OnComplete, MJError> {

        /* renamed from: d */
        public final /* synthetic */ C108183c0 f170672d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59780a(C108183c0 c0Var) {
            super(1);
            this.f170672d = c0Var;
        }

        public Object invoke(Object obj) {
            MJMovieSession.OnComplete onComplete = (MJMovieSession.OnComplete) obj;
            C87412m.m108594g(onComplete, LocaleUtil.ITALIAN);
            return this.f170672d.f323934a.cancelExporting(onComplete);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59779g0(C108183c0 c0Var, C15601d<? super C59779g0> dVar) {
        super(2, dVar);
        this.f170671e = c0Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C59779g0(this.f170671e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C59779g0) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f170670d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C59780a aVar2 = new C59780a(this.f170671e);
            this.f170670d = 1;
            if (C108238y0.m146563b("262", aVar2, this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C13598b0.f38549a;
    }
}
