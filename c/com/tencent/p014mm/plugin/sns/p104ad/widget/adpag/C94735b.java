package com.tencent.p014mm.plugin.sns.p104ad.widget.adpag;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import org.libpag.PAGView;

/* renamed from: com.tencent.mm.plugin.sns.ad.widget.adpag.b */
public class C94735b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AdPAGFrameContainer f274229d;

    public C94735b(AdPAGFrameContainer adPAGFrameContainer) {
        this.f274229d = adPAGFrameContainer;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer$5");
        AdPAGFrameContainer adPAGFrameContainer = this.f274229d;
        int i = AdPAGFrameContainer.f274214p;
        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
        PAGView pAGView = adPAGFrameContainer.f274215d;
        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
        pAGView.stop();
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer$5");
    }
}
