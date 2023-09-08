package com.tencent.p014mm.plugin.luckymoney.p073ui;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.model.C75122k;
import di3.C86312j;
import p286zl.C16292g;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2$$g */
public class LuckyMoneyNewYearSendUIV2$$g implements C75122k {

    /* renamed from: a */
    public final /* synthetic */ LuckyMoneyNewYearSendUIV2 f200376a;

    public LuckyMoneyNewYearSendUIV2$$g(LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2) {
        this.f200376a = luckyMoneyNewYearSendUIV2;
    }

    /* renamed from: a */
    public void mo95653a(int i, String str) {
        Log.m105924i("MicroMsg.LuckyMoneyNewYearSendUIV2", "onSceneEnd() scene:NetScenePrepareNewYearLuckyMoney JumpRemind:onNext()");
        if (Util.isEqual(i, 2) && Util.isEqual(str, "requestwxhb")) {
            LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2 = this.f200376a;
            int i2 = LuckyMoneyNewYearSendUIV2.f200265V1;
            luckyMoneyNewYearSendUIV2.mo95665N7(1);
        } else if (Util.isEqual(i, 1)) {
            ((C16292g) C86312j.m106911c(C16292g.class)).nr0(this.f200376a.getContext(), str, 0, true);
        }
    }

    public void onCancel() {
        Log.m105924i("MicroMsg.LuckyMoneyNewYearSendUIV2", "onSceneEnd() scene:NetScenePrepareNewYearLuckyMoney JumpRemind:onCancel()");
    }
}
