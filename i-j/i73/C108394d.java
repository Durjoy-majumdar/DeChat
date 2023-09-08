package i73;

import android.util.Base64;
import b73.C28273c;
import com.tencent.p014mm.autogen.events.UpdateGestureProtectInfoEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C85801v1;
import di3.C86312j;
import e73.C107243a;
import f40.C86709a0;
import g73.C107759d;
import g73.C107761f;
import g73.C107762g;
import java.io.IOException;
import te3.C64576nb3;

/* renamed from: i73.d */
public class C108394d extends IStaticListener<UpdateGestureProtectInfoEvent> {
    public boolean callback(IEvent iEvent) {
        C64576nb3 nb32 = ((UpdateGestureProtectInfoEvent) iEvent).f193985d.f193986a;
        C107761f.f322498a = -1;
        C107243a.f320886a = -1;
        boolean h = C107762g.m146000h(nb32);
        if (h) {
            Log.m105925i("MicroMsg.WalletLockInitTask", "tom update PatternLockInfo, sign_len:%d,valid:%b,status:%d,ver:%d", Integer.valueOf(nb32.f184453e.f140572d), Boolean.valueOf(h), Integer.valueOf(nb32.f184454f), Integer.valueOf(nb32.f184452d));
            Log.m105925i("MicroMsg.GestureGuardInfoManager", "alvinluo saveSyncedPatternInfo version: %d, status: %d", Integer.valueOf(nb32.f184452d), Integer.valueOf(nb32.f184454f));
            C85801v1 i = C86709a0.m107535s().mo121142i();
            if (i != null) {
                try {
                    i.mo119676J(339990, Base64.encodeToString(nb32.toByteArray(), 2));
                    i.mo119681a(true);
                } catch (IOException e) {
                    Log.printErrStackTrace("MicroMsg.GestureGuardInfoManager", e, "", new Object[0]);
                }
            }
        } else {
            Log.m105928w("MicroMsg.WalletLockInitTask", "UserInfoExt.PatternLockInfo is null or invalid.");
        }
        boolean e2 = C107762g.m145997e();
        Log.m105925i("MicroMsg.WalletLockInitTask", "alvinluo after update gesture server info, isUserSetGesturePwd: %b", Boolean.valueOf(e2));
        C107759d.m145974d(e2);
        ((C28273c) C86312j.m106911c(C28273c.class)).mo55895Jf().init();
        return false;
    }
}
