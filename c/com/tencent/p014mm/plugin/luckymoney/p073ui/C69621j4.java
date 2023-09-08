package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.widget.RelativeLayout;
import com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPickEnvelopeUI;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.j4 */
public class C69621j4 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ LuckyMoneyPickEnvelopeUI.C69498r f200981d;

    public C69621j4(LuckyMoneyPickEnvelopeUI.C69498r rVar) {
        this.f200981d = rVar;
    }

    public void run() {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f200981d.f200627J.getLayoutParams();
        layoutParams.width = this.f200981d.f200619B.getWidth();
        layoutParams.height = this.f200981d.f200619B.getHeight();
        this.f200981d.f200627J.setLayoutParams(layoutParams);
    }
}
