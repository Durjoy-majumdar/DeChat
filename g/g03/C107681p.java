package g03;

import ac3.C103355g1;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.os.HandlerThread;
import android.view.Surface;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.xeffect.VLogDirector;
import com.tencent.p014mm.xeffect.effect.EffectManager;
import com.tencent.p014mm.xeffect.effect.VLogEffectJNI;
import d03.C58010a;
import eu3.C58834h;
import eu3.C97749e;
import fy3.C32224a;
import fy3.C32226l;
import g03.C59338a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import i03.C60239b;
import j03.C60695a;
import j03.C60698b;
import java.util.ArrayList;
import p80.C110194c;
import rr3.C110625c0;
import rr3.C110631h;
import rr3.C110632i;
import rr3.C110634k;
import rx3.C13598b0;
import u80.C111143e;
import w80.C111742d;
import zt3.C119157j;

/* renamed from: g03.p */
public final class C107681p implements C59338a {

    /* renamed from: A */
    public long f322150A = -1;

    /* renamed from: B */
    public boolean f322151B;

    /* renamed from: C */
    public float f322152C = -1.0f;

    /* renamed from: D */
    public C32226l<? super Long, C13598b0> f322153D;

    /* renamed from: E */
    public volatile boolean f322154E;

    /* renamed from: F */
    public volatile boolean f322155F;

    /* renamed from: G */
    public C32226l<? super Bitmap, C13598b0> f322156G;

    /* renamed from: a */
    public final String f322157a = ("MicroMsg.TPPlayerEffector@" + hashCode());

    /* renamed from: b */
    public C59338a.C59339a f322158b;

    /* renamed from: c */
    public C60239b f322159c = new C60239b();

    /* renamed from: d */
    public SurfaceTexture f322160d;

    /* renamed from: e */
    public MMHandler f322161e;

    /* renamed from: f */
    public HandlerThread f322162f;

    /* renamed from: g */
    public C111742d.C65942b f322163g;

    /* renamed from: h */
    public volatile int f322164h;

    /* renamed from: i */
    public volatile int f322165i;

    /* renamed from: j */
    public volatile int f322166j;

    /* renamed from: k */
    public volatile int f322167k;

    /* renamed from: l */
    public VLogDirector f322168l = new VLogDirector();

    /* renamed from: m */
    public EffectManager f322169m;

    /* renamed from: n */
    public C110194c f322170n;

    /* renamed from: o */
    public SurfaceTexture f322171o;

    /* renamed from: p */
    public C111143e f322172p;

    /* renamed from: q */
    public C110194c f322173q;

    /* renamed from: r */
    public boolean f322174r;

    /* renamed from: s */
    public boolean f322175s;

    /* renamed from: t */
    public int f322176t;

    /* renamed from: u */
    public int f322177u;

    /* renamed from: v */
    public int f322178v = 1;

    /* renamed from: w */
    public C110634k f322179w;

    /* renamed from: x */
    public ArrayList<C58010a> f322180x = new ArrayList<>();

    /* renamed from: y */
    public C58010a f322181y;

    /* renamed from: z */
    public int f322182z = -1;

    /* renamed from: g03.p$b */
    public static final class C59340b extends C87413o implements C32226l<C60695a, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C107681p f169632d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59340b(C107681p pVar) {
            super(1);
            this.f169632d = pVar;
        }

