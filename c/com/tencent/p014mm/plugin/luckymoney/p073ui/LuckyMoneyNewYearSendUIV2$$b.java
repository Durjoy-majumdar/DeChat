package com.tencent.p014mm.plugin.luckymoney.p073ui;

import c42.C67339b;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import p248ug.C78158s0;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2$$b */
public class LuckyMoneyNewYearSendUIV2$$b implements C78158s0.C78159a {

    /* renamed from: a */
    public final /* synthetic */ LuckyMoneyNewYearSendUIV2 f200370a;

    public LuckyMoneyNewYearSendUIV2$$b(LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2) {
        this.f200370a = luckyMoneyNewYearSendUIV2;
    }

    /* renamed from: a */
    public void mo68482a(IEmojiInfo iEmojiInfo) {
        Log.m105925i("MicroMsg.LuckyMoneyNewYearSendUIV2", "[onSelectedEmoji] emojiInfo:%s", iEmojiInfo);
        LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2 = this.f200370a;
        int i = LuckyMoneyNewYearSendUIV2.f200265V1;
        if (iEmojiInfo == null) {
            luckyMoneyNewYearSendUIV2.mo95668Q7(5);
        } else {
            luckyMoneyNewYearSendUIV2.getClass();
            luckyMoneyNewYearSendUIV2.mo95676Y7(iEmojiInfo.getMd5());
        }
        onHide();
    }

    public void onHide() {
        LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2 = this.f200370a;
        int i = LuckyMoneyNewYearSendUIV2.f200265V1;
        C67339b.m79676a(luckyMoneyNewYearSendUIV2.getContext(), luckyMoneyNewYearSendUIV2.f200327f1);
        luckyMoneyNewYearSendUIV2.f200329g1.dismiss();
    }
}
