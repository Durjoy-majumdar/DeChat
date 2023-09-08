package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPickEnvelopeUI;
import nj3.C11184p0;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.s4 */
public class C69685s4 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ LuckyMoneyPickEnvelopeUI.C69497p f201083d;

    /* renamed from: e */
    public final /* synthetic */ LuckyMoneyPickEnvelopeUI.C69498r f201084e;

    public C69685s4(LuckyMoneyPickEnvelopeUI.C69498r rVar, LuckyMoneyPickEnvelopeUI.C69497p pVar) {
        this.f201084e = rVar;
        this.f201083d = pVar;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        if (menuItem.getItemId() == 0) {
            LuckyMoneyPickEnvelopeUI.m81901J7(LuckyMoneyPickEnvelopeUI.this, this.f201083d.f200615b.f228202f);
        }
    }
}
