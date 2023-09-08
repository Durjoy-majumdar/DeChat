package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.widget.RelativeLayout;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.r */
public class C69675r implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ LuckyMoneyBusiReceiveUIV2 f201068d;

    public C69675r(LuckyMoneyBusiReceiveUIV2 luckyMoneyBusiReceiveUIV2) {
        this.f201068d = luckyMoneyBusiReceiveUIV2;
    }

    public void run() {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f201068d.f199758G.getLayoutParams();
        int width = (int) (((float) this.f201068d.f199759g.getWidth()) * 1.1f);
        layoutParams.width = width;
        layoutParams.height = (int) (((float) width) * 1.72f);
        this.f201068d.f199758G.setLayoutParams(layoutParams);
    }
}
