package gv2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.widget.SnsAdLandingPageFloatView;

/* renamed from: gv2.i */
public class C98234i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SnsAdLandingPageFloatView f288015d;

    public C98234i(SnsAdLandingPageFloatView snsAdLandingPageFloatView) {
        this.f288015d = snsAdLandingPageFloatView;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView$7");
        SnsAdLandingPageFloatView.m123459d(this.f288015d).mo130145A();
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView$7");
    }
}
