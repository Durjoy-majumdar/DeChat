package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.view.MenuItem;
import com.tencent.p014mm.autogen.mmdata.rpt.HBReportNewStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import nj3.C11184p0;
import p008bq.C67308r1;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.d2 */
public class C69581d2 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ LuckyMoneyNewYearSendUI f200892d;

    public C69581d2(LuckyMoneyNewYearSendUI luckyMoneyNewYearSendUI) {
        this.f200892d = luckyMoneyNewYearSendUI;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        Log.m105925i("MicroMsg.LuckyMoneyNewYearSendUI", "showLuckyHbDlg() onMMMenuItemSelected menuItemId:%s", Integer.valueOf(menuItem.getItemId()));
        int itemId = menuItem.getItemId();
        if (itemId == 1) {
            this.f200892d.f200229X0 = 0;
            LuckyMoneyNewYearSendUI luckyMoneyNewYearSendUI = this.f200892d;
            ((C67308r1) C86312j.m106911c(C67308r1.class)).mo58290YL(luckyMoneyNewYearSendUI, 3, luckyMoneyNewYearSendUI.f200201C);
            LuckyMoneyNewYearSendUI luckyMoneyNewYearSendUI2 = this.f200892d;
            luckyMoneyNewYearSendUI2.f200230Y = 1;
            luckyMoneyNewYearSendUI2.f200224V = new HBReportNewStruct();
            HBReportNewStruct hBReportNewStruct = this.f200892d.f200224V;
            hBReportNewStruct.f194229d = 9;
            hBReportNewStruct.mo86054n();
        } else if (itemId == 2) {
            LuckyMoneyNewYearSendUI luckyMoneyNewYearSendUI3 = this.f200892d;
            int i2 = LuckyMoneyNewYearSendUI.f200198a1;
            luckyMoneyNewYearSendUI3.mo95650P7();
        }
    }
}
