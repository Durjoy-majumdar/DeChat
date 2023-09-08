package com.tencent.p014mm.plugin.luckymoney.model;

import android.util.Base64;
import com.tencent.kinda.framework.app.KindaConfigCacheStg;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import f32.C75672b;
import f40.C86709a0;
import java.io.IOException;
import te3.C77973op3;

/* renamed from: com.tencent.mm.plugin.luckymoney.model.k1 */
public class C69239k1 {

    /* renamed from: a */
    public C69273y f199260a;

    /* renamed from: b */
    public C69230i f199261b;

    public C69239k1() {
        mo95394b();
    }

    /* renamed from: a */
    public C69273y mo95393a() {
        if (this.f199260a == null) {
            mo95394b();
        }
        return this.f199260a;
    }

    /* renamed from: b */
    public final void mo95394b() {
        this.f199260a = new C69273y();
        C86709a0.m107528h();
        String str = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_LUCKY_MONEY_UNION_CONFIG_STRING_SYNC, (Object) null);
        if (Util.isNullOrNil(str)) {
            C69273y yVar = this.f199260a;
            yVar.f199372e = 2000.0d;
            yVar.f199371d = 100;
            yVar.f199376i = 200.0d;
            yVar.f199377j = 0.01d;
            yVar.f199375h = 200.0d;
        } else {
            try {
                this.f199260a.parseFrom(str.getBytes(KindaConfigCacheStg.SAVE_CHARSET));
                mo95395c();
            } catch (Exception e) {
                Log.m105928w("MicroMsg.LuckyMoneyUnionConfigManager", "parseConfig exp, " + e.getLocalizedMessage());
                C69273y yVar2 = this.f199260a;
                yVar2.f199372e = 2000.0d;
                yVar2.f199371d = 100;
                yVar2.f199376i = 200.0d;
                yVar2.f199377j = 0.01d;
                yVar2.f199375h = 200.0d;
            }
        }
        Log.m105924i("MicroMsg.LuckyMoneyUnionConfigManager", "LuckyMoneyConfig init maxTotalAmount:" + this.f199260a.f199372e + " maxTotalNum:" + this.f199260a.f199371d + " perGroupMaxValue:" + this.f199260a.f199376i + " perMinValue:" + this.f199260a.f199377j + " perPersonMaxValue:" + this.f199260a.f199375h);
    }

    /* renamed from: c */
    public final void mo95395c() {
        C69273y yVar = this.f199260a;
        if (yVar != null) {
            C69230i a = C69230i.m81575a(yVar.f199384t);
            this.f199261b = a;
            if (a != null && a.f199197a != null) {
                ((C75672b) C86312j.m106911c(C75672b.class)).mo95325nE(this.f199261b.f199197a);
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_LUCKY_MONEY_ENVELOPE_HAS_SOURCE_INT_SYNC, 1);
                if (!Util.isNullOrNil(this.f199260a.f199385u)) {
                    Log.m105918d("MicroMsg.LuckyMoneyUnionConfigManager", "parse cover info");
                    try {
                        this.f199261b.f199197a.f228208o = ((C77973op3) new C77973op3().parseFrom(Base64.decode(this.f199260a.f199385u, 0))).f227962u;
                    } catch (IOException e) {
                        Log.printErrStackTrace("MicroMsg.LuckyMoneyUnionConfigManager", e, "", new Object[0]);
                    }
                }
            }
        }
    }
}
