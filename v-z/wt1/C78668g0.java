package wt1;

import android.os.Build;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import pv2.C77290d;
import tt1.C78088b;
import tt1.C78089c;
import wt1.C78709x;

/* renamed from: wt1.g0 */
public final class C78668g0 implements C78088b {

    /* renamed from: a */
    public final /* synthetic */ C78709x f230368a;

    public C78668g0(C78709x xVar) {
        this.f230368a = xVar;
    }

    /* renamed from: a */
    public final void mo107892a(C78089c cVar) {
        Log.m105925i("MicroMsg.WalletOpenTouchPayAfterPayFinishUIC", "authentication result: %s", Integer.valueOf(cVar.f228884a));
        int i = cVar.f228884a;
        if (i == 0) {
            Log.m105924i("MicroMsg.WalletOpenTouchPayAfterPayFinishUIC", "identify success");
            C115669n.INSTANCE.mo175911u(1104, 40);
            this.f230368a.mo108648d3(new C78709x.C78710a.C78714d(cVar.f228888e, cVar.f228889f));
        } else if (i == 2005) {
            C77290d.m93109g(1000, -1000223, i, "fingerprint error");
            C115669n.INSTANCE.mo175911u(1104, 39);
            C78709x xVar = this.f230368a;
            xVar.mo108647c3(new C78709x.C78719b.C78721b(xVar.getString(C0966R.string.jlh)));
        } else if (i == 2007) {
            String string = (Build.VERSION.SDK_INT != 27 || !C87412m.m108589b("Xiaomi", Build.MANUFACTURER)) ? this.f230368a.getString(C0966R.string.jle) : this.f230368a.getString(C0966R.string.amo);
            C77290d.m93109g(1000, -1000223, cVar.f228884a, "fingerprint error");
            C115669n.INSTANCE.mo175911u(1104, 39);
            this.f230368a.mo108647c3(new C78709x.C78719b.C78721b(string));
        } else if (i == 10308) {
            C77290d.m93109g(6, -1000223, -1, "too many trial");
            C78709x xVar2 = this.f230368a;
            xVar2.mo108647c3(new C78709x.C78719b.C78722c(xVar2.getString(C0966R.string.m9g), this.f230368a.getString(C0966R.string.jlg)));
        } else if (i != 2009) {
            if (i != 2010) {
                switch (i) {
                    case 2000:
                    case 2001:
                        break;
                    case 2002:
                        Log.m105924i("MicroMsg.WalletOpenTouchPayAfterPayFinishUIC", "identify FingerPrintConst.RESULT_NO_MATCH");
                        return;
                    default:
                        C78709x xVar3 = this.f230368a;
                        xVar3.mo108647c3(new C78709x.C78719b.C78721b(xVar3.getString(C0966R.string.jle)));
                        return;
                }
            }
            Log.m105924i("MicroMsg.WalletOpenTouchPayAfterPayFinishUIC", "identify timeout");
            this.f230368a.mo108648d3(new C78709x.C78710a.C78716f(cVar.f228884a));
        } else {
            Log.m105925i("MicroMsg.WalletOpenTouchPayAfterPayFinishUIC", "hy: on error: %d", Integer.valueOf(i));
            C77290d.m93109g(1000, -1000223, cVar.f228884a, "fingerprint error");
            C77290d.m93103a(3, 2);
            C78709x xVar4 = this.f230368a;
            xVar4.mo108647c3(new C78709x.C78719b.C78721b(xVar4.getString(C0966R.string.jle)));
        }
    }
}
