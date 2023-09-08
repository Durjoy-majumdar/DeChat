package com.tencent.p014mm.plugin.sns.p106ui.improve.item;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.event.IListener;
import gy3.C87412m;
import iu2.C98799a;
import jq3.C60905o;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: com.tencent.mm.plugin.sns.ui.improve.item.ImprovePositionTimelineItem */
public abstract class ImprovePositionTimelineItem extends ImproveTimelineItemNotify {

    /* renamed from: W0 */
    public final IListener<?> f279811W0 = new ImprovePositionTimelineItem$galleryPhotoInfoListener$1(this, getLifecycleOwner());

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.improve.item.ImprovePositionTimelineItem", mo125469f = "ImprovePositionTimelineItem.kt", mo125470l = {52}, mo125471m = "onBindViewHolder$suspendImpl")
    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.item.ImprovePositionTimelineItem$a */
    public static final class C95875a extends C66704d {

        /* renamed from: d */
        public Object f279812d;

        /* renamed from: e */
        public /* synthetic */ Object f279813e;

        /* renamed from: f */
        public final /* synthetic */ ImprovePositionTimelineItem f279814f;

        /* renamed from: g */
        public int f279815g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C95875a(ImprovePositionTimelineItem improvePositionTimelineItem, C15601d<? super C95875a> dVar) {
            super(dVar);
            this.f279814f = improvePositionTimelineItem;
        }

        public final Object invokeSuspend(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.ImprovePositionTimelineItem$onBindViewHolder$1");
            this.f279813e = obj;
            this.f279815g |= Integer.MIN_VALUE;
            Object Q = ImprovePositionTimelineItem.m122736Q(this.f279814f, (C60905o) null, (C98799a) null, 0, false, this);
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.ImprovePositionTimelineItem$onBindViewHolder$1");
            return Q;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImprovePositionTimelineItem(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* renamed from: Q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ java.lang.Object m122736Q(com.tencent.p014mm.plugin.sns.p106ui.improve.item.ImprovePositionTimelineItem r9, jq3.C60905o r10, iu2.C98799a r11, int r12, boolean r13, wx3.C15601d r14) {
        /*
            java.lang.String r0 = "onBindViewHolder$suspendImpl"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.improve.item.ImprovePositionTimelineItem"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            boolean r2 = r14 instanceof com.tencent.p014mm.plugin.sns.p106ui.improve.item.ImprovePositionTimelineItem.C95875a
            if (r2 == 0) goto L_0x001b
            r2 = r14
            com.tencent.mm.plugin.sns.ui.improve.item.ImprovePositionTimelineItem$a r2 = (com.tencent.p014mm.plugin.sns.p106ui.improve.item.ImprovePositionTimelineItem.C95875a) r2
            int r3 = r2.f279815g
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x001b
            int r3 = r3 - r4
            r2.f279815g = r3
            goto L_0x0020
        L_0x001b:
            com.tencent.mm.plugin.sns.ui.improve.item.ImprovePositionTimelineItem$a r2 = new com.tencent.mm.plugin.sns.ui.improve.item.ImprovePositionTimelineItem$a
            r2.<init>(r9, r14)
        L_0x0020:
            r8 = r2
            java.lang.Object r14 = r8.f279813e
            xx3.a r2 = xx3.C15911a.COROUTINE_SUSPENDED
            int r3 = r8.f279815g
            r4 = 1
            if (r3 == 0) goto L_0x003f
            if (r3 != r4) goto L_0x0034
            java.lang.Object r9 = r8.f279812d
            com.tencent.mm.plugin.sns.ui.improve.item.ImprovePositionTimelineItem r9 = (com.tencent.p014mm.plugin.sns.p106ui.improve.item.ImprovePositionTimelineItem) r9
            kotlin.ResultKt.throwOnFailure(r14)
            goto L_0x0055
        L_0x0034:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            throw r9
        L_0x003f:
            kotlin.ResultKt.throwOnFailure(r14)
            r8.f279812d = r9
            r8.f279815g = r4
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            java.lang.Object r10 = super.mo81006g(r4, r5, r6, r7, r8)
            if (r10 != r2) goto L_0x0055
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r2
        L_0x0055:
            com.tencent.mm.sdk.event.IListener<?> r9 = r9.f279811W0
            r9.alive()
            rx3.b0 r9 = rx3.C13598b0.f38549a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.improve.item.ImprovePositionTimelineItem.m122736Q(com.tencent.mm.plugin.sns.ui.improve.item.ImprovePositionTimelineItem, jq3.o, iu2.a, int, boolean, wx3.d):java.lang.Object");
    }

    /* renamed from: P */
    public abstract View mo83992P(int i);

    /* renamed from: g */
    public Object mo81006g(C60905o oVar, C98799a aVar, int i, boolean z, C15601d<? super C13598b0> dVar) {
        SnsMethodCalculate.markStartTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.improve.item.ImprovePositionTimelineItem");
        Object Q = m122736Q(this, oVar, aVar, i, z, dVar);
        SnsMethodCalculate.markEndTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.improve.item.ImprovePositionTimelineItem");
        return Q;
    }

    /* renamed from: h */
    public void mo81008h() {
        SnsMethodCalculate.markStartTimeMs("onViewRecycled", "com.tencent.mm.plugin.sns.ui.improve.item.ImprovePositionTimelineItem");
        super.mo81008h();
        this.f279811W0.dead();
        SnsMethodCalculate.markEndTimeMs("onViewRecycled", "com.tencent.mm.plugin.sns.ui.improve.item.ImprovePositionTimelineItem");
    }
}
