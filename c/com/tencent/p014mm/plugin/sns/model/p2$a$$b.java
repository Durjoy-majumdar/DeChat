package com.tencent.p014mm.plugin.sns.model;

import com.tencent.p014mm.plugin.sns.model.C94928p2;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import p261wl.C15510f;
import p261wl.C38172g;

/* renamed from: com.tencent.mm.plugin.sns.model.p2$a$$b */
public final /* synthetic */ class p2$a$$b implements C38172g {

    /* renamed from: a */
    public final /* synthetic */ int f275141a;

    /* renamed from: b */
    public final /* synthetic */ boolean f275142b;

    public /* synthetic */ p2$a$$b(int i, boolean z) {
        this.f275141a = i;
        this.f275142b = z;
    }

    public final boolean invoke(C15510f fVar) {
        int i = this.f275141a;
        boolean z = this.f275142b;
        SnsMethodCalculate.markStartTimeMs("lambda$onPostEnd$0", "com.tencent.mm.plugin.sns.model.UploadManager$1");
        ((C94928p2.C94934f) fVar).onPostEnd(i, z);
        SnsMethodCalculate.markEndTimeMs("lambda$onPostEnd$0", "com.tencent.mm.plugin.sns.model.UploadManager$1");
        return false;
    }
}
