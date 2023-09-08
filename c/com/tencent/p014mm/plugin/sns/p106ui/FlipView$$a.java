package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.tencent.mm.plugin.sns.ui.FlipView$$a */
public final /* synthetic */ class FlipView$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FlipView f276813d;

    /* renamed from: e */
    public final /* synthetic */ String f276814e;

    public /* synthetic */ FlipView$$a(FlipView flipView, String str) {
        this.f276813d = flipView;
        this.f276814e = str;
    }

    public final void run() {
        FlipView flipView = this.f276813d;
        String str = this.f276814e;
        int i = FlipView.f276772S;
        flipView.getClass();
        SnsMethodCalculate.markStartTimeMs("lambda$dispatchMediaChange$2", "com.tencent.mm.plugin.sns.ui.FlipView");
        if (flipView.f276789R == null) {
            SnsMethodCalculate.markEndTimeMs("lambda$dispatchMediaChange$2", "com.tencent.mm.plugin.sns.ui.FlipView");
            return;
        }
        Iterator it = new ArrayList(flipView.f276789R).iterator();
        while (it.hasNext()) {
            ((FlipView$$l) it.next()).mo126096a(str);
        }
        SnsMethodCalculate.markEndTimeMs("lambda$dispatchMediaChange$2", "com.tencent.mm.plugin.sns.ui.FlipView");
    }
}
