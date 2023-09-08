package com.tencent.p014mm.plugin.sns.p106ui.improve.component;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.autogen.events.SnsInputScrollEvent;
import com.tencent.p014mm.plugin.sns.p106ui.SnsCommentFooter;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/sns/ui/improve/component/ImproveInputUIC$inputScrollListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/SnsInputScrollEvent;", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$inputScrollListener$1 */
public final class ImproveInputUIC$inputScrollListener$1 extends IListener<SnsInputScrollEvent> {

    /* renamed from: d */
    public final /* synthetic */ ImproveInputUIC f279670d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImproveInputUIC$inputScrollListener$1(AppCompatActivity appCompatActivity, ImproveInputUIC improveInputUIC) {
        super(appCompatActivity);
        this.f279670d = improveInputUIC;
    }

    public boolean callback(IEvent iEvent) {
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$inputScrollListener$1");
        SnsInputScrollEvent snsInputScrollEvent = (SnsInputScrollEvent) iEvent;
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$inputScrollListener$1");
        C87412m.m108594g(snsInputScrollEvent, "event");
        SnsInputScrollEvent.C92581a aVar = snsInputScrollEvent.f265161d;
        SnsCommentFooter snsCommentFooter = aVar.f265163b;
        View view = aVar.f265162a;
        ImproveInputUIC improveInputUIC = this.f279670d;
        C87412m.m108593f(view, "view");
        C87412m.m108593f(snsCommentFooter, "inputer");
        SnsMethodCalculate.markStartTimeMs("access$waitCommentFooterShowAndScrollToViewBottom", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        improveInputUIC.mo133294o3(view, snsCommentFooter);
        SnsMethodCalculate.markEndTimeMs("access$waitCommentFooterShowAndScrollToViewBottom", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$inputScrollListener$1");
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$inputScrollListener$1");
        return true;
    }
}
