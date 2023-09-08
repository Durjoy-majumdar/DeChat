package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.widget.RelativeLayout;
import com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPickEnvelopeUI;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.l4 */
public class C69634l4 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ LuckyMoneyPickEnvelopeUI.C69498r f201007d;

    public C69634l4(LuckyMoneyPickEnvelopeUI.C69498r rVar) {
        this.f201007d = rVar;
    }

    public void run() {
        float width = ((float) this.f201007d.f200619B.getWidth()) * 1.0993f;
        int round = Math.round(width);
        int round2 = Math.round(width * 1.72f);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f201007d.f200621D.getLayoutParams();
        layoutParams.width = round;
        layoutParams.height = round2;
        this.f201007d.f200621D.setLayoutParams(layoutParams);
    }
}
