package ha0;

import a14.C0000n0;
import a14.C53930o0;
import a14.C53959v2;
import a14.C53973z1;
import com.tencent.maas.camerafun.MJCamFunSession;
import com.tencent.maas.camerafun.MJCaptureOptions;
import com.tencent.maas.instamovie.base.MJError;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;

/* renamed from: ha0.m */
public final class C108210m {

    /* renamed from: a */
    public final MJCamFunSession f324011a;

    /* renamed from: b */
    public C53973z1 f324012b;

    /* renamed from: c */
    public C0000n0 f324013c = C53930o0.m60561h(C53930o0.m60555b(), C53959v2.m60598a((C53973z1) null, 1, (Object) null));

    /* renamed from: ha0.m$a */
    public static final class C108211a implements MJCamFunSession.OnComplete {

        /* renamed from: a */
        public final /* synthetic */ C32226l f324014a;

        public C108211a(C32226l lVar) {
            this.f324014a = lVar;
        }

        public final /* synthetic */ void onComplete(MJError mJError) {
            this.f324014a.invoke(mJError);
        }
    }

    /* renamed from: ha0.m$b */
    public static final class C108212b implements MJCamFunSession.OnOptionsComplete {

        /* renamed from: a */
        public final /* synthetic */ C32227p f324015a;

        public C108212b(C32227p pVar) {
            this.f324015a = pVar;
        }

        public final /* synthetic */ void onComplete(MJCaptureOptions mJCaptureOptions, MJError mJError) {
            this.f324015a.invoke(mJCaptureOptions, mJError);
        }
    }

    public C108210m(MJCamFunSession mJCamFunSession) {
        C87412m.m108594g(mJCamFunSession, "camFunSession");
        this.f324011a = mJCamFunSession;
    }
}
