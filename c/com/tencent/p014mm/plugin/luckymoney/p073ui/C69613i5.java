package com.tencent.p014mm.plugin.luckymoney.p073ui;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.i5 */
public class C69613i5 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f200970d;

    /* renamed from: e */
    public final /* synthetic */ LuckyMoneyVoiceLayout f200971e;

    public C69613i5(LuckyMoneyVoiceLayout luckyMoneyVoiceLayout, boolean z) {
        this.f200971e = luckyMoneyVoiceLayout;
        this.f200970d = z;
    }

    public void run() {
        C69599g5 g5Var = this.f200971e.f200815e;
        boolean z = this.f200970d;
        int i = g5Var.f200943k + 1;
        g5Var.f200943k = i;
        g5Var.f200942j = i >= 4;
        Log.m105919d("MicroMsg.LuckyMoneyVoiceDrawable", "recordingStartState maxAmplitudeRate = [%s] LongCkick:%s shrink:%s", 0, Boolean.valueOf(z), Boolean.valueOf(g5Var.f200942j));
        if (!z) {
            g5Var.f200945m = 3;
        }
        g5Var.invalidateSelf();
    }
}
