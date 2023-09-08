package com.tencent.p014mm.plugin.sns.p106ui.improve.component;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.SnsInputEvent;
import com.tencent.p014mm.plugin.sns.p106ui.BaseTimeLine;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import gu2.C98214b;
import gy3.C87412m;
import kotlin.Metadata;
import te3.w64;
import ut2.C102094i;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/sns/ui/improve/component/ImproveInputUIC$inputListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/SnsInputEvent;", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$inputListener$1 */
public final class ImproveInputUIC$inputListener$1 extends IListener<SnsInputEvent> {

    /* renamed from: d */
    public final /* synthetic */ ImproveInputUIC f279669d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImproveInputUIC$inputListener$1(AppCompatActivity appCompatActivity, ImproveInputUIC improveInputUIC) {
        super(appCompatActivity);
        this.f279669d = improveInputUIC;
    }

    public boolean callback(IEvent iEvent) {
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$inputListener$1");
        SnsInputEvent snsInputEvent = (SnsInputEvent) iEvent;
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$inputListener$1");
        C87412m.m108594g(snsInputEvent, "event");
        ImproveInputUIC improveInputUIC = this.f279669d;
        C98214b bVar = snsInputEvent.f265158d.f265159a;
        C87412m.m108593f(bVar, "event.data.info");
        int i = snsInputEvent.f265158d.f265160b;
        SnsMethodCalculate.markStartTimeMs("access$showInputView", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        improveInputUIC.getClass();
        SnsMethodCalculate.markStartTimeMs("showInputView", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        String B2 = bVar.mo137504B2();
        improveInputUIC.f279649j = B2;
        Log.m105924i("MicroMsg.Improve.InputUIC", "onCommentClick commentkey:" + bVar.mo137504B2() + " position:" + i);
        improveInputUIC.mo133285e3(bVar);
        improveInputUIC.mo133288i3().setTag(bVar.mo137505C2());
        improveInputUIC.mo133288i3().setCommentInfo(new w64());
        improveInputUIC.mo133288i3().setVisibility(0);
        improveInputUIC.mo133288i3().mo132719x(improveInputUIC.mo133287g3(B2, 0));
        improveInputUIC.mo133288i3().setSnsInfo(bVar.mo137505C2());
        improveInputUIC.mo133288i3().setCommentHint(improveInputUIC.getContext().getString(C0966R.string.jjl));
        improveInputUIC.mo133288i3().mo132679A(BaseTimeLine.f276689H, B2);
        improveInputUIC.mo133288i3().post(new C102094i(improveInputUIC));
        improveInputUIC.mo133288i3().mo132680B(false);
        SnsMethodCalculate.markStartTimeMs("scrollRecyclerView", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        RecyclerView.C16631z I0 = improveInputUIC.getRecycleView().mo17023I0(i);
        if (I0 == null) {
            SnsMethodCalculate.markEndTimeMs("scrollRecyclerView", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        } else {
            View view = I0.f44854d;
            C87412m.m108593f(view, "holder.itemView");
            improveInputUIC.mo133294o3(view, improveInputUIC.mo133288i3());
            SnsMethodCalculate.markEndTimeMs("scrollRecyclerView", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        }
        SnsMethodCalculate.markEndTimeMs("showInputView", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        SnsMethodCalculate.markEndTimeMs("access$showInputView", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$inputListener$1");
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$inputListener$1");
        return true;
    }
}
