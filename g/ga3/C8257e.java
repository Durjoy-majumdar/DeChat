package ga3;

import android.content.Intent;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C31543z5;
import f62.C31924c1;
import ft3.C8206g;
import java.util.Map;
import ob0.C35136m;
import p156gj.C87203t;
import p214om.C11502f;

/* renamed from: ga3.e */
public class C8257e implements C31924c1 {
    /* renamed from: o */
    public void mo8730o(String str, Map<String, String> map, C35136m.C35137a aVar) {
        if (map != null) {
            Log.m105925i("GotoFileHelperChattingUI", "goto_file_helper onNewXmlReceived, values: %s", map);
            if (C8206g.f27135a.mo9260a(map.get(".sysmsg.goto_file_helper.deviceid"), C87203t.m108273i(), "goto_file_helper", true)) {
                if (Math.abs(((long) C31543z5.m39455e()) - Util.getLong(map.get(".sysmsg.goto_file_helper.authtime"), 0)) <= 60) {
                    Intent intent = new Intent();
                    intent.addFlags(268435456);
                    intent.putExtra("Chat_User", "filehelper");
                    ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93173f(intent, MMApplicationContext.getContext());
                    return;
                }
                return;
            }
            return;
        }
        Log.m105920e("GotoFileHelperChattingUI", "goto_file_helper error, no values");
    }
}
