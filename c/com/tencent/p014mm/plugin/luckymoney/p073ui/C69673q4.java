package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPickEnvelopeUI;
import nj3.C11184p0;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.q4 */
public class C69673q4 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ String f201064d;

    /* renamed from: e */
    public final /* synthetic */ LuckyMoneyPickEnvelopeUI.C69498r f201065e;

    public C69673q4(LuckyMoneyPickEnvelopeUI.C69498r rVar, String str) {
        this.f201065e = rVar;
        this.f201064d = str;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        if (menuItem.getItemId() == 0) {
            LuckyMoneyPickEnvelopeUI.m81901J7(LuckyMoneyPickEnvelopeUI.this, this.f201064d);
        }
    }
}
