package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import de3.C75360c0;
import te3.w64;
import vr2.C102260r;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsLikesTextView$$c */
public class SnsLikesTextView$$c implements C75360c0.C75361a {

    /* renamed from: a */
    public final /* synthetic */ int f278270a;

    /* renamed from: b */
    public final /* synthetic */ w64 f278271b;

    /* renamed from: c */
    public final /* synthetic */ C96275w6 f278272c;

    /* renamed from: d */
    public final /* synthetic */ SnsLikesTextView f278273d;

    public SnsLikesTextView$$c(SnsLikesTextView snsLikesTextView, int i, w64 w64, C96275w6 w6Var) {
        this.f278273d = snsLikesTextView;
        this.f278270a = i;
        this.f278271b = w64;
        this.f278272c = w6Var;
    }

    /* renamed from: a */
    public void mo67369a(View view, Object obj) {
        w64 w64;
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView$2");
        if (this.f278273d.f278259q != null) {
            if (this.f278270a != 0 || (w64 = this.f278271b) == null || !C102260r.m134838G(this.f278272c.f281367a, w64)) {
                this.f278273d.f278259q.f280964b = 13;
            } else {
                this.f278273d.f278259q.f280964b = 0;
            }
            this.f278273d.f278259q.mo67369a(view, obj);
        }
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView$2");
    }
}
