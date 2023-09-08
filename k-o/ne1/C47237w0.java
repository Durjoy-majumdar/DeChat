package ne1;

import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import ei3.C86522b;
import gy3.C87412m;
import ht1.C33056k3;
import ht1.C8794p5;
import pe3.C89349b;
import te3.C49545gd1;
import up1.C52599l0;

@C86522b
/* renamed from: ne1.w0 */
public final class C47237w0 extends C61685z0<C49545gd1> implements C33056k3 {

    /* renamed from: e */
    public final String f126803e = "Finder.FinderMsgSessionMuteSetting";

    /* renamed from: Cj */
    public void mo58970Cj(boolean z, String str) {
        C87412m.m108594g(str, "session");
        C49545gd1 gd12 = new C49545gd1();
        gd12.f133973d = z ? 1 : 0;
        gd12.f133974e = str;
        C61685z0.Ax0(this, gd12, (C8794p5) null, false, false, 12, (Object) null);
    }

    public C89349b vx0(Object obj) {
        C49545gd1 gd12 = (C49545gd1) obj;
        C87412m.m108594g(gd12, "cmdBufItem");
        return C89349b.m111674a(gd12.toByteArray());
    }

    public int xx0() {
        return 7;
    }

    public String yx0() {
        return this.f126803e;
    }

    public void zx0(Object obj, int i) {
        C49545gd1 gd12 = (C49545gd1) obj;
        C87412m.m108594g(gd12, "cmdBufItem");
        String str = this.f126803e;
        Log.m105918d(str, "retcode:" + i);
        if (i == 0) {
            C52599l0 Ox0 = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).mo76736Au();
            String str2 = gd12.f133974e;
            if (str2 == null) {
                str2 = "";
            }
            Ox0.mo73557Ow(str2, gd12.f133973d);
            return;
        }
        C115669n.INSTANCE.mo175913w(1473, 8, 1);
    }
}
