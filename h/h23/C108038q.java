package h23;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.HandlerThread;
import android.view.Surface;
import ch2.C92420d;
import com.tencent.p014mm.plugin.sight.base.C106139e;
import com.tencent.p014mm.plugin.sight.base.SightVideoJNI;
import com.tencent.p014mm.plugin.vlog.model.C96533c0;
import com.tencent.p014mm.plugin.vlog.model.C96556t0;
import com.tencent.p014mm.plugin.vlog.model.C96557v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.IXWebBroadcastListener;
import ei2.C97652g;
import f72.C97842b;
import fy3.C32224a;
import fy3.C32229r;
import g23.C107699d;
import g23.C107701f;
import g23.C107706i;
import g23.C107715p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h23.C108026d;
import hi2.C98453h;
import k80.C108915a;
import l80.C109277d;
import n80.C109697b;
import n80.C109704e;
import n80.C109708f;
import o40.C61926c;
import o80.C109993a;
import p206nj.C11171e;
import r80.C110533m0;
import rx3.C13598b0;
import sx3.C110818d0;
import w80.C111750i;

/* renamed from: h23.q */
public final class C108038q implements C92420d {

    /* renamed from: a */
    public final C96557v0 f323518a;

    /* renamed from: b */
    public C96556t0 f323519b;

    /* renamed from: c */
    public final C106139e f323520c = C106139e.f316165b.mo151879a(false);

    /* renamed from: d */
    public C109697b f323521d;

    /* renamed from: e */
    public C108026d f323522e;

    /* renamed from: f */
    public final C109277d f323523f;

    /* renamed from: g */
    public int f323524g;

    /* renamed from: h */
    public C109993a f323525h;

    /* renamed from: i */
    public C108915a f323526i;

    /* renamed from: j */
    public String f323527j;

    /* renamed from: k */
    public volatile boolean f323528k;

    /* renamed from: l */
    public volatile boolean f323529l;

    /* renamed from: m */
    public float f323530m;

    /* renamed from: n */
    public float f323531n;

    /* renamed from: o */
    public HandlerThread f323532o;

    /* renamed from: p */
    public HandlerThread f323533p;

    /* renamed from: q */
    public long f323534q;

    /* renamed from: r */
    public C110533m0 f323535r;

    /* renamed from: s */
    public C32229r<? super String, ? super String, ? super Boolean, ? super Integer, C13598b0> f323536s;

    /* renamed from: t */
    public boolean f323537t;

    /* renamed from: u */
    public String f323538u;

    /* renamed from: h23.q$a */
    public static final class C108039a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C108038q f323539d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108039a(C108038q qVar) {
            super(0);
            this.f323539d = qVar;
        }

