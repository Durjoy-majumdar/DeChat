package oi0;

import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandRecommendStatObj;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import f40.C86709a0;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49335eu3;
import te3.C49445fm3;

/* renamed from: oi0.n */
public class C62024n implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f176316d;

    /* renamed from: e */
    public final /* synthetic */ long f176317e;

    /* renamed from: f */
    public final /* synthetic */ long f176318f;

    /* renamed from: g */
    public final /* synthetic */ AppBrandRecommendStatObj f176319g;

    /* renamed from: oi0.n$a */
    public class C62025a implements C40324j.C40326a {
        public C62025a(C62024n nVar) {
        }

        /* renamed from: a */
        public void mo288a(int i, int i2, String str, C47350c cVar) {
            Log.m105925i("MicroMsg.Recommend.CgiRTReportRecommdClick", "CgiRTReportRecommdClick page click errType:%d, errCode:%d, errMsg:%s", Integer.valueOf(i), Integer.valueOf(i2), str);
            if (i == 0 && i2 == 0) {
                Log.m105924i("MicroMsg.Recommend.CgiRTReportRecommdClick", "report success");
            } else {
                Log.m105920e("MicroMsg.Recommend.CgiRTReportRecommdClick", "report fail");
            }
        }
    }

    /* renamed from: oi0.n$b */
    public class C62026b extends C62027o {
        public C62026b(C62024n nVar, int i, long j, long j2, AppBrandRecommendStatObj appBrandRecommendStatObj) {
            super(i, j, j2, appBrandRecommendStatObj);
        }

        /* renamed from: h */
        public void mo10094h(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
            C49445fm3 fm32 = (C49445fm3) eu32;
            if (!C86709a0.m107522a()) {
                Log.m105920e("MicroMsg.Recommend.CgiRTReportRecommdClick", "account nor ready");
                return;
            }
            Log.m105925i("MicroMsg.Recommend.CgiRTReportRecommdClick", "CgiRTReportRecommdClick profile click errType:%d, errCode:%d, errMsg:%s", Integer.valueOf(i), Integer.valueOf(i2), str);
            if (i == 0 && i2 == 0) {
                Log.m105924i("MicroMsg.Recommend.CgiRTReportRecommdClick", "report success");
            } else {
                Log.m105920e("MicroMsg.Recommend.CgiRTReportRecommdClick", "report fail");
            }
        }
    }

    public C62024n(int i, long j, long j2, AppBrandRecommendStatObj appBrandRecommendStatObj) {
        this.f176316d = i;
        this.f176317e = j;
        this.f176318f = j2;
        this.f176319g = appBrandRecommendStatObj;
    }

    public void run() {
        int i = this.f176316d;
        if (i == 1) {
            ((C40324j) C86312j.m106911c(C40324j.class)).mo63014eH(C62027o.m72773k(i, this.f176317e, this.f176318f, this.f176319g).mo72403a(), new C62025a(this));
            return;
        }
        new C62026b(this, i, this.f176317e, this.f176318f, this.f176319g).mo9225i();
    }
}
