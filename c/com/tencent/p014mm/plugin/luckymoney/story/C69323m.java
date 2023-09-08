package com.tencent.p014mm.plugin.luckymoney.story;

import com.tencent.p014mm.plugin.luckymoney.model.C69198d0;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75142u0;

/* renamed from: com.tencent.mm.plugin.luckymoney.story.m */
public class C69323m implements C75142u0.C75149e {

    /* renamed from: a */
    public final /* synthetic */ long f199611a;

    /* renamed from: b */
    public final /* synthetic */ EnvelopeAppBarLayout f199612b;

    public C69323m(EnvelopeAppBarLayout envelopeAppBarLayout, long j) {
        this.f199612b = envelopeAppBarLayout;
        this.f199611a = j;
    }

    /* renamed from: a */
    public void mo95346a(C75142u0.C75143a aVar) {
        long currentTimeMillis = System.currentTimeMillis() - this.f199611a;
        if (aVar instanceof C75142u0.C75143a.C75145b) {
            String str = ((C75142u0.C75143a.C75145b) aVar).f221112a;
            Log.m105925i("MicroMsg.EnvelopeAppBarLayout", "downloadComplete success，file path: %s", str);
            C69198d0.f199107a.mo95357g(2, str, this.f199612b.f199518t);
            C115669n.INSTANCE.mo160131h(28153, this.f199612b.f199497b1, 1, 3, Long.valueOf(currentTimeMillis));
            return;
        }
        Log.m105925i("MicroMsg.EnvelopeAppBarLayout", "downloadComplete failed，errorCode: %s", Integer.valueOf(((C75142u0.C75143a.C75144a) aVar).f221111a));
        this.f199612b.f199518t.setVisibility(8);
        C115669n.INSTANCE.mo160131h(28153, this.f199612b.f199497b1, 2, 3, Long.valueOf(currentTimeMillis));
    }
}
