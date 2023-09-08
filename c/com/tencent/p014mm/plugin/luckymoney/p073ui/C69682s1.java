package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.luckymoney.model.C69210e2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.s1 */
public class C69682s1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C69210e2 f201077d;

    /* renamed from: e */
    public final /* synthetic */ LuckyMoneyNewYearReceiveUIV2 f201078e;

    public C69682s1(LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV2, C69210e2 e2Var) {
        this.f201078e = luckyMoneyNewYearReceiveUIV2;
        this.f201077d = e2Var;
    }

    public void run() {
        LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV2 = this.f201078e;
        C69210e2 e2Var = this.f201077d;
        int i = LuckyMoneyNewYearReceiveUIV2.f200103p1;
        if (luckyMoneyNewYearReceiveUIV2.isFinishing() || luckyMoneyNewYearReceiveUIV2.isDestroyed()) {
            Log.m105924i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "this activity has finished");
            return;
        }
        String n = C75228t.m90260n(((double) e2Var.f199149h.f198974q) / 100.0d);
        View findViewById = luckyMoneyNewYearReceiveUIV2.findViewById(C0966R.C0970id.gh6);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUIV2", "doUpdateAmount", "(Lcom/tencent/mm/plugin/luckymoney/model/NetSceneOpenLuckyMoney;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(findViewById, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUIV2", "doUpdateAmount", "(Lcom/tencent/mm/plugin/luckymoney/model/NetSceneOpenLuckyMoney;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        luckyMoneyNewYearReceiveUIV2.f200156n.setVisibility(0);
        luckyMoneyNewYearReceiveUIV2.f200151j.setVisibility(0);
        luckyMoneyNewYearReceiveUIV2.f200151j.setContentDescription(n);
        luckyMoneyNewYearReceiveUIV2.f200151j.setFinalText(n);
        LuckyMoneyAutoScrollView luckyMoneyAutoScrollView = luckyMoneyNewYearReceiveUIV2.f200151j;
        luckyMoneyAutoScrollView.f199659y = new C69731z1(luckyMoneyNewYearReceiveUIV2, e2Var);
        MMHandlerThread.postToMainThread(new C69572c(luckyMoneyAutoScrollView));
    }
}
