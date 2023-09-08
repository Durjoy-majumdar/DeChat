package com.tencent.p014mm.plugin.luckymoney.f2f.p072ui;

import com.tencent.p014mm.plugin.luckymoney.f2f.p072ui.ShuffleView;
import q32.C77301c;

/* renamed from: com.tencent.mm.plugin.luckymoney.f2f.ui.b */
public class C18924b implements ShuffleView.C18922m {

    /* renamed from: a */
    public final /* synthetic */ LuckyMoneyF2FQRCodeUI f53122a;

    public C18924b(LuckyMoneyF2FQRCodeUI luckyMoneyF2FQRCodeUI) {
        this.f53122a = luckyMoneyF2FQRCodeUI;
    }

    /* renamed from: a */
    public void mo23957a(int i, int i2) {
        if (i2 == 8) {
            C77301c cVar = this.f53122a.f53011H;
            cVar.mo107445a("music" + (i + 1) + ".m4a");
            return;
        }
        this.f53122a.f53011H.mo107445a("select_card.m4a");
    }

    /* renamed from: b */
    public void mo23958b(int i, int i2) {
        LuckyMoneyF2FQRCodeUI luckyMoneyF2FQRCodeUI = this.f53122a;
        int i3 = LuckyMoneyF2FQRCodeUI.f53003b1;
        luckyMoneyF2FQRCodeUI.mo23903L7();
        if (i2 != 8) {
            this.f53122a.f53011H.mo107445a("select_card.m4a");
            int[] iArr = this.f53122a.f53029V;
            iArr[3] = iArr[3] + 1;
            return;
        }
        int[] iArr2 = this.f53122a.f53029V;
        iArr2[5] = iArr2[5] + 1;
    }
}