        public Object invoke() {
            C108038q.m146348b(this.f323539d);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: h23.q$b */
    public static final class C108040b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C108038q f323540d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108040b(C108038q qVar) {
            super(0);
            this.f323540d = qVar;
        }

        /* JADX WARNING: type inference failed for: r8v13, types: [m80.e] */
        /* JADX WARNING: type inference failed for: r11v9, types: [m80.h] */
        /* JADX WARNING: type inference failed for: r11v10, types: [m80.g] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r21 = this;
                r1 = r21
                h23.q r0 = r1.f323540d
                com.tencent.mm.plugin.sight.base.e r2 = r0.f323520c
                int r2 = r2.f316167a
                com.tencent.mm.plugin.vlog.model.t0 r2 = r0.f323519b
                int r3 = r2.f282610k
                r4 = 1
                if (r3 > 0) goto L_0x0011
                r2.f282610k = r4
            L_0x0011:
                int r3 = r2.f282609j
                if (r3 > 0) goto L_0x001a
                r3 = 44100(0xac44, float:6.1797E-41)
                r2.f282609j = r3
            L_0x001a:
                java.lang.String r2 = r0.f323527j
                boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106450k(r2)
                java.lang.String r3 = "MicroMsg.VLogRemuxer"
                if (r2 != 0) goto L_0x0043
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r5 = "local has no music ,musicPath:"
                r2.append(r5)
                java.lang.String r5 = r0.f323527j
                r2.append(r5)
                java.lang.String r5 = "  and set Mute"
                r2.append(r5)
                java.lang.String r2 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
                r0.f323528k = r4
                goto L_0x0226
            L_0x0043:
                com.tencent.mm.plugin.vlog.model.t0 r2 = r0.f323519b
                int r2 = r2.f282601b
                if (r2 != 0) goto L_0x0052
                java.lang.String r2 = "mix silent, ignore remuxMusic"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
                r0.f323528k = r4
                goto L_0x0226
            L_0x0052:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r5 = "remuxMusic, mixType:"
                r2.append(r5)
                com.tencent.mm.plugin.vlog.model.t0 r5 = r0.f323519b
                int r5 = r5.f282601b
                r2.append(r5)
                java.lang.String r5 = " musicPath:"
                r2.append(r5)
                java.lang.String r5 = r0.f323527j
                r2.append(r5)
                java.lang.String r2 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
                java.lang.String r2 = r0.f323527j
                java.lang.String r5 = "MicroMsg.MediaEditorIDKeyStat"
                r6 = 2
                java.lang.String r7 = ""
                r8 = 0
                if (r2 == 0) goto L_0x00b3
                o80.a r9 = new o80.a
                r9.<init>(r2)
                boolean r2 = r9.f329164k
                if (r2 == 0) goto L_0x00ae
                java.lang.String r2 = "markRemuxMusicMediaExtractorCreateFailed"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
                com.tencent.mm.plugin.report.service.n r8 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r9 = 986(0x3da, double:4.87E-321)
                r11 = 15
                r13 = 1
                r8.mo175913w(r9, r11, r13)
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r2)
                r0.f323528k = r4
                r0.mo158427c()
                fy3.r<? super java.lang.String, ? super java.lang.String, ? super java.lang.Boolean, ? super java.lang.Integer, rx3.b0> r0 = r0.f323536s
                if (r0 == 0) goto L_0x0226
                java.lang.Boolean r2 = java.lang.Boolean.FALSE
                java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
                r0.mo162I(r7, r7, r2, r3)
                goto L_0x0226
            L_0x00ae:
                r0.f323525h = r9
                android.media.MediaFormat r2 = r9.f329159f
                goto L_0x00b4
            L_0x00b3:
                r2 = r8
            L_0x00b4:
                h23.b r9 = new h23.b
                com.tencent.mm.plugin.vlog.model.v0 r10 = r0.f323518a
                java.util.List<? extends com.tencent.mm.plugin.vlog.model.c0> r10 = r10.f282612b
                r9.<init>(r10)
                com.tencent.mm.plugin.vlog.model.t0 r10 = r0.f323519b
                int r10 = r10.f282601b
                if (r10 != r4) goto L_0x00ed
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r10 = "mix background, delete musicFile:"
                r2.append(r10)
                java.lang.String r10 = r0.f323527j
                r2.append(r10)
                java.lang.String r2 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
                hi2.h r2 = hi2.C98453h.f288774a
                java.lang.String r10 = r0.f323527j
                r2.mo137810h(r10)
                r0.f323527j = r8
                o80.a r2 = r0.f323525h
                if (r2 == 0) goto L_0x00e9
                r2.mo161327e()
            L_0x00e9:
                r0.f323525h = r8
                android.media.MediaFormat r2 = r9.f323466B
            L_0x00ed:
                com.tencent.mm.plugin.vlog.model.t0 r8 = r0.f323519b
                int r8 = r8.f282601b
                r10 = 3
                if (r8 != r10) goto L_0x0110
                java.util.ArrayList<h23.b$c> r8 = r9.f323473w
                boolean r8 = r8.isEmpty()
                r8 = r8 ^ r4
                if (r8 == 0) goto L_0x0107
                java.lang.String r8 = "has video mix all"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r8)
                com.tencent.mm.plugin.vlog.model.t0 r8 = r0.f323519b
                r8.f282601b = r10
                goto L_0x0110
            L_0x0107:
                java.lang.String r8 = "do not have video mix music"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r8)
                com.tencent.mm.plugin.vlog.model.t0 r8 = r0.f323519b
                r8.f282601b = r6
            L_0x0110:
                k80.a r10 = new k80.a
                com.tencent.mm.plugin.vlog.model.t0 r8 = r0.f323519b
                int r11 = r8.f282601b
                int r12 = r8.f282609j
                int r8 = r8.f282610k
                h23.h r13 = new h23.h
                r13.<init>(r0)
                r10.<init>(r11, r12, r8, r13)
                r0.f323526i = r10
                com.tencent.mm.plugin.vlog.model.t0 r8 = r0.f323519b
                int r11 = r8.f282601b
                r15 = 0
                if (r11 != r6) goto L_0x013d
                r11 = 0
                o80.a r12 = r0.f323525h
                r13 = 0
                int r5 = r8.f282600a
                long r5 = (long) r5
                r7 = 0
                r15 = r5
                r10.mo160049j(r11, r12, r13, r15)
                r9.mo158418e()
                goto L_0x01d9
            L_0x013d:
                r6 = 0
                o80.a r12 = r0.f323525h
                r13 = 0
                int r8 = r8.f282600a
                r20 = r7
                long r6 = (long) r8
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r11 = "initWithBackgroundDecoder, backgroundDecoder:"
                r8.append(r11)
                r8.append(r9)
                java.lang.String r11 = ", music:"
                r8.append(r11)
                r8.append(r12)
                java.lang.String r11 = ", startTime:"
                r8.append(r11)
                r8.append(r13)
                java.lang.String r11 = ", endTime:"
                r8.append(r11)
                r8.append(r6)
                java.lang.String r8 = r8.toString()
                java.lang.String r15 = "MicroMsg.MediaCodecAACCodec"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r8)
                r10.f326282f = r9     // Catch:{ Exception -> 0x0229 }
                k80.b r8 = new k80.b     // Catch:{ Exception -> 0x0229 }
                r8.<init>(r10)     // Catch:{ Exception -> 0x0229 }
                r9.f327850e = r8     // Catch:{ Exception -> 0x0229 }
                m80.e r8 = r10.f326282f     // Catch:{ Exception -> 0x0229 }
                if (r8 == 0) goto L_0x0189
                k80.c r9 = new k80.c     // Catch:{ Exception -> 0x0229 }
                r9.<init>(r10)     // Catch:{ Exception -> 0x0229 }
                r8.f327851f = r9     // Catch:{ Exception -> 0x0229 }
            L_0x0189:
                if (r12 == 0) goto L_0x01d9
                r8 = 23
                boolean r8 = p206nj.C11171e.m11044a(r8)     // Catch:{ Exception -> 0x0229 }
                if (r8 == 0) goto L_0x01b3
                m80.g r8 = new m80.g     // Catch:{ Exception -> 0x0229 }
                java.lang.String r9 = "music"
                r16 = 0
                long r6 = r6 - r13
                k80.d r14 = new k80.d     // Catch:{ Exception -> 0x0229 }
                r14.<init>(r10)     // Catch:{ Exception -> 0x0229 }
                k80.e r13 = new k80.e     // Catch:{ Exception -> 0x0229 }
                r13.<init>(r10)     // Catch:{ Exception -> 0x0229 }
                r11 = r8
                r19 = r13
                r13 = r9
                r18 = r14
                r9 = r15
                r14 = r16
                r16 = r6
                r11.<init>(r12, r13, r14, r16, r18, r19)     // Catch:{ Exception -> 0x01d7 }
                goto L_0x01d4
            L_0x01b3:
                r9 = r15
                r10.f326296t = r4     // Catch:{ Exception -> 0x01d7 }
                m80.h r8 = new m80.h     // Catch:{ Exception -> 0x01d7 }
                java.lang.String r15 = "music"
                r16 = 0
                long r6 = r6 - r13
                k80.f r14 = new k80.f     // Catch:{ Exception -> 0x01d7 }
                r14.<init>(r10)     // Catch:{ Exception -> 0x01d7 }
                k80.g r13 = new k80.g     // Catch:{ Exception -> 0x01d7 }
                r13.<init>(r10)     // Catch:{ Exception -> 0x01d7 }
                r11 = r8
                r19 = r13
                r13 = r15
                r18 = r14
                r14 = r16
                r16 = r6
                r11.<init>(r12, r13, r14, r16, r18, r19)     // Catch:{ Exception -> 0x01d7 }
            L_0x01d4:
                r10.f326281e = r8     // Catch:{ Exception -> 0x01d7 }
                goto L_0x01d9
            L_0x01d7:
                r0 = move-exception
                goto L_0x022b
            L_0x01d9:
                java.lang.String r5 = "bitrate"
                if (r2 == 0) goto L_0x01e5
                boolean r6 = r2.containsKey(r5)
                if (r6 != 0) goto L_0x01e5
                r15 = 1
                goto L_0x01e6
            L_0x01e5:
                r15 = 0
            L_0x01e6:
                if (r15 == 0) goto L_0x01ef
                com.tencent.mm.plugin.vlog.model.t0 r6 = r0.f323519b
                int r6 = r6.f282606g
                r2.setInteger(r5, r6)
            L_0x01ef:
                if (r2 == 0) goto L_0x01fa
                com.tencent.mm.plugin.vlog.model.t0 r5 = r0.f323519b
                int r5 = r5.f282610k
                java.lang.String r6 = "channel-count"
                r2.setInteger(r6, r5)
            L_0x01fa:
                if (r2 == 0) goto L_0x0205
                k80.a r5 = r0.f323526i
                if (r5 == 0) goto L_0x0203
                r5.mo160050k(r2)
            L_0x0203:
                r15 = 1
                goto L_0x0206
            L_0x0205:
                r15 = 0
            L_0x0206:
                if (r15 == 0) goto L_0x0215
                k80.a r2 = r0.f323526i
                if (r2 == 0) goto L_0x0226
                h23.i r3 = new h23.i
                r3.<init>(r0)
                r2.mo160052m(r3)
                goto L_0x0226
            L_0x0215:
                java.lang.String r2 = "remuxMusic cannot init encoder, return"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r2)
                o80.a r2 = r0.f323525h
                if (r2 == 0) goto L_0x0221
                r2.mo161327e()
            L_0x0221:
                r0.f323528k = r4
                r0.mo158428d()
            L_0x0226:
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            L_0x0229:
                r0 = move-exception
                r9 = r15
            L_0x022b:
                r2 = 0
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r20
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r9, r0, r3, r2)
                java.lang.String r2 = "markRemuxAACDecoderInitFailed"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
                com.tencent.mm.plugin.report.service.n r6 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r7 = 986(0x3da, double:4.87E-321)
                r9 = 22
                r11 = 1
                r6.mo175913w(r7, r9, r11)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: h23.C108038q.C108040b.invoke():java.lang.Object");
        }
    }

    public C108038q(C96557v0 v0Var, C96556t0 t0Var) {
        C87412m.m108594g(v0Var, "scriptModel");
        C87412m.m108594g(t0Var, "remuxModel");
        this.f323518a = v0Var;
        this.f323519b = t0Var;
        C109277d dVar = new C109277d(false, 1, (C8480h) null);
        this.f323523f = dVar;
        this.f323530m = 1.0f;
        this.f323531n = 1.0f;
        C98453h hVar = C98453h.f288774a;
        String str = this.f323519b.f282602c;
        C87412m.m108594g(str, "videoPath");
        String n = C97842b.m126297n(str);
        C87412m.m108593f(n, "getThumbName(videoPath)");
        this.f323538u = n;
        C96556t0 t0Var2 = this.f323519b;
        dVar.f327161d = t0Var2.f282605f;
        dVar.f327162e = t0Var2.f282607h;
        dVar.f327160c = t0Var2.f282604e;
        dVar.f327159b = t0Var2.f282603d;
        this.f323535r = new C110533m0(0, ((C96533c0) C110818d0.m150923U(v0Var.f282612b)).f282490b, this.f323519b.f282605f, false, false, (C111750i.C102362a) null, 48, (C8480h) null);
        Log.m105924i("MicroMsg.VLogRemuxer", "encodeConfig: " + dVar + ' ');
        Log.m105924i("MicroMsg.VLogRemuxer", "remuxModel: " + this.f323519b + ' ');
    }

    /* renamed from: b */
    public static final void m146348b(C108038q qVar) {
        qVar.getClass();
        C108037p pVar = new C108037p(qVar);
        try {
            qVar.f323521d = C11171e.m11046c(23) ? new C109708f(qVar.f323523f, pVar) : new C109704e(qVar.f323523f, pVar);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.VLogRemuxer", e, "remux error", new Object[0]);
            qVar.mo158427c();
            C32229r<? super String, ? super String, ? super Boolean, ? super Integer, C13598b0> rVar = qVar.f323536s;
            if (rVar != null) {
                rVar.mo162I("", "", Boolean.FALSE, 3);
            }
        }
        C109697b bVar = qVar.f323521d;
        if (bVar != null) {
            Surface c = bVar.mo160919c();
            C96556t0 t0Var = qVar.f323519b;
            int i = t0Var.f282603d;
            int i2 = t0Var.f282604e;
            C108026d dVar = new C108026d(c, i, i2, i, i2, t0Var.f282600a, qVar.f323523f.f327162e, qVar.f323530m, qVar.f323531n, qVar.f323518a, new C108031j(qVar, bVar), new C108032k(bVar));
            qVar.f323522e = dVar;
            if (qVar.f323537t) {
                dVar.f323499d.f322243j = new C32695e(dVar, new C108034m(qVar));
            }
            C108026d dVar2 = qVar.f323522e;
            if (dVar2 != null) {
                dVar2.f323499d.mo158109b((Rect) null);
            }
            C108026d dVar3 = qVar.f323522e;
            if (dVar3 != null) {
                boolean z = qVar.f323537t;
                Log.m105924i("MicroMsg.VLogDecoder", "startDecode, withSnapshot:" + z);
                dVar3.f323504i = z;
                C107701f.m145877a(dVar3.f323499d, (Bitmap) ((C108026d.C98314c) dVar3.f323505j).invoke(0L), z, (C32224a) null, 4, (Object) null);
            }
        }
    }

    /* renamed from: a */
    public void mo126422a(C32229r<? super String, ? super String, ? super Boolean, ? super Integer, C13598b0> rVar) {
        Log.m105924i("MicroMsg.VLogRemuxer", IXWebBroadcastListener.STAGE_START);
        this.f323536s = rVar;
        this.f323534q = Util.currentTicks();
        HandlerThread handlerThread = this.f323533p;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        this.f323533p = C61926c.m72685j("VLogRemuxer_remuxVideo", false, new C108039a(this));
        HandlerThread handlerThread2 = this.f323532o;
        if (handlerThread2 != null) {
            handlerThread2.quit();
        }
        this.f323532o = C61926c.m72685j("VLogRemuxer_remuxMusic", false, new C108040b(this));
    }

    /* renamed from: c */
    public final void mo158427c() {
        C108026d dVar = this.f323522e;
        if (dVar != null) {
            Log.m105924i("MicroMsg.VLogDecoder", "release");
            C107701f fVar = dVar.f323499d;
            fVar.getClass();
            Log.printInfoStack("MicroMsg.VLogDirector", "VLogRelease into VLogDirector#release 1", new Object[0]);
            C107715p pVar = fVar.f322240g;
            if (pVar != null) {
                Log.m105918d("MicroMsg.VLogDirector", "VLogRelease into VLogDirector#release 2");
                pVar.mo158117c(new C107699d(fVar));
            }
            C107715p pVar2 = fVar.f322240g;
            if (pVar2 != null) {
                pVar2.mo158118d();
            }
            C107706i iVar = C107706i.f322258a;
            Log.m105924i("MicroMsg.VLogMaterialsInfoCache", "clearCache");
            C107706i.f322259b.clear();
            C97652g gVar = dVar.f323503h;
            if (gVar != null) {
                gVar.mo136911d();
            } else {
                C87412m.m108603p("frameRetriever");
                throw null;
            }
        }
        C109697b bVar = this.f323521d;
        if (bVar != null) {
            bVar.mo160922f();
        }
        HandlerThread handlerThread = this.f323533p;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        HandlerThread handlerThread2 = this.f323532o;
        if (handlerThread2 != null) {
            handlerThread2.quitSafely();
        }
    }

    /* renamed from: d */
    public final void mo158428d() {
        if (this.f323528k && this.f323529l) {
            C110533m0 m0Var = this.f323535r;
            C96556t0 t0Var = this.f323519b;
            int a = m0Var.mo161987a((C109993a) null, t0Var.f282602c, t0Var.f282609j, t0Var.f282610k, false);
            boolean z = a >= 0;
            Log.m105924i("MicroMsg.VLogRemuxer", "mux finish, cost:" + Util.ticksToNow(this.f323534q) + ",succ:" + z + "  result:" + a + ", path:" + this.f323519b + ".outputPath");
            Log.m105924i("MicroMsg.VLogRemuxer", "release");
            mo158427c();
            this.f323535r.mo161988b();
            if (z) {
                SightVideoJNI.optimizeMP4VFS(this.f323519b.f282602c);
                C98453h.m127895t(C98453h.f288774a, this.f323519b.f282602c, this.f323538u, 0, 4, (Object) null);
            }
            C32229r<? super String, ? super String, ? super Boolean, ? super Integer, C13598b0> rVar = this.f323536s;
            if (rVar != null) {
                rVar.mo162I(this.f323519b.f282602c, this.f323538u, Boolean.valueOf(z), -1);
            }
        }
    }

    /* renamed from: e */
    public final void mo158429e(int i, int i2) {
        C96556t0 t0Var = this.f323519b;
        this.f323530m = ((float) i) / ((float) t0Var.f282603d);
        this.f323531n = ((float) i2) / ((float) t0Var.f282604e);
        Log.m105924i("MicroMsg.VLogRemuxer", "setPreviewSurfaceSize: [" + i + ", " + i2 + "], scale:[" + this.f323530m + ", " + this.f323531n + ']');
    }
}
