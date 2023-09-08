package com.tencent.p014mm.plugin.luckymoney.model;

import com.tencent.kinda.framework.app.KindaConfigCacheStg;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;

/* renamed from: com.tencent.mm.plugin.luckymoney.model.y0 */
public class C69274y0 {

    /* renamed from: a */
    public C69273y f199391a;

    public C69274y0() {
        mo95412a();
    }

    /* renamed from: a */
    public final void mo95412a() {
        this.f199391a = new C69273y();
        C86709a0.m107528h();
        String str = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_LUCKY_MONEY_HK_CONFIG_STRING_SYNC, (Object) null);
        if (Util.isNullOrNil(str)) {
            C69273y yVar = this.f199391a;
            yVar.f199372e = 2000.0d;
            yVar.f199371d = 100;
            yVar.f199376i = 200.0d;
            yVar.f199377j = 0.01d;
            yVar.f199375h = 200.0d;
        } else {
            try {
                this.f199391a.parseFrom(str.getBytes(KindaConfigCacheStg.SAVE_CHARSET));
            } catch (Exception e) {
                Log.m105928w("MicroMsg.LuckyMoneyHKConfigManager", "parseConfig exp, " + e.getLocalizedMessage());
                C69273y yVar2 = this.f199391a;
                yVar2.f199372e = 2000.0d;
                yVar2.f199371d = 100;
                yVar2.f199376i = 200.0d;
                yVar2.f199377j = 0.01d;
                yVar2.f199375h = 200.0d;
            }
        }
        Log.m105924i("MicroMsg.LuckyMoneyHKConfigManager", "LuckyMoneyConfig init maxTotalAmount:" + this.f199391a.f199372e + " maxTotalNum:" + this.f199391a.f199371d + " perGroupMaxValue:" + this.f199391a.f199376i + " perMinValue:" + this.f199391a.f199377j + " perPersonMaxValue:" + this.f199391a.f199375h);
    }
}
