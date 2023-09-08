package com.tencent.p014mm.plugin.sns.model;

import com.tencent.p014mm.plugin.sns.model.C94853e;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import p261wl.C15510f;
import p261wl.C38172g;

/* renamed from: com.tencent.mm.plugin.sns.model.e$a$$d */
public final /* synthetic */ class e$a$$d implements C38172g {

    /* renamed from: a */
    public final /* synthetic */ String f274854a;

    public /* synthetic */ e$a$$d(String str) {
        this.f274854a = str;
    }

    public final boolean invoke(C15510f fVar) {
        String str = this.f274854a;
        SnsMethodCalculate.markStartTimeMs("lambda$onThumbFinish$0", "com.tencent.mm.plugin.sns.model.DownloadManager$1");
        ((C94853e.C94862i) fVar).onThumbFinish(str);
        SnsMethodCalculate.markEndTimeMs("lambda$onThumbFinish$0", "com.tencent.mm.plugin.sns.model.DownloadManager$1");
        return false;
    }
}
