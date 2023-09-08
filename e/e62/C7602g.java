package e62;

import android.util.Base64;
import com.tencent.p014mm.autogen.events.UpdateExtDeviceEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import e62.C75554c;
import f62.C31924c1;
import gy3.C87412m;
import java.util.Iterator;
import java.util.Map;
import ob0.C35136m;

/* renamed from: e62.g */
public final class C7602g implements C31924c1 {

    /* renamed from: d */
    public final String f25869d = "MicroMsg.PushLoginUrlAutoLoginSwitchUpdateNewXmlReceived";

    /* renamed from: o */
    public void mo8730o(String str, Map<String, String> map, C35136m.C35137a aVar) {
        if (C87412m.m108589b("PushLoginUrlAutoLoginSwitchUpdate", str) && map != null) {
            String nullAsNil = Util.nullAsNil(map.get(".sysmsg.PushLoginUrlAutoLoginSwitchUpdate.deviceid"));
            int safeParseInt = Util.safeParseInt(map.get(".sysmsg.PushLoginUrlAutoLoginSwitchUpdate.setting"));
            String str2 = this.f25869d;
            Log.m105924i(str2, "receive xml, deviceid:" + nullAsNil + ", setting:" + safeParseInt);
            boolean z = safeParseInt == 1;
            try {
                Iterator<C75554c.C75555b> it = C75554c.m90589l1().iterator();
                while (it.hasNext()) {
                    C75554c.C75555b next = it.next();
                    if (Util.isEqual(Base64.encodeToString(next.f182215e.f257327a, 2), nullAsNil)) {
                        next.f221961C = z;
                        new UpdateExtDeviceEvent().publish();
                        return;
                    }
                }
            } catch (Exception e) {
                Log.m105921e("MicroMsg.NetSceneGetOnlineInfo", "updateAutoLoginStatus %s, %s", e.getClass().getSimpleName(), e.getMessage());
            }
        }
    }
}
