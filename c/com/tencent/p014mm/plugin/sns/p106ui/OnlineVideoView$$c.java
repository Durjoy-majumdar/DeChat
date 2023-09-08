package com.tencent.p014mm.plugin.sns.p106ui;

import android.graphics.Bitmap;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ui.OnlineVideoView$$c */
public final /* synthetic */ class OnlineVideoView$$c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ OnlineVideoView f277298d;

    public /* synthetic */ OnlineVideoView$$c(OnlineVideoView onlineVideoView) {
        this.f277298d = onlineVideoView;
    }

    public final void run() {
        OnlineVideoView onlineVideoView = this.f277298d;
        int i = OnlineVideoView.f277144H1;
        onlineVideoView.getClass();
        SnsMethodCalculate.markStartTimeMs("lambda$hideFrameViewOnceRendered$1", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        onlineVideoView.f277153E.setImageBitmap((Bitmap) null);
        onlineVideoView.f277153E.setVisibility(8);
        SnsMethodCalculate.markEndTimeMs("lambda$hideFrameViewOnceRendered$1", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }
}
