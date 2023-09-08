package com.tencent.p014mm.plugin.sns.statistics;

import com.tencent.p014mm.autogen.mmdata.rpt.SnsPublishProcessStruct;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import gy3.C87412m;
import junit.framework.Assert;
import k21.C60959b;
import k21.C60960c;

/* renamed from: com.tencent.mm.plugin.sns.statistics.r */
public final class C57360r implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SnsPublishProcessStruct f164342d;

    /* renamed from: e */
    public final /* synthetic */ C60959b f164343e;

    public C57360r(SnsPublishProcessStruct snsPublishProcessStruct, C60959b bVar) {
        this.f164342d = snsPublishProcessStruct;
        this.f164343e = bVar;
    }

    public final void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion$testStaticKvStat$3");
        boolean z = true;
        Assert.assertTrue(this.f164342d.mo76272s() == 2000);
        Assert.assertTrue(this.f164342d.mo76320v() == 1000);
        Assert.assertTrue(C87412m.m108589b(this.f164342d.mo76319u(), "3"));
        Assert.assertTrue(C87412m.m108589b(this.f164342d.mo76318t(), "aaa"));
        Assert.assertTrue(C87412m.m108589b(this.f164342d.mo76321w(), "sleep_1000"));
        C60959b bVar = this.f164343e;
        C87412m.m108591d(bVar);
        Assert.assertTrue(bVar.mo85917a().size() == 0);
        if (C60960c.f173618a.mo85921e("SnsPublishProcessTest") != null) {
            z = false;
        }
        Assert.assertTrue(z);
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion$testStaticKvStat$3");
    }
}
