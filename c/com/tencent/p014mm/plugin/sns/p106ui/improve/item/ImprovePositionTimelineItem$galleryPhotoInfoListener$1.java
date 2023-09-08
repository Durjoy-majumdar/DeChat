package com.tencent.p014mm.plugin.sns.p106ui.improve.item;

import androidx.lifecycle.C0125s;
import com.tencent.p014mm.autogen.events.GalleryPhotoInfoEvent;
import com.tencent.p014mm.sdk.event.IListener;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/sns/ui/improve/item/ImprovePositionTimelineItem$galleryPhotoInfoListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/GalleryPhotoInfoEvent;", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ui.improve.item.ImprovePositionTimelineItem$galleryPhotoInfoListener$1 */
public final class ImprovePositionTimelineItem$galleryPhotoInfoListener$1 extends IListener<GalleryPhotoInfoEvent> {

    /* renamed from: d */
    public final /* synthetic */ ImprovePositionTimelineItem f279816d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImprovePositionTimelineItem$galleryPhotoInfoListener$1(ImprovePositionTimelineItem improvePositionTimelineItem, C0125s sVar) {
        super(sVar);
        this.f279816d = improvePositionTimelineItem;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x001d, code lost:
        r4 = r4.mo138170b();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean callback(com.tencent.p014mm.sdk.event.IEvent r17) {
        /*
            r16 = this;
            r0 = r16
            java.lang.String r1 = "callback"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ui.improve.item.ImprovePositionTimelineItem$galleryPhotoInfoListener$1"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            r3 = r17
            com.tencent.mm.autogen.events.GalleryPhotoInfoEvent r3 = (com.tencent.p014mm.autogen.events.GalleryPhotoInfoEvent) r3
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            java.lang.String r4 = "event"
            gy3.C87412m.m108594g(r3, r4)
            com.tencent.mm.plugin.sns.ui.improve.item.ImprovePositionTimelineItem r4 = r0.f279816d
            iu2.a r4 = r4.getData()
            if (r4 == 0) goto L_0x0028
            gu2.b r4 = r4.mo138170b()
            if (r4 == 0) goto L_0x0028
            java.lang.String r4 = r4.mo137503A2()
            goto L_0x002a
        L_0x0028:
            java.lang.String r4 = ""
        L_0x002a:
            com.tencent.mm.autogen.events.GalleryPhotoInfoEvent$a r5 = r3.f264882d
            java.lang.String r5 = r5.f264887d
            r6 = 0
            if (r5 == 0) goto L_0x003c
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x003c
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            goto L_0x00ef
        L_0x003c:
            com.tencent.mm.autogen.events.GalleryPhotoInfoEvent$a r4 = r3.f264882d
            int r5 = r4.f264885b
            int r4 = r4.f264884a
            com.tencent.mm.plugin.sns.ui.improve.item.ImprovePositionTimelineItem r7 = r0.f279816d
            java.lang.String r8 = "access$getPhotoInfo"
            java.lang.String r9 = "com.tencent.mm.plugin.sns.ui.improve.item.ImprovePositionTimelineItem"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r9)
            r7.getClass()
            java.lang.String r10 = "getPhotoInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r9)
            int r11 = r7.mo137038A()
            if (r4 == r11) goto L_0x005e
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r9)
            goto L_0x00e9
        L_0x005e:
            java.lang.String r4 = "getViewPosition"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r9)
            android.view.View r11 = r7.mo83992P(r5)
            r13 = 2
            int[] r13 = new int[r13]
            if (r11 == 0) goto L_0x006f
            r11.getLocationOnScreen(r13)
        L_0x006f:
            if (r11 == 0) goto L_0x0076
            int r14 = r11.getWidth()
            goto L_0x0077
        L_0x0076:
            r14 = 0
        L_0x0077:
            if (r11 == 0) goto L_0x007e
            int r11 = r11.getHeight()
            goto L_0x007f
        L_0x007e:
            r11 = 0
        L_0x007f:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r12 = "position:"
            r15.append(r12)
            r15.append(r5)
            java.lang.String r5 = " location:"
            r15.append(r5)
            r5 = r13[r6]
            r15.append(r5)
            r5 = 32
            r15.append(r5)
            r5 = 1
            r12 = r13[r5]
            r15.append(r12)
            java.lang.String r5 = " width:"
            r15.append(r5)
            r15.append(r14)
            java.lang.String r5 = " height:"
            r15.append(r5)
            r15.append(r11)
            java.lang.String r5 = r15.toString()
            java.lang.String r12 = "MicroMsg.Improve.BasePositionTimelineItem"
            r7.mo137055z(r12, r5)
            android.graphics.Point r5 = new android.graphics.Point
            r6 = r13[r6]
            r7 = 1
            r12 = r13[r7]
            r5.<init>(r6, r12)
            android.util.Size r6 = new android.util.Size
            r6.<init>(r14, r11)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r9)
            com.tencent.mm.autogen.events.GalleryPhotoInfoEvent$b r4 = r3.f264883e
            int r11 = r5.x
            r4.f264888a = r11
            int r5 = r5.y
            r4.f264889b = r5
            int r5 = r6.getWidth()
            r4.f264890c = r5
            com.tencent.mm.autogen.events.GalleryPhotoInfoEvent$b r3 = r3.f264883e
            int r4 = r6.getHeight()
            r3.f264891d = r4
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r9)
            r6 = 1
        L_0x00e9:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r9)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
        L_0x00ef:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.improve.item.ImprovePositionTimelineItem$galleryPhotoInfoListener$1.callback(com.tencent.mm.sdk.event.IEvent):boolean");
    }
}
