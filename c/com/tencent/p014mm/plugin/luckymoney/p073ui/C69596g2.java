package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.luckymoney.model.C69218g1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import nj3.C11184p0;
import p375qh.C22086d;
import p492dn.C75415t;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.g2 */
public class C69596g2 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ LuckyMoneyNewYearSendUIV2 f200917d;

    public C69596g2(LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2) {
        this.f200917d = luckyMoneyNewYearSendUIV2;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        if (menuItem.getItemId() == 1) {
            Log.m105924i("MicroMsg.LuckyMoneyNewYearSendUIV2", "voicePlayer startPlay");
            LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2 = this.f200917d;
            luckyMoneyNewYearSendUIV2.f200365y1 = true;
            C69218g1.m81563j(luckyMoneyNewYearSendUIV2.f200292N, C0966R.C0969drawable.cqp);
            LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV22 = this.f200917d;
            luckyMoneyNewYearSendUIV22.getClass();
            C22086d DA = ((C75415t) C86312j.m106911c(C75415t.class)).mo91606DA(luckyMoneyNewYearSendUIV22);
            luckyMoneyNewYearSendUIV22.f200367z1 = DA;
            DA.mo33328d(luckyMoneyNewYearSendUIV22.f200289L1);
            luckyMoneyNewYearSendUIV22.f200367z1.mo33334i(luckyMoneyNewYearSendUIV22.f200291M1);
            LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV23 = this.f200917d;
            luckyMoneyNewYearSendUIV23.f200367z1.mo33329e(luckyMoneyNewYearSendUIV23.f200362x1, true);
            this.f200917d.f200283I1 = Util.nowMilliSecond();
            this.f200917d.mo95672U7(14);
        } else if (menuItem.getItemId() == 2) {
            Log.m105924i("MicroMsg.LuckyMoneyNewYearSendUIV2", "delete voice");
            LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV24 = this.f200917d;
            luckyMoneyNewYearSendUIV24.f200285J1 = 1;
            luckyMoneyNewYearSendUIV24.f200273D1 = 1;
            luckyMoneyNewYearSendUIV24.mo95681d8();
            this.f200917d.mo95672U7(15);
        }
    }
}
