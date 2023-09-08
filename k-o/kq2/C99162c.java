package kq2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.video.SnsTimelineVideoView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: kq2.c */
public class C99162c implements SnsTimelineVideoView.C96253d {

    /* renamed from: a */
    public final /* synthetic */ C99163d f290765a;

    public C99162c(C99163d dVar) {
        this.f290765a = dVar;
    }

    /* renamed from: O3 */
    public void mo133426O3(String str) {
        SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem$1");
        if (!Util.isNullOrNil(str)) {
            C99163d dVar = this.f290765a;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
            String str2 = dVar.f290767r;
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
            if (str.equals(str2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("playOnlineVideo: timelineVideoView setUICallback onDestroy, the tlId is ");
                sb.append(str);
                sb.append(", the timelineId is ");
                C99163d dVar2 = this.f290765a;
                SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
                String str3 = dVar2.f290767r;
                SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
                sb.append(str3);
                Log.m105928w("SnsAd.AdSightTimeLineItem", sb.toString());
                this.f290765a.mo138531E();
            }
        }
        SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem$1");
    }
}
