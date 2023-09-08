package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import p232rw.C77575r;
import wx3.C15601d;
import wx3.C66212f;
import wx3.C66217g;

/* renamed from: com.tencent.mm.plugin.sns.ui.NewSightWidget$$g */
public class NewSightWidget$$g implements C15601d<C77575r> {

    /* renamed from: d */
    public final /* synthetic */ NewSightWidget f277081d;

    public NewSightWidget$$g(NewSightWidget newSightWidget) {
        this.f277081d = newSightWidget;
    }

    public C66212f getContext() {
        SnsMethodCalculate.markStartTimeMs("getContext", "com.tencent.mm.plugin.sns.ui.NewSightWidget$10");
        C66217g gVar = C66217g.f190253d;
        SnsMethodCalculate.markEndTimeMs("getContext", "com.tencent.mm.plugin.sns.ui.NewSightWidget$10");
        return gVar;
    }

    public void resumeWith(Object obj) {
        SnsMethodCalculate.markStartTimeMs("resumeWith", "com.tencent.mm.plugin.sns.ui.NewSightWidget$10");
        this.f277081d.mo132254n(obj);
        SnsMethodCalculate.markEndTimeMs("resumeWith", "com.tencent.mm.plugin.sns.ui.NewSightWidget$10");
    }
}
