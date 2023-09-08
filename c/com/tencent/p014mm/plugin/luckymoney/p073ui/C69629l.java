package com.tencent.p014mm.plugin.luckymoney.p073ui;

import com.tencent.p014mm.p136ui.widget.MMEditText;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.l */
public class C69629l implements MMEditText.C74949b {

    /* renamed from: a */
    public final /* synthetic */ LuckyMoneyBusiDetailUI f200999a;

    public C69629l(LuckyMoneyBusiDetailUI luckyMoneyBusiDetailUI) {
        this.f200999a = luckyMoneyBusiDetailUI;
    }

    /* renamed from: a */
    public void mo65425a() {
        if (this.f200999a.f199700p.getVisibility() == 0) {
            this.f200999a.f199700p.setVisibility(8);
        } else {
            this.f200999a.getContext().finish();
        }
    }
}
