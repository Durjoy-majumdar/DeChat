package p180jy;

import com.tencent.p014mm.autogen.events.SnsTimelineUIStatusEvent;
import com.tencent.p014mm.plugin.sns.model.C30414s1;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: jy.l2 */
public class C33744l2 extends IStaticListener<SnsTimelineUIStatusEvent> {
    public boolean callback(IEvent iEvent) {
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsTimelineUIStatusListener");
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsTimelineUIStatusListener");
        C30414s1 Ix0 = C94866e1.Ix0();
        boolean booleanValue = ((SnsTimelineUIStatusEvent) iEvent).f79003d.f79004a.booleanValue();
        Ix0.getClass();
        SnsMethodCalculate.markStartTimeMs("setIsInSnsTimeline", "com.tencent.mm.plugin.sns.model.SnsPreTimelineService");
        Ix0.f82029c = booleanValue;
        SnsMethodCalculate.markEndTimeMs("setIsInSnsTimeline", "com.tencent.mm.plugin.sns.model.SnsPreTimelineService");
        C30414s1 Ix02 = C94866e1.Ix0();
        Ix02.getClass();
        SnsMethodCalculate.markStartTimeMs("isInSnsTimeline", "com.tencent.mm.plugin.sns.model.SnsPreTimelineService");
        boolean z = Ix02.f82029c;
        SnsMethodCalculate.markEndTimeMs("isInSnsTimeline", "com.tencent.mm.plugin.sns.model.SnsPreTimelineService");
        Log.m105925i("MicroMsg.SnsTimelineUIStatusListener", "set isInSnsTimeline:%b", Boolean.valueOf(z));
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsTimelineUIStatusListener");
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsTimelineUIStatusListener");
        return false;
    }
}
