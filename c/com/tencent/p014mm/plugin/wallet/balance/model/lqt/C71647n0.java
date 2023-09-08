package com.tencent.p014mm.plugin.wallet.balance.model.lqt;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import java.io.IOException;
import org.xwalk.core.XWalkEnvironment;
import sf0.C90188n0;
import te3.C78016y53;
import ub3.C78144b;
import z04.C119027c;

/* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.n0 */
public class C71647n0 {

    /* renamed from: b */
    public static C71647n0 f207650b;

    /* renamed from: a */
    public C78016y53 f207651a;

    /* renamed from: b */
    public static C71647n0 m84120b() {
        if (f207650b == null) {
            f207650b = new C71647n0();
        }
        return f207650b;
    }

    /* renamed from: a */
    public C78016y53 mo98815a() {
        if (this.f207651a == null) {
            Log.m105918d("MicroMsg.LqtOnClickRedeemCache", "cache is null");
            String str = (String) ((C78144b) C86312j.m106911c(C78144b.class)).mo107980OI().mo119992d(C72994y1.C72995a.USERINFO_LQT_REDEEM_CACHE_STRING_SYNC, "");
            if (!Util.isNullOrNil(str)) {
                try {
                    this.f207651a = (C78016y53) new C78016y53().parseFrom(str.getBytes(C119027c.f356489b));
                } catch (IOException e) {
                    Log.printErrStackTrace("MicroMsg.LqtOnClickRedeemCache", e, "", new Object[0]);
                }
            }
        }
        return this.f207651a;
    }

    /* renamed from: c */
    public void mo98816c(C78016y53 y532) {
        Log.m105925i("MicroMsg.LqtOnClickRedeemCache", "setCache OnClickRedeemRes balance %s, bank_balance %s, lq_balance %s", Integer.valueOf(y532.f228553f), Integer.valueOf(y532.f228555h), Integer.valueOf(y532.f228554g));
        this.f207651a = y532;
        try {
            ((C78144b) C86312j.m106911c(C78144b.class)).mo107980OI().mo119993e(C72994y1.C72995a.USERINFO_LQT_REDEEM_CACHE_STRING_SYNC, new String(y532.toByteArray(), C119027c.f356489b));
        } catch (IOException e) {
            Log.printErrStackTrace("MicroMsg.LqtOnClickRedeemCache", e, "", new Object[0]);
        }
        if (C90188n0.f258926T) {
            C78016y53 y533 = this.f207651a;
            y533.f228553f = XWalkEnvironment.TEST_APK_START_VERSION;
            y533.f228555h = 50000000;
            y533.f228554g = 50000000;
        }
    }
}
