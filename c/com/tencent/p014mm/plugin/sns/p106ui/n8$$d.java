package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import di3.C86312j;
import fy3.C32224a;
import ht1.C60200t1;
import ls3.C61397g;
import te3.C64623p81;

/* renamed from: com.tencent.mm.plugin.sns.ui.n8$$d */
public final /* synthetic */ class n8$$d implements C32224a {

    /* renamed from: d */
    public final /* synthetic */ Intent f164471d;

    /* renamed from: e */
    public final /* synthetic */ long f164472e;

    /* renamed from: f */
    public final /* synthetic */ Context f164473f;

    /* renamed from: g */
    public final /* synthetic */ long f164474g;

    /* renamed from: h */
    public final /* synthetic */ TimeLineObject f164475h;

    public /* synthetic */ n8$$d(Intent intent, long j, Context context, long j2, TimeLineObject timeLineObject) {
        this.f164471d = intent;
        this.f164472e = j;
        this.f164473f = context;
        this.f164474g = j2;
        this.f164475h = timeLineObject;
    }

    public final Object invoke() {
        Intent intent = this.f164471d;
        long j = this.f164472e;
        Context context = this.f164473f;
        long j2 = this.f164474g;
        TimeLineObject timeLineObject = this.f164475h;
        SnsMethodCalculate.markStartTimeMs("lambda$jumpToReplayLive$1", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        intent.putExtra("CURRENT_FEED_ID", j);
        intent.putExtra("LAUNCH_WITH_ANIM", true);
        C64623p81 p812 = timeLineObject.ContentObj.f298435s;
        ((C61397g) C86312j.m106911c(C61397g.class)).mo83482aR(intent, context, j, j2, p812.f184779e, p812.f184790s, p812.f184782h, "", ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76861l7().mo83771R5());
        SnsMethodCalculate.markEndTimeMs("lambda$jumpToReplayLive$1", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        return null;
    }
}
