package com.tencent.p014mm.plugin.sns.p106ui.improve.item;

import androidx.lifecycle.C0125s;
import com.tencent.p014mm.autogen.events.SnsTranslateFinishEvent;
import com.tencent.p014mm.sdk.event.IListener;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/sns/ui/improve/item/ImproveTimelineItemNotify$translateFinishListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/SnsTranslateFinishEvent;", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify$translateFinishListener$1 */
public final class ImproveTimelineItemNotify$translateFinishListener$1 extends IListener<SnsTranslateFinishEvent> {

    /* renamed from: d */
    public final /* synthetic */ ImproveTimelineItemNotify f279827d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImproveTimelineItemNotify$translateFinishListener$1(ImproveTimelineItemNotify improveTimelineItemNotify, C0125s sVar) {
        super(sVar);
        this.f279827d = improveTimelineItemNotify;
    }

    /* JADX WARNING: type inference failed for: r6v3, types: [fu2.a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean callback(com.tencent.p014mm.sdk.event.IEvent r21) {
        /*
            r20 = this;
            r0 = r20
            java.lang.String r1 = "callback"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify$translateFinishListener$1"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            r3 = r21
            com.tencent.mm.autogen.events.SnsTranslateFinishEvent r3 = (com.tencent.p014mm.autogen.events.SnsTranslateFinishEvent) r3
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            java.lang.String r4 = "event"
            gy3.C87412m.m108594g(r3, r4)
            com.tencent.mm.autogen.events.SnsTranslateFinishEvent$a r3 = r3.f265201d
            java.lang.String r4 = r3.f265203b
            int r3 = r3.f265202a
            r5 = 0
            java.lang.String r6 = "MicroMsg.Improve.Notify"
            java.lang.String r7 = "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify"
            r8 = 1
            r9 = 2
            r10 = 0
            if (r3 != r8) goto L_0x00d9
            com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify r3 = r0.f279827d
            java.lang.String r11 = "id"
            gy3.C87412m.m108593f(r4, r11)
            int r11 = com.tencent.p014mm.plugin.sns.p106ui.improve.item.ImproveTimelineItemNotify.f279817V0
            java.lang.String r11 = "access$postDescTranslateFinish"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r7)
            r3.getClass()
            java.lang.String r12 = "postDescTranslateFinish"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r7)
            iu2.a r13 = r3.getData()
            if (r13 == 0) goto L_0x00d1
            gu2.b r13 = r13.mo138170b()
            if (r13 != 0) goto L_0x004a
            goto L_0x00d1
        L_0x004a:
            java.lang.String r14 = r13.mo137507E2()
            boolean r14 = gy3.C87412m.m108589b(r14, r4)
            if (r14 != 0) goto L_0x0059
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r7)
            goto L_0x00d4
        L_0x0059:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "postDescTranslateFinish, id:"
            r14.append(r15)
            r14.append(r4)
            r15 = 45
            r14.append(r15)
            java.lang.String r13 = r13.mo137504B2()
            r14.append(r13)
            java.lang.String r13 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r13)
            com.tencent.p014mm.plugin.sns.model.C94965w1.m120620a(r4, r9)
            com.tencent.mm.plugin.sns.model.w1$b r15 = com.tencent.p014mm.plugin.sns.model.C94965w1.m120624e(r4)
            com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView r14 = r3.getContentText()
            r16 = 1
            if (r15 == 0) goto L_0x008e
            java.lang.String r4 = r15.f275304b
            r17 = r4
            goto L_0x0090
        L_0x008e:
            r17 = r5
        L_0x0090:
            if (r15 == 0) goto L_0x0097
            java.lang.String r4 = r15.f275305c
            r18 = r4
            goto L_0x0099
        L_0x0097:
            r18 = r5
        L_0x0099:
            if (r15 == 0) goto L_0x00a0
            boolean r4 = r15.f275309g
            r19 = r4
            goto L_0x00a2
        L_0x00a0:
            r19 = 0
        L_0x00a2:
            r14.mo67331b(r15, r16, r17, r18, r19)
            java.util.ArrayList r4 = fu2.C98041z.m126632K(r3)
            java.util.Iterator r4 = r4.iterator()
        L_0x00ad:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x00be
            java.lang.Object r6 = r4.next()
            fu2.a r6 = (fu2.C97987a) r6
            boolean r9 = r6 instanceof fu2.C98011i
            if (r9 == 0) goto L_0x00ad
            r5 = r6
        L_0x00be:
            fu2.i r5 = (fu2.C98011i) r5
            if (r5 == 0) goto L_0x00cd
            com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView r3 = r3.getContentText()
            android.view.View r3 = r3.getTranslateLayout()
            r5.mo137317k(r3, r10, r8, r10)
        L_0x00cd:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r7)
            goto L_0x00d4
        L_0x00d1:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r7)
        L_0x00d4:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r7)
            goto L_0x0162
        L_0x00d9:
            if (r3 != r9) goto L_0x0162
            com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify r3 = r0.f279827d
            int r8 = com.tencent.p014mm.plugin.sns.p106ui.improve.item.ImproveTimelineItemNotify.f279817V0
            java.lang.String r8 = "access$commentTranslateFinish"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r7)
            r3.getClass()
            java.lang.String r11 = "commentTranslateFinish"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r7)
            if (r4 != 0) goto L_0x00f3
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r7)
            goto L_0x015f
        L_0x00f3:
            iu2.a r12 = r3.getData()
            if (r12 == 0) goto L_0x015c
            gu2.b r12 = r12.mo138170b()
            if (r12 != 0) goto L_0x0100
            goto L_0x015c
        L_0x0100:
            java.lang.String r12 = r12.mo137504B2()
            boolean r12 = z04.C112550d0.m153801u(r4, r12, r10)
            if (r12 != 0) goto L_0x010e
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r7)
            goto L_0x015f
        L_0x010e:
            com.tencent.p014mm.plugin.sns.model.C94965w1.m120620a(r4, r9)
            int r14 = r3.mo133347N(r4)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r12 = "commentTranslateFinish, id:"
            r9.append(r12)
            r9.append(r4)
            java.lang.String r12 = " position:"
            r9.append(r12)
            r9.append(r14)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r9)
            com.tencent.mm.plugin.sns.model.w1$b r15 = com.tencent.p014mm.plugin.sns.model.C94965w1.m120624e(r4)
            com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout r13 = r3.getCommentView()
            if (r13 == 0) goto L_0x0158
            r16 = 2
            if (r15 == 0) goto L_0x0144
            java.lang.String r3 = r15.f275304b
            r17 = r3
            goto L_0x0146
        L_0x0144:
            r17 = r5
        L_0x0146:
            if (r15 == 0) goto L_0x014a
            java.lang.String r5 = r15.f275305c
        L_0x014a:
            r18 = r5
            if (r15 == 0) goto L_0x0153
            boolean r3 = r15.f275309g
            r19 = r3
            goto L_0x0155
        L_0x0153:
            r19 = 0
        L_0x0155:
            r13.mo133366a(r14, r15, r16, r17, r18, r19)
        L_0x0158:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r7)
            goto L_0x015f
        L_0x015c:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r7)
        L_0x015f:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r7)
        L_0x0162:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.improve.item.ImproveTimelineItemNotify$translateFinishListener$1.callback(com.tencent.mm.sdk.event.IEvent):boolean");
    }
}
