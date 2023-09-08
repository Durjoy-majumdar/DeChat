package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import de3.C75360c0;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsLikesTextView$$a */
public final /* synthetic */ class SnsLikesTextView$$a implements C75360c0.C75361a {

    /* renamed from: a */
    public final /* synthetic */ SnsLikesTextView f278267a;

    public /* synthetic */ SnsLikesTextView$$a(SnsLikesTextView snsLikesTextView) {
        this.f278267a = snsLikesTextView;
    }

    /* renamed from: a */
    public final void mo67369a(View view, Object obj) {
        SnsLikesTextView snsLikesTextView = this.f278267a;
        int i = SnsLikesTextView.f278248y;
        snsLikesTextView.getClass();
        SnsMethodCalculate.markStartTimeMs("lambda$setLikedListLayout$0", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
        C96174r rVar = snsLikesTextView.f278259q;
        if (rVar != null) {
            rVar.f280964b = 13;
            rVar.mo67369a(view, obj);
        }
        SnsMethodCalculate.markEndTimeMs("lambda$setLikedListLayout$0", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
    }
}
