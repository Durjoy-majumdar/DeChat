package com.tencent.p014mm.plugin.sns.p106ui.improve.component;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.autogen.events.SnsFeedRelocateEvent;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;
import ut2.C102089d;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/sns/ui/improve/component/ImproveInputUIC$feedRelocateListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/SnsFeedRelocateEvent;", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$feedRelocateListener$1 */
public final class ImproveInputUIC$feedRelocateListener$1 extends IListener<SnsFeedRelocateEvent> {

    /* renamed from: d */
    public final /* synthetic */ ImproveInputUIC f279668d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImproveInputUIC$feedRelocateListener$1(AppCompatActivity appCompatActivity, ImproveInputUIC improveInputUIC) {
        super(appCompatActivity);
        this.f279668d = improveInputUIC;
    }

    public boolean callback(IEvent iEvent) {
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$feedRelocateListener$1");
        SnsFeedRelocateEvent snsFeedRelocateEvent = (SnsFeedRelocateEvent) iEvent;
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$feedRelocateListener$1");
        C87412m.m108594g(snsFeedRelocateEvent, "event");
        ImproveInputUIC improveInputUIC = this.f279668d;
        SnsFeedRelocateEvent.C92575a aVar = snsFeedRelocateEvent.f265138d;
        View view = aVar.f265139a;
        int i = aVar.f265140b;
        int i2 = aVar.f265141c;
        int i3 = aVar.f265142d;
        Runnable runnable = aVar.f265143e;
        SnsMethodCalculate.markStartTimeMs("access$checkFeedRelocate", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        improveInputUIC.getClass();
        SnsMethodCalculate.markStartTimeMs("checkFeedRelocate", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        int a = C75044y4.m89989a(improveInputUIC.getContext()) + C75044y4.m89994f(improveInputUIC.getContext());
        int i4 = C75044y4.m89990b(improveInputUIC.getContext()).y;
        int e = C75044y4.m89993e(improveInputUIC.getContext());
        int i5 = i4 - e;
        StringBuilder sb = new StringBuilder();
        String str = "callback";
        sb.append("checkFeedRelocate: content changeAreaTop:");
        sb.append(i);
        sb.append(", changeAreaBottom:");
        sb.append(i2);
        sb.append(", extraOffsetY:");
        sb.append(i3);
        sb.append(", bottomRawY:");
        sb.append(i4);
        sb.append(", bottomHeight:");
        sb.append(e);
        sb.append(", actionBarBottom:");
        sb.append(a);
        Log.m105924i("MicroMsg.Improve.InputUIC", sb.toString());
        if (i > a) {
            Log.m105924i("MicroMsg.Improve.InputUIC", "checkFeedRelocate: top visible, do nothing");
            if (runnable != null) {
                runnable.run();
            }
        } else {
            if (a + 1 <= i2 && i2 < i5) {
                int i6 = i2 - i;
                if (runnable != null) {
                    runnable.run();
                    improveInputUIC.getRecycleView().scrollBy(0, -i6);
                    if (view != null) {
                        view.post(new C102089d(improveInputUIC, view, i2));
                    }
                }
                Log.m105924i("MicroMsg.Improve.InputUIC", "checkFeedRelocate: only top invisible, move " + (-i6));
            } else {
                int i7 = -((a - i) + i3);
                improveInputUIC.getRecycleView().scrollBy(0, i7);
                if (runnable != null) {
                    improveInputUIC.getRecycleView().postDelayed(runnable, 0);
                }
                Log.m105924i("MicroMsg.Improve.InputUIC", "checkFeedRelocate: top bottom invisible, move " + i7);
            }
        }
        SnsMethodCalculate.markEndTimeMs("checkFeedRelocate", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        SnsMethodCalculate.markEndTimeMs("access$checkFeedRelocate", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        String str2 = str;
        SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$feedRelocateListener$1");
        SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$feedRelocateListener$1");
        return true;
    }
}
