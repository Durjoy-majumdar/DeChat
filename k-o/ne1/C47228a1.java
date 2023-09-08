package ne1;

import com.tencent.p014mm.sdk.platformtools.Log;
import ei3.C86522b;
import gy3.C87412m;
import ht1.C46116t4;
import ht1.C8794p5;
import pe3.C89349b;
import te3.C50009jm1;

@C86522b
/* renamed from: ne1.a1 */
public final class C47228a1 extends C61685z0<C50009jm1> implements C46116t4 {

    /* renamed from: e */
    public final String f126795e = "Finder.FinderSwitchAccountSetting";

    /* renamed from: EG */
    public void mo71564EG(String str, C8794p5<C50009jm1> p5Var) {
        C87412m.m108594g(str, "username");
        C87412m.m108594g(p5Var, "callback");
        String str2 = this.f126795e;
        Log.m105924i(str2, "[onSwitchAccount], username: " + str);
        C50009jm1 jm12 = new C50009jm1();
        jm12.f136196d = str;
        C61685z0.Ax0(this, jm12, p5Var, false, false, 12, (Object) null);
    }

    public C89349b vx0(Object obj) {
        C50009jm1 jm12 = (C50009jm1) obj;
        C87412m.m108594g(jm12, "cmdBufItem");
        return C89349b.m111674a(jm12.toByteArray());
    }

    public int xx0() {
        return 21;
    }

    public String yx0() {
        return this.f126795e;
    }

    public void zx0(Object obj, int i) {
        C50009jm1 jm12 = (C50009jm1) obj;
        C87412m.m108594g(jm12, "cmdBufItem");
        String str = this.f126795e;
        Log.m105924i(str, "[handleUpdateResult], retCode:" + i + ", username: " + jm12.f136196d);
    }
}
