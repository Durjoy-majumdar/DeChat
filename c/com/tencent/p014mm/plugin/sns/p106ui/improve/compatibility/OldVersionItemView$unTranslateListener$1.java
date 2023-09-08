package com.tencent.p014mm.plugin.sns.p106ui.improve.compatibility;

import androidx.lifecycle.C0125s;
import com.tencent.p014mm.autogen.events.SnsUnTranslateEvent;
import com.tencent.p014mm.sdk.event.IListener;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/sns/ui/improve/compatibility/OldVersionItemView$unTranslateListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/SnsUnTranslateEvent;", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$unTranslateListener$1 */
public final class OldVersionItemView$unTranslateListener$1 extends IListener<SnsUnTranslateEvent> {

    /* renamed from: d */
    public final /* synthetic */ OldVersionItemView f279634d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OldVersionItemView$unTranslateListener$1(OldVersionItemView oldVersionItemView, C0125s sVar) {
        super(sVar);
        this.f279634d = oldVersionItemView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x002c, code lost:
        r2 = r2.mo138170b();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean callback(com.tencent.p014mm.sdk.event.IEvent r9) {
        /*
            r8 = this;
            java.lang.String r0 = "callback"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$unTranslateListener$1"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            com.tencent.mm.autogen.events.SnsUnTranslateEvent r9 = (com.tencent.p014mm.autogen.events.SnsUnTranslateEvent) r9
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.String r2 = "event"
            gy3.C87412m.m108594g(r9, r2)
            com.tencent.mm.autogen.events.SnsUnTranslateEvent$a r2 = r9.f265211d
            int r2 = r2.f265212a
            r3 = 2
            r4 = 1
            if (r2 != r4) goto L_0x006f
            com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView r2 = r8.f279634d
            int r4 = com.tencent.p014mm.plugin.sns.p106ui.improve.compatibility.OldVersionItemView.f279619q
            java.lang.String r4 = "access$getItem$p"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            iu2.a r2 = r2.f279625i
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            r4 = 0
            if (r2 == 0) goto L_0x0037
            gu2.b r2 = r2.mo138170b()
            if (r2 == 0) goto L_0x0037
            java.lang.String r2 = r2.mo137504B2()
            goto L_0x0038
        L_0x0037:
            r2 = r4
        L_0x0038:
            com.tencent.mm.autogen.events.SnsUnTranslateEvent$a r6 = r9.f265211d
            java.lang.String r6 = r6.f265213b
            long r6 = os2.C100417r0.m131425n(r6)
            java.lang.String r6 = vr2.C102236a0.m134765q0(r6)
            boolean r2 = gy3.C87412m.m108589b(r2, r6)
            if (r2 == 0) goto L_0x006f
            com.tencent.mm.autogen.events.SnsUnTranslateEvent$a r9 = r9.f265211d
            java.lang.String r9 = r9.f265213b
            com.tencent.p014mm.plugin.sns.model.C94965w1.m120629j(r9, r3)
            com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView r9 = r8.f279634d
            java.lang.String r2 = "access$getItemView$p"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r5)
            android.view.View r9 = r9.f279627n
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r5)
            if (r9 == 0) goto L_0x0063
            java.lang.Object r4 = r9.getTag()
        L_0x0063:
            com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$BaseViewHolder r4 = (com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem.BaseViewHolder) r4
            if (r4 == 0) goto L_0x008b
            com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem r9 = r4.f279965k0
            if (r9 == 0) goto L_0x008b
            r9.mo133403w(r4)
            goto L_0x008b
        L_0x006f:
            com.tencent.mm.autogen.events.SnsUnTranslateEvent$a r9 = r9.f265211d
            int r2 = r9.f265212a
            if (r2 != r3) goto L_0x008b
            java.lang.String r9 = r9.f265213b
            com.tencent.p014mm.plugin.sns.model.C94965w1.m120629j(r9, r3)
            com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView r9 = r8.f279634d
            jq3.o r9 = com.tencent.p014mm.plugin.sns.p106ui.improve.compatibility.OldVersionItemView.m122684i(r9)
            if (r9 == 0) goto L_0x008b
            com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView r9 = r8.f279634d
            int r2 = r9.getPosition()
            com.tencent.p014mm.plugin.sns.p106ui.improve.compatibility.OldVersionItemView.m122685j(r9, r2)
        L_0x008b:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            r9 = 0
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.improve.compatibility.OldVersionItemView$unTranslateListener$1.callback(com.tencent.mm.sdk.event.IEvent):boolean");
    }
}
