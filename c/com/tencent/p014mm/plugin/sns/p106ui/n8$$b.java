package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import e30.C75539a;

/* renamed from: com.tencent.mm.plugin.sns.ui.n8$$b */
public final /* synthetic */ class n8$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f280612d;

    /* renamed from: e */
    public final /* synthetic */ String f280613e;

    /* renamed from: f */
    public final /* synthetic */ String f280614f;

    public /* synthetic */ n8$$b(int i, String str, String str2) {
        this.f280612d = i;
        this.f280613e = str;
        this.f280614f = str2;
    }

    public final void run() {
        int i = this.f280612d;
        String str = this.f280613e;
        String str2 = this.f280614f;
        SnsMethodCalculate.markStartTimeMs("lambda$publicClickEvent$3", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        if (i == 1 || i == 3 || i == 15) {
            SnsInfo DN = C94866e1.Yx0().mo139798DN(str);
            if (DN == null) {
                SnsMethodCalculate.markEndTimeMs("lambda$publicClickEvent$3", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
                return;
            }
            C75539a.m90584d(str2, DN.getSnsId(), i);
            SnsMethodCalculate.markEndTimeMs("lambda$publicClickEvent$3", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
            return;
        }
        SnsMethodCalculate.markEndTimeMs("lambda$publicClickEvent$3", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
    }
}
