package com.tencent.p014mm.plugin.luckymoney.model;

import com.tencent.p014mm.autogen.events.CheckResUpdateCacheFileEvent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import p523fp.C32147e;

/* renamed from: com.tencent.mm.plugin.luckymoney.model.s0 */
public class C69263s0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CheckResUpdateCacheFileEvent f199330d;

    public C69263s0(C69266u0 u0Var, CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent) {
        this.f199330d = checkResUpdateCacheFileEvent;
    }

    public void run() {
        boolean z;
        if (!Util.isNullOrNil(this.f199330d.f78743d.f78746c)) {
            if (C69218g1.m81560g(this.f199330d.f78743d.f78746c, C69218g1.m81558e())) {
                Log.m105924i("MicroMsg.LuckyMoneyEnvelopeResUpdateListener", "luckyMoney new year resource file update succ");
                C115669n.INSTANCE.mo175911u(991, 22);
                z = true;
            } else {
                Log.m105924i("MicroMsg.LuckyMoneyEnvelopeResUpdateListener", "luckyMoney new year resource file update fail");
                C115669n.INSTANCE.mo175911u(991, 23);
                z = false;
            }
            CheckResUpdateCacheFileEvent.C28720a aVar = this.f199330d.f78743d;
            ((C32147e) C86312j.m106911c(C32147e.class)).b70(aVar.f78744a, aVar.f78745b, aVar.f78747d, z);
        }
    }
}
