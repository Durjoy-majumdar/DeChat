package ou2;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import a14.C53973z1;
import c14.C54624g;
import com.tencent.p014mm.plugin.sns.p104ad.adxml.AdClickActionInfo;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.C95301a;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import d14.C45252f;
import d14.C45253g;
import d14.C58031e0;
import d14.C58042h;
import d14.C58063m0;
import d14.C58085t0;
import d14.C58097y0;
import e14.C58496n;
import fy3.C32224a;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C59741c0;
import gy3.C8479f0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import jp2.C98963o;
import kotlin.ResultKt;
import org.json.JSONObject;
import os2.C100397a;
import os2.C100413l;
import os2.C100418s;
import ou2.C100464b;
import rx3.C13598b0;
import rx3.C13600d;
import sx3.C110823p;
import te3.C101804kv2;
import vr2.C102236a0;
import vr2.C102260r;
import wx3.C15601d;
import wx3.C66212f;
import wx3.C66217g;
import xx3.C15911a;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: ou2.h */
public final class C100486h extends C100462a {

    /* renamed from: s */
    public static final C100487a f294385s = new C100487a((C8480h) null);

    /* renamed from: m */
    public boolean f294386m;

    /* renamed from: n */
    public boolean f294387n;

    /* renamed from: o */
    public boolean f294388o;

    /* renamed from: p */
    public int f294389p;

    /* renamed from: q */
    public int f294390q;

    /* renamed from: r */
    public boolean f294391r;

    /* renamed from: ou2.h$a */
    public static final class C100487a {
        public C100487a(C8480h hVar) {
        }

