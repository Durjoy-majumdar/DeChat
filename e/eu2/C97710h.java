package eu2;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import gy3.C87412m;
import iu2.C98799a;
import jq3.C60905o;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: eu2.h */
public abstract class C97710h extends C97730l {

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemAccessibility", mo125469f = "ImproveTimelineItemAccessibility.kt", mo125470l = {30}, mo125471m = "onBindViewHolder$suspendImpl")
    /* renamed from: eu2.h$a */
    public static final class C97711a extends C66704d {

        /* renamed from: d */
        public Object f286631d;

        /* renamed from: e */
        public Object f286632e;

        /* renamed from: f */
        public Object f286633f;

        /* renamed from: g */
        public /* synthetic */ Object f286634g;

        /* renamed from: h */
        public final /* synthetic */ C97710h f286635h;

        /* renamed from: i */
        public int f286636i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C97711a(C97710h hVar, C15601d<? super C97711a> dVar) {
            super(dVar);
            this.f286635h = hVar;
        }

        public final Object invokeSuspend(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemAccessibility$onBindViewHolder$1");
            this.f286634g = obj;
            this.f286636i |= Integer.MIN_VALUE;
            Object H = C97710h.m126017H(this.f286635h, (C60905o) null, (C98799a) null, 0, false, this);
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemAccessibility$onBindViewHolder$1");
            return H;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C97710h(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object m126017H(eu2.C97710h r24, jq3.C60905o r25, iu2.C98799a r26, int r27, boolean r28, wx3.C15601d r29) {
        /*
            r6 = r24
            r0 = r29
            java.lang.String r7 = "onBindViewHolder$suspendImpl"
            java.lang.String r8 = "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemAccessibility"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r8)
            boolean r1 = r0 instanceof eu2.C97710h.C97711a
            if (r1 == 0) goto L_0x001f
            r1 = r0
            eu2.h$a r1 = (eu2.C97710h.C97711a) r1
            int r2 = r1.f286636i
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x001f
            int r2 = r2 - r3
            r1.f286636i = r2
            goto L_0x0024
        L_0x001f:
            eu2.h$a r1 = new eu2.h$a
            r1.<init>(r6, r0)
        L_0x0024:
            r5 = r1
            java.lang.Object r0 = r5.f286634g
            xx3.a r9 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r5.f286636i
            r10 = 1
            if (r1 == 0) goto L_0x004d
            if (r1 != r10) goto L_0x0042
            java.lang.Object r1 = r5.f286633f
            iu2.a r1 = (iu2.C98799a) r1
            java.lang.Object r2 = r5.f286632e
            jq3.o r2 = (jq3.C60905o) r2
            java.lang.Object r3 = r5.f286631d
            eu2.h r3 = (eu2.C97710h) r3
            kotlin.ResultKt.throwOnFailure(r0)
            r12 = r1
            r11 = r2
            goto L_0x0071
        L_0x0042:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
            throw r0
        L_0x004d:
            kotlin.ResultKt.throwOnFailure(r0)
            r5.f286631d = r6
            r11 = r25
            r5.f286632e = r11
            r12 = r26
            r5.f286633f = r12
            r5.f286636i = r10
            r0 = r24
            r1 = r25
            r2 = r26
            r3 = r27
            r4 = r28
            java.lang.Object r0 = super.mo81006g(r1, r2, r3, r4, r5)
            if (r0 != r9) goto L_0x0070
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
            return r9
        L_0x0070:
            r3 = r6
        L_0x0071:
            r3.getClass()
            java.lang.String r0 = "buildHolderAccessibilityDesc"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r8)
            java.lang.String r1 = "holder"
            gy3.C87412m.m108594g(r11, r1)
            java.lang.String r1 = "item"
            gy3.C87412m.m108594g(r12, r1)
            gu2.b r1 = r12.mo138170b()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "buildHolderAccessibilityDesc: localId:"
            r2.append(r4)
            long r4 = r1.mo137526z2()
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.String r4 = "MicroMsg.Improve.TimelineItemAccessibility"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = ""
            r2.<init>(r4)
            ip3.b r5 = r1.mo137525y2()
            int r6 = r5.mo138165b()
            java.lang.String r9 = ","
            java.lang.String r13 = ":"
            if (r6 <= 0) goto L_0x00f0
            android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r6 = r6.getResources()
            r15 = 2131836726(0x7f113f36, float:1.9306627E38)
            java.lang.String r6 = r6.getString(r15)
            r2.append(r6)
            r2.append(r13)
            int r6 = r5.mo138165b()
            r15 = 0
        L_0x00d1:
            if (r15 >= r6) goto L_0x00f0
            java.lang.Object r14 = r5.mo138164a(r15)
            java.lang.String r10 = "likeUserList.get(i)"
            gy3.C87412m.m108593f(r14, r10)
            op3.j r14 = (op3.C117882j) r14
            r10 = 1
            java.lang.Object r14 = r14.mo182596a(r10)
            java.lang.String r14 = (java.lang.String) r14
            r2.append(r14)
            r2.append(r9)
            int r15 = r15 + 1
            r10 = 1
            goto L_0x00d1
        L_0x00f0:
            java.util.LinkedList r5 = r1.getCommentList()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r4)
            int r4 = r5.size()
            if (r4 <= 0) goto L_0x012c
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r4 = r4.getResources()
            r10 = 2131836721(0x7f113f31, float:1.9306617E38)
            java.lang.String r4 = r4.getString(r10)
            r6.append(r4)
            r6.append(r13)
            int r4 = r5.size()
            r10 = 0
        L_0x0119:
            if (r10 >= r4) goto L_0x012c
            java.lang.Object r13 = r5.get(r10)
            te3.w64 r13 = (te3.w64) r13
            java.lang.String r13 = r13.f299707h
            r6.append(r13)
            r6.append(r9)
            int r10 = r10 + 1
            goto L_0x0119
        L_0x012c:
            int r4 = r12.mo75c()
            r5 = 1
            if (r4 == 0) goto L_0x0146
            if (r4 == r5) goto L_0x0140
            r9 = 3
            if (r4 == r9) goto L_0x013a
            r10 = 0
            goto L_0x013b
        L_0x013a:
            r10 = 1
        L_0x013b:
            r19 = r10
            r23 = 0
            goto L_0x014a
        L_0x0140:
            r10 = 2
            r19 = 0
            r23 = 2
            goto L_0x014a
        L_0x0146:
            r19 = 0
            r23 = 1
        L_0x014a:
            ju2.k r12 = ju2.C9530k.f29712a
            android.view.View r13 = r11.f44854d
            java.lang.String r14 = r1.mo137524x2()
            java.lang.String r15 = r1.mo137508F2()
            java.lang.String r16 = r1.mo137521u2()
            java.lang.String r17 = r3.getContentAccessibilityDesc()
            r18 = 0
            java.lang.String r3 = "getAppNameText"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            java.lang.CharSequence r5 = r1.f287975f1
            if (r5 != 0) goto L_0x016e
            r1.mo137513K2()
        L_0x016e:
            java.lang.CharSequence r1 = r1.f287975f1
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            if (r1 == 0) goto L_0x017a
            java.lang.String r1 = r1.toString()
            goto L_0x017b
        L_0x017a:
            r1 = 0
        L_0x017b:
            r20 = r1
            java.lang.String r21 = r2.toString()
            java.lang.String r22 = r6.toString()
            r12.mo10206a(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r8)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: eu2.C97710h.m126017H(eu2.h, jq3.o, iu2.a, int, boolean, wx3.d):java.lang.Object");
    }

    /* renamed from: g */
    public Object mo81006g(C60905o oVar, C98799a aVar, int i, boolean z, C15601d<? super C13598b0> dVar) {
        SnsMethodCalculate.markStartTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemAccessibility");
        Object H = m126017H(this, oVar, aVar, i, z, dVar);
        SnsMethodCalculate.markEndTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemAccessibility");
        return H;
    }

    public final String getContentAccessibilityDesc() {
        SnsMethodCalculate.markStartTimeMs("getContentAccessibilityDesc", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemAccessibility");
        CharSequence content = getContentText().getContent();
        if (TextUtils.isEmpty(content)) {
            content = "";
        }
        String obj = content != null ? content.toString() : null;
        SnsMethodCalculate.markEndTimeMs("getContentAccessibilityDesc", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemAccessibility");
        return obj;
    }
}
