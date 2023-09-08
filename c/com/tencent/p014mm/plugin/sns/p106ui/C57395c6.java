package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import di3.C86312j;
import eb0.C45628s0;
import nj3.C76879j;
import p214om.C11502f;

/* renamed from: com.tencent.mm.plugin.sns.ui.c6 */
public class C57395c6 implements C76879j.C11180n {

    /* renamed from: a */
    public final /* synthetic */ SnsStrangerCommentDetailUI f164405a;

    public C57395c6(SnsStrangerCommentDetailUI snsStrangerCommentDetailUI) {
        this.f164405a = snsStrangerCommentDetailUI;
    }

    /* renamed from: j */
    public void mo782j(int i) {
        Class cls = C11502f.class;
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$4");
        if (i == 0) {
            if (SnsStrangerCommentDetailUI.m122242I7(this.f164405a).mo62920o3()) {
                C45628s0.m50813z0(SnsStrangerCommentDetailUI.m122242I7(this.f164405a));
                SnsStrangerCommentDetailUI.m122242I7(this.f164405a).mo62933t4();
                ((C11502f) C86312j.m106911c(cls)).mo11461Sr().mo93136Bk();
            } else {
                C45628s0.m50769d0(SnsStrangerCommentDetailUI.m122242I7(this.f164405a));
                SnsStrangerCommentDetailUI.m122242I7(this.f164405a).mo62853E3();
                ((C11502f) C86312j.m106911c(cls)).mo11461Sr().mo93136Bk();
            }
        }
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$4");
    }
}
