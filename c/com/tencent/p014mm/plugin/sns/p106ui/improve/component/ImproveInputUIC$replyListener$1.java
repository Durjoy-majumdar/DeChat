package com.tencent.p014mm.plugin.sns.p106ui.improve.component;

import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.autogen.events.SnsReplyEvent;
import com.tencent.p014mm.sdk.event.IListener;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/sns/ui/improve/component/ImproveInputUIC$replyListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/SnsReplyEvent;", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$replyListener$1 */
public final class ImproveInputUIC$replyListener$1 extends IListener<SnsReplyEvent> {

    /* renamed from: d */
    public final /* synthetic */ ImproveInputUIC f279671d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImproveInputUIC$replyListener$1(AppCompatActivity appCompatActivity, ImproveInputUIC improveInputUIC) {
        super(appCompatActivity);
        this.f279671d = improveInputUIC;
    }

    /* JADX WARNING: type inference failed for: r2v5, types: [android.view.ViewParent, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean callback(com.tencent.p014mm.sdk.event.IEvent r11) {
        /*
            r10 = this;
            java.lang.String r0 = "callback"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$replyListener$1"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            com.tencent.mm.autogen.events.SnsReplyEvent r11 = (com.tencent.p014mm.autogen.events.SnsReplyEvent) r11
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.String r2 = "event"
            gy3.C87412m.m108594g(r11, r2)
            com.tencent.mm.autogen.events.SnsReplyEvent$a r2 = r11.f265189d
            android.view.View r2 = r2.f265192c
            r3 = 1
            if (r2 != 0) goto L_0x001c
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            goto L_0x0070
        L_0x001c:
            android.view.ViewParent r4 = r2.getParent()
            java.lang.String r5 = "null cannot be cast to non-null type android.view.ViewGroup"
            gy3.C87412m.m108592e(r4, r5)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            int r6 = r4.indexOfChild(r2)
            int r7 = r4.getChildCount()
            int r7 = r7 - r3
            java.lang.String r8 = "event.data.comment"
            java.lang.String r9 = "event.data.info"
            if (r6 != r7) goto L_0x005a
        L_0x0037:
            boolean r2 = r4 instanceof eu2.C97712i
            if (r2 != 0) goto L_0x0046
            android.view.ViewParent r2 = r4.getParent()
            gy3.C87412m.m108592e(r2, r5)
            r4 = r2
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            goto L_0x0037
        L_0x0046:
            com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC r2 = r10.f279671d
            com.tencent.mm.autogen.events.SnsReplyEvent$a r5 = r11.f265189d
            gu2.b r5 = r5.f265190a
            gy3.C87412m.m108593f(r5, r9)
            com.tencent.mm.autogen.events.SnsReplyEvent$a r11 = r11.f265189d
            te3.w64 r11 = r11.f265191b
            gy3.C87412m.m108593f(r11, r8)
            com.tencent.p014mm.plugin.sns.p106ui.improve.component.ImproveInputUIC.m122696d3(r2, r4, r5, r11)
            goto L_0x006d
        L_0x005a:
            com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC r4 = r10.f279671d
            com.tencent.mm.autogen.events.SnsReplyEvent$a r5 = r11.f265189d
            gu2.b r5 = r5.f265190a
            gy3.C87412m.m108593f(r5, r9)
            com.tencent.mm.autogen.events.SnsReplyEvent$a r11 = r11.f265189d
            te3.w64 r11 = r11.f265191b
            gy3.C87412m.m108593f(r11, r8)
            com.tencent.p014mm.plugin.sns.p106ui.improve.component.ImproveInputUIC.m122696d3(r4, r2, r5, r11)
        L_0x006d:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
        L_0x0070:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.improve.component.ImproveInputUIC$replyListener$1.callback(com.tencent.mm.sdk.event.IEvent):boolean");
    }
}
