package bh2;

import android.graphics.Bitmap;
import android.media.MediaFormat;
import android.os.HandlerThread;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sight.base.C94554a;
import com.tencent.p014mm.plugin.sight.base.C94555d;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import fy3.C32224a;
import fy3.C32226l;
import gu3.C107920f;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import k80.C108915a;
import n80.C109697b;
import n80.C109712g;
import o40.C61926c;
import o80.C109993a;
import r80.C110524i0;
import r80.C110533m0;
import r80.C63378g;
import r80.C89903h;
import rx3.C13598b0;
import sx3.C64197v;
import w80.C102360a;
import w80.C102361h;

/* renamed from: bh2.h */
public final class C104119h extends C89903h implements C63378g {

    /* renamed from: A */
    public HandlerThread f308053A;

    /* renamed from: B */
    public boolean f308054B;

    /* renamed from: C */
    public boolean f308055C;

    /* renamed from: D */
    public C32226l<? super Long, Bitmap> f308056D;

    /* renamed from: E */
    public C110524i0 f308057E;

    /* renamed from: F */
    public long f308058F;

    /* renamed from: G */
    public final C102360a f308059G;

    /* renamed from: H */
    public boolean f308060H;

    /* renamed from: I */
    public boolean f308061I;

    /* renamed from: J */
    public boolean f308062J;

    /* renamed from: K */
    public int f308063K;

    /* renamed from: L */
    public int f308064L;

    /* renamed from: M */
    public int f308065M;

    /* renamed from: N */
    public volatile boolean f308066N;

    /* renamed from: O */
    public volatile boolean f308067O;

    /* renamed from: P */
    public final Runnable f308068P;

    /* renamed from: a */
    public final String f308069a;

    /* renamed from: b */
    public ArrayList<String> f308070b;

    /* renamed from: c */
    public int f308071c;

    /* renamed from: d */
    public final String f308072d;

    /* renamed from: e */
    public int f308073e;

    /* renamed from: f */
    public int f308074f;

    /* renamed from: g */
    public int f308075g;

    /* renamed from: h */
    public int f308076h;

    /* renamed from: i */
    public int f308077i;

    /* renamed from: j */
    public int f308078j;

    /* renamed from: k */
    public boolean f308079k;

    /* renamed from: l */
    public C32226l<? super String, C13598b0> f308080l;

    /* renamed from: m */
    public final String f308081m = "MicroMsg.MediaCodecRemuxerFake";

    /* renamed from: n */
    public int f308082n;

    /* renamed from: o */
    public int f308083o;

    /* renamed from: p */
    public int f308084p = -1;

    /* renamed from: q */
    public int f308085q;

    /* renamed from: r */
    public long f308086r;

    /* renamed from: s */
    public long f308087s;

    /* renamed from: t */
    public C104114f f308088t;

    /* renamed from: u */
    public C109697b f308089u;

    /* renamed from: v */
    public C109712g f308090v;

    /* renamed from: w */
    public C108915a f308091w;

    /* renamed from: x */
    public C110533m0 f308092x;

    /* renamed from: y */
    public C109993a f308093y;

    /* renamed from: z */
    public HandlerThread f308094z;

    /* renamed from: bh2.h$a */
    public static final class C104120a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C104119h f308095d;

        public C104120a(C104119h hVar) {
            this.f308095d = hVar;
        }

