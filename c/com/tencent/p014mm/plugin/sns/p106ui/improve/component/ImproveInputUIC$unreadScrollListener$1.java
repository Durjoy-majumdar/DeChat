package com.tencent.p014mm.plugin.sns.p106ui.improve.component;

import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.autogen.events.SnsScrollEvent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/sns/ui/improve/component/ImproveInputUIC$unreadScrollListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/SnsScrollEvent;", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$unreadScrollListener$1 */
public final class ImproveInputUIC$unreadScrollListener$1 extends IListener<SnsScrollEvent> {

    /* renamed from: d */
    public final /* synthetic */ ImproveInputUIC f279672d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImproveInputUIC$unreadScrollListener$1(AppCompatActivity appCompatActivity, ImproveInputUIC improveInputUIC) {
        super(appCompatActivity);
        this.f279672d = improveInputUIC;
    }

    public boolean callback(IEvent iEvent) {
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$unreadScrollListener$1");
        SnsScrollEvent snsScrollEvent = (SnsScrollEvent) iEvent;
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$unreadScrollListener$1");
        C87412m.m108594g(snsScrollEvent, "event");
        this.f279672d.getAppBarLayout().mo146163d(false, false, true);
        C57396a aVar = new C57396a(0, this.f279672d.getContext());
        aVar.f44872a = snsScrollEvent.f265195d.f265196a;
        this.f279672d.getLayoutManager().startSmoothScroll(aVar);
        Log.m105924i("MicroMsg.Improve.InputUIC", "smoothScrollToPosition:" + snsScrollEvent.f265195d.f265196a);
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$unreadScrollListener$1");
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$unreadScrollListener$1");
        return true;
    }
}
