package com.tencent.p014mm.plugin.luckymoney.model;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;

/* renamed from: com.tencent.mm.plugin.luckymoney.model.r */
public class C4834r implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f19912d;

    /* renamed from: e */
    public final /* synthetic */ int f19913e;

    /* renamed from: f */
    public final /* synthetic */ int f19914f;

    public C4834r(String str, int i, int i2) {
        this.f19912d = str;
        this.f19913e = i;
        this.f19914f = i2;
    }

    public void run() {
        String str = this.f19912d;
        int i = this.f19913e;
        int i2 = this.f19914f;
        try {
            long currentTicks = Util.currentTicks();
            String str2 = null + i2;
            Log.m105925i("MicroMsg.LuckMoneyEffectResourceMgr", "on saveEffectResource: %s %s %s %s", str, Integer.valueOf(i), Integer.valueOf(i2), str2);
            C86013q1.m106436R(str, str2);
            Log.m105925i("MicroMsg.LuckMoneyEffectResourceMgr", "saveEffectResource used %s", Long.valueOf(Util.ticksToNow(currentTicks)));
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.LuckMoneyEffectResourceMgr", e, "saveEffectResourceImpl error: %s", e.getMessage());
        }
    }
}
