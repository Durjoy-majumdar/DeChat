package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.widget.RelativeLayout;
import com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPickEnvelopeUI;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.f4 */
public class C69592f4 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ LuckyMoneyPickEnvelopeUI.C69498r f200908d;

    public C69592f4(LuckyMoneyPickEnvelopeUI.C69498r rVar) {
        this.f200908d = rVar;
    }

    public void run() {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f200908d.f200622E.getLayoutParams();
        layoutParams.width = this.f200908d.f200632P.getWidth();
        this.f200908d.f200622E.setLayoutParams(layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f200908d.f200623F.getLayoutParams();
        layoutParams2.width = this.f200908d.f200621D.getWidth();
        layoutParams2.height = this.f200908d.f200621D.getHeight();
        this.f200908d.f200623F.setLayoutParams(layoutParams2);
    }
}
