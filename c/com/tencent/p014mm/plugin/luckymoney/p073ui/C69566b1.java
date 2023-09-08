package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.luckymoney.model.C42513c;
import com.tencent.p014mm.sdk.platformtools.Log;
import nj3.C11184p0;
import nj3.C76879j;
import te3.C77994sf2;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.b1 */
public class C69566b1 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C77994sf2 f200866d;

    /* renamed from: e */
    public final /* synthetic */ LuckyMoneyHistoryEnvelopeUI f200867e;

    public C69566b1(LuckyMoneyHistoryEnvelopeUI luckyMoneyHistoryEnvelopeUI, C77994sf2 sf22) {
        this.f200867e = luckyMoneyHistoryEnvelopeUI;
        this.f200866d = sf22;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        if (menuItem.getItemId() == 0) {
            LuckyMoneyHistoryEnvelopeUI luckyMoneyHistoryEnvelopeUI = this.f200867e;
            String str = this.f200866d.f228202f;
            int i2 = LuckyMoneyHistoryEnvelopeUI.f199965C;
            luckyMoneyHistoryEnvelopeUI.getClass();
            Log.m105925i("MicroMsg.LuckyMoneyHistoryEnvelopeUI", "do delete show source: %s", str);
            new C42513c(str).mo9225i().mo123062e(new C69704v0(luckyMoneyHistoryEnvelopeUI, C76879j.m92721O(luckyMoneyHistoryEnvelopeUI.getContext(), (String) null, 3, C0966R.style.f8510l3, luckyMoneyHistoryEnvelopeUI.getString(C0966R.string.gas), true, false, new C69695u0(luckyMoneyHistoryEnvelopeUI)), str)).mo11397F(luckyMoneyHistoryEnvelopeUI);
        }
    }
}
