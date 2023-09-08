package ne1;

import bd1.C39758f;
import bd1.C39759i;
import com.tencent.p014mm.sdk.platformtools.Log;
import ei3.C86522b;
import gy3.C87412m;
import ht1.C8794p5;
import ht1.C8795q1;
import java.util.regex.Pattern;
import o40.C61926c;
import pe3.C89349b;
import te3.C51284sq2;
import z04.C119027c;
import zc1.C66785b;

@C86522b
/* renamed from: ne1.t */
public final class C11155t extends C61685z0<String> implements C8795q1 {

    /* renamed from: e */
    public final String f32935e = "Finder.FinderAgreeSavePhone";

    /* renamed from: ME */
    public void mo9627ME(Boolean bool) {
        C61685z0.Ax0(this, C87412m.m108589b(bool, Boolean.TRUE) ? "remove_allow_accept_phone" : "", (C8794p5) null, false, false, 12, (Object) null);
    }

    public C89349b vx0(Object obj) {
        String str = (String) obj;
        C87412m.m108594g(str, "cmdBufItem");
        byte[] bytes = str.getBytes(C119027c.f356488a);
        C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
        return C89349b.m111674a(bytes);
    }

    public int xx0() {
        return 17;
    }

    public String yx0() {
        return this.f32935e;
    }

    public void zx0(Object obj, int i) {
        String str = (String) obj;
        C87412m.m108594g(str, "cmdBufItem");
        String str2 = this.f32935e;
        Log.m105918d(str2, "retcode:" + i);
        if (C87412m.m108589b(str, "") && i == 0) {
            C66785b bVar = C66785b.f191882e;
            C39758f fVar = new C39758f();
            C51284sq2 d = fVar.mo62398d();
            int i2 = fVar.mo62398d().f141692x;
            Pattern pattern = C61926c.f176038a;
            d.f141692x = i2 | 8;
            bVar.mo90665S0(fVar, C39759i.AGREE_SAVE_PHONE);
        }
    }
}
