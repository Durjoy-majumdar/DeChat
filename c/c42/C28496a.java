package c42;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import f40.C86709a0;

/* renamed from: c42.a */
public class C28496a {
    /* renamed from: a */
    public static void m38227a(int i, int i2) {
        C85801v1 i3 = C86709a0.m107535s().mo121142i();
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_WALLET_HB_GETTIMELIMITPROMOT_TIMESTAMP_INT_SYNC;
        int intValue = ((Integer) i3.mo119685f(aVar, -1)).intValue();
        Log.m105925i("MicroMsg.GetTimeLimitPromotBlindBox", "new: [%s, %s], old: %s", Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(intValue));
        if (i2 > intValue) {
            C86709a0.m107535s().mo121142i().mo119677K(aVar, Integer.valueOf(i2));
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_HB_GETTIMELIMITPROMOT_PERCENT_INT_SYNC, Integer.valueOf(i));
        }
    }
}
