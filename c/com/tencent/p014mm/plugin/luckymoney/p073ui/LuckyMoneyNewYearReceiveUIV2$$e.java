package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2$$e */
public class LuckyMoneyNewYearReceiveUIV2$$e implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ LuckyMoneyNewYearReceiveUIV2 f115080d;

    public LuckyMoneyNewYearReceiveUIV2$$e(LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV2) {
        this.f115080d = luckyMoneyNewYearReceiveUIV2;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUIV2$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "goto detail!");
        Intent intent = new Intent();
        intent.putExtra("key_native_url", this.f115080d.f200118P);
        C88144b.m109791i(this.f115080d.getContext(), "luckymoney", ".ui.LuckyMoneyBeforeDetailUI", intent, (Bundle) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUIV2$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
