package com.tencent.p014mm.plugin.wallet.balance.p119ui;

import android.view.View;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72476y0;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.c */
public class C71704c implements C72476y0.C72477a {

    /* renamed from: a */
    public final /* synthetic */ Bankcard f207887a;

    /* renamed from: b */
    public final /* synthetic */ WalletBalanceFetchUI f207888b;

    public C71704c(WalletBalanceFetchUI walletBalanceFetchUI, Bankcard bankcard) {
        this.f207888b = walletBalanceFetchUI;
        this.f207887a = bankcard;
    }

    /* renamed from: a */
    public void mo66525a(View view) {
        if (!Util.isNullOrNil(this.f207887a.field_prompt_info_jump_url)) {
            C75228t.m90219L(this.f207888b.getContext(), this.f207887a.field_prompt_info_jump_url, true);
            C115669n.INSTANCE.mo160131h(20216, 4, this.f207887a.field_prompt_info_jump_url);
        }
    }
}
