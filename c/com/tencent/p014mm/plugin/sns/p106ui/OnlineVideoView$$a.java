package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.p106ui.OnlineVideoView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.tencent.mm.plugin.sns.ui.OnlineVideoView$$a */
public final /* synthetic */ class OnlineVideoView$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ OnlineVideoView f277294d;

    /* renamed from: e */
    public final /* synthetic */ String f277295e;

    /* renamed from: f */
    public final /* synthetic */ boolean f277296f;

    public /* synthetic */ OnlineVideoView$$a(OnlineVideoView onlineVideoView, String str, boolean z) {
        this.f277294d = onlineVideoView;
        this.f277295e = str;
        this.f277296f = z;
    }

    public final void run() {
        OnlineVideoView onlineVideoView = this.f277294d;
        String str = this.f277295e;
        boolean z = this.f277296f;
        int i = OnlineVideoView.f277144H1;
        onlineVideoView.getClass();
        SnsMethodCalculate.markStartTimeMs("lambda$dispatchDownloadFinish$2", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        if (onlineVideoView.f277158G1 == null) {
            SnsMethodCalculate.markEndTimeMs("lambda$dispatchDownloadFinish$2", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
            return;
        }
        Iterator it = new ArrayList(onlineVideoView.f277158G1).iterator();
        while (it.hasNext()) {
            ((OnlineVideoView.IDownloadListener) it.next()).mo126115o(str, z);
        }
        SnsMethodCalculate.markEndTimeMs("lambda$dispatchDownloadFinish$2", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }
}
