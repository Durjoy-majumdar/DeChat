package com.tencent.p014mm.plugin.collect.reward.p037ui;

import android.view.View;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;

/* renamed from: com.tencent.mm.plugin.collect.reward.ui.e */
public class C68829e extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ QrRewardMainUI f197748g;

    public C68829e(QrRewardMainUI qrRewardMainUI) {
        this.f197748g = qrRewardMainUI;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        Log.m105918d("MicroMsg.QrRewardMainUI", "open click");
        QrRewardMainUI.m81076H7(this.f197748g, true);
        C115669n.INSTANCE.mo160131h(14721, 1, 1);
    }
}
