package qa1;

import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import h81.C32735h;
import p206nj.C11171e;
import p653pv.C35688c;

/* renamed from: qa1.d */
public final class C35820d implements C35819c {
    /* renamed from: a */
    public void mo60432a() {
        boolean z = true;
        if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_android_new_msg_ringtone_setting_sw, 1) != 1) {
            z = false;
        }
        Log.m105924i("MicroMsg.NewMsgRingtoneSingleton", "trigger ringtoneSw:" + z);
        if (C11171e.m11046c(26) && !z) {
            ((C35688c) C86312j.m106911c(C35688c.class)).r60("");
        }
    }
}
