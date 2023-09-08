package hi0;

import com.tencent.p014mm.plugin.appbrand.config.C81662k;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ii0.C87732a;
import lp3.C46888b;
import lp3.C88643g;
import te3.e75;
import te3.i75;

/* renamed from: hi0.f */
public class C87495f extends C87491a<Boolean, i75> {
    /* renamed from: b */
    public Object mo58858b(String str, String str2, Object obj) {
        i75 i75 = (i75) obj;
        if (!Util.isNullOrNil(str) || !Util.isNullOrNil(str2)) {
            C46888b b = C88643g.m110544b();
            b.mo72092b();
            int i = i75.f135158d.f132768f;
            C87732a.INSTANCE.mo122144a(i, 24);
            C81662k.m100192k(str, true, new C87493d(this, str, b, i), new C87494e(this));
            return Boolean.TRUE;
        }
        Log.m105920e("MicroMsg.AppBrand.Predownload.CmdGetContact", "invalid username & appId");
        return Boolean.FALSE;
    }

    /* renamed from: d */
    public e75 mo58859d(Object obj) {
        return ((i75) obj).f135158d;
    }

    /* renamed from: e */
    public String mo58860e() {
        return "CmdGetContact";
    }
}
