package ha0;

import a14.C0000n0;
import com.tencent.maas.instamovie.MJMovieSession;
import com.tencent.maas.instamovie.base.MJError;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import ja0.C60781a;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.mj_template.maas.MaasManager$releaseMovieSession$1", mo125469f = "MaasManager.kt", mo125470l = {257}, mo125471m = "invokeSuspend")
/* renamed from: ha0.b0 */
public final class C108181b0 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f323931d;

    /* renamed from: e */
    public final /* synthetic */ MJMovieSession f323932e;

    /* renamed from: ha0.b0$a */
    public static final class C108182a extends C87413o implements C32226l<MJMovieSession.OnComplete, MJError> {

        /* renamed from: d */
        public final /* synthetic */ MJMovieSession f323933d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108182a(MJMovieSession mJMovieSession) {
            super(1);
            this.f323933d = mJMovieSession;
        }

        public Object invoke(Object obj) {
            MJMovieSession.OnComplete onComplete = (MJMovieSession.OnComplete) obj;
            C87412m.m108594g(onComplete, LocaleUtil.ITALIAN);
            return this.f323933d.tearDown(onComplete);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C108181b0(MJMovieSession mJMovieSession, C15601d<? super C108181b0> dVar) {
        super(2, dVar);
        this.f323932e = mJMovieSession;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C108181b0(this.f323932e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C108181b0) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f323931d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C108182a aVar2 = new C108182a(this.f323932e);
            this.f323931d = 1;
            if (C108238y0.m146563b("280", aVar2, this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.f323932e.release();
        C108221t tVar = C108221t.f324032a;
        C108221t.f324041j = false;
        Log.m105924i("MicroMsg.MaasMovieSessionManager", "setSessionKey " + "" + ", field: " + C60781a.f173118a);
        C60781a.f173118a = "";
        return C13598b0.f38549a;
    }
}
