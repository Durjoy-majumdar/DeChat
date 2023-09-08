package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.view.MenuItem;
import com.tencent.p014mm.autogen.mmdata.rpt.HBReportNewStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import nj3.C11184p0;
import p008bq.C67308r1;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.i2 */
public class C69609i2 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ LuckyMoneyNewYearSendUIV2 f200966d;

    public C69609i2(LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2) {
        this.f200966d = luckyMoneyNewYearSendUIV2;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        Log.m105925i("MicroMsg.LuckyMoneyNewYearSendUIV2", "showLuckyHbDlg() onMMMenuItemSelected menuItemId:%s", Integer.valueOf(menuItem.getItemId()));
        int itemId = menuItem.getItemId();
        if (itemId == 1) {
            this.f200966d.f200305S1 = 0;
            ((C67308r1) C86312j.m106911c(C67308r1.class)).mo58290YL(this.f200966d.getContext(), 3, this.f200966d.f200298Q0);
            LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2 = this.f200966d;
            luckyMoneyNewYearSendUIV2.f200342o1 = 1;
            luckyMoneyNewYearSendUIV2.f200337l1 = new HBReportNewStruct();
            HBReportNewStruct hBReportNewStruct = this.f200966d.f200337l1;
            hBReportNewStruct.f194229d = 9;
            hBReportNewStruct.mo86054n();
        } else if (itemId == 2) {
            LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV22 = this.f200966d;
            int i2 = LuckyMoneyNewYearSendUIV2.f200265V1;
            luckyMoneyNewYearSendUIV22.mo95677Z7();
        }
    }
}
