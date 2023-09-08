package a33;

import a14.C0000n0;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53959v2;
import a14.C53973z1;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.vfs.C86013q1;
import fh2.C97882i;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h90.C98324b;
import hi2.C98453h;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import lh2.C109344g0;
import qh2.C101198e;
import rx3.C13598b0;
import th2.C101891f;
import th2.C110992d;
import wh2.C102446b;
import wx3.C15601d;
import wx3.C66212f;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: a33.h */
public final class C91957h implements C109344g0 {

    /* renamed from: d */
    public Context f263272d;

    /* renamed from: e */
    public C98324b f263273e;

    /* renamed from: f */
    public RecordConfigProvider f263274f;

    /* renamed from: g */
    public C102446b f263275g;

    /* renamed from: h */
    public boolean f263276h = true;

    /* renamed from: i */
    public C97882i f263277i;

    /* renamed from: j */
    public C97882i.C97883a f263278j = new C97882i.C97883a(0, 0, 0, 0, 0, 0, 0, 0, false, false, 0, 0, 0, 8191, (C8480h) null);

    /* renamed from: n */
    public VideoTransPara f263279n;

    /* renamed from: o */
    public boolean f263280o;

    /* renamed from: p */
    public boolean f263281p;

    /* renamed from: q */
    public final C0000n0 f263282q = C53930o0.m60561h(C53930o0.m60555b(), C53959v2.m60598a((C53973z1) null, 1, (Object) null));

    /* renamed from: r */
    public C53973z1 f263283r;

    /* renamed from: s */
    public String f263284s = "";

    @C91590f(mo125468c = "com.tencent.mm.plugin.vlog.ui.video.VideoCompositionRemuxPlugin$startReMux$1", mo125469f = "VideoCompositionRemuxPlugin.kt", mo125470l = {136}, mo125471m = "invokeSuspend")
    /* renamed from: a33.h$a */
    public static final class C91958a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f263285d;

        /* renamed from: e */
        public Object f263286e;

        /* renamed from: f */
        public int f263287f;

        /* renamed from: g */
        public final /* synthetic */ C91957h f263288g;

        /* renamed from: h */
        public final /* synthetic */ C97882i f263289h;

        /* renamed from: i */
        public final /* synthetic */ C91954f f263290i;

        /* renamed from: a33.h$a$a */
        public static final class C91959a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C91957h f263291d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C91959a(C91957h hVar) {
                super(0);
                this.f263291d = hVar;
            }

