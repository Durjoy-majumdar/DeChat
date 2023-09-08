package com.tencent.p014mm.plugin.sns.p106ui;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import hf3.C98449c;
import if3.C98670a;

/* renamed from: com.tencent.mm.plugin.sns.ui.NewSightWidget$$d */
public final /* synthetic */ class NewSightWidget$$d implements C96168q2 {

    /* renamed from: a */
    public final /* synthetic */ NewSightWidget f277078a;

    public /* synthetic */ NewSightWidget$$d(NewSightWidget newSightWidget) {
        this.f277078a = newSightWidget;
    }

    /* renamed from: a */
    public final void mo132267a(int i, C98670a aVar, String str) {
        NewSightWidget newSightWidget = this.f277078a;
        newSightWidget.getClass();
        SnsMethodCalculate.markStartTimeMs("lambda$handleBackgroundVideo$1", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        Log.m105925i("MicroMsg.SightWidget", "handleBackgroundVideo getRemuxVideoWork >> workType: %d, workTagId: %s", Integer.valueOf(i), str);
        if (!TextUtils.equals(str, newSightWidget.f277025O) || TextUtils.isEmpty(str)) {
            Log.m105921e("MicroMsg.SightWidget", "handleBackgroundVideo getRemuxVideoWork >> workTagId is error, backgroundRemuxWorkId: %s, workTagId: %s", newSightWidget.f277025O, str);
        } else if (aVar == null) {
            newSightWidget.mo132265y();
            Log.m105921e("MicroMsg.SightWidget", "handleBackgroundVideo getRemuxVideoWork >> isError: %s", str);
        } else if (i == 1) {
            Log.m105925i("MicroMsg.SightWidget", "handleBackgroundVideo getRemuxVideoWork >> isSuccess workTagId: %s", str);
            newSightWidget.mo132258r();
        } else if (i == 3) {
            Log.m105925i("MicroMsg.SightWidget", "handleBackgroundVideo getRemuxVideoWork >> isFailed workTagId: %s", str);
            newSightWidget.mo132265y();
        } else if (i == 2) {
            Log.m105924i("MicroMsg.SightWidget", "work is running");
            ((C98449c) C86312j.m106911c(C98449c.class)).lp0(newSightWidget.f277025O, 9);
        }
        SnsMethodCalculate.markEndTimeMs("lambda$handleBackgroundVideo$1", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
    }
}
