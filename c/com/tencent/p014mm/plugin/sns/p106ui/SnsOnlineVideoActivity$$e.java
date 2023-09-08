package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.model.C94867e2;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.pointers.PInt;
import hd0.C98429r0;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$$e */
public class SnsOnlineVideoActivity$$e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f278423d;

    /* renamed from: e */
    public final /* synthetic */ int f278424e;

    /* renamed from: f */
    public final /* synthetic */ int f278425f;

    /* renamed from: g */
    public final /* synthetic */ SnsOnlineVideoActivity f278426g;

    public SnsOnlineVideoActivity$$e(SnsOnlineVideoActivity snsOnlineVideoActivity, String str, int i, int i2) {
        this.f278426g = snsOnlineVideoActivity;
        this.f278423d = str;
        this.f278424e = i;
        this.f278425f = i2;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$11");
        PInt pInt = new PInt();
        C98429r0.m127821l(C94867e2.m120287f(SnsOnlineVideoActivity.m122196K7(this.f278426g), SnsOnlineVideoActivity.m122195J7(this.f278426g).getTimeLine().ContentObj.f298427h.get(0)), pInt, new PInt());
        C115669n.INSTANCE.mo160131h(15534, this.f278423d, SnsOnlineVideoActivity.m122195J7(this.f278426g).getTimeLine().f283893Id, Integer.valueOf(this.f278424e), Integer.valueOf(pInt.value * 1000), Integer.valueOf(this.f278425f * 1000));
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$11");
    }
}