        /* renamed from: a */
        public final String mo139981a() {
            SnsMethodCalculate.markStartTimeMs("getTAG", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$Companion");
            SnsMethodCalculate.markStartTimeMs("access$getTAG$cp", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController");
            SnsMethodCalculate.markEndTimeMs("access$getTAG$cp", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController");
            SnsMethodCalculate.markEndTimeMs("getTAG", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$Companion");
            return "CycleScheduleVideoController";
        }
    }

    /* renamed from: ou2.h$b */
    public static final class C100488b {

        /* renamed from: a */
        public final long f294392a;

        /* renamed from: b */
        public final int f294393b;

        public C100488b(long j, int i) {
            this.f294392a = j;
            this.f294393b = i;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$playOrPauseJob$1", mo125469f = "CycleScheduleVideoController.kt", mo125470l = {220}, mo125471m = "invokeSuspend")
    /* renamed from: ou2.h$c */
    public static final class C100489c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f294394d;

        /* renamed from: e */
        public /* synthetic */ Object f294395e;

        /* renamed from: f */
        public final /* synthetic */ C100486h f294396f;

        /* renamed from: g */
        public final /* synthetic */ C100397a f294397g;

        /* renamed from: h */
        public final /* synthetic */ AdClickActionInfo f294398h;

        /* renamed from: i */
        public final /* synthetic */ C8479f0<C53973z1> f294399i;

        /* renamed from: j */
        public final /* synthetic */ C100418s f294400j;

        /* renamed from: n */
        public final /* synthetic */ C59741c0 f294401n;

        /* renamed from: o */
        public final /* synthetic */ float f294402o;

        /* renamed from: p */
        public final /* synthetic */ float f294403p;

        /* renamed from: q */
        public final /* synthetic */ C58085t0<Boolean> f294404q;

        /* renamed from: ou2.h$c$a */
        public static final class C100490a<T> implements C45253g {

            /* renamed from: d */
            public final /* synthetic */ C100486h f294405d;

            /* renamed from: e */
            public final /* synthetic */ C100397a f294406e;

            /* renamed from: f */
            public final /* synthetic */ AdClickActionInfo f294407f;

            /* renamed from: g */
            public final /* synthetic */ C8479f0<C53973z1> f294408g;

            /* renamed from: h */
            public final /* synthetic */ C0000n0 f294409h;

            /* renamed from: i */
            public final /* synthetic */ C100418s f294410i;

            /* renamed from: j */
            public final /* synthetic */ C59741c0 f294411j;

            /* renamed from: n */
            public final /* synthetic */ float f294412n;

            /* renamed from: o */
            public final /* synthetic */ float f294413o;

            /* renamed from: p */
            public final /* synthetic */ C58085t0<Boolean> f294414p;

            @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$playOrPauseJob$1$1", mo125469f = "CycleScheduleVideoController.kt", mo125470l = {231, 232}, mo125471m = "emit")
            /* renamed from: ou2.h$c$a$a */
            public static final class C100491a extends C66704d {

                /* renamed from: d */
                public Object f294415d;

                /* renamed from: e */
                public Object f294416e;

                /* renamed from: f */
                public long f294417f;

                /* renamed from: g */
                public /* synthetic */ Object f294418g;

                /* renamed from: h */
                public final /* synthetic */ C100490a<T> f294419h;

                /* renamed from: i */
                public int f294420i;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C100491a(C100490a<? super T> aVar, C15601d<? super C100491a> dVar) {
                    super(dVar);
                    this.f294419h = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$playOrPauseJob$1$1$emit$1");
                    this.f294418g = obj;
                    this.f294420i |= Integer.MIN_VALUE;
                    Object a = this.f294419h.mo139982a((C100464b.C100466b) null, this);
                    SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$playOrPauseJob$1$1$emit$1");
                    return a;
                }
            }

            public C100490a(C100486h hVar, C100397a aVar, AdClickActionInfo adClickActionInfo, C8479f0<C53973z1> f0Var, C0000n0 n0Var, C100418s sVar, C59741c0 c0Var, float f, float f2, C58085t0<Boolean> t0Var) {
                this.f294405d = hVar;
                this.f294406e = aVar;
                this.f294407f = adClickActionInfo;
                this.f294408g = f0Var;
                this.f294409h = n0Var;
                this.f294410i = sVar;
                this.f294411j = c0Var;
                this.f294412n = f;
                this.f294413o = f2;
                this.f294414p = t0Var;
            }

            /* JADX WARNING: Removed duplicated region for block: B:15:0x0084  */
            /* JADX WARNING: Removed duplicated region for block: B:45:0x014f  */
            /* JADX WARNING: Removed duplicated region for block: B:52:0x018f  */
            /* JADX WARNING: Removed duplicated region for block: B:55:0x01bb  */
            /* JADX WARNING: Removed duplicated region for block: B:58:0x020f  */
            /* JADX WARNING: Removed duplicated region for block: B:59:0x0213  */
            /* JADX WARNING: Removed duplicated region for block: B:75:0x025f  */
            /* JADX WARNING: Removed duplicated region for block: B:78:0x0277  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0043  */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object mo139982a(ou2.C100464b.C100466b r27, wx3.C15601d<? super rx3.C13598b0> r28) {
                /*
                    r26 = this;
                    r0 = r26
                    r1 = r27
                    r2 = r28
                    java.lang.String r3 = "emit"
                    java.lang.String r4 = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$playOrPauseJob$1$1"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
                    boolean r5 = r2 instanceof ou2.C100486h.C100489c.C100490a.C100491a
                    if (r5 == 0) goto L_0x0020
                    r5 = r2
                    ou2.h$c$a$a r5 = (ou2.C100486h.C100489c.C100490a.C100491a) r5
                    int r6 = r5.f294420i
                    r7 = -2147483648(0xffffffff80000000, float:-0.0)
                    r8 = r6 & r7
                    if (r8 == 0) goto L_0x0020
                    int r6 = r6 - r7
                    r5.f294420i = r6
                    goto L_0x0025
                L_0x0020:
                    ou2.h$c$a$a r5 = new ou2.h$c$a$a
                    r5.<init>(r0, r2)
                L_0x0025:
                    r10 = r5
                    java.lang.Object r2 = r10.f294418g
                    xx3.a r5 = xx3.C15911a.COROUTINE_SUSPENDED
                    int r6 = r10.f294420i
                    java.lang.String r13 = "access$getTAG$cp"
                    java.lang.String r14 = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$Companion"
                    java.lang.String r15 = "getTAG"
                    java.lang.String r12 = "CycleScheduleVideoController"
                    r16 = 0
                    java.lang.String r11 = "access$setPlaying$p"
                    java.lang.String r7 = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$PlayInfo"
                    java.lang.String r9 = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AbstractScheduleVideoController"
                    r28 = r11
                    r11 = 1
                    java.lang.String r8 = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController"
                    if (r6 == 0) goto L_0x0084
                    if (r6 == r11) goto L_0x006a
                    r1 = 2
                    if (r6 != r1) goto L_0x005f
                    long r5 = r10.f294417f
                    java.lang.Object r1 = r10.f294415d
                    ou2.h$c$a r1 = (ou2.C100486h.C100489c.C100490a) r1
                    kotlin.ResultKt.throwOnFailure(r2)
                    r2 = r28
                    r20 = r1
                    r25 = r9
                    r1 = r12
                    r23 = r13
                    r24 = r14
                    r13 = r8
                    goto L_0x0189
                L_0x005f:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r2)
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
                    throw r1
                L_0x006a:
                    r20 = r12
                    long r11 = r10.f294417f
                    java.lang.Object r1 = r10.f294416e
                    ou2.b$b r1 = (ou2.C100464b.C100466b) r1
                    java.lang.Object r6 = r10.f294415d
                    ou2.h$c$a r6 = (ou2.C100486h.C100489c.C100490a) r6
                    kotlin.ResultKt.throwOnFailure(r2)
                    r21 = r8
                    r22 = r9
                    r23 = r13
                    r24 = r14
                    r13 = 1
                    goto L_0x013d
                L_0x0084:
                    r20 = r12
                    kotlin.ResultKt.throwOnFailure(r2)
                    ou2.b$a r2 = r27.mo139971b()
                    ou2.b$a r6 = ou2.C100464b.C100465a.PLAY
                    java.lang.String r12 = "access$getHasBreakVideoStarted$p"
                    java.lang.String r11 = "access$getHasPrepared$p"
                    if (r2 != r6) goto L_0x0309
                    ou2.h r2 = r0.f294405d
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r8)
                    boolean r2 = r2.f294387n
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r8)
                    if (r2 != 0) goto L_0x028b
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r15, r14)
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r8)
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r8)
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r14)
                    java.lang.String r2 = "playCommand is not hasStarted, should prepare!"
                    r12 = r20
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r2)
                    long r11 = java.lang.System.currentTimeMillis()
                    ou2.h r2 = r0.f294405d
                    r2.getClass()
                    java.lang.String r6 = "getAlphaRenderControl"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r9)
                    ou2.k r2 = r2.f294290b
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r9)
                    if (r2 != 0) goto L_0x00cd
                    r21 = r8
                    goto L_0x00e6
                L_0x00cd:
                    ou2.h r6 = r0.f294405d
                    os2.l r6 = r6.mo139953d()
                    if (r6 == 0) goto L_0x00e0
                    int r6 = r6.mo139878c()
                    r21 = r8
                    r8 = 1
                    if (r6 != r8) goto L_0x00e2
                    r6 = 1
                    goto L_0x00e3
                L_0x00e0:
                    r21 = r8
                L_0x00e2:
                    r6 = 0
                L_0x00e3:
                    r2.setRenderMode(r6)
                L_0x00e6:
                    ou2.h r2 = r0.f294405d
                    ou2.l r2 = r2.mo139955f()
                    if (r2 == 0) goto L_0x013f
                    java.lang.String r6 = "getBreakSight"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r7)
                    jq2.g$c r8 = r1.f294333c
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r7)
                    java.lang.String r6 = r8.mo138347a()
                    android.widget.FrameLayout$LayoutParams r8 = r27.mo139970a()
                    r22 = r9
                    java.lang.StringBuilder r9 = new java.lang.StringBuilder
                    r9.<init>()
                    r23 = r13
                    java.lang.String r13 = "snsId="
                    r9.append(r13)
                    ou2.h r13 = r0.f294405d
                    com.tencent.mm.plugin.sns.storage.SnsInfo r13 = r13.mo139958i()
                    r24 = r14
                    if (r13 == 0) goto L_0x011c
                    long r13 = r13.field_snsId
                    goto L_0x011e
                L_0x011c:
                    r13 = r16
                L_0x011e:
                    java.lang.String r13 = vr2.C102236a0.m134765q0(r13)
                    r9.append(r13)
                    java.lang.String r9 = r9.toString()
                    r10.f294415d = r0
                    r10.f294416e = r1
                    r10.f294417f = r11
                    r13 = 1
                    r10.f294420i = r13
                    java.lang.Object r2 = r2.mo133978b(r6, r8, r9, r10)
                    if (r2 != r5) goto L_0x013c
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
                    return r5
                L_0x013c:
                    r6 = r0
                L_0x013d:
                    r2 = r6
                    goto L_0x0147
                L_0x013f:
                    r22 = r9
                    r23 = r13
                    r24 = r14
                    r13 = 1
                    r2 = r0
                L_0x0147:
                    ou2.h r6 = r2.f294405d
                    ou2.l r6 = r6.mo139956g()
                    if (r6 == 0) goto L_0x018f
                    r1.getClass()
                    java.lang.String r8 = "getSight"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r7)
                    jq2.g$c r1 = r1.f294332b
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r7)
                    java.lang.String r7 = r1.mo138347a()
                    r8 = 0
                    r9 = 0
                    r1 = 6
                    r14 = 0
                    r10.f294415d = r2
                    r13 = 0
                    r10.f294416e = r13
                    r10.f294417f = r11
                    r13 = 2
                    r10.f294420i = r13
                    r13 = r21
                    r25 = r22
                    r18 = r11
                    r12 = r28
                    r11 = r1
                    r1 = r20
                    r20 = r2
                    r2 = r12
                    r12 = r14
                    java.lang.Object r6 = ou2.C100509l.C100510a.m131542a(r6, r7, r8, r9, r10, r11, r12)
                    if (r6 != r5) goto L_0x0187
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
                    return r5
                L_0x0187:
                    r5 = r18
                L_0x0189:
                    r11 = r5
                L_0x018a:
                    r5 = r20
                    r6 = r24
                    goto L_0x019c
                L_0x018f:
                    r18 = r11
                    r1 = r20
                    r13 = r21
                    r25 = r22
                    r20 = r2
                    r2 = r28
                    goto L_0x018a
                L_0x019c:
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r15, r6)
                    r7 = r23
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r13)
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r13)
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r6)
                    java.lang.String r8 = "playCommand prepared!"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r8)
                    long r8 = java.lang.System.currentTimeMillis()
                    long r8 = r8 - r11
                    r10 = 3000(0xbb8, double:1.482E-320)
                    int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                    if (r12 <= 0) goto L_0x01dc
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r15, r6)
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r13)
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r13)
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r6)
                    java.lang.StringBuilder r6 = new java.lang.StringBuilder
                    r6.<init>()
                    java.lang.String r7 = "prepare cost too much time!  "
                    r6.append(r7)
                    r6.append(r8)
                    java.lang.String r6 = r6.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r6)
                L_0x01dc:
                    ou2.h r1 = r5.f294405d
                    r1.getClass()
                    java.lang.String r6 = "getSetClickArea"
                    r7 = r25
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r7)
                    fy3.q<os2.a, com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo, com.tencent.mm.plugin.sns.storage.SnsInfo, rx3.b0> r1 = r1.f294296h
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r7)
                    os2.a r6 = r5.f294406e
                    com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r8 = r5.f294407f
                    ou2.h r9 = r5.f294405d
                    com.tencent.mm.plugin.sns.storage.SnsInfo r9 = r9.mo139958i()
                    r1.invoke(r6, r8, r9)
                    os2.s r1 = r5.f294410i
                    ou2.h r6 = r5.f294405d
                    gy3.c0 r8 = r5.f294411j
                    java.lang.String r9 = "access$invokeSuspend$adjustSeekEnd"
                    java.lang.String r10 = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$playOrPauseJob$1"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r10)
                    java.lang.String r11 = "invokeSuspend$adjustSeekEnd"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r10)
                    if (r1 != 0) goto L_0x0213
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r10)
                    goto L_0x0254
                L_0x0213:
                    ou2.l r12 = r6.mo139955f()
                    if (r12 == 0) goto L_0x021d
                    long r16 = r12.getDurationMs()
                L_0x021d:
                    r14 = r16
                    float r12 = (float) r14
                    r14 = 0
                    int r15 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                    if (r15 <= 0) goto L_0x0226
                    goto L_0x023b
                L_0x0226:
                    java.lang.String r12 = "getCurrentBreakVideoMedia"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r7)
                    te3.kv2 r6 = r6.f294298j
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r7)
                    if (r6 == 0) goto L_0x0235
                    float r6 = r6.f298684R
                    goto L_0x0236
                L_0x0235:
                    r6 = 0
                L_0x0236:
                    r7 = 1000(0x3e8, float:1.401E-42)
                    float r7 = (float) r7
                    float r12 = r7 * r6
                L_0x023b:
                    java.lang.String r6 = "getLoopEndTime"
                    java.lang.String r7 = "com.tencent.mm.plugin.sns.storage.PlayModeInfo"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r7)
                    float r1 = r1.f294180d
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r7)
                    int r6 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
                    if (r6 <= 0) goto L_0x024f
                    float r12 = java.lang.Math.min(r1, r12)
                L_0x024f:
                    r8.f170634d = r12
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r10)
                L_0x0254:
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r10)
                    ou2.h r1 = r5.f294405d
                    ou2.l r1 = r1.mo139956g()
                    if (r1 == 0) goto L_0x0262
                    r1.start()
                L_0x0262:
                    ou2.h r1 = r5.f294405d
                    java.lang.String r6 = "access$setHasPrepared$p"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r13)
                    r8 = 1
                    r1.f294387n = r8
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r13)
                    gy3.f0<a14.z1> r1 = r5.f294408g
                    T r1 = r1.f27484d
                    a14.z1 r1 = (a14.C53973z1) r1
                    if (r1 == 0) goto L_0x027b
                    r9 = 0
                    a14.C53973z1.C53974a.m60623a(r1, r9, r8, r9)
                L_0x027b:
                    gy3.f0<a14.z1> r1 = r5.f294408g
                    a14.n0 r6 = r5.f294409h
                    ou2.h r7 = r5.f294405d
                    float r9 = r5.f294412n
                    a14.z1 r6 = ou2.C100486h.C100489c.m131534f(r6, r7, r9)
                    r1.f27484d = r6
                    goto L_0x02fe
                L_0x028b:
                    r2 = r28
                    r13 = r8
                    r8 = 1
                    r9 = 0
                    ou2.h r1 = r0.f294405d
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r13)
                    boolean r1 = r1.f294388o
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r13)
                    if (r1 == 0) goto L_0x02d9
                    ou2.h r1 = r0.f294405d
                    boolean r1 = ou2.C100486h.m131526n(r1)
                    if (r1 == 0) goto L_0x02cd
                    gy3.f0<a14.z1> r1 = r0.f294408g
                    T r1 = r1.f27484d
                    a14.z1 r1 = (a14.C53973z1) r1
                    if (r1 == 0) goto L_0x02af
                    a14.C53973z1.C53974a.m60623a(r1, r9, r8, r9)
                L_0x02af:
                    ou2.h r1 = r0.f294405d
                    ou2.l r1 = r1.mo139955f()
                    if (r1 == 0) goto L_0x02ba
                    r1.resume()
                L_0x02ba:
                    gy3.f0<a14.z1> r1 = r0.f294408g
                    a14.n0 r5 = r0.f294409h
                    ou2.h r6 = r0.f294405d
                    gy3.c0 r7 = r0.f294411j
                    float r9 = r0.f294413o
                    d14.t0<java.lang.Boolean> r10 = r0.f294414p
                    a14.z1 r5 = ou2.C100486h.m131528p(r5, r6, r7, r9, r10)
                    r1.f27484d = r5
                    goto L_0x02f2
                L_0x02cd:
                    ou2.h r1 = r0.f294405d
                    ou2.l r1 = r1.mo139955f()
                    if (r1 == 0) goto L_0x02f2
                    r1.resume()
                    goto L_0x02f2
                L_0x02d9:
                    gy3.f0<a14.z1> r1 = r0.f294408g
                    T r1 = r1.f27484d
                    a14.z1 r1 = (a14.C53973z1) r1
                    if (r1 == 0) goto L_0x02e4
                    a14.C53973z1.C53974a.m60623a(r1, r9, r8, r9)
                L_0x02e4:
                    gy3.f0<a14.z1> r1 = r0.f294408g
                    a14.n0 r5 = r0.f294409h
                    ou2.h r6 = r0.f294405d
                    float r7 = r0.f294412n
                    a14.z1 r5 = ou2.C100486h.C100489c.m131534f(r5, r6, r7)
                    r1.f27484d = r5
                L_0x02f2:
                    ou2.h r1 = r0.f294405d
                    ou2.l r1 = r1.mo139956g()
                    if (r1 == 0) goto L_0x02fd
                    r1.resume()
                L_0x02fd:
                    r5 = r0
                L_0x02fe:
                    ou2.h r1 = r5.f294405d
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r13)
                    r1.f294391r = r8
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r13)
                    goto L_0x0371
                L_0x0309:
                    r2 = r28
                    r7 = r13
                    r6 = r14
                    r5 = r20
                    r9 = 0
                    r13 = r8
                    r8 = 1
                    ou2.b$a r1 = r27.mo139971b()
                    ou2.b$a r10 = ou2.C100464b.C100465a.PAUSE
                    if (r1 != r10) goto L_0x0371
                    gy3.f0<a14.z1> r1 = r0.f294408g
                    T r1 = r1.f27484d
                    a14.z1 r1 = (a14.C53973z1) r1
                    if (r1 == 0) goto L_0x0325
                    a14.C53973z1.C53974a.m60623a(r1, r9, r8, r9)
                L_0x0325:
                    ou2.h r1 = r0.f294405d
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r13)
                    boolean r1 = r1.f294387n
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r13)
                    if (r1 != 0) goto L_0x0344
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r15, r6)
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r13)
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r13)
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r6)
                    java.lang.String r1 = "playCommand call pause but not started!!"
                    com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r1)
                    goto L_0x0366
                L_0x0344:
                    ou2.h r1 = r0.f294405d
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r13)
                    boolean r1 = r1.f294388o
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r13)
                    if (r1 == 0) goto L_0x035b
                    ou2.h r1 = r0.f294405d
                    ou2.l r1 = r1.mo139955f()
                    if (r1 == 0) goto L_0x035b
                    r1.pause()
                L_0x035b:
                    ou2.h r1 = r0.f294405d
                    ou2.l r1 = r1.mo139956g()
                    if (r1 == 0) goto L_0x0366
                    r1.pause()
                L_0x0366:
                    ou2.h r1 = r0.f294405d
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r13)
                    r5 = 0
                    r1.f294391r = r5
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r13)
                L_0x0371:
                    rx3.b0 r1 = rx3.C13598b0.f38549a
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: ou2.C100486h.C100489c.C100490a.mo139982a(ou2.b$b, wx3.d):java.lang.Object");
            }

            public /* bridge */ /* synthetic */ Object emit(Object obj, C15601d dVar) {
                SnsMethodCalculate.markStartTimeMs("emit", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$playOrPauseJob$1$1");
                Object a = mo139982a((C100464b.C100466b) obj, dVar);
                SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$playOrPauseJob$1$1");
                return a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C100489c(C100486h hVar, C100397a aVar, AdClickActionInfo adClickActionInfo, C8479f0<C53973z1> f0Var, C100418s sVar, C59741c0 c0Var, float f, float f2, C58085t0<Boolean> t0Var, C15601d<? super C100489c> dVar) {
            super(2, dVar);
            this.f294396f = hVar;
            this.f294397g = aVar;
            this.f294398h = adClickActionInfo;
            this.f294399i = f0Var;
            this.f294400j = sVar;
            this.f294401n = c0Var;
            this.f294402o = f;
            this.f294403p = f2;
            this.f294404q = t0Var;
        }

        /* renamed from: f */
        public static final C53973z1 m131534f(C0000n0 n0Var, C100486h hVar, float f) {
            SnsMethodCalculate.markStartTimeMs("access$invokeSuspend$firstPlayBreakVideo", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$playOrPauseJob$1");
            SnsMethodCalculate.markStartTimeMs("invokeSuspend$firstPlayBreakVideo", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$playOrPauseJob$1");
            C53973z1 d = C53895h.m60466d(n0Var, (C66212f) null, (C53934p0) null, new C100504i(hVar, f, (C15601d<? super C100504i>) null), 3, (Object) null);
            SnsMethodCalculate.markEndTimeMs("invokeSuspend$firstPlayBreakVideo", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$playOrPauseJob$1");
            SnsMethodCalculate.markEndTimeMs("access$invokeSuspend$firstPlayBreakVideo", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$playOrPauseJob$1");
            return d;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$playOrPauseJob$1");
            C100489c cVar = new C100489c(this.f294396f, this.f294397g, this.f294398h, this.f294399i, this.f294400j, this.f294401n, this.f294402o, this.f294403p, this.f294404q, dVar);
            cVar.f294395e = obj;
            SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$playOrPauseJob$1");
            return cVar;
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$playOrPauseJob$1");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$playOrPauseJob$1");
            Object invokeSuspend = ((C100489c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$playOrPauseJob$1");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$playOrPauseJob$1");
            return invokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            String str = "invokeSuspend";
            SnsMethodCalculate.markStartTimeMs(str, "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$playOrPauseJob$1");
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f294394d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C100486h hVar = this.f294396f;
                hVar.getClass();
                SnsMethodCalculate.markStartTimeMs("getPlayCommandFlow", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AbstractScheduleVideoController");
                C58085t0<C100464b.C100466b> t0Var = hVar.f294294f;
                SnsMethodCalculate.markEndTimeMs("getPlayCommandFlow", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AbstractScheduleVideoController");
                C45252f<C100464b.C100466b> e = C58042h.m67196e(t0Var);
                String str2 = str;
                C100490a aVar2 = r6;
                C100490a aVar3 = new C100490a(this.f294396f, this.f294397g, this.f294398h, this.f294399i, (C0000n0) this.f294395e, this.f294400j, this.f294401n, this.f294402o, this.f294403p, this.f294404q);
                this.f294394d = 1;
                if (e.mo31880a(aVar2, this) == aVar) {
                    SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$playOrPauseJob$1");
                    return aVar;
                }
                str = str2;
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$playOrPauseJob$1");
                throw illegalStateException;
            }
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$playOrPauseJob$1");
            return b0Var;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$restartPlayJob$1", mo125469f = "CycleScheduleVideoController.kt", mo125470l = {114}, mo125471m = "invokeSuspend")
    /* renamed from: ou2.h$d */
    public static final class C100492d extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f294421d;

        /* renamed from: e */
        public final /* synthetic */ C100486h f294422e;

        /* renamed from: f */
        public final /* synthetic */ float f294423f;

        /* renamed from: ou2.h$d$a */
        public static final class C100493a<T> implements C45253g {

            /* renamed from: d */
            public final /* synthetic */ C100486h f294424d;

            /* renamed from: e */
            public final /* synthetic */ float f294425e;

            public C100493a(C100486h hVar, float f) {
                this.f294424d = hVar;
                this.f294425e = f;
            }

            public Object emit(Object obj, C15601d dVar) {
                SnsMethodCalculate.markStartTimeMs("emit", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$restartPlayJob$1$1");
                ((Boolean) obj).booleanValue();
                SnsMethodCalculate.markStartTimeMs("emit", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$restartPlayJob$1$1");
                long j = 0;
                if (C100486h.m131526n(this.f294424d)) {
                    C100486h hVar = this.f294424d;
                    int m = C100486h.m131525m(hVar);
                    C100509l f = this.f294424d.mo139955f();
                    if (f != null) {
                        j = f.getCurrentPosInMills();
                    }
                    C100486h.m131527o(hVar, m + (((int) j) - ((int) this.f294425e)));
                } else {
                    C100486h hVar2 = this.f294424d;
                    int m2 = C100486h.m131525m(hVar2);
                    C100509l f2 = this.f294424d.mo139955f();
                    if (f2 != null) {
                        j = f2.getCurrentPosInMills();
                    }
                    C100486h.m131527o(hVar2, m2 + ((int) j));
                }
                C100486h hVar3 = this.f294424d;
                SnsMethodCalculate.markStartTimeMs("access$setFirstPlayed$p", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController");
                hVar3.f294386m = false;
                SnsMethodCalculate.markEndTimeMs("access$setFirstPlayed$p", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController");
                C100486h hVar4 = this.f294424d;
                SnsMethodCalculate.markStartTimeMs("access$setHasBreakVideoStarted$p", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController");
                hVar4.f294388o = false;
                SnsMethodCalculate.markEndTimeMs("access$setHasBreakVideoStarted$p", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController");
                C100486h hVar5 = this.f294424d;
                SnsMethodCalculate.markStartTimeMs("access$setHasPrepared$p", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController");
                hVar5.f294387n = false;
                SnsMethodCalculate.markEndTimeMs("access$setHasPrepared$p", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController");
                C100509l f3 = this.f294424d.mo139955f();
                if (f3 != null) {
                    f3.pause();
                }
                C100509l f4 = this.f294424d.mo139955f();
                if (f4 != null) {
                    f4.stop();
                }
                C13598b0 b0Var = C13598b0.f38549a;
                SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$restartPlayJob$1$1");
                SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$restartPlayJob$1$1");
                return b0Var;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C100492d(C100486h hVar, float f, C15601d<? super C100492d> dVar) {
            super(2, dVar);
            this.f294422e = hVar;
            this.f294423f = f;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$restartPlayJob$1");
            C100492d dVar2 = new C100492d(this.f294422e, this.f294423f, dVar);
            SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$restartPlayJob$1");
            return dVar2;
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$restartPlayJob$1");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$restartPlayJob$1");
            ((C100492d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$restartPlayJob$1");
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$restartPlayJob$1");
            return aVar;
        }

        public final Object invokeSuspend(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$restartPlayJob$1");
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f294421d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C100486h hVar = this.f294422e;
                hVar.getClass();
                SnsMethodCalculate.markStartTimeMs("getRestartPlayFlow", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AbstractScheduleVideoController");
                C58085t0<Boolean> t0Var = hVar.f294293e;
                SnsMethodCalculate.markEndTimeMs("getRestartPlayFlow", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AbstractScheduleVideoController");
                C100493a aVar2 = new C100493a(this.f294422e, this.f294423f);
                this.f294421d = 1;
                if (t0Var.mo31880a(aVar2, this) == aVar) {
                    SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$restartPlayJob$1");
                    return aVar;
                }
            } else if (i != 1) {
                IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$restartPlayJob$1");
                throw illegalStateException;
            } else {
                ResultKt.throwOnFailure(obj);
            }
            C13600d dVar = new C13600d();
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$restartPlayJob$1");
            throw dVar;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$seekJob$1", mo125469f = "CycleScheduleVideoController.kt", mo125470l = {139}, mo125471m = "invokeSuspend")
    /* renamed from: ou2.h$e */
    public static final class C100494e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f294426d;

        /* renamed from: e */
        public /* synthetic */ Object f294427e;

        /* renamed from: f */
        public final /* synthetic */ C100486h f294428f;

        /* renamed from: g */
        public final /* synthetic */ C58085t0<Boolean> f294429g;

        /* renamed from: h */
        public final /* synthetic */ float f294430h;

        /* renamed from: i */
        public final /* synthetic */ C8479f0<C53973z1> f294431i;

        /* renamed from: j */
        public final /* synthetic */ C59741c0 f294432j;

        /* renamed from: ou2.h$e$a */
        public static final class C100495a<T> implements C45253g {

            /* renamed from: d */
            public final /* synthetic */ C100486h f294433d;

            /* renamed from: e */
            public final /* synthetic */ float f294434e;

            /* renamed from: f */
            public final /* synthetic */ C8479f0<C53973z1> f294435f;

            /* renamed from: g */
            public final /* synthetic */ C0000n0 f294436g;

            /* renamed from: h */
            public final /* synthetic */ C59741c0 f294437h;

            /* renamed from: i */
            public final /* synthetic */ C58085t0<Boolean> f294438i;

            /* renamed from: ou2.h$e$a$a */
            public static final class C100496a extends C87413o implements C32224a<Boolean> {

                /* renamed from: d */
                public final /* synthetic */ C100486h f294439d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C100496a(C100486h hVar) {
                    super(0);
                    this.f294439d = hVar;
                }

                public Object invoke() {
                    SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$seekJob$1$3$1");
                    SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$seekJob$1$3$1");
                    C100486h hVar = this.f294439d;
                    SnsMethodCalculate.markStartTimeMs("access$isPlaying$p", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController");
                    boolean z = hVar.f294391r;
                    SnsMethodCalculate.markEndTimeMs("access$isPlaying$p", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController");
                    Boolean valueOf = Boolean.valueOf(z);
                    SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$seekJob$1$3$1");
                    SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$seekJob$1$3$1");
                    return valueOf;
                }
            }

            @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$seekJob$1$3", mo125469f = "CycleScheduleVideoController.kt", mo125470l = {163}, mo125471m = "emit")
            /* renamed from: ou2.h$e$a$b */
            public static final class C100497b extends C66704d {

                /* renamed from: d */
                public Object f294440d;

                /* renamed from: e */
                public long f294441e;

                /* renamed from: f */
                public /* synthetic */ Object f294442f;

                /* renamed from: g */
                public final /* synthetic */ C100495a<T> f294443g;

                /* renamed from: h */
                public int f294444h;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C100497b(C100495a<? super T> aVar, C15601d<? super C100497b> dVar) {
                    super(dVar);
                    this.f294443g = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$seekJob$1$3$emit$1");
                    this.f294442f = obj;
                    this.f294444h |= Integer.MIN_VALUE;
                    Object a = this.f294443g.mo139983a(0, this);
                    SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$seekJob$1$3$emit$1");
                    return a;
                }
            }

            public C100495a(C100486h hVar, float f, C8479f0<C53973z1> f0Var, C0000n0 n0Var, C59741c0 c0Var, C58085t0<Boolean> t0Var) {
                this.f294433d = hVar;
                this.f294434e = f;
                this.f294435f = f0Var;
                this.f294436g = n0Var;
                this.f294437h = c0Var;
                this.f294438i = t0Var;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x004b  */
            /* JADX WARNING: Removed duplicated region for block: B:36:0x012b  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0033  */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object mo139983a(int r19, wx3.C15601d<? super rx3.C13598b0> r20) {
                /*
                    r18 = this;
                    r0 = r18
                    r1 = r19
                    r2 = r20
                    java.lang.String r3 = "emit"
                    java.lang.String r4 = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$seekJob$1$3"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
                    boolean r5 = r2 instanceof ou2.C100486h.C100494e.C100495a.C100497b
                    if (r5 == 0) goto L_0x0020
                    r5 = r2
                    ou2.h$e$a$b r5 = (ou2.C100486h.C100494e.C100495a.C100497b) r5
                    int r6 = r5.f294444h
                    r7 = -2147483648(0xffffffff80000000, float:-0.0)
                    r8 = r6 & r7
                    if (r8 == 0) goto L_0x0020
                    int r6 = r6 - r7
                    r5.f294444h = r6
                    goto L_0x0025
                L_0x0020:
                    ou2.h$e$a$b r5 = new ou2.h$e$a$b
                    r5.<init>(r0, r2)
                L_0x0025:
                    r11 = r5
                    java.lang.Object r2 = r11.f294442f
                    xx3.a r5 = xx3.C15911a.COROUTINE_SUSPENDED
                    int r6 = r11.f294444h
                    java.lang.String r12 = "CycleScheduleVideoController"
                    r13 = 1
                    java.lang.String r14 = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController"
                    if (r6 == 0) goto L_0x004b
                    if (r6 != r13) goto L_0x0040
                    long r5 = r11.f294441e
                    java.lang.Object r1 = r11.f294440d
                    ou2.h$e$a r1 = (ou2.C100486h.C100494e.C100495a) r1
                    kotlin.ResultKt.throwOnFailure(r2)
                    goto L_0x00f0
                L_0x0040:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r2)
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
                    throw r1
                L_0x004b:
                    kotlin.ResultKt.throwOnFailure(r2)
                    ou2.h$a r2 = ou2.C100486h.f294385s
                    r2.mo139981a()
                    java.lang.StringBuilder r6 = new java.lang.StringBuilder
                    r6.<init>()
                    java.lang.String r7 = "seekJobFlow called it = "
                    r6.append(r7)
                    r6.append(r1)
                    java.lang.String r6 = r6.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r6)
                    ou2.h r6 = r0.f294433d
                    boolean r6 = ou2.C100486h.m131526n(r6)
                    if (r6 == 0) goto L_0x0081
                    if (r1 != 0) goto L_0x0081
                    r2.mo139981a()
                    java.lang.String r1 = "seekJobFlow called but returned"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r1)
                    rx3.b0 r1 = rx3.C13598b0.f38549a
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
                    return r1
                L_0x0081:
                    r2.mo139981a()
                    java.lang.String r1 = "endBreakVideoJob called restart to begin"
                    com.tencent.p014mm.sdk.platformtools.Log.m105918d(r12, r1)
                    ou2.h r1 = r0.f294433d
                    ou2.l r1 = r1.mo139955f()
                    if (r1 == 0) goto L_0x0096
                    long r1 = r1.getCurrentPosInMills()
                    goto L_0x0098
                L_0x0096:
                    r1 = 0
                L_0x0098:
                    ou2.h r6 = r0.f294433d
                    boolean r6 = ou2.C100486h.m131526n(r6)
                    if (r6 != 0) goto L_0x00ac
                    ou2.h r6 = r0.f294433d
                    int r7 = ou2.C100486h.m131525m(r6)
                    int r2 = (int) r1
                    int r7 = r7 + r2
                    ou2.C100486h.m131527o(r6, r7)
                    goto L_0x00bb
                L_0x00ac:
                    ou2.h r6 = r0.f294433d
                    int r7 = ou2.C100486h.m131525m(r6)
                    int r2 = (int) r1
                    float r1 = r0.f294434e
                    int r1 = (int) r1
                    int r2 = r2 - r1
                    int r7 = r7 + r2
                    ou2.C100486h.m131527o(r6, r7)
                L_0x00bb:
                    ou2.h r1 = r0.f294433d
                    java.lang.String r2 = "access$setFirstPlayed$p"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r14)
                    r1.f294386m = r13
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r14)
                    long r1 = java.lang.System.currentTimeMillis()
                    ou2.h r6 = r0.f294433d
                    ou2.l r6 = r6.mo139955f()
                    if (r6 == 0) goto L_0x00f6
                    float r7 = r0.f294434e
                    long r7 = (long) r7
                    r9 = 0
                    ou2.h$e$a$a r10 = new ou2.h$e$a$a
                    ou2.h r15 = r0.f294433d
                    r10.<init>(r15)
                    r11.f294440d = r0
                    r11.f294441e = r1
                    r11.f294444h = r13
                    java.lang.Object r6 = r6.mo133979c(r7, r9, r10, r11)
                    if (r6 != r5) goto L_0x00ee
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
                    return r5
                L_0x00ee:
                    r5 = r1
                    r1 = r0
                L_0x00f0:
                    r16 = r5
                    r5 = r1
                    r1 = r16
                    goto L_0x00f7
                L_0x00f6:
                    r5 = r0
                L_0x00f7:
                    java.lang.String r6 = "getTAG"
                    java.lang.String r7 = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$Companion"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r7)
                    java.lang.String r8 = "access$getTAG$cp"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r14)
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r14)
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r7)
                    java.lang.StringBuilder r6 = new java.lang.StringBuilder
                    r6.<init>()
                    java.lang.String r7 = "seek cost "
                    r6.append(r7)
                    long r7 = java.lang.System.currentTimeMillis()
                    long r7 = r7 - r1
                    r6.append(r7)
                    java.lang.String r1 = r6.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105918d(r12, r1)
                    gy3.f0<a14.z1> r1 = r5.f294435f
                    T r1 = r1.f27484d
                    a14.z1 r1 = (a14.C53973z1) r1
                    if (r1 == 0) goto L_0x012f
                    r2 = 0
                    a14.C53973z1.C53974a.m60623a(r1, r2, r13, r2)
                L_0x012f:
                    ou2.h r1 = r5.f294433d
                    java.lang.String r2 = "access$getVideoPlayCount$p"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r14)
                    int r6 = r1.f294390q
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r14)
                    int r6 = r6 + r13
                    java.lang.String r2 = "access$setVideoPlayCount$p"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r14)
                    r1.f294390q = r6
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r14)
                    gy3.f0<a14.z1> r1 = r5.f294435f
                    a14.n0 r2 = r5.f294436g
                    ou2.h r6 = r5.f294433d
                    gy3.c0 r7 = r5.f294437h
                    float r8 = r5.f294434e
                    d14.t0<java.lang.Boolean> r5 = r5.f294438i
                    a14.z1 r2 = ou2.C100486h.m131528p(r2, r6, r7, r8, r5)
                    r1.f27484d = r2
                    rx3.b0 r1 = rx3.C13598b0.f38549a
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: ou2.C100486h.C100494e.C100495a.mo139983a(int, wx3.d):java.lang.Object");
            }

            public /* bridge */ /* synthetic */ Object emit(Object obj, C15601d dVar) {
                SnsMethodCalculate.markStartTimeMs("emit", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$seekJob$1$3");
                Object a = mo139983a(((Number) obj).intValue(), dVar);
                SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$seekJob$1$3");
                return a;
            }
        }

        /* renamed from: ou2.h$e$b */
        public static final class C100498b implements C45252f<Integer> {

            /* renamed from: d */
            public final /* synthetic */ C45252f f294445d;

            /* renamed from: ou2.h$e$b$a */
            public static final class C100499a<T> implements C45253g {

                /* renamed from: d */
                public final /* synthetic */ C45253g f294446d;

                @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$seekJob$1$invokeSuspend$$inlined$map$1$2", mo125469f = "CycleScheduleVideoController.kt", mo125470l = {224}, mo125471m = "emit")
                /* renamed from: ou2.h$e$b$a$a */
                public static final class C100500a extends C66704d {

                    /* renamed from: d */
                    public /* synthetic */ Object f294447d;

                    /* renamed from: e */
                    public int f294448e;

                    /* renamed from: f */
                    public final /* synthetic */ C100499a f294449f;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C100500a(C100499a aVar, C15601d dVar) {
                        super(dVar);
                        this.f294449f = aVar;
                    }

                    public final Object invokeSuspend(Object obj) {
                        SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$seekJob$1$invokeSuspend$$inlined$map$1$2$1");
                        this.f294447d = obj;
                        this.f294448e |= Integer.MIN_VALUE;
                        Object emit = this.f294449f.emit((Object) null, this);
                        SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$seekJob$1$invokeSuspend$$inlined$map$1$2$1");
                        return emit;
                    }
                }

                public C100499a(C45253g gVar) {
                    this.f294446d = gVar;
                }

                /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object emit(java.lang.Object r7, wx3.C15601d r8) {
                    /*
                        r6 = this;
                        java.lang.String r0 = "emit"
                        java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$seekJob$1$invokeSuspend$$inlined$map$1$2"
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
                        boolean r2 = r8 instanceof ou2.C100486h.C100494e.C100498b.C100499a.C100500a
                        if (r2 == 0) goto L_0x001a
                        r2 = r8
                        ou2.h$e$b$a$a r2 = (ou2.C100486h.C100494e.C100498b.C100499a.C100500a) r2
                        int r3 = r2.f294448e
                        r4 = -2147483648(0xffffffff80000000, float:-0.0)
                        r5 = r3 & r4
                        if (r5 == 0) goto L_0x001a
                        int r3 = r3 - r4
                        r2.f294448e = r3
                        goto L_0x001f
                    L_0x001a:
                        ou2.h$e$b$a$a r2 = new ou2.h$e$b$a$a
                        r2.<init>(r6, r8)
                    L_0x001f:
                        java.lang.Object r8 = r2.f294447d
                        xx3.a r3 = xx3.C15911a.COROUTINE_SUSPENDED
                        int r4 = r2.f294448e
                        r5 = 1
                        if (r4 == 0) goto L_0x0039
                        if (r4 != r5) goto L_0x002e
                        kotlin.ResultKt.throwOnFailure(r8)
                        goto L_0x0055
                    L_0x002e:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                        throw r7
                    L_0x0039:
                        kotlin.ResultKt.throwOnFailure(r8)
                        d14.g r8 = r6.f294446d
                        java.lang.Boolean r7 = (java.lang.Boolean) r7
                        r7.booleanValue()
                        r7 = 0
                        java.lang.Integer r4 = new java.lang.Integer
                        r4.<init>(r7)
                        r2.f294448e = r5
                        java.lang.Object r7 = r8.emit(r4, r2)
                        if (r7 != r3) goto L_0x0055
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                        return r3
                    L_0x0055:
                        rx3.b0 r7 = rx3.C13598b0.f38549a
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: ou2.C100486h.C100494e.C100498b.C100499a.emit(java.lang.Object, wx3.d):java.lang.Object");
                }
            }

            public C100498b(C45252f fVar) {
                this.f294445d = fVar;
            }

            /* renamed from: a */
            public Object mo31880a(C45253g gVar, C15601d dVar) {
                SnsMethodCalculate.markStartTimeMs("collect", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$seekJob$1$invokeSuspend$$inlined$map$1");
                Object a = this.f294445d.mo31880a(new C100499a(gVar), dVar);
                if (a == C15911a.COROUTINE_SUSPENDED) {
                    SnsMethodCalculate.markEndTimeMs("collect", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$seekJob$1$invokeSuspend$$inlined$map$1");
                    return a;
                }
                C13598b0 b0Var = C13598b0.f38549a;
                SnsMethodCalculate.markEndTimeMs("collect", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$seekJob$1$invokeSuspend$$inlined$map$1");
                return b0Var;
            }
        }

        /* renamed from: ou2.h$e$c */
        public static final class C100501c implements C45252f<Integer> {

            /* renamed from: d */
            public final /* synthetic */ C45252f f294450d;

            /* renamed from: ou2.h$e$c$a */
            public static final class C100502a<T> implements C45253g {

                /* renamed from: d */
                public final /* synthetic */ C45253g f294451d;

                @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$seekJob$1$invokeSuspend$$inlined$map$2$2", mo125469f = "CycleScheduleVideoController.kt", mo125470l = {224}, mo125471m = "emit")
                /* renamed from: ou2.h$e$c$a$a */
                public static final class C100503a extends C66704d {

                    /* renamed from: d */
                    public /* synthetic */ Object f294452d;

                    /* renamed from: e */
                    public int f294453e;

                    /* renamed from: f */
                    public final /* synthetic */ C100502a f294454f;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C100503a(C100502a aVar, C15601d dVar) {
                        super(dVar);
                        this.f294454f = aVar;
                    }

                    public final Object invokeSuspend(Object obj) {
                        SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$seekJob$1$invokeSuspend$$inlined$map$2$2$1");
                        this.f294452d = obj;
                        this.f294453e |= Integer.MIN_VALUE;
                        Object emit = this.f294454f.emit((Object) null, this);
                        SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$seekJob$1$invokeSuspend$$inlined$map$2$2$1");
                        return emit;
                    }
                }

                public C100502a(C45253g gVar) {
                    this.f294451d = gVar;
                }

                /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object emit(java.lang.Object r7, wx3.C15601d r8) {
                    /*
                        r6 = this;
                        java.lang.String r0 = "emit"
                        java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$seekJob$1$invokeSuspend$$inlined$map$2$2"
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
                        boolean r2 = r8 instanceof ou2.C100486h.C100494e.C100501c.C100502a.C100503a
                        if (r2 == 0) goto L_0x001a
                        r2 = r8
                        ou2.h$e$c$a$a r2 = (ou2.C100486h.C100494e.C100501c.C100502a.C100503a) r2
                        int r3 = r2.f294453e
                        r4 = -2147483648(0xffffffff80000000, float:-0.0)
                        r5 = r3 & r4
                        if (r5 == 0) goto L_0x001a
                        int r3 = r3 - r4
                        r2.f294453e = r3
                        goto L_0x001f
                    L_0x001a:
                        ou2.h$e$c$a$a r2 = new ou2.h$e$c$a$a
                        r2.<init>(r6, r8)
                    L_0x001f:
                        java.lang.Object r8 = r2.f294452d
                        xx3.a r3 = xx3.C15911a.COROUTINE_SUSPENDED
                        int r4 = r2.f294453e
                        r5 = 1
                        if (r4 == 0) goto L_0x0039
                        if (r4 != r5) goto L_0x002e
                        kotlin.ResultKt.throwOnFailure(r8)
                        goto L_0x0054
                    L_0x002e:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                        throw r7
                    L_0x0039:
                        kotlin.ResultKt.throwOnFailure(r8)
                        d14.g r8 = r6.f294451d
                        java.lang.Boolean r7 = (java.lang.Boolean) r7
                        r7.booleanValue()
                        java.lang.Integer r7 = new java.lang.Integer
                        r7.<init>(r5)
                        r2.f294453e = r5
                        java.lang.Object r7 = r8.emit(r7, r2)
                        if (r7 != r3) goto L_0x0054
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                        return r3
                    L_0x0054:
                        rx3.b0 r7 = rx3.C13598b0.f38549a
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: ou2.C100486h.C100494e.C100501c.C100502a.emit(java.lang.Object, wx3.d):java.lang.Object");
                }
            }

            public C100501c(C45252f fVar) {
                this.f294450d = fVar;
            }

            /* renamed from: a */
            public Object mo31880a(C45253g gVar, C15601d dVar) {
                SnsMethodCalculate.markStartTimeMs("collect", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$seekJob$1$invokeSuspend$$inlined$map$2");
                Object a = this.f294450d.mo31880a(new C100502a(gVar), dVar);
                if (a == C15911a.COROUTINE_SUSPENDED) {
                    SnsMethodCalculate.markEndTimeMs("collect", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$seekJob$1$invokeSuspend$$inlined$map$2");
                    return a;
                }
                C13598b0 b0Var = C13598b0.f38549a;
                SnsMethodCalculate.markEndTimeMs("collect", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$seekJob$1$invokeSuspend$$inlined$map$2");
                return b0Var;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C100494e(C100486h hVar, C58085t0<Boolean> t0Var, float f, C8479f0<C53973z1> f0Var, C59741c0 c0Var, C15601d<? super C100494e> dVar) {
            super(2, dVar);
            this.f294428f = hVar;
            this.f294429g = t0Var;
            this.f294430h = f;
            this.f294431i = f0Var;
            this.f294432j = c0Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$seekJob$1");
            C100494e eVar = new C100494e(this.f294428f, this.f294429g, this.f294430h, this.f294431i, this.f294432j, dVar);
            eVar.f294427e = obj;
            SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$seekJob$1");
            return eVar;
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$seekJob$1");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$seekJob$1");
            Object invokeSuspend = ((C100494e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$seekJob$1");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$seekJob$1");
            return invokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            C58097y0<Boolean> completionFlow;
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$seekJob$1");
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f294426d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C0000n0 n0Var = (C0000n0) this.f294427e;
                C100509l f = this.f294428f.mo139955f();
                if (f == null || (completionFlow = f.getCompletionFlow()) == null) {
                    C13598b0 b0Var = C13598b0.f38549a;
                    SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$seekJob$1");
                    return b0Var;
                }
                C45252f[] fVarArr = {new C100498b(new C58063m0(completionFlow)), new C100501c(this.f294429g)};
                int i2 = C58031e0.f165996a;
                C58496n nVar = new C58496n(C110823p.m151005u(fVarArr), C66217g.f190253d, -2, C54624g.SUSPEND);
                C100495a aVar2 = new C100495a(this.f294428f, this.f294430h, this.f294431i, n0Var, this.f294432j, this.f294429g);
                this.f294426d = 1;
                if (nVar.mo31880a(aVar2, this) == aVar) {
                    SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$seekJob$1");
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$seekJob$1");
                throw illegalStateException;
            }
            C13598b0 b0Var2 = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$seekJob$1");
            return b0Var2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100486h(C100509l lVar, C100508k kVar, C100509l lVar2, C0000n0 n0Var, C58085t0<Boolean> t0Var, C58085t0<C100464b.C100466b> t0Var2, SnsInfo snsInfo, C32228q<? super C100397a, ? super AdClickActionInfo, ? super SnsInfo, C13598b0> qVar, C100413l lVar3, C101804kv2 kv22, C98963o oVar, Object obj) {
        super(lVar, kVar, lVar2, n0Var, t0Var, t0Var2, snsInfo, qVar, lVar3, kv22, oVar, obj);
        int i;
        C87412m.m108594g(t0Var, "restartPlayFlow");
        C87412m.m108594g(t0Var2, "playCommandFlow");
        C87412m.m108594g(qVar, "setClickArea");
        boolean z = obj instanceof C100488b;
        C100488b bVar = null;
        C100488b bVar2 = z ? (C100488b) obj : null;
        int i2 = 0;
        if (bVar2 != null) {
            SnsMethodCalculate.markStartTimeMs("getVideoPlayTotalTimeMs", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$PlayReportInfo");
            long j = bVar2.f294392a;
            SnsMethodCalculate.markEndTimeMs("getVideoPlayTotalTimeMs", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$PlayReportInfo");
            i = (int) j;
        } else {
            i = 0;
        }
        this.f294389p = i;
        bVar = z ? (C100488b) obj : bVar;
        if (bVar != null) {
            SnsMethodCalculate.markStartTimeMs("getVideoPlayCount", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$PlayReportInfo");
            i2 = bVar.f294393b;
            SnsMethodCalculate.markEndTimeMs("getVideoPlayCount", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$PlayReportInfo");
        }
        this.f294390q = i2;
    }

    /* renamed from: m */
    public static final /* synthetic */ int m131525m(C100486h hVar) {
        SnsMethodCalculate.markStartTimeMs("access$getVideoPlayTotalTimeMs$p", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController");
        int i = hVar.f294389p;
        SnsMethodCalculate.markEndTimeMs("access$getVideoPlayTotalTimeMs$p", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController");
        return i;
    }

    /* renamed from: n */
    public static final /* synthetic */ boolean m131526n(C100486h hVar) {
        SnsMethodCalculate.markStartTimeMs("access$isFirstPlayed$p", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController");
        boolean z = hVar.f294386m;
        SnsMethodCalculate.markEndTimeMs("access$isFirstPlayed$p", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController");
        return z;
    }

    /* renamed from: o */
    public static final /* synthetic */ void m131527o(C100486h hVar, int i) {
        SnsMethodCalculate.markStartTimeMs("access$setVideoPlayTotalTimeMs$p", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController");
        hVar.f294389p = i;
        SnsMethodCalculate.markEndTimeMs("access$setVideoPlayTotalTimeMs$p", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController");
    }

    /* renamed from: p */
    public static final C53973z1 m131528p(C0000n0 n0Var, C100486h hVar, C59741c0 c0Var, float f, C58085t0 t0Var) {
        SnsMethodCalculate.markStartTimeMs("access$startProcessCommandFlow$reseekBreakVideo", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController");
        SnsMethodCalculate.markStartTimeMs("startProcessCommandFlow$reseekBreakVideo", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController");
        C53973z1 d = C53895h.m60466d(n0Var, (C66212f) null, (C53934p0) null, new C100506j(hVar, c0Var, f, t0Var, (C15601d<? super C100506j>) null), 3, (Object) null);
        SnsMethodCalculate.markEndTimeMs("startProcessCommandFlow$reseekBreakVideo", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController");
        SnsMethodCalculate.markEndTimeMs("access$startProcessCommandFlow$reseekBreakVideo", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController");
        return d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        r7 = r7.mo139877b();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo139951a(os2.C100413l r7) {
        /*
            r6 = this;
            java.lang.String r0 = "addCurrentVideoTotalTimes"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            boolean r2 = r6.f294388o
            if (r2 == 0) goto L_0x004d
            boolean r2 = r6.f294386m
            r3 = 0
            if (r2 == 0) goto L_0x003d
            if (r7 == 0) goto L_0x0022
            os2.s r7 = r7.mo139877b()
            if (r7 == 0) goto L_0x0022
            float r7 = r7.mo139880a()
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            goto L_0x0027
        L_0x0022:
            r7 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
        L_0x0027:
            int r2 = r6.f294389p
            ou2.l r5 = r6.mo139955f()
            if (r5 == 0) goto L_0x0033
            long r3 = r5.getCurrentPosInMills()
        L_0x0033:
            int r4 = (int) r3
            int r7 = r7.intValue()
            int r4 = r4 - r7
            int r2 = r2 + r4
            r6.f294389p = r2
            goto L_0x004d
        L_0x003d:
            int r7 = r6.f294389p
            ou2.l r2 = r6.mo139955f()
            if (r2 == 0) goto L_0x0049
            long r3 = r2.getCurrentPosInMills()
        L_0x0049:
            int r2 = (int) r3
            int r7 = r7 + r2
            r6.f294389p = r7
        L_0x004d:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ou2.C100486h.mo139951a(os2.l):void");
    }

    /* renamed from: j */
    public void mo139959j() {
        SnsMethodCalculate.markStartTimeMs("onClear", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController");
        this.f294386m = false;
        this.f294387n = false;
        this.f294388o = false;
        C100488b bVar = new C100488b((long) this.f294389p, this.f294390q);
        SnsMethodCalculate.markStartTimeMs("setStoredData", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AbstractScheduleVideoController");
        this.f294300l = bVar;
        SnsMethodCalculate.markEndTimeMs("setStoredData", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AbstractScheduleVideoController");
        SnsMethodCalculate.markEndTimeMs("onClear", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController");
    }

    /* renamed from: k */
    public void mo139960k(SnsInfo snsInfo) {
        float f;
        SnsMethodCalculate.markStartTimeMs("reportBreakFrameInfo", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController");
        if (snsInfo == null) {
            SnsMethodCalculate.markEndTimeMs("reportBreakFrameInfo", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController");
            return;
        }
        try {
            C95301a aVar = snsInfo.getAdXml().adBreakFrameInfo;
            if (aVar != null) {
                C100397a b = aVar.mo132013b();
                if (b != null) {
                    C95301a aVar2 = snsInfo.getAdXml().adBreakFrameInfo;
                    if (aVar2 != null) {
                        C100413l a = aVar2.mo132012a();
                        if (a != null) {
                            SnsMethodCalculate.markStartTimeMs("getCurrentBreakVideoMedia", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AbstractScheduleVideoController");
                            C101804kv2 kv22 = this.f294298j;
                            SnsMethodCalculate.markEndTimeMs("getCurrentBreakVideoMedia", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AbstractScheduleVideoController");
                            if (kv22 == null) {
                                SnsMethodCalculate.markEndTimeMs("reportBreakFrameInfo", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController");
                                return;
                            }
                            mo139951a(a);
                            float a2 = a.mo139877b().mo139880a();
                            float f2 = kv22.f298684R;
                            if (f2 > 0.0f) {
                                f = f2 * 1000.0f;
                            } else {
                                C100509l f3 = mo139955f();
                                f = (float) (f3 != null ? f3.getDurationMs() : 0);
                            }
                            C100418s b2 = a.mo139877b();
                            b2.getClass();
                            SnsMethodCalculate.markStartTimeMs("getLoopEndTime", "com.tencent.mm.plugin.sns.storage.PlayModeInfo");
                            float f4 = b2.f294180d;
                            SnsMethodCalculate.markEndTimeMs("getLoopEndTime", "com.tencent.mm.plugin.sns.storage.PlayModeInfo");
                            float min = f4 > 0.0f ? Math.min(f4, f) : f;
                            C98963o h = mo139957h();
                            int i = 0;
                            int i2 = (h != null ? h.f290131k : 0) == 0 ? 1 : 2;
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("snsid", C102236a0.m134765q0(snsInfo.field_snsId));
                            jSONObject.put("uxinfo", snsInfo.getUxinfo());
                            jSONObject.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, i2);
                            String str = snsInfo.getAdXml().adExtInfo;
                            if (str == null) {
                                str = "";
                            }
                            jSONObject.put("adExtInfo", str);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject.put("extInfo", jSONObject2);
                            jSONObject2.put("videoDuration", Float.valueOf(f));
                            C100413l d = mo139953d();
                            jSONObject2.put("videoCompositeType", d != null ? d.mo139878c() : 0);
                            SnsMethodCalculate.markStartTimeMs("getClickStartTime", "com.tencent.mm.plugin.sns.storage.AdBreakFrameClickInfo");
                            float f5 = b.f294079e;
                            SnsMethodCalculate.markEndTimeMs("getClickStartTime", "com.tencent.mm.plugin.sns.storage.AdBreakFrameClickInfo");
                            jSONObject2.put("clickAreaStartTime", Float.valueOf(f5));
                            jSONObject2.put("loopStartTime", Float.valueOf(a2));
                            jSONObject2.put("loopEndTime", Float.valueOf(min));
                            int i3 = this.f294389p;
                            if (i3 >= 0) {
                                i = i3;
                            }
                            jSONObject2.put("videoPlayTotalTime", i);
                            jSONObject2.put("videoPlayCount", this.f294390q);
                            String jSONObject3 = jSONObject.toString();
                            C87412m.m108593f(jSONObject3, "obj.toString()");
                            Log.m105918d("CycleScheduleVideoController", "sns_ad_break_frame_report:" + jSONObject3);
                            C102260r.m134858a("sns_ad_break_frame_report", jSONObject3);
                            SnsMethodCalculate.markEndTimeMs("reportBreakFrameInfo", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController");
                            return;
                        }
                    }
                    SnsMethodCalculate.markEndTimeMs("reportBreakFrameInfo", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController");
                    return;
                }
            }
            SnsMethodCalculate.markEndTimeMs("reportBreakFrameInfo", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController");
        } catch (Exception e) {
            Log.m105920e("CycleScheduleVideoController", "sns_ad_break_frame_report, exp=" + e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
        r2 = (r2 = (r2 = r2.getAdXml()).adBreakFrameInfo).mo132012a();
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo139961l() {
        /*
            r26 = this;
            java.lang.String r0 = "startProcessCommandFlow"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            com.tencent.mm.plugin.sns.storage.SnsInfo r2 = r26.mo139958i()
            r3 = 0
            if (r2 == 0) goto L_0x0025
            com.tencent.mm.plugin.sns.storage.ADXml r2 = r2.getAdXml()
            if (r2 == 0) goto L_0x0025
            com.tencent.mm.plugin.sns.storage.a r2 = r2.adBreakFrameInfo
            if (r2 == 0) goto L_0x0025
            os2.l r2 = r2.mo132012a()
            if (r2 == 0) goto L_0x0025
            os2.s r2 = r2.mo139877b()
            r9 = r2
            goto L_0x0026
        L_0x0025:
            r9 = r3
        L_0x0026:
            com.tencent.mm.plugin.sns.storage.SnsInfo r2 = r26.mo139958i()
            if (r2 == 0) goto L_0x003c
            com.tencent.mm.plugin.sns.storage.ADXml r2 = r2.getAdXml()
            if (r2 == 0) goto L_0x003c
            com.tencent.mm.plugin.sns.storage.a r2 = r2.adBreakFrameInfo
            if (r2 == 0) goto L_0x003c
            os2.a r2 = r2.mo132013b()
            r6 = r2
            goto L_0x003d
        L_0x003c:
            r6 = r3
        L_0x003d:
            com.tencent.mm.plugin.sns.storage.SnsInfo r2 = r26.mo139958i()
            if (r2 == 0) goto L_0x0061
            com.tencent.mm.plugin.sns.storage.ADXml r2 = r2.getAdXml()
            if (r2 == 0) goto L_0x0061
            com.tencent.mm.plugin.sns.storage.a r2 = r2.adBreakFrameInfo
            if (r2 == 0) goto L_0x0061
            os2.a r2 = r2.mo132013b()
            if (r2 == 0) goto L_0x0061
            java.lang.String r4 = "getClickActionInfo"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.storage.AdBreakFrameClickInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r2 = r2.f294081g
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            r7 = r2
            goto L_0x0062
        L_0x0061:
            r7 = r3
        L_0x0062:
            r2 = 0
            if (r9 == 0) goto L_0x006b
            float r4 = r9.mo139880a()
            r8 = r4
            goto L_0x006c
        L_0x006b:
            r8 = 0
        L_0x006c:
            gy3.c0 r17 = new gy3.c0
            r17.<init>()
            if (r9 == 0) goto L_0x0080
            java.lang.String r2 = "getStartOffset"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.storage.PlayModeInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r4)
            float r5 = r9.f294178b
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r4)
            r2 = r5
        L_0x0080:
            r4 = 7
            r5 = 0
            d14.t0 r18 = d14.C58017a1.m67173b(r5, r5, r3, r4, r3)
            gy3.f0 r19 = new gy3.f0
            r19.<init>()
            a14.n0 r10 = r26.mo139954e()
            if (r10 == 0) goto L_0x00a0
            r11 = 0
            r12 = 0
            ou2.h$d r13 = new ou2.h$d
            r5 = r26
            r13.<init>(r5, r8, r3)
            r14 = 3
            r15 = 0
            a14.C53895h.m60466d(r10, r11, r12, r13, r14, r15)
            goto L_0x00a2
        L_0x00a0:
            r5 = r26
        L_0x00a2:
            a14.n0 r20 = r26.mo139954e()
            if (r20 == 0) goto L_0x00c5
            r21 = 0
            r22 = 0
            ou2.h$e r23 = new ou2.h$e
            r16 = 0
            r10 = r23
            r11 = r26
            r12 = r18
            r13 = r8
            r14 = r19
            r15 = r17
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r24 = 3
            r25 = 0
            a14.C53895h.m60466d(r20, r21, r22, r23, r24, r25)
        L_0x00c5:
            a14.n0 r3 = r26.mo139954e()
            if (r3 == 0) goto L_0x00ec
            r15 = 0
            r16 = 0
            ou2.h$c r20 = new ou2.h$c
            r14 = 0
            r4 = r20
            r5 = r26
            r12 = r8
            r8 = r19
            r10 = r17
            r11 = r2
            r13 = r18
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r14 = 3
            r2 = 0
            r10 = r3
            r11 = r15
            r12 = r16
            r13 = r20
            r15 = r2
            a14.C53895h.m60466d(r10, r11, r12, r13, r14, r15)
        L_0x00ec:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ou2.C100486h.mo139961l():void");
    }
}
