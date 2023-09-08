package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import nj3.C76912y0;
import p244tt.C14088e;
import qo3.C89779i0;

/* renamed from: com.tencent.mm.plugin.sns.ui.n8$$u */
public class n8$$u implements C14088e.C14090b {

    /* renamed from: a */
    public final /* synthetic */ C89779i0 f21247a;

    /* renamed from: b */
    public final /* synthetic */ boolean f21248b;

    /* renamed from: c */
    public final /* synthetic */ Context f21249c;

    /* renamed from: d */
    public final /* synthetic */ C95787g0 f21250d;

    public n8$$u(C89779i0 i0Var, boolean z, Context context, C95787g0 g0Var) {
        this.f21247a = i0Var;
        this.f21248b = z;
        this.f21249c = context;
        this.f21250d = g0Var;
    }

    /* renamed from: a */
    public void mo1717a() {
        SnsMethodCalculate.markStartTimeMs("success", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$26");
        C115669n.INSTANCE.mo175913w(1293, 33, 1);
        this.f21247a.cancel();
        SnsMethodCalculate.markEndTimeMs("success", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$26");
    }

    /* renamed from: b */
    public void mo1718b() {
        SnsMethodCalculate.markStartTimeMs("fail", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$26");
        if (!this.f21248b) {
            C76912y0.makeText(this.f21249c, (int) C0966R.string.gaq, 0).show();
        } else {
            View view = new View(this.f21249c);
            view.setTag(this.f21250d);
            C96085n8.f280580B.onClick(view);
        }
        this.f21247a.cancel();
        SnsMethodCalculate.markEndTimeMs("fail", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$26");
    }
}
