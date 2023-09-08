package pu2;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53934p0;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f14.C58901s;
import ft2.C97979c;
import fy3.C32227p;
import kotlin.ResultKt;
import p565ir.C60606n;
import rx3.C13598b0;
import t91.C64208c;
import te3.C101789j00;
import te3.C51713vn0;
import te3.C64273c21;
import te3.C64337e61;
import te3.C64623p81;
import wx3.C15601d;
import wx3.C66217g;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem$checkLiveStatus$2", mo125469f = "ImproveFinderLiveTimelineItem.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: pu2.c */
public final class C62521c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C64623p81 f177590d;

    /* renamed from: e */
    public final /* synthetic */ C62510b f177591e;

    /* renamed from: f */
    public final /* synthetic */ SnsInfo f177592f;

    /* renamed from: pu2.c$a */
    public static final class C62522a implements C60606n.C60609c {

        /* renamed from: a */
        public final /* synthetic */ C64623p81 f177593a;

        /* renamed from: b */
        public final /* synthetic */ C62510b f177594b;

        /* renamed from: c */
        public final /* synthetic */ long f177595c;

        /* renamed from: d */
        public final /* synthetic */ SnsInfo f177596d;

        /* renamed from: e */
        public final /* synthetic */ int f177597e;

        @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem$checkLiveStatus$2$statusCallBack$1$onLiveStatusCallback$3", mo125469f = "ImproveFinderLiveTimelineItem.kt", mo125470l = {364}, mo125471m = "invokeSuspend")
        /* renamed from: pu2.c$a$a */
        public static final class C62523a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public int f177598d;

            /* renamed from: e */
            public final /* synthetic */ C62510b f177599e;

            /* renamed from: f */
            public final /* synthetic */ C64623p81 f177600f;

            /* renamed from: g */
            public final /* synthetic */ Object f177601g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C62523a(C62510b bVar, C64623p81 p812, Object obj, C15601d<? super C62523a> dVar) {
                super(2, dVar);
                this.f177599e = bVar;
                this.f177600f = p812;
                this.f177601g = obj;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem$checkLiveStatus$2$statusCallBack$1$onLiveStatusCallback$3");
                C62523a aVar = new C62523a(this.f177599e, this.f177600f, this.f177601g, dVar);
                SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem$checkLiveStatus$2$statusCallBack$1$onLiveStatusCallback$3");
                return aVar;
            }

            public Object invoke(Object obj, Object obj2) {
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem$checkLiveStatus$2$statusCallBack$1$onLiveStatusCallback$3");
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem$checkLiveStatus$2$statusCallBack$1$onLiveStatusCallback$3");
                Object invokeSuspend = ((C62523a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem$checkLiveStatus$2$statusCallBack$1$onLiveStatusCallback$3");
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem$checkLiveStatus$2$statusCallBack$1$onLiveStatusCallback$3");
                return invokeSuspend;
            }

            public final Object invokeSuspend(Object obj) {
                SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem$checkLiveStatus$2$statusCallBack$1$onLiveStatusCallback$3");
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f177598d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C62510b bVar = this.f177599e;
                    C64623p81 p812 = this.f177600f;
                    Object obj2 = this.f177601g;
                    C51713vn0 vn02 = obj2 instanceof C51713vn0 ? (C51713vn0) obj2 : null;
                    this.f177598d = 1;
                    int i2 = C62510b.f177565a1;
                    SnsMethodCalculate.markStartTimeMs("access$updateLiveTag", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem");
                    bVar.getClass();
                    SnsMethodCalculate.markStartTimeMs("updateLiveTag", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem");
                    C53896h0 h0Var = C53872d1.f151117a;
                    Object g = C53895h.m60469g(C58901s.f168555a, new C62525d(bVar, p812, vn02, (C15601d<? super C62525d>) null), this);
                    SnsMethodCalculate.markEndTimeMs("updateLiveTag", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem");
                    SnsMethodCalculate.markEndTimeMs("access$updateLiveTag", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem");
                    if (g == aVar) {
                        SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem$checkLiveStatus$2$statusCallBack$1$onLiveStatusCallback$3");
                        return aVar;
                    }
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem$checkLiveStatus$2$statusCallBack$1$onLiveStatusCallback$3");
                    throw illegalStateException;
                }
                C13598b0 b0Var = C13598b0.f38549a;
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem$checkLiveStatus$2$statusCallBack$1$onLiveStatusCallback$3");
                return b0Var;
            }
        }

        public C62522a(C64623p81 p812, C62510b bVar, long j, SnsInfo snsInfo, int i) {
            this.f177593a = p812;
            this.f177594b = bVar;
            this.f177595c = j;
            this.f177596d = snsInfo;
            this.f177597e = i;
        }

        public void onLiveStatusCallback(long j, int i, Object obj) {
            long j2 = j;
            int i2 = i;
            Object obj2 = obj;
            SnsMethodCalculate.markStartTimeMs("onLiveStatusCallback", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem$checkLiveStatus$2$statusCallBack$1");
            String str = this.f177593a.f184778d;
            if (str == null) {
                str = "0";
            }
            long j3 = Util.getLong(str, 0);
            if (j3 != j2) {
                this.f177594b.mo140441m("MicroMsg.Improve.ImproveFinderLiveTimelineItem", "#checkLiveStatus.onLiveStatusCallback not match, return");
                SnsMethodCalculate.markEndTimeMs("onLiveStatusCallback", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem$checkLiveStatus$2$statusCallBack$1");
                return;
            }
            C64623p81 p812 = this.f177593a;
            p812.f184791t = i2;
            C64623p81 p813 = null;
            C51713vn0 vn02 = obj2 instanceof C51713vn0 ? (C51713vn0) obj2 : null;
            C64273c21 c212 = vn02 != null ? vn02.f143572d : null;
            p812.f184761E = c212;
            C64337e61 e612 = c212 != null ? c212.f182363I : null;
            C62510b bVar = this.f177594b;
            StringBuilder sb = new StringBuilder();
            sb.append("thisLiveId:");
            sb.append(this.f177595c);
            sb.append(",liveID:");
            sb.append(j2);
            sb.append(",desc:");
            sb.append(this.f177593a.f184782h);
            sb.append(",share liveStatus:");
            sb.append(this.f177593a.f184791t);
            sb.append(", callback liveStatus:");
            sb.append(i2);
            sb.append(",purchaseInfo:[");
            sb.append(e612 != null ? Boolean.valueOf(e612.f182921e) : null);
            sb.append(',');
            sb.append(e612 != null ? Integer.valueOf(e612.f182920d) : null);
            sb.append(']');
            bVar.mo140441m("MicroMsg.Improve.ImproveFinderLiveTimelineItem", sb.toString());
            String Dk = ((C60606n) C86312j.m106911c(C60606n.class)).mo84996Dk(j3);
            int i3 = 1;
            if (!(Dk.length() > 0)) {
                Dk = null;
            }
            if (Dk != null) {
                this.f177593a.f184783i = Dk;
            }
            C62523a aVar = new C62523a(this.f177594b, this.f177593a, obj2, (C15601d<? super C62523a>) null);
            SnsMethodCalculate.markStartTimeMs("launch$default", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineCoroutines");
            C66217g gVar = C66217g.f190253d;
            SnsMethodCalculate.markStartTimeMs("launch", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineCoroutines");
            C0000n0 n0Var = C62549p.f177651a;
            if (n0Var != null) {
                C53895h.m60466d(n0Var, gVar, (C53934p0) null, aVar, 2, (Object) null);
            }
            SnsMethodCalculate.markEndTimeMs("launch", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineCoroutines");
            SnsMethodCalculate.markEndTimeMs("launch$default", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineCoroutines");
            SnsInfo snsInfo = this.f177596d;
            if (snsInfo != null) {
                int i4 = this.f177597e;
                C62510b bVar2 = this.f177594b;
                if (i4 == 1 && i2 == 2) {
                    C101789j00 j002 = snsInfo.getTimeLine().ContentObj;
                    if (j002 != null) {
                        p813 = j002.f298435s;
                    }
                    if (p813 != null) {
                        p813.f184791t = i2;
                    }
                    snsInfo.field_content = snsInfo.getTimeLine().toByteArray();
                    bVar2.mo140441m("MicroMsg.Improve.ImproveFinderLiveTimelineItem", "update finder live status to end!result:" + C94866e1.Yx0().ov0(snsInfo.getSnsId(), snsInfo));
                }
            }
            C62510b bVar3 = this.f177594b;
            C64623p81 p814 = this.f177593a;
            C64273c21 c213 = p814.f184761E;
            SnsMethodCalculate.markStartTimeMs("access$isLiveReplay", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem");
            boolean P = bVar3.mo87540P(p814, c213);
            SnsMethodCalculate.markEndTimeMs("access$isLiveReplay", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem");
            if (!P) {
                C62510b bVar4 = this.f177594b;
                if (!bVar4.mo87539O(this.f177593a.f184779e, C62510b.m73474I(bVar4), j2)) {
                    if (i2 != 1) {
                        i3 = 2;
                    }
                    C97979c.m126547n(C64208c.f181951a.mo89026a(String.valueOf(j)), i3);
                    SnsMethodCalculate.markEndTimeMs("onLiveStatusCallback", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem$checkLiveStatus$2$statusCallBack$1");
                }
            }
            C64208c.f181951a.mo89031f(String.valueOf(j));
            SnsMethodCalculate.markEndTimeMs("onLiveStatusCallback", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem$checkLiveStatus$2$statusCallBack$1");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62521c(C64623p81 p812, C62510b bVar, SnsInfo snsInfo, C15601d<? super C62521c> dVar) {
        super(2, dVar);
        this.f177590d = p812;
        this.f177591e = bVar;
        this.f177592f = snsInfo;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem$checkLiveStatus$2");
        C62521c cVar = new C62521c(this.f177590d, this.f177591e, this.f177592f, dVar);
        SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem$checkLiveStatus$2");
        return cVar;
    }

    public Object invoke(Object obj, Object obj2) {
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem$checkLiveStatus$2");
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem$checkLiveStatus$2");
        Object invokeSuspend = ((C62521c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem$checkLiveStatus$2");
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem$checkLiveStatus$2");
        return invokeSuspend;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0012, code lost:
        r3 = z04.C66731x.m78732f(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            java.lang.String r1 = "invokeSuspend"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem$checkLiveStatus$2"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            kotlin.ResultKt.throwOnFailure(r18)
            te3.p81 r3 = r0.f177590d
            java.lang.String r3 = r3.f184778d
            if (r3 == 0) goto L_0x001d
            java.lang.Long r3 = z04.C66731x.m78732f(r3)
            if (r3 == 0) goto L_0x001d
            long r3 = r3.longValue()
            goto L_0x001f
        L_0x001d:
            r3 = 0
        L_0x001f:
            te3.p81 r5 = r0.f177590d
            int r11 = r5.f184791t
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            pu2.u0 r6 = pu2.C100960u0.f295631a
            pu2.b r7 = r0.f177591e
            com.tencent.mm.plugin.sns.ui.w6 r7 = r7.getStruct()
            java.lang.String r6 = r6.mo140476a(r7)
            r5.append(r6)
            java.lang.String r6 = "checkLiveStatus thisLiveId:"
            r5.append(r6)
            r5.append(r3)
            java.lang.String r6 = " originStatus:"
            r5.append(r6)
            r5.append(r11)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "MicroMsg.Improve.ImproveFinderLiveTimelineItem"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
            pu2.c$a r12 = new pu2.c$a
            te3.p81 r6 = r0.f177590d
            pu2.b r7 = r0.f177591e
            com.tencent.mm.plugin.sns.storage.SnsInfo r10 = r0.f177592f
            r5 = r12
            r8 = r3
            r5.<init>(r6, r7, r8, r10, r11)
            java.lang.Class<ir.n> r5 = p565ir.C60606n.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            java.lang.String r6 = "getService(IFinderLiveFeatureService::class.java)"
            gy3.C87412m.m108593f(r5, r6)
            ir.n r5 = (p565ir.C60606n) r5
            r8 = 0
            pu2.b r6 = r0.f177591e
            android.content.Context r6 = r6.getContext()
            r9 = r6
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r9 = (com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI) r9
            r11 = 2
            r13 = 0
            r14 = 0
            r15 = 96
            r16 = 0
            r6 = r3
            r10 = r12
            r12 = r13
            r13 = r14
            r14 = r15
            r15 = r16
            p565ir.C60606n.C60607a.m70857a(r5, r6, r8, r9, r10, r11, r12, r13, r14, r15)
            rx3.b0 r3 = rx3.C13598b0.f38549a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: pu2.C62521c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
