package kd2;

import b63.C67188h0;
import b63.C67205s0;
import com.tencent.p014mm.plugin.offline.C69963m;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import gy3.C87412m;
import kd2.C76555c;
import y43.C79029b0;

/* renamed from: kd2.b */
public final class C76554b implements C76555c.C76556a {

    /* renamed from: a */
    public String f224078a = "";

    /* renamed from: a */
    public void mo106799a(String str) {
        C87412m.m108594g(str, "bindSerial");
        this.f224078a = str;
        C69963m.wx0().vx0().f201767b = str;
        Bankcard f = C79029b0.vx0().wx0().mo91324f(str);
        if (f == null) {
            return;
        }
        if (C67188h0.m79467b(f)) {
            C67205s0 wx02 = C79029b0.vx0().wx0();
            String str2 = f.field_bindSerial;
            wx02.getClass();
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_OFFLINE_ONLINE_BIND_SERIAL_STRING_SYNC, str2);
            return;
        }
        Log.m105928w("MicroMsg.OfflinePriorBankcardLogic", "can't set as default card: " + f.field_bindSerial + ", " + f.field_bankcardType);
    }

    /* renamed from: b */
    public void mo106800b() {
        Bankcard f = C79029b0.vx0().wx0().mo91324f(this.f224078a);
        if (f != null && !C67188h0.m79467b(f)) {
            reload();
        }
    }

    /* renamed from: c */
    public String mo106801c() {
        return this.f224078a;
    }

    /* renamed from: d */
    public Bankcard mo106802d(boolean z) {
        return C79029b0.vx0().wx0().mo91324f(this.f224078a);
    }

    public void reload() {
        this.f224078a = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_OFFLINE_ONLINE_BIND_SERIAL_STRING_SYNC, (Object) null);
        C69963m.wx0().vx0().f201767b = this.f224078a;
    }
}
