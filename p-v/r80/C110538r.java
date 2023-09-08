package r80;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.media.MediaFormat;
import android.os.HandlerThread;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import k80.C108915a;
import l80.C109277d;
import lu3.C88654b;
import m80.C109537f;
import n80.C109697b;
import n80.C109715i;
import o40.C61926c;
import o80.C109993a;
import rx3.C13598b0;
import sx3.C64197v;
import w80.C102360a;
import zt3.C119157j;

/* renamed from: r80.r */
public class C110538r extends C89903h implements C63378g {

    /* renamed from: A */
    public int f330551A;

    /* renamed from: B */
    public int f330552B;

    /* renamed from: C */
    public long f330553C;

    /* renamed from: D */
    public long f330554D;

    /* renamed from: E */
    public C109537f f330555E;

    /* renamed from: F */
    public C109697b f330556F;

    /* renamed from: G */
    public C109715i f330557G;

    /* renamed from: H */
    public C108915a f330558H;

    /* renamed from: I */
    public C110505a f330559I;

    /* renamed from: J */
    public C109993a f330560J;

    /* renamed from: K */
    public C110533m0 f330561K;

    /* renamed from: L */
    public C109993a f330562L;

    /* renamed from: M */
    public C109993a f330563M;

    /* renamed from: N */
    public HandlerThread f330564N;

    /* renamed from: O */
    public HandlerThread f330565O;

    /* renamed from: P */
    public boolean f330566P;

    /* renamed from: Q */
    public boolean f330567Q;

    /* renamed from: R */
    public C32226l<? super Long, Bitmap> f330568R;

    /* renamed from: S */
    public Bitmap f330569S;

    /* renamed from: T */
    public C110524i0 f330570T;

    /* renamed from: U */
    public C32226l<? super Long, Bitmap> f330571U;

    /* renamed from: V */
    public long f330572V;

    /* renamed from: W */
    public final C102360a f330573W;

    /* renamed from: X */
    public volatile boolean f330574X;

    /* renamed from: Y */
    public boolean f330575Y;

    /* renamed from: Z */
    public boolean f330576Z;

    /* renamed from: a */
    public final String f330577a;

    /* renamed from: a0 */
    public int f330578a0;

    /* renamed from: b */
    public String f330579b;

    /* renamed from: b0 */
    public int f330580b0;

    /* renamed from: c */
    public int f330581c;

    /* renamed from: c0 */
    public int f330582c0;

    /* renamed from: d */
    public final String f330583d;

    /* renamed from: d0 */
    public long f330584d0;

    /* renamed from: e */
    public Rect f330585e;

    /* renamed from: e0 */
    public int f330586e0;

    /* renamed from: f */
    public final int f330587f;

    /* renamed from: f0 */
    public final int f330588f0;

    /* renamed from: g */
    public final int f330589g;

    /* renamed from: g0 */
    public final int f330590g0;

    /* renamed from: h */
    public int f330591h;

    /* renamed from: h0 */
    public volatile boolean f330592h0;

    /* renamed from: i */
    public int f330593i;

    /* renamed from: i0 */
    public volatile boolean f330594i0;

    /* renamed from: j */
    public int f330595j;

    /* renamed from: j0 */
    public volatile boolean f330596j0;

    /* renamed from: k */
    public int f330597k;

    /* renamed from: k0 */
    public volatile boolean f330598k0;

    /* renamed from: l */
    public int f330599l;

    /* renamed from: l0 */
    public final C110542d f330600l0;

    /* renamed from: m */
    public int f330601m;

    /* renamed from: m0 */
    public final Runnable f330602m0;

    /* renamed from: n */
    public int f330603n;

    /* renamed from: o */
    public boolean f330604o;

    /* renamed from: p */
    public boolean f330605p;

    /* renamed from: q */
    public int f330606q;

    /* renamed from: r */
    public int f330607r;

    /* renamed from: s */
    public boolean f330608s;

    /* renamed from: t */
    public int f330609t;

    /* renamed from: u */
    public C32226l<? super Float, C13598b0> f330610u;

    /* renamed from: v */
    public C32226l<? super String, C13598b0> f330611v;

    /* renamed from: w */
    public final String f330612w;

    /* renamed from: x */
    public int f330613x;

    /* renamed from: y */
    public int f330614y;

    /* renamed from: z */
    public int f330615z;

    /* renamed from: r80.r$a */
    public static final class C110539a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C110538r f330616d;

        public C110539a(C110538r rVar) {
            this.f330616d = rVar;
        }

