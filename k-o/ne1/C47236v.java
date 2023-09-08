package ne1;

import com.tencent.p014mm.plugin.finder.service.C41490k1;
import com.tencent.p014mm.sdk.platformtools.Log;
import ei3.C86522b;
import gy3.C87412m;
import ht1.C8794p5;
import pe3.C89349b;
import te3.C49292ej1;

@C86522b
/* renamed from: ne1.v */
public final class C47236v extends C61685z0<C49292ej1> implements C41490k1 {

    /* renamed from: e */
    public final String f126802e = "Finder.FinderDelFansService";

    public void v70(String str, C8794p5<C49292ej1> p5Var) {
        C87412m.m108594g(str, "fansId");
        C49292ej1 ej12 = new C49292ej1();
        ej12.f132956d = str;
        C61685z0.Ax0(this, ej12, p5Var, false, false, 12, (Object) null);
    }

    public C89349b vx0(Object obj) {
        C49292ej1 ej12 = (C49292ej1) obj;
        C87412m.m108594g(ej12, "cmdBufItem");
        return C89349b.m111674a(ej12.toByteArray());
    }

    public int xx0() {
        return 14;
    }

    public String yx0() {
        return this.f126802e;
    }

    public void zx0(Object obj, int i) {
        C87412m.m108594g((C49292ej1) obj, "cmdBufItem");
        String str = this.f126802e;
        Log.m105918d(str, "retcode:" + i);
    }
}
