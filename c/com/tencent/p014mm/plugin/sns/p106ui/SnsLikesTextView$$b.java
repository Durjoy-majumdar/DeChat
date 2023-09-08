package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import de3.C75360c0;
import di3.C86312j;
import p773yy.C79168k;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsLikesTextView$$b */
public class SnsLikesTextView$$b implements C75360c0.C75361a {

    /* renamed from: a */
    public final /* synthetic */ String f278268a;

    /* renamed from: b */
    public final /* synthetic */ SnsLikesTextView f278269b;

    public SnsLikesTextView$$b(SnsLikesTextView snsLikesTextView, String str) {
        this.f278269b = snsLikesTextView;
        this.f278268a = str;
    }

    /* renamed from: a */
    public void mo67369a(View view, Object obj) {
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView$1");
        C96174r rVar = this.f278269b.f278259q;
        if (rVar != null) {
            rVar.f280964b = 13;
            rVar.mo67369a(view, obj);
            ((C79168k) C86312j.m106911c(C79168k.class)).mo74109HD(this.f278268a, 7);
        }
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView$1");
    }
}
