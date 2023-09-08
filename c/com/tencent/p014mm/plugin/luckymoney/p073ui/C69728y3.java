package com.tencent.p014mm.plugin.luckymoney.p073ui;

import androidx.recyclerview.widget.GridLayoutManager;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.y3 */
public class C69728y3 extends GridLayoutManager.C0127b {

    /* renamed from: b */
    public final /* synthetic */ LuckyMoneyPickEnvelopeUI f201153b;

    public C69728y3(LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI) {
        this.f201153b = luckyMoneyPickEnvelopeUI;
    }

    /* renamed from: c */
    public int mo118c(int i) {
        if (this.f201153b.f200553q.getItemViewType(i) == 2) {
            return this.f201153b.f200551p.f44669w;
        }
        return 1;
    }
}
