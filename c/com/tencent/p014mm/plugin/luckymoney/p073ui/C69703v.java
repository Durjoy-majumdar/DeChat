package com.tencent.p014mm.plugin.luckymoney.p073ui;

import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.v */
public class C69703v implements ChatFooterPanel.C72719a {

    /* renamed from: a */
    public final /* synthetic */ LuckyMoneyDetailUI f201116a;

    public C69703v(LuckyMoneyDetailUI luckyMoneyDetailUI) {
        this.f201116a = luckyMoneyDetailUI;
    }

    /* renamed from: a */
    public void mo64626a() {
    }

    /* renamed from: b */
    public void mo64627b(String str) {
        try {
            Log.m105925i("MicroMsg.LuckyMoneyDetailUI", "[onSelectedNormalEmoji] emojiInfo:%s", str);
            LuckyMoneyDetailUI luckyMoneyDetailUI = this.f201116a;
            luckyMoneyDetailUI.f199796B1 = 1;
            luckyMoneyDetailUI.mo95555O7(2, str);
            this.f201116a.mo95561U7(str);
            this.f201116a.mo95556P7();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.LuckyMoneyDetailUI", e, "", new Object[0]);
        }
    }

    /* renamed from: c */
    public void mo64628c() {
    }

    /* renamed from: d */
    public void mo64629d(boolean z) {
    }
}
