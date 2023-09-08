package hi0;

import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import p523fp.C32147e;
import te3.e75;
import te3.q75;

/* renamed from: hi0.n */
public final class C87501n extends C87491a<Boolean, q75> {
    /* renamed from: b */
    public Object mo58858b(String str, String str2, Object obj) {
        q75 q75 = (q75) obj;
        Class cls = C32147e.class;
        Log.m105924i("MicroMsg.AppBrand.CmdPullGlobalConf", "call");
        ((C32147e) C86312j.m106911c(cls)).b70(38, 1, -1, false);
        ((C32147e) C86312j.m106911c(cls)).Yi0(38);
        return Boolean.TRUE;
    }

    /* renamed from: d */
    public e75 mo58859d(Object obj) {
        q75 q75 = (q75) obj;
        if (q75 != null) {
            return q75.f140176d;
        }
        return null;
    }

    /* renamed from: e */
    public String mo58860e() {
        return "CmdPullGlobalConf";
    }
}
