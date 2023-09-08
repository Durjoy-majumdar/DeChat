package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import nj3.C76912y0;
import p244tt.C14088e;
import qo3.C89779i0;

/* renamed from: com.tencent.mm.plugin.sns.ui.n8$$x */
public class n8$$x implements C14088e.C14090b {

    /* renamed from: a */
    public final /* synthetic */ C89779i0 f21251a;

    /* renamed from: b */
    public final /* synthetic */ Context f21252b;

    public n8$$x(C89779i0 i0Var, Context context) {
        this.f21251a = i0Var;
        this.f21252b = context;
    }

    /* renamed from: a */
    public void mo1717a() {
        SnsMethodCalculate.markStartTimeMs("success", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$29");
        this.f21251a.cancel();
        SnsMethodCalculate.markEndTimeMs("success", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$29");
    }

    /* renamed from: b */
    public void mo1718b() {
        SnsMethodCalculate.markStartTimeMs("fail", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$29");
        C76912y0.makeText(this.f21252b, (int) C0966R.string.gaq, 0).show();
        this.f21251a.cancel();
        SnsMethodCalculate.markEndTimeMs("fail", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$29");
    }
}
