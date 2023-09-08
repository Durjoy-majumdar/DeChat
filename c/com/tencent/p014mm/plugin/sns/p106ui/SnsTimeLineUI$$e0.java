package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.animation.Animation;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$$e0 */
public class SnsTimeLineUI$$e0 implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ SnsTimeLineUI f278739a;

    public SnsTimeLineUI$$e0(SnsTimeLineUI snsTimeLineUI) {
        this.f278739a = snsTimeLineUI;
    }

    public void onAnimationEnd(Animation animation) {
        SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$49");
        Log.m105924i("MicroMsg.SnsTimeLineUI", "refreshAnim end");
        SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$49");
    }

    public void onAnimationRepeat(Animation animation) {
        SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$49");
        Log.m105924i("MicroMsg.SnsTimeLineUI", "refreshAnim repeat");
        SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$49");
    }

    public void onAnimationStart(Animation animation) {
        SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$49");
        Log.m105924i("MicroMsg.SnsTimeLineUI", "refreshAnim start");
        SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$49");
    }
}
