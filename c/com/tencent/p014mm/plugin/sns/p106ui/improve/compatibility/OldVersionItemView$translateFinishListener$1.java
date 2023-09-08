package com.tencent.p014mm.plugin.sns.p106ui.improve.compatibility;

import androidx.lifecycle.C0125s;
import com.tencent.p014mm.autogen.events.SnsTranslateFinishEvent;
import com.tencent.p014mm.sdk.event.IListener;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/sns/ui/improve/compatibility/OldVersionItemView$translateFinishListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/SnsTranslateFinishEvent;", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$translateFinishListener$1 */
public final class OldVersionItemView$translateFinishListener$1 extends IListener<SnsTranslateFinishEvent> {

    /* renamed from: d */
    public final /* synthetic */ OldVersionItemView f279632d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OldVersionItemView$translateFinishListener$1(OldVersionItemView oldVersionItemView, C0125s sVar) {
        super(sVar);
        this.f279632d = oldVersionItemView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0032, code lost:
        r2 = r2.mo138170b();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean callback(com.tencent.p014mm.sdk.event.IEvent r11) {
        /*
            r10 = this;
            java.lang.String r0 = "callback"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$translateFinishListener$1"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            com.tencent.mm.autogen.events.SnsTranslateFinishEvent r11 = (com.tencent.p014mm.autogen.events.SnsTranslateFinishEvent) r11
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.String r2 = "event"
            gy3.C87412m.m108594g(r11, r2)
            com.tencent.mm.autogen.events.SnsTranslateFinishEvent$a r2 = r11.f265201d
            java.lang.String r3 = r2.f265203b
            java.lang.String r3 = r2.f265204c
            java.lang.String r4 = r2.f265205d
            int r2 = r2.f265202a
            r5 = 2
            r6 = 1
            if (r2 != r6) goto L_0x007d
            com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView r2 = r10.f279632d
            int r6 = com.tencent.p014mm.plugin.sns.p106ui.improve.compatibility.OldVersionItemView.f279619q
            java.lang.String r6 = "access$getItem$p"
            java.lang.String r7 = "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r7)
            iu2.a r2 = r2.f279625i
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r7)
            r6 = 0
            if (r2 == 0) goto L_0x003d
            gu2.b r2 = r2.mo138170b()
            if (r2 == 0) goto L_0x003d
            java.lang.String r2 = r2.mo137504B2()
            goto L_0x003e
        L_0x003d:
            r2 = r6
        L_0x003e:
            com.tencent.mm.autogen.events.SnsTranslateFinishEvent$a r8 = r11.f265201d
            java.lang.String r8 = r8.f265203b
            long r8 = os2.C100417r0.m131425n(r8)
            java.lang.String r8 = vr2.C102236a0.m134765q0(r8)
            boolean r2 = gy3.C87412m.m108589b(r2, r8)
            if (r2 == 0) goto L_0x007d
            com.tencent.mm.autogen.events.SnsTranslateFinishEvent$a r2 = r11.f265201d
            java.lang.String r2 = r2.f265203b
            com.tencent.p014mm.plugin.sns.model.C94965w1.m120620a(r2, r5)
            com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView r2 = r10.f279632d
            java.lang.String r5 = "access$getItemView$p"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r7)
            android.view.View r2 = r2.f279627n
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r7)
            if (r2 == 0) goto L_0x0069
            java.lang.Object r6 = r2.getTag()
        L_0x0069:
            com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$BaseViewHolder r6 = (com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem.BaseViewHolder) r6
            com.tencent.mm.autogen.events.SnsTranslateFinishEvent$a r11 = r11.f265201d
            java.lang.String r11 = r11.f265203b
            com.tencent.mm.plugin.sns.model.w1$b r11 = com.tencent.p014mm.plugin.sns.model.C94965w1.m120624e(r11)
            if (r6 == 0) goto L_0x0099
            com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem r2 = r6.f279965k0
            if (r2 == 0) goto L_0x0099
            r2.mo133401u(r11, r6, r3, r4)
            goto L_0x0099
        L_0x007d:
            com.tencent.mm.autogen.events.SnsTranslateFinishEvent$a r11 = r11.f265201d
            int r2 = r11.f265202a
            if (r2 != r5) goto L_0x0099
            java.lang.String r11 = r11.f265203b
            com.tencent.p014mm.plugin.sns.model.C94965w1.m120620a(r11, r5)
            com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView r11 = r10.f279632d
            jq3.o r11 = com.tencent.p014mm.plugin.sns.p106ui.improve.compatibility.OldVersionItemView.m122684i(r11)
            if (r11 == 0) goto L_0x0099
            com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView r11 = r10.f279632d
            int r2 = r11.getPosition()
            com.tencent.p014mm.plugin.sns.p106ui.improve.compatibility.OldVersionItemView.m122685j(r11, r2)
        L_0x0099:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            r11 = 0
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.improve.compatibility.OldVersionItemView$translateFinishListener$1.callback(com.tencent.mm.sdk.event.IEvent):boolean");
    }
}
