package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.graphics.Rect;
import ir3.C76371a;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.z0 */
public class C69730z0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ LuckyMoneyHistoryEnvelopeUI f201155d;

    public C69730z0(LuckyMoneyHistoryEnvelopeUI luckyMoneyHistoryEnvelopeUI) {
        this.f201155d = luckyMoneyHistoryEnvelopeUI;
    }

    public void run() {
        Rect rect = new Rect();
        this.f201155d.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        this.f201155d.f199968d = (rect.width() - (C76371a.m91795a(8) * 3)) / 2;
        LuckyMoneyHistoryEnvelopeUI luckyMoneyHistoryEnvelopeUI = this.f201155d;
        int i = luckyMoneyHistoryEnvelopeUI.f199968d;
        luckyMoneyHistoryEnvelopeUI.f199969e = (int) (((float) i) * 1.9844f);
        luckyMoneyHistoryEnvelopeUI.f199970f = i - (C76371a.m91795a(8) * 2);
        LuckyMoneyHistoryEnvelopeUI luckyMoneyHistoryEnvelopeUI2 = this.f201155d;
        int i2 = luckyMoneyHistoryEnvelopeUI2.f199970f;
        luckyMoneyHistoryEnvelopeUI2.f199971g = (int) (((float) i2) * 1.656f);
        luckyMoneyHistoryEnvelopeUI2.f199972h = (int) (((float) i2) * 1.38f);
        luckyMoneyHistoryEnvelopeUI2.f199973i = (int) (((float) i2) / 2.9f);
        int i3 = (int) (((float) i2) / 1.1f);
        luckyMoneyHistoryEnvelopeUI2.f199974j = i3;
        luckyMoneyHistoryEnvelopeUI2.f199975n = (int) (((float) i3) * 1.656f);
        luckyMoneyHistoryEnvelopeUI2.f199978q = (int) (((float) i3) * 1.38f);
        luckyMoneyHistoryEnvelopeUI2.f199979r = (int) (((float) i3) / 2.9f);
        luckyMoneyHistoryEnvelopeUI2.f199976o = i2;
        luckyMoneyHistoryEnvelopeUI2.f199977p = (int) (((float) i2) * 1.72f);
    }
}
