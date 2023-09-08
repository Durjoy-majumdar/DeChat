package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Context;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import fy3.C32224a;

/* renamed from: com.tencent.mm.plugin.sns.ui.n8$$a */
public final /* synthetic */ class n8$$a implements C32224a {

    /* renamed from: d */
    public final /* synthetic */ Context f280607d;

    /* renamed from: e */
    public final /* synthetic */ TimeLineObject f280608e;

    /* renamed from: f */
    public final /* synthetic */ long f280609f;

    /* renamed from: g */
    public final /* synthetic */ long f280610g;

    /* renamed from: h */
    public final /* synthetic */ String f280611h;

    public /* synthetic */ n8$$a(Context context, TimeLineObject timeLineObject, long j, long j2, String str) {
        this.f280607d = context;
        this.f280608e = timeLineObject;
        this.f280609f = j;
        this.f280610g = j2;
        this.f280611h = str;
    }

    public final Object invoke() {
        Context context = this.f280607d;
        TimeLineObject timeLineObject = this.f280608e;
        long j = this.f280609f;
        long j2 = this.f280610g;
        String str = this.f280611h;
        SnsMethodCalculate.markStartTimeMs("lambda$jumpToVisitorLive$0", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        C96085n8.m123104l(context, timeLineObject, j, j2, str, Boolean.TRUE);
        SnsMethodCalculate.markEndTimeMs("lambda$jumpToVisitorLive$0", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        return null;
    }
}
