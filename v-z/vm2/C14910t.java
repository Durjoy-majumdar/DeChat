package vm2;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C45628s0;
import f62.C31924c1;
import ft3.C8206g;
import java.util.Map;
import ke3.C88144b;
import ob0.C35136m;
import p156gj.C87203t;

/* renamed from: vm2.t */
public class C14910t implements C31924c1 {
    /* renamed from: o */
    public void mo8730o(String str, Map<String, String> map, C35136m.C35137a aVar) {
        if (map == null) {
            return;
        }
        if (!C45628s0.m50756U()) {
            Log.m105924i("WeChatServiceChooseListener", "showWCOpenService onNewXmlReceived, isWeChatUser = no.");
            return;
        }
        String str2 = map.get(".sysmsg.showWCOpenService.deviceid");
        if (Util.isNullOrNil(str2)) {
            Log.m105924i("WeChatServiceChooseListener", "showWCOpenService onNewXmlReceived, deviceUUIdStr = null.");
        } else if (C8206g.f27135a.mo9260a(str2, C87203t.m108273i(), "showWCOpenService", false)) {
            C88144b.m109791i(MMApplicationContext.getContext(), "setting", ".ui.setting.SettingsManageFindOtherServiceUI", new Intent(), (Bundle) null);
        }
    }
}