        public Object invoke(Object obj) {
            C107681p pVar;
            C58010a aVar;
            C60695a aVar2 = (C60695a) obj;
            C87412m.m108594g(aVar2, LocaleUtil.ITALIAN);
            C60698b player = aVar2.getPlayer();
            long propertyLong = player != null ? player.getPropertyLong(205) : 0;
            C60698b player2 = aVar2.getPlayer();
            int i = 0;
            int videoWidth = player2 != null ? player2.getVideoWidth() : 0;
            C60698b player3 = aVar2.getPlayer();
            if (player3 != null) {
                i = player3.getVideoHeight();
            }
            this.f169632d.f322181y = aVar2.mo85621o();
            if (videoWidth > 0 && i > 0 && propertyLong >= 0) {
                C107681p pVar2 = this.f169632d;
                C58010a aVar3 = pVar2.f322181y;
                if (aVar3 != null) {
                    aVar3.f165950v = videoWidth;
                }
                if (aVar3 != null) {
                    aVar3.f165951w = i;
                }
                pVar2.f322166j = videoWidth;
                this.f169632d.f322167k = i;
                C58010a aVar4 = this.f169632d.f322181y;
                if (aVar4 != null) {
                    aVar4.f165939k = (int) propertyLong;
                }
            }
            if ((!this.f169632d.f322180x.isEmpty()) && (aVar = pVar.f322181y) != null) {
                pVar.f322182z = (pVar = this.f169632d).f322180x.indexOf(aVar);
            }
            String str = this.f169632d.f322157a;
            Log.m105924i(str, "onPlayStarted player width:" + videoWidth + ", height:" + i + ", rotate: " + propertyLong + ", currentMediaInfoIndex:" + this.f169632d.f322182z + ", playerPosition:" + aVar2.getCurrentPositionMs());
            return C13598b0.f38549a;
        }
    }

    /* renamed from: g03.p$a */
    public static final class C107682a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C107681p f322183d;

        /* renamed from: e */
        public final /* synthetic */ SurfaceTexture f322184e;

        /* renamed from: f */
        public final /* synthetic */ C111742d.C65942b f322185f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107682a(C107681p pVar, SurfaceTexture surfaceTexture, C111742d.C65942b bVar) {
            super(0);
            this.f322183d = pVar;
            this.f322184e = surfaceTexture;
            this.f322185f = bVar;
        }

        public Object invoke() {
            C111742d.C65942b bVar;
            C107681p pVar = this.f322183d;
            if (!(pVar.f322160d == null || (bVar = pVar.f322163g) == null)) {
                Log.m105924i(pVar.f322157a, "do detachSurface");
                C111742d.C111743a aVar = C111742d.f334647a;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                C87412m.m108593f(eGLSurface, "EGL_NO_SURFACE");
                aVar.mo163467m(bVar, eGLSurface);
                bVar.f189592b = EGL14.EGL_NO_SURFACE;
            }
            String str = this.f322183d.f322157a;
            Log.m105924i(str, "do attachSurface:" + this.f322184e.hashCode());
            C107681p pVar2 = this.f322183d;
            pVar2.f322160d = this.f322184e;
            C111742d.C111743a aVar2 = C111742d.f334647a;
            C111742d.C65942b bVar2 = this.f322185f;
            pVar2.f322163g = aVar2.mo163464g(bVar2.f189593c, bVar2.f189591a, new Surface(this.f322184e));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: g03.p$c */
    public static final class C107683c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C107681p f322186d;

        /* renamed from: e */
        public final /* synthetic */ C32226l<SurfaceTexture, C13598b0> f322187e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107683c(C107681p pVar, C32226l<? super SurfaceTexture, C13598b0> lVar) {
            super(0);
            this.f322186d = pVar;
            this.f322187e = lVar;
        }

        public Object invoke() {
            Log.m105924i(this.f322186d.f322157a, "createVideoTexture");
            C110194c cVar = this.f322186d.f322170n;
            if (cVar != null) {
                cVar.close();
            }
            this.f322186d.f322170n = new C110194c(false, 15);
            C107681p pVar = this.f322186d;
            C110194c cVar2 = pVar.f322170n;
            if (cVar2 != null) {
                C32226l<SurfaceTexture, C13598b0> lVar = this.f322187e;
                if (cVar2.f329652e > 0) {
                    SurfaceTexture surfaceTexture = new SurfaceTexture(cVar2.f329652e);
                    pVar.f322171o = surfaceTexture;
                    surfaceTexture.setOnFrameAvailableListener(new C107688r(pVar));
                    ((C119157j) C119157j.f356862d).mo183895z(new C107690s(lVar, pVar));
                } else {
                    String str = pVar.f322157a;
                    Log.m105920e(str, "create videoPlayTexture error texID:" + cVar2.f329652e);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: g03.p$d */
    public static final class C107684d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C107681p f322188d;

        /* renamed from: e */
        public final /* synthetic */ C32224a<C13598b0> f322189e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107684d(C107681p pVar, C32224a<C13598b0> aVar) {
            super(0);
            this.f322188d = pVar;
            this.f322189e = aVar;
        }

        public Object invoke() {
            C107681p pVar = this.f322188d;
            pVar.getClass();
            pVar.f322173q = new C110194c(true, 15);
            pVar.f322172p = new C111143e(0, 0, 0, 0, 1, 1, 12, (C8480h) null);
            this.f322188d.f322168l = new VLogDirector();
            this.f322188d.f322168l.mo154915c();
            String str = this.f322188d.f322157a;
            StringBuilder sb = new StringBuilder();
            sb.append("finished init and set effectManager, effectManager.nPtr:");
            EffectManager effectManager = this.f322188d.f322169m;
            sb.append(effectManager != null ? Long.valueOf(effectManager.f319989a) : null);
            Log.m105924i(str, sb.toString());
            this.f322188d.f322154E = true;
            C107681p pVar2 = this.f322188d;
            SurfaceTexture surfaceTexture = pVar2.f322160d;
            if (surfaceTexture != null) {
                pVar2.mo84442d(surfaceTexture);
            }
            ((C119157j) C119157j.f356862d).mo183895z(new C32298t(this.f322189e));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: g03.p$e */
    public static final class C107685e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C107681p f322190d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107685e(C107681p pVar) {
            super(0);
            this.f322190d = pVar;
        }

        public Object invoke() {
            Log.m105924i(this.f322190d.f322157a, "release");
            C107681p pVar = this.f322190d;
            pVar.f322174r = false;
            C110194c cVar = pVar.f322170n;
            if (cVar != null) {
                cVar.close();
            }
            C107681p pVar2 = this.f322190d;
            pVar2.f322170n = null;
            EffectManager effectManager = pVar2.f322169m;
            if (effectManager != null) {
                effectManager.mo154926f();
            }
            this.f322190d.f322168l.mo154914b();
            C110194c cVar2 = this.f322190d.f322173q;
            if (cVar2 != null) {
                cVar2.close();
            }
            C111143e eVar = this.f322190d.f322172p;
            if (eVar != null) {
                eVar.mo158471l();
            }
            C111742d.C65942b bVar = this.f322190d.f322163g;
            if (bVar != null) {
                C111742d.f334647a.mo163471q(bVar);
            }
            C107681p pVar3 = this.f322190d;
            pVar3.f322163g = null;
            HandlerThread handlerThread = pVar3.f322162f;
            if (handlerThread != null) {
                handlerThread.quitSafely();
            }
            C107681p pVar4 = this.f322190d;
            pVar4.f322162f = null;
            pVar4.f322161e = null;
            SurfaceTexture surfaceTexture = pVar4.f322160d;
            if (surfaceTexture != null) {
                surfaceTexture.release();
            }
            this.f322190d.f322154E = false;
            this.f322190d.getClass();
            this.f322190d.getClass();
            EffectManager effectManager2 = this.f322190d.f322169m;
            if (effectManager2 != null) {
                effectManager2.mo154931k();
            }
            this.f322190d.f322169m = null;
            return C13598b0.f38549a;
        }
    }

    /* renamed from: g03.p$f */
    public static final class C107686f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C32224a f322191d;

        public C107686f(C32224a aVar) {
            this.f322191d = aVar;
        }

        public final /* synthetic */ void run() {
            this.f322191d.invoke();
        }
    }

    static {
        Color.parseColor("#4c4c4c");
        C103355g1.f304769J.mo143261a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x02b2  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02b5  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02ba  */
    /* JADX WARNING: Removed duplicated region for block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0199 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01a4 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01de  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m145857a(g03.C107681p r25, long r26) {
        /*
            r0 = r25
            r1 = r26
            boolean r3 = r0.f322154E
            if (r3 != 0) goto L_0x0011
            java.lang.String r0 = r0.f322157a
            java.lang.String r1 = "onVideoPlayTextureUpdate not init finished"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
            goto L_0x0418
        L_0x0011:
            r3 = 0
            r5 = 1
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 >= 0) goto L_0x0037
            java.lang.String r3 = r0.f322157a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "timestamp < 0! "
            r4.append(r6)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r1)
            i03.b r0 = r0.f322159c
            int r1 = r0.f171747c
            int r1 = r1 + r5
            r0.f171747c = r1
            goto L_0x0418
        L_0x0037:
            w80.d$b r6 = r0.f322163g
            r7 = 0
            if (r6 == 0) goto L_0x003f
            android.opengl.EGLSurface r6 = r6.f189592b
            goto L_0x0040
        L_0x003f:
            r6 = r7
        L_0x0040:
            android.opengl.EGLSurface r8 = android.opengl.EGL14.EGL_NO_SURFACE
            boolean r6 = gy3.C87412m.m108589b(r6, r8)
            if (r6 == 0) goto L_0x0051
            java.lang.String r0 = r0.f322157a
            java.lang.String r1 = "onVideoPlayTextureUpdate error not attach surface now"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
            goto L_0x0418
        L_0x0051:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r8 = 1000000(0xf4240, float:1.401298E-39)
            long r8 = (long) r8
            long r1 = r1 / r8
            g03.a$a r8 = r0.f322158b
            r9 = 0
            if (r8 == 0) goto L_0x00ca
            d03.a r10 = r0.f322181y
            if (r10 == 0) goto L_0x00ca
            long r10 = r10.f165935g
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            long r11 = r10.longValue()
            int r13 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r13 <= 0) goto L_0x007c
            long r11 = r8.mo84452a()
            int r13 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r13 <= 0) goto L_0x007c
            r11 = 1
            goto L_0x007d
        L_0x007c:
            r11 = 0
        L_0x007d:
            if (r11 == 0) goto L_0x0080
            goto L_0x0081
        L_0x0080:
            r10 = r7
        L_0x0081:
            if (r10 == 0) goto L_0x00ca
            r10.longValue()
            java.lang.String r10 = r0.f322157a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "surface timestamp exceed current media duration "
            r11.append(r12)
            r11.append(r1)
            java.lang.String r1 = ", "
            r11.append(r1)
            d03.a r2 = r0.f322181y
            if (r2 == 0) goto L_0x00a5
            long r12 = r2.f165935g
            java.lang.Long r2 = java.lang.Long.valueOf(r12)
            goto L_0x00a6
        L_0x00a5:
            r2 = r7
        L_0x00a6:
            r11.append(r2)
            r11.append(r1)
            long r1 = r8.mo84452a()
            r11.append(r1)
            java.lang.String r1 = ", force to use current player position"
            r11.append(r1)
            java.lang.String r1 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r1)
            i03.b r1 = r0.f322159c
            int r2 = r1.f171748d
            int r2 = r2 + r5
            r1.f171748d = r2
            long r1 = r8.mo84452a()
        L_0x00ca:
            java.util.ArrayList<d03.a> r8 = r0.f322180x
            int r8 = r8.size()
            if (r8 <= 0) goto L_0x015a
            d03.a r8 = r0.f322181y
            if (r8 == 0) goto L_0x00ea
            long r10 = r8.f165944p
            long r10 = r1 - r10
            long r10 = r10 + r3
            int r8 = r8.f165950v
            r0.f322166j = r8
            d03.a r8 = r0.f322181y
            if (r8 == 0) goto L_0x00e6
            int r8 = r8.f165951w
            goto L_0x00e7
        L_0x00e6:
            r8 = 0
        L_0x00e7:
            r0.f322167k = r8
            goto L_0x00eb
        L_0x00ea:
            r10 = r3
        L_0x00eb:
            int r8 = r0.f322182z
            r12 = 0
        L_0x00ee:
            if (r12 >= r8) goto L_0x00fe
            java.util.ArrayList<d03.a> r13 = r0.f322180x
            java.lang.Object r13 = r13.get(r12)
            d03.a r13 = (d03.C58010a) r13
            long r13 = r13.f165943o
            long r10 = r10 + r13
            int r12 = r12 + 1
            goto L_0x00ee
        L_0x00fe:
            long r12 = r0.f322150A
            int r8 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r8 <= 0) goto L_0x0159
            g03.a$a r8 = r0.f322158b
            if (r8 == 0) goto L_0x010d
            long r12 = r8.mo84452a()
            goto L_0x010f
        L_0x010d:
            r12 = -1
        L_0x010f:
            java.lang.String r8 = r0.f322157a
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "accumulateTimestamp exceed totalDuration, accumulateTimestamp:"
            r14.append(r15)
            r14.append(r10)
            java.lang.String r15 = ", totalDurationMs:"
            r14.append(r15)
            long r3 = r0.f322150A
            r14.append(r3)
            java.lang.String r3 = ", timestampMs:"
            r14.append(r3)
            r14.append(r1)
            java.lang.String r1 = ", index:"
            r14.append(r1)
            int r1 = r0.f322182z
            r14.append(r1)
            java.lang.String r1 = ", mediaInfo:"
            r14.append(r1)
            java.util.ArrayList<d03.a> r1 = r0.f322180x
            int r2 = r0.f322182z
            java.lang.Object r1 = r1.get(r2)
            r14.append(r1)
            java.lang.String r1 = ", playPositionMs:"
            r14.append(r1)
            r14.append(r12)
            java.lang.String r1 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r1)
        L_0x0159:
            r1 = r10
        L_0x015a:
            d03.a r3 = r0.f322181y
            if (r3 == 0) goto L_0x0164
            int r3 = r3.f165939k
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
        L_0x0164:
            r3 = 2
            if (r7 != 0) goto L_0x0168
            goto L_0x016f
        L_0x0168:
            int r4 = r7.intValue()
            if (r4 != 0) goto L_0x016f
            goto L_0x0196
        L_0x016f:
            r4 = 90
            if (r7 != 0) goto L_0x0174
            goto L_0x017c
        L_0x0174:
            int r8 = r7.intValue()
            if (r8 != r4) goto L_0x017c
            r4 = 1
            goto L_0x0197
        L_0x017c:
            r4 = 180(0xb4, float:2.52E-43)
            if (r7 != 0) goto L_0x0181
            goto L_0x0189
        L_0x0181:
            int r8 = r7.intValue()
            if (r8 != r4) goto L_0x0189
            r4 = 2
            goto L_0x0197
        L_0x0189:
            r4 = 270(0x10e, float:3.78E-43)
            if (r7 != 0) goto L_0x018e
            goto L_0x0196
        L_0x018e:
            int r7 = r7.intValue()
            if (r7 != r4) goto L_0x0196
            r4 = 3
            goto L_0x0197
        L_0x0196:
            r4 = 0
        L_0x0197:
            if (r4 == 0) goto L_0x019e
            if (r4 == r3) goto L_0x019e
            int r7 = r0.f322167k
            goto L_0x01a0
        L_0x019e:
            int r7 = r0.f322166j
        L_0x01a0:
            r18 = r7
            if (r4 == 0) goto L_0x01a9
            if (r4 == r3) goto L_0x01a9
            int r7 = r0.f322166j
            goto L_0x01ab
        L_0x01a9:
            int r7 = r0.f322167k
        L_0x01ab:
            r19 = r7
            p80.c r7 = r0.f322170n
            if (r7 == 0) goto L_0x01b6
            int r7 = r7.f329652e
            r17 = r7
            goto L_0x01b8
        L_0x01b6:
            r17 = 0
        L_0x01b8:
            boolean r7 = r0.f322151B
            r8 = 1065353216(0x3f800000, float:1.0)
            if (r7 == 0) goto L_0x01de
            qr3.c r3 = new qr3.c
            r20 = 1
            r16 = r3
            r21 = r4
            r16.<init>(r17, r18, r19, r20, r21)
            r3.f330357f = r9
            android.graphics.Rect r4 = r3.f330358g
            r4.setEmpty()
            android.graphics.Rect r4 = r3.f330359h
            int r7 = r0.f322166j
            int r10 = r0.f322167k
            r4.set(r9, r9, r7, r10)
            r6.add(r3)
            goto L_0x02ae
        L_0x01de:
            int r7 = r0.f322178v
            if (r7 != r5) goto L_0x01e8
            int r7 = r0.f322166j
            int r10 = r0.f322167k
            if (r7 > r10) goto L_0x01ec
        L_0x01e8:
            int r7 = r0.f322178v
            if (r7 != r3) goto L_0x0284
        L_0x01ec:
            qr3.c r3 = new qr3.c
            r20 = 1
            r16 = r3
            r21 = r4
            r16.<init>(r17, r18, r19, r20, r21)
            android.graphics.Rect r4 = r3.f330358g
            r4.setEmpty()
            android.graphics.Rect r4 = r3.f330359h
            int r7 = r0.f322166j
            int r10 = r0.f322167k
            r4.set(r9, r9, r7, r10)
            android.graphics.Rect r4 = r3.f330359h
            android.graphics.Rect r7 = new android.graphics.Rect
            int r10 = r0.f322176t
            int r11 = r0.f322177u
            r7.<init>(r9, r9, r10, r11)
            java.lang.String r10 = "<this>"
            gy3.C87412m.m108594g(r4, r10)
            int r10 = r4.width()
            int r11 = r4.height()
            int r12 = r4.width()
            int r13 = r4.height()
            r16 = 4611686018427387904(0x4000000000000000, double:2.0)
            if (r12 <= r13) goto L_0x0255
            int r12 = r7.width()
            float r12 = (float) r12
            float r12 = r12 * r8
            float r10 = (float) r10
            float r12 = r12 / r10
            r4.left = r9
            int r10 = r7.width()
            r4.right = r10
            int r7 = r7.height()
            float r7 = (float) r7
            float r10 = (float) r11
            float r10 = r10 * r12
            float r7 = r7 - r10
            double r11 = (double) r7
            double r11 = r11 / r16
            int r7 = iy3.C60641c.m70920a(r11)
            r4.top = r7
            float r7 = (float) r7
            float r7 = r7 + r10
            int r7 = iy3.C60641c.m70921b(r7)
            r4.bottom = r7
            goto L_0x0280
        L_0x0255:
            int r12 = r7.height()
            float r12 = (float) r12
            float r12 = r12 * r8
            float r11 = (float) r11
            float r12 = r12 / r11
            r4.top = r9
            int r11 = r7.height()
            r4.bottom = r11
            int r7 = r7.width()
            float r7 = (float) r7
            float r10 = (float) r10
            float r10 = r10 * r12
            float r7 = r7 - r10
            double r11 = (double) r7
            double r11 = r11 / r16
            int r7 = iy3.C60641c.m70920a(r11)
            r4.left = r7
            float r7 = (float) r7
            float r7 = r7 + r10
            int r7 = iy3.C60641c.m70921b(r7)
            r4.right = r7
        L_0x0280:
            r6.add(r3)
            goto L_0x02ae
        L_0x0284:
            qr3.c r3 = new qr3.c
            r20 = 1
            r16 = r3
            r21 = r4
            r16.<init>(r17, r18, r19, r20, r21)
            android.graphics.Rect r4 = r3.f330358g
            r4.setEmpty()
            android.graphics.Rect r4 = r3.f330359h
            int r7 = r0.f322166j
            int r10 = r0.f322167k
            r4.set(r9, r9, r7, r10)
            android.graphics.Rect r4 = r3.f330359h
            android.graphics.Rect r7 = new android.graphics.Rect
            int r10 = r0.f322176t
            int r11 = r0.f322177u
            r7.<init>(r9, r9, r10, r11)
            sp3.C101692i.m133583a(r4, r7)
            r6.add(r3)
        L_0x02ae:
            p80.c r3 = r0.f322173q
            if (r3 == 0) goto L_0x02b5
            int r3 = r3.f329652e
            goto L_0x02b6
        L_0x02b5:
            r3 = 0
        L_0x02b6:
            if (r3 > 0) goto L_0x02ba
            goto L_0x0418
        L_0x02ba:
            boolean r4 = r0.f322174r
            r7 = 3553(0xde1, float:4.979E-42)
            if (r4 == 0) goto L_0x02c4
            boolean r4 = r0.f322175s
            if (r4 == 0) goto L_0x0308
        L_0x02c4:
            long r10 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            android.opengl.GLES20.glBindTexture(r7, r3)
            int r4 = r0.f322176t
            int r12 = r0.f322177u
            r16 = 3553(0xde1, float:4.979E-42)
            r17 = 0
            r18 = 6408(0x1908, float:8.98E-42)
            r21 = 0
            r22 = 6408(0x1908, float:8.98E-42)
            r23 = 5121(0x1401, float:7.176E-42)
            r24 = 0
            r19 = r4
            r20 = r12
            android.opengl.GLES20.glTexImage2D(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            android.opengl.GLES20.glBindTexture(r7, r9)
            java.lang.String r4 = r0.f322157a
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "allocOutputTexMem finished, cost:"
            r12.append(r13)
            long r10 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r10)
            r12.append(r10)
            java.lang.String r10 = "ms"
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r10)
            r0.f322174r = r5
        L_0x0308:
            rr3.k r4 = r0.f322179w
            if (r4 == 0) goto L_0x034d
            int r10 = r0.f322166j
            float r10 = (float) r10
            float r10 = r10 * r8
            int r11 = r0.f322167k
            float r11 = (float) r11
            float r10 = r10 / r11
            int r11 = r0.f322176t
            float r11 = (float) r11
            float r11 = r11 * r8
            int r8 = r0.f322177u
            float r8 = (float) r8
            float r11 = r11 / r8
            r12 = 0
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 <= 0) goto L_0x033f
            float r10 = r0.f322152C
            int r11 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r11 <= 0) goto L_0x033f
            r11 = 1056964608(0x3f000000, float:0.5)
            float r11 = r11 * r8
            float r8 = r8 * r10
            float r11 = r11 - r8
            long r12 = r4.f330969c
            r14 = 0
            int r4 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r4 != 0) goto L_0x0339
            goto L_0x034d
        L_0x0339:
            com.tencent.mm.xeffect.effect.VLogEffectJNI r4 = com.tencent.p014mm.xeffect.effect.VLogEffectJNI.INSTANCE
            r4.nSetGradientBlurEffectContentOffset(r12, r11)
            goto L_0x034d
        L_0x033f:
            long r10 = r4.f330969c
            r13 = 0
            int r4 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r4 != 0) goto L_0x0348
            goto L_0x034d
        L_0x0348:
            com.tencent.mm.xeffect.effect.VLogEffectJNI r4 = com.tencent.p014mm.xeffect.effect.VLogEffectJNI.INSTANCE
            r4.nSetGradientBlurEffectContentOffset(r10, r12)
        L_0x034d:
            i03.b r4 = r0.f322159c
            r4.getClass()
            long r10 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            r4.f171749e = r10
            com.tencent.mm.xeffect.VLogDirector r4 = r0.f322168l
            com.tencent.mm.xeffect.effect.EffectManager r8 = r0.f322169m
            r4.mo154917e(r8)
            com.tencent.mm.xeffect.VLogDirector r4 = r0.f322168l
            int r8 = r0.f322176t
            int r10 = r0.f322177u
            r4.mo154919g(r9, r9, r8, r10)
            com.tencent.mm.xeffect.VLogDirector r4 = r0.f322168l
            int r8 = r0.f322176t
            int r10 = r0.f322177u
            r4.f319982c = r8
            r4.f319983d = r10
            r4.mo154919g(r9, r9, r8, r10)
            com.tencent.mm.xeffect.VLogDirector r4 = r0.f322168l
            r4.mo154916d(r6, r3, r1)
            android.opengl.GLES20.glBindTexture(r7, r9)
            r4 = 36160(0x8d40, float:5.0671E-41)
            android.opengl.GLES20.glBindFramebuffer(r4, r9)
            boolean r4 = r0.f322155F
            if (r4 == 0) goto L_0x03c4
            long r6 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            java.lang.String r4 = r0.f322157a
            java.lang.String r8 = "this frame request take snapshot"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r8)
            w80.d$a r4 = w80.C111742d.f334647a
            int r8 = r0.f322176t
            int r10 = r0.f322177u
            android.graphics.Bitmap r4 = r4.mo163472r(r3, r8, r10)
            r0.f322155F = r9
            java.lang.String r8 = r0.f322157a
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "take snapshot finished cost:"
            r10.append(r11)
            long r6 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r6)
            r10.append(r6)
            java.lang.String r6 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r6)
            zt3.t r6 = zt3.C119157j.f356862d
            g03.u r7 = new g03.u
            r7.<init>(r0, r4)
            zt3.j r6 = (zt3.C119157j) r6
            r6.mo183895z(r7)
        L_0x03c4:
            int r4 = r0.f322164h
            int r6 = r0.f322165i
            android.opengl.GLES20.glViewport(r9, r9, r4, r6)
            u80.e r4 = r0.f322172p
            if (r4 == 0) goto L_0x03d1
            r4.f332822G = r3
        L_0x03d1:
            if (r4 == 0) goto L_0x03da
            int r3 = r0.f322176t
            int r6 = r0.f322177u
            r4.mo143263u(r3, r6)
        L_0x03da:
            u80.e r3 = r0.f322172p
            if (r3 == 0) goto L_0x03e5
            int r4 = r0.f322164h
            int r6 = r0.f322165i
            r3.mo158522s(r4, r6)
        L_0x03e5:
            u80.e r3 = r0.f322172p
            if (r3 == 0) goto L_0x03ec
            r3.mo162879m()
        L_0x03ec:
            w80.d$b r3 = r0.f322163g
            if (r3 == 0) goto L_0x03f9
            w80.d$a r4 = w80.C111742d.f334647a
            android.opengl.EGLDisplay r6 = r3.f189591a
            android.opengl.EGLSurface r3 = r3.f189592b
            r4.mo163474t(r6, r3)
        L_0x03f9:
            r0.f322175s = r9
            i03.b r3 = r0.f322159c
            long r6 = r3.f171746b
            long r8 = r3.f171749e
            long r8 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r8)
            long r6 = r6 + r8
            r3.f171746b = r6
            int r4 = r3.f171745a
            int r4 = r4 + r5
            r3.f171745a = r4
            fy3.l<? super java.lang.Long, rx3.b0> r0 = r0.f322153D
            if (r0 == 0) goto L_0x0418
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.invoke(r1)
        L_0x0418:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g03.C107681p.m145857a(g03.p, long):void");
    }

    /* renamed from: b */
    public void mo84440b(C32226l<? super Bitmap, C13598b0> lVar) {
        C87412m.m108594g(lVar, "callback");
        this.f322156G = lVar;
        this.f322155F = true;
        Log.m105924i(this.f322157a, "request snapshot");
    }

    /* renamed from: c */
    public void mo84441c(C60695a aVar) {
        C87412m.m108594g(aVar, "player");
        aVar.mo85613h(new C59340b(this));
    }

    /* renamed from: d */
    public void mo84442d(SurfaceTexture surfaceTexture) {
        C13598b0 b0Var;
        C87412m.m108594g(surfaceTexture, "surface");
        String str = this.f322157a;
        Log.m105924i(str, "attachSurface:" + surfaceTexture.hashCode());
        C111742d.C65942b bVar = this.f322163g;
        if (bVar != null) {
            mo158093k(new C107682a(this, surfaceTexture, bVar));
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            Log.m105924i(this.f322157a, "attach surface current not create GLEnvironment now");
            this.f322160d = surfaceTexture;
        }
    }

    /* renamed from: e */
    public void mo84443e(float f) {
        C110631h hVar;
        C110631h hVar2;
        if (this.f322169m == null) {
            this.f322169m = new EffectManager();
        }
        EffectManager effectManager = this.f322169m;
        if (effectManager != null) {
            effectManager.mo154926f();
        }
        EffectManager effectManager2 = this.f322169m;
        Long l = null;
        C110625c0 g = effectManager2 != null ? effectManager2.mo154927g(C110632i.GradientBlurEffect) : null;
        C87412m.m108592e(g, "null cannot be cast to non-null type com.tencent.mm.xeffect.effect.GradientBlurEffect");
        C110634k kVar = (C110634k) g;
        this.f322179w = kVar;
        kVar.mo162191d(20.0f);
        C110634k kVar2 = this.f322179w;
        if (kVar2 != null) {
            kVar2.mo162189b(0, this.f322150A);
        }
        C110634k kVar3 = this.f322179w;
        if (kVar3 != null) {
            long j = kVar3.f330969c;
            if (j != 0) {
                VLogEffectJNI.INSTANCE.nSetGradientBlurEffectCenterCropBlur(j, false);
            }
        }
        EffectManager effectManager3 = this.f322169m;
        if (effectManager3 != null) {
            effectManager3.mo154923c(this.f322179w);
        }
        this.f322152C = f;
        this.f322151B = true;
        String str = this.f322157a;
        StringBuilder sb = new StringBuilder();
        sb.append("setGradientBlurEffect, timeRange:[");
        C110634k kVar4 = this.f322179w;
        sb.append((kVar4 == null || (hVar2 = kVar4.f330968b) == null) ? null : Long.valueOf(hVar2.f330979a));
        sb.append(", ");
        C110634k kVar5 = this.f322179w;
        if (!(kVar5 == null || (hVar = kVar5.f330968b) == null)) {
            l = Long.valueOf(hVar.f330980b);
        }
        sb.append(l);
        sb.append(", contentOffsetPercent:");
        sb.append(f);
        sb.append(']');
        Log.m105924i(str, sb.toString());
    }

    /* renamed from: f */
    public void mo84444f(C32224a<C13598b0> aVar) {
        Log.m105924i(this.f322157a, "init without surfaceTexture");
        if (this.f322163g == null) {
            Log.m105924i(this.f322157a, "createEGLThread");
            int i = C58834h.f168432b;
            HandlerThread a = C97749e.m126093a("TPPlayerEffector", -4);
            a.start();
            this.f322161e = new MMHandler(a.getLooper());
            this.f322162f = a;
            mo158093k(new C107687q((SurfaceTexture) null, this));
            mo158093k(new C107684d(this, aVar));
        }
    }

    /* renamed from: g */
    public void mo84445g(C32226l<? super SurfaceTexture, C13598b0> lVar) {
        mo158093k(new C107683c(this, lVar));
    }

    public C60239b getReportInfo() {
        return this.f322159c;
    }

    /* renamed from: h */
    public void mo84447h(int i, int i2) {
        if (!(i == this.f322164h && i2 == this.f322165i)) {
            this.f322175s = true;
        }
        this.f322164h = i;
        this.f322165i = i2;
        String str = this.f322157a;
        Log.m105924i(str, "updateSize:[" + i + ',' + i2 + "], outputSizeChanged:" + this.f322175s + ", surface:" + this.f322160d);
        if (this.f322175s) {
            if (this.f322164h > this.f322165i && this.f322164h > 1080) {
                this.f322176t = 1080;
                this.f322177u = (int) (((float) 1080) * ((((float) this.f322165i) * 1.0f) / ((float) this.f322164h)));
            } else if (this.f322165i <= this.f322164h || this.f322165i <= 1920) {
                this.f322176t = this.f322164h;
                this.f322177u = this.f322165i;
            } else {
                this.f322177u = 1920;
                this.f322176t = (int) (((float) 1920) * ((((float) this.f322164h) * 1.0f) / ((float) this.f322165i)));
            }
            String str2 = this.f322157a;
            Log.m105924i(str2, "calcOutputTexSize:[" + this.f322176t + ',' + this.f322177u + ']');
        }
    }

    /* renamed from: i */
    public void mo84448i() {
        this.f322156G = null;
        this.f322155F = false;
        Log.m105924i(this.f322157a, "reset snapshot");
    }

    /* renamed from: j */
    public void mo84449j(C32226l<? super Long, C13598b0> lVar) {
        C87412m.m108594g(lVar, "callback");
        this.f322153D = lVar;
    }

    /* renamed from: k */
    public void mo158093k(C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "r");
        MMHandler mMHandler = this.f322161e;
        if (mMHandler != null) {
            mMHandler.post(new C107686f(aVar));
        }
    }

    public void release() {
        MMHandler mMHandler = this.f322161e;
        if (mMHandler != null) {
            mMHandler.removeCallbacksAndMessages((Object) null);
        }
        mo158093k(new C107685e(this));
    }

    public void setMediaInfo(C58010a aVar) {
        C87412m.m108594g(aVar, "mediaInfo");
        this.f322166j = aVar.f165950v;
        this.f322167k = aVar.f165951w;
        this.f322181y = aVar;
        this.f322150A = aVar.f165935g;
        String str = this.f322157a;
        Log.m105924i(str, "setMediaInfo, size:[" + this.f322166j + ',' + this.f322167k + "], totalDurationMs:" + this.f322150A);
    }
}
