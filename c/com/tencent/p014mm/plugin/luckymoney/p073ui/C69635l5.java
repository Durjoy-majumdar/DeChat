package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.l5 */
public class C69635l5 extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ LuckyMoneyWishFooter f201008g;

    public C69635l5(LuckyMoneyWishFooter luckyMoneyWishFooter) {
        this.f201008g = luckyMoneyWishFooter;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        Log.m105924i("MicroMsg.SnsCommentFooter", "state onClick" + this.f201008g.f200839s);
        LuckyMoneyWishFooter luckyMoneyWishFooter = this.f201008g;
        if (luckyMoneyWishFooter.f200839s == 0) {
            luckyMoneyWishFooter.setModeClick(true);
            this.f201008g.f200835o.setImageResource(C0966R.raw.icons_outlined_emoji);
            LuckyMoneyWishFooter luckyMoneyWishFooter2 = this.f201008g;
            luckyMoneyWishFooter2.f200839s = 1;
            luckyMoneyWishFooter2.f200841u = false;
        } else {
            luckyMoneyWishFooter.setModeClick(false);
            LuckyMoneyWishFooter luckyMoneyWishFooter3 = this.f201008g;
            luckyMoneyWishFooter3.f200841u = false;
            luckyMoneyWishFooter3.f200835o.setImageResource(C0966R.raw.icons_outlined_emoji);
            this.f201008g.f200839s = 0;
        }
        this.f201008g.mo95817i();
    }
}
