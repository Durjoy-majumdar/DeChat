package qv2;

import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;
import lt3.C21460a;
import op3.C117877b;
import pv2.C77292s;
import ut3.C22662b;

/* renamed from: qv2.g */
public class C77438g implements C87581a<C117877b<Boolean, Boolean>, C117877b<Boolean, Boolean>> {
    public Object call(Object obj) {
        C117877b bVar = (C117877b) obj;
        String e = C77292s.m93118e(1);
        String d = C77292s.m93117d(1);
        boolean i = C21460a.m24275i(d);
        boolean i2 = C21460a.m24275i(e);
        Log.m105925i("MicroMsg.SoterProcessAuthkeyNameFunc", "need change authkey, new:[%s, %s], old:[%s, %s]", d, Boolean.valueOf(i), e, Boolean.valueOf(i2));
        if (!i && i2) {
            C22662b.m26538b().mo35774a().put(1, e);
        } else if (i && i2) {
            Log.m105924i("MicroMsg.SoterProcessAuthkeyNameFunc", "remove old ak");
            C21460a.m24284r(e, false);
        }
        C21460a.m24284r(C77292s.m93118e(2), false);
        C21460a.m24284r(C77292s.m93118e(3), false);
        return bVar;
    }
}
