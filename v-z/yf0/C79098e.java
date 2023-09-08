package yf0;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import lp3.C46888b;
import lp3.C88643g;
import ob0.C11385n;
import ob0.C117747y;
import te3.C77933g43;
import te3.C77983q;
import zf0.C79327i;

/* renamed from: yf0.e */
public class C79098e implements C11385n {

    /* renamed from: d */
    public C77933g43 f232249d;

    /* renamed from: e */
    public boolean f232250e;

    /* renamed from: f */
    public C46888b f232251f;

    public C79098e() {
    }

    /* renamed from: a */
    public int mo109031a() {
        C86709a0.m107528h();
        return ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_AA_MAX_PAYER_NUM_INT, 20)).intValue();
    }

    /* renamed from: b */
    public long mo109032b() {
        C86709a0.m107528h();
        return ((Long) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_AA_MAX_PER_AMOUNT_LONG, 200000L)).longValue();
    }

    /* renamed from: c */
    public int mo109033c() {
        C86709a0.m107528h();
        return ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_AA_MAX_TOTAL_USER_NUM_INT, 20)).intValue();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105925i("MicroMsg.AAOperationData", "get AAOperation, onSceneEnd, errType: %s, errCode: %s", Integer.valueOf(i), Integer.valueOf(i2));
        if (i == 0 && i2 == 0) {
            C77983q qVar = ((C79327i) yVar).f232889e;
            Log.m105925i("MicroMsg.AAOperationData", "get AAOperation data, retCode: %s, retMsg: %s, max_payer_num: %s, max_receiver_num: %s, max_total_num: %s, max_total_amount: %s, max_per_amount: %s, notice: %s, notice_url: %s,response.default_mod:%s", Integer.valueOf(qVar.f228097d), qVar.f228098e, Integer.valueOf(qVar.f228099f), Integer.valueOf(qVar.f228100g), Integer.valueOf(qVar.f228101h), Long.valueOf(qVar.f228102i), Long.valueOf(qVar.f228103j), qVar.f228104n, qVar.f228105o, Integer.valueOf(qVar.f228106p));
            if (qVar.f228097d == 0) {
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_AA_MAX_PAYER_NUM_INT, Integer.valueOf(qVar.f228099f));
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_AA_MAX_RECEIVER_NUM_INT, Integer.valueOf(qVar.f228100g));
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_AA_MAX_TOTAL_USER_NUM_INT, Integer.valueOf(qVar.f228101h));
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_AA_MAX_TOTAL_AMOUNT_LONG, Long.valueOf(qVar.f228102i));
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_AA_MAX_PER_AMOUNT_LONG, Long.valueOf(qVar.f228103j));
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_AA_DEFAULT_INT, Integer.valueOf(qVar.f228106p));
                C79098e eVar = new C79098e(qVar.f228105o, qVar.f228104n);
                eVar.f232249d = qVar.f228107q;
                eVar.f232250e = qVar.f228108r;
                C115669n.INSTANCE.idkeyStat(407, 33, 1, false);
                C88643g.m110553k(this.f232251f, eVar);
                return;
            }
            C88643g.m110544b().mo72091a(Boolean.FALSE);
            C115669n.INSTANCE.idkeyStat(407, 35, 1, false);
            return;
        }
        C88643g.m110544b().mo72091a(Boolean.FALSE);
        C115669n.INSTANCE.idkeyStat(407, 34, 1, false);
    }

    public C79098e(String str, String str2) {
    }
}
