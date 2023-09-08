package vm2;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import f62.C31924c1;
import java.util.Map;
import ke3.C88144b;
import ob0.C35136m;

/* renamed from: vm2.p */
public class C14908p implements C31924c1 {
    /* renamed from: o */
    public void mo8730o(String str, Map<String, String> map, C35136m.C35137a aVar) {
        if (map != null) {
            String str2 = map.get(".sysmsg.showtrustedfriends.wording");
            if (!Util.isNullOrNil(str2)) {
                Intent intent = new Intent();
                intent.putExtra("trust_friend_show_tips", str2);
                C88144b.m109791i(MMApplicationContext.getContext(), "setting", ".ui.setting.SettingsTrustFriendUI", intent, (Bundle) null);
            }
        }
    }
}
