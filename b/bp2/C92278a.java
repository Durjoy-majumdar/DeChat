package bp2;

import com.tencent.p014mm.autogen.events.SnsAdVideoBonusSceneEvent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import qs2.C101253a;

/* renamed from: bp2.a */
public final class C92278a {

    /* renamed from: a */
    public volatile boolean f264111a;

    public C92278a(C101253a aVar) {
    }

    /* renamed from: a */
    public void mo126267a() {
        SnsMethodCalculate.markStartTimeMs("sendMessage", "com.tencent.mm.plugin.sns.ad.landingpage.helper.video.VideoCompletionMessageHelper");
        Log.m105918d("SnsAd.VideoCompletionHelper", "sendMessage video is called");
        if (this.f264111a) {
            new SnsAdVideoBonusSceneEvent().publish();
        }
        this.f264111a = false;
        SnsMethodCalculate.markEndTimeMs("sendMessage", "com.tencent.mm.plugin.sns.ad.landingpage.helper.video.VideoCompletionMessageHelper");
    }
}
