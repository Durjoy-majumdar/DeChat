package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.sns.ui.n3 */
public class C96081n3 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f280567d;

    /* renamed from: e */
    public final /* synthetic */ C96098o3 f280568e;

    public C96081n3(C96098o3 o3Var, long j) {
        this.f280568e = o3Var;
        this.f280567d = j;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl$1");
        try {
            C96098o3 o3Var = this.f280568e;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
            C96066m2 m2Var = o3Var.f280668e;
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
            boolean g = m2Var.f280504g.mo132283g();
            Log.m105918d("SnsAdPressGestureCtrl", "checkLongPressGesture, start=" + C96098o3.m123127a(this.f280568e).f275743a + ", end=" + C96098o3.m123127a(this.f280568e).f275744b + ", duration=" + C96098o3.m123127a(this.f280568e).f275750h + ", curPlayTime=" + this.f280567d + ", isPlaying=" + g);
            if (this.f280567d < ((long) C96098o3.m123127a(this.f280568e).f275743a) || !g) {
                this.f280568e.mo133657d();
            } else {
                this.f280568e.mo133658e();
            }
        } catch (Exception e) {
            Log.m105920e("SnsAdPressGestureCtrl", "checkLongPressGesture, exp=" + e.toString());
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl$1");
    }
}
