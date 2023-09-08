package ne1;

import com.tencent.p014mm.sdk.platformtools.Log;
import ei3.C86522b;
import gy3.C87412m;
import ht1.C8790o3;
import ht1.C8794p5;
import pe3.C89349b;
import te3.C51813wc1;

@C86522b
/* renamed from: ne1.z */
public final class C47238z extends C61685z0<C51813wc1> implements C8790o3 {

    /* renamed from: e */
    public final String f126804e = "Finder.FinderModFeedReproduce";

    public C89349b vx0(Object obj) {
        C51813wc1 wc12 = (C51813wc1) obj;
        C87412m.m108594g(wc12, "cmdBufItem");
        return C89349b.m111674a(wc12.toByteArray());
    }

    public int xx0() {
        return 9;
    }

    public String yx0() {
        return this.f126804e;
    }

    public void zu0(boolean z) {
        C51813wc1 wc12 = new C51813wc1();
        wc12.f143961d = z ^ true ? 1 : 0;
        C61685z0.Ax0(this, wc12, (C8794p5) null, false, false, 12, (Object) null);
    }

    public void zx0(Object obj, int i) {
        C87412m.m108594g((C51813wc1) obj, "cmdBufItem");
        String str = this.f126804e;
        Log.m105918d(str, "retcode:" + i);
    }
}
