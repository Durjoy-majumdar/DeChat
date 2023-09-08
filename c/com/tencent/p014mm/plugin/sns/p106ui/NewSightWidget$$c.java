package com.tencent.p014mm.plugin.sns.p106ui;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.C95005x;
import com.tencent.p014mm.sdk.platformtools.Log;
import if3.C98670a;

/* renamed from: com.tencent.mm.plugin.sns.ui.NewSightWidget$$c */
public final /* synthetic */ class NewSightWidget$$c implements C96168q2 {

    /* renamed from: a */
    public final /* synthetic */ NewSightWidget f277077a;

    public /* synthetic */ NewSightWidget$$c(NewSightWidget newSightWidget) {
        this.f277077a = newSightWidget;
    }

    /* renamed from: a */
    public final void mo132267a(int i, C98670a aVar, String str) {
        NewSightWidget newSightWidget = this.f277077a;
        newSightWidget.getClass();
        SnsMethodCalculate.markStartTimeMs("lambda$handleBackgroundVideo$0", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        Log.m105925i("MicroMsg.SightWidget", "handleBackgroundVideo >> workType: %d, workTagId: %s", Integer.valueOf(i), str);
        if (!TextUtils.equals(str, newSightWidget.f277025O) || TextUtils.isEmpty(str)) {
            Log.m105921e("MicroMsg.SightWidget", "handleBackgroundVideo >> workTagId is error, backgroundRemuxWorkId: %s, workTagId: %s", newSightWidget.f277025O, str);
        } else {
            if (i != 1 || aVar == null) {
                newSightWidget.mo132265y();
                Log.m105920e("MicroMsg.SightWidget", "current video failed");
            } else {
                Log.m105924i("MicroMsg.SightWidget", "result is success, go to replace video");
                newSightWidget.mo132258r();
            }
            C95005x.f275632a.mo131409d(false);
        }
        SnsMethodCalculate.markEndTimeMs("lambda$handleBackgroundVideo$0", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
    }
}
