package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import p232rw.C77575r;
import wx3.C15601d;
import wx3.C66212f;
import wx3.C66217g;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$$s0 */
public class SnsTimeLineUI$$s0 implements C15601d<C77575r> {

    /* renamed from: d */
    public final /* synthetic */ MMActivity f278781d;

    public SnsTimeLineUI$$s0(MMActivity mMActivity) {
        this.f278781d = mMActivity;
    }

    public C66212f getContext() {
        SnsMethodCalculate.markStartTimeMs("getContext", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$71");
        C66217g gVar = C66217g.f190253d;
        SnsMethodCalculate.markEndTimeMs("getContext", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$71");
        return gVar;
    }

    public void resumeWith(Object obj) {
        SnsMethodCalculate.markStartTimeMs("resumeWith", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$71");
        MMActivity mMActivity = this.f278781d;
        Boolean bool = SnsTimeLineUI.f278611T1;
        SnsMethodCalculate.markStartTimeMs("access$6600", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        SnsTimeLineUI.m122312t8(mMActivity, obj);
        SnsMethodCalculate.markEndTimeMs("access$6600", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        SnsMethodCalculate.markEndTimeMs("resumeWith", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$71");
    }
}
