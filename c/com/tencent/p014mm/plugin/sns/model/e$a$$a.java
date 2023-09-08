package com.tencent.p014mm.plugin.sns.model;

import com.tencent.p014mm.plugin.sns.model.C94853e;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import p261wl.C15510f;
import p261wl.C38172g;

/* renamed from: com.tencent.mm.plugin.sns.model.e$a$$a */
public final /* synthetic */ class e$a$$a implements C38172g {

    /* renamed from: a */
    public final /* synthetic */ String f274850a;

    /* renamed from: b */
    public final /* synthetic */ boolean f274851b;

    public /* synthetic */ e$a$$a(String str, boolean z) {
        this.f274850a = str;
        this.f274851b = z;
    }

    public final boolean invoke(C15510f fVar) {
        String str = this.f274850a;
        boolean z = this.f274851b;
        SnsMethodCalculate.markStartTimeMs("lambda$onSightFinish$3", "com.tencent.mm.plugin.sns.model.DownloadManager$1");
        ((C94853e.C94862i) fVar).onSightFinish(str, z);
        SnsMethodCalculate.markEndTimeMs("lambda$onSightFinish$3", "com.tencent.mm.plugin.sns.model.DownloadManager$1");
        return false;
    }
}
