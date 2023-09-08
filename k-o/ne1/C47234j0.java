package ne1;

import com.tencent.p014mm.sdk.platformtools.Log;
import ei3.C86522b;
import gy3.C87412m;
import ht1.C8788n3;
import ht1.C8794p5;
import pe3.C89349b;
import te3.C50663od1;

@C86522b
/* renamed from: ne1.j0 */
public final class C47234j0 extends C61685z0<C50663od1> implements C8788n3 {

    /* renamed from: e */
    public final String f126800e = "Finder.FinderModPersonalizedSetting";

    public void Xu0(boolean z, int i) {
        C50663od1 od12 = new C50663od1();
        od12.f139095d = z ? 1 : 0;
        od12.f139096e = i;
        C61685z0.Ax0(this, od12, (C8794p5) null, false, false, 12, (Object) null);
    }

    public C89349b vx0(Object obj) {
        C50663od1 od12 = (C50663od1) obj;
        C87412m.m108594g(od12, "cmdBufItem");
        return C89349b.m111674a(od12.toByteArray());
    }

    public int xx0() {
        return 18;
    }

    public String yx0() {
        return this.f126800e;
    }

    public void zx0(Object obj, int i) {
        C50663od1 od12 = (C50663od1) obj;
        C87412m.m108594g(od12, "cmdBufItem");
        String str = this.f126800e;
        Log.m105924i(str, "opType=" + od12.f139095d + " scene=" + od12.f139096e + " retCode:" + i);
    }
}
