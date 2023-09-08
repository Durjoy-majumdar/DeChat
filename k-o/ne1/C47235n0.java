package ne1;

import com.tencent.p014mm.sdk.platformtools.Log;
import ei3.C86522b;
import gy3.C87412m;
import ht1.C8793p3;
import ht1.C8794p5;
import pe3.C89349b;
import te3.C48697ad1;

@C86522b
/* renamed from: ne1.n0 */
public final class C47235n0 extends C61685z0<C48697ad1> implements C8793p3 {

    /* renamed from: e */
    public final String f126801e = "Finder.FinderModRecommendSetting";

    /* renamed from: sA */
    public void mo9626sA(boolean z) {
        C48697ad1 ad12 = new C48697ad1();
        ad12.f130443d = z ? 1 : 0;
        C61685z0.Ax0(this, ad12, (C8794p5) null, false, false, 12, (Object) null);
    }

    public C89349b vx0(Object obj) {
        C48697ad1 ad12 = (C48697ad1) obj;
        C87412m.m108594g(ad12, "cmdBufItem");
        return C89349b.m111674a(ad12.toByteArray());
    }

    public int xx0() {
        return 5;
    }

    public String yx0() {
        return this.f126801e;
    }

    public void zx0(Object obj, int i) {
        C87412m.m108594g((C48697ad1) obj, "cmdBufItem");
        String str = this.f126801e;
        Log.m105924i(str, "retcode:" + i);
    }
}
