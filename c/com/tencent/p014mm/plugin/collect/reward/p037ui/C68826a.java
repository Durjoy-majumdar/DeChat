package com.tencent.p014mm.plugin.collect.reward.p037ui;

import com.tencent.p014mm.plugin.collect.reward.p037ui.QrRewardGrantUI;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.collect.reward.ui.a */
public class C68826a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ QrRewardGrantUI.C688028 f197745d;

    public C68826a(QrRewardGrantUI.C688028 r1) {
        this.f197745d = r1;
    }

    public void run() {
        Log.m105924i("MicroMsg.QrRewardGrantUI", "click kinda finish button");
        QrRewardGrantUI.this.finish();
    }
}
