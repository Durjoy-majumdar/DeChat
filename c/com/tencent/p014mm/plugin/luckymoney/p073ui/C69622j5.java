package com.tencent.p014mm.plugin.luckymoney.p073ui;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.j5 */
public class C69622j5 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f200982d;

    /* renamed from: e */
    public final /* synthetic */ LuckyMoneyVoiceLayout f200983e;

    public C69622j5(LuckyMoneyVoiceLayout luckyMoneyVoiceLayout, int i) {
        this.f200983e = luckyMoneyVoiceLayout;
        this.f200982d = i;
    }

    public void run() {
        boolean z;
        C69599g5 g5Var = this.f200983e.f200815e;
        int i = this.f200982d;
        if (i < 28) {
            int i2 = g5Var.f200943k + 1;
            g5Var.f200943k = i2;
            if (i2 >= 4) {
                z = true;
                g5Var.f200942j = z;
                Log.m105919d("MicroMsg.LuckyMoneyVoiceDrawable", "recordingState maxAmplitudeRate = [%s] shrink:%s", Integer.valueOf(i), Boolean.valueOf(g5Var.f200942j));
                g5Var.invalidateSelf();
            }
        } else {
            g5Var.f200943k = 0;
        }
        z = false;
        g5Var.f200942j = z;
        Log.m105919d("MicroMsg.LuckyMoneyVoiceDrawable", "recordingState maxAmplitudeRate = [%s] shrink:%s", Integer.valueOf(i), Boolean.valueOf(g5Var.f200942j));
        g5Var.invalidateSelf();
    }
}
