package ne1;

import bd1.C39758f;
import bd1.C39759i;
import com.tencent.p014mm.sdk.platformtools.Log;
import ei3.C86522b;
import gy3.C87412m;
import ht1.C46112m3;
import ht1.C8794p5;
import pe3.C89349b;
import te3.ly4;
import z04.C119027c;
import zc1.C66785b;

@C86522b
/* renamed from: ne1.h0 */
public final class C47233h0 extends C61685z0<String> implements C46112m3 {

    /* renamed from: e */
    public final String f126799e = "Finder.FinderModOverSeaAgree";

    public void s00(Boolean bool) {
        C61685z0.Ax0(this, C87412m.m108589b(bool, Boolean.TRUE) ? "remove_accept_protobuf" : "", (C8794p5) null, false, false, 12, (Object) null);
    }

    public C89349b vx0(Object obj) {
        String str = (String) obj;
        C87412m.m108594g(str, "cmdBufItem");
        byte[] bytes = str.getBytes(C119027c.f356488a);
        C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
        return C89349b.m111674a(bytes);
    }

    public int xx0() {
        return 15;
    }

    public String yx0() {
        return this.f126799e;
    }

    public void zx0(Object obj, int i) {
        String str = (String) obj;
        C87412m.m108594g(str, "cmdBufItem");
        String str2 = this.f126799e;
        Log.m105924i(str2, "retcode:" + i);
        if (C87412m.m108589b(str, "") && i == 0) {
            C66785b bVar = C66785b.f191882e;
            ly4 ly4 = bVar.mo90673n0().mo62397b().f140469j;
            if (ly4 == null) {
                ly4 = new ly4();
            }
            ly4.f137722d = 0;
            C39758f fVar = new C39758f();
            fVar.mo62397b().f140469j = ly4;
            bVar.mo90665S0(fVar, C39759i.MOD_OVERSEA);
        }
    }
}
