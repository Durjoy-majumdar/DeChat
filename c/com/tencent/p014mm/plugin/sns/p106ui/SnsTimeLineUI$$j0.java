package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$$j0 */
public class SnsTimeLineUI$$j0 implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ SnsTimeLineUI f278760d;

    public SnsTimeLineUI$$j0(SnsTimeLineUI snsTimeLineUI) {
        this.f278760d = snsTimeLineUI;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        SnsMethodCalculate.markStartTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$54");
        if (motionEvent.getAction() == 1) {
            if (SnsTimeLineUI.m122302d8(this.f278760d).f278851d != null && SnsTimeLineUI.m122302d8(this.f278760d).f278851d.getFirstVisiblePosition() == 0) {
                Log.m105918d("MicroMsg.SnsTimeLineUI", "refreshIv onTouch set refreshIv visible");
            }
            SnsTimeLineUI.m122285M7(this.f278760d).mo133010d();
        }
        if (motionEvent.getAction() == 0) {
            if (SnsTimeLineUI.m122302d8(this.f278760d).f278851d != null) {
                SnsTimeLineUI.m122302d8(this.f278760d).f278851d.getFirstVisiblePosition();
            }
            SnsTimeLineUI.m122284L7(this.f278760d).mo132087i();
            SnsTimeLineUI.m122284L7(this.f278760d).f276710t.mo133679d();
        }
        SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$54");
        return false;
    }
}
