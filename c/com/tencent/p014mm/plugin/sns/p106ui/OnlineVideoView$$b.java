package com.tencent.p014mm.plugin.sns.p106ui;

import android.graphics.Bitmap;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import fy3.C32224a;

/* renamed from: com.tencent.mm.plugin.sns.ui.OnlineVideoView$$b */
public final /* synthetic */ class OnlineVideoView$$b implements C32224a {

    /* renamed from: d */
    public final /* synthetic */ OnlineVideoView f277297d;

    public /* synthetic */ OnlineVideoView$$b(OnlineVideoView onlineVideoView) {
        this.f277297d = onlineVideoView;
    }

    public final Object invoke() {
        OnlineVideoView onlineVideoView = this.f277297d;
        int i = OnlineVideoView.f277144H1;
        onlineVideoView.getClass();
        SnsMethodCalculate.markStartTimeMs("lambda$hideFrameViewOnceRendered$0", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        onlineVideoView.f277153E.setImageBitmap((Bitmap) null);
        onlineVideoView.f277153E.setVisibility(8);
        SnsMethodCalculate.markEndTimeMs("lambda$hideFrameViewOnceRendered$0", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        return null;
    }
}
