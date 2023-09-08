package p180jy;

import com.tencent.p014mm.autogen.events.ChattingUIStatusEvent;
import com.tencent.p014mm.plugin.sns.model.C30414s1;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: jy.e */
public class C33717e extends IStaticListener<ChattingUIStatusEvent> {
    public boolean callback(IEvent iEvent) {
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.ChattingUIStatusListener");
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.ChattingUIStatusListener");
        C30414s1 Ix0 = C94866e1.Ix0();
        boolean z = ((ChattingUIStatusEvent) iEvent).f78735d.f78736a;
        Ix0.getClass();
        SnsMethodCalculate.markStartTimeMs("setIsInChatting", "com.tencent.mm.plugin.sns.model.SnsPreTimelineService");
        Ix0.f82028b = z;
        SnsMethodCalculate.markEndTimeMs("setIsInChatting", "com.tencent.mm.plugin.sns.model.SnsPreTimelineService");
        C30414s1 Ix02 = C94866e1.Ix0();
        Ix02.getClass();
        SnsMethodCalculate.markStartTimeMs("isInChatting", "com.tencent.mm.plugin.sns.model.SnsPreTimelineService");
        boolean z2 = Ix02.f82028b;
        SnsMethodCalculate.markEndTimeMs("isInChatting", "com.tencent.mm.plugin.sns.model.SnsPreTimelineService");
        Log.m105925i("MicroMsg.ChattingUIStatusListener", "set isInChatting:%b", Boolean.valueOf(z2));
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.ChattingUIStatusListener");
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.ChattingUIStatusListener");
        return false;
    }
}
