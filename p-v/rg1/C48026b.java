package rg1;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import ei3.C86522b;
import gy3.C87412m;
import ht1.C46104b3;
import ht1.C8794p5;
import ne1.C61685z0;
import pe3.C89349b;
import te3.C52245zc1;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: rg1.b */
public final class C48026b extends C61685z0<C52245zc1> implements C46104b3 {

    /* renamed from: e */
    public final String f128824e = "Finder.FinderLiveNotifyRejectService";

    /* renamed from: hS */
    public void mo71546hS(String str, boolean z, C8794p5<C52245zc1> p5Var) {
        C87412m.m108594g(str, "userName");
        C52245zc1 zc12 = new C52245zc1();
        zc12.f145803d = str;
        zc12.f145804e = z ? 1 : 0;
        C61685z0.Ax0(this, zc12, p5Var, false, false, 12, (Object) null);
    }

    public C89349b vx0(Object obj) {
        C52245zc1 zc12 = (C52245zc1) obj;
        C87412m.m108594g(zc12, "cmdBufItem");
        return C89349b.m111674a(zc12.toByteArray());
    }

    public int xx0() {
        return 16;
    }

    public String yx0() {
        return this.f128824e;
    }

    public void zx0(Object obj, int i) {
        C87412m.m108594g((C52245zc1) obj, "cmdBufItem");
        String str = this.f128824e;
        Log.m105918d(str, "retcode:" + i);
    }
}
