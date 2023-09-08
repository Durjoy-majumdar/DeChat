package qv2;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import hp3.C87581a;
import lp3.C46888b;
import lp3.C88643g;
import op3.C117877b;
import pv2.C35702n;
import pv2.C77292s;
import tt3.C22552d;
import yt3.C112486e;
import yt3.C23319f;

/* renamed from: qv2.b */
public class C110475b implements C87581a<C117877b<Boolean, Boolean>, C117877b<Boolean, Boolean>> {

    /* renamed from: a */
    public C46888b f330372a = null;

    /* renamed from: b */
    public int f330373b = -1;

    public Object call(Object obj) {
        C117877b bVar = (C117877b) obj;
        Log.m105926v("MicroMsg.SoterInitFunc", "alvinluo SoterInitFunc call");
        C112486e eVar = new C112486e((C112486e.C112487a) null);
        eVar.f336862a = C77292s.m93115b();
        eVar.f336865d = "WechatASK";
        eVar.f336863b = new int[]{1, 2, 3};
        eVar.f336864c = new C35702n();
        C110479i iVar = new C110479i(MMApplicationContext.getContext(), eVar);
        C46888b b = C88643g.m110544b();
        this.f330372a = b;
        b.mo72092b();
        iVar.f67031a = new C110474a(this);
        if (!C23319f.m27817c().mo36810a(iVar, new C22552d())) {
            Log.m105920e("MicroMsg.SoterInitFunc", "alvinluo: add soterTaskInitForWX failed.");
        } else {
            C115669n.INSTANCE.mo175911u(1104, 1);
        }
        Log.m105927v("MicroMsg.SoterInitFunc", "alvinluo pending %d", Long.valueOf(System.currentTimeMillis()));
        return bVar;
    }
}
