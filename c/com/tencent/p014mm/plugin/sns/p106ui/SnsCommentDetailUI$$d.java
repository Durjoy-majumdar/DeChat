package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import yn2.C102882s0;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$$d */
public final /* synthetic */ class SnsCommentDetailUI$$d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SnsCommentDetailUI f278025d;

    /* renamed from: e */
    public final /* synthetic */ TimeLineObject f278026e;

    /* renamed from: f */
    public final /* synthetic */ SnsInfo f278027f;

    /* renamed from: g */
    public final /* synthetic */ String f278028g;

    public /* synthetic */ SnsCommentDetailUI$$d(SnsCommentDetailUI snsCommentDetailUI, TimeLineObject timeLineObject, SnsInfo snsInfo, String str) {
        this.f278025d = snsCommentDetailUI;
        this.f278026e = timeLineObject;
        this.f278027f = snsInfo;
        this.f278028g = str;
    }

    public final void run() {
        SnsCommentDetailUI snsCommentDetailUI = this.f278025d;
        TimeLineObject timeLineObject = this.f278026e;
        SnsInfo snsInfo = this.f278027f;
        String str = this.f278028g;
        int i = SnsCommentDetailUI.f277824M1;
        snsCommentDetailUI.getClass();
        SnsMethodCalculate.markStartTimeMs("lambda$initView$0", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        if (C102882s0.f303681a.mo142597i(snsCommentDetailUI, timeLineObject.ContentDesc, snsInfo.field_snsId, (long) snsInfo.localid, str, true)) {
            snsCommentDetailUI.f277894o.removeHeaderView(snsCommentDetailUI.f277885i);
        }
        SnsMethodCalculate.markEndTimeMs("lambda$initView$0", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }
}
