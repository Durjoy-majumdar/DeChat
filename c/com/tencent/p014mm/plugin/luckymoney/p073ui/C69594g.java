package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.tencent.p014mm.plugin.luckymoney.model.C69158a0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import ie3.C76331i;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.g */
public class C69594g extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ C69158a0 f200910g;

    /* renamed from: h */
    public final /* synthetic */ Context f200911h;

    /* renamed from: i */
    public final /* synthetic */ LuckyMoneyBusiDetailUI f200912i;

    public C69594g(LuckyMoneyBusiDetailUI luckyMoneyBusiDetailUI, C69158a0 a0Var, Context context) {
        this.f200912i = luckyMoneyBusiDetailUI;
        this.f200910g = a0Var;
        this.f200911h = context;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        if (!TextUtils.isEmpty(this.f200910g.f198952N)) {
            Log.m105924i("MicroMsg.LuckyMoneyDetailUI", "detail.changeUrl:" + this.f200910g.f198952N);
            if (this.f200910g.f198952N.startsWith("weixin://wxpay")) {
                C75228t.m90243e0(12, 1);
                C76331i.m91758b(this.f200912i.getContext(), 1);
                return;
            }
            C75228t.m90243e0(7, 1);
            C75228t.m90219L(this.f200911h, this.f200910g.f198952N, true);
            return;
        }
        C75228t.m90243e0(12, 1);
        C76331i.m91758b(this.f200912i.getContext(), 1);
        Log.m105920e("MicroMsg.LuckyMoneyDetailUI", "detail.changeUrl is empty");
    }
}