        public final void run() {
            String str = this.f308095d.f308081m;
            Log.m105924i(str, "decode end after " + 1000 + ", isFinishEncode:" + this.f308095d.f308067O);
            if (!this.f308095d.f308067O) {
                Log.m105924i("MicroMsg.MediaEditorIDKeyStat", "markRemuxEndWithFrameNumberCheckTimeout");
                C115669n.INSTANCE.mo175913w(986, 91, 1);
                this.f308095d.mo145774f();
            }
        }
    }

    /* renamed from: bh2.h$b */
    public static final class C104121b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C104119h f308096d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C104121b(C104119h hVar) {
            super(0);
            this.f308096d = hVar;
        }

        public Object invoke() {
            C104119h hVar = this.f308096d;
            String str = hVar.f308081m;
            Log.m105924i(str, "runAudioMix, mixType:" + hVar.f308071c);
            int i = hVar.f308071c;
            if (i == 1) {
                C110533m0.m150457d(hVar.f308092x, (C109993a) null, 0, 0, 6, (Object) null);
                hVar.mo145775g(false);
            } else {
                if (C64197v.m75537f(2, 3).contains(Integer.valueOf(i))) {
                    try {
                        long currentTicks = Util.currentTicks();
                        C108915a aVar = new C108915a(hVar.f308071c, hVar.f308077i, 1, new C104133s(hVar));
                        hVar.f308091w = aVar;
                        C109993a aVar2 = hVar.f308093y;
                        C110533m0 m0Var = hVar.f308092x;
                        aVar.mo160049j((C109993a) null, aVar2, m0Var.f330529a, m0Var.f330530b);
                        C109993a aVar3 = hVar.f308093y;
                        MediaFormat mediaFormat = aVar3 != null ? aVar3.f329159f : null;
                        C87412m.m108591d(mediaFormat);
                        if (!mediaFormat.containsKey(FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE)) {
                            mediaFormat.setInteger(FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE, hVar.f308076h);
                        }
                        mediaFormat.setInteger("channel-count", 1);
                        C108915a aVar4 = hVar.f308091w;
                        if (aVar4 != null) {
                            aVar4.mo160050k(mediaFormat);
                        }
                        C108915a aVar5 = hVar.f308091w;
                        if (aVar5 != null) {
                            aVar5.mo160052m(new C104134t(hVar, currentTicks));
                        }
                    } catch (Exception e) {
                        String str2 = hVar.f308081m;
                        Log.printErrStackTrace(str2, e, "mix audio error: " + e.getMessage(), new Object[0]);
                        hVar.mo145775g(false);
                    }
                } else if (i == 0) {
                    hVar.mo145775g(false);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: bh2.h$c */
    public static final class C104122c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C104119h f308097d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C104122c(C104119h hVar) {
            super(0);
            this.f308097d = hVar;
        }

        public Object invoke() {
            C104114f fVar = this.f308097d.f308088t;
            if (fVar == null) {
                return null;
            }
            fVar.mo145769e();
            return C13598b0.f38549a;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1.f308081m, r0, "create encoder again error", new java.lang.Object[0]);
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.MediaEditorIDKeyStat", "markRemuxH264EncoderInitFailed");
        r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE;
        r0.mo175913w(986, 16, 1);
        mo145776h(false);
        com.tencent.p014mm.sdk.platformtools.Log.m105918d("MicroMsg.StoryImageVideoIDKey", "markConfigError");
        r0.mo175913w(1092, 11, 1);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x02d7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C104119h(java.lang.String r25, java.util.ArrayList<java.lang.String> r26, int r27, java.lang.String r28, int r29, int r30, int r31, int r32, int r33, int r34, long r35, long r37, boolean r39, fy3.C32226l<? super java.lang.String, rx3.C13598b0> r40) {
        /*
            r24 = this;
            r1 = r24
            r0 = r26
            r2 = r28
            r3 = r35
            r5 = r37
            java.lang.String r7 = "imageList"
            gy3.C87412m.m108594g(r0, r7)
            java.lang.String r7 = "outputFilePath"
            gy3.C87412m.m108594g(r2, r7)
            r24.<init>()
            r7 = r25
            r1.f308069a = r7
            r1.f308070b = r0
            r0 = r27
            r1.f308071c = r0
            r1.f308072d = r2
            r0 = r29
            r1.f308073e = r0
            r0 = r30
            r1.f308074f = r0
            r0 = r31
            r1.f308075g = r0
            r0 = r32
            r1.f308076h = r0
            r0 = r33
            r1.f308077i = r0
            r0 = r34
            r1.f308078j = r0
            r0 = r39
            r1.f308079k = r0
            r0 = r40
            r1.f308080l = r0
            java.lang.String r0 = "MicroMsg.MediaCodecRemuxerFake"
            r1.f308081m = r0
            r0 = -1
            r1.f308084p = r0
            r1.f308086r = r3
            r7 = -1
            r1.f308087s = r7
            w80.a r2 = new w80.a
            java.lang.String r7 = "remuxCost"
            r2.<init>(r7)
            r1.f308059G = r2
            java.util.ArrayList<java.lang.String> r2 = r1.f308070b
            java.util.Iterator r2 = r2.iterator()
        L_0x0061:
            boolean r7 = r2.hasNext()
            r8 = 1
            r9 = 0
            if (r7 == 0) goto L_0x0077
            java.lang.Object r7 = r2.next()
            java.lang.String r7 = (java.lang.String) r7
            boolean r7 = com.tencent.p014mm.vfs.C86013q1.m106450k(r7)
            if (r7 != 0) goto L_0x0061
            r2 = 0
            goto L_0x0078
        L_0x0077:
            r2 = 1
        L_0x0078:
            java.lang.String r7 = "MicroMsg.MediaEditorIDKeyStat"
            if (r2 == 0) goto L_0x039e
            java.lang.String r2 = r1.f308072d
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x039e
            int r2 = r1.f308073e
            if (r2 <= 0) goto L_0x039e
            int r2 = r1.f308074f
            if (r2 <= 0) goto L_0x039e
            w80.h r2 = w80.C102361h.f301459a
            int r10 = r1.f308071c
            r2.mo141932c(r10)
            java.lang.String r2 = r1.f308072d
            java.lang.String r2 = com.tencent.p014mm.vfs.C86013q1.m106458s(r2)
            com.tencent.p014mm.vfs.C86013q1.m106461v(r2)
            fh2.f r2 = fh2.C97881f.f287137a
            r2.mo137202b()
            int r2 = fh2.C97881f.f287139c
            r1.f308082n = r2
            int r2 = fh2.C97881f.f287140d
            r1.f308083o = r2
            r2 = 15
            r1.f308085q = r2
            r2 = 15000(0x3a98, float:2.102E-41)
            r1.f308084p = r2
            r10 = 0
            int r12 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x00bb
            long r10 = (long) r2
            r1.f308087s = r10
            goto L_0x00bd
        L_0x00bb:
            r1.f308087s = r5
        L_0x00bd:
            boolean r2 = r1.f308079k
            if (r2 == 0) goto L_0x0113
            java.lang.String r2 = r1.f308081m
            r10 = 4
            java.lang.Object[] r10 = new java.lang.Object[r10]
            int r11 = r1.f308075g
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r10[r9] = r11
            int r11 = r1.f308073e
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r10[r8] = r11
            r11 = 2
            int r12 = r1.f308074f
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r10[r11] = r12
            r11 = 3
            int r12 = r1.f308078j
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r10[r11] = r12
            java.lang.String r11 = "mixMuxerController init useX264Encode, bitrate %s, width %s, height %s, fps %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r11, r10)
            r80.m0 r2 = new r80.m0
            long r13 = r1.f308086r
            long r10 = r1.f308087s
            int r15 = r1.f308075g
            int r12 = r1.f308073e
            int r0 = r1.f308074f
            boolean r8 = r1.f308079k
            int r9 = r1.f308078j
            float r9 = (float) r9
            r22 = 0
            r23 = 0
            r18 = r12
            r12 = r2
            r17 = r15
            r15 = r10
            r19 = r0
            r20 = r8
            r21 = r9
            r12.<init>(r13, r15, r17, r18, r19, r20, r21, r22, r23)
            goto L_0x012d
        L_0x0113:
            r80.m0 r0 = new r80.m0
            long r13 = r1.f308086r
            long r8 = r1.f308087s
            int r10 = r1.f308075g
            r19 = 0
            r20 = 0
            r21 = 48
            r22 = 0
            r12 = r0
            r15 = r8
            r17 = r10
            r18 = r2
            r12.<init>(r13, r15, r17, r18, r19, r20, r21, r22)
            r2 = r0
        L_0x012d:
            r1.f308092x = r2
            java.lang.String r0 = r1.f308081m
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r8 = "create MediaCodecRemuxer, outputFilePath: "
            r2.append(r8)
            java.lang.String r8 = r1.f308072d
            r2.append(r8)
            java.lang.String r8 = ", inputWidth: "
            r2.append(r8)
            int r8 = r1.f308082n
            r2.append(r8)
            java.lang.String r8 = ", inputHeight: "
            r2.append(r8)
            int r8 = r1.f308083o
            r2.append(r8)
            java.lang.String r8 = ", videoFps: "
            r2.append(r8)
            int r8 = r1.f308085q
            r2.append(r8)
            java.lang.String r8 = " ,outputBitrate :"
            r2.append(r8)
            int r8 = r1.f308075g
            r2.append(r8)
            java.lang.String r8 = ", outputAudioBitrate:"
            r2.append(r8)
            int r8 = r1.f308076h
            r2.append(r8)
            java.lang.String r8 = " , outputWidth: "
            r2.append(r8)
            int r8 = r1.f308073e
            r2.append(r8)
            java.lang.String r8 = ", outputHeight: "
            r2.append(r8)
            int r8 = r1.f308074f
            r2.append(r8)
            java.lang.String r8 = ", startTimeMs: "
            r2.append(r8)
            r2.append(r3)
            java.lang.String r3 = ", endTimeMs: "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r3 = " , outputFps: "
            r2.append(r3)
            int r3 = r1.f308078j
            r2.append(r3)
            java.lang.String r3 = " , videoDuration: "
            r2.append(r3)
            int r3 = r1.f308084p
            r2.append(r3)
            java.lang.String r3 = " , remuxStartTime: "
            r2.append(r3)
            long r3 = r1.f308086r
            r2.append(r3)
            java.lang.String r3 = " ,remuxEndTime: "
            r2.append(r3)
            long r3 = r1.f308087s
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printInfoStack(r0, r2, r4)
            r2 = 0
            r80.i0 r0 = new r80.i0
            r80.m0 r3 = r1.f308092x
            java.lang.String r4 = r1.f308072d
            int r5 = r1.f308071c
            int r6 = r1.f308077i
            r8 = 1
            r9 = 0
            r28 = r0
            r29 = r3
            r30 = r9
            r31 = r4
            r32 = r5
            r33 = r6
            r34 = r8
            r28.<init>(r29, r30, r31, r32, r33, r34)
            r1.f308057E = r0
            java.lang.String r0 = r1.f308069a
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
            if (r0 == 0) goto L_0x0219
            o80.a r0 = new o80.a
            java.lang.String r3 = r1.f308069a
            gy3.C87412m.m108591d(r3)
            r0.<init>(r3)
            boolean r3 = r0.f329164k
            if (r3 == 0) goto L_0x0217
            java.lang.String r3 = "markRemuxMusicMediaExtractorCreateFailed"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r3)
            com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r4 = 986(0x3da, double:4.87E-321)
            r8 = 15
            r10 = 1
            r28 = r3
            r29 = r4
            r31 = r8
            r33 = r10
            r28.mo175913w(r29, r31, r33)
        L_0x0217:
            r1.f308093y = r0
        L_0x0219:
            int r0 = r1.f308078j     // Catch:{ Exception -> 0x038a }
            if (r0 <= 0) goto L_0x0224
            int r3 = r1.f308085q     // Catch:{ Exception -> 0x038a }
            int r0 = java.lang.Math.min(r0, r3)     // Catch:{ Exception -> 0x038a }
            goto L_0x0226
        L_0x0224:
            int r0 = r1.f308085q     // Catch:{ Exception -> 0x038a }
        L_0x0226:
            l80.d r3 = new l80.d     // Catch:{ Exception -> 0x038a }
            r4 = 1
            r5 = 0
            r3.<init>(r5, r4, r2)     // Catch:{ Exception -> 0x038a }
            int r4 = r1.f308075g     // Catch:{ Exception -> 0x038a }
            r3.f327161d = r4     // Catch:{ Exception -> 0x038a }
            r3.f327162e = r0     // Catch:{ Exception -> 0x038a }
            int r0 = r1.f308074f     // Catch:{ Exception -> 0x038a }
            r3.f327160c = r0     // Catch:{ Exception -> 0x038a }
            int r0 = r1.f308073e     // Catch:{ Exception -> 0x038a }
            r3.f327159b = r0     // Catch:{ Exception -> 0x038a }
            r0 = 1
            r3.f327167j = r0     // Catch:{ Exception -> 0x038a }
            bh2.q r4 = new bh2.q     // Catch:{ Exception -> 0x038a }
            r4.<init>(r1)     // Catch:{ Exception -> 0x038a }
            bh2.r r5 = new bh2.r     // Catch:{ Exception -> 0x038a }
            r5.<init>(r1)     // Catch:{ Exception -> 0x038a }
            r6 = 23
            boolean r0 = r1.f308079k     // Catch:{ Exception -> 0x028f }
            if (r0 == 0) goto L_0x0270
            java.lang.String r0 = r1.f308081m     // Catch:{ Exception -> 0x028f }
            java.lang.String r8 = "useX264Encode"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r8)     // Catch:{ Exception -> 0x028f }
            n80.g r0 = new n80.g     // Catch:{ Exception -> 0x028f }
            r80.m0 r8 = r1.f308092x     // Catch:{ Exception -> 0x028f }
            com.tencent.mm.plugin.sight.base.e r8 = r8.f330533e     // Catch:{ Exception -> 0x028f }
            if (r8 == 0) goto L_0x0261
            int r8 = r8.f316167a     // Catch:{ Exception -> 0x028f }
            goto L_0x0262
        L_0x0261:
            r8 = -1
        L_0x0262:
            int r9 = r3.f327159b     // Catch:{ Exception -> 0x028f }
            int r10 = r3.f327160c     // Catch:{ Exception -> 0x028f }
            r0.<init>(r8, r9, r10)     // Catch:{ Exception -> 0x028f }
            r1.f308090v = r0     // Catch:{ Exception -> 0x028f }
            r0.mo160942a()     // Catch:{ Exception -> 0x028f }
            goto L_0x0348
        L_0x0270:
            boolean r0 = p206nj.C11171e.m11046c(r6)     // Catch:{ Exception -> 0x028f }
            if (r0 == 0) goto L_0x0281
            n80.f r0 = new n80.f     // Catch:{ Exception -> 0x028f }
            bh2.i r8 = new bh2.i     // Catch:{ Exception -> 0x028f }
            r8.<init>(r4, r5)     // Catch:{ Exception -> 0x028f }
            r0.<init>(r3, r8)     // Catch:{ Exception -> 0x028f }
            goto L_0x028b
        L_0x0281:
            n80.e r0 = new n80.e     // Catch:{ Exception -> 0x028f }
            bh2.j r8 = new bh2.j     // Catch:{ Exception -> 0x028f }
            r8.<init>(r4, r5)     // Catch:{ Exception -> 0x028f }
            r0.<init>(r3, r8)     // Catch:{ Exception -> 0x028f }
        L_0x028b:
            r1.f308089u = r0     // Catch:{ Exception -> 0x028f }
            goto L_0x0348
        L_0x028f:
            r0 = move-exception
            boolean r8 = r3.f327167j     // Catch:{ Exception -> 0x038a }
            java.lang.String r9 = "markConfigError"
            java.lang.String r10 = "markRemuxH264EncoderInitFailed"
            java.lang.String r11 = "MicroMsg.StoryImageVideoIDKey"
            if (r8 == 0) goto L_0x0310
            r8 = 0
            r3.f327167j = r8     // Catch:{ Exception -> 0x038a }
            boolean r6 = p206nj.C11171e.m11046c(r6)     // Catch:{ Exception -> 0x02d7 }
            if (r6 == 0) goto L_0x02b0
            n80.f r6 = new n80.f     // Catch:{ Exception -> 0x02d7 }
            bh2.k r8 = new bh2.k     // Catch:{ Exception -> 0x02d7 }
            r8.<init>(r4, r5)     // Catch:{ Exception -> 0x02d7 }
            r6.<init>(r3, r8)     // Catch:{ Exception -> 0x02d7 }
            goto L_0x02ba
        L_0x02b0:
            n80.e r6 = new n80.e     // Catch:{ Exception -> 0x02d7 }
            bh2.l r8 = new bh2.l     // Catch:{ Exception -> 0x02d7 }
            r8.<init>(r4, r5)     // Catch:{ Exception -> 0x02d7 }
            r6.<init>(r3, r8)     // Catch:{ Exception -> 0x02d7 }
        L_0x02ba:
            r1.f308089u = r6     // Catch:{ Exception -> 0x02d7 }
            java.lang.String r4 = "markCQError"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r11, r4)     // Catch:{ Exception -> 0x02d7 }
            com.tencent.mm.plugin.report.service.n r4 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x02d7 }
            r5 = 1092(0x444, double:5.395E-321)
            r12 = 12
            r14 = 1
            r28 = r4
            r29 = r5
            r31 = r12
            r33 = r14
            r28.mo175913w(r29, r31, r33)     // Catch:{ Exception -> 0x02d7 }
            goto L_0x0348
        L_0x02d7:
            java.lang.String r4 = r1.f308081m     // Catch:{ Exception -> 0x038a }
            java.lang.String r5 = "create encoder again error"
            r6 = 0
            java.lang.Object[] r8 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x038a }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r5, r8)     // Catch:{ Exception -> 0x038a }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r10)     // Catch:{ Exception -> 0x038a }
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x038a }
            r4 = 986(0x3da, double:4.87E-321)
            r6 = 16
            r12 = 1
            r28 = r0
            r29 = r4
            r31 = r6
            r33 = r12
            r28.mo175913w(r29, r31, r33)     // Catch:{ Exception -> 0x038a }
            r4 = 0
            r1.mo145776h(r4)     // Catch:{ Exception -> 0x038a }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r11, r9)     // Catch:{ Exception -> 0x038a }
            r4 = 1092(0x444, double:5.395E-321)
            r6 = 11
            r8 = 1
            r28 = r0
            r29 = r4
            r31 = r6
            r33 = r8
            r28.mo175913w(r29, r31, r33)     // Catch:{ Exception -> 0x038a }
            goto L_0x0348
        L_0x0310:
            java.lang.String r4 = r1.f308081m     // Catch:{ Exception -> 0x038a }
            java.lang.String r5 = "create encoder error"
            r6 = 0
            java.lang.Object[] r8 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x038a }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r5, r8)     // Catch:{ Exception -> 0x038a }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r10)     // Catch:{ Exception -> 0x038a }
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x038a }
            r4 = 986(0x3da, double:4.87E-321)
            r6 = 16
            r12 = 1
            r28 = r0
            r29 = r4
            r31 = r6
            r33 = r12
            r28.mo175913w(r29, r31, r33)     // Catch:{ Exception -> 0x038a }
            r4 = 0
            r1.mo145776h(r4)     // Catch:{ Exception -> 0x038a }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r11, r9)     // Catch:{ Exception -> 0x038a }
            r4 = 1092(0x444, double:5.395E-321)
            r6 = 11
            r8 = 1
            r28 = r0
            r29 = r4
            r31 = r6
            r33 = r8
            r28.mo175913w(r29, r31, r33)     // Catch:{ Exception -> 0x038a }
        L_0x0348:
            n80.g r0 = r1.f308090v     // Catch:{ Exception -> 0x038a }
            if (r0 != 0) goto L_0x0350
            n80.b r0 = r1.f308089u     // Catch:{ Exception -> 0x038a }
            if (r0 == 0) goto L_0x0396
        L_0x0350:
            n80.b r0 = r1.f308089u     // Catch:{ Exception -> 0x038a }
            if (r0 == 0) goto L_0x0358
            android.view.Surface r2 = r0.mo160919c()     // Catch:{ Exception -> 0x038a }
        L_0x0358:
            bh2.f r0 = new bh2.f     // Catch:{ Exception -> 0x038a }
            java.util.ArrayList<java.lang.String> r4 = r1.f308070b     // Catch:{ Exception -> 0x038a }
            long r5 = r1.f308086r     // Catch:{ Exception -> 0x038a }
            long r7 = r1.f308087s     // Catch:{ Exception -> 0x038a }
            r9 = 0
            int r10 = r1.f308073e     // Catch:{ Exception -> 0x038a }
            int r11 = r1.f308074f     // Catch:{ Exception -> 0x038a }
            boolean r12 = r1.f308079k     // Catch:{ Exception -> 0x038a }
            int r13 = r1.f308078j     // Catch:{ Exception -> 0x038a }
            bh2.p r14 = new bh2.p     // Catch:{ Exception -> 0x038a }
            r14.<init>(r1, r3)     // Catch:{ Exception -> 0x038a }
            r28 = r0
            r29 = r4
            r30 = r5
            r32 = r7
            r34 = r9
            r35 = r2
            r36 = r10
            r37 = r11
            r38 = r12
            r39 = r13
            r40 = r14
            r28.<init>(r29, r30, r32, r34, r35, r36, r37, r38, r39, r40)     // Catch:{ Exception -> 0x038a }
            r1.f308088t = r0     // Catch:{ Exception -> 0x038a }
            goto L_0x0396
        L_0x038a:
            r0 = move-exception
            java.lang.String r2 = r1.f308081m
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "remux impl error"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r4, r3)
        L_0x0396:
            bh2.h$a r0 = new bh2.h$a
            r0.<init>(r1)
            r1.f308068P = r0
            return
        L_0x039e:
            java.lang.String r0 = r1.f308081m
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "create MediaCodecRemuxer error, outputFilePath:"
            r2.append(r3)
            java.lang.String r3 = r1.f308072d
            r2.append(r3)
            java.lang.String r3 = ", outputWidth:"
            r2.append(r3)
            int r3 = r1.f308073e
            r2.append(r3)
            java.lang.String r3 = ", outputHeight:"
            r2.append(r3)
            int r3 = r1.f308074f
            r2.append(r3)
            java.lang.String r3 = ", videoFps:"
            r2.append(r3)
            int r3 = r1.f308085q
            r2.append(r3)
            java.lang.String r3 = ", outputFps:"
            r2.append(r3)
            int r3 = r1.f308078j
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r2)
            java.lang.String r0 = "markRemuxVideoParaError"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r2 = 986(0x3da, double:4.87E-321)
            r4 = 10
            r6 = 1
            r25 = r0
            r26 = r2
            r28 = r4
            r30 = r6
            r25.mo175913w(r26, r28, r30)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "create MediaCodecRemuxer error"
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bh2.C104119h.<init>(java.lang.String, java.util.ArrayList, int, java.lang.String, int, int, int, int, int, int, long, long, boolean, fy3.l):void");
    }

    /* renamed from: e */
    public static final void m138955e(C104119h hVar) {
        String str = hVar.f308081m;
        Log.m105924i(str, "checkFinishEncode, encodeFrameCount:" + hVar.f308064L + ", drawFrameCount:" + hVar.f308065M + ", isFinishEncode:" + hVar.f308067O + ", isDecodeEnd:" + hVar.f308066N);
        if (hVar.f308064L >= hVar.f308065M && hVar.f308066N) {
            hVar.mo145774f();
            Log.m105924i("MicroMsg.MediaEditorIDKeyStat", "markRemuxEndWithFrameNumberMatch");
            C115669n.INSTANCE.mo175913w(986, 90, 1);
        } else if (hVar.f308066N) {
            MMHandlerThread.removeRunnable(hVar.f308068P);
            MMHandlerThread.postToMainThreadDelayed(hVar.f308068P, 1000);
        }
    }

    /* renamed from: a */
    public void mo88284a(C32226l<? super Long, Bitmap> lVar) {
        C87412m.m108594g(lVar, "blurBgProvider");
    }

    /* renamed from: b */
    public int mo124208b() {
        String str = this.f308081m;
        Log.m105924i(str, "start remux, initFinish:" + this.f308054B);
        this.f308058F = Util.currentTicks();
        this.f308059G.f301458b.mo72289b();
        Log.getLogLevel();
        if (this.f308054B) {
            Log.m105918d("MicroMsg.StoryImageVideoIDKey", "markRemux");
            C115669n.INSTANCE.mo175913w(1092, 2, 1);
            HandlerThread handlerThread = this.f308094z;
            if (handlerThread != null) {
                handlerThread.quit();
            }
            this.f308094z = C61926c.m72685j("MediaCodecRemux_audioMix", false, new C104121b(this));
            HandlerThread handlerThread2 = this.f308053A;
            if (handlerThread2 != null) {
                handlerThread2.quit();
            }
            if (this.f308088t != null) {
                this.f308053A = C61926c.m72685j("MediaCodecRemux_videoMix", false, new C104122c(this));
            }
        } else {
            this.f308055C = true;
        }
        return 0;
    }

    /* renamed from: c */
    public void mo88286c(C32226l<? super Long, Bitmap> lVar) {
        C87412m.m108594g(lVar, "blendBitmapProvider");
        this.f308056D = lVar;
    }

    /* renamed from: d */
    public void mo124209d(Bitmap bitmap) {
        C87412m.m108594g(bitmap, "bitmap");
    }

    /* renamed from: f */
    public final void mo145774f() {
        Log.m105925i(this.f308081m, "finishEncode %s", Boolean.valueOf(this.f308079k));
        if (this.f308079k) {
            C109712g gVar = this.f308090v;
            if (gVar != null) {
                Log.m105924i("MicroMsg.X264TransEncoder", "stop isCancel:" + false);
                long currentTicks = Util.currentTicks();
                synchronized (gVar.f328390f) {
                    gVar.f328388d = true;
                    gVar.f328389e = false;
                    gVar.f328387c.quit();
                    C107920f<?> fVar = gVar.f328386b;
                    if (fVar != null) {
                        fVar.mo158346g();
                    }
                    Log.m105924i("MicroMsg.X264TransEncoder", "stop finish, cost:" + Util.ticksToNow(currentTicks) + LocaleUtil.MALAY);
                    C13598b0 b0Var = C13598b0.f38549a;
                }
            }
            mo145775g(true);
        } else {
            C109697b bVar = this.f308089u;
            if (bVar != null) {
                bVar.mo160918b();
            }
        }
        MMHandlerThread.removeRunnable(this.f308068P);
        this.f308067O = true;
    }

    /* renamed from: g */
    public final synchronized void mo145775g(boolean z) {
        C32226l<? super C32226l<? super String, C13598b0>, C13598b0> lVar;
        String str = this.f308081m;
        Log.m105924i(str, "finishRemux, isVideo: " + z + ", isAudioRemuxFinish:" + this.f308062J + ", isVideoRemuxFinish:" + this.f308061I + ", isInvokeEndCallback:" + this.f308060H);
        if (z) {
            this.f308061I = true;
        } else {
            this.f308062J = true;
        }
        if (this.f308062J && this.f308061I && !this.f308060H) {
            this.f308059G.mo141928a();
            this.f308060H = true;
            C110524i0 i0Var = this.f308057E;
            if (!(i0Var == null || (lVar = i0Var.f330518n) == null)) {
                ((C110524i0.C110527c) lVar).invoke(this.f308080l);
            }
            HandlerThread handlerThread = this.f308094z;
            if (handlerThread != null) {
                handlerThread.quitSafely();
            }
            HandlerThread handlerThread2 = this.f308053A;
            if (handlerThread2 != null) {
                handlerThread2.quitSafely();
            }
            long ticksToNow = Util.ticksToNow(this.f308058F);
            String str2 = this.f308081m;
            Log.m105924i(str2, "remux used " + ticksToNow + " decodeFrame:" + this.f308063K + ", encodeFrame:" + this.f308064L + ", drawFrameCount:" + this.f308065M);
            try {
                C94554a c = C94555d.m119567c(this.f308072d, true);
                if (c != null) {
                    C102361h hVar = C102361h.f301459a;
                    hVar.mo141933d(this.f308071c, ticksToNow);
                    hVar.mo141934e((long) c.f273444b, (long) c.f273447e, (long) this.f308085q);
                    if (((double) (((float) this.f308063K) / ((float) this.f308064L))) >= 1.5d) {
                        Log.m105924i("MicroMsg.MediaEditorIDKeyStat", "markRemuxFrameCountDiffError");
                        C115669n.INSTANCE.mo175913w(986, 53, 1);
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: h */
    public final synchronized void mo145776h(boolean z) {
        String str = this.f308081m;
        Log.m105924i(str, "onDecoderEncoderFailed, isDecoder:" + z);
        if (!this.f308060H) {
            this.f308059G.mo141928a();
            this.f308060H = true;
            try {
                HandlerThread handlerThread = this.f308094z;
                if (handlerThread != null) {
                    handlerThread.quit();
                }
                HandlerThread handlerThread2 = this.f308053A;
                if (handlerThread2 != null) {
                    handlerThread2.quit();
                }
                C86013q1.m106447h(this.f308072d);
                long ticksToNow = Util.ticksToNow(this.f308058F);
                String str2 = this.f308081m;
                Log.m105924i(str2, "onDecoderEncoderFailed, finish, costTime:" + ticksToNow);
            } catch (Exception e) {
                String str3 = this.f308081m;
                Log.printErrStackTrace(str3, e, "onDecoderEncoderFailed error:" + e.getMessage(), new Object[0]);
            }
            C32226l<? super String, C13598b0> lVar = this.f308080l;
            if (lVar != null) {
                lVar.invoke(null);
            }
        }
    }
}
