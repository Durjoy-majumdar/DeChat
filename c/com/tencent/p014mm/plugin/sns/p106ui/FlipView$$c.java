package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.sns.ui.FlipView$$c */
public final /* synthetic */ class FlipView$$c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FlipView f276818d;

    /* renamed from: e */
    public final /* synthetic */ String f276819e;

    /* renamed from: f */
    public final /* synthetic */ List f276820f;

    public /* synthetic */ FlipView$$c(FlipView flipView, String str, List list) {
        this.f276818d = flipView;
        this.f276819e = str;
        this.f276820f = list;
    }

    public final void run() {
        FlipView flipView = this.f276818d;
        String str = this.f276819e;
        List list = this.f276820f;
        int i = FlipView.f276772S;
        flipView.getClass();
        SnsMethodCalculate.markStartTimeMs("lambda$dispatchCodeScanned$0", "com.tencent.mm.plugin.sns.ui.FlipView");
        if (flipView.f276787P == null) {
            SnsMethodCalculate.markEndTimeMs("lambda$dispatchCodeScanned$0", "com.tencent.mm.plugin.sns.ui.FlipView");
            return;
        }
        Iterator it = new ArrayList(flipView.f276787P).iterator();
        while (it.hasNext()) {
            ((FlipView$$m) it.next()).mo126097s(str, list);
        }
        SnsMethodCalculate.markEndTimeMs("lambda$dispatchCodeScanned$0", "com.tencent.mm.plugin.sns.ui.FlipView");
    }
}
