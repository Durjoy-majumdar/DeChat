package lh2;

import a14.C0000n0;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53959v2;
import a14.C53973z1;
import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.recordvideo.background.VideoMixer;
import com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sight.base.SightVideoJNI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import fh2.C97882i;
import fy3.C32224a;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h90.C98324b;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.regex.Pattern;
import lh2.C109344g0;
import o40.C61926c;
import rx3.C13598b0;
import th2.C110992d;
import wh2.C102446b;
import wx3.C15601d;
import wx3.C66212f;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;
import zg2.C103021n;
import zg2.C103027q;

/* renamed from: lh2.f1 */
public final class C99431f1 implements C109344g0 {

    /* renamed from: d */
    public Context f291529d;

    /* renamed from: e */
    public C102446b f291530e;

    /* renamed from: f */
    public C98324b f291531f;

    /* renamed from: g */
    public RecordConfigProvider f291532g;

    /* renamed from: h */
    public boolean f291533h = true;

    /* renamed from: i */
    public C97882i f291534i;

    /* renamed from: j */
    public C97882i.C97883a f291535j;

    /* renamed from: n */
    public C32228q<? super String, ? super String, ? super Boolean, C13598b0> f291536n;

    /* renamed from: o */
    public final C0000n0 f291537o;

    /* renamed from: p */
    public C53973z1 f291538p;

    /* renamed from: q */
    public int f291539q;

    @C91590f(mo125468c = "com.tencent.mm.plugin.recordvideo.plugin.RemuxPlugin", mo125469f = "RemuxPlugin.kt", mo125470l = {171}, mo125471m = "checkThirdPartyVideo")
    /* renamed from: lh2.f1$a */
    public static final class C99432a extends C66704d {

        /* renamed from: d */
        public Object f291540d;

        /* renamed from: e */
        public Object f291541e;

        /* renamed from: f */
        public /* synthetic */ Object f291542f;

        /* renamed from: g */
        public final /* synthetic */ C99431f1 f291543g;

        /* renamed from: h */
        public int f291544h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C99432a(C99431f1 f1Var, C15601d<? super C99432a> dVar) {
            super(dVar);
            this.f291543g = f1Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f291542f = obj;
            this.f291544h |= Integer.MIN_VALUE;
            return this.f291543g.mo138870d((C32224a<C13598b0>) null, this);
        }
    }

    /* renamed from: lh2.f1$b */
    public static final class C99433b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C99433b f291545d = new C99433b();

