package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.view.View;
import com.tencent.p014mm.autogen.mmdata.rpt.RedEnvReplyWithEmoticonClickStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import f40.C86709a0;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.t */
public class C69686t extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ LuckyMoneyDetailUI f201085g;

    public C69686t(LuckyMoneyDetailUI luckyMoneyDetailUI) {
        this.f201085g = luckyMoneyDetailUI;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        this.f201085g.f199900s1 = new RedEnvReplyWithEmoticonClickStruct();
        RedEnvReplyWithEmoticonClickStruct redEnvReplyWithEmoticonClickStruct = this.f201085g.f199900s1;
        redEnvReplyWithEmoticonClickStruct.f194327d = 7;
        redEnvReplyWithEmoticonClickStruct.mo86054n();
        LuckyMoneyDetailUI luckyMoneyDetailUI = this.f201085g;
        luckyMoneyDetailUI.f199796B1 = luckyMoneyDetailUI.mo95559S7();
        Log.m105925i("MicroMsg.LuckyMoneyDetailUI", "click mEmojiUseType：%s", Integer.valueOf(this.f201085g.f199796B1));
        LuckyMoneyDetailUI luckyMoneyDetailUI2 = this.f201085g;
        if (luckyMoneyDetailUI2.f199796B1 != 1) {
            luckyMoneyDetailUI2.mo95561U7("");
            return;
        }
        this.f201085g.mo95561U7((String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_HONGBAO_LAST_THX_SEND_EMOJI_NORMAL_STRING, ""));
    }
}
