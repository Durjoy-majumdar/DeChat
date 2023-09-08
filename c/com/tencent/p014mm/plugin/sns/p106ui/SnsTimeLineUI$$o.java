package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$$o */
public class SnsTimeLineUI$$o implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f278770d;

    /* renamed from: e */
    public final /* synthetic */ SnsTimeLineUI f278771e;

    public SnsTimeLineUI$$o(SnsTimeLineUI snsTimeLineUI, boolean z) {
        this.f278771e = snsTimeLineUI;
        this.f278770d = z;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$33");
        int firstVisiblePosition = SnsTimeLineUI.m122302d8(this.f278771e).f278851d.getFirstVisiblePosition();
        int lastVisiblePosition = SnsTimeLineUI.m122302d8(this.f278771e).f278851d.getLastVisiblePosition();
        Log.m105919d("MicroMsg.SnsTimeLineUI", "notifyList from:%s to:%s", Integer.valueOf(firstVisiblePosition), Integer.valueOf(lastVisiblePosition));
        SnsTimeLineUI.m122292T7(this.f278771e, firstVisiblePosition, lastVisiblePosition);
        if (this.f278770d) {
            SnsTimeLineUI.m122302d8(this.f278771e).mo133025A();
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$33");
    }
}
