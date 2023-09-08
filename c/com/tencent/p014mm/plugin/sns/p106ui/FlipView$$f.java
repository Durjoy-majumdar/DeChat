package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.autogen.events.CancelRecogImageFileEvent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import fy3.C32224a;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.sns.ui.FlipView$$f */
public class FlipView$$f implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FlipView f276821d;

    public FlipView$$f(FlipView flipView) {
        this.f276821d = flipView;
    }

    public Object invoke() {
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.FlipView$3");
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.FlipView$3");
        FlipView flipView = this.f276821d;
        int i = FlipView.f276772S;
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.FlipView");
        FlipView$$n flipView$$n = flipView.f276775C;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.FlipView");
        if (flipView$$n != null) {
            FlipView flipView2 = this.f276821d;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.FlipView");
            FlipView$$n flipView$$n2 = flipView2.f276775C;
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.FlipView");
            flipView$$n2.mo132169a();
        }
        CancelRecogImageFileEvent cancelRecogImageFileEvent = new CancelRecogImageFileEvent();
        CancelRecogImageFileEvent.C40046a aVar = cancelRecogImageFileEvent.f107390d;
        FlipView flipView3 = this.f276821d;
        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.FlipView");
        long j = flipView3.f276807x;
        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.FlipView");
        aVar.f107391a = j;
        cancelRecogImageFileEvent.f107390d.f107392b = FlipView.m121475c(this.f276821d);
        cancelRecogImageFileEvent.publish();
        FlipView flipView4 = this.f276821d;
        SnsMethodCalculate.markStartTimeMs("access$302", "com.tencent.mm.plugin.sns.ui.FlipView");
        flipView4.getClass();
        SnsMethodCalculate.markEndTimeMs("access$302", "com.tencent.mm.plugin.sns.ui.FlipView");
        FlipView flipView5 = this.f276821d;
        SnsMethodCalculate.markStartTimeMs("access$402", "com.tencent.mm.plugin.sns.ui.FlipView");
        flipView5.getClass();
        SnsMethodCalculate.markEndTimeMs("access$402", "com.tencent.mm.plugin.sns.ui.FlipView");
        FlipView flipView6 = this.f276821d;
        SnsMethodCalculate.markStartTimeMs("access$502", "com.tencent.mm.plugin.sns.ui.FlipView");
        flipView6.getClass();
        SnsMethodCalculate.markEndTimeMs("access$502", "com.tencent.mm.plugin.sns.ui.FlipView");
        FlipView flipView7 = this.f276821d;
        SnsMethodCalculate.markStartTimeMs("access$602", "com.tencent.mm.plugin.sns.ui.FlipView");
        flipView7.getClass();
        SnsMethodCalculate.markEndTimeMs("access$602", "com.tencent.mm.plugin.sns.ui.FlipView");
        FlipView flipView8 = this.f276821d;
        SnsMethodCalculate.markStartTimeMs("access$702", "com.tencent.mm.plugin.sns.ui.FlipView");
        flipView8.f276803t = null;
        SnsMethodCalculate.markEndTimeMs("access$702", "com.tencent.mm.plugin.sns.ui.FlipView");
        FlipView flipView9 = this.f276821d;
        SnsMethodCalculate.markStartTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.FlipView");
        flipView9.f276804u = null;
        SnsMethodCalculate.markEndTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.FlipView");
        FlipView flipView10 = this.f276821d;
        SnsMethodCalculate.markStartTimeMs("access$802", "com.tencent.mm.plugin.sns.ui.FlipView");
        flipView10.f276805v = "";
        SnsMethodCalculate.markEndTimeMs("access$802", "com.tencent.mm.plugin.sns.ui.FlipView");
        FlipView flipView11 = this.f276821d;
        SnsMethodCalculate.markStartTimeMs("access$902", "com.tencent.mm.plugin.sns.ui.FlipView");
        flipView11.f276806w = null;
        SnsMethodCalculate.markEndTimeMs("access$902", "com.tencent.mm.plugin.sns.ui.FlipView");
        FlipView flipView12 = this.f276821d;
        flipView12.f276809z = null;
        flipView12.f276808y.clear();
        FlipView flipView13 = this.f276821d;
        SnsMethodCalculate.markStartTimeMs("access$1002", "com.tencent.mm.plugin.sns.ui.FlipView");
        flipView13.getClass();
        SnsMethodCalculate.markEndTimeMs("access$1002", "com.tencent.mm.plugin.sns.ui.FlipView");
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.FlipView$3");
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.FlipView$3");
        return null;
    }
}