            public Object invoke() {
                Log.m105920e("MicroMsg.VideoCompositionRemuxPlugin", "notice: configProvider is null  " + this.f263291d.f263276h + "  " + this.f263291d.f263274f);
                C101891f.f300035a.mo141379m(2000);
                this.f263291d.mo125816d(2000);
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C91958a(C91957h hVar, C97882i iVar, C91954f fVar, C15601d<? super C91958a> dVar) {
            super(2, dVar);
            this.f263288g = hVar;
            this.f263289h = iVar;
            this.f263290i = fVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C91958a(this.f263288g, this.f263289h, this.f263290i, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C91958a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:45:0x026c  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x0285  */
        /* JADX WARNING: Removed duplicated region for block: B:81:0x035e  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r29) {
            /*
                r28 = this;
                r0 = r28
                xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
                int r2 = r0.f263287f
                r3 = 1
                r4 = 2
                r6 = 0
                java.lang.String r7 = "MicroMsg.VideoCompositionRemuxPlugin"
                if (r2 == 0) goto L_0x0022
                if (r2 != r3) goto L_0x001a
                java.lang.Object r1 = r0.f263286e
                a33.h r1 = (a33.C91957h) r1
                kotlin.ResultKt.throwOnFailure(r29)
                r4 = r29
                goto L_0x0213
            L_0x001a:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x0022:
                kotlin.ResultKt.throwOnFailure(r29)
                a33.h r2 = r0.f263288g
                com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r8 = r2.f263274f
                if (r8 == 0) goto L_0x0061
                int r9 = r8.f272905F
                if (r9 == r4) goto L_0x0031
                if (r9 != r3) goto L_0x0061
            L_0x0031:
                fh2.e r10 = fh2.C32051e.f85290a
                boolean r9 = r10.mo58472c(r6, r9)
                r2.f263280o = r9
                int r8 = r8.f272905F
                boolean r8 = r10.mo58472c(r3, r8)
                r2.f263281p = r8
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r9 = "checkHevcEncode, exportHevcHard:"
                r8.append(r9)
                boolean r9 = r2.f263280o
                r8.append(r9)
                java.lang.String r9 = ", exportHevcSoft:"
                r8.append(r9)
                boolean r2 = r2.f263281p
                r8.append(r2)
                java.lang.String r2 = r8.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r2)
            L_0x0061:
                java.lang.String r2 = "startReMux !!!!"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r2)
                a33.h r2 = r0.f263288g
                a33.h$a$a r8 = new a33.h$a$a
                r8.<init>(r2)
                com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r9 = r2.f263274f
                if (r9 == 0) goto L_0x0076
                com.tencent.mm.modelcontrol.VideoTransPara r9 = r9.f272926n
                if (r9 != 0) goto L_0x007a
            L_0x0076:
                r8.invoke()
                r2 = 0
            L_0x007a:
                if (r2 == 0) goto L_0x0396
                fh2.i r15 = r0.f263289h
                a33.f r14 = r0.f263290i
                r2.f263277i = r15
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                f40.o r10 = f40.C86709a0.m107535s()
                java.lang.String r10 = r10.f251807e
                r9.append(r10)
                java.lang.String r10 = "mediaOpt/remux/tempVideo/"
                r9.append(r10)
                java.lang.String r9 = r9.toString()
                r8.append(r9)
                long r9 = java.lang.System.currentTimeMillis()
                r8.append(r9)
                java.lang.String r8 = r8.toString()
                r2.f263284s = r8
                f40.e r8 = f40.C86709a0.m107523b()
                r8.mo121111i()
                com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
                com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r8 = r2.f263274f
                h90.b r9 = r2.f263273e
                fh2.i$a r8 = r15.mo137203a(r8, r9)
                java.lang.String r9 = "<set-?>"
                gy3.C87412m.m108594g(r8, r9)
                r2.f263278j = r8
                wh2.b r8 = new wh2.b
                r8.<init>()
                r2.f263275g = r8
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r9 = "configProvider : "
                r8.append(r9)
                com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r9 = r2.f263274f
                r8.append(r9)
                java.lang.String r8 = r8.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r8)
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r9 = "RemuxMediaEditConfig : "
                r8.append(r9)
                r8.append(r15)
                java.lang.String r8 = r8.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r8)
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r9 = "mediaCaptureInfo : "
                r8.append(r9)
                h90.b r9 = r2.f263273e
                r8.append(r9)
                java.lang.String r8 = r8.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r8)
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r9 = "generateTargetConfig info: "
                r8.append(r9)
                fh2.i$a r9 = r2.f263278j
                r8.append(r9)
                r9 = 32
                r8.append(r9)
                java.lang.String r8 = r8.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r8)
                th2.d r8 = th2.C110992d.f332425a
                fh2.i$a r9 = r2.f263278j
                boolean r9 = r9.f287160j
                java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
                java.lang.String r10 = "KEY_VIDEO_IS_EDITED_BOOLEAN"
                r8.mo162677k(r10, r9)
                com.tencent.mm.plugin.report.service.n r8 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r17 = 985(0x3d9, double:4.867E-321)
                r19 = 139(0x8b, double:6.87E-322)
                r21 = 1
                r23 = 0
                r16 = r8
                r16.idkeyStat(r17, r19, r21, r23)
                fh2.i$a r9 = r2.f263278j
                boolean r9 = r9.f287160j
                if (r9 == 0) goto L_0x015c
                r17 = 985(0x3d9, double:4.867E-321)
                r19 = 138(0x8a, double:6.8E-322)
                r21 = 1
                r23 = 0
                r16 = r8
                r16.idkeyStat(r17, r19, r21, r23)
            L_0x015c:
                java.util.ArrayList r8 = new java.util.ArrayList
                r8.<init>()
                android.os.Bundle r9 = new android.os.Bundle
                r9.<init>()
                com.tencent.mm.modelcontrol.VideoTransPara r10 = r2.f263279n
                if (r10 == 0) goto L_0x016d
                int r10 = r10.f267169g
                goto L_0x016e
            L_0x016d:
                r10 = 0
            L_0x016e:
                java.lang.String r11 = "KEY_EXPORT_TARGET_VIDEO_BITRATE"
                r9.putInt(r11, r10)
                boolean r10 = r2.f263281p
                java.lang.String r11 = "KEY_EXPORT_HEVC_SOFT"
                r9.putBoolean(r11, r10)
                boolean r10 = r2.f263280o
                java.lang.String r11 = "KEY_EXPORT_HEVC_HARD"
                r9.putBoolean(r11, r10)
                java.lang.String r10 = r2.f263284s
                java.lang.String r11 = "KEY_EXPORT_TEMP_PATH"
                r9.putString(r11, r10)
                b62.b r13 = new b62.b
                r13.<init>(r8, r9)
                c33.f r12 = new c33.f
                fh2.i$a r9 = r2.f263278j
                h90.b r10 = r2.f263273e
                com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r11 = r2.f263274f
                r16 = 0
                r8 = r12
                r6 = r12
                r12 = r16
                r4 = r13
                r13 = r15
                r8.<init>(r9, r10, r11, r12, r13)
                c33.g r13 = new c33.g
                fh2.i$a r9 = r2.f263278j
                h90.b r11 = r2.f263273e
                com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r12 = r2.f263274f
                android.content.Context r10 = r2.f263272d
                wh2.b r8 = r2.f263275g
                r16 = r8
                r8 = r13
                r19 = r10
                r10 = r15
                r5 = r13
                r13 = r19
                r19 = r14
                r14 = r16
                r8.<init>(r9, r10, r11, r12, r13, r14)
                r6.mo137401b(r5)
                c33.c r5 = new c33.c
                fh2.i$a r9 = r2.f263278j
                h90.b r10 = r2.f263273e
                com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r11 = r2.f263274f
                r12 = 0
                android.content.Context r13 = r2.f263272d
                wh2.b r14 = r2.f263275g
                r8 = r5
                r21 = r15
                r15 = r19
                r16 = r21
                r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
                r6.mo137401b(r5)
                c33.i r5 = new c33.i
                fh2.i$a r9 = r2.f263278j
                h90.b r10 = r2.f263273e
                com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r11 = r2.f263274f
                android.content.Context r13 = r2.f263272d
                wh2.b r14 = r2.f263275g
                r8 = r5
                r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
                r6.mo137401b(r5)
                b62.c r5 = new b62.c
                com.tencent.mm.modelcontrol.VideoTransPara r8 = r2.f263279n
                gy3.C87412m.m108591d(r8)
                java.util.ArrayList r24 = new java.util.ArrayList
                r24.<init>()
                r25 = 0
                r26 = 4
                r27 = 0
                r22 = r5
                r23 = r8
                r22.<init>(r23, r24, r25, r26, r27)
                r0.f263285d = r2
                r0.f263286e = r2
                r0.f263287f = r3
                java.lang.Object r4 = r6.mo137400a(r4, r5, r0)
                if (r4 != r1) goto L_0x0212
                return r1
            L_0x0212:
                r1 = r2
            L_0x0213:
                com.tencent.mm.plugin.mediabasic.data.MediaErrorInfo r4 = (com.tencent.p014mm.plugin.mediabasic.data.MediaErrorInfo) r4
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r5 = "remux finish >> code: "
                r2.append(r5)
                int r5 = r4.f272117e
                r2.append(r5)
                java.lang.String r5 = ", msg: "
                r2.append(r5)
                java.lang.String r5 = r4.f272118f
                r2.append(r5)
                java.lang.String r2 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r2)
                android.content.Context r2 = r1.f263272d
                boolean r5 = r2 instanceof android.app.Activity
                if (r5 == 0) goto L_0x0277
                java.lang.String r5 = "null cannot be cast to non-null type android.app.Activity"
                gy3.C87412m.m108592e(r2, r5)
                android.app.Activity r2 = (android.app.Activity) r2
                boolean r2 = r2.isFinishing()
                if (r2 != 0) goto L_0x0277
                android.content.Context r2 = r1.f263272d
                gy3.C87412m.m108592e(r2, r5)
                android.app.Activity r2 = (android.app.Activity) r2
                boolean r2 = r2.isDestroyed()
                if (r2 != 0) goto L_0x0277
                wh2.b r2 = r1.f263275g
                if (r2 == 0) goto L_0x0269
                qo3.i0 r2 = r2.f301696a
                if (r2 == 0) goto L_0x0264
                boolean r2 = r2.isShowing()
                goto L_0x0265
            L_0x0264:
                r2 = 0
            L_0x0265:
                if (r2 != r3) goto L_0x0269
                r6 = 1
                goto L_0x026a
            L_0x0269:
                r6 = 0
            L_0x026a:
                if (r6 == 0) goto L_0x0277
                wh2.b r2 = r1.f263275g
                if (r2 == 0) goto L_0x0273
                r2.mo142014a()
            L_0x0273:
                r2 = 0
                r1.f263275g = r2
                goto L_0x0278
            L_0x0277:
                r2 = 0
            L_0x0278:
                th2.f r5 = th2.C101891f.f300035a
                int r6 = r4.f272117e
                r5.mo141379m(r6)
                int r4 = r4.f272117e
                r8 = 1
                if (r4 == 0) goto L_0x035e
                if (r4 == r3) goto L_0x032b
                r6 = 2
                if (r4 == r6) goto L_0x0310
                r6 = 3
                if (r4 == r6) goto L_0x02f3
                r3 = 4
                if (r4 == r3) goto L_0x02b7
                r2 = 1002(0x3ea, float:1.404E-42)
                if (r4 == r2) goto L_0x029d
                r2 = 1003(0x3eb, float:1.406E-42)
                if (r4 == r2) goto L_0x029d
                switch(r4) {
                    case 1007: goto L_0x029d;
                    case 1008: goto L_0x029d;
                    case 1009: goto L_0x029d;
                    default: goto L_0x029b;
                }
            L_0x029b:
                goto L_0x0396
            L_0x029d:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "remux is error. code: "
                r2.append(r3)
                r2.append(r4)
                java.lang.String r2 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r2)
                r1.mo125816d(r4)
                goto L_0x0396
            L_0x02b7:
                java.lang.String r3 = "Background remux code return"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r3)
                com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel r3 = new com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel
                java.lang.Boolean r9 = java.lang.Boolean.TRUE
                com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r4 = r1.f263274f
                if (r4 == 0) goto L_0x02c8
                java.lang.String r5 = r4.f272901B
                r10 = r5
                goto L_0x02c9
            L_0x02c8:
                r10 = r2
            L_0x02c9:
                gy3.C87412m.m108591d(r4)
                java.lang.String r11 = r4.f272902C
                fh2.i r2 = r1.f263277i
                gy3.C87412m.m108591d(r2)
                int r2 = r2.f287147g
                fh2.i r4 = r1.f263277i
                gy3.C87412m.m108591d(r4)
                int r4 = r4.f287146f
                int r2 = r2 - r4
                long r4 = (long) r2
                java.lang.Long r12 = java.lang.Long.valueOf(r4)
                java.lang.Boolean r13 = java.lang.Boolean.FALSE
                th2.d r2 = th2.C110992d.f332425a
                com.tencent.mm.plugin.recordvideo.jumper.RecordMediaReportInfo r14 = r2.mo162676j()
                r8 = r3
                r8.<init>(r9, r10, r11, r12, r13, r14)
                r1.mo125813a(r3)
                goto L_0x0396
            L_0x02f3:
                com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel r2 = r1.mo125814b()
                if (r2 != 0) goto L_0x0308
                java.lang.String r2 = "error third party video handleNoNeedRemuxVideoFile"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r2)
                r2 = 1005(0x3ed, float:1.408E-42)
                r5.mo141379m(r2)
                r1.mo125816d(r2)
                goto L_0x0396
            L_0x0308:
                r5.mo141375i(r3, r8)
                r1.mo125813a(r2)
                goto L_0x0396
            L_0x0310:
                com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel r2 = r1.mo125814b()
                if (r2 != 0) goto L_0x0324
                java.lang.String r2 = "error check jump video handleNoNeedRemuxVideoFile"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r2)
                r2 = 1006(0x3ee, float:1.41E-42)
                r5.mo141379m(r2)
                r1.mo125816d(r2)
                goto L_0x0396
            L_0x0324:
                r5.mo141375i(r3, r8)
                r1.mo125813a(r2)
                goto L_0x0396
            L_0x032b:
                com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r2 = r1.f263274f
                if (r2 == 0) goto L_0x0396
                r5.mo141375i(r3, r8)
                com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel r3 = new com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel
                java.lang.Boolean r11 = java.lang.Boolean.TRUE
                java.lang.String r12 = r2.f272901B
                java.lang.String r13 = r2.f272902C
                h90.b r2 = r1.f263273e
                gy3.C87412m.m108591d(r2)
                int r2 = r2.f288188i
                h90.b r4 = r1.f263273e
                gy3.C87412m.m108591d(r4)
                int r4 = r4.f288187h
                int r2 = r2 - r4
                long r4 = (long) r2
                java.lang.Long r14 = java.lang.Long.valueOf(r4)
                java.lang.Boolean r15 = java.lang.Boolean.FALSE
                th2.d r2 = th2.C110992d.f332425a
                com.tencent.mm.plugin.recordvideo.jumper.RecordMediaReportInfo r16 = r2.mo162676j()
                r10 = r3
                r10.<init>(r11, r12, r13, r14, r15, r16)
                r1.mo125813a(r3)
                goto L_0x0396
            L_0x035e:
                r5.mo141375i(r3, r8)
                com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel r2 = new com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel
                java.lang.Boolean r5 = java.lang.Boolean.TRUE
                com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r3 = r1.f263274f
                gy3.C87412m.m108591d(r3)
                java.lang.String r6 = r3.f272901B
                com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r3 = r1.f263274f
                gy3.C87412m.m108591d(r3)
                java.lang.String r7 = r3.f272902C
                fh2.i r3 = r1.f263277i
                gy3.C87412m.m108591d(r3)
                int r3 = r3.f287147g
                fh2.i r4 = r1.f263277i
                gy3.C87412m.m108591d(r4)
                int r4 = r4.f287146f
                int r3 = r3 - r4
                long r3 = (long) r3
                java.lang.Long r8 = java.lang.Long.valueOf(r3)
                java.lang.Boolean r9 = java.lang.Boolean.FALSE
                th2.d r3 = th2.C110992d.f332425a
                com.tencent.mm.plugin.recordvideo.jumper.RecordMediaReportInfo r10 = r3.mo162676j()
                r4 = r2
                r4.<init>(r5, r6, r7, r8, r9, r10)
                r1.mo125813a(r2)
            L_0x0396:
                rx3.b0 r1 = rx3.C13598b0.f38549a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: a33.C91957h.C91958a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C91957h(Context context, C101198e eVar) {
        Context context2 = context;
        C87412m.m108594g(context2, "context");
        this.f263272d = context2;
    }

    /* renamed from: a */
    public final void mo125813a(CaptureDataManager.CaptureVideoNormalModel captureVideoNormalModel) {
        MultiProcessMMKV.getSingleDefault().putBoolean("mediacodec_create_error", false);
        CaptureDataManager.f272890c.mo129794a(this.f263272d, captureVideoNormalModel);
    }

    /* renamed from: b */
    public final CaptureDataManager.CaptureVideoNormalModel mo125814b() {
        RecordConfigProvider recordConfigProvider = this.f263274f;
        if (recordConfigProvider == null) {
            return null;
        }
        C98324b bVar = this.f263273e;
        boolean z = false;
        if (bVar != null && bVar.f288182c) {
            int i = recordConfigProvider.f272905F;
            if (i == 2) {
                C115669n.INSTANCE.idkeyStat(985, 135, 1, false);
            } else if (i == 1) {
                C115669n.INSTANCE.idkeyStat(985, 136, 1, false);
            }
            C98453h.f288774a.mo137816n(this.f263274f, true);
            C91956g gVar = C91956g.f263271a;
            String str = recordConfigProvider.f272901B;
            C87412m.m108593f(str, "this.outputVideoPath");
            String str2 = recordConfigProvider.f272902C;
            C87412m.m108593f(str2, "this.thumbPath");
            gVar.mo125811a(str, str2, recordConfigProvider.f272926n.f267179t);
            String str3 = recordConfigProvider.f272901B;
            C87412m.m108593f(str3, "this.outputVideoPath");
            gVar.mo125812b(str3);
            C98324b bVar2 = this.f263273e;
            if (bVar2 != null) {
                CaptureDataManager.f272890c.f272892b.putBoolean("key_is_capture_video", bVar2.f288182c);
                Bundle bundle = CaptureDataManager.f272890c.f272892b;
                ArrayList<String> arrayList = bVar2.f288190k;
                if (arrayList == null || arrayList.isEmpty()) {
                    z = true;
                }
                bundle.putBoolean("key_is_photo_video", !z);
            }
            Boolean bool = Boolean.TRUE;
            String str4 = recordConfigProvider.f272901B;
            String str5 = recordConfigProvider.f272902C;
            C97882i iVar = this.f263277i;
            C87412m.m108591d(iVar);
            int i2 = iVar.f287147g;
            C97882i iVar2 = this.f263277i;
            C87412m.m108591d(iVar2);
            return new CaptureDataManager.CaptureVideoNormalModel(bool, str4, str5, Long.valueOf((long) (i2 - iVar2.f287146f)), Boolean.FALSE, C110992d.f332425a.mo162676j());
        }
        C91956g gVar2 = C91956g.f263271a;
        C87412m.m108591d(bVar);
        String str6 = bVar.f288180a;
        String str7 = recordConfigProvider.f272902C;
        C87412m.m108593f(str7, "this.thumbPath");
        gVar2.mo125811a(str6, str7, recordConfigProvider.f272926n.f267179t);
        C98324b bVar3 = this.f263273e;
        C87412m.m108591d(bVar3);
        String str8 = bVar3.f288180a;
        RecordConfigProvider recordConfigProvider2 = this.f263274f;
        C87412m.m108591d(recordConfigProvider2);
        C86013q1.m106442c(str8, recordConfigProvider2.f272901B);
        RecordConfigProvider recordConfigProvider3 = this.f263274f;
        C87412m.m108591d(recordConfigProvider3);
        String str9 = recordConfigProvider3.f272901B;
        C87412m.m108593f(str9, "configProvider!!.outputVideoPath");
        gVar2.mo125812b(str9);
        C98324b bVar4 = this.f263273e;
        if (bVar4 != null) {
            CaptureDataManager.f272890c.f272892b.putBoolean("key_is_capture_video", bVar4.f288182c);
            Bundle bundle2 = CaptureDataManager.f272890c.f272892b;
            ArrayList<String> arrayList2 = bVar4.f288190k;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                z = true;
            }
            bundle2.putBoolean("key_is_photo_video", !z);
        }
        Boolean bool2 = Boolean.TRUE;
        RecordConfigProvider recordConfigProvider4 = this.f263274f;
        C87412m.m108591d(recordConfigProvider4);
        String str10 = recordConfigProvider4.f272901B;
        String str11 = recordConfigProvider.f272902C;
        C97882i iVar3 = this.f263277i;
        C87412m.m108591d(iVar3);
        int i3 = iVar3.f287147g;
        C97882i iVar4 = this.f263277i;
        C87412m.m108591d(iVar4);
        return new CaptureDataManager.CaptureVideoNormalModel(bool2, str10, str11, Long.valueOf((long) (i3 - iVar4.f287146f)), Boolean.FALSE, C110992d.f332425a.mo162676j());
    }

    /* renamed from: c */
    public final void mo125815c(C98324b bVar, RecordConfigProvider recordConfigProvider) {
        C87412m.m108594g(bVar, "info");
        C87412m.m108594g(recordConfigProvider, "configProvider");
        this.f263273e = bVar;
        this.f263274f = recordConfigProvider;
        this.f263279n = recordConfigProvider.f272926n;
        C110992d dVar = C110992d.f332425a;
        dVar.mo162677k("KEY_IS_CAPUTRE_BOOLEAN", Boolean.valueOf(bVar.f288182c));
        if (bVar.f288182c) {
            dVar.mo162677k("KEY_CAPUTRE_VIDEO_PATH_STRING", bVar.mo137615e());
            dVar.mo162677k("KEY_CAPUTRE_THUMB_PATH_STRING", bVar.mo137611a() ? bVar.f288181b : bVar.f288186g);
        }
    }

    /* renamed from: d */
    public final void mo125816d(int i) {
        Context context = this.f263272d;
        C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
        ((Activity) context).setResult(i);
        Context context2 = this.f263272d;
        C87412m.m108592e(context2, "null cannot be cast to non-null type android.app.Activity");
        ((Activity) context2).finish();
    }

    /* renamed from: e */
    public boolean mo78564e() {
        return false;
    }

    /* renamed from: f */
    public final void mo125817f(C97882i iVar, C91954f fVar) {
        boolean z;
        C87412m.m108594g(iVar, "editConfig");
        C87412m.m108594g(fVar, "mediaModel");
        if (!this.f263276h) {
            z = true;
        } else {
            z = false;
            this.f263276h = false;
        }
        if (z) {
            Log.m105924i("MicroMsg.VideoCompositionRemuxPlugin", "isRepeat to return");
            return;
        }
        C53973z1 z1Var = this.f263283r;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        this.f263283r = C53895h.m60466d(this.f263282q, (C66212f) null, (C53934p0) null, new C91958a(this, iVar, fVar, (C15601d<? super C91958a>) null), 3, (Object) null);
    }

    public String name() {
        return C91957h.class.getName();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onAttach() {
    }

    public void onDetach() {
    }

    public void onPause() {
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C109344g0.C61280a.m71860a(this, i, strArr, iArr);
    }

    public void onResume() {
    }

    public void release() {
        C53973z1 z1Var = this.f263283r;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
    }

    public void reset() {
    }

    public void setVisibility(int i) {
    }

    /* renamed from: v */
    public void mo78575v(RecordConfigProvider recordConfigProvider) {
        C87412m.m108594g(recordConfigProvider, "configProvider");
    }
}
