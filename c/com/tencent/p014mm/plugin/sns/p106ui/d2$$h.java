package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import p232rw.C77575r;
import wx3.C15601d;
import wx3.C66212f;
import wx3.C66217g;

/* renamed from: com.tencent.mm.plugin.sns.ui.d2$$h */
public class d2$$h implements C15601d<C77575r> {

    /* renamed from: d */
    public final /* synthetic */ C95754d2 f279340d;

    public d2$$h(C95754d2 d2Var) {
        this.f279340d = d2Var;
    }

    public C66212f getContext() {
        SnsMethodCalculate.markStartTimeMs("getContext", "com.tencent.mm.plugin.sns.ui.PicWidget$6");
        C66217g gVar = C66217g.f190253d;
        SnsMethodCalculate.markEndTimeMs("getContext", "com.tencent.mm.plugin.sns.ui.PicWidget$6");
        return gVar;
    }

    public void resumeWith(Object obj) {
        SnsMethodCalculate.markStartTimeMs("resumeWith", "com.tencent.mm.plugin.sns.ui.PicWidget$6");
        this.f279340d.mo132254n(obj);
        SnsMethodCalculate.markEndTimeMs("resumeWith", "com.tencent.mm.plugin.sns.ui.PicWidget$6");
    }
}