        public final void run() {
            String str = this.f330616d.f330612w;
            Log.m105924i(str, "decode end after " + 1000 + ", isFinishEncode:" + this.f330616d.f330598k0);
            if (!this.f330616d.f330598k0) {
                Log.m105924i("MicroMsg.MediaEditorIDKeyStat", "markRemuxEndWithFrameNumberCheckTimeout");
                C115669n.INSTANCE.mo175913w(986, 91, 1);
                this.f330616d.mo161993f();
            }
        }
    }

    /* renamed from: r80.r$b */
    public static final class C110540b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C110538r f330617d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110540b(C110538r rVar) {
            super(0);
            this.f330617d = rVar;
        }

        public Object invoke() {
            C110538r rVar = this.f330617d;
            String str = rVar.f330612w;
            Log.m105924i(str, "runAudioMix, mixType:" + rVar.f330581c);
            C109993a aVar = rVar.f330563M;
            if (aVar != null) {
                aVar.mo161329g();
            }
            int i = rVar.f330581c;
            if (i == 1) {
                C110533m0.m150457d(rVar.f330561K, rVar.f330563M, 0, 0, 6, (Object) null);
                rVar.mo161994g(false);
            } else {
                if (C64197v.m75537f(2, 3).contains(Integer.valueOf(i))) {
                    try {
                        long currentTicks = Util.currentTicks();
                        C108915a aVar2 = new C108915a(rVar.f330581c, rVar.f330599l, rVar.f330601m, new C110521g0(rVar));
                        rVar.f330558H = aVar2;
                        C109993a aVar3 = rVar.f330563M;
                        C109993a aVar4 = rVar.f330562L;
                        C110533m0 m0Var = rVar.f330561K;
                        aVar2.mo160049j(aVar3, aVar4, m0Var.f330529a, m0Var.f330530b);
                        C109993a aVar5 = rVar.f330562L;
                        MediaFormat mediaFormat = aVar5 != null ? aVar5.f329159f : null;
                        C87412m.m108591d(mediaFormat);
                        if (!mediaFormat.containsKey(FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE)) {
                            mediaFormat.setInteger(FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE, rVar.f330597k);
                        }
                        mediaFormat.setInteger("channel-count", rVar.f330601m);
                        C108915a aVar6 = rVar.f330558H;
                        if (aVar6 != null) {
                            aVar6.mo160050k(mediaFormat);
                        }
                        C108915a aVar7 = rVar.f330558H;
                        if (aVar7 != null) {
                            aVar7.mo160052m(new C110522h0(rVar, currentTicks));
                        }
                    } catch (Exception e) {
                        String str2 = rVar.f330612w;
                        Log.printErrStackTrace(str2, e, "mix audio error: " + e.getMessage(), new Object[0]);
                        rVar.mo161994g(false);
                    }
                } else if (i == 0) {
                    rVar.mo161994g(false);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: r80.r$c */
    public static final class C110541c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C110538r f330618d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110541c(C110538r rVar) {
            super(0);
            this.f330618d = rVar;
        }

        public Object invoke() {
            C109537f fVar = this.f330618d.f330555E;
            if (fVar != null) {
                fVar.mo145769e();
            }
            C110538r rVar = this.f330618d;
            rVar.getClass();
            MMHandlerThread.postToMainThreadDelayed(new C110537q(rVar), 1000);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: r80.r$d */
    public static final class C110542d extends C88654b {

        /* renamed from: e */
        public final /* synthetic */ C110538r f330619e;

        public C110542d(C110538r rVar) {
            this.f330619e = rVar;
        }

        public String getKey() {
            return "MediaCodecRemuxer#timeoutInvoke";
        }

        public void run() {
            String str = this.f330619e.f330612w;
            Log.m105920e(str, "remux error! handing one frame time out ,isInvokeEndCallback:" + this.f330619e.f330574X);
            if (!this.f330619e.f330574X) {
                C110538r rVar = this.f330619e;
                rVar.mo161996j(!rVar.f330592h0, true);
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C110538r(java.lang.String r31, java.lang.String r32, int r33, java.lang.String r34, android.graphics.Rect r35, int r36, int r37, int r38, int r39, int r40, int r41, int r42, int r43, int r44, long r45, long r47, boolean r49, boolean r50, int r51, int r52, boolean r53, int r54, fy3.C32226l r55, fy3.C32226l r56, int r57, gy3.C8480h r58) {
        /*
            r30 = this;
            r0 = r57
            r1 = r0 & 32
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r9 = 0
            goto L_0x000b
        L_0x0009:
            r9 = r36
        L_0x000b:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0011
            r10 = 0
            goto L_0x0013
        L_0x0011:
            r10 = r37
        L_0x0013:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x001e
            r1 = 44100(0xac44, float:6.1797E-41)
            r15 = 44100(0xac44, float:6.1797E-41)
            goto L_0x0020
        L_0x001e:
            r15 = r42
        L_0x0020:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x0028
            r1 = 1
            r16 = 1
            goto L_0x002a
        L_0x0028:
            r16 = r43
        L_0x002a:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            r3 = 0
            if (r1 == 0) goto L_0x0033
            r18 = r3
            goto L_0x0035
        L_0x0033:
            r18 = r45
        L_0x0035:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x003e
            r20 = r3
            goto L_0x0040
        L_0x003e:
            r20 = r47
        L_0x0040:
            r1 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0048
            r22 = 0
            goto L_0x004a
        L_0x0048:
            r22 = r49
        L_0x004a:
            r1 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0052
            r23 = 0
            goto L_0x0054
        L_0x0052:
            r23 = r50
        L_0x0054:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x005c
            r24 = 0
            goto L_0x005e
        L_0x005c:
            r24 = r51
        L_0x005e:
            r1 = 524288(0x80000, float:7.34684E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0066
            r25 = 0
            goto L_0x0068
        L_0x0066:
            r25 = r52
        L_0x0068:
            r1 = 1048576(0x100000, float:1.469368E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0070
            r26 = 0
            goto L_0x0072
        L_0x0070:
            r26 = r53
        L_0x0072:
            r1 = 2097152(0x200000, float:2.938736E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x007b
            r1 = -1
            r27 = -1
            goto L_0x007d
        L_0x007b:
            r27 = r54
        L_0x007d:
            r1 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0086
            r0 = 0
            r28 = r0
            goto L_0x0088
        L_0x0086:
            r28 = r55
        L_0x0088:
            r3 = r30
            r4 = r31
            r5 = r32
            r6 = r33
            r7 = r34
            r8 = r35
            r11 = r38
            r12 = r39
            r13 = r40
            r14 = r41
            r17 = r44
            r29 = r56
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r20, r22, r23, r24, r25, r26, r27, r28, r29)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r80.C110538r.<init>(java.lang.String, java.lang.String, int, java.lang.String, android.graphics.Rect, int, int, int, int, int, int, int, int, int, long, long, boolean, boolean, int, int, boolean, int, fy3.l, fy3.l, int, gy3.h):void");
    }

    /* renamed from: e */
    public static final void m150463e(C110538r rVar) {
        int i;
        String str = rVar.f330612w;
        Log.m105924i(str, "checkFinishEncode, encodeFrameCount:" + rVar.f330580b0 + ", drawFrameCount:" + rVar.f330582c0 + ", useRequestDraw:" + rVar.f330596j0 + ", isFinishEncode:" + rVar.f330598k0 + ", isDecodeEnd:" + rVar.f330592h0);
        int i2 = rVar.f330580b0;
        if (i2 > 0 && (i = rVar.f330582c0) > 0 && i2 >= i && rVar.f330592h0) {
            rVar.mo161993f();
            Log.m105924i("MicroMsg.MediaEditorIDKeyStat", "markRemuxEndWithFrameNumberMatch");
            C115669n.INSTANCE.mo175913w(986, 90, 1);
        } else if (rVar.f330592h0) {
            ((C119157j) C119157j.f356862d).mo183894y("DECODE_END_FINISH_ENCODE_CHECK");
            ((C119157j) C119157j.f356862d).mo183879j(rVar.f330602m0, 1000, "DECODE_END_FINISH_ENCODE_CHECK");
        }
    }

    /* renamed from: a */
    public void mo88284a(C32226l<? super Long, Bitmap> lVar) {
        C87412m.m108594g(lVar, "blurBgProvider");
        this.f330571U = lVar;
        C110505a aVar = this.f330559I;
        if (aVar != null) {
            aVar.mo161979h(lVar);
        }
    }

    /* renamed from: b */
    public int mo124208b() {
        int i;
        String str = this.f330612w;
        Log.m105924i(str, "start remux, initFinish:" + this.f330566P);
        this.f330572V = Util.currentTicks();
        Bitmap bitmap = this.f330569S;
        if (bitmap != null && (i = this.f330615z) > 0) {
            this.f330569S = BitmapUtil.rotate(bitmap, -((float) i));
        }
        this.f330573W.f301458b.mo72289b();
        if (this.f330566P) {
            HandlerThread handlerThread = this.f330564N;
            if (handlerThread != null) {
                handlerThread.quit();
            }
            this.f330564N = C61926c.m72685j("MediaCodecRemux_audioMix", false, new C110540b(this));
            HandlerThread handlerThread2 = this.f330565O;
            if (handlerThread2 != null) {
                handlerThread2.quit();
            }
            if (this.f330555E != null) {
                this.f330565O = C61926c.m72685j("MediaCodecRemux_videoMix", false, new C110541c(this));
            }
        } else {
            this.f330567Q = true;
        }
        return 0;
    }

    /* renamed from: c */
    public void mo88286c(C32226l<? super Long, Bitmap> lVar) {
        C87412m.m108594g(lVar, "blendBitmapProvider");
        this.f330568R = lVar;
        C110505a aVar = this.f330559I;
        if (aVar != null) {
            aVar.mo161978g(lVar);
        }
    }

    /* renamed from: d */
    public void mo124209d(Bitmap bitmap) {
        C87412m.m108594g(bitmap, "bitmap");
        this.f330569S = bitmap;
        C110505a aVar = this.f330559I;
        if (aVar != null) {
            String str = aVar.f330438b;
            Log.m105924i(str, "setDrawBlendBitmap:" + bitmap.hashCode());
            aVar.f330449m = bitmap;
        }
    }

    /* renamed from: f */
    public final void mo161993f() {
        Log.m105924i(this.f330612w, "finishEncode");
        if (this.f330604o) {
            C109715i iVar = this.f330557G;
            if (iVar != null) {
                iVar.mo160946d();
            }
            mo161994g(true);
        } else {
            C109697b bVar = this.f330556F;
            if (bVar != null) {
                bVar.mo160918b();
            }
        }
        ((C119157j) C119157j.f356862d).mo183894y("DECODE_END_FINISH_ENCODE_CHECK");
        this.f330598k0 = true;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(16:12|(1:14)|15|16|17|18|19|(1:21)|22|(1:26)|27|(1:29)|30|(1:32)|33|(3:34|35|(3:37|(1:39)|40))) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0062 */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00dc A[Catch:{ Exception -> 0x0115 }] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo161994g(boolean r11) {
        /*
            r10 = this;
            monitor-enter(r10)
            java.lang.String r0 = r10.f330612w     // Catch:{ all -> 0x0117 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0117 }
            r1.<init>()     // Catch:{ all -> 0x0117 }
            java.lang.String r2 = "finishRemux, isVideo: "
            r1.append(r2)     // Catch:{ all -> 0x0117 }
            r1.append(r11)     // Catch:{ all -> 0x0117 }
            java.lang.String r2 = ", isAudioRemuxFinish:"
            r1.append(r2)     // Catch:{ all -> 0x0117 }
            boolean r2 = r10.f330576Z     // Catch:{ all -> 0x0117 }
            r1.append(r2)     // Catch:{ all -> 0x0117 }
            java.lang.String r2 = ", isVideoRemuxFinish:"
            r1.append(r2)     // Catch:{ all -> 0x0117 }
            boolean r2 = r10.f330575Y     // Catch:{ all -> 0x0117 }
            r1.append(r2)     // Catch:{ all -> 0x0117 }
            java.lang.String r2 = ", isInvokeEndCallback:"
            r1.append(r2)     // Catch:{ all -> 0x0117 }
            boolean r2 = r10.f330574X     // Catch:{ all -> 0x0117 }
            r1.append(r2)     // Catch:{ all -> 0x0117 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0117 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)     // Catch:{ all -> 0x0117 }
            r0 = 1
            if (r11 == 0) goto L_0x003b
            r10.f330575Y = r0     // Catch:{ all -> 0x0117 }
            goto L_0x003d
        L_0x003b:
            r10.f330576Z = r0     // Catch:{ all -> 0x0117 }
        L_0x003d:
            boolean r11 = r10.f330576Z     // Catch:{ all -> 0x0117 }
            if (r11 == 0) goto L_0x0115
            boolean r11 = r10.f330575Y     // Catch:{ all -> 0x0117 }
            if (r11 == 0) goto L_0x0115
            boolean r11 = r10.f330574X     // Catch:{ all -> 0x0117 }
            if (r11 != 0) goto L_0x0115
            r80.a r11 = r10.f330559I     // Catch:{ all -> 0x0117 }
            if (r11 == 0) goto L_0x0050
            r11.mo161976e()     // Catch:{ all -> 0x0117 }
        L_0x0050:
            w80.a r11 = r10.f330573W     // Catch:{ all -> 0x0117 }
            r11.mo141928a()     // Catch:{ all -> 0x0117 }
            r10.f330574X = r0     // Catch:{ all -> 0x0117 }
            r80.n0$a r11 = r80.C12962n0.f36985a     // Catch:{ Exception -> 0x0062 }
            java.lang.String r1 = r10.f330579b     // Catch:{ Exception -> 0x0062 }
            java.lang.String r11 = r11.mo12495a(r1)     // Catch:{ Exception -> 0x0062 }
            com.tencent.p014mm.vfs.C86013q1.m106447h(r11)     // Catch:{ Exception -> 0x0062 }
        L_0x0062:
            r80.r$d r11 = r10.f330600l0     // Catch:{ all -> 0x0117 }
            r11.mo97819a()     // Catch:{ all -> 0x0117 }
            o80.a r11 = r10.f330560J     // Catch:{ all -> 0x0117 }
            r11.mo161327e()     // Catch:{ all -> 0x0117 }
            o80.a r11 = r10.f330563M     // Catch:{ all -> 0x0117 }
            if (r11 == 0) goto L_0x0073
            r11.mo161327e()     // Catch:{ all -> 0x0117 }
        L_0x0073:
            r80.i0 r11 = r10.f330570T     // Catch:{ all -> 0x0117 }
            if (r11 == 0) goto L_0x0082
            fy3.l<? super fy3.l<? super java.lang.String, rx3.b0>, rx3.b0> r11 = r11.f330518n     // Catch:{ all -> 0x0117 }
            if (r11 == 0) goto L_0x0082
            fy3.l<? super java.lang.String, rx3.b0> r1 = r10.f330611v     // Catch:{ all -> 0x0117 }
            r80.i0$c r11 = (r80.C110524i0.C110527c) r11     // Catch:{ all -> 0x0117 }
            r11.invoke(r1)     // Catch:{ all -> 0x0117 }
        L_0x0082:
            android.os.HandlerThread r11 = r10.f330564N     // Catch:{ all -> 0x0117 }
            if (r11 == 0) goto L_0x0089
            r11.quit()     // Catch:{ all -> 0x0117 }
        L_0x0089:
            android.os.HandlerThread r11 = r10.f330565O     // Catch:{ all -> 0x0117 }
            if (r11 == 0) goto L_0x0090
            r11.quit()     // Catch:{ all -> 0x0117 }
        L_0x0090:
            long r1 = r10.f330572V     // Catch:{ all -> 0x0117 }
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r1)     // Catch:{ all -> 0x0117 }
            java.lang.String r11 = r10.f330612w     // Catch:{ all -> 0x0117 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0117 }
            r3.<init>()     // Catch:{ all -> 0x0117 }
            java.lang.String r4 = "remux used "
            r3.append(r4)     // Catch:{ all -> 0x0117 }
            r3.append(r1)     // Catch:{ all -> 0x0117 }
            java.lang.String r4 = " decodeFrame:"
            r3.append(r4)     // Catch:{ all -> 0x0117 }
            int r4 = r10.f330578a0     // Catch:{ all -> 0x0117 }
            r3.append(r4)     // Catch:{ all -> 0x0117 }
            java.lang.String r4 = ", encodeFrame:"
            r3.append(r4)     // Catch:{ all -> 0x0117 }
            int r4 = r10.f330580b0     // Catch:{ all -> 0x0117 }
            r3.append(r4)     // Catch:{ all -> 0x0117 }
            java.lang.String r4 = ", drawFrameCount:"
            r3.append(r4)     // Catch:{ all -> 0x0117 }
            int r4 = r10.f330582c0     // Catch:{ all -> 0x0117 }
            r3.append(r4)     // Catch:{ all -> 0x0117 }
            java.lang.String r4 = ", writeDtsCount:"
            r3.append(r4)     // Catch:{ all -> 0x0117 }
            int r4 = r10.f330586e0     // Catch:{ all -> 0x0117 }
            r3.append(r4)     // Catch:{ all -> 0x0117 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0117 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r3)     // Catch:{ all -> 0x0117 }
            java.lang.String r11 = r10.f330583d     // Catch:{ Exception -> 0x0115 }
            com.tencent.mm.plugin.sight.base.a r11 = com.tencent.p014mm.plugin.sight.base.C94555d.m119567c(r11, r0)     // Catch:{ Exception -> 0x0115 }
            if (r11 == 0) goto L_0x0115
            w80.h r0 = w80.C102361h.f301459a     // Catch:{ Exception -> 0x0115 }
            int r3 = r10.f330581c     // Catch:{ Exception -> 0x0115 }
            r0.mo141933d(r3, r1)     // Catch:{ Exception -> 0x0115 }
            int r1 = r11.f273444b     // Catch:{ Exception -> 0x0115 }
            long r4 = (long) r1     // Catch:{ Exception -> 0x0115 }
            int r11 = r11.f273447e     // Catch:{ Exception -> 0x0115 }
            long r6 = (long) r11     // Catch:{ Exception -> 0x0115 }
            int r11 = r10.f330552B     // Catch:{ Exception -> 0x0115 }
            long r8 = (long) r11     // Catch:{ Exception -> 0x0115 }
            r3 = r0
            r3.mo141934e(r4, r6, r8)     // Catch:{ Exception -> 0x0115 }
            int r11 = r10.f330578a0     // Catch:{ Exception -> 0x0115 }
            float r11 = (float) r11     // Catch:{ Exception -> 0x0115 }
            int r1 = r10.f330580b0     // Catch:{ Exception -> 0x0115 }
            float r1 = (float) r1     // Catch:{ Exception -> 0x0115 }
            float r11 = r11 / r1
            double r1 = (double) r11     // Catch:{ Exception -> 0x0115 }
            r3 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            int r11 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r11 < 0) goto L_0x0110
            java.lang.String r11 = "MicroMsg.MediaEditorIDKeyStat"
            java.lang.String r1 = "markRemuxFrameCountDiffError"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r1)     // Catch:{ Exception -> 0x0115 }
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x0115 }
            r3 = 986(0x3da, double:4.87E-321)
            r5 = 53
            r7 = 1
            r2.mo175913w(r3, r5, r7)     // Catch:{ Exception -> 0x0115 }
        L_0x0110:
            java.lang.String r11 = r10.f330583d     // Catch:{ Exception -> 0x0115 }
            r0.mo141931b(r11)     // Catch:{ Exception -> 0x0115 }
        L_0x0115:
            monitor-exit(r10)
            return
        L_0x0117:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: r80.C110538r.mo161994g(boolean):void");
    }

    /* renamed from: h */
    public final C109277d mo161995h() {
        int i = this.f330603n;
        int min = i > 0 ? Math.min(i, this.f330552B) : this.f330552B;
        C109277d dVar = new C109277d(this.f330605p);
        dVar.f327161d = this.f330595j;
        dVar.f327162e = min;
        dVar.f327160c = this.f330593i;
        dVar.f327159b = this.f330591h;
        dVar.f327168k = this.f330606q;
        dVar.f327169l = this.f330607r;
        int i2 = this.f330609t;
        if (i2 > 0) {
            dVar.f327164g = i2;
        }
        while (true) {
            int i3 = dVar.f327162e;
            if ((dVar.f327164g * i3) - 1 <= 1) {
                dVar.f327162e = i3 + 1;
                Log.m105920e(this.f330612w, "encodeConfig.frameRate + 1");
            } else {
                String str = this.f330612w;
                Log.m105924i(str, "steve: hardcoder qp:" + this.f330606q + ", " + this.f330607r);
                return dVar;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004a  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public s80.C110779b mo158336i() {
        /*
            r12 = this;
            int r0 = r12.f330615z
            r1 = 1
            java.lang.String r2 = "is landscape video -> SCALE_TYPE_NOT_SCALE"
            r3 = 2
            java.lang.String r4 = "is portrait video -> SCALE_TYPE_CENTER_CROP"
            r5 = 90
            if (r0 == r5) goto L_0x0023
            r5 = 270(0x10e, float:3.78E-43)
            if (r0 != r5) goto L_0x0011
            goto L_0x0023
        L_0x0011:
            int r0 = r12.f330613x
            int r5 = r12.f330614y
            if (r0 <= r5) goto L_0x001d
            java.lang.String r0 = r12.f330612w
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            goto L_0x002e
        L_0x001d:
            java.lang.String r0 = r12.f330612w
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r4)
            goto L_0x0035
        L_0x0023:
            int r0 = r12.f330614y
            int r5 = r12.f330613x
            if (r0 <= r5) goto L_0x0030
            java.lang.String r0 = r12.f330612w
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
        L_0x002e:
            r11 = 1
            goto L_0x0036
        L_0x0030:
            java.lang.String r0 = r12.f330612w
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r4)
        L_0x0035:
            r11 = 2
        L_0x0036:
            boolean r0 = r12.f330604o
            if (r0 == 0) goto L_0x004a
            s80.b r0 = new s80.b
            int r6 = r12.f330613x
            int r7 = r12.f330614y
            int r8 = r12.f330591h
            int r9 = r12.f330593i
            r10 = 2
            r5 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return r0
        L_0x004a:
            s80.b r0 = new s80.b
            int r6 = r12.f330613x
            int r7 = r12.f330614y
            int r8 = r12.f330591h
            int r9 = r12.f330593i
            r10 = 1
            r5 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r80.C110538r.mo158336i():s80.b");
    }

    /* renamed from: j */
    public final synchronized void mo161996j(boolean z, boolean z2) {
        String str = this.f330612w;
        Log.m105924i(str, "onDecoderEncoderFailed, isDecoder:" + z + " isEncoder:" + z2);
        this.f330600l0.mo97819a();
        if (z) {
            C109537f fVar = this.f330555E;
            if (fVar != null) {
                fVar.mo145767c();
            }
            this.f330555E = null;
        }
        if (z2) {
            C115669n.INSTANCE.idkeyStat(985, 162, 1, false);
            C109697b bVar = this.f330556F;
            if (bVar != null) {
                bVar.mo160922f();
            }
            this.f330556F = null;
        }
        if (!this.f330574X) {
            this.f330561K.mo161988b();
            C110505a aVar = this.f330559I;
            if (aVar != null) {
                aVar.mo161976e();
            }
            this.f330573W.mo141928a();
            this.f330574X = true;
            try {
                C86013q1.m106447h(C12962n0.f36985a.mo12495a(this.f330579b));
                this.f330560J.mo161327e();
                C109993a aVar2 = this.f330563M;
                if (aVar2 != null) {
                    aVar2.mo161327e();
                }
                HandlerThread handlerThread = this.f330564N;
                if (handlerThread != null) {
                    handlerThread.quit();
                }
                HandlerThread handlerThread2 = this.f330565O;
                if (handlerThread2 != null) {
                    handlerThread2.quit();
                }
                C86013q1.m106447h(this.f330583d);
                long ticksToNow = Util.ticksToNow(this.f330572V);
                String str2 = this.f330612w;
                Log.m105924i(str2, "onDecoderEncoderFailed, finish, costTime:" + ticksToNow);
            } catch (Exception e) {
                String str3 = this.f330612w;
                Log.printErrStackTrace(str3, e, "onDecoderEncoderFailed error:" + e.getMessage(), new Object[0]);
            }
            C32226l<? super String, C13598b0> lVar = this.f330611v;
            if (lVar != null) {
                lVar.invoke(null);
            }
        }
    }

    /* renamed from: k */
    public final int mo161997k(int i, int i2) {
        if (i <= i2) {
            return i2;
        }
        Integer valueOf = Integer.valueOf((i2 - 1) & i);
        if (!(valueOf.intValue() != 0)) {
            valueOf = null;
        }
        if (valueOf == null) {
            return i;
        }
        int intValue = valueOf.intValue();
        return intValue * 2 > i2 ? (i - intValue) + i2 : i - intValue;
    }

    /* JADX WARNING: Removed duplicated region for block: B:116:0x054c A[Catch:{ Exception -> 0x0647 }] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x054d A[Catch:{ Exception -> 0x0647 }] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x056b A[Catch:{ Exception -> 0x0647 }] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x05df A[Catch:{ Exception -> 0x0647 }] */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x05e7 A[Catch:{ Exception -> 0x0647 }] */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x057b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0390  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x03c9  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x03f3  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x042e  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0473  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x04c6  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x04dc A[Catch:{ Exception -> 0x0615 }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x04ec A[Catch:{ Exception -> 0x0615 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C110538r(java.lang.String r19, java.lang.String r20, int r21, java.lang.String r22, android.graphics.Rect r23, int r24, int r25, int r26, int r27, int r28, int r29, int r30, int r31, int r32, long r33, long r35, boolean r37, boolean r38, int r39, int r40, boolean r41, int r42, fy3.C32226l<? super java.lang.Float, rx3.C13598b0> r43, fy3.C32226l<? super java.lang.String, rx3.C13598b0> r44) {
        /*
            r18 = this;
            r1 = r18
            r0 = r20
            r2 = r22
            r3 = r33
            r5 = r35
            java.lang.Class<h81.h> r7 = h81.C32735h.class
            java.lang.String r8 = "filePath"
            gy3.C87412m.m108594g(r0, r8)
            java.lang.String r8 = "outputFilePath"
            gy3.C87412m.m108594g(r2, r8)
            r18.<init>()
            r8 = r19
            r1.f330577a = r8
            r1.f330579b = r0
            r0 = r21
            r1.f330581c = r0
            r1.f330583d = r2
            r0 = r23
            r1.f330585e = r0
            r0 = r24
            r1.f330587f = r0
            r0 = r25
            r1.f330589g = r0
            r0 = r26
            r1.f330591h = r0
            r0 = r27
            r1.f330593i = r0
            r0 = r28
            r1.f330595j = r0
            r0 = r29
            r1.f330597k = r0
            r0 = r30
            r1.f330599l = r0
            r0 = r31
            r1.f330601m = r0
            r0 = r32
            r1.f330603n = r0
            r0 = r37
            r1.f330604o = r0
            r0 = r38
            r1.f330605p = r0
            r0 = r39
            r1.f330606q = r0
            r0 = r40
            r1.f330607r = r0
            r0 = r41
            r1.f330608s = r0
            r0 = r42
            r1.f330609t = r0
            r0 = r43
            r1.f330610u = r0
            r0 = r44
            r1.f330611v = r0
            java.lang.String r0 = "MicroMsg.MediaCodecRemuxer"
            r1.f330612w = r0
            r8 = -1
            r1.f330551A = r8
            r1.f330553C = r3
            r8 = -1
            r1.f330554D = r8
            w80.a r8 = new w80.a
            java.lang.String r9 = "remuxCost"
            r8.<init>(r9)
            r1.f330573W = r8
            di3.d r8 = di3.C86312j.m106911c(r7)
            h81.h r8 = (h81.C32735h) r8
            h81.h$c r9 = h81.C32735h.C32737c.clicfg_remuxer_vfr_threshold
            r10 = 10
            int r8 = r8.mo58779Qe(r9, r10)
            r1.f330588f0 = r8
            di3.d r7 = di3.C86312j.m106911c(r7)
            h81.h r7 = (h81.C32735h) r7
            h81.h$c r8 = h81.C32735h.C32737c.clicfg_mediacodec_frame_timeout
            r9 = 60000(0xea60, float:8.4078E-41)
            int r7 = r7.mo58779Qe(r8, r9)
            r1.f330590g0 = r7
            r80.r$d r7 = new r80.r$d
            r7.<init>(r1)
            r1.f330600l0 = r7
            java.lang.String r7 = r1.f330579b
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            java.lang.String r8 = "create MediaCodecRemuxer error"
            java.lang.String r9 = "markRemuxVideoParaError"
            java.lang.String r10 = "create MediaCodecRemuxer error, filePath:"
            java.lang.String r11 = "MicroMsg.MediaEditorIDKeyStat"
            if (r7 != 0) goto L_0x0692
            java.lang.String r7 = r1.f330579b
            boolean r7 = com.tencent.p014mm.vfs.C86013q1.m106450k(r7)
            if (r7 == 0) goto L_0x0692
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r22)
            if (r7 != 0) goto L_0x0692
            int r7 = r1.f330591h
            if (r7 <= 0) goto L_0x0692
            int r7 = r1.f330593i
            if (r7 <= 0) goto L_0x0692
            w80.h r7 = w80.C102361h.f301459a
            int r12 = r1.f330581c
            r7.mo141932c(r12)
            java.lang.String r7 = r1.f330579b
            boolean r7 = com.tencent.p014mm.modelvideoh265toh264.C92862f.m117175h(r7)
            if (r7 == 0) goto L_0x00fd
            java.lang.String r7 = "remux h265 format"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r7)
            java.lang.String r7 = "markRemuxH265Video"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r7)
            com.tencent.mm.plugin.report.service.n r7 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r12 = 986(0x3da, double:4.87E-321)
            r14 = 7
            r16 = 1
            r23 = r7
            r24 = r12
            r26 = r14
            r28 = r16
            r23.mo175913w(r24, r26, r28)
        L_0x00fd:
            java.lang.String r2 = com.tencent.p014mm.vfs.C86013q1.m106458s(r22)
            com.tencent.p014mm.vfs.C86013q1.m106461v(r2)
            java.lang.String r2 = r1.f330579b
            int r2 = com.tencent.p014mm.plugin.sight.base.SightVideoJNI.getMp4RotateVFS(r2)
            r1.f330615z = r2
            boolean r7 = r1.f330608s
            if (r7 == 0) goto L_0x0120
            r7 = 90
            if (r2 == r7) goto L_0x0118
            r7 = 270(0x10e, float:3.78E-43)
            if (r2 != r7) goto L_0x0120
        L_0x0118:
            int r2 = r1.f330591h
            int r7 = r1.f330593i
            r1.f330591h = r7
            r1.f330593i = r2
        L_0x0120:
            boolean r2 = r1.f330604o
            r7 = 16
            if (r2 == 0) goto L_0x0157
            int r2 = r1.f330591h
            int r2 = r1.mo161997k(r2, r7)
            r1.f330591h = r2
            int r2 = r1.f330593i
            r12 = 4
            int r2 = r1.mo161997k(r2, r12)
            r1.f330593i = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r12 = "resize width to "
            r2.append(r12)
            int r12 = r1.f330591h
            r2.append(r12)
            java.lang.String r12 = " height to "
            r2.append(r12)
            int r12 = r1.f330593i
            r2.append(r12)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
        L_0x0157:
            java.lang.String r0 = r1.f330579b
            r2 = 1
            com.tencent.mm.plugin.sight.base.a r0 = com.tencent.p014mm.plugin.sight.base.C94555d.m119567c(r0, r2)
            if (r0 == 0) goto L_0x0170
            int r12 = r0.f273445c
            r1.f330613x = r12
            int r12 = r0.f273446d
            r1.f330614y = r12
            int r12 = r0.f273447e
            r1.f330552B = r12
            int r12 = r0.f273443a
            r1.f330551A = r12
        L_0x0170:
            int r12 = r1.f330613x
            r13 = 0
            if (r12 <= 0) goto L_0x0179
            int r12 = r1.f330614y
            if (r12 > 0) goto L_0x01a0
        L_0x0179:
            oj.c r12 = new oj.c     // Catch:{ Exception -> 0x019f }
            r12.<init>()     // Catch:{ Exception -> 0x019f }
            java.lang.String r14 = r1.f330579b     // Catch:{ Exception -> 0x019f }
            r12.setDataSource(r14)     // Catch:{ Exception -> 0x019f }
            r14 = 18
            java.lang.String r14 = r12.extractMetadata(r14)     // Catch:{ Exception -> 0x019f }
            int r14 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r14, (int) r13)     // Catch:{ Exception -> 0x019f }
            r1.f330613x = r14     // Catch:{ Exception -> 0x019f }
            r14 = 19
            java.lang.String r14 = r12.extractMetadata(r14)     // Catch:{ Exception -> 0x019f }
            int r14 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r14, (int) r13)     // Catch:{ Exception -> 0x019f }
            r1.f330614y = r14     // Catch:{ Exception -> 0x019f }
            r12.release()     // Catch:{ Exception -> 0x019f }
            goto L_0x01a0
        L_0x019f:
        L_0x01a0:
            int r12 = r1.f330552B
            if (r12 <= 0) goto L_0x065a
            r8 = 0
            int r10 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r10 != 0) goto L_0x01b0
            int r10 = r1.f330551A
            long r14 = (long) r10
            r1.f330554D = r14
            goto L_0x01b2
        L_0x01b0:
            r1.f330554D = r5
        L_0x01b2:
            java.lang.String r10 = r1.f330612w
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r14 = "MediaCodecRemuxer frameTimeoutMs is:"
            r12.append(r14)
            int r14 = r1.f330590g0
            r12.append(r14)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r12)
            w80.i r10 = w80.C111750i.f334661a
            java.lang.String r12 = r1.f330579b
            w80.i$a r10 = r10.mo163488a(r12)
            boolean r12 = r1.f330604o
            if (r12 == 0) goto L_0x0201
            r80.m0 r14 = new r80.m0
            long r8 = r1.f330553C
            long r2 = r1.f330554D
            int r4 = r1.f330595j
            int r15 = r1.f330591h
            int r7 = r1.f330593i
            int r13 = r1.f330603n
            float r13 = (float) r13
            r40 = r11
            boolean r11 = r1.f330605p
            r19 = r14
            r20 = r8
            r22 = r2
            r24 = r4
            r25 = r15
            r26 = r7
            r27 = r12
            r28 = r13
            r29 = r11
            r30 = r10
            r19.<init>(r20, r22, r24, r25, r26, r27, r28, r29, r30)
            goto L_0x0224
        L_0x0201:
            r40 = r11
            r80.m0 r14 = new r80.m0
            long r2 = r1.f330553C
            long r7 = r1.f330554D
            int r4 = r1.f330595j
            r9 = 0
            r11 = 16
            r13 = 0
            r19 = r14
            r20 = r2
            r22 = r7
            r24 = r4
            r25 = r12
            r26 = r9
            r27 = r10
            r28 = r11
            r29 = r13
            r19.<init>(r20, r22, r24, r25, r26, r27, r28, r29)
        L_0x0224:
            r1.f330561K = r14
            int r2 = r1.f330601m
            if (r2 > 0) goto L_0x022d
            r2 = 1
            r1.f330601m = r2
        L_0x022d:
            java.lang.String r2 = r1.f330612w
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "create MediaCodecRemuxer, filePath: "
            r3.append(r4)
            java.lang.String r4 = r1.f330579b
            r3.append(r4)
            java.lang.String r4 = ", outputFilePath: "
            r3.append(r4)
            java.lang.String r4 = r1.f330583d
            r3.append(r4)
            java.lang.String r4 = ", inputWidth: "
            r3.append(r4)
            int r4 = r1.f330613x
            r3.append(r4)
            java.lang.String r4 = ", inputHeight: "
            r3.append(r4)
            int r4 = r1.f330614y
            r3.append(r4)
            java.lang.String r4 = ", videoRotate: "
            r3.append(r4)
            int r4 = r1.f330615z
            r3.append(r4)
            java.lang.String r4 = " videoFps: "
            r3.append(r4)
            int r4 = r1.f330552B
            r3.append(r4)
            java.lang.String r4 = " ,outputBitrate :"
            r3.append(r4)
            int r4 = r1.f330595j
            r3.append(r4)
            java.lang.String r4 = ", outputAudioBitrate:"
            r3.append(r4)
            int r4 = r1.f330597k
            r3.append(r4)
            java.lang.String r4 = ", outputAudioChannelCount:"
            r3.append(r4)
            int r4 = r1.f330601m
            r3.append(r4)
            java.lang.String r4 = ", outputWidth: "
            r3.append(r4)
            int r4 = r1.f330591h
            r3.append(r4)
            java.lang.String r4 = ", outputHeight: "
            r3.append(r4)
            int r4 = r1.f330593i
            r3.append(r4)
            java.lang.String r4 = ", startTimeMs: "
            r3.append(r4)
            r7 = r33
            r3.append(r7)
            java.lang.String r4 = ", endTimeMs: "
            r3.append(r4)
            r3.append(r5)
            java.lang.String r4 = " , outputFps: "
            r3.append(r4)
            int r4 = r1.f330603n
            r3.append(r4)
            java.lang.String r4 = " , videoDuration: "
            r3.append(r4)
            int r4 = r1.f330551A
            r3.append(r4)
            java.lang.String r4 = " , remuxStartTime: "
            r3.append(r4)
            long r4 = r1.f330553C
            r3.append(r4)
            java.lang.String r4 = " ,remuxEndTime: "
            r3.append(r4)
            long r4 = r1.f330554D
            r3.append(r4)
            java.lang.String r4 = " , input bitrate:"
            r3.append(r4)
            int r0 = r0.f273444b
            r3.append(r0)
            java.lang.String r0 = ", enableHevc:"
            r3.append(r0)
            boolean r0 = r1.f330605p
            r3.append(r0)
            java.lang.String r0 = ", forceLandscape:"
            r3.append(r0)
            boolean r0 = r1.f330608s
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printInfoStack(r2, r0, r4)
            o80.a r0 = new o80.a
            java.lang.String r2 = r1.f330579b
            r0.<init>(r2)
            r1.f330560J = r0
            boolean r0 = r0.f329164k
            if (r0 == 0) goto L_0x032c
            java.lang.String r0 = "markRemuxMediaExtractorCreateFailed"
            r3 = r40
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r4 = 986(0x3da, double:4.87E-321)
            r6 = 11
            r8 = 1
            r19 = r0
            r20 = r4
            r22 = r6
            r24 = r8
            r19.mo175913w(r20, r22, r24)
            goto L_0x032e
        L_0x032c:
            r3 = r40
        L_0x032e:
            int r0 = r1.f330591h
            int r2 = r1.f330613x
            int r0 = r0 - r2
            r2 = 1
            if (r2 > r0) goto L_0x033c
            r2 = 16
            if (r0 >= r2) goto L_0x033c
            r0 = 1
            goto L_0x033d
        L_0x033c:
            r0 = 0
        L_0x033d:
            if (r0 != 0) goto L_0x0353
            int r0 = r1.f330593i
            int r2 = r1.f330614y
            int r0 = r0 - r2
            r2 = 1
            if (r2 > r0) goto L_0x034d
            r2 = 16
            if (r0 >= r2) goto L_0x034d
            r0 = 1
            goto L_0x034e
        L_0x034d:
            r0 = 0
        L_0x034e:
            if (r0 == 0) goto L_0x0351
            goto L_0x0353
        L_0x0351:
            r0 = 0
            goto L_0x0354
        L_0x0353:
            r0 = 1
        L_0x0354:
            java.lang.String r2 = r1.f330612w
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "needCheckCropRect:"
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            java.lang.String r0 = r1.f330612w
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "startRemux, useSoftEncode:"
            r2.append(r4)
            boolean r4 = r1.f330604o
            r2.append(r4)
            java.lang.String r4 = ", enablHevc:"
            r2.append(r4)
            boolean r4 = r1.f330605p
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            boolean r0 = r1.f330605p
            if (r0 == 0) goto L_0x03c5
            boolean r0 = r1.f330604o
            if (r0 == 0) goto L_0x03ad
            java.lang.String r0 = "markRemuxUseSwHevc"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r4 = 986(0x3da, double:4.87E-321)
            r6 = 123(0x7b, double:6.1E-322)
            r8 = 1
            r19 = r0
            r20 = r4
            r22 = r6
            r24 = r8
            r19.mo175913w(r20, r22, r24)
            goto L_0x03c5
        L_0x03ad:
            java.lang.String r0 = "markRemuxUseHwHevc"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r4 = 986(0x3da, double:4.87E-321)
            r6 = 124(0x7c, double:6.13E-322)
            r8 = 1
            r19 = r0
            r20 = r4
            r22 = r6
            r24 = r8
            r19.mo175913w(r20, r22, r24)
        L_0x03c5:
            boolean r0 = r1.f330604o
            if (r0 == 0) goto L_0x03e1
            java.lang.String r0 = "markRemuxX264Encode"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r4 = 986(0x3da, double:4.87E-321)
            r6 = 100
            r8 = 1
            r19 = r0
            r20 = r4
            r22 = r6
            r24 = r8
            r19.mo175913w(r20, r22, r24)
        L_0x03e1:
            s80.b r0 = r18.mo158336i()
            java.lang.String r2 = r1.f330579b
            r80.n0$a r4 = r80.C12962n0.f36985a
            java.lang.String r5 = r4.mo12495a(r2)
            boolean r6 = com.tencent.p014mm.vfs.C86013q1.m106450k(r5)
            if (r6 == 0) goto L_0x03f6
            com.tencent.p014mm.vfs.C86013q1.m106447h(r5)
        L_0x03f6:
            java.lang.String r6 = r1.f330612w
            r7 = 2
            java.lang.Object[] r8 = new java.lang.Object[r7]
            r9 = 0
            r8[r9] = r2
            r10 = 1
            r8[r10] = r5
            java.lang.String r10 = "copyVideoFile from %s, to %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r10, r8)
            long r10 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            long r5 = com.tencent.p014mm.vfs.C86013q1.m106443d(r2, r5, r9)
            java.lang.String r2 = r1.f330612w
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "copy video file cost "
            r8.append(r9)
            long r9 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r10)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r8)
            r8 = 0
            int r2 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r2 > 0) goto L_0x0446
            java.lang.String r2 = "markRemuxCopyFileFailed"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r5 = 986(0x3da, double:4.87E-321)
            r8 = 14
            r10 = 1
            r19 = r2
            r20 = r5
            r22 = r8
            r24 = r10
            r19.mo175913w(r20, r22, r24)
        L_0x0446:
            o80.a r2 = new o80.a
            java.lang.String r5 = r1.f330579b
            java.lang.String r5 = r4.mo12495a(r5)
            r2.<init>(r5)
            r1.f330563M = r2
            java.lang.String r2 = r1.f330612w
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "cpVideoFile:"
            r5.append(r6)
            java.lang.String r6 = r1.f330579b
            java.lang.String r4 = r4.mo12495a(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
            o80.a r2 = r1.f330563M
            if (r2 == 0) goto L_0x04c1
            r80.i0 r4 = new r80.i0
            r80.m0 r5 = r1.f330561K
            java.lang.String r6 = r1.f330583d
            int r8 = r1.f330581c
            int r9 = r1.f330599l
            r10 = 1
            r19 = r4
            r20 = r5
            r21 = r2
            r22 = r6
            r23 = r8
            r24 = r9
            r25 = r10
            r19.<init>(r20, r21, r22, r23, r24, r25)
            r1.f330570T = r4
            java.lang.String r2 = r1.f330577a
            boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106450k(r2)
            if (r2 == 0) goto L_0x04c1
            o80.a r2 = new o80.a
            java.lang.String r4 = r1.f330577a
            gy3.C87412m.m108591d(r4)
            r2.<init>(r4)
            boolean r4 = r2.f329164k
            if (r4 == 0) goto L_0x04bf
            java.lang.String r4 = "markRemuxMusicMediaExtractorCreateFailed"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            com.tencent.mm.plugin.report.service.n r4 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r5 = 986(0x3da, double:4.87E-321)
            r8 = 15
            r10 = 1
            r19 = r4
            r20 = r5
            r22 = r8
            r24 = r10
            r19.mo175913w(r20, r22, r24)
        L_0x04bf:
            r1.f330562L = r2
        L_0x04c1:
            r80.i0 r2 = r1.f330570T
            if (r2 != 0) goto L_0x04c6
            goto L_0x04ca
        L_0x04c6:
            int r4 = r1.f330615z
            r2.f330506b = r4
        L_0x04ca:
            l80.d r2 = r18.mo161995h()     // Catch:{ Exception -> 0x0647 }
            r80.e0 r4 = new r80.e0     // Catch:{ Exception -> 0x0647 }
            r4.<init>(r1)     // Catch:{ Exception -> 0x0647 }
            r80.f0 r5 = new r80.f0     // Catch:{ Exception -> 0x0647 }
            r5.<init>(r1)     // Catch:{ Exception -> 0x0647 }
            boolean r6 = r1.f330604o     // Catch:{ Exception -> 0x0615 }
            if (r6 == 0) goto L_0x04ec
            n80.i r4 = new n80.i     // Catch:{ Exception -> 0x0615 }
            r80.m0 r5 = r1.f330561K     // Catch:{ Exception -> 0x0615 }
            com.tencent.mm.plugin.sight.base.e r5 = r5.f330533e     // Catch:{ Exception -> 0x0615 }
            int r6 = r2.f327159b     // Catch:{ Exception -> 0x0615 }
            int r2 = r2.f327160c     // Catch:{ Exception -> 0x0615 }
            r4.<init>(r5, r6, r2)     // Catch:{ Exception -> 0x0615 }
            r1.f330557G = r4     // Catch:{ Exception -> 0x0615 }
            goto L_0x050b
        L_0x04ec:
            r6 = 23
            boolean r6 = p206nj.C11171e.m11046c(r6)     // Catch:{ Exception -> 0x0615 }
            if (r6 == 0) goto L_0x04ff
            n80.f r6 = new n80.f     // Catch:{ Exception -> 0x0615 }
            r80.s r8 = new r80.s     // Catch:{ Exception -> 0x0615 }
            r8.<init>(r4, r5)     // Catch:{ Exception -> 0x0615 }
            r6.<init>(r2, r8)     // Catch:{ Exception -> 0x0615 }
            goto L_0x0509
        L_0x04ff:
            n80.e r6 = new n80.e     // Catch:{ Exception -> 0x0615 }
            r80.t r8 = new r80.t     // Catch:{ Exception -> 0x0615 }
            r8.<init>(r4, r5)     // Catch:{ Exception -> 0x0615 }
            r6.<init>(r2, r8)     // Catch:{ Exception -> 0x0615 }
        L_0x0509:
            r1.f330556F = r6     // Catch:{ Exception -> 0x0615 }
        L_0x050b:
            r80.a r2 = new r80.a     // Catch:{ Exception -> 0x0647 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x0647 }
            r1.f330559I = r2     // Catch:{ Exception -> 0x0647 }
            int r3 = r1.f330552B     // Catch:{ Exception -> 0x0647 }
            r4 = 1000000000(0x3b9aca00, float:0.0047237873)
            int r4 = r4 / r3
            r2.f330454r = r4     // Catch:{ Exception -> 0x0647 }
            java.lang.String r3 = r2.f330438b     // Catch:{ Exception -> 0x0647 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0647 }
            r4.<init>()     // Catch:{ Exception -> 0x0647 }
            java.lang.String r5 = "videoFps : "
            r4.append(r5)     // Catch:{ Exception -> 0x0647 }
            int r2 = r2.f330454r     // Catch:{ Exception -> 0x0647 }
            r4.append(r2)     // Catch:{ Exception -> 0x0647 }
            java.lang.String r2 = r4.toString()     // Catch:{ Exception -> 0x0647 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)     // Catch:{ Exception -> 0x0647 }
            fy3.l<? super java.lang.Long, android.graphics.Bitmap> r2 = r1.f330568R     // Catch:{ Exception -> 0x0647 }
            if (r2 == 0) goto L_0x053d
            r80.a r3 = r1.f330559I     // Catch:{ Exception -> 0x0647 }
            if (r3 == 0) goto L_0x053d
            r3.mo161978g(r2)     // Catch:{ Exception -> 0x0647 }
        L_0x053d:
            fy3.l<? super java.lang.Long, android.graphics.Bitmap> r2 = r1.f330571U     // Catch:{ Exception -> 0x0647 }
            if (r2 == 0) goto L_0x0548
            r80.a r3 = r1.f330559I     // Catch:{ Exception -> 0x0647 }
            if (r3 == 0) goto L_0x0548
            r3.mo161979h(r2)     // Catch:{ Exception -> 0x0647 }
        L_0x0548:
            r80.a r2 = r1.f330559I     // Catch:{ Exception -> 0x0647 }
            if (r2 != 0) goto L_0x054d
            goto L_0x0554
        L_0x054d:
            r80.u r3 = new r80.u     // Catch:{ Exception -> 0x0647 }
            r3.<init>(r1)     // Catch:{ Exception -> 0x0647 }
            r2.f330442f = r3     // Catch:{ Exception -> 0x0647 }
        L_0x0554:
            r2 = 3
            double[] r3 = new double[r2]     // Catch:{ Exception -> 0x0647 }
            r4 = 0
            r6 = 0
            r3[r6] = r4     // Catch:{ Exception -> 0x0647 }
            r6 = 1
            r3[r6] = r4     // Catch:{ Exception -> 0x0647 }
            r3[r7] = r4     // Catch:{ Exception -> 0x0647 }
            java.lang.String r6 = r1.f330579b     // Catch:{ Exception -> 0x0647 }
            int r7 = r1.f330588f0     // Catch:{ Exception -> 0x0647 }
            w80.C90899c.m114027a(r6, r3, r7)     // Catch:{ Exception -> 0x0647 }
            r6 = 0
        L_0x0569:
            if (r6 >= r2) goto L_0x057b
            r7 = r3[r6]     // Catch:{ Exception -> 0x0647 }
            int r9 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r9 <= 0) goto L_0x0573
            r7 = 1
            goto L_0x0574
        L_0x0573:
            r7 = 0
        L_0x0574:
            if (r7 != 0) goto L_0x0578
            r2 = 0
            goto L_0x057c
        L_0x0578:
            int r6 = r6 + 1
            goto L_0x0569
        L_0x057b:
            r2 = 1
        L_0x057c:
            if (r2 == 0) goto L_0x05c2
            r2 = 1
            r4 = r3[r2]     // Catch:{ Exception -> 0x0647 }
            r2 = 0
            r6 = r3[r2]     // Catch:{ Exception -> 0x0647 }
            double r4 = r4 - r6
            int r2 = r1.f330588f0     // Catch:{ Exception -> 0x0647 }
            double r6 = (double) r2     // Catch:{ Exception -> 0x0647 }
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L_0x05c2
            java.lang.String r2 = r1.f330612w     // Catch:{ Exception -> 0x0647 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0647 }
            r4.<init>()     // Catch:{ Exception -> 0x0647 }
            java.lang.String r5 = "min fps = "
            r4.append(r5)     // Catch:{ Exception -> 0x0647 }
            r5 = 0
            r6 = r3[r5]     // Catch:{ Exception -> 0x0647 }
            r4.append(r6)     // Catch:{ Exception -> 0x0647 }
            java.lang.String r5 = ", max fps = "
            r4.append(r5)     // Catch:{ Exception -> 0x0647 }
            r5 = 1
            r6 = r3[r5]     // Catch:{ Exception -> 0x0647 }
            r4.append(r6)     // Catch:{ Exception -> 0x0647 }
            java.lang.String r3 = ", vfr threshold = "
            r4.append(r3)     // Catch:{ Exception -> 0x0647 }
            int r3 = r1.f330588f0     // Catch:{ Exception -> 0x0647 }
            r4.append(r3)     // Catch:{ Exception -> 0x0647 }
            java.lang.String r3 = " diff too much, set useRequestDraw to true"
            r4.append(r3)     // Catch:{ Exception -> 0x0647 }
            java.lang.String r3 = r4.toString()     // Catch:{ Exception -> 0x0647 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)     // Catch:{ Exception -> 0x0647 }
            r2 = 1
            r1.f330596j0 = r2     // Catch:{ Exception -> 0x0647 }
        L_0x05c2:
            java.lang.String r2 = r1.f330612w     // Catch:{ Exception -> 0x0647 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0647 }
            r3.<init>()     // Catch:{ Exception -> 0x0647 }
            java.lang.String r4 = "final useRequestDraw:"
            r3.append(r4)     // Catch:{ Exception -> 0x0647 }
            boolean r4 = r1.f330596j0     // Catch:{ Exception -> 0x0647 }
            r3.append(r4)     // Catch:{ Exception -> 0x0647 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0647 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)     // Catch:{ Exception -> 0x0647 }
            n80.b r2 = r1.f330556F     // Catch:{ Exception -> 0x0647 }
            r3 = 0
            if (r2 == 0) goto L_0x05e3
            android.view.Surface r3 = r2.mo160919c()     // Catch:{ Exception -> 0x0647 }
        L_0x05e3:
            r80.a r2 = r1.f330559I     // Catch:{ Exception -> 0x0647 }
            if (r2 == 0) goto L_0x0652
            boolean r4 = r1.f330596j0     // Catch:{ Exception -> 0x0647 }
            if (r4 != 0) goto L_0x05ed
            r4 = 1
            goto L_0x05ee
        L_0x05ed:
            r4 = 0
        L_0x05ee:
            boolean r5 = r1.f330604o     // Catch:{ Exception -> 0x0647 }
            if (r5 == 0) goto L_0x05f5
            int r6 = r1.f330591h     // Catch:{ Exception -> 0x0647 }
            goto L_0x05f6
        L_0x05f5:
            r6 = 0
        L_0x05f6:
            if (r5 == 0) goto L_0x05fb
            int r5 = r1.f330593i     // Catch:{ Exception -> 0x0647 }
            goto L_0x05fc
        L_0x05fb:
            r5 = 0
        L_0x05fc:
            long r7 = r1.f330553C     // Catch:{ Exception -> 0x0647 }
            r80.d0 r9 = new r80.d0     // Catch:{ Exception -> 0x0647 }
            r9.<init>(r1, r0)     // Catch:{ Exception -> 0x0647 }
            r19 = r2
            r20 = r3
            r21 = r4
            r22 = r6
            r23 = r5
            r24 = r7
            r26 = r9
            r19.mo161973b(r20, r21, r22, r23, r24, r26)     // Catch:{ Exception -> 0x0647 }
            goto L_0x0652
        L_0x0615:
            r0 = move-exception
            java.lang.String r2 = r1.f330612w     // Catch:{ Exception -> 0x0647 }
            java.lang.String r4 = "create encoder error"
            r5 = 0
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0647 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r4, r6)     // Catch:{ Exception -> 0x0647 }
            java.lang.String r0 = "markRemuxH264EncoderInitFailed"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)     // Catch:{ Exception -> 0x0647 }
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x0647 }
            r2 = 986(0x3da, double:4.87E-321)
            r4 = 16
            r6 = 1
            r19 = r0
            r20 = r2
            r22 = r4
            r24 = r6
            r19.mo175913w(r20, r22, r24)     // Catch:{ Exception -> 0x0647 }
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getSingleDefault()     // Catch:{ Exception -> 0x0647 }
            java.lang.String r2 = "mediacodec_create_error"
            r3 = 1
            r0.putBoolean(r2, r3)     // Catch:{ Exception -> 0x0647 }
            r2 = 0
            r1.mo161996j(r2, r3)     // Catch:{ Exception -> 0x0647 }
            goto L_0x0652
        L_0x0647:
            r0 = move-exception
            java.lang.String r2 = r1.f330612w
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "remux impl error"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r4, r3)
        L_0x0652:
            r80.r$a r0 = new r80.r$a
            r0.<init>(r1)
            r1.f330602m0 = r0
            return
        L_0x065a:
            r3 = r11
            java.lang.String r0 = r1.f330612w
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r10)
            java.lang.String r4 = r1.f330579b
            r2.append(r4)
            java.lang.String r4 = ", get video fps error"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r2)
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r9)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r2 = 986(0x3da, double:4.87E-321)
            r4 = 10
            r6 = 1
            r19 = r0
            r20 = r2
            r22 = r4
            r24 = r6
            r19.mo175913w(r20, r22, r24)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r8)
            throw r0
        L_0x0692:
            r3 = r11
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r10)
            java.lang.String r5 = r1.f330579b
            r4.append(r5)
            java.lang.String r5 = ", outputFilePath:"
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = ", outputWidth:"
            r4.append(r2)
            int r2 = r1.f330591h
            r4.append(r2)
            java.lang.String r2 = ", outputHeight:"
            r4.append(r2)
            int r2 = r1.f330593i
            r4.append(r2)
            java.lang.String r2 = ", videoFps:"
            r4.append(r2)
            int r2 = r1.f330552B
            r4.append(r2)
            java.lang.String r2 = ", outputFps:"
            r4.append(r2)
            int r2 = r1.f330603n
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r2)
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r9)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r2 = 986(0x3da, double:4.87E-321)
            r4 = 10
            r6 = 1
            r19 = r0
            r20 = r2
            r22 = r4
            r24 = r6
            r19.mo175913w(r20, r22, r24)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r80.C110538r.<init>(java.lang.String, java.lang.String, int, java.lang.String, android.graphics.Rect, int, int, int, int, int, int, int, int, int, long, long, boolean, boolean, int, int, boolean, int, fy3.l, fy3.l):void");
    }
}
