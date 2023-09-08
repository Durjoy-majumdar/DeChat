package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.p106ui.C95741b5;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import iv2.C33418b;

/* renamed from: com.tencent.mm.plugin.sns.ui.b8 */
public final class C95745b8 implements C95741b5.C95743b {

    /* renamed from: a */
    public final /* synthetic */ C95761d8 f279258a;

    public C95745b8(C95761d8 d8Var) {
        this.f279258a = d8Var;
    }

    /* renamed from: M */
    public final void mo133000M(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("onNetWorkChange", "com.tencent.mm.plugin.sns.ui.SnsWsFoldAutoPlayManager$init$1");
        C95761d8 d8Var = this.f279258a;
        C33418b bVar = C33418b.f90548a;
        SnsMethodCalculate.markStartTimeMs("access$getSnsNetworkMgr$p", "com.tencent.mm.plugin.sns.ui.SnsWsFoldAutoPlayManager");
        C95741b5 b5Var = d8Var.f279354a;
        SnsMethodCalculate.markEndTimeMs("access$getSnsNetworkMgr$p", "com.tencent.mm.plugin.sns.ui.SnsWsFoldAutoPlayManager");
        boolean a = bVar.mo59132a(b5Var);
        SnsMethodCalculate.markStartTimeMs("access$setSnsAutoPlay$p", "com.tencent.mm.plugin.sns.ui.SnsWsFoldAutoPlayManager");
        d8Var.f279355b = a;
        SnsMethodCalculate.markEndTimeMs("access$setSnsAutoPlay$p", "com.tencent.mm.plugin.sns.ui.SnsWsFoldAutoPlayManager");
        SnsMethodCalculate.markEndTimeMs("onNetWorkChange", "com.tencent.mm.plugin.sns.ui.SnsWsFoldAutoPlayManager$init$1");
    }
}
