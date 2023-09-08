package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.ScreenShotUtil;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$$c0 */
public class SnsTimeLineUI$$c0 implements ScreenShotUtil.ScreenShotCallback {

    /* renamed from: d */
    public final /* synthetic */ SnsTimeLineUI f82115d;

    public SnsTimeLineUI$$c0(SnsTimeLineUI snsTimeLineUI) {
        this.f82115d = snsTimeLineUI;
    }

    public void onScreenShot(String str, long j) {
        SnsMethodCalculate.markStartTimeMs("onScreenShot", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$47");
        Log.m105924i("MicroMsg.SnsTimeLineUI.ScreenShot", "onScreenShot， path = " + str + "， dateAdded = " + j);
        SnsTimeLineUI.m122301c8(this.f82115d);
        SnsMethodCalculate.markEndTimeMs("onScreenShot", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$47");
    }
}
