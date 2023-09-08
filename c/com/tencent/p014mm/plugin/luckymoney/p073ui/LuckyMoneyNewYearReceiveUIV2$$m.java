package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.luckymoney.model.C69218g1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76912y0;
import qo3.C89779i0;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2$$m */
public class LuckyMoneyNewYearReceiveUIV2$$m implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ LuckyMoneyNewYearReceiveUIV2 f200197d;

    public LuckyMoneyNewYearReceiveUIV2$$m(LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV2) {
        this.f200197d = luckyMoneyNewYearReceiveUIV2;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUIV2$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "click voicePlayer");
        LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV2 = this.f200197d;
        if (luckyMoneyNewYearReceiveUIV2.f200124S0) {
            luckyMoneyNewYearReceiveUIV2.mo95633U7(true);
        } else {
            int i = luckyMoneyNewYearReceiveUIV2.f200142d1;
            if (i == 3) {
                Log.m105924i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "voicePlayer startPlay");
                LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV22 = this.f200197d;
                luckyMoneyNewYearReceiveUIV22.f200124S0 = true;
                C69218g1.m81563j(luckyMoneyNewYearReceiveUIV22.f200172y0, C0966R.C0969drawable.cqp);
                LuckyMoneyNewYearReceiveUIV2.m81812J7(this.f200197d);
                LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV23 = this.f200197d;
                luckyMoneyNewYearReceiveUIV23.f200126T0.mo33329e(luckyMoneyNewYearReceiveUIV23.f200128U0, true);
                this.f200197d.f200120Q0.setVisibility(8);
                this.f200197d.f200138Z0 = Util.nowMilliSecond();
                this.f200197d.mo95630R7(14);
            } else if (i == 2) {
                Log.m105924i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "voice is downloading");
                LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV24 = this.f200197d;
                luckyMoneyNewYearReceiveUIV24.f200143e1 = true;
                C89779i0 i0Var = luckyMoneyNewYearReceiveUIV24.f200104A;
                if (i0Var != null) {
                    i0Var.show();
                }
            } else if (i == 4) {
                Log.m105924i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "voice down fail");
                C76912y0.m92773l(this.f200197d.getContext(), this.f200197d.getContext().getResources().getString(C0966R.string.nex));
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUIV2$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
