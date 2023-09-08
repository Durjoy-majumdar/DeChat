package ha0;

import a14.C0000n0;
import com.tencent.maas.camerafun.MJCamFunSession;
import com.tencent.maas.instamovie.base.MJError;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32227p;
import ja0.C108679b;
import kotlin.Result;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66218h;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.mj_template.maas.MaasCamFunSessionManager$installFirstFrameCallback$1", mo125469f = "MaasCamFunSessionManager.kt", mo125470l = {123}, mo125471m = "invokeSuspend")
/* renamed from: ha0.j */
public final class C108205j extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f324001d;

    /* renamed from: e */
    public int f324002e;

    /* renamed from: f */
    public final /* synthetic */ C108210m f324003f;

    /* renamed from: ha0.j$a */
    public static final class C108206a implements MJCamFunSession.OnComplete {

        /* renamed from: a */
        public final /* synthetic */ long f324004a;

        /* renamed from: b */
        public final /* synthetic */ C15601d<C13598b0> f324005b;

        public C108206a(long j, C15601d<? super C13598b0> dVar) {
            this.f324004a = j;
            this.f324005b = dVar;
        }

        public final void onComplete(MJError mJError) {
            StringBuilder sb = new StringBuilder();
            sb.append("first frame present, error:");
            String str = null;
            sb.append(mJError != null ? mJError.f154609ec : null);
            sb.append(',');
            if (mJError != null) {
                str = mJError.message;
            }
            sb.append(str);
            Log.m105924i("MicroMsg.CamFunSessionManager", sb.toString());
            if (mJError == null) {
                C108679b.f325464a.mo159695b("1008", Util.ticksToNow(this.f324004a));
            } else {
                C108679b.f325464a.mo159694a("1008", mJError, Util.ticksToNow(this.f324004a));
            }
            C15601d<C13598b0> dVar = this.f324005b;
            Result.Companion companion = Result.Companion;
            dVar.resumeWith(Result.m168114constructorimpl(C13598b0.f38549a));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C108205j(C108210m mVar, C15601d<? super C108205j> dVar) {
        super(2, dVar);
        this.f324003f = mVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C108205j(this.f324003f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C108205j) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f324002e;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C108210m mVar = this.f324003f;
            this.f324001d = mVar;
            this.f324002e = 1;
            C66218h hVar = new C66218h(C66447b.m78392b(this));
            mVar.f324011a.setFirstFrameDidPresentFunc(new C108206a(Util.currentTicks(), hVar));
            if (hVar.mo90314b() == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            C108210m mVar2 = (C108210m) this.f324001d;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C13598b0.f38549a;
    }
}
