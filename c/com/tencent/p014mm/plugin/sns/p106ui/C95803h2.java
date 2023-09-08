package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import ps2.C100880k;

/* renamed from: com.tencent.mm.plugin.sns.ui.h2 */
public class C95803h2 implements C100880k.C100881a {

    /* renamed from: a */
    public final /* synthetic */ SightVideoFullScreenView f279553a;

    public C95803h2(SightVideoFullScreenView sightVideoFullScreenView) {
        this.f279553a = sightVideoFullScreenView;
    }

    /* renamed from: a */
    public void mo76113a() {
        SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$1");
        SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$1");
    }

    /* renamed from: b */
    public void mo76114b() {
        SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$1");
        SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$1");
    }

    /* renamed from: c */
    public void mo76115c(String str) {
        SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$1");
        try {
            SightVideoFullScreenView.m121754b(this.f279553a).mo132281e(str);
        } catch (Throwable th) {
            Log.m105920e("SightVideoFullScreenView", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$1");
    }
}