        public C99433b() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return C13598b0.f38549a;
        }
    }

    /* renamed from: lh2.f1$c */
    public static final class C99434c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C99434c f291546d = new C99434c();

        public C99434c() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return C13598b0.f38549a;
        }
    }

    /* renamed from: lh2.f1$d */
    public static final class C99435d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C99431f1 f291547d;

        /* renamed from: e */
        public final /* synthetic */ C97882i.C97883a f291548e;

        /* renamed from: f */
        public final /* synthetic */ VideoMixer f291549f;

        /* renamed from: g */
        public final /* synthetic */ C97882i f291550g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C99435d(C99431f1 f1Var, C97882i.C97883a aVar, VideoMixer videoMixer, C97882i iVar) {
            super(0);
            this.f291547d = f1Var;
            this.f291548e = aVar;
            this.f291549f = videoMixer;
            this.f291550g = iVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v37, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v32, resolved type: sp3.k} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:178:0x0656 A[LOOP:4: B:176:0x0650->B:178:0x0656, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:182:0x0752 A[LOOP:5: B:180:0x074c->B:182:0x0752, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:197:0x05ad A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r27 = this;
                r0 = r27
                java.lang.Class<h81.h> r1 = h81.C32735h.class
                long r8 = java.lang.System.currentTimeMillis()
                th2.f r2 = th2.C101891f.f300035a
                long r2 = android.os.SystemClock.elapsedRealtime()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "setMuxStartTimeStamp >> "
                r4.append(r5)
                r4.append(r2)
                java.lang.String r4 = r4.toString()
                java.lang.String r5 = "MicroMsg.VideoWidgetReporter"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r4)
                com.tencent.mm.autogen.mmdata.rpt.SightVideoLogStruct r4 = th2.C101891f.f300036b
                r4.f265882P = r2
                gy3.d0 r7 = new gy3.d0
                r7.<init>()
                com.tencent.mm.hardcoder.WXHardCoderJNI r10 = com.tencent.p014mm.hardcoder.C40318k.m43492a()
                com.tencent.mm.hardcoder.WXHardCoderJNI r2 = com.tencent.p014mm.hardcoder.C40318k.m43492a()
                boolean r11 = r2.getHcEncodeVideoEnable()
                com.tencent.mm.hardcoder.WXHardCoderJNI r2 = com.tencent.p014mm.hardcoder.C40318k.m43492a()
                int r12 = r2.getHcEncodeVideoDelay()
                com.tencent.mm.hardcoder.WXHardCoderJNI r2 = com.tencent.p014mm.hardcoder.C40318k.m43492a()
                int r13 = r2.getHcEncodeVideoCPU()
                com.tencent.mm.hardcoder.WXHardCoderJNI r2 = com.tencent.p014mm.hardcoder.C40318k.m43492a()
                int r14 = r2.getHcEncodeVideoIO()
                com.tencent.mm.hardcoder.WXHardCoderJNI r2 = com.tencent.p014mm.hardcoder.C40318k.m43492a()
                boolean r2 = r2.getHcEncodeVideoThr()
                r3 = 0
                if (r2 == 0) goto L_0x0063
                int r2 = android.os.Process.myTid()
                r15 = r2
                goto L_0x0064
            L_0x0063:
                r15 = 0
            L_0x0064:
                r16 = 35000(0x88b8, float:4.9045E-41)
                r17 = 603(0x25b, float:8.45E-43)
                com.tencent.mm.hardcoder.WXHardCoderJNI r2 = com.tencent.p014mm.hardcoder.C40318k.m43492a()
                long r18 = r2.getHcEncodeVideoAction()
                java.lang.String r20 = "RemuxPlugin"
                int r2 = r10.startPerformance(r11, r12, r13, r14, r15, r16, r17, r18, r20)
                r7.f27483d = r2
                r4 = 1
                java.lang.Object[] r5 = new java.lang.Object[r4]
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r5[r3] = r2
                java.lang.String r2 = "MicroMsg.RemuxPlugin"
                java.lang.String r6 = "hardcoder summerPerformance startPerformance: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r6, r5)
                lh2.f1 r5 = r0.f291547d
                com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r5 = r5.f291532g
                r6 = 2
                if (r5 == 0) goto L_0x0096
                int r10 = r5.f272905F
                if (r10 != r6) goto L_0x0096
                r10 = 1
                goto L_0x0097
            L_0x0096:
                r10 = 0
            L_0x0097:
                r11 = 1065353216(0x3f800000, float:1.0)
                if (r10 == 0) goto L_0x00a8
                di3.d r1 = di3.C86312j.m106911c(r1)
                h81.h r1 = (h81.C32735h) r1
                h81.h$c r5 = h81.C32735h.C32737c.clicfg_sns_generate_multiple_kbps
                float r1 = r1.mo58785xe(r5, r11)
                goto L_0x00c2
            L_0x00a8:
                if (r5 == 0) goto L_0x00b0
                int r5 = r5.f272905F
                if (r5 != r4) goto L_0x00b0
                r5 = 1
                goto L_0x00b1
            L_0x00b0:
                r5 = 0
            L_0x00b1:
                if (r5 == 0) goto L_0x00c0
                di3.d r1 = di3.C86312j.m106911c(r1)
                h81.h r1 = (h81.C32735h) r1
                h81.h$c r5 = h81.C32735h.C32737c.clicfg_c2c_generate_multiple_kbps
                float r1 = r1.mo58785xe(r5, r11)
                goto L_0x00c2
            L_0x00c0:
                r1 = 1065353216(0x3f800000, float:1.0)
            L_0x00c2:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r10 = "final kbps: "
                r5.append(r10)
                r5.append(r1)
                java.lang.String r10 = "  "
                r5.append(r10)
                fh2.i$a r10 = r0.f291548e
                int r10 = r10.f287153c
                float r10 = (float) r10
                float r10 = r10 * r1
                r5.append(r10)
                java.lang.String r1 = r5.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
                com.tencent.mm.plugin.recordvideo.background.VideoMixer r12 = r0.f291549f
                fh2.i$a r1 = r0.f291548e
                int r13 = r1.f287151a
                int r14 = r1.f287152b
                int r15 = r1.f287153c
                int r5 = r1.f287154d
                int r10 = r1.f287157g
                int r11 = r1.f287158h
                int r6 = r1.f287155e
                int r3 = r1.f287156f
                int r4 = r1.f287161k
                int r1 = r1.f287162l
                r16 = r5
                r17 = r10
                r18 = r11
                r19 = r6
                r20 = r3
                r21 = r4
                r22 = r1
                r12.mo129788i(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
                com.tencent.mm.plugin.recordvideo.background.VideoMixer r1 = r0.f291549f
                lh2.f1 r3 = r0.f291547d
                com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r3 = r3.f291532g
                if (r3 == 0) goto L_0x0119
                com.tencent.mm.modelcontrol.VideoTransPara r3 = r3.f272926n
                goto L_0x011a
            L_0x0119:
                r3 = 0
            L_0x011a:
                gy3.C87412m.m108591d(r3)
                fh2.i r5 = r0.f291550g
                int r6 = r5.f287147g
                int r5 = r5.f287146f
                r1.mo129787h(r3, r6, r5)
                lh2.f1 r1 = r0.f291547d
                com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r3 = r1.f291532g
                r5 = 3
                if (r3 == 0) goto L_0x0133
                int r6 = r3.f272929q
                if (r6 != r5) goto L_0x0133
                r6 = 1
                goto L_0x0134
            L_0x0133:
                r6 = 0
            L_0x0134:
                if (r6 == 0) goto L_0x013c
                com.tencent.mm.plugin.recordvideo.background.VideoMixer r6 = r0.f291549f
                r10 = 1
                r6.f272869t = r10
                goto L_0x013d
            L_0x013c:
                r10 = 1
            L_0x013d:
                fh2.i r6 = r0.f291550g
                if (r3 == 0) goto L_0x0150
                android.os.Bundle r3 = r3.f272912M
                if (r3 == 0) goto L_0x0150
                java.lang.String r11 = "key_save_composition_info"
                boolean r3 = r3.getBoolean(r11)
                if (r3 != r10) goto L_0x0150
                r3 = 1
                goto L_0x0151
            L_0x0150:
                r3 = 0
            L_0x0151:
                if (r3 == 0) goto L_0x078c
                com.tencent.mm.plugin.recordvideo.util.MultiMediaVideoChecker r3 = com.tencent.p014mm.plugin.recordvideo.util.MultiMediaVideoChecker.f273077a
                h90.b r10 = r1.f291531f
                if (r10 == 0) goto L_0x015c
                java.lang.String r10 = r10.f288180a
                goto L_0x015d
            L_0x015c:
                r10 = 0
            L_0x015d:
                gy3.C87412m.m108591d(r10)
                rw.m$a r3 = r3.mo129930b(r10)
                if (r3 != 0) goto L_0x0199
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r5 = "video info is null,exist:"
                r3.append(r5)
                h90.b r5 = r1.f291531f
                if (r5 == 0) goto L_0x0178
                java.lang.String r5 = r5.f288180a
                goto L_0x0179
            L_0x0178:
                r5 = 0
            L_0x0179:
                boolean r5 = com.tencent.p014mm.vfs.C86013q1.m106450k(r5)
                r3.append(r5)
                java.lang.String r5 = " path:"
                r3.append(r5)
                h90.b r1 = r1.f291531f
                if (r1 == 0) goto L_0x018c
                java.lang.String r4 = r1.f288180a
                goto L_0x018d
            L_0x018c:
                r4 = 0
            L_0x018d:
                r3.append(r4)
                java.lang.String r1 = r3.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r1)
                goto L_0x078c
            L_0x0199:
                com.tencent.mm.timelineedit.TimelineEditor r10 = new com.tencent.mm.timelineedit.TimelineEditor
                r10.<init>()
                android.content.Context r11 = r1.f291529d
                android.graphics.Point r11 = com.tencent.p014mm.p136ui.C85875k4.m106184h(r11)
                int r12 = r11.x
                int r11 = r11.y
                android.graphics.Rect r13 = new android.graphics.Rect
                r14 = 0
                r13.<init>(r14, r14, r12, r11)
                int r14 = r3.f180530f
                r15 = 90
                if (r14 == r15) goto L_0x01bf
                r15 = 270(0x10e, float:3.78E-43)
                if (r14 != r15) goto L_0x01b9
                goto L_0x01bf
            L_0x01b9:
                int r14 = r3.f180525a
                float r14 = (float) r14
                int r3 = r3.f180526b
                goto L_0x01c4
            L_0x01bf:
                int r14 = r3.f180526b
                float r14 = (float) r14
                int r3 = r3.f180525a
            L_0x01c4:
                float r3 = (float) r3
                float r14 = r14 / r3
                float r3 = (float) r12
                float r3 = r3 / r14
                float r11 = (float) r11
                float r11 = r11 - r3
                r14 = 2
                float r15 = (float) r14
                float r11 = r11 / r15
                float r3 = r3 + r11
                android.graphics.Rect r14 = new android.graphics.Rect
                int r11 = (int) r11
                int r3 = (int) r3
                r15 = 0
                r14.<init>(r15, r11, r12, r3)
                li3.b r3 = new li3.b
                r3.<init>()
                boolean r11 = r6.f287141a
                r12 = 1
                r11 = r11 ^ r12
                com.google.protobuf.j1$a r12 = r3.mo160583a()
                mi3.m$b r12 = (mi3.C25007m.C25009b) r12
                r12.f71256p = r11
                r12.onChanged()
                rx3.b0 r11 = rx3.C13598b0.f38549a
                r10.mo153344o(r13, r14, r3)
                h90.b r3 = r1.f291531f
                if (r3 == 0) goto L_0x01f6
                java.lang.String r3 = r3.f288180a
                goto L_0x01f7
            L_0x01f6:
                r3 = 0
            L_0x01f7:
                gy3.C87412m.m108591d(r3)
                r11 = 1
                li3.f r3 = r10.mo153346q(r3, r11)
                if (r3 == 0) goto L_0x0233
                li3.e r11 = new li3.e
                r14 = 0
                com.google.protobuf.j1$a r12 = r3.mo160583a()
                mi3.p$b r12 = (mi3.C25016p.C25018b) r12
                long r4 = r12.f71300n
                r11.<init>(r14, r4)
                r3.mo160588f(r11)
                li3.e r4 = new li3.e
                int r5 = r6.f287146f
                long r11 = (long) r5
                int r5 = r6.f287147g
                long r14 = (long) r5
                r4.<init>(r11, r14)
                r3.mo160589g(r4)
                r4 = 1
                r3.mo160587e(r4)
                com.google.protobuf.j1$a r4 = r3.mo160583a()
                mi3.p$b r4 = (mi3.C25016p.C25018b) r4
                r5 = 1065353216(0x3f800000, float:1.0)
                r4.f71304r = r5
                r4.onChanged()
                goto L_0x0234
            L_0x0233:
                r3 = 0
            L_0x0234:
                gy3.C87412m.m108591d(r3)
                sp3.k r3 = r10.mo153343n(r3)
                gy3.C87412m.m108591d(r3)
                com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo r4 = r6.f287142b
                if (r4 == 0) goto L_0x027a
                java.lang.String r4 = r4.f163817i
                boolean r5 = com.tencent.p014mm.vfs.C86013q1.m106450k(r4)
                if (r5 == 0) goto L_0x027a
                r5 = 0
                java.lang.String r3 = com.tencent.p014mm.vfs.C86013q1.m106448i(r4, r5)
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "addMusicTrack "
                r4.append(r5)
                r4.append(r3)
                java.lang.String r4 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
                gy3.C87412m.m108591d(r3)
                ki3.a r2 = new ki3.a
                r2.<init>(r10, r3)
                ki3.b r3 = new ki3.b
                r3.<init>(r10)
                java.lang.Object r2 = r10.mo153351v(r2, r3)
                r3 = r2
                sp3.k r3 = (sp3.C110807k) r3
                gy3.C87412m.m108591d(r3)
            L_0x027a:
                com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r2 = r1.f291532g
                gy3.C87412m.m108591d(r2)
                com.tencent.mm.modelcontrol.VideoTransPara r2 = r2.f272926n
                java.lang.String r4 = "configProvider!!.videoParam"
                gy3.C87412m.m108593f(r2, r4)
                com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r1 = r1.f291532g
                gy3.C87412m.m108591d(r1)
                java.lang.String r1 = r1.f272901B
                java.lang.String r4 = "configProvider!!.outputVideoPath"
                gy3.C87412m.m108593f(r1, r4)
                te3.az r4 = new te3.az
                r4.<init>()
                com.tencent.mm.modelcontrol.VideoTransPara r5 = new com.tencent.mm.modelcontrol.VideoTransPara
                r5.<init>((com.tencent.p014mm.modelcontrol.VideoTransPara) r2)
                int r11 = r5.f267166d
                float r12 = (float) r11
                int r14 = r13.height()
                float r14 = (float) r14
                int r15 = r13.width()
                float r15 = (float) r15
                float r14 = r14 / r15
                float r12 = r12 * r14
                int r12 = (int) r12
                r5.f267166d = r11
                r5.f267167e = r12
                r4.f297896d = r1
                te3.ep3 r1 = new te3.ep3
                r1.<init>()
                hi2.C98467v.m127917a(r13, r1)
                r4.f297914y = r1
                int r1 = r13.width()
                int r1 = hi2.C98467v.m127918b(r1)
                r4.f297897e = r1
                int r1 = r13.height()
                int r1 = hi2.C98467v.m127918b(r1)
                r4.f297898f = r1
                r1 = 1065353216(0x3f800000, float:1.0)
                r4.f297900h = r1
                te3.n93 r1 = new te3.n93
                r1.<init>()
                te3.ep3 r12 = new te3.ep3
                r12.<init>()
                hi2.C98467v.m127917a(r13, r12)
                r1.f184446d = r12
                int r12 = hi2.C98467v.m127918b(r11)
                r1.f184447e = r12
                int r12 = r13.height()
                int r12 = r12 * r11
                int r14 = r13.width()
                int r12 = r12 / r14
                int r12 = hi2.C98467v.m127918b(r12)
                r1.f184448f = r12
                r4.f297915z = r1
                te3.n93 r1 = new te3.n93
                r1.<init>()
                te3.ep3 r12 = new te3.ep3
                r12.<init>()
                hi2.C98467v.m127917a(r13, r12)
                r1.f184446d = r12
                int r12 = hi2.C98467v.m127918b(r11)
                r1.f184447e = r12
                int r12 = r13.height()
                int r11 = r11 * r12
                int r12 = r13.width()
                int r11 = r11 / r12
                int r11 = hi2.C98467v.m127918b(r11)
                r1.f184448f = r11
                r4.f297894A = r1
                int r1 = r13.height()
                int r11 = r13.height()
                if (r1 != r11) goto L_0x0333
                te3.n93 r1 = r4.f297894A
                r4.f297915z = r1
            L_0x0333:
                r3.mo162392o(r13)
                int r1 = r2.f267169g
                r4.f297903n = r1
                int r1 = r2.f267168f
                r4.f297904o = r1
                int r1 = r2.f267172j
                r4.f297905p = r1
                int r1 = r2.f267173n
                r4.f297906q = r1
                int r1 = r2.f267174o
                r4.f297907r = r1
                int r1 = r2.f267175p
                r4.f297908s = r1
                int r1 = r2.f267180u
                r4.f297910u = r1
                java.util.ArrayList<sp3.c> r1 = r3.f331511l
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.util.Iterator r1 = r1.iterator()
            L_0x035d:
                boolean r11 = r1.hasNext()
                if (r11 == 0) goto L_0x0378
                java.lang.Object r11 = r1.next()
                r12 = r11
                sp3.c r12 = (sp3.C110801c) r12
                int r12 = r12.f331483u
                r14 = 2
                if (r12 != r14) goto L_0x0371
                r12 = 1
                goto L_0x0372
            L_0x0371:
                r12 = 0
            L_0x0372:
                if (r12 == 0) goto L_0x035d
                r2.add(r11)
                goto L_0x035d
            L_0x0378:
                int r1 = r2.size()
                java.lang.String r2 = ", "
                java.lang.String r11 = "MicroMsg.TimelineEditorConverterCopy"
                r14 = 1
                if (r1 != r14) goto L_0x0551
                java.util.ArrayList<sp3.c> r1 = r3.f331511l
                java.util.Iterator r1 = r1.iterator()
            L_0x0389:
                boolean r14 = r1.hasNext()
                if (r14 == 0) goto L_0x0549
                java.lang.Object r14 = r1.next()
                sp3.c r14 = (sp3.C110801c) r14
                int r15 = r14.f331483u
                r12 = 2
                if (r15 != r12) goto L_0x039c
                r12 = 1
                goto L_0x039d
            L_0x039c:
                r12 = 0
            L_0x039d:
                if (r12 == 0) goto L_0x0545
                com.tencent.mm.plugin.recordvideo.util.MultiMediaVideoChecker r1 = com.tencent.p014mm.plugin.recordvideo.util.MultiMediaVideoChecker.f273077a
                java.lang.String r12 = r14.f331482t
                rw.m$a r1 = r1.mo129930b(r12)
                if (r1 == 0) goto L_0x053c
                int r12 = r1.f180525a
                if (r12 <= 0) goto L_0x053c
                int r14 = r1.f180526b
                if (r14 <= 0) goto L_0x053c
                float r15 = r1.f180527c
                r19 = 0
                int r15 = (r15 > r19 ? 1 : (r15 == r19 ? 0 : -1))
                if (r15 <= 0) goto L_0x053c
                int r15 = r1.f180530f
                r19 = r12
                r12 = 180(0xb4, float:2.52E-43)
                if (r15 == 0) goto L_0x03c3
                if (r15 != r12) goto L_0x03c5
            L_0x03c3:
                r14 = r19
            L_0x03c5:
                te3.n93 r15 = r4.f297915z
                int r12 = r15.f184447e
                r20 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                r22 = r8
                if (r12 <= r14) goto L_0x0417
                int r9 = hi2.C98467v.m127918b(r14)
                r15.f184447e = r9
                int r9 = r13.height()
                double r8 = (double) r9
                double r8 = r8 * r20
                int r12 = r13.width()
                r26 = r6
                r25 = r7
                double r6 = (double) r12
                double r8 = r8 / r6
                int r6 = r15.f184447e
                double r6 = (double) r6
                double r8 = r8 * r6
                int r6 = (int) r8
                int r6 = hi2.C98467v.m127918b(r6)
                r15.f184448f = r6
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = "update fullScreenConfig size:["
                r6.append(r7)
                int r7 = r15.f184447e
                r6.append(r7)
                r6.append(r2)
                int r7 = r15.f184448f
                r6.append(r7)
                r7 = 93
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r6)
                goto L_0x041b
            L_0x0417:
                r26 = r6
                r25 = r7
            L_0x041b:
                te3.n93 r6 = r4.f297894A
                int r7 = r6.f184447e
                if (r7 <= r14) goto L_0x0466
                int r7 = hi2.C98467v.m127918b(r14)
                r6.f184447e = r7
                int r7 = r13.height()
                double r7 = (double) r7
                double r7 = r7 * r20
                int r9 = r13.width()
                r15 = r13
                double r12 = (double) r9
                double r7 = r7 / r12
                int r9 = r6.f184447e
                double r12 = (double) r9
                double r7 = r7 * r12
                int r7 = (int) r7
                int r7 = hi2.C98467v.m127918b(r7)
                r6.f184448f = r7
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = "update cropConfig size:["
                r7.append(r8)
                int r8 = r6.f184447e
                r7.append(r8)
                r7.append(r2)
                int r6 = r6.f184448f
                r7.append(r6)
                r6 = 93
                r7.append(r6)
                java.lang.String r6 = r7.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r6)
                goto L_0x0467
            L_0x0466:
                r15 = r13
            L_0x0467:
                int r6 = r1.f180530f
                if (r6 == 0) goto L_0x0473
                r7 = 180(0xb4, float:2.52E-43)
                if (r6 != r7) goto L_0x0470
                goto L_0x0473
            L_0x0470:
                int r6 = r1.f180525a
                goto L_0x0475
            L_0x0473:
                int r6 = r1.f180526b
            L_0x0475:
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = "fullscreenRect:"
                r7.append(r8)
                r8 = r15
                r7.append(r8)
                java.lang.String r9 = ", videoParam.width:"
                r7.append(r9)
                int r9 = r5.f267166d
                r7.append(r9)
                java.lang.String r9 = ", heightLimit:"
                r7.append(r9)
                r7.append(r6)
                java.lang.String r7 = r7.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r7)
                if (r14 <= r6) goto L_0x0508
                int r5 = r5.f267166d
                int r5 = java.lang.Math.min(r6, r5)
                int r7 = r8.height()
                if (r7 >= r5) goto L_0x04ca
                float r5 = (float) r5
                te3.n93 r6 = r4.f297915z
                int r6 = r6.f184448f
                float r6 = (float) r6
                float r5 = r5 / r6
                r4.f297900h = r5
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "[widescreen] update outputScale:"
                r5.append(r6)
                float r6 = r4.f297900h
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r5)
                goto L_0x0508
            L_0x04ca:
                te3.n93 r7 = r4.f297915z
                int r9 = hi2.C98467v.m127918b(r5)
                r7.f184448f = r9
                te3.n93 r7 = r4.f297915z
                float r5 = (float) r5
                float r9 = (float) r14
                float r5 = r5 * r9
                float r6 = (float) r6
                float r5 = r5 / r6
                int r5 = (int) r5
                int r5 = hi2.C98467v.m127918b(r5)
                r7.f184447e = r5
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "[widescreen] update fullScreenConfig size:["
                r5.append(r6)
                te3.n93 r6 = r4.f297915z
                int r6 = r6.f184447e
                r5.append(r6)
                r5.append(r2)
                te3.n93 r6 = r4.f297915z
                int r6 = r6.f184448f
                r5.append(r6)
                r6 = 93
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r5)
            L_0x0508:
                java.lang.String r5 = ""
                boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
                r6 = 1
                r5 = r5 ^ r6
                if (r5 == 0) goto L_0x0526
                int r5 = r4.f297906q
                int r6 = r1.f180532h
                if (r5 <= r6) goto L_0x051a
                r4.f297906q = r6
            L_0x051a:
                int r5 = r4.f297907r
                int r6 = r1.f180534j
                if (r5 <= r6) goto L_0x0526
                r5 = 1000(0x3e8, float:1.401E-42)
                if (r6 <= r5) goto L_0x0526
                r4.f297907r = r6
            L_0x0526:
                int r5 = r4.f297904o
                float r6 = r1.f180527c
                int r6 = (int) r6
                int r5 = java.lang.Math.min(r5, r6)
                r4.f297904o = r5
                int r1 = r1.f180533i
                r5 = 2
                int r1 = java.lang.Math.min(r1, r5)
                r4.f297908s = r1
                goto L_0x05b6
            L_0x053c:
                r26 = r6
                r25 = r7
                r22 = r8
                r8 = r13
                goto L_0x05b6
            L_0x0545:
                r22 = r8
                goto L_0x0389
            L_0x0549:
                java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
                java.lang.String r2 = "Collection contains no element matching the predicate."
                r1.<init>(r2)
                throw r1
            L_0x0551:
                r26 = r6
                r25 = r7
                r22 = r8
                r8 = r13
                java.util.ArrayList<sp3.c> r1 = r3.f331511l
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
                java.util.Iterator r1 = r1.iterator()
            L_0x0563:
                boolean r6 = r1.hasNext()
                if (r6 == 0) goto L_0x057e
                java.lang.Object r6 = r1.next()
                r7 = r6
                sp3.c r7 = (sp3.C110801c) r7
                int r7 = r7.f331483u
                r9 = 2
                if (r7 != r9) goto L_0x0577
                r7 = 1
                goto L_0x0578
            L_0x0577:
                r7 = 0
            L_0x0578:
                if (r7 == 0) goto L_0x0563
                r5.add(r6)
                goto L_0x0563
            L_0x057e:
                boolean r1 = r5.isEmpty()
                if (r1 == 0) goto L_0x0586
            L_0x0584:
                r6 = 1
                goto L_0x05b0
            L_0x0586:
                java.util.Iterator r1 = r5.iterator()
            L_0x058a:
                boolean r5 = r1.hasNext()
                if (r5 == 0) goto L_0x0584
                java.lang.Object r5 = r1.next()
                sp3.c r5 = (sp3.C110801c) r5
                com.tencent.mm.plugin.recordvideo.util.MultiMediaVideoChecker r6 = com.tencent.p014mm.plugin.recordvideo.util.MultiMediaVideoChecker.f273077a
                java.lang.String r5 = r5.f331482t
                rw.m$a r5 = r6.mo129930b(r5)
                if (r5 == 0) goto L_0x05a8
                int r5 = r5.f180533i
                r6 = 1
                if (r5 != r6) goto L_0x05a9
                r24 = 1
                goto L_0x05ab
            L_0x05a8:
                r6 = 1
            L_0x05a9:
                r24 = 0
            L_0x05ab:
                if (r24 == 0) goto L_0x058a
                r24 = 1
                goto L_0x05b2
            L_0x05b0:
                r24 = 0
            L_0x05b2:
                if (r24 == 0) goto L_0x05b8
                r4.f297908s = r6
            L_0x05b6:
                r1 = 2
                goto L_0x05bb
            L_0x05b8:
                r1 = 2
                r4.f297908s = r1
            L_0x05bb:
                int r5 = r4.f297908s
                int r5 = java.lang.Math.min(r5, r1)
                r4.f297908s = r5
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r5 = "getExportConfig: fullTarget:["
                r1.append(r5)
                te3.n93 r5 = r4.f297915z
                int r5 = r5.f184447e
                r1.append(r5)
                r1.append(r2)
                te3.n93 r2 = r4.f297915z
                int r2 = r2.f184448f
                r1.append(r2)
                java.lang.String r2 = "] cropTarget:["
                r1.append(r2)
                te3.n93 r2 = r4.f297894A
                int r2 = r2.f184447e
                r1.append(r2)
                r2 = 44
                r1.append(r2)
                te3.n93 r5 = r4.f297894A
                int r5 = r5.f184448f
                r1.append(r5)
                java.lang.String r5 = "] audio:"
                r1.append(r5)
                int r5 = r4.f297908s
                r1.append(r5)
                r1.append(r2)
                int r5 = r4.f297906q
                r1.append(r5)
                r1.append(r2)
                int r2 = r4.f297907r
                r1.append(r2)
                java.lang.String r2 = ", cropRect:"
                r1.append(r2)
                r1.append(r8)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r1)
                te3.zy r1 = new te3.zy
                r1.<init>()
                com.tencent.tav.coremedia.CMTimeRange r2 = r3.mo162387j()
                long r5 = r2.getStartUs()
                r2 = 1000(0x3e8, float:1.401E-42)
                long r11 = (long) r2
                long r5 = r5 / r11
                r1.f186900e = r5
                com.tencent.tav.coremedia.CMTimeRange r2 = r3.mo162387j()
                long r5 = r2.getEndUs()
                long r5 = r5 / r11
                r1.f186901f = r5
                java.util.LinkedList<te3.hi4> r2 = r1.f186899d
                java.util.ArrayList<sp3.c> r5 = r3.f331511l
                java.util.ArrayList r6 = new java.util.ArrayList
                r7 = 10
                int r9 = sx3.C36907w.m41090l(r5, r7)
                r6.<init>(r9)
                java.util.Iterator r5 = r5.iterator()
            L_0x0650:
                boolean r9 = r5.hasNext()
                if (r9 == 0) goto L_0x06da
                java.lang.Object r9 = r5.next()
                sp3.c r9 = (sp3.C110801c) r9
                te3.hi4 r11 = new te3.hi4
                r11.<init>()
                java.lang.String r12 = "track"
                gy3.C87412m.m108594g(r9, r12)
                java.lang.String r12 = r9.f331482t
                r11.f183504d = r12
                int r12 = r9.f331483u
                r11.f183505e = r12
                long r12 = r9.f331464b
                r11.f183506f = r12
                long r12 = r9.f331465c
                r11.f183507g = r12
                long r12 = r9.f331466d
                r11.f183508h = r12
                long r12 = r9.f331467e
                r11.f183509i = r12
                long r12 = r9.f331470h
                r11.f183510j = r12
                int r12 = r9.f331471i
                r11.f183511n = r12
                int r12 = r9.f331472j
                r11.f183512o = r12
                float r12 = r9.f331469g
                r11.f183514q = r12
                te3.m10 r12 = new te3.m10
                r12.<init>()
                r11.f183515r = r12
                te3.ep3 r13 = new te3.ep3
                r13.<init>()
                r12.f184196e = r13
                te3.ep3 r13 = new te3.ep3
                r13.<init>()
                r12.f184199h = r13
                te3.ep3 r13 = new te3.ep3
                r13.<init>()
                r12.f184198g = r13
                android.graphics.Rect r13 = r9.f331474l
                te3.ep3 r14 = r12.f184196e
                java.lang.String r15 = "proto.cropRect"
                gy3.C87412m.m108593f(r14, r15)
                hi2.C98467v.m127917a(r13, r14)
                android.graphics.Rect r13 = r9.f331475m
                te3.ep3 r14 = r12.f184199h
                java.lang.String r15 = "proto.trackCropRect"
                gy3.C87412m.m108593f(r14, r15)
                hi2.C98467v.m127917a(r13, r14)
                android.graphics.Rect r9 = r9.f331474l
                te3.ep3 r12 = r12.f184198g
                java.lang.String r13 = "proto.contentRect"
                gy3.C87412m.m108593f(r12, r13)
                hi2.C98467v.m127917a(r9, r12)
                r9 = 0
                r11.f183517t = r9
                r6.add(r11)
                goto L_0x0650
            L_0x06da:
                r2.addAll(r6)
                boolean r2 = r3.f331512m
                r1.f186902g = r2
                r2 = 1
                r1.f186905j = r2
                r1.f186904i = r4
                java.util.LinkedList r2 = new java.util.LinkedList
                r2.<init>()
                r1.f186910r = r2
                te3.yy r2 = new te3.yy
                r2.<init>()
                te3.ep3 r3 = new te3.ep3
                r3.<init>()
                r2.f186610d = r3
                android.graphics.Rect r3 = new android.graphics.Rect
                int r4 = r8.width()
                int r5 = r8.height()
                r6 = 0
                r3.<init>(r6, r6, r4, r5)
                te3.ep3 r4 = r2.f186610d
                java.lang.String r5 = "drawingRect"
                gy3.C87412m.m108593f(r4, r5)
                hi2.C98467v.m127917a(r3, r4)
                te3.ep3 r3 = new te3.ep3
                r3.<init>()
                r2.f186613g = r3
                r3 = r26
                float[] r4 = r3.f287150j
                android.graphics.Rect r5 = new android.graphics.Rect
                r6 = r4[r6]
                int r6 = (int) r6
                r8 = 1
                r8 = r4[r8]
                int r8 = (int) r8
                r9 = 2
                r9 = r4[r9]
                int r9 = (int) r9
                r11 = 3
                r4 = r4[r11]
                int r4 = (int) r4
                r5.<init>(r6, r8, r9, r4)
                te3.ep3 r4 = r2.f186613g
                java.lang.String r6 = "validRect"
                gy3.C87412m.m108593f(r4, r6)
                hi2.C98467v.m127917a(r5, r4)
                java.util.LinkedList<te3.ea> r4 = r2.f186611e
                java.util.ArrayList<ai2.a> r3 = r3.f287144d
                java.util.ArrayList r5 = new java.util.ArrayList
                int r6 = sx3.C36907w.m41090l(r3, r7)
                r5.<init>(r6)
                java.util.Iterator r3 = r3.iterator()
            L_0x074c:
                boolean r6 = r3.hasNext()
                if (r6 == 0) goto L_0x0775
                java.lang.Object r6 = r3.next()
                ai2.a r6 = (ai2.C92007a) r6
                te3.ea r7 = new te3.ea
                r7.<init>()
                ai2.d r8 = r6.f263402a
                int r8 = r8.f263445d
                r7.f182947d = r8
                pe3.a r6 = r6.toProtoBuf()
                byte[] r6 = r6.toByteArray()
                te3.qv3 r6 = sf0.C48374j0.m53712a(r6)
                r7.f182948e = r6
                r5.add(r7)
                goto L_0x074c
            L_0x0775:
                r4.addAll(r5)
                r1.f186906n = r2
                com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager r2 = com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager.f272890c
                android.os.Bundle r2 = r2.f272892b
                byte[] r1 = r1.toByteArray()
                java.lang.String r3 = "key_composition_info"
                r2.putByteArray(r3, r1)
                r10.mo153348s()
                goto L_0x0790
            L_0x078c:
                r25 = r7
                r22 = r8
            L_0x0790:
                com.tencent.mm.plugin.recordvideo.background.VideoMixer r1 = r0.f291549f
                lh2.g1 r10 = new lh2.g1
                lh2.f1 r3 = r0.f291547d
                fh2.i r4 = r0.f291550g
                fh2.i$a r5 = r0.f291548e
                r2 = r10
                r6 = r1
                r7 = r25
                r8 = r22
                r2.<init>(r3, r4, r5, r6, r7, r8)
                r1.mo126422a(r10)
                rx3.b0 r1 = rx3.C13598b0.f38549a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: lh2.C99431f1.C99435d.invoke():java.lang.Object");
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.recordvideo.plugin.RemuxPlugin$startReMux$1", mo125469f = "RemuxPlugin.kt", mo125470l = {138}, mo125471m = "invokeSuspend")
    /* renamed from: lh2.f1$e */
    public static final class C99436e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f291551d;

        /* renamed from: e */
        public final /* synthetic */ C99431f1 f291552e;

        /* renamed from: f */
        public final /* synthetic */ C97882i f291553f;

        /* renamed from: lh2.f1$e$a */
        public static final class C99437a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C99431f1 f291554d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C99437a(C99431f1 f1Var) {
                super(0);
                this.f291554d = f1Var;
            }

            public Object invoke() {
                Log.m105920e("MicroMsg.RemuxPlugin", "notice: configProvider is null  " + this.f291554d.f291533h + "  " + this.f291554d.f291532g + ' ');
                return C13598b0.f38549a;
            }
        }

        /* renamed from: lh2.f1$e$b */
        public static final class C99438b extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public static final C99438b f291555d = new C99438b();

            public C99438b() {
                super(0);
            }

            public Object invoke() {
                Log.m105924i("MicroMsg.RemuxPlugin", "not use DaemonVideo");
                return C13598b0.f38549a;
            }
        }

        /* renamed from: lh2.f1$e$c */
        public static final class C99439c extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public static final C99439c f291556d = new C99439c();

            public C99439c() {
                super(0);
            }

            public Object invoke() {
                Log.m105924i("MicroMsg.RemuxPlugin", "not use checkNoNeedRemuxVideo");
                return C13598b0.f38549a;
            }
        }

        /* renamed from: lh2.f1$e$d */
        public static final class C99440d extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public static final C99440d f291557d = new C99440d();

            public C99440d() {
                super(0);
            }

            public Object invoke() {
                Log.m105924i("MicroMsg.RemuxPlugin", "not use checkForegroundRemux");
                return C13598b0.f38549a;
            }
        }

        /* renamed from: lh2.f1$e$e */
        public static final class C99441e extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public static final C99441e f291558d = new C99441e();

            public C99441e() {
                super(0);
            }

            public Object invoke() {
                Log.m105924i("MicroMsg.RemuxPlugin", "not use checkBackgroundRemux");
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C99436e(C99431f1 f1Var, C97882i iVar, C15601d<? super C99436e> dVar) {
            super(2, dVar);
            this.f291552e = f1Var;
            this.f291553f = iVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C99436e(this.f291552e, this.f291553f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C99436e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:39:0x010c, code lost:
            if (((r9 == null || (r10 = r9.f272926n) == null || r10.f267180u != 2) ? false : true) != false) goto L_0x010e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:0x013a, code lost:
            if (((r9 == null || (r9 = r9.f272926n) == null || r9.f267160G != 4) ? false : true) != false) goto L_0x013c;
         */
        /* JADX WARNING: Removed duplicated region for block: B:76:0x0302  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r26) {
            /*
                r25 = this;
                r0 = r25
                xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
                int r2 = r0.f291551d
                r3 = 0
                java.lang.String r4 = "MicroMsg.RemuxPlugin"
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L_0x001e
                if (r2 != r5) goto L_0x0016
                kotlin.ResultKt.throwOnFailure(r26)
                r2 = r26
                goto L_0x0314
            L_0x0016:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x001e:
                kotlin.ResultKt.throwOnFailure(r26)
                java.lang.String r2 = "startReMux !!!!"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)
                lh2.f1 r2 = r0.f291552e
                lh2.f1$e$a r7 = new lh2.f1$e$a
                r7.<init>(r2)
                com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r8 = r2.f291532g
                if (r8 != 0) goto L_0x0036
                r7.invoke()
                r2 = r3
            L_0x0036:
                if (r2 == 0) goto L_0x0452
                fh2.i r7 = r0.f291553f
                r2.f291534i = r7
                com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r8 = r2.f291532g
                h90.b r9 = r2.f291531f
                fh2.i$a r8 = r7.mo137203a(r8, r9)
                java.lang.String r9 = "<set-?>"
                gy3.C87412m.m108594g(r8, r9)
                r2.f291535j = r8
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r9 = "configProvider : "
                r8.append(r9)
                com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r9 = r2.f291532g
                r8.append(r9)
                java.lang.String r8 = r8.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r8)
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r9 = "RemuxMediaEditConfig : "
                r8.append(r9)
                r8.append(r7)
                java.lang.String r7 = r8.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r7)
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = "mediaCaptureInfo : "
                r7.append(r8)
                h90.b r8 = r2.f291531f
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r7)
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = "generateTargetConfig info: "
                r7.append(r8)
                fh2.i$a r8 = r2.f291535j
                r7.append(r8)
                r8 = 32
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r7)
                th2.d r7 = th2.C110992d.f332425a
                fh2.i$a r8 = r2.f291535j
                boolean r8 = r8.f287160j
                java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
                java.lang.String r9 = "KEY_VIDEO_IS_EDITED_BOOLEAN"
                r7.mo162677k(r9, r8)
                com.tencent.mm.plugin.report.service.n r10 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r11 = 985(0x3d9, double:4.867E-321)
                r13 = 139(0x8b, double:6.87E-322)
                r15 = 1
                r17 = 0
                r10.idkeyStat(r11, r13, r15, r17)
                fh2.i$a r8 = r2.f291535j
                boolean r8 = r8.f287160j
                if (r8 == 0) goto L_0x00d6
                com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r10 = 985(0x3d9, double:4.867E-321)
                r12 = 138(0x8a, double:6.8E-322)
                r14 = 1
                r16 = 0
                r9.idkeyStat(r10, r12, r14, r16)
            L_0x00d6:
                lh2.f1$e$b r8 = lh2.C99431f1.C99436e.C99438b.f291555d
                fh2.i$a r9 = r2.f291535j
                boolean r9 = r9.f287160j
                if (r9 != 0) goto L_0x02fd
                h90.b r9 = r2.f291531f
                if (r9 == 0) goto L_0x00ea
                boolean r9 = r9.mo137612b()
                if (r9 != r5) goto L_0x00ea
                r9 = 1
                goto L_0x00eb
            L_0x00ea:
                r9 = 0
            L_0x00eb:
                if (r9 == 0) goto L_0x02fd
                com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r9 = r2.f291532g
                if (r9 == 0) goto L_0x00fb
                com.tencent.mm.modelcontrol.VideoTransPara r10 = r9.f272926n
                if (r10 == 0) goto L_0x00fb
                int r10 = r10.f267180u
                if (r10 != r5) goto L_0x00fb
                r10 = 1
                goto L_0x00fc
            L_0x00fb:
                r10 = 0
            L_0x00fc:
                r11 = 2
                if (r10 != 0) goto L_0x010e
                if (r9 == 0) goto L_0x010b
                com.tencent.mm.modelcontrol.VideoTransPara r10 = r9.f272926n
                if (r10 == 0) goto L_0x010b
                int r10 = r10.f267180u
                if (r10 != r11) goto L_0x010b
                r10 = 1
                goto L_0x010c
            L_0x010b:
                r10 = 0
            L_0x010c:
                if (r10 == 0) goto L_0x01a1
            L_0x010e:
                if (r9 == 0) goto L_0x011a
                com.tencent.mm.modelcontrol.VideoTransPara r10 = r9.f272926n
                if (r10 == 0) goto L_0x011a
                int r10 = r10.f267160G
                if (r10 != r5) goto L_0x011a
                r10 = 1
                goto L_0x011b
            L_0x011a:
                r10 = 0
            L_0x011b:
                if (r10 != 0) goto L_0x013c
                if (r9 == 0) goto L_0x0129
                com.tencent.mm.modelcontrol.VideoTransPara r10 = r9.f272926n
                if (r10 == 0) goto L_0x0129
                int r10 = r10.f267160G
                if (r10 != r11) goto L_0x0129
                r10 = 1
                goto L_0x012a
            L_0x0129:
                r10 = 0
            L_0x012a:
                if (r10 != 0) goto L_0x013c
                if (r9 == 0) goto L_0x0139
                com.tencent.mm.modelcontrol.VideoTransPara r9 = r9.f272926n
                if (r9 == 0) goto L_0x0139
                int r9 = r9.f267160G
                r10 = 4
                if (r9 != r10) goto L_0x0139
                r9 = 1
                goto L_0x013a
            L_0x0139:
                r9 = 0
            L_0x013a:
                if (r9 == 0) goto L_0x01a1
            L_0x013c:
                fh2.i r9 = r2.f291534i
                gy3.C87412m.m108591d(r9)
                fh2.i$a r10 = r2.f291535j
                com.tencent.mm.plugin.recordvideo.background.VideoMixer r9 = r2.mo138871f(r9, r10)
                com.tencent.mm.plugin.sight.base.AdaptiveAdjustBitrate r10 = r9.f272866q
                if (r10 != 0) goto L_0x014c
                goto L_0x0150
            L_0x014c:
                r11 = 3000(0xbb8, float:4.204E-42)
                r10.f273429e = r11
            L_0x0150:
                int r9 = r9.mo129784e()
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r11 = "ABA: useDarmonVideo: "
                r10.append(r11)
                r10.append(r9)
                java.lang.String r10 = r10.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r10)
                if (r9 != 0) goto L_0x0177
                r8.invoke()
                th2.f r7 = th2.C101891f.f300035a
                r7.mo141388v(r5)
                r7.mo141369c(r5)
                goto L_0x0300
            L_0x0177:
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r10 = "ABA::check DarmonVideo, add the metadate for video of low bitrate path: "
                r9.append(r10)
                h90.b r10 = r2.f291531f
                gy3.C87412m.m108591d(r10)
                java.lang.String r10 = r10.f288185f
                r9.append(r10)
                java.lang.String r9 = r9.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r9)
                h90.b r9 = r2.f291531f
                gy3.C87412m.m108591d(r9)
                java.lang.String r9 = r9.f288185f
                com.tencent.p014mm.plugin.sight.base.SightVideoJNI.addReportMetadata(r9, r3, r5, r6)
                th2.f r9 = th2.C101891f.f300035a
                r9.mo141369c(r6)
            L_0x01a1:
                th2.f r9 = th2.C101891f.f300035a
                r9.mo141388v(r6)
                com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r10 = r2.f291532g
                if (r10 == 0) goto L_0x02fd
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r11 = "daemonMediaCaptureInfo into: \ndaemonVideoPath = "
                r8.append(r11)
                h90.b r11 = r2.f291531f
                gy3.C87412m.m108591d(r11)
                java.lang.String r11 = r11.f288185f
                r8.append(r11)
                java.lang.String r11 = ", daemonVideoSize = "
                r8.append(r11)
                h90.b r12 = r2.f291531f
                gy3.C87412m.m108591d(r12)
                java.lang.String r12 = r12.f288185f
                long r12 = com.tencent.p014mm.vfs.C86013q1.m106451l(r12)
                r8.append(r12)
                java.lang.String r12 = ", \nsourceVideoPath = "
                r8.append(r12)
                h90.b r13 = r2.f291531f
                gy3.C87412m.m108591d(r13)
                java.lang.String r13 = r13.f288180a
                r8.append(r13)
                java.lang.String r13 = ", captureSize = "
                r8.append(r13)
                h90.b r14 = r2.f291531f
                gy3.C87412m.m108591d(r14)
                java.lang.String r14 = r14.f288180a
                long r14 = com.tencent.p014mm.vfs.C86013q1.m106451l(r14)
                r8.append(r14)
                java.lang.String r14 = ", \noutputSize = "
                r8.append(r14)
                java.lang.String r15 = r10.f272901B
                r8.append(r15)
                java.lang.String r15 = ", outputSize = "
                r8.append(r15)
                java.lang.String r3 = r10.f272901B
                r26 = r7
                long r6 = com.tencent.p014mm.vfs.C86013q1.m106451l(r3)
                r8.append(r6)
                java.lang.String r3 = r8.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
                h90.b r3 = r2.f291531f
                gy3.C87412m.m108591d(r3)
                java.lang.String r3 = r3.f288185f
                java.lang.String r6 = r10.f272901B
                com.tencent.p014mm.vfs.C86013q1.m106442c(r3, r6)
                h90.b r3 = r2.f291531f
                gy3.C87412m.m108591d(r3)
                java.lang.String r3 = r3.f288186g
                java.lang.String r6 = r10.f272902C
                com.tencent.p014mm.vfs.C86013q1.m106442c(r3, r6)
                hi2.h r3 = hi2.C98453h.f288774a
                h90.b r6 = r2.f291531f
                r3.mo137809g(r6)
                r3.mo137814l(r10, r5)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r6 = "daemonMediaCaptureInfo 1: "
                r3.append(r6)
                h90.b r6 = r2.f291531f
                r3.append(r6)
                java.lang.String r3 = r3.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r6 = "daemonMediaCaptureInfo 2: \ndaemonVideoPath = "
                r3.append(r6)
                h90.b r6 = r2.f291531f
                gy3.C87412m.m108591d(r6)
                java.lang.String r6 = r6.f288185f
                r3.append(r6)
                r3.append(r11)
                h90.b r6 = r2.f291531f
                gy3.C87412m.m108591d(r6)
                java.lang.String r6 = r6.f288185f
                long r6 = com.tencent.p014mm.vfs.C86013q1.m106451l(r6)
                r3.append(r6)
                r3.append(r12)
                h90.b r6 = r2.f291531f
                gy3.C87412m.m108591d(r6)
                java.lang.String r6 = r6.f288180a
                r3.append(r6)
                r3.append(r13)
                h90.b r6 = r2.f291531f
                gy3.C87412m.m108591d(r6)
                java.lang.String r6 = r6.f288180a
                long r6 = com.tencent.p014mm.vfs.C86013q1.m106451l(r6)
                r3.append(r6)
                r3.append(r14)
                java.lang.String r6 = r10.f272901B
                r3.append(r6)
                r3.append(r15)
                java.lang.String r6 = r10.f272901B
                long r6 = com.tencent.p014mm.vfs.C86013q1.m106451l(r6)
                r3.append(r6)
                java.lang.String r3 = r3.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
                java.lang.String r3 = r10.f272901B
                java.lang.String r6 = "this.outputVideoPath"
                gy3.C87412m.m108593f(r3, r6)
                java.lang.String r7 = r10.f272902C
                java.lang.String r8 = "this.thumbPath"
                gy3.C87412m.m108593f(r7, r8)
                r2.mo138869c(r3, r7)
                java.lang.String r3 = r10.f272901B
                gy3.C87412m.m108593f(r3, r6)
                r2.mo138877l(r3)
                r9.mo141379m(r5)
                r6 = 1
                r9.mo141375i(r5, r6)
                com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel r3 = new com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel
                java.lang.Boolean r19 = java.lang.Boolean.TRUE
                java.lang.String r6 = r10.f272901B
                java.lang.String r7 = r10.f272902C
                h90.b r8 = r2.f291531f
                gy3.C87412m.m108591d(r8)
                int r8 = r8.f288188i
                h90.b r9 = r2.f291531f
                gy3.C87412m.m108591d(r9)
                int r9 = r9.f288187h
                int r8 = r8 - r9
                long r8 = (long) r8
                java.lang.Long r22 = java.lang.Long.valueOf(r8)
                java.lang.Boolean r23 = java.lang.Boolean.FALSE
                com.tencent.mm.plugin.recordvideo.jumper.RecordMediaReportInfo r24 = r26.mo162676j()
                r18 = r3
                r20 = r6
                r21 = r7
                r18.<init>(r19, r20, r21, r22, r23, r24)
                r2.mo138872g(r3)
                r2 = 0
                goto L_0x0300
            L_0x02fd:
                r8.invoke()
            L_0x0300:
                if (r2 == 0) goto L_0x0452
                hi2.h r3 = hi2.C98453h.f288774a
                h90.b r6 = r2.f291531f
                r3.mo137809g(r6)
                lh2.f1$e$c r3 = lh2.C99431f1.C99436e.C99439c.f291556d
                r0.f291551d = r5
                java.lang.Object r2 = lh2.C99431f1.m129760a(r2, r3, r0)
                if (r2 != r1) goto L_0x0314
                return r1
            L_0x0314:
                lh2.f1 r2 = (lh2.C99431f1) r2
                if (r2 == 0) goto L_0x0452
                lh2.f1$e$d r1 = lh2.C99431f1.C99436e.C99440d.f291557d
                com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r3 = r2.f291532g
                java.lang.String r6 = "MicroMsg.StoryRemuxIDKeyStat"
                if (r3 == 0) goto L_0x0352
                java.lang.Boolean r3 = r3.f272933u
                java.lang.Boolean r7 = java.lang.Boolean.TRUE
                boolean r3 = gy3.C87412m.m108589b(r3, r7)
                if (r3 == 0) goto L_0x0352
                fh2.i r1 = r2.f291534i
                gy3.C87412m.m108591d(r1)
                fh2.i$a r3 = r2.f291535j
                com.tencent.mm.plugin.recordvideo.background.VideoMixer r1 = r2.mo138871f(r1, r3)
                java.lang.String r3 = "markRemuxProcessType, isForeground:true"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r3)
                com.tencent.mm.plugin.report.service.n r7 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r8 = 986(0x3da, double:4.87E-321)
                r10 = 5
                r12 = 1
                r7.mo175913w(r8, r10, r12)
                fh2.i r3 = r2.f291534i
                gy3.C87412m.m108591d(r3)
                fh2.i$a r7 = r2.f291535j
                r2.mo138875j(r1, r3, r7)
                r2 = 0
                goto L_0x0355
            L_0x0352:
                r1.invoke()
            L_0x0355:
                if (r2 == 0) goto L_0x0452
                lh2.f1$e$e r1 = lh2.C99431f1.C99436e.C99441e.f291558d
                java.lang.String r3 = "markRemuxProcessType, isForeground:false"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r3)
                com.tencent.mm.plugin.report.service.n r7 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r8 = 986(0x3da, double:4.87E-321)
                r10 = 6
                r12 = 1
                r7.mo175913w(r8, r10, r12)
                fh2.i r3 = r2.f291534i
                gy3.C87412m.m108591d(r3)
                fh2.i$a r6 = r2.f291535j
                com.tencent.mm.plugin.recordvideo.background.VideoMixer r3 = r2.mo138871f(r3, r6)
                com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r6 = r2.f291532g
                if (r6 == 0) goto L_0x044f
                gy3.f0 r1 = new gy3.f0
                r1.<init>()
                te3.gb0 r7 = new te3.gb0
                r7.<init>()
                r1.f27484d = r7
                fh2.i r8 = r2.f291534i
                gy3.C87412m.m108591d(r8)
                int r8 = r8.f287147g
                fh2.i r9 = r2.f291534i
                gy3.C87412m.m108591d(r9)
                int r9 = r9.f287146f
                int r8 = r8 - r9
                long r8 = (long) r8
                r7.f298291d = r8
                T r7 = r1.f27484d
                te3.gb0 r7 = (te3.C101781gb0) r7
                com.tencent.mm.modelcontrol.VideoTransPara r8 = r6.f272926n
                if (r8 == 0) goto L_0x03a8
                int r8 = r8.f267180u
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                r16 = r8
                goto L_0x03aa
            L_0x03a8:
                r16 = 0
            L_0x03aa:
                gy3.C87412m.m108591d(r16)
                int r8 = r16.intValue()
                r7.f298293f = r8
                T r7 = r1.f27484d
                te3.gb0 r7 = (te3.C101781gb0) r7
                h90.b r8 = r2.f291531f
                if (r8 == 0) goto L_0x03be
                boolean r8 = r8.f288182c
                goto L_0x03bf
            L_0x03be:
                r8 = 0
            L_0x03bf:
                r7.f298294g = r8
                fh2.i$a r8 = r2.f291535j
                boolean r8 = r8.f287160j
                r7.f298295h = r8
                boolean r8 = r6.f272937y
                r7.f298296i = r8
                boolean r8 = r6.f272938z
                r7.f298297j = r8
                java.lang.String r8 = r6.f272900A
                r7.f298298n = r8
                java.lang.String r8 = r6.f272901B
                r7.f298299o = r8
                java.lang.String r8 = r6.f272902C
                r7.f298300p = r8
                ah2.a r8 = r3.f272850a
                boolean r8 = r8.f263377h
                r7.f298301q = r8
                r8 = 0
                r7.f298302r = r8
                fh2.i r7 = r2.f291534i
                gy3.C87412m.m108591d(r7)
                com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo r7 = r7.f287142b
                lh2.d1 r8 = new lh2.d1
                r8.<init>(r2, r3, r1, r6)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "checkAudioCache audio:"
                r1.append(r3)
                if (r7 == 0) goto L_0x03fd
                goto L_0x03fe
            L_0x03fd:
                r5 = 0
            L_0x03fe:
                r1.append(r5)
                java.lang.String r3 = ", cache:"
                r1.append(r3)
                if (r7 == 0) goto L_0x040b
                boolean r3 = r7.f163818j
                goto L_0x040c
            L_0x040b:
                r3 = 0
            L_0x040c:
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
                wh2.b r1 = new wh2.b
                r1.<init>()
                android.content.Context r3 = r2.f291529d
                r5 = 2131834820(0x7f1137c4, float:1.9302761E38)
                lh2.z0 r6 = lh2.C10528z0.f31795d
                r9 = 0
                r1.mo142015b(r3, r9, r5, r6)
                r2.f291530e = r1
                if (r7 == 0) goto L_0x0440
                boolean r1 = r7.f163818j
                if (r1 != 0) goto L_0x0440
                java.lang.String r1 = "checkAudioCache false"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
                jh2.m r1 = jh2.C60863m.f173404c
                android.content.Context r3 = r2.f291529d
                lh2.c1 r4 = new lh2.c1
                r4.<init>(r7, r8, r2)
                r1.mo85768b(r3, r7, r4)
                goto L_0x0448
            L_0x0440:
                java.lang.String r1 = "checkAudioCache done"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
                r8.invoke()
            L_0x0448:
                th2.f r1 = th2.C101891f.f300035a
                r2 = 0
                r1.mo141379m(r2)
                goto L_0x0452
            L_0x044f:
                r1.invoke()
            L_0x0452:
                rx3.b0 r1 = rx3.C13598b0.f38549a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: lh2.C99431f1.C99436e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C99431f1(Context context) {
        Context context2 = context;
        C87412m.m108594g(context2, "context");
        this.f291529d = context2;
        C97882i.C97883a aVar = r2;
        C97882i.C97883a aVar2 = new C97882i.C97883a(0, 0, 0, 0, 0, 0, 0, 0, false, false, 0, 0, 0, 8191, (C8480h) null);
        this.f291535j = aVar;
        this.f291537o = C53930o0.m60561h(C53930o0.m60555b(), C53959v2.m60598a((C53973z1) null, 1, (Object) null));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: fy3.a} */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0062, code lost:
        if (((lh2.C99431f1) r7) != null) goto L_0x0066;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m129760a(lh2.C99431f1 r5, fy3.C32224a r6, wx3.C15601d r7) {
        /*
            r5.getClass()
            boolean r0 = r7 instanceof lh2.C99429e1
            if (r0 == 0) goto L_0x0016
            r0 = r7
            lh2.e1 r0 = (lh2.C99429e1) r0
            int r1 = r0.f291527i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.f291527i = r1
            goto L_0x001b
        L_0x0016:
            lh2.e1 r0 = new lh2.e1
            r0.<init>(r5, r7)
        L_0x001b:
            java.lang.Object r7 = r0.f291525g
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f291527i
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0040
            if (r2 != r3) goto L_0x0038
            java.lang.Object r5 = r0.f291524f
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r5 = (com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider) r5
            java.lang.Object r5 = r0.f291523e
            r6 = r5
            fy3.a r6 = (fy3.C32224a) r6
            java.lang.Object r5 = r0.f291522d
            lh2.f1 r5 = (lh2.C99431f1) r5
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x0060
        L_0x0038:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0040:
            kotlin.ResultKt.throwOnFailure(r7)
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r7 = r5.f291532g
            if (r7 == 0) goto L_0x0094
            fh2.i$a r2 = r5.f291535j
            boolean r2 = r2.f287160j
            if (r2 != 0) goto L_0x0066
            boolean r2 = r7.f272918T
            if (r2 == 0) goto L_0x0066
            r0.f291522d = r5
            r0.f291523e = r6
            r0.f291524f = r7
            r0.f291527i = r3
            java.lang.Object r7 = r5.mo138870d(r6, r0)
            if (r7 != r1) goto L_0x0060
            goto L_0x0098
        L_0x0060:
            lh2.f1 r7 = (lh2.C99431f1) r7
            if (r7 != 0) goto L_0x0066
        L_0x0064:
            r1 = r4
            goto L_0x0098
        L_0x0066:
            fh2.i$a r7 = r5.f291535j
            boolean r0 = r7.f287159i
            if (r0 == 0) goto L_0x0074
            boolean r7 = r7.f287160j
            if (r7 != 0) goto L_0x0094
            boolean r7 = l80.C99346b.f291328a
            if (r7 == 0) goto L_0x0094
        L_0x0074:
            fh2.i r7 = r5.f291534i
            if (r7 == 0) goto L_0x007b
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo r7 = r7.f287142b
            goto L_0x007c
        L_0x007b:
            r7 = r4
        L_0x007c:
            if (r7 != 0) goto L_0x0094
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel r6 = r5.mo138874i()
            if (r6 != 0) goto L_0x0085
            goto L_0x0064
        L_0x0085:
            r5.mo138872g(r6)
            th2.f r5 = th2.C101891f.f300035a
            r6 = 2
            r5.mo141379m(r6)
            r6 = 1
            r5.mo141375i(r3, r6)
            goto L_0x0064
        L_0x0094:
            r6.invoke()
            r1 = r5
        L_0x0098:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: lh2.C99431f1.m129760a(lh2.f1, fy3.a, wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0031, code lost:
        if ((r0 != null ? r0.isShowing() : false) == true) goto L_0x0035;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m129761b(lh2.C99431f1 r3) {
        /*
            android.content.Context r0 = r3.f291529d
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0041
            java.lang.String r1 = "null cannot be cast to non-null type android.app.Activity"
            gy3.C87412m.m108592e(r0, r1)
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L_0x0041
            android.content.Context r0 = r3.f291529d
            gy3.C87412m.m108592e(r0, r1)
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isDestroyed()
            if (r0 != 0) goto L_0x0041
            wh2.b r0 = r3.f291530e
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0034
            qo3.i0 r0 = r0.f301696a
            if (r0 == 0) goto L_0x0030
            boolean r0 = r0.isShowing()
            goto L_0x0031
        L_0x0030:
            r0 = 0
        L_0x0031:
            if (r0 != r1) goto L_0x0034
            goto L_0x0035
        L_0x0034:
            r1 = 0
        L_0x0035:
            if (r1 == 0) goto L_0x0041
            wh2.b r0 = r3.f291530e
            if (r0 == 0) goto L_0x003e
            r0.mo142014a()
        L_0x003e:
            r0 = 0
            r3.f291530e = r0
        L_0x0041:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lh2.C99431f1.m129761b(lh2.f1):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0015, code lost:
        r1 = r1.f272926n;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo138869c(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r5)
            if (r0 == 0) goto L_0x0009
            com.tencent.p014mm.vfs.C86013q1.m106447h(r5)
        L_0x0009:
            android.graphics.Bitmap r4 = f72.C97842b.m126300q(r4)
            if (r4 == 0) goto L_0x0029
            hi2.h r0 = hi2.C98453h.f288774a
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r1 = r3.f291532g
            if (r1 == 0) goto L_0x001c
            com.tencent.mm.modelcontrol.VideoTransPara r1 = r1.f272926n
            if (r1 == 0) goto L_0x001c
            int r1 = r1.f267179t
            goto L_0x001d
        L_0x001c:
            r1 = 0
        L_0x001d:
            android.graphics.Bitmap r4 = r0.mo137807e(r4, r1)
            r0 = 60
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG
            r2 = 1
            com.tencent.p014mm.sdk.platformtools.BitmapUtil.saveBitmapToImage(r4, r0, r1, r5, r2)
        L_0x0029:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lh2.C99431f1.mo138869c(java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo138870d(fy3.C32224a<rx3.C13598b0> r11, wx3.C15601d<? super lh2.C99431f1> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof lh2.C99431f1.C99432a
            if (r0 == 0) goto L_0x0013
            r0 = r12
            lh2.f1$a r0 = (lh2.C99431f1.C99432a) r0
            int r1 = r0.f291544h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f291544h = r1
            goto L_0x0018
        L_0x0013:
            lh2.f1$a r0 = new lh2.f1$a
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r12 = r0.f291542f
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f291544h
            java.lang.String r3 = "MicroMsg.RemuxPlugin"
            r4 = 0
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 != r6) goto L_0x0034
            java.lang.Object r11 = r0.f291541e
            fy3.a r11 = (fy3.C32224a) r11
            java.lang.Object r0 = r0.f291540d
            lh2.f1 r0 = (lh2.C99431f1) r0
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x00b4
        L_0x0034:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x003c:
            kotlin.ResultKt.throwOnFailure(r12)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r2 = "checkThirdPartyVideo change:"
            r12.append(r2)
            fh2.i$a r2 = r10.f291535j
            boolean r2 = r2.f287160j
            r12.append(r2)
            java.lang.String r2 = ", check:"
            r12.append(r2)
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r2 = r10.f291532g
            if (r2 == 0) goto L_0x0060
            boolean r2 = r2.f272918T
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            goto L_0x0061
        L_0x0060:
            r2 = r5
        L_0x0061:
            r12.append(r2)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r12)
            fh2.i$a r12 = r10.f291535j
            boolean r12 = r12.f287160j
            if (r12 != 0) goto L_0x00f3
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r12 = r10.f291532g
            if (r12 == 0) goto L_0x007b
            boolean r12 = r12.f272918T
            if (r12 != r6) goto L_0x007b
            r12 = 1
            goto L_0x007c
        L_0x007b:
            r12 = 0
        L_0x007c:
            if (r12 == 0) goto L_0x00f3
            h90.b r12 = r10.f291531f
            if (r12 == 0) goto L_0x00f2
            java.lang.String r12 = r12.f288180a
            if (r12 != 0) goto L_0x0087
            goto L_0x00f2
        L_0x0087:
            wh2.b r2 = r10.f291530e
            if (r2 == 0) goto L_0x008e
            r2.mo142014a()
        L_0x008e:
            wh2.b r2 = new wh2.b
            r2.<init>()
            android.content.Context r7 = r10.f291529d
            r8 = 2131834820(0x7f1137c4, float:1.9302761E38)
            lh2.f1$b r9 = lh2.C99431f1.C99433b.f291545d
            r2.mo142015b(r7, r4, r8, r9)
            r10.f291530e = r2
            r0.f291540d = r10
            r0.f291541e = r11
            r0.f291544h = r6
            a14.h0 r2 = a14.C53872d1.f151119c
            hi2.s r7 = new hi2.s
            r7.<init>(r12, r5)
            java.lang.Object r12 = a14.C53895h.m60469g(r2, r7, r0)
            if (r12 != r1) goto L_0x00b3
            return r1
        L_0x00b3:
            r0 = r10
        L_0x00b4:
            hi2.r r12 = (hi2.C46073r) r12
            if (r12 != 0) goto L_0x00b9
            return r0
        L_0x00b9:
            boolean r1 = r12.f124221a
            if (r1 == 0) goto L_0x00f4
            java.lang.String r1 = r12.f124222b
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x00c6
            r4 = 1
        L_0x00c6:
            if (r4 == 0) goto L_0x00f4
            java.lang.String r1 = "check is thirdparty video, pass result"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel r1 = r0.mo138874i()
            if (r1 != 0) goto L_0x00d4
            return r5
        L_0x00d4:
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager r2 = com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager.f272890c
            android.os.Bundle r2 = r2.f272892b
            java.lang.String r12 = r12.f124222b
            java.lang.String r3 = "kThirdPartyVideoExtData"
            r2.putString(r3, r12)
            r0.mo138872g(r1)
            th2.f r12 = th2.C101891f.f300035a
            r0 = 3
            r12.mo141379m(r0)
            r0 = 1
            r12.mo141375i(r6, r0)
            r11.invoke()
            return r5
        L_0x00f2:
            return r10
        L_0x00f3:
            r0 = r10
        L_0x00f4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: lh2.C99431f1.mo138870d(fy3.a, wx3.d):java.lang.Object");
    }

    /* renamed from: e */
    public boolean mo78564e() {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02f0, code lost:
        if (r4.f272905F == 1) goto L_0x02f4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x023b  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0281  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x028d  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x02a9  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x02ae  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x02b7  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x02d7  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x02d9  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x02de  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x02eb  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x035a  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x035d  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0229  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.tencent.p014mm.plugin.recordvideo.background.VideoMixer mo138871f(fh2.C97882i r39, fh2.C97882i.C97883a r40) {
        /*
            r38 = this;
            r0 = r38
            r1 = r39
            r2 = r40
            java.lang.Class<h81.h> r3 = h81.C32735h.class
            long r4 = java.lang.System.currentTimeMillis()
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r6 = r0.f291532g
            if (r6 == 0) goto L_0x0013
            java.lang.String r6 = r6.f272901B
            goto L_0x0014
        L_0x0013:
            r6 = 0
        L_0x0014:
            java.lang.String r8 = ""
            if (r6 != 0) goto L_0x0049
            hi2.h r6 = hi2.C98453h.f288774a
            java.lang.String r6 = java.lang.String.valueOf(r4)
            if (r6 != 0) goto L_0x0022
            r14 = r8
            goto L_0x004a
        L_0x0022:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = hi2.C98453h.f288776c
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r10)
            r11.append(r6)
            java.lang.String r6 = ".v"
            r11.append(r6)
            java.lang.String r6 = r11.toString()
            r9.append(r6)
            java.lang.String r6 = ".mixv"
            r9.append(r6)
            java.lang.String r6 = r9.toString()
        L_0x0049:
            r14 = r6
        L_0x004a:
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r6 = r0.f291532g
            if (r6 == 0) goto L_0x0051
            java.lang.String r6 = r6.f272902C
            goto L_0x0052
        L_0x0051:
            r6 = 0
        L_0x0052:
            if (r6 != 0) goto L_0x0087
            hi2.h r6 = hi2.C98453h.f288774a
            java.lang.String r4 = java.lang.String.valueOf(r4)
            if (r4 != 0) goto L_0x005e
            r4 = r8
            goto L_0x0085
        L_0x005e:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = hi2.C98453h.f288776c
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r6)
            r9.append(r4)
            java.lang.String r4 = ".p"
            r9.append(r4)
            java.lang.String r4 = r9.toString()
            r5.append(r4)
            java.lang.String r4 = ".mixt"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
        L_0x0085:
            r15 = r4
            goto L_0x0088
        L_0x0087:
            r15 = r6
        L_0x0088:
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r4 = r0.f291532g
            r5 = 0
            if (r4 == 0) goto L_0x0090
            int r4 = r4.f272905F
            goto L_0x0091
        L_0x0090:
            r4 = 0
        L_0x0091:
            java.lang.String r6 = ", deviceUseX264Encode:"
            r9 = -1
            java.lang.String r13 = "MicroMsg.RemuxPlugin"
            r12 = 2
            r11 = 1
            if (r4 == r11) goto L_0x00dd
            if (r4 == r12) goto L_0x00a3
            r10 = 11
            if (r4 == r10) goto L_0x00a3
            r9 = 0
            goto L_0x0116
        L_0x00a3:
            di3.d r10 = di3.C86312j.m106911c(r3)
            h81.h r10 = (h81.C32735h) r10
            h81.h$c r7 = h81.C32735h.C32737c.clicfg_sns_video_edit_remux_encoder_usex264
            int r7 = r10.mo58779Qe(r7, r5)
            if (r7 != r11) goto L_0x00b3
            r7 = 1
            goto L_0x00b4
        L_0x00b3:
            r7 = 0
        L_0x00b4:
            gj.b0 r10 = p156gj.C107835h0.f322852i
            int r10 = r10.f322677z
            if (r10 == r9) goto L_0x00c0
            if (r10 != r11) goto L_0x00be
            r9 = 1
            goto L_0x00c1
        L_0x00be:
            r9 = 0
            goto L_0x00c1
        L_0x00c0:
            r9 = r7
        L_0x00c1:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r11 = "sns config use x264 encode: "
            r12.append(r11)
            r12.append(r7)
            r12.append(r6)
            r12.append(r10)
            java.lang.String r6 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r6)
            goto L_0x0116
        L_0x00dd:
            di3.d r7 = di3.C86312j.m106911c(r3)
            h81.h r7 = (h81.C32735h) r7
            h81.h$c r10 = h81.C32735h.C32737c.clicfg_c2c_video_edit_remux_encoder_usex264
            int r7 = r7.mo58779Qe(r10, r5)
            r10 = 1
            if (r7 != r10) goto L_0x00ee
            r7 = 1
            goto L_0x00ef
        L_0x00ee:
            r7 = 0
        L_0x00ef:
            gj.b0 r11 = p156gj.C107835h0.f322852i
            int r11 = r11.f322676y
            if (r11 == r9) goto L_0x00fb
            if (r11 != r10) goto L_0x00f9
            r9 = 1
            goto L_0x00fc
        L_0x00f9:
            r9 = 0
            goto L_0x00fc
        L_0x00fb:
            r9 = r7
        L_0x00fc:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r12 = "c2c config use x264 encode: "
            r10.append(r12)
            r10.append(r7)
            r10.append(r6)
            r10.append(r11)
            java.lang.String r6 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r6)
        L_0x0116:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r6 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getSingleDefault()
            java.lang.String r7 = "mediacodec_create_error"
            boolean r6 = r6.getBoolean(r7, r5)
            if (r6 == 0) goto L_0x0125
            r10 = 1
            goto L_0x0126
        L_0x0125:
            r10 = r9
        L_0x0126:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "final useX264Encode: "
            r6.append(r7)
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r6)
            th2.f r6 = th2.C101891f.f300035a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "setUseSoftEncode >> "
            r6.append(r7)
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "MicroMsg.VideoWidgetReporter"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r6)
            com.tencent.mm.autogen.mmdata.rpt.SightVideoLogStruct r6 = th2.C101891f.f300036b
            if (r10 == 0) goto L_0x015b
            java.lang.String r9 = "x264"
            goto L_0x015e
        L_0x015b:
            java.lang.String r9 = "mediacodec"
        L_0x015e:
            java.lang.String r11 = "RemuxType"
            r12 = 1
            java.lang.String r9 = r6.mo86045b(r11, r9, r12)
            r6.f265869C = r9
            boolean r6 = com.tencent.p014mm.plugin.sight.base.C85456b.m105451d()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "isUseFFmpeg >> "
            r9.append(r11)
            r9.append(r6)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r9)
            com.tencent.mm.autogen.mmdata.rpt.SightVideoLogStruct r9 = th2.C101891f.f300036b
            if (r6 == 0) goto L_0x0187
            java.lang.String r6 = "ffmpeg"
            goto L_0x018a
        L_0x0187:
            java.lang.String r6 = "mp4v2"
        L_0x018a:
            java.lang.String r11 = "RemuxMuxerType"
            r12 = 1
            java.lang.String r6 = r9.mo86045b(r11, r6, r12)
            r9.f265868B = r6
            r6 = 2
            if (r4 == r12) goto L_0x019c
            if (r4 == r6) goto L_0x019c
            r5 = r10
            r18 = 0
            goto L_0x0207
        L_0x019c:
            fh2.e r9 = fh2.C32051e.f85290a
            boolean r11 = r9.mo58472c(r12, r4)
            boolean r9 = r9.mo58472c(r5, r4)
            if (r10 == 0) goto L_0x01aa
            if (r11 != 0) goto L_0x01ae
        L_0x01aa:
            if (r11 != 0) goto L_0x01ae
            if (r9 == 0) goto L_0x01af
        L_0x01ae:
            r5 = 1
        L_0x01af:
            if (r10 != 0) goto L_0x01b6
            if (r11 == 0) goto L_0x01b4
            goto L_0x01b6
        L_0x01b4:
            r10 = 0
            goto L_0x01b7
        L_0x01b6:
            r10 = 1
        L_0x01b7:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r12 = "checkEnableHevc, hwEnableHevc:"
            r6.append(r12)
            r6.append(r9)
            java.lang.String r9 = ", swEnableHevc:"
            r6.append(r9)
            r6.append(r11)
            java.lang.String r9 = ", enableHevc:"
            r6.append(r9)
            r6.append(r5)
            java.lang.String r9 = ", useSoftEncode:"
            r6.append(r9)
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r6)
            if (r5 == 0) goto L_0x0204
            if (r10 == 0) goto L_0x01e9
            r6 = 1
            goto L_0x01ea
        L_0x01e9:
            r6 = 2
        L_0x01ea:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "setRemuxHevcEncode:"
            r9.append(r11)
            r9.append(r6)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r9)
            com.tencent.mm.autogen.mmdata.rpt.SightVideoLogStruct r7 = th2.C101891f.f300036b
            long r11 = (long) r6
            r7.f265885S = r11
        L_0x0204:
            r18 = r5
            r5 = r10
        L_0x0207:
            fh2.c r10 = new fh2.c
            r10.<init>()
            h90.b r6 = r0.f291531f
            if (r6 == 0) goto L_0x0214
            java.lang.String r7 = r6.f288180a
            if (r7 != 0) goto L_0x0215
        L_0x0214:
            r7 = r8
        L_0x0215:
            r10.f287128d = r7
            if (r6 == 0) goto L_0x021d
            java.lang.String r9 = r6.f288181b
            if (r9 != 0) goto L_0x021e
        L_0x021d:
            r9 = r8
        L_0x021e:
            r10.f287129e = r9
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo r9 = r1.f287142b
            r10.f287134j = r9
            boolean r11 = r1.f287141a
            r12 = 3
            if (r11 == 0) goto L_0x022f
            if (r9 != 0) goto L_0x022d
            r9 = 0
            goto L_0x0234
        L_0x022d:
            r9 = 2
            goto L_0x0234
        L_0x022f:
            if (r9 != 0) goto L_0x0233
            r9 = 1
            goto L_0x0234
        L_0x0233:
            r9 = 3
        L_0x0234:
            r10.f287133i = r9
            if (r6 == 0) goto L_0x023b
            boolean r6 = r6.f288182c
            goto L_0x023c
        L_0x023b:
            r6 = 1
        L_0x023c:
            r10.f287132h = r6
            int r6 = com.tencent.p014mm.plugin.sight.base.SightVideoJNI.getMp4RotateVFS(r7)
            r10.f287135n = r6
            int r6 = r1.f287146f
            long r6 = (long) r6
            r10.f287130f = r6
            int r6 = r1.f287147g
            long r6 = (long) r6
            r10.f287131g = r6
            java.util.ArrayList<java.lang.String> r6 = r1.f287148h
            java.lang.String r7 = "<set-?>"
            gy3.C87412m.m108594g(r6, r7)
            r10.f287136o = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "getTransformInfo :"
            r6.append(r7)
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r6)
            if (r4 != r12) goto L_0x0298
            java.lang.String r4 = r10.f287128d
            boolean r4 = com.tencent.p014mm.vfs.C86013q1.m106450k(r4)
            if (r4 != 0) goto L_0x0298
            boolean r4 = r10.f287132h
            java.lang.String r6 = "MicroMsg.StoryRemuxDetailIDKeyStat"
            java.lang.String r7 = "markMixVideoNotExist"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)
            if (r4 == 0) goto L_0x028d
            com.tencent.mm.plugin.report.service.n r23 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r24 = 1005(0x3ed, double:4.965E-321)
            r26 = 5
            r28 = 1
            r23.mo175913w(r24, r26, r28)
            goto L_0x0298
        L_0x028d:
            com.tencent.mm.plugin.report.service.n r30 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r31 = 1005(0x3ed, double:4.965E-321)
            r33 = 6
            r35 = 1
            r30.mo175913w(r31, r33, r35)
        L_0x0298:
            ah2.a r4 = new ah2.a
            java.util.ArrayList<bi2.a> r11 = r1.f287143c
            float[] r12 = r1.f287145e
            float[] r6 = r1.f287150j
            r7 = 0
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r9 = r0.f291532g
            if (r9 == 0) goto L_0x02ae
            com.tencent.mm.modelcontrol.VideoTransPara r9 = r9.f272926n
            if (r9 == 0) goto L_0x02ae
            int r9 = r9.f267179t
            r19 = r9
            goto L_0x02b0
        L_0x02ae:
            r19 = 0
        L_0x02b0:
            java.lang.String r9 = r1.f287149i
            if (r9 != 0) goto L_0x02b7
            r20 = r8
            goto L_0x02b9
        L_0x02b7:
            r20 = r9
        L_0x02b9:
            r21 = 64
            r22 = 0
            r9 = r4
            r8 = 1
            r8 = 2
            r37 = r13
            r13 = r6
            r16 = r7
            r17 = r5
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            com.tencent.mm.plugin.recordvideo.background.VideoMixer r5 = new com.tencent.mm.plugin.recordvideo.background.VideoMixer
            r5.<init>(r4)
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r4 = r0.f291532g
            if (r4 == 0) goto L_0x02d9
            int r6 = r4.f272905F
            if (r6 != r8) goto L_0x02d9
            r11 = 1
            goto L_0x02da
        L_0x02d9:
            r11 = 0
        L_0x02da:
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r11 == 0) goto L_0x02eb
            di3.d r3 = di3.C86312j.m106911c(r3)
            h81.h r3 = (h81.C32735h) r3
            h81.h$c r4 = h81.C32735h.C32737c.clicfg_sns_generate_multiple_kbps
            float r6 = r3.mo58785xe(r4, r6)
            goto L_0x0302
        L_0x02eb:
            if (r4 == 0) goto L_0x02f3
            int r4 = r4.f272905F
            r7 = 1
            if (r4 != r7) goto L_0x02f3
            goto L_0x02f4
        L_0x02f3:
            r7 = 0
        L_0x02f4:
            if (r7 == 0) goto L_0x0302
            di3.d r3 = di3.C86312j.m106911c(r3)
            h81.h r3 = (h81.C32735h) r3
            h81.h$c r4 = h81.C32735h.C32737c.clicfg_c2c_generate_multiple_kbps
            float r6 = r3.mo58785xe(r4, r6)
        L_0x0302:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "final kbps: "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r4 = "  "
            r3.append(r4)
            int r4 = r2.f287153c
            float r4 = (float) r4
            float r4 = r4 * r6
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r4 = r37
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            int r3 = r2.f287151a
            int r4 = r2.f287152b
            int r7 = r2.f287153c
            float r7 = (float) r7
            float r7 = r7 * r6
            int r6 = (int) r7
            int r7 = r2.f287154d
            int r8 = r2.f287157g
            int r9 = r2.f287158h
            int r10 = r2.f287155e
            int r2 = r2.f287156f
            r33 = 0
            r34 = 0
            r35 = 768(0x300, float:1.076E-42)
            r36 = 0
            r24 = r5
            r25 = r3
            r26 = r4
            r27 = r6
            r28 = r7
            r29 = r8
            r30 = r9
            r31 = r10
            r32 = r2
            com.tencent.p014mm.plugin.recordvideo.background.VideoMixer.m119414j(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r2 = r0.f291532g
            if (r2 == 0) goto L_0x035d
            com.tencent.mm.modelcontrol.VideoTransPara r7 = r2.f272926n
            goto L_0x035e
        L_0x035d:
            r7 = 0
        L_0x035e:
            gy3.C87412m.m108591d(r7)
            int r2 = r1.f287147g
            int r1 = r1.f287146f
            r5.mo129787h(r7, r2, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: lh2.C99431f1.mo138871f(fh2.i, fh2.i$a):com.tencent.mm.plugin.recordvideo.background.VideoMixer");
    }

    /* renamed from: g */
    public final void mo138872g(CaptureDataManager.CaptureVideoNormalModel captureVideoNormalModel) {
        MultiProcessMMKV.getSingleDefault().putBoolean("mediacodec_create_error", false);
        CaptureDataManager.f272890c.mo129794a(this.f291529d, captureVideoNormalModel);
    }

    /* renamed from: h */
    public final void mo138873h(C97882i.C97883a aVar) {
        int i;
        int i2;
        C97882i.C97883a aVar2 = aVar;
        C115669n.INSTANCE.idkeyStat(985, 154, 1, false);
        long currentTicks = Util.currentTicks();
        Log.m105924i("MicroMsg.RemuxPlugin", "start forceRemux");
        StringBuilder sb = new StringBuilder();
        RecordConfigProvider recordConfigProvider = this.f291532g;
        String str = null;
        sb.append(recordConfigProvider != null ? recordConfigProvider.f272901B : null);
        sb.append("_tmp");
        String sb4 = sb.toString();
        RecordConfigProvider recordConfigProvider2 = this.f291532g;
        C87412m.m108591d(recordConfigProvider2);
        if (recordConfigProvider2.f272926n.f267181v == 2) {
            RecordConfigProvider recordConfigProvider3 = this.f291532g;
            C87412m.m108591d(recordConfigProvider3);
            RecordConfigProvider recordConfigProvider4 = this.f291532g;
            C87412m.m108591d(recordConfigProvider4);
            Log.m105925i("MicroMsg.RemuxPlugin", "ABA: Using Min Max QP Limitation: [%d], [%d] ", Integer.valueOf(recordConfigProvider3.f272926n.f267157D), Integer.valueOf(recordConfigProvider4.f272926n.f267158E));
            RecordConfigProvider recordConfigProvider5 = this.f291532g;
            C87412m.m108591d(recordConfigProvider5);
            int i3 = recordConfigProvider5.f272926n.f267157D;
            RecordConfigProvider recordConfigProvider6 = this.f291532g;
            C87412m.m108591d(recordConfigProvider6);
            i2 = recordConfigProvider6.f272926n.f267158E;
            i = i3;
        } else {
            i2 = 51;
            i = 0;
        }
        RecordConfigProvider recordConfigProvider7 = this.f291532g;
        String str2 = recordConfigProvider7 != null ? recordConfigProvider7.f272901B : null;
        int i4 = aVar2.f287151a;
        int i5 = aVar2.f287152b;
        int i6 = aVar2.f287153c;
        C87412m.m108591d(recordConfigProvider7);
        int i7 = recordConfigProvider7.f272926n.f267177r;
        RecordConfigProvider recordConfigProvider8 = this.f291532g;
        C87412m.m108591d(recordConfigProvider8);
        int i8 = i;
        int remuxingVFS = SightVideoJNI.remuxingVFS(str2, sb4, i4, i5, i6, i7, 8, recordConfigProvider8.f272926n.f267176q, 25.0f, (float) aVar2.f287155e, (byte[]) null, 0, false, i8, i2);
        RecordConfigProvider recordConfigProvider9 = this.f291532g;
        if (recordConfigProvider9 != null) {
            str = recordConfigProvider9.f272901B;
        }
        C86013q1.m106442c(sb4, str);
        C86013q1.m106447h(sb4);
        long ticksToNow = Util.ticksToNow(currentTicks);
        Log.m105924i("MicroMsg.RemuxPlugin", "minQP :" + i8 + "  maxQP :" + i2 + "  duration:" + remuxingVFS + " cost:" + ticksToNow);
        C115669n.INSTANCE.idkeyStat(985, 155, ticksToNow, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x011b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager.CaptureVideoNormalModel mo138874i() {
        /*
            r25 = this;
            r0 = r25
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r1 = r0.f291532g
            r2 = 0
            if (r1 == 0) goto L_0x0182
            h90.b r3 = r0.f291531f
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x0013
            boolean r3 = r3.f288182c
            if (r3 != r5) goto L_0x0013
            r3 = 1
            goto L_0x0014
        L_0x0013:
            r3 = 0
        L_0x0014:
            java.lang.String r6 = "key_is_photo_video"
            java.lang.String r7 = "key_is_capture_video"
            java.lang.String r8 = "this.thumbPath"
            if (r3 == 0) goto L_0x00aa
            int r2 = r1.f272905F
            r3 = 2
            if (r2 != r3) goto L_0x0032
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 985(0x3d9, double:4.867E-321)
            r12 = 135(0x87, double:6.67E-322)
            r14 = 1
            r16 = 0
            r9.idkeyStat(r10, r12, r14, r16)
            goto L_0x0041
        L_0x0032:
            if (r2 != r5) goto L_0x0041
            com.tencent.mm.plugin.report.service.n r17 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r18 = 985(0x3d9, double:4.867E-321)
            r20 = 136(0x88, double:6.7E-322)
            r22 = 1
            r24 = 0
            r17.idkeyStat(r18, r20, r22, r24)
        L_0x0041:
            hi2.h r2 = hi2.C98453h.f288774a
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r3 = r0.f291532g
            r2.mo137816n(r3, r5)
            java.lang.String r2 = r1.f272901B
            java.lang.String r3 = "this.outputVideoPath"
            gy3.C87412m.m108593f(r2, r3)
            java.lang.String r9 = r1.f272902C
            gy3.C87412m.m108593f(r9, r8)
            r0.mo138869c(r2, r9)
            java.lang.String r2 = r1.f272901B
            gy3.C87412m.m108593f(r2, r3)
            r0.mo138877l(r2)
            h90.b r2 = r0.f291531f
            if (r2 == 0) goto L_0x0081
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager r3 = com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager.f272890c
            android.os.Bundle r3 = r3.f272892b
            boolean r8 = r2.f288182c
            r3.putBoolean(r7, r8)
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager r3 = com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager.f272890c
            android.os.Bundle r3 = r3.f272892b
            java.util.ArrayList<java.lang.String> r2 = r2.f288190k
            if (r2 == 0) goto L_0x007b
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x007c
        L_0x007b:
            r4 = 1
        L_0x007c:
            r2 = r4 ^ 1
            r3.putBoolean(r6, r2)
        L_0x0081:
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel r2 = new com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            java.lang.String r9 = r1.f272901B
            java.lang.String r10 = r1.f272902C
            fh2.i r1 = r0.f291534i
            gy3.C87412m.m108591d(r1)
            int r1 = r1.f287147g
            fh2.i r3 = r0.f291534i
            gy3.C87412m.m108591d(r3)
            int r3 = r3.f287146f
            int r1 = r1 - r3
            long r3 = (long) r1
            java.lang.Long r11 = java.lang.Long.valueOf(r3)
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            th2.d r1 = th2.C110992d.f332425a
            com.tencent.mm.plugin.recordvideo.jumper.RecordMediaReportInfo r13 = r1.mo162676j()
            r7 = r2
            r7.<init>(r8, r9, r10, r11, r12, r13)
            return r2
        L_0x00aa:
            r3 = 30
            boolean r3 = p206nj.C11171e.m11046c(r3)
            if (r3 == 0) goto L_0x00d1
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            h90.b r9 = r0.f291531f
            if (r9 == 0) goto L_0x00bd
            java.lang.String r9 = r9.f288180a
            goto L_0x00be
        L_0x00bd:
            r9 = r2
        L_0x00be:
            android.net.Uri r3 = com.tencent.p014mm.sdk.platformtools.ScopedStorageUtil.Imports.getVideoExternalUri(r3, r9)
            if (r3 == 0) goto L_0x00ca
            java.lang.String r3 = r3.toString()
            if (r3 != 0) goto L_0x00d9
        L_0x00ca:
            h90.b r3 = r0.f291531f
            if (r3 == 0) goto L_0x00d8
            java.lang.String r3 = r3.f288180a
            goto L_0x00d9
        L_0x00d1:
            h90.b r3 = r0.f291531f
            if (r3 == 0) goto L_0x00d8
            java.lang.String r3 = r3.f288180a
            goto L_0x00d9
        L_0x00d8:
            r3 = r2
        L_0x00d9:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "checkNoNeedRemuxVideo uriPath:"
            r9.append(r10)
            r9.append(r3)
            java.lang.String r9 = r9.toString()
            java.lang.String r10 = "MicroMsg.RemuxPlugin"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r9)
            if (r3 == 0) goto L_0x0182
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r9 = r0.f291532g
            if (r9 == 0) goto L_0x00f8
            java.lang.String r9 = r9.f272901B
            goto L_0x00f9
        L_0x00f8:
            r9 = r2
        L_0x00f9:
            long r11 = com.tencent.p014mm.vfs.C86013q1.m106443d(r3, r9, r4)
            r13 = 0
            int r9 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r9 < 0) goto L_0x010c
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r3 = r0.f291532g
            if (r3 == 0) goto L_0x010a
            java.lang.String r3 = r3.f272901B
            goto L_0x010c
        L_0x010a:
            r13 = r2
            goto L_0x010d
        L_0x010c:
            r13 = r3
        L_0x010d:
            if (r13 == 0) goto L_0x0118
            int r3 = r13.length()
            if (r3 != 0) goto L_0x0116
            goto L_0x0118
        L_0x0116:
            r3 = 0
            goto L_0x0119
        L_0x0118:
            r3 = 1
        L_0x0119:
            if (r3 == 0) goto L_0x011c
            return r2
        L_0x011c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "checkNoNeedRemuxVideo, targetVideoPath:"
            r2.append(r3)
            r2.append(r13)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r2)
            java.lang.String r2 = r1.f272902C
            gy3.C87412m.m108593f(r2, r8)
            r0.mo138869c(r13, r2)
            r0.mo138877l(r13)
            h90.b r2 = r0.f291531f
            if (r2 == 0) goto L_0x015c
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager r3 = com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager.f272890c
            android.os.Bundle r3 = r3.f272892b
            boolean r8 = r2.f288182c
            r3.putBoolean(r7, r8)
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager r3 = com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager.f272890c
            android.os.Bundle r3 = r3.f272892b
            java.util.ArrayList<java.lang.String> r2 = r2.f288190k
            if (r2 == 0) goto L_0x0156
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0157
        L_0x0156:
            r4 = 1
        L_0x0157:
            r2 = r4 ^ 1
            r3.putBoolean(r6, r2)
        L_0x015c:
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel r2 = new com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            java.lang.String r14 = r1.f272902C
            fh2.i r1 = r0.f291534i
            gy3.C87412m.m108591d(r1)
            int r1 = r1.f287147g
            fh2.i r3 = r0.f291534i
            gy3.C87412m.m108591d(r3)
            int r3 = r3.f287146f
            int r1 = r1 - r3
            long r3 = (long) r1
            java.lang.Long r15 = java.lang.Long.valueOf(r3)
            java.lang.Boolean r16 = java.lang.Boolean.FALSE
            th2.d r1 = th2.C110992d.f332425a
            com.tencent.mm.plugin.recordvideo.jumper.RecordMediaReportInfo r17 = r1.mo162676j()
            r11 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17)
        L_0x0182:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: lh2.C99431f1.mo138874i():com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel");
    }

    /* renamed from: j */
    public final void mo138875j(VideoMixer videoMixer, C97882i iVar, C97882i.C97883a aVar) {
        if (this.f291530e == null) {
            C102446b bVar = new C102446b();
            bVar.mo142015b(this.f291529d, false, C0966R.string.i3k, C99434c.f291546d);
            this.f291530e = bVar;
        }
        C103021n nVar = C103021n.f303991a;
        C99435d dVar = new C99435d(this, aVar, videoMixer, iVar);
        nVar.getClass();
        Log.m105924i("MicroMsg.mix_background.VideoMixHandler", "VideoMixHandler stopBgMix!");
        C103021n.f303996f = dVar;
        C103021n.f303993c = true;
        Iterator<C103021n.C103024b> it = C103021n.f303994d.iterator();
        while (it.hasNext()) {
            C103027q qVar = new C103027q(it.next());
            Pattern pattern = C61926c.f176038a;
            MMHandlerThread.removeRunnable(new C61926c.C35098g(qVar));
        }
        C103021n.f303994d.clear();
        if (!C103021n.f303992b) {
            C32224a<C13598b0> aVar2 = C103021n.f303996f;
            if (aVar2 != null) {
                aVar2.invoke();
            }
            C103021n.f303996f = null;
        }
    }

    /* renamed from: k */
    public final void mo138876k(C98324b bVar, RecordConfigProvider recordConfigProvider) {
        C87412m.m108594g(bVar, "info");
        C87412m.m108594g(recordConfigProvider, "configProvider");
        this.f291531f = bVar;
        this.f291532g = recordConfigProvider;
        C110992d dVar = C110992d.f332425a;
        dVar.mo162677k("KEY_IS_CAPUTRE_BOOLEAN", Boolean.valueOf(bVar.f288182c));
        if (bVar.f288182c) {
            dVar.mo162677k("KEY_CAPUTRE_VIDEO_PATH_STRING", bVar.mo137615e());
            dVar.mo162677k("KEY_CAPUTRE_THUMB_PATH_STRING", bVar.mo137611a() ? bVar.f288181b : bVar.f288186g);
        }
    }

    /* renamed from: l */
    public final void mo138877l(String str) {
        long currentTicks = Util.currentTicks();
        SightVideoJNI.optimizeMP4VFS(str);
        Log.m105924i("MicroMsg.RemuxPlugin", "time cost: " + Util.ticksToNow(currentTicks));
    }

    /* renamed from: m */
    public final void mo138878m(C97882i iVar) {
        boolean z;
        C87412m.m108594g(iVar, "editConfig");
        if (!this.f291533h) {
            z = true;
        } else {
            z = false;
            this.f291533h = false;
        }
        if (z) {
            Log.m105924i("MicroMsg.RemuxPlugin", "is repeat to return");
            return;
        }
        C53973z1 z1Var = this.f291538p;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        this.f291538p = C53895h.m60466d(this.f291537o, (C66212f) null, (C53934p0) null, new C99436e(this, iVar, (C15601d<? super C99436e>) null), 3, (Object) null);
    }

    public String name() {
        return C99431f1.class.getName();
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
        C53973z1 z1Var = this.f291538p;
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
