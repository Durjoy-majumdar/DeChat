package eu2;

import a14.C0000n0;
import androidx.lifecycle.C0123n0;
import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C54209k0;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.mvvm.MvvmStorage;
import di3.C86312j;
import f40.C86709a0;
import ft2.C97979c;
import fy3.C32224a;
import fy3.C32227p;
import gu2.C98214b;
import gy3.C87413o;
import i40.C60247c;
import iu2.C60631e;
import iu2.C98802d;
import o40.C61926c;
import p565ir.C60606n;
import rx3.C13598b0;
import t91.C64208c;
import te3.C101789j00;
import te3.C51713vn0;
import te3.C64273c21;
import te3.C64337e61;
import te3.C64623p81;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$checkLiveStatus$2", mo125469f = "FinderLiveImproveTimelineItem.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: eu2.b */
public final class C58814b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C64623p81 f168387d;

    /* renamed from: e */
    public final /* synthetic */ C58804a f168388e;

    /* renamed from: f */
    public final /* synthetic */ C98214b f168389f;

    /* renamed from: eu2.b$a */
    public static final class C58815a implements C60606n.C60609c {

        /* renamed from: a */
        public final /* synthetic */ C64623p81 f168390a;

        /* renamed from: b */
        public final /* synthetic */ C58804a f168391b;

        /* renamed from: c */
        public final /* synthetic */ long f168392c;

        /* renamed from: d */
        public final /* synthetic */ int f168393d;

        /* renamed from: e */
        public final /* synthetic */ C98214b f168394e;

        /* renamed from: eu2.b$a$a */
        public static final class C58816a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C58804a f168395d;

            /* renamed from: e */
            public final /* synthetic */ C64623p81 f168396e;

            /* renamed from: f */
            public final /* synthetic */ Object f168397f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C58816a(C58804a aVar, C64623p81 p812, Object obj) {
                super(0);
                this.f168395d = aVar;
                this.f168396e = p812;
                this.f168397f = obj;
            }

            public Object invoke() {
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$checkLiveStatus$2$statusCallBack$1$onLiveStatusCallback$3");
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$checkLiveStatus$2$statusCallBack$1$onLiveStatusCallback$3");
                this.f168395d.mo137053x("MicroMsg.Improve.FinderLiveTimelineItem", "checkLiveStatus --> updateLiveTag");
                C58804a aVar = this.f168395d;
                C64623p81 p812 = this.f168396e;
                Object obj = this.f168397f;
                C51713vn0 vn02 = obj instanceof C51713vn0 ? (C51713vn0) obj : null;
                SnsMethodCalculate.markStartTimeMs("access$updateLiveTag", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
                aVar.mo83998a0(p812, vn02);
                SnsMethodCalculate.markEndTimeMs("access$updateLiveTag", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$checkLiveStatus$2$statusCallBack$1$onLiveStatusCallback$3");
                C13598b0 b0Var = C13598b0.f38549a;
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$checkLiveStatus$2$statusCallBack$1$onLiveStatusCallback$3");
                return b0Var;
            }
        }

        public C58815a(C64623p81 p812, C58804a aVar, long j, int i, C98214b bVar) {
            this.f168390a = p812;
            this.f168391b = aVar;
            this.f168392c = j;
            this.f168393d = i;
            this.f168394e = bVar;
        }

        public void onLiveStatusCallback(long j, int i, Object obj) {
            C39622i0 a;
            SnsMethodCalculate.markStartTimeMs("onLiveStatusCallback", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$checkLiveStatus$2$statusCallBack$1");
            String str = this.f168390a.f184778d;
            if (str == null) {
                str = "0";
            }
            long j2 = Util.getLong(str, 0);
            if (j2 != j) {
                this.f168391b.mo137055z("MicroMsg.Improve.FinderLiveTimelineItem", "#checkLiveStatus.onLiveStatusCallback not match, return");
                SnsMethodCalculate.markEndTimeMs("onLiveStatusCallback", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$checkLiveStatus$2$statusCallBack$1");
                return;
            }
            C64623p81 p812 = this.f168390a;
            p812.f184791t = i;
            C64623p81 p813 = null;
            C51713vn0 vn02 = obj instanceof C51713vn0 ? (C51713vn0) obj : null;
            C64273c21 c212 = vn02 != null ? vn02.f143572d : null;
            p812.f184761E = c212;
            C64337e61 e612 = c212 != null ? c212.f182363I : null;
            C58804a aVar = this.f168391b;
            StringBuilder sb = new StringBuilder();
            sb.append("checkLiveStatus, thisLiveId:");
            sb.append(this.f168392c);
            sb.append(",liveID:");
            sb.append(j);
            sb.append(",desc:");
            sb.append(this.f168390a.f184782h);
            sb.append(",share liveStatus:");
            sb.append(this.f168390a.f184791t);
            sb.append(", callback liveStatus:");
            sb.append(i);
            sb.append(",purchaseInfo:[");
            sb.append(e612 != null ? Boolean.valueOf(e612.f182921e) : null);
            sb.append(',');
            sb.append(e612 != null ? Integer.valueOf(e612.f182920d) : null);
            sb.append(']');
            aVar.mo137055z("MicroMsg.Improve.FinderLiveTimelineItem", sb.toString());
            String Dk = ((C60606n) C86312j.m106911c(C60606n.class)).mo84996Dk(j2);
            int i2 = 1;
            if (!(Dk.length() > 0)) {
                Dk = null;
            }
            if (Dk != null) {
                this.f168390a.f184783i = Dk;
            }
            C61926c.m72668M(new C58816a(this.f168391b, this.f168390a, obj));
            if (this.f168393d == 1 && i == 2) {
                C101789j00 j002 = this.f168394e.mo137509G2().ContentObj;
                if (j002 != null) {
                    p813 = j002.f298435s;
                }
                if (p813 != null) {
                    p813.f184791t = i;
                }
                C98214b bVar = this.f168394e;
                bVar.mo142402q2(bVar.mo137509G2().toByteArray());
                Class cls = C60631e.class;
                synchronized (C60247c.f171776h) {
                    C86709a0.m107523b().mo121108c();
                    if (C60247c.class.isAssignableFrom(cls)) {
                        a = new C54209k0((C0123n0) C86709a0.m107523b().f251755f, (C54209k0.C54210b) new C60247c.C60248a.C60249a()).mo75002a(cls);
                    } else {
                        throw new IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                    }
                }
                int update$default = MvvmStorage.update$default(((C60631e) a).mo85233d3(C98802d.class), this.f168394e, false, false, 4, (Object) null);
                this.f168391b.mo137055z("MicroMsg.Improve.FinderLiveTimelineItem", "checkLiveStatus, update finder live status to end!result:" + update$default);
            }
            C58804a aVar2 = this.f168391b;
            C64623p81 p814 = this.f168390a;
            C64273c21 c213 = p814.f184761E;
            SnsMethodCalculate.markStartTimeMs("access$isLiveReplay", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
            boolean W = aVar2.mo83994W(p814, c213);
            SnsMethodCalculate.markEndTimeMs("access$isLiveReplay", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
            if (!W) {
                if (i != 1) {
                    i2 = 2;
                }
                C97979c.m126547n(C64208c.f181951a.mo89026a(String.valueOf(j)), i2);
            } else {
                C64208c.f181951a.mo89031f(String.valueOf(j));
            }
            SnsMethodCalculate.markEndTimeMs("onLiveStatusCallback", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$checkLiveStatus$2$statusCallBack$1");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58814b(C64623p81 p812, C58804a aVar, C98214b bVar, C15601d<? super C58814b> dVar) {
        super(2, dVar);
        this.f168387d = p812;
        this.f168388e = aVar;
        this.f168389f = bVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$checkLiveStatus$2");
        C58814b bVar = new C58814b(this.f168387d, this.f168388e, this.f168389f, dVar);
        SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$checkLiveStatus$2");
        return bVar;
    }

    public Object invoke(Object obj, Object obj2) {
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$checkLiveStatus$2");
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$checkLiveStatus$2");
        Object invokeSuspend = ((C58814b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$checkLiveStatus$2");
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$checkLiveStatus$2");
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
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$checkLiveStatus$2"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            kotlin.ResultKt.throwOnFailure(r18)
            te3.p81 r3 = r0.f168387d
            java.lang.String r3 = r3.f184778d
            if (r3 == 0) goto L_0x001d
            java.lang.Long r3 = z04.C66731x.m78732f(r3)
            if (r3 == 0) goto L_0x001d
            long r3 = r3.longValue()
            goto L_0x001f
        L_0x001d:
            r3 = 0
        L_0x001f:
            te3.p81 r5 = r0.f168387d
            int r10 = r5.f184791t
            eu2.a r5 = r0.f168388e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "checkLiveStatus thisLiveId:"
            r6.append(r7)
            r6.append(r3)
            java.lang.String r7 = " originStatus:"
            r6.append(r7)
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "MicroMsg.Improve.FinderLiveTimelineItem"
            r5.mo137055z(r7, r6)
            eu2.b$a r12 = new eu2.b$a
            te3.p81 r6 = r0.f168387d
            eu2.a r7 = r0.f168388e
            gu2.b r11 = r0.f168389f
            r5 = r12
            r8 = r3
            r5.<init>(r6, r7, r8, r10, r11)
            java.lang.Class<ir.n> r5 = p565ir.C60606n.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            java.lang.String r6 = "getService(IFinderLiveFeatureService::class.java)"
            gy3.C87412m.m108593f(r5, r6)
            ir.n r5 = (p565ir.C60606n) r5
            r8 = 0
            eu2.a r6 = r0.f168388e
            android.content.Context r6 = r6.getContext()
            java.lang.String r7 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
            gy3.C87412m.m108592e(r6, r7)
            r9 = r6
            com.tencent.mm.ui.MMActivity r9 = (com.tencent.p014mm.p136ui.MMActivity) r9
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
        throw new UnsupportedOperationException("Method not decompiled: eu2.C58814b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
