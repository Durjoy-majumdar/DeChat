package p357lo;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C19623o0;
import com.tencent.p014mm.storage.C19636w0;
import di3.C86312j;
import gy3.C87412m;
import p007bo.C16801f;
import p154fy.C87121j;
import rb0.C48009v0;

/* renamed from: lo.e */
public final class C21455e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f60742d;

    /* renamed from: e */
    public final /* synthetic */ String f60743e;

    /* renamed from: f */
    public final /* synthetic */ boolean f60744f;

    /* renamed from: g */
    public final /* synthetic */ boolean f60745g;

    public C21455e(long j, String str, boolean z, boolean z2) {
        this.f60742d = j;
        this.f60743e = str;
        this.f60744f = z;
        this.f60745g = z2;
    }

    public final void run() {
        long j = this.f60742d;
        String str = this.f60743e;
        boolean z = this.f60744f;
        C87412m.m108594g(str, "userName");
        C19623o0 SE = C16801f.f45399a.mo17845e() ? C48009v0.Jx0().mo25789SE(j, "msgSvrId") : C48009v0.Jx0().mo25806kD(j);
        if (SE != null) {
            Log.m105918d("MicroMsg.BizFlutterReportHelper", "onExposed msgId=" + j + ", userName=" + str + ", isValidExposed=" + z);
            C48009v0.Jx0().ko0(SE);
            if (z) {
                C48009v0.Jx0().fq0(SE);
            }
            if (SE.mo25767q2() == C48009v0.Jx0().mo25791TO()) {
                C19636w0.m21174p(SE.field_orderFlag);
            }
        }
        if (this.f60745g) {
            ((C87121j) C86312j.m106911c(C87121j.class)).mo71215V9(this.f60743e, 2);
        }
    }
}
