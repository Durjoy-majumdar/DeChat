package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.VideoBackgroundRemuxResultEventEvent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import gy3.C87412m;
import kotlin.Metadata;
import o40.C61926c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/sns/ui/SightWidgetBackgroundVideoHandler$remuxEventListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/VideoBackgroundRemuxResultEventEvent;", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ui.SightWidgetBackgroundVideoHandler$remuxEventListener$1 */
public final class SightWidgetBackgroundVideoHandler$remuxEventListener$1 extends IListener<VideoBackgroundRemuxResultEventEvent> {

    /* renamed from: d */
    public final /* synthetic */ SightWidgetBackgroundVideoHandler f277482d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SightWidgetBackgroundVideoHandler$remuxEventListener$1(SightWidgetBackgroundVideoHandler sightWidgetBackgroundVideoHandler, C40008f fVar) {
        super(fVar);
        this.f277482d = sightWidgetBackgroundVideoHandler;
    }

    public boolean callback(IEvent iEvent) {
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SightWidgetBackgroundVideoHandler$remuxEventListener$1");
        VideoBackgroundRemuxResultEventEvent videoBackgroundRemuxResultEventEvent = (VideoBackgroundRemuxResultEventEvent) iEvent;
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SightWidgetBackgroundVideoHandler$remuxEventListener$1");
        C87412m.m108594g(videoBackgroundRemuxResultEventEvent, "event");
        C61926c.m72668M(new C96110p2(videoBackgroundRemuxResultEventEvent, this.f277482d));
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SightWidgetBackgroundVideoHandler$remuxEventListener$1");
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SightWidgetBackgroundVideoHandler$remuxEventListener$1");
        return true;
    }
}
