package ne1;

import com.tencent.p014mm.plugin.finder.service.C3601l1;
import com.tencent.p014mm.sdk.platformtools.Log;
import ei3.C86522b;
import gy3.C87412m;
import ht1.C8794p5;
import pe3.C89349b;
import te3.C51376tc1;

@C86522b
/* renamed from: ne1.x */
public final class C11156x extends C61685z0<C51376tc1> implements C3601l1 {

    /* renamed from: e */
    public final String f32936e = "Finder.FinderModBloclPosterSetting";

    public void Hu0(String str, boolean z, C8794p5<C51376tc1> p5Var) {
        C87412m.m108594g(str, "finderUserName");
        C51376tc1 tc12 = new C51376tc1();
        tc12.f142118e = z ? 1 : 0;
        tc12.f142117d = str;
        C61685z0.Ax0(this, tc12, p5Var, false, false, 12, (Object) null);
    }

    public C89349b vx0(Object obj) {
        C51376tc1 tc12 = (C51376tc1) obj;
        C87412m.m108594g(tc12, "cmdBufItem");
        return C89349b.m111674a(tc12.toByteArray());
    }

    public int xx0() {
        return 13;
    }

    public String yx0() {
        return this.f32936e;
    }

    public void zx0(Object obj, int i) {
        C51376tc1 tc12 = (C51376tc1) obj;
        C87412m.m108594g(tc12, "cmdBufItem");
        String str = this.f32936e;
        Log.m105924i(str, "opType=" + tc12.f142118e + " retcode:" + i);
    }
}
