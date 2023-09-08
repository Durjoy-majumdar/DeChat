package wt1;

import android.os.Build;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import pv2.C77290d;
import tt1.C78088b;
import tt1.C78089c;
import wt1.C78670h0;

/* renamed from: wt1.p0 */
public final class C78701p0 implements C78088b {

    /* renamed from: a */
    public final /* synthetic */ C78670h0 f230407a;

    public C78701p0(C78670h0 h0Var) {
        this.f230407a = h0Var;
    }

    /* renamed from: a */
    public final void mo107892a(C78089c cVar) {
        Log.m105925i("MicroMsg.WalletOpenTouchPayUIC", "authentication result: %s", Integer.valueOf(cVar.f228884a));
        int i = cVar.f228884a;
        if (i == 0) {
            Log.m105924i("MicroMsg.WalletOpenTouchPayUIC", "identify success");
            C115669n.INSTANCE.mo175911u(1104, 40);
            this.f230407a.mo108629d3(new C78670h0.C78671a.C78675d(cVar.f228888e, cVar.f228889f));
        } else if (i == 2005) {
            C77290d.m93109g(1000, -1000223, i, "fingerprint error");
            C115669n.INSTANCE.mo175911u(1104, 39);
            C78670h0 h0Var = this.f230407a;
            h0Var.mo108628c3(new C78670h0.C78680b.C78682b(h0Var.getString(C0966R.string.jlh)));
        } else if (i == 2007) {
            String string = (Build.VERSION.SDK_INT != 27 || !C87412m.m108589b("Xiaomi", Build.MANUFACTURER)) ? this.f230407a.getString(C0966R.string.jle) : this.f230407a.getString(C0966R.string.amo);
            C77290d.m93109g(1000, -1000223, cVar.f228884a, "fingerprint error");
            C115669n.INSTANCE.mo175911u(1104, 39);
            this.f230407a.mo108628c3(new C78670h0.C78680b.C78682b(string));
        } else if (i == 10308) {
            C77290d.m93109g(6, -1000223, -1, "too many trial");
            C78670h0 h0Var2 = this.f230407a;
            h0Var2.mo108628c3(new C78670h0.C78680b.C78683c(h0Var2.getString(C0966R.string.m9g), this.f230407a.getString(C0966R.string.jlg)));
        } else if (i != 2009) {
            if (i != 2010) {
                switch (i) {
                    case 2000:
                    case 2001:
                        break;
                    case 2002:
                        Log.m105924i("MicroMsg.WalletOpenTouchPayUIC", "identify FingerPrintConst.RESULT_NO_MATCH");
                        return;
                    default:
                        C78670h0 h0Var3 = this.f230407a;
                        h0Var3.mo108628c3(new C78670h0.C78680b.C78682b(h0Var3.getString(C0966R.string.jle)));
                        return;
                }
            }
            Log.m105924i("MicroMsg.WalletOpenTouchPayUIC", "identify timeout");
            this.f230407a.mo108629d3(new C78670h0.C78671a.C78677f(cVar.f228884a));
        } else {
            Log.m105925i("MicroMsg.WalletOpenTouchPayUIC", "hy: on error: %d", Integer.valueOf(i));
            C77290d.m93109g(1000, -1000223, cVar.f228884a, "fingerprint error");
            C77290d.m93103a(3, 2);
            C78670h0 h0Var4 = this.f230407a;
            h0Var4.mo108628c3(new C78670h0.C78680b.C78682b(h0Var4.getString(C0966R.string.jle)));
        }
    }
}
