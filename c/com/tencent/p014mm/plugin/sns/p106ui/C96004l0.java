package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.sns.ui.l0 */
public final class C96004l0 extends C95969j0 {

    /* renamed from: p */
    public final int f280331p = 45;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C96004l0(MMActivity mMActivity) {
        super(mMActivity);
        C87412m.m108594g(mMActivity, "context");
    }

    /* renamed from: k */
    public int mo133250k() {
        SnsMethodCalculate.markStartTimeMs("getSnsType", "com.tencent.mm.plugin.sns.ui.FinderPurchaseLiveWidget");
        int i = this.f280331p;
        SnsMethodCalculate.markEndTimeMs("getSnsType", "com.tencent.mm.plugin.sns.ui.FinderPurchaseLiveWidget");
        return i;
    }
}
