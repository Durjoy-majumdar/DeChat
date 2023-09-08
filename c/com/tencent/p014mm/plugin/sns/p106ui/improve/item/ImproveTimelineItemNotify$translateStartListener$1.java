package com.tencent.p014mm.plugin.sns.p106ui.improve.item;

import androidx.lifecycle.C0125s;
import com.tencent.p014mm.autogen.events.SnsTranslateStartEvent;
import com.tencent.p014mm.plugin.sns.model.C94965w1;
import com.tencent.p014mm.plugin.sns.p106ui.improve.view.ImproveInteractionLayout;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import gu2.C98214b;
import gy3.C87412m;
import iu2.C98799a;
import kotlin.Metadata;
import z04.C112550d0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/sns/ui/improve/item/ImproveTimelineItemNotify$translateStartListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/SnsTranslateStartEvent;", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify$translateStartListener$1 */
public final class ImproveTimelineItemNotify$translateStartListener$1 extends IListener<SnsTranslateStartEvent> {

    /* renamed from: d */
    public final /* synthetic */ ImproveTimelineItemNotify f279828d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImproveTimelineItemNotify$translateStartListener$1(ImproveTimelineItemNotify improveTimelineItemNotify, C0125s sVar) {
        super(sVar);
        this.f279828d = improveTimelineItemNotify;
    }

    public boolean callback(IEvent iEvent) {
        C98214b b;
        C98214b b2;
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify$translateStartListener$1");
        SnsTranslateStartEvent snsTranslateStartEvent = (SnsTranslateStartEvent) iEvent;
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify$translateStartListener$1");
        C87412m.m108594g(snsTranslateStartEvent, "event");
        SnsTranslateStartEvent.C92597a aVar = snsTranslateStartEvent.f265208d;
        int i = aVar.f265209a;
        if (i == 1) {
            String str = aVar.f265210b;
            ImproveTimelineItemNotify improveTimelineItemNotify = this.f279828d;
            C87412m.m108593f(str, "id");
            int i2 = ImproveTimelineItemNotify.f279817V0;
            SnsMethodCalculate.markStartTimeMs("access$postDescTranslateStart", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
            improveTimelineItemNotify.getClass();
            SnsMethodCalculate.markStartTimeMs("postDescTranslateStart", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
            C98799a data = improveTimelineItemNotify.getData();
            if (data == null || (b2 = data.mo138170b()) == null) {
                SnsMethodCalculate.markEndTimeMs("postDescTranslateStart", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
            } else if (!C87412m.m108589b(b2.mo137507E2(), str)) {
                SnsMethodCalculate.markEndTimeMs("postDescTranslateStart", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
            } else {
                Log.m105924i("MicroMsg.Improve.Notify", "postDescTranslateStart, id:" + str + '-' + b2.mo137504B2());
                C94965w1.m120620a(str, 2);
                improveTimelineItemNotify.getContentText().mo67336j();
                SnsMethodCalculate.markEndTimeMs("postDescTranslateStart", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
            }
            SnsMethodCalculate.markEndTimeMs("access$postDescTranslateStart", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
        } else if (i == 2) {
            ImproveTimelineItemNotify improveTimelineItemNotify2 = this.f279828d;
            String str2 = aVar.f265210b;
            int i3 = ImproveTimelineItemNotify.f279817V0;
            SnsMethodCalculate.markStartTimeMs("access$commentTranslateStart", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
            improveTimelineItemNotify2.getClass();
            SnsMethodCalculate.markStartTimeMs("commentTranslateStart", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
            if (str2 == null) {
                SnsMethodCalculate.markEndTimeMs("commentTranslateStart", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
            } else {
                C98799a data2 = improveTimelineItemNotify2.getData();
                if (data2 == null || (b = data2.mo138170b()) == null) {
                    SnsMethodCalculate.markEndTimeMs("commentTranslateStart", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
                } else if (!C112550d0.m153801u(str2, b.mo137504B2(), false)) {
                    SnsMethodCalculate.markEndTimeMs("commentTranslateStart", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
                } else {
                    C94965w1.m120620a(str2, 2);
                    int N = improveTimelineItemNotify2.mo133347N(str2);
                    Log.m105924i("MicroMsg.Improve.Notify", "commentTranslateStart, id:" + str2 + " position:" + N);
                    ImproveInteractionLayout commentView = improveTimelineItemNotify2.getCommentView();
                    if (commentView != null) {
                        commentView.mo133368e(N);
                    }
                    SnsMethodCalculate.markEndTimeMs("commentTranslateStart", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
                }
            }
            SnsMethodCalculate.markEndTimeMs("access$commentTranslateStart", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
        }
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify$translateStartListener$1");
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify$translateStartListener$1");
        return false;
    }
}
