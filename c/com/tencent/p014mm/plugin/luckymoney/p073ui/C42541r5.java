package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.content.Intent;
import wd3.C65953v0;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.r5 */
public class C42541r5 implements C65953v0 {

    /* renamed from: a */
    public final /* synthetic */ Intent f115096a;

    /* renamed from: b */
    public final /* synthetic */ SelectLuckyMoneyContactUI f115097b;

    public C42541r5(SelectLuckyMoneyContactUI selectLuckyMoneyContactUI, Intent intent) {
        this.f115097b = selectLuckyMoneyContactUI;
        this.f115096a = intent;
    }

    /* renamed from: a */
    public void mo23a(boolean z, String str, int i) {
        if (z) {
            this.f115097b.setResult(-1, this.f115096a);
            this.f115097b.finish();
        }
    }
}
