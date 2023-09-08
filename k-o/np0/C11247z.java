package np0;

import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.plugin.appbrand.app.C1510o;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f62.C31922b1;
import java.util.Map;
import ob0.C35136m;
import ob0.C47350c;
import sf0.C48374j0;
import te3.C50526nd2;
import te3.C50664od2;

/* renamed from: np0.z */
public enum C11247z implements C31922b1 {
    INSTANCE;

    /* renamed from: X5 */
    public C35136m.C35139b mo10269X5(String str, Map<String, String> map, C35136m.C35137a aVar) {
        if (str == null || !str.equals("UpdateWxaUserSwitchNotify")) {
            Log.m105920e("MicroMsg.WxaNotifySwitchMsgHandler", "subType not match, return");
            return null;
        }
        Log.m105925i("MicroMsg.WxaNotifySwitchMsgHandler", "consumeNewXml subType:%s", str);
        if (Util.isNullOrNil(C48374j0.m53718g(aVar.f94242a.f227631h))) {
            Log.m105928w("MicroMsg.WxaNotifySwitchMsgHandler", "msg content is null");
            return null;
        }
        C11245j jVar = C11245j.INSTANCE;
        for (String next : map.keySet()) {
            if (next.startsWith(".sysmsg.UpdateWxaUserSwitchNotify.")) {
                C1510o.f10864a.mo1516a().putInt(next, Util.getInt(map.get(next), 0));
            }
        }
        C50526nd2 nd22 = new C50526nd2();
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 2709;
        bVar.f127068c = "/cgi-bin/mmbiz-bin/wxabusiness/getuserswitch";
        bVar.f127066a = nd22;
        bVar.f127067b = new C50664od2();
        ((C40324j) C86312j.m106911c(C40324j.class)).mo63014eH(bVar.mo72403a(), new j$$a(jVar));
        return null;
    }
}
