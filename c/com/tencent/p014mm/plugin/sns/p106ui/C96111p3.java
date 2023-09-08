package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import ps2.C100880k;

/* renamed from: com.tencent.mm.plugin.sns.ui.p3 */
public class C96111p3 implements C100880k.C100881a {

    /* renamed from: a */
    public final /* synthetic */ String f280716a;

    /* renamed from: b */
    public final /* synthetic */ C96098o3 f280717b;

    public C96111p3(C96098o3 o3Var, String str) {
        this.f280717b = o3Var;
        this.f280716a = str;
    }

    /* renamed from: a */
    public void mo76113a() {
        SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl$3");
        StringBuilder sb = new StringBuilder();
        sb.append("onDownloadError, snsId=");
        sb.append(C96098o3.m123129c(this.f280717b) == null ? "" : Long.valueOf(C96098o3.m123129c(this.f280717b).field_snsId));
        sb.append(", url=");
        sb.append(this.f280716a);
        Log.m105920e("SnsAdPressGestureCtrl", sb.toString());
        SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl$3");
    }

    /* renamed from: b */
    public void mo76114b() {
        SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl$3");
        SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl$3");
    }

    /* renamed from: c */
    public void mo76115c(String str) {
        SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl$3");
        Log.m105924i("SnsAdPressGestureCtrl", "onDownloaded succ");
        SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl$3");
    }
}
