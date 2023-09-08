package com.tencent.p014mm.plugin.luckymoney.p073ui;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.h5 */
public class C69605h5 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ LuckyMoneyVoiceLayout f200959d;

    public C69605h5(LuckyMoneyVoiceLayout luckyMoneyVoiceLayout) {
        this.f200959d = luckyMoneyVoiceLayout;
    }

    public void run() {
        C69599g5 g5Var = this.f200959d.f200815e;
        Log.m105919d("MicroMsg.LuckyMoneyVoiceDrawable", "readyState %s", Integer.valueOf(g5Var.f200945m));
        g5Var.f200945m = 2;
        g5Var.invalidateSelf();
    }
}
