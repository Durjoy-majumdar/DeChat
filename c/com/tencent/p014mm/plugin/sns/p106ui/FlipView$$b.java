package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.tencent.mm.plugin.sns.ui.FlipView$$b */
public final /* synthetic */ class FlipView$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FlipView f276815d;

    /* renamed from: e */
    public final /* synthetic */ String f276816e;

    /* renamed from: f */
    public final /* synthetic */ boolean f276817f;

    public /* synthetic */ FlipView$$b(FlipView flipView, String str, boolean z) {
        this.f276815d = flipView;
        this.f276816e = str;
        this.f276817f = z;
    }

    public final void run() {
        FlipView flipView = this.f276815d;
        String str = this.f276816e;
        boolean z = this.f276817f;
        int i = FlipView.f276772S;
        flipView.getClass();
        SnsMethodCalculate.markStartTimeMs("lambda$dispatchDownloadFinish$1", "com.tencent.mm.plugin.sns.ui.FlipView");
        if (flipView.f276788Q == null) {
            SnsMethodCalculate.markEndTimeMs("lambda$dispatchDownloadFinish$1", "com.tencent.mm.plugin.sns.ui.FlipView");
            return;
        }
        Iterator it = new ArrayList(flipView.f276788Q).iterator();
        while (it.hasNext()) {
            ((FlipView$$k) it.next()).mo126098o(str, z);
        }
        SnsMethodCalculate.markEndTimeMs("lambda$dispatchDownloadFinish$1", "com.tencent.mm.plugin.sns.ui.FlipView");
    }
}
