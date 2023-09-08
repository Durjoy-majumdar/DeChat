package com.tencent.p014mm.plugin.sns.model;

import com.tencent.p014mm.plugin.sns.model.C94928p2;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import os2.C100422y;
import p261wl.C15510f;
import p261wl.C38172g;

/* renamed from: com.tencent.mm.plugin.sns.model.p2$a$$a */
public final /* synthetic */ class p2$a$$a implements C38172g {

    /* renamed from: a */
    public final /* synthetic */ C100422y f275140a;

    public /* synthetic */ p2$a$$a(C100422y yVar) {
        this.f275140a = yVar;
    }

    public final boolean invoke(C15510f fVar) {
        C100422y yVar = this.f275140a;
        SnsMethodCalculate.markStartTimeMs("lambda$updateBackView$1", "com.tencent.mm.plugin.sns.model.UploadManager$1");
        ((C94928p2.C94934f) fVar).updateBackView(yVar);
        SnsMethodCalculate.markEndTimeMs("lambda$updateBackView$1", "com.tencent.mm.plugin.sns.model.UploadManager$1");
        return false;
    }
}
