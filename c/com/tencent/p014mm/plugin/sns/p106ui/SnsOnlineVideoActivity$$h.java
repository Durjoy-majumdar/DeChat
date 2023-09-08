package com.tencent.p014mm.plugin.sns.p106ui;

import av2.C92126r;
import av2.C92154z;
import com.tencent.p014mm.p136ui.widget.TouchMediaPreviewLayout;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import rx3.C13598b0;
import sn0.C90259e;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$$h */
public class SnsOnlineVideoActivity$$h implements TouchMediaPreviewLayout.C97276b {

    /* renamed from: a */
    public final /* synthetic */ SnsOnlineVideoActivity f278430a;

    public SnsOnlineVideoActivity$$h(SnsOnlineVideoActivity snsOnlineVideoActivity) {
        this.f278430a = snsOnlineVideoActivity;
    }

    /* renamed from: a */
    public void mo132739a() {
        SnsMethodCalculate.markStartTimeMs(C90259e.C90260a.NAME, "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$1");
        SnsOnlineVideoActivity snsOnlineVideoActivity = this.f278430a;
        int i = SnsOnlineVideoActivity.f278370y0;
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        snsOnlineVideoActivity.getClass();
        SnsMethodCalculate.markStartTimeMs("showLongPressMenu", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        if (snsOnlineVideoActivity.f278401i) {
            Log.m105924i("MicroMsg.SnsOnlineVideoActivity", "it is preview mode, don't show menu.");
            SnsMethodCalculate.markEndTimeMs("showLongPressMenu", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        } else {
            C92126r rVar = new C92126r(snsOnlineVideoActivity, 4);
            snsOnlineVideoActivity.f278411u = rVar;
            rVar.mo126099b(snsOnlineVideoActivity.f278403n, snsOnlineVideoActivity.f278404o);
            snsOnlineVideoActivity.f278411u.mo126110m(snsOnlineVideoActivity.mo132872T7(), snsOnlineVideoActivity.mo132873U7(), (C32224a<C13598b0>) null);
            snsOnlineVideoActivity.f278411u.mo126108k(snsOnlineVideoActivity.f278415x0);
            snsOnlineVideoActivity.f278411u.mo126107j(new C95759d5(snsOnlineVideoActivity));
            snsOnlineVideoActivity.f278411u.mo126109l();
            C92154z.m115828a(snsOnlineVideoActivity);
            SnsMethodCalculate.markEndTimeMs("showLongPressMenu", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        }
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        SnsMethodCalculate.markEndTimeMs(C90259e.C90260a.NAME, "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$1");
    }
}
