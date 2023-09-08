package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.model.C5431p1;
import com.tencent.p014mm.plugin.sns.p106ui.SnsCommentFooter;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.sns.ui.b6 */
public class C95744b6 implements SnsCommentFooter.C95535f {

    /* renamed from: a */
    public final /* synthetic */ SnsStrangerCommentDetailUI f279257a;

    public C95744b6(SnsStrangerCommentDetailUI snsStrangerCommentDetailUI) {
        this.f279257a = snsStrangerCommentDetailUI;
    }

    /* renamed from: a */
    public void mo132108a(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("onCommentSend", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$11");
        Log.m105926v("MicroMsg.SnsStrangerCommentDetailUI", "comment send requested");
        SnsStrangerCommentDetailUI snsStrangerCommentDetailUI = this.f279257a;
        int i = SnsStrangerCommentDetailUI.f278516y;
        SnsMethodCalculate.markStartTimeMs("access$402", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        snsStrangerCommentDetailUI.f278531u = true;
        SnsMethodCalculate.markEndTimeMs("access$402", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        SnsStrangerCommentDetailUI snsStrangerCommentDetailUI2 = this.f279257a;
        SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        SnsInfo snsInfo = snsStrangerCommentDetailUI2.f278525o;
        SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        SnsMethodCalculate.markStartTimeMs("sendTextComment", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        if (str == null || str.trim().equals("")) {
            SnsMethodCalculate.markEndTimeMs("sendTextComment", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        } else {
            C5431p1.C5432a.m5343n(snsStrangerCommentDetailUI2.f278528r, 3, str, snsInfo, snsStrangerCommentDetailUI2.f278532v);
            SnsMethodCalculate.markEndTimeMs("sendTextComment", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        }
        SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        SnsMethodCalculate.markEndTimeMs("onCommentSend", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$11");
    }
}
