package kj3;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72972g4;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;
import f62.C75700k0;
import g62.C75875l;
import h81.C32735h;
import kr0.C21378k0;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: kj3.d */
public class C33921d extends C86301e implements C21378k0 {
    /* renamed from: s */
    public boolean mo33475s() {
        C75875l LE = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE();
        if (LE == null) {
            Log.m105924i("MicroMsg.AppBrandNotifyMsgService", "get info storage fail");
            return false;
        }
        int Yx0 = ((C72972g4) LE).Yx0("appbrand_notify_message");
        Log.m105925i("MicroMsg.AppBrandNotifyMsgService", "conversation count: %d", Integer.valueOf(Yx0));
        if (Yx0 <= 1) {
            return false;
        }
        boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_android_appbrand_notify_msg_enable, false);
        Log.m105925i("MicroMsg.AppBrandNotifyMsgService", "showNotifyMsgPreference, isABtestEnable: %b", Boolean.valueOf(wf));
        return wf;
    }
}
