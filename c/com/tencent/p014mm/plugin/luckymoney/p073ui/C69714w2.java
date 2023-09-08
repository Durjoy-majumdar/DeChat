package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.w2 */
public class C69714w2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ LuckyMoneyNotHookReceiveUI f201134d;

    public C69714w2(LuckyMoneyNotHookReceiveUI luckyMoneyNotHookReceiveUI) {
        this.f201134d = luckyMoneyNotHookReceiveUI;
    }

    public void run() {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f201134d.f200451z.getLayoutParams();
        float width = ((float) this.f201134d.f200445v.getWidth()) * 1.0993f;
        layoutParams.width = Math.round(width);
        layoutParams.height = Math.round(width * 1.72f);
        this.f201134d.f200451z.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = this.f201134d.f200445v.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.width += (int) (C76577a.m92165p(MMApplicationContext.getContext()) * 1.0f);
            layoutParams2.height -= (int) (C76577a.m92165p(MMApplicationContext.getContext()) * 1.0f);
            this.f201134d.f200445v.setLayoutParams(layoutParams2);
        }
        ViewGroup.LayoutParams layoutParams3 = this.f201134d.f200399D.getLayoutParams();
        float round = (float) Math.round(((double) width) * 0.98d);
        layoutParams3.width = Math.round(round);
        layoutParams3.height = Math.round(round * 1.72f);
        this.f201134d.f200399D.setLayoutParams(layoutParams3);
    }
}
