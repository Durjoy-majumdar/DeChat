package yq3;

import bp3.C104160f;
import bp3.C79758p;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import di3.C86312j;
import h81.C32735h;
import p564iq.C87790d;

/* renamed from: yq3.b */
public class C79144b {

    /* renamed from: a */
    public static C79144b f232418a;

    /* renamed from: a */
    public static C79144b m95773a() {
        if (f232418a == null) {
            f232418a = new C79144b();
        }
        return f232418a;
    }

    /* renamed from: b */
    public boolean mo109087b() {
        return mo109088c(C32735h.C32737c.clicfg_open_kinda_bind_card, true);
    }

    /* renamed from: c */
    public final boolean mo109088c(C32735h.C32737c cVar, boolean z) {
        if (!((C87790d) C86312j.m106911c(C87790d.class)).isInstalled("kinda")) {
            return false;
        }
        if (WeChatBrands.Business.GROUP_OPEN.equals(BuildInfo.KINDA_DEFAULT)) {
            return true;
        }
        if ("close".equals(BuildInfo.KINDA_DEFAULT)) {
            return false;
        }
        int e = C79758p.f233760a.mo109882e(C104160f.RepairerConfig_Pay_KindaConfigEnable_Int, 0);
        if (e == 1) {
            return true;
        }
        if (e == 2) {
            return false;
        }
        boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(cVar, z);
        Log.m105925i("MicroMsg.TenPaySdkAbTest", "isKindaEnable svrConfig %s", Boolean.valueOf(wf));
        return wf || BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE;
    }

    /* renamed from: d */
    public boolean mo109089d() {
        return mo109088c(C32735h.C32737c.clicfg_pay_security_kinda_switch_android, false);
    }

    /* renamed from: e */
    public boolean mo109090e() {
        boolean z = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_android_tenpay_offline_cert_rsa_2048, 0) == 1;
        Log.m105925i("MicroMsg.TenPaySdkAbTest", "isOfflineOpen2048 %s", Boolean.valueOf(z));
        return z;
    }

    /* renamed from: f */
    public boolean mo109091f() {
        Log.m105925i("MicroMsg.TenPaySdkAbTest", "isPwdOpen2048 %s", Boolean.TRUE);
        return true;
    }
}
