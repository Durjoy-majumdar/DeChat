package com.tencent.p014mm.plugin.luckymoney.p073ui;

import a63.C67008a;
import com.tencent.p014mm.plugin.luckymoney.model.C69237j2;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2$$c */
public class LuckyMoneyNewYearReceiveUIV2$$c implements C67008a.C67019k {

    /* renamed from: a */
    public final /* synthetic */ C69237j2 f200177a;

    /* renamed from: b */
    public final /* synthetic */ LuckyMoneyNewYearReceiveUIV2 f200178b;

    public LuckyMoneyNewYearReceiveUIV2$$c(LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV2, C69237j2 j2Var) {
        this.f200178b = luckyMoneyNewYearReceiveUIV2;
        this.f200177a = j2Var;
    }

    public boolean run(int i, int i2, String str, boolean z) {
        int i3 = i;
        boolean z2 = z;
        Log.m105924i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "showDisclaimerDialog resultCode=" + i3 + ";errCode=" + i2 + ";errMsg=" + str + ";hadAgree = " + z2);
        if (i3 == 1) {
            this.f200178b.finish();
        } else if (i3 == 2) {
            LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV2 = this.f200178b;
            C69237j2 j2Var = this.f200177a;
            int i4 = j2Var.f199242h;
            int i5 = j2Var.f199243i;
            String str2 = j2Var.f199244j;
            String str3 = j2Var.f199245n;
            String str4 = j2Var.f199237P;
            int i6 = LuckyMoneyNewYearReceiveUIV2.f200103p1;
            luckyMoneyNewYearReceiveUIV2.mo95625M7(i4, i5, str2, str3, str4);
        } else if (i3 == 0 && z2) {
            LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV22 = this.f200178b;
            C69237j2 j2Var2 = this.f200177a;
            int i7 = j2Var2.f199242h;
            int i8 = j2Var2.f199243i;
            String str5 = j2Var2.f199244j;
            String str6 = j2Var2.f199245n;
            String str7 = j2Var2.f199237P;
            int i9 = LuckyMoneyNewYearReceiveUIV2.f200103p1;
            luckyMoneyNewYearReceiveUIV22.mo95625M7(i7, i8, str5, str6, str7);
        }
        return true;
    }
}
