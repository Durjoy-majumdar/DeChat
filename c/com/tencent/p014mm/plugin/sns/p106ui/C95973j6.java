package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.sns.ui.j6 */
public class C95973j6 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SnsTimeLineUI$$e f280243d;

    public C95973j6(SnsTimeLineUI$$e snsTimeLineUI$$e) {
        this.f280243d = snsTimeLineUI$$e;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$22$1");
        if (SnsTimeLineUI.m122282J7(this.f280243d.f278738d) != null) {
            Log.m105924i("MicroMsg.SnsTimeLineUI", "mAdPullEndFunction called");
            SnsTimeLineUI.m122282J7(this.f280243d.f278738d).mo133186F0("");
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$22$1");
    }
}
