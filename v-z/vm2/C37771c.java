package vm2;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import f40.C86709a0;
import f62.C31924c1;
import java.util.Map;
import l20.C21388a;
import ob0.C35136m;
import p327ct.C30914c;

/* renamed from: vm2.c */
public class C37771c implements C31924c1 {
    /* renamed from: o */
    public void mo8730o(String str, Map<String, String> map, C35136m.C35137a aVar) {
        C72994y1.C72995a aVar2 = C72994y1.C72995a.NEW_BANDAGE_DATASOURCE_DEVICE_PROTECT_STRING_SYNC;
        Class cls = C30914c.class;
        if (map != null) {
            String str2 = map.get(".sysmsg.security");
            if (!Util.isNullOrNil(str2)) {
                try {
                    int i = Util.getInt(str2, 0);
                    C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_DEVICE_PROTECT_SECURITY_STATUS_INT_SYNC, Integer.valueOf(i));
                    if (i != 0) {
                        ((C21388a) ((C30914c) C86312j.m106911c(cls)).mo17862sM()).mo33508q(aVar2, true);
                    } else {
                        ((C21388a) ((C30914c) C86312j.m106911c(cls)).mo17862sM()).mo33508q(aVar2, false);
                    }
                } catch (Exception e) {
                    Log.printErrStackTrace("DeviceProtectRedSpotListener", e, "device protect security value is not number!", new Object[0]);
                }
            }
        }
    }
}
