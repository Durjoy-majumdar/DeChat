package z43;

import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.v1$$c;
import di3.C86312j;
import f40.C86709a0;
import p763ym.C39073u;
import y43.C79029b0;

/* renamed from: z43.e */
public class C39309e implements v1$$c {
    public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
        C79029b0 vx02 = C79029b0.vx0();
        vx02.getClass();
        Class cls = C39073u.class;
        if (Util.nullAsInt(obj, 0) == 339975) {
            C86709a0.m107528h();
            int intValue = ((Integer) C86709a0.m107535s().mo121142i().mo119684e(339975, 0)).intValue();
            if (intValue != vx02.f232043d) {
                ((C39073u) C86312j.m106911c(cls)).reset();
                vx02.f232043d = intValue;
                return;
            }
            return;
        }
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_WALLET_REGION_TYPE_INT_SYNC;
        if (aVar.equals(obj)) {
            C86709a0.m107528h();
            int intValue2 = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(aVar, 0)).intValue();
            if (intValue2 != vx02.f232044e) {
                ((C39073u) C86312j.m106911c(cls)).reset();
                vx02.f232044e = intValue2;
            }
        }
    }
}
