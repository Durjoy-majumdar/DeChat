package eu2;

import android.content.Context;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import gy3.C87412m;
import iu2.C98799a;
import jq3.C60905o;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;
import z31.C102972b;

/* renamed from: eu2.s */
public abstract class C97737s extends C97710h {

    /* renamed from: x0 */
    public String f286711x0 = "";

    /* renamed from: y0 */
    public String f286712y0 = "";

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemReport", mo125469f = "ImproveTimelineItemReport.kt", mo125470l = {30}, mo125471m = "onBindViewHolder$suspendImpl")
    /* renamed from: eu2.s$a */
    public static final class C97738a extends C66704d {

        /* renamed from: d */
        public Object f286713d;

        /* renamed from: e */
        public Object f286714e;

        /* renamed from: f */
        public /* synthetic */ Object f286715f;

        /* renamed from: g */
        public final /* synthetic */ C97737s f286716g;

        /* renamed from: h */
        public int f286717h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C97738a(C97737s sVar, C15601d<? super C97738a> dVar) {
            super(dVar);
            this.f286716g = sVar;
        }

        public final Object invokeSuspend(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemReport$onBindViewHolder$1");
            this.f286715f = obj;
            this.f286717h |= Integer.MIN_VALUE;
            Object I = C97737s.m126063I(this.f286716g, (C60905o) null, (C98799a) null, 0, false, this);
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemReport$onBindViewHolder$1");
            return I;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C97737s(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0031  */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ java.lang.Object m126063I(eu2.C97737s r14, jq3.C60905o r15, iu2.C98799a r16, int r17, boolean r18, wx3.C15601d r19) {
        /*
            r6 = r14
            r0 = r19
            java.lang.Class<l31.f> r7 = l31.C99333f.class
            java.lang.String r8 = "onBindViewHolder$suspendImpl"
            java.lang.String r9 = "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemReport"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r9)
            boolean r1 = r0 instanceof eu2.C97737s.C97738a
            if (r1 == 0) goto L_0x0020
            r1 = r0
            eu2.s$a r1 = (eu2.C97737s.C97738a) r1
            int r2 = r1.f286717h
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0020
            int r2 = r2 - r3
            r1.f286717h = r2
            goto L_0x0025
        L_0x0020:
            eu2.s$a r1 = new eu2.s$a
            r1.<init>(r14, r0)
        L_0x0025:
            r5 = r1
            java.lang.Object r0 = r5.f286715f
            xx3.a r10 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r5.f286717h
            r11 = 1
            r12 = 12076(0x2f2c, float:1.6922E-41)
            if (r1 == 0) goto L_0x004b
            if (r1 != r11) goto L_0x0040
            java.lang.Object r1 = r5.f286714e
            iu2.a r1 = (iu2.C98799a) r1
            java.lang.Object r2 = r5.f286713d
            eu2.s r2 = (eu2.C97737s) r2
            kotlin.ResultKt.throwOnFailure(r0)
            r13 = r1
            goto L_0x0072
        L_0x0040:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r9)
            throw r0
        L_0x004b:
            kotlin.ResultKt.throwOnFailure(r0)
            r5.f286713d = r6
            r13 = r16
            r5.f286714e = r13
            r5.f286717h = r11
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            java.lang.Object r0 = super.mo81006g(r1, r2, r3, r4, r5)
            if (r0 != r10) goto L_0x0071
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r9)
            z31.b r0 = z31.C102972b.f303874a
            java.lang.String r1 = r6.f286712y0
            java.lang.String r2 = "contactCount"
            r0.mo142713g(r12, r2, r1)
            return r10
        L_0x0071:
            r2 = r6
        L_0x0072:
            gu2.b r0 = r13.mo138170b()
            java.lang.String r0 = r0.mo137504B2()
            r2.f286711x0 = r0
            gu2.b r0 = r13.mo138170b()
            java.lang.String r0 = r0.getUserName()
            java.lang.String r1 = "item.info.userName"
            gy3.C87412m.m108593f(r0, r1)
            r2.f286712y0 = r0
            gu2.b r0 = r13.mo138170b()
            com.tencent.mm.protocal.protobuf.TimeLineObject r0 = r0.mo137509G2()
            gu2.b r1 = r13.mo138170b()
            int r1 = r1.getType()
            if (r1 == r11) goto L_0x0131
            r3 = 2
            if (r1 == r3) goto L_0x0123
            r3 = 3
            if (r1 == r3) goto L_0x00ff
            r0 = 4
            if (r1 == r0) goto L_0x00f1
            r0 = 5
            if (r1 == r0) goto L_0x00e3
            r0 = 15
            if (r1 == r0) goto L_0x00d5
            r0 = 28
            if (r1 == r0) goto L_0x00c7
            r0 = 42
            if (r1 == r0) goto L_0x00b8
            goto L_0x013e
        L_0x00b8:
            di3.d r0 = di3.C86312j.m106911c(r7)
            l31.f r0 = (l31.C99333f) r0
            java.lang.String r1 = r2.f286711x0
            java.lang.String r2 = "BrowseMuiscPlayerFeedCount"
            r0.mo138726rL(r12, r2, r1)
            goto L_0x013e
        L_0x00c7:
            di3.d r0 = di3.C86312j.m106911c(r7)
            l31.f r0 = (l31.C99333f) r0
            java.lang.String r1 = r2.f286711x0
            java.lang.String r2 = "BrowseClickFinderFeedCnt"
            r0.mo138726rL(r12, r2, r1)
            goto L_0x013e
        L_0x00d5:
            di3.d r0 = di3.C86312j.m106911c(r7)
            l31.f r0 = (l31.C99333f) r0
            java.lang.String r1 = r2.f286711x0
            java.lang.String r2 = "BrowseSightFeedCount"
            r0.mo138726rL(r12, r2, r1)
            goto L_0x013e
        L_0x00e3:
            di3.d r0 = di3.C86312j.m106911c(r7)
            l31.f r0 = (l31.C99333f) r0
            java.lang.String r1 = r2.f286711x0
            java.lang.String r2 = "BrowseVideoFeedCount"
            r0.mo138726rL(r12, r2, r1)
            goto L_0x013e
        L_0x00f1:
            di3.d r0 = di3.C86312j.m106911c(r7)
            l31.f r0 = (l31.C99333f) r0
            java.lang.String r1 = r2.f286711x0
            java.lang.String r2 = "BrowseMusicFeedCount"
            r0.mo138726rL(r12, r2, r1)
            goto L_0x013e
        L_0x00ff:
            java.lang.String r0 = r0.publicUserName
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0115
            di3.d r0 = di3.C86312j.m106911c(r7)
            l31.f r0 = (l31.C99333f) r0
            java.lang.String r1 = r2.f286711x0
            java.lang.String r2 = "BrowseBrandUrlFeedCount"
            r0.mo138726rL(r12, r2, r1)
            goto L_0x013e
        L_0x0115:
            di3.d r0 = di3.C86312j.m106911c(r7)
            l31.f r0 = (l31.C99333f) r0
            java.lang.String r1 = r2.f286711x0
            java.lang.String r2 = "BrowseNotBrandUrlFeedCount"
            r0.mo138726rL(r12, r2, r1)
            goto L_0x013e
        L_0x0123:
            di3.d r0 = di3.C86312j.m106911c(r7)
            l31.f r0 = (l31.C99333f) r0
            java.lang.String r1 = r2.f286711x0
            java.lang.String r2 = "BrowseTextFeedCount"
            r0.mo138726rL(r12, r2, r1)
            goto L_0x013e
        L_0x0131:
            di3.d r0 = di3.C86312j.m106911c(r7)
            l31.f r0 = (l31.C99333f) r0
            java.lang.String r1 = r2.f286711x0
            java.lang.String r2 = "BrowseImageFeedCount"
            r0.mo138726rL(r12, r2, r1)
        L_0x013e:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: eu2.C97737s.m126063I(eu2.s, jq3.o, iu2.a, int, boolean, wx3.d):java.lang.Object");
    }

    /* renamed from: g */
    public Object mo81006g(C60905o oVar, C98799a aVar, int i, boolean z, C15601d<? super C13598b0> dVar) {
        SnsMethodCalculate.markStartTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemReport");
        Object I = m126063I(this, oVar, aVar, i, z, dVar);
        SnsMethodCalculate.markEndTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemReport");
        C102972b.f303874a.mo142713g(12076, "contactCount", this.f286712y0);
        return I;
    }
}
