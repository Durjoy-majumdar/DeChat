package qq2;

import com.tencent.p014mm.plugin.sns.p104ad.timeline.video.online.CardOnlineVideoView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: qq2.a */
public class C101234a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CardOnlineVideoView f296422d;

    public C101234a(CardOnlineVideoView cardOnlineVideoView) {
        this.f296422d = cardOnlineVideoView;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.video.online.CardOnlineVideoView$1");
        this.f296422d.mo130402D();
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.video.online.CardOnlineVideoView$1");
    }
}
