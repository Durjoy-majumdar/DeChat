package p704tv;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f62.C31924c1;
import ge0.C32415b;
import java.util.Map;
import ob0.C35136m;
import re0.C36308e;

/* renamed from: tv.o */
public class C37271o implements C31924c1 {
    /* renamed from: o */
    public void mo8730o(String str, Map<String, String> map, C35136m.C35137a aVar) {
        String str2;
        try {
            str2 = aVar.f94242a.f227628e.f141175d;
        } catch (Throwable unused) {
            str2 = null;
        }
        Log.m105925i("MicroMsg.PluginOpenIM", "OpenIMArchivePopUp fromUser:%s newxml:%s", str2, map);
        String str3 = map.get(".sysmsg.privacy_agreement_url");
        if (!Util.isNullOrNil(str3)) {
            ((C32415b) C86312j.m106911c(C32415b.class)).mo58603iN().replace(new C36308e(str2, str3));
        }
    }
}
