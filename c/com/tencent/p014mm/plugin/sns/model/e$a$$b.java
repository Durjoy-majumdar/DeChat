package com.tencent.p014mm.plugin.sns.model;

import com.tencent.p014mm.plugin.sns.model.C94853e;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import p261wl.C15510f;
import p261wl.C38172g;

/* renamed from: com.tencent.mm.plugin.sns.model.e$a$$b */
public final /* synthetic */ class e$a$$b implements C38172g {

    /* renamed from: a */
    public final /* synthetic */ String f274852a;

    /* renamed from: b */
    public final /* synthetic */ boolean f274853b;

    public /* synthetic */ e$a$$b(String str, boolean z) {
        this.f274852a = str;
        this.f274853b = z;
    }

    public final boolean invoke(C15510f fVar) {
        String str = this.f274852a;
        boolean z = this.f274853b;
        SnsMethodCalculate.markStartTimeMs("lambda$onImageFinish$1", "com.tencent.mm.plugin.sns.model.DownloadManager$1");
        ((C94853e.C94862i) fVar).onImageFinish(str, z);
        SnsMethodCalculate.markEndTimeMs("lambda$onImageFinish$1", "com.tencent.mm.plugin.sns.model.DownloadManager$1");
        return false;
    }
}
