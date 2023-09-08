package com.tencent.p014mm.plugin.sns.p106ui;

import android.widget.AbsoluteLayout;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;

/* renamed from: com.tencent.mm.plugin.sns.ui.u6 */
public class C96239u6 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SnsTimeLineUI f281224d;

    public C96239u6(SnsTimeLineUI snsTimeLineUI) {
        this.f281224d = snsTimeLineUI;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$72");
        SnsTimeLineUI.m122302d8(this.f281224d).f278851d.setSelection(0);
        SnsTimeLineUI$$y0 M7 = SnsTimeLineUI.m122285M7(this.f281224d);
        M7.getClass();
        SnsMethodCalculate.markStartTimeMs("forceInit", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$RefreshAnim");
        if (M7.f278805t) {
            if (SnsTimeLineUI.f278615X1.booleanValue()) {
                Log.m105925i("MicroMsg.SnsTimeLineUI", "force init %s %s %s", Boolean.valueOf(M7.f278805t), Float.valueOf(M7.f278808w), Integer.valueOf(M7.f278806u));
            }
            AbsoluteLayout.LayoutParams layoutParams = (AbsoluteLayout.LayoutParams) SnsTimeLineUI.m122291S7(M7.f278791A).getLayoutParams();
            layoutParams.y = M7.f278806u;
            SnsTimeLineUI.m122291S7(M7.f278791A).setLayoutParams(layoutParams);
            M7.f278794f = M7.f278807v;
            M7.f278798j = M7.f278808w;
        }
        SnsMethodCalculate.markEndTimeMs("forceInit", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$RefreshAnim");
        SnsTimeLineUI.m122285M7(this.f281224d).mo133009c();
        SnsTimeLineUI.m122290R7(this.f281224d).mo137501a(((SnsTimeLineUI$$p) SnsTimeLineUI.m122286N7(this.f281224d)).getType(), SnsTimeLineUI.m122287O7(this.f281224d), SnsTimeLineUI.m122288P7(this.f281224d), SnsTimeLineUI.m122289Q7(this.f281224d), SnsTimeLineUI.m122293U7(this.f281224d));
        MMHandler ly02 = C94866e1.ly0();
        SnsTimeLineUI snsTimeLineUI = this.f281224d;
        SnsMethodCalculate.markStartTimeMs("access$6700", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        Runnable runnable = snsTimeLineUI.f278629G1;
        SnsMethodCalculate.markEndTimeMs("access$6700", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        ly02.removeCallbacks(runnable);
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_UPDATE_SNS_TIMELINE_SCENE_INT, 2);
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$72");
    }
}
