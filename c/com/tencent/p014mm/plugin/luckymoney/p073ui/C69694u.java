package com.tencent.p014mm.plugin.luckymoney.p073ui;

import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import p248ug.C78158s0;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.u */
public class C69694u implements C78158s0.C78159a {

    /* renamed from: a */
    public final /* synthetic */ LuckyMoneyDetailUI f201095a;

    public C69694u(LuckyMoneyDetailUI luckyMoneyDetailUI) {
        this.f201095a = luckyMoneyDetailUI;
    }

    /* renamed from: a */
    public void mo68482a(IEmojiInfo iEmojiInfo) {
        Log.m105925i("MicroMsg.LuckyMoneyDetailUI", "[onSelectedEmoji] emojiInfo:%s", iEmojiInfo);
        LuckyMoneyDetailUI luckyMoneyDetailUI = this.f201095a;
        luckyMoneyDetailUI.f199796B1 = 2;
        luckyMoneyDetailUI.mo95555O7(2, iEmojiInfo.getMd5());
        this.f201095a.mo95561U7("");
        onHide();
    }

    public void onHide() {
        LuckyMoneyDetailUI luckyMoneyDetailUI = this.f201095a;
        int i = LuckyMoneyDetailUI.f199792r2;
        luckyMoneyDetailUI.mo95556P7();
    }
}
