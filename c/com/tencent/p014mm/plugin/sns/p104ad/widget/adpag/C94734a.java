package com.tencent.p014mm.plugin.sns.p104ad.widget.adpag;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import org.libpag.PAGView;

/* renamed from: com.tencent.mm.plugin.sns.ad.widget.adpag.a */
public class C94734a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AdPAGFrameContainer f274228d;

    public C94734a(AdPAGFrameContainer adPAGFrameContainer) {
        this.f274228d = adPAGFrameContainer;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer$4");
        AdPAGFrameContainer adPAGFrameContainer = this.f274228d;
        int i = AdPAGFrameContainer.f274214p;
        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
        PAGView pAGView = adPAGFrameContainer.f274215d;
        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
        pAGView.play();
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer$4");
    }
}
