package eu2;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import android.content.Context;
import com.tencent.p014mm.memory.p1073ui.QPictureView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsJankActivity;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import fy3.C32227p;
import gy3.C87412m;
import iu2.C98799a;
import jq3.C60905o;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: eu2.l */
public abstract class C97730l extends C97736r {

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemLoad$itemLoad$2", mo125469f = "ImproveTimelineItemLoad.kt", mo125470l = {43}, mo125471m = "invokeSuspend")
    /* renamed from: eu2.l$a */
    public static final class C97731a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public long f286692d;

        /* renamed from: e */
        public int f286693e;

        /* renamed from: f */
        public final /* synthetic */ C97730l f286694f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C97731a(C97730l lVar, C15601d<? super C97731a> dVar) {
            super(2, dVar);
            this.f286694f = lVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemLoad$itemLoad$2");
            C97731a aVar = new C97731a(this.f286694f, dVar);
            SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemLoad$itemLoad$2");
            return aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemLoad$itemLoad$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemLoad$itemLoad$2");
            Object invokeSuspend = ((C97731a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemLoad$itemLoad$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemLoad$itemLoad$2");
            return invokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            long j;
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemLoad$itemLoad$2");
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f286693e;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                long currentTimeMillis = System.currentTimeMillis();
                SnsJankActivity.f280539s.mo133612a(this.f286694f.name(), "loadCustomItemInfo");
                C97730l lVar = this.f286694f;
                this.f286692d = currentTimeMillis;
                this.f286693e = 1;
                if (lVar.mo81005F(this) == aVar) {
                    SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemLoad$itemLoad$2");
                    return aVar;
                }
                j = currentTimeMillis;
            } else if (i == 1) {
                j = this.f286692d;
                ResultKt.throwOnFailure(obj);
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemLoad$itemLoad$2");
                throw illegalStateException;
            }
            SnsJankActivity.f280539s.mo133613b(this.f286694f.name());
            C97730l lVar2 = this.f286694f;
            lVar2.mo137055z("MicroMsg.Improve.TimelineItemLoad", "itemLoad cost:" + (System.currentTimeMillis() - j));
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemLoad$itemLoad$2");
            return b0Var;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemLoad", mo125469f = "ImproveTimelineItemLoad.kt", mo125470l = {29, 32}, mo125471m = "onBindViewHolder$suspendImpl")
    /* renamed from: eu2.l$b */
    public static final class C97732b extends C66704d {

        /* renamed from: d */
        public Object f286695d;

        /* renamed from: e */
        public boolean f286696e;

        /* renamed from: f */
        public /* synthetic */ Object f286697f;

        /* renamed from: g */
        public final /* synthetic */ C97730l f286698g;

        /* renamed from: h */
        public int f286699h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C97732b(C97730l lVar, C15601d<? super C97732b> dVar) {
            super(dVar);
            this.f286698g = lVar;
        }

        public final Object invokeSuspend(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemLoad$onBindViewHolder$1");
            this.f286697f = obj;
            this.f286699h |= Integer.MIN_VALUE;
            Object G = C97730l.m126040G(this.f286698g, (C60905o) null, (C98799a) null, 0, false, this);
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemLoad$onBindViewHolder$1");
            return G;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C97730l(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ java.lang.Object m126040G(eu2.C97730l r13, jq3.C60905o r14, iu2.C98799a r15, int r16, boolean r17, wx3.C15601d r18) {
        /*
            r6 = r13
            r0 = r18
            java.lang.String r7 = "onBindViewHolder$suspendImpl"
            java.lang.String r8 = "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemLoad"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r8)
            boolean r1 = r0 instanceof eu2.C97730l.C97732b
            if (r1 == 0) goto L_0x001e
            r1 = r0
            eu2.l$b r1 = (eu2.C97730l.C97732b) r1
            int r2 = r1.f286699h
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x001e
            int r2 = r2 - r3
            r1.f286699h = r2
            goto L_0x0023
        L_0x001e:
            eu2.l$b r1 = new eu2.l$b
            r1.<init>(r13, r0)
        L_0x0023:
            r9 = r1
            java.lang.Object r0 = r9.f286697f
            xx3.a r10 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r9.f286699h
            r11 = 2
            r2 = 1
            if (r1 == 0) goto L_0x004c
            if (r1 == r2) goto L_0x0041
            if (r1 != r11) goto L_0x0036
            kotlin.ResultKt.throwOnFailure(r0)
            goto L_0x008f
        L_0x0036:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
            throw r0
        L_0x0041:
            boolean r1 = r9.f286696e
            java.lang.Object r2 = r9.f286695d
            eu2.l r2 = (eu2.C97730l) r2
            kotlin.ResultKt.throwOnFailure(r0)
            r12 = r1
            goto L_0x006a
        L_0x004c:
            kotlin.ResultKt.throwOnFailure(r0)
            r9.f286695d = r6
            r12 = r17
            r9.f286696e = r12
            r9.f286699h = r2
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r9
            java.lang.Object r0 = super.mo81006g(r1, r2, r3, r4, r5)
            if (r0 != r10) goto L_0x0069
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
            return r10
        L_0x0069:
            r2 = r6
        L_0x006a:
            boolean r0 = r2.mo81004D()
            if (r0 != 0) goto L_0x0080
            if (r12 == 0) goto L_0x0073
            goto L_0x0080
        L_0x0073:
            java.lang.String r0 = "MicroMsg.Improve.TimelineItemLoad"
            java.lang.String r1 = "already finish custom load,do nothing"
            r2.mo137055z(r0, r1)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
            return r0
        L_0x0080:
            r0 = 0
            r9.f286695d = r0
            r9.f286699h = r11
            java.lang.Object r0 = r2.mo137034E(r9)
            if (r0 != r10) goto L_0x008f
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
            return r10
        L_0x008f:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: eu2.C97730l.m126040G(eu2.l, jq3.o, iu2.a, int, boolean, wx3.d):java.lang.Object");
    }

    /* renamed from: D */
    public boolean mo81004D() {
        SnsMethodCalculate.markStartTimeMs("enableRepeatLoad", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemLoad");
        QPictureView tagImgView = getTagImgView();
        boolean z = false;
        if (tagImgView != null && !tagImgView.f266837E) {
            z = true;
        }
        SnsMethodCalculate.markEndTimeMs("enableRepeatLoad", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemLoad");
        return z;
    }

    /* renamed from: E */
    public final Object mo137034E(C15601d<? super C13598b0> dVar) {
        SnsMethodCalculate.markStartTimeMs("itemLoad", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemLoad");
        Object g = C53895h.m60469g(C53872d1.f151117a, new C97731a(this, (C15601d<? super C97731a>) null), dVar);
        if (g == C15911a.COROUTINE_SUSPENDED) {
            SnsMethodCalculate.markEndTimeMs("itemLoad", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemLoad");
            return g;
        }
        C13598b0 b0Var = C13598b0.f38549a;
        SnsMethodCalculate.markEndTimeMs("itemLoad", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemLoad");
        return b0Var;
    }

    /* renamed from: F */
    public abstract Object mo81005F(C15601d<? super Boolean> dVar);

    /* renamed from: g */
    public Object mo81006g(C60905o oVar, C98799a aVar, int i, boolean z, C15601d<? super C13598b0> dVar) {
        SnsMethodCalculate.markStartTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemLoad");
        Object G = m126040G(this, oVar, aVar, i, z, dVar);
        SnsMethodCalculate.markEndTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemLoad");
        return G;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0013, code lost:
        r2 = (r2 = r2.mo138170b()).mo137509G2();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<te3.C101804kv2> getMediaList() {
        /*
            r3 = this;
            java.lang.String r0 = "getMediaList"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemLoad"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            iu2.a r2 = r3.getData()
            if (r2 == 0) goto L_0x001e
            gu2.b r2 = r2.mo138170b()
            if (r2 == 0) goto L_0x001e
            com.tencent.mm.protocal.protobuf.TimeLineObject r2 = r2.mo137509G2()
            if (r2 == 0) goto L_0x001e
            java.util.List r2 = is2.C98790d.m128577a(r2)
            goto L_0x001f
        L_0x001e:
            r2 = 0
        L_0x001f:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: eu2.C97730l.getMediaList():java.util.List");
    }

    public QPictureView getTagImgView() {
        SnsMethodCalculate.markStartTimeMs("getTagImgView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemLoad");
        SnsMethodCalculate.markEndTimeMs("getTagImgView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemLoad");
        return null;
    }
}
