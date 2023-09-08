package bv2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.video.C96254a;
import com.tencent.p014mm.plugin.sns.p106ui.video.SnsTimelineVideoView;

/* renamed from: bv2.g */
public class C92319g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SnsTimelineVideoView f264172d;

    public C92319g(C96254a aVar, SnsTimelineVideoView snsTimelineVideoView) {
        this.f264172d = snsTimelineVideoView;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr$1");
        this.f264172d.f277196h1 = true;
        this.f264172d.mo130402D();
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr$1");
    }
}
