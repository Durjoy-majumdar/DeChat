package r80;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.EGLContext;
import android.opengl.EGLExt;
import android.os.HandlerThread;
import android.view.Surface;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import eu3.C58834h;
import eu3.C97749e;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import oa1.C117731d;
import rx3.C13598b0;
import s80.C110777a;
import s80.C110779b;
import u80.C111139a;
import w80.C111742d;

/* renamed from: r80.a */
public class C110505a {

    /* renamed from: a */
    public C110777a f330437a;

    /* renamed from: b */
    public final String f330438b = "MicroMsg.CodecInputSurface";

    /* renamed from: c */
    public final HandlerThread f330439c;

    /* renamed from: d */
    public MMHandler f330440d;

    /* renamed from: e */
    public C111742d.C65942b f330441e;

    /* renamed from: f */
    public C32226l<? super Boolean, C13598b0> f330442f;

    /* renamed from: g */
    public Surface f330443g;

    /* renamed from: h */
    public SurfaceTexture f330444h;

    /* renamed from: i */
    public volatile boolean f330445i;

    /* renamed from: j */
    public volatile boolean f330446j;

    /* renamed from: k */
    public final Object f330447k;

    /* renamed from: l */
    public C32226l<? super Long, Bitmap> f330448l;

    /* renamed from: m */
    public Bitmap f330449m;

    /* renamed from: n */
    public C32226l<? super Long, Bitmap> f330450n;

    /* renamed from: o */
    public volatile boolean f330451o;

    /* renamed from: p */
    public final Object f330452p;

    /* renamed from: q */
    public C32224a<C13598b0> f330453q;

    /* renamed from: r */
    public int f330454r;

    /* renamed from: s */
    public int f330455s;

    /* renamed from: t */
    public long f330456t;

    /* renamed from: u */
    public volatile long f330457u;

    /* renamed from: v */
    public volatile boolean f330458v;

    /* renamed from: w */
    public long f330459w;

    /* renamed from: x */
    public long f330460x;

    /* renamed from: r80.a$a */
    public static final class C110506a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C110505a f330461d;

        /* renamed from: e */
        public final /* synthetic */ Surface f330462e;

        /* renamed from: f */
        public final /* synthetic */ int f330463f;

        /* renamed from: g */
        public final /* synthetic */ int f330464g;

        /* renamed from: h */
        public final /* synthetic */ C32226l<Boolean, C13598b0> f330465h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110506a(C110505a aVar, Surface surface, int i, int i2, C32226l<? super Boolean, C13598b0> lVar) {
            super(0);
            this.f330461d = aVar;
            this.f330462e = surface;
            this.f330463f = i;
            this.f330464g = i2;
            this.f330465h = lVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x004b, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x004c, code lost:
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r9.f330461d.f330438b, r0, "initWithSurface failed", new java.lang.Object[0]);
            r0 = r9.f330465h;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x005a, code lost:
            if (r0 != null) goto L_0x005c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x005c, code lost:
            r0.invoke(java.lang.Boolean.FALSE);
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r9 = this;
                r80.a r0 = r9.f330461d     // Catch:{ Exception -> 0x004b }
                r0.getClass()     // Catch:{ Exception -> 0x004b }
                r80.a r0 = r9.f330461d     // Catch:{ Exception -> 0x004b }
                w80.d$a r1 = w80.C111742d.f334647a     // Catch:{ Exception -> 0x004b }
                android.view.Surface r2 = r9.f330462e     // Catch:{ Exception -> 0x004b }
                r3 = 0
                int r4 = r9.f330463f     // Catch:{ Exception -> 0x004b }
                int r5 = r9.f330464g     // Catch:{ Exception -> 0x004b }
                r6 = 0
                r7 = 18
                r8 = 0
                w80.d$b r1 = w80.C111742d.C111743a.m152352k(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x004b }
                r0.f330441e = r1     // Catch:{ Exception -> 0x004b }
                r80.a r0 = r9.f330461d     // Catch:{ Exception -> 0x004b }
                s80.a r0 = r0.f330437a     // Catch:{ Exception -> 0x004b }
                r1 = 1
                r0.mo157955k(r1)     // Catch:{ Exception -> 0x004b }
                r80.a r0 = r9.f330461d     // Catch:{ Exception -> 0x004b }
                s80.a r2 = r0.f330437a     // Catch:{ Exception -> 0x004b }
                monitor-enter(r2)     // Catch:{ Exception -> 0x004b }
                android.graphics.SurfaceTexture r3 = r2.f331384i     // Catch:{ all -> 0x0048 }
                monitor-exit(r2)     // Catch:{ Exception -> 0x004b }
                r0.f330444h = r3     // Catch:{ Exception -> 0x004b }
                r80.a r0 = r9.f330461d     // Catch:{ Exception -> 0x004b }
                android.graphics.SurfaceTexture r2 = r0.f330444h     // Catch:{ Exception -> 0x004b }
                if (r2 == 0) goto L_0x003a
                r80.f r3 = new r80.f     // Catch:{ Exception -> 0x004b }
                r3.<init>(r0)     // Catch:{ Exception -> 0x004b }
                r2.setOnFrameAvailableListener(r3)     // Catch:{ Exception -> 0x004b }
            L_0x003a:
                r80.a r0 = r9.f330461d     // Catch:{ Exception -> 0x004b }
                r0.f330458v = r1     // Catch:{ Exception -> 0x004b }
                fy3.l<java.lang.Boolean, rx3.b0> r0 = r9.f330465h     // Catch:{ Exception -> 0x004b }
                if (r0 == 0) goto L_0x0061
                java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x004b }
                r0.invoke(r1)     // Catch:{ Exception -> 0x004b }
                goto L_0x0061
            L_0x0048:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ Exception -> 0x004b }
                throw r0     // Catch:{ Exception -> 0x004b }
            L_0x004b:
                r0 = move-exception
                r80.a r1 = r9.f330461d
                java.lang.String r1 = r1.f330438b
                r2 = 0
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.String r3 = "initWithSurface failed"
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r0, r3, r2)
                fy3.l<java.lang.Boolean, rx3.b0> r0 = r9.f330465h
                if (r0 == 0) goto L_0x0061
                java.lang.Boolean r1 = java.lang.Boolean.FALSE
                r0.invoke(r1)
            L_0x0061:
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: r80.C110505a.C110506a.invoke():java.lang.Object");
        }
    }

    /* renamed from: r80.a$b */
    public static final class C110507b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ EGLContext f330466d;

        /* renamed from: e */
        public final /* synthetic */ C110505a f330467e;

        /* renamed from: f */
        public final /* synthetic */ Surface f330468f;

        /* renamed from: g */
        public final /* synthetic */ C32226l<Boolean, C13598b0> f330469g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110507b(EGLContext eGLContext, C110505a aVar, Surface surface, C32226l<? super Boolean, C13598b0> lVar) {
            super(0);
            this.f330466d = eGLContext;
            this.f330467e = aVar;
            this.f330468f = surface;
            this.f330469g = lVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x005b, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x005c, code lost:
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r11.f330467e.f330438b, r1, "initWithSurface failed", new java.lang.Object[0]);
            r0 = r11.f330469g;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0069, code lost:
            if (r0 != null) goto L_0x006b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x006b, code lost:
            r0.invoke(java.lang.Boolean.FALSE);
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r11 = this;
                r0 = 0
                android.opengl.EGLContext r1 = r11.f330466d     // Catch:{ Exception -> 0x005b }
                r2 = 1
                if (r1 != 0) goto L_0x0033
                r80.a r1 = r11.f330467e     // Catch:{ Exception -> 0x005b }
                r1.getClass()     // Catch:{ Exception -> 0x005b }
                r80.a r1 = r11.f330467e     // Catch:{ Exception -> 0x005b }
                w80.d$a r3 = w80.C111742d.f334647a     // Catch:{ Exception -> 0x005b }
                android.view.Surface r4 = r11.f330468f     // Catch:{ Exception -> 0x005b }
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 30
                r10 = 0
                w80.d$b r3 = w80.C111742d.C111743a.m152352k(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x005b }
                r1.f330441e = r3     // Catch:{ Exception -> 0x005b }
                r80.a r1 = r11.f330467e     // Catch:{ Exception -> 0x005b }
                s80.a r1 = r1.f330437a     // Catch:{ Exception -> 0x005b }
                r1.mo157955k(r2)     // Catch:{ Exception -> 0x005b }
                r80.a r1 = r11.f330467e     // Catch:{ Exception -> 0x005b }
                s80.a r3 = r1.f330437a     // Catch:{ Exception -> 0x005b }
                monitor-enter(r3)     // Catch:{ Exception -> 0x005b }
                android.graphics.SurfaceTexture r4 = r3.f331384i     // Catch:{ all -> 0x0030 }
                monitor-exit(r3)     // Catch:{ Exception -> 0x005b }
                r1.f330444h = r4     // Catch:{ Exception -> 0x005b }
                goto L_0x004d
            L_0x0030:
                r1 = move-exception
                monitor-exit(r3)     // Catch:{ Exception -> 0x005b }
                throw r1     // Catch:{ Exception -> 0x005b }
            L_0x0033:
                r80.a r1 = r11.f330467e     // Catch:{ Exception -> 0x005b }
                r1.getClass()     // Catch:{ Exception -> 0x005b }
                r80.a r1 = r11.f330467e     // Catch:{ Exception -> 0x005b }
                w80.d$a r3 = w80.C111742d.f334647a     // Catch:{ Exception -> 0x005b }
                android.opengl.EGLContext r4 = r11.f330466d     // Catch:{ Exception -> 0x005b }
                android.view.Surface r5 = r11.f330468f     // Catch:{ Exception -> 0x005b }
                w80.d$b r3 = r3.mo163458a(r4, r5, r0, r0)     // Catch:{ Exception -> 0x005b }
                r1.f330441e = r3     // Catch:{ Exception -> 0x005b }
                r80.a r1 = r11.f330467e     // Catch:{ Exception -> 0x005b }
                s80.a r1 = r1.f330437a     // Catch:{ Exception -> 0x005b }
                r1.mo157955k(r0)     // Catch:{ Exception -> 0x005b }
            L_0x004d:
                r80.a r1 = r11.f330467e     // Catch:{ Exception -> 0x005b }
                r1.f330458v = r2     // Catch:{ Exception -> 0x005b }
                fy3.l<java.lang.Boolean, rx3.b0> r1 = r11.f330469g     // Catch:{ Exception -> 0x005b }
                if (r1 == 0) goto L_0x0070
                java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x005b }
                r1.invoke(r2)     // Catch:{ Exception -> 0x005b }
                goto L_0x0070
            L_0x005b:
                r1 = move-exception
                r80.a r2 = r11.f330467e
                java.lang.String r2 = r2.f330438b
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r3 = "initWithSurface failed"
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r1, r3, r0)
                fy3.l<java.lang.Boolean, rx3.b0> r0 = r11.f330469g
                if (r0 == 0) goto L_0x0070
                java.lang.Boolean r1 = java.lang.Boolean.FALSE
                r0.invoke(r1)
            L_0x0070:
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: r80.C110505a.C110507b.invoke():java.lang.Object");
        }
    }

    /* renamed from: r80.a$c */
    public static final class C110508c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C110505a f330470d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110508c(C110505a aVar) {
            super(0);
            this.f330470d = aVar;
        }

        public Object invoke() {
            String str = this.f330470d.f330438b;
            Log.m105924i(str, this.f330470d.hashCode() + " do release resources");
            C110777a.m150773o(this.f330470d.f330437a, false, 1, (Object) null);
            Surface surface = this.f330470d.f330443g;
            if (surface != null) {
                surface.release();
            }
            C111742d.C65942b bVar = this.f330470d.f330441e;
            if (bVar != null) {
                C111742d.f334647a.mo163471q(bVar);
            }
            this.f330470d.f330440d.removeCallbacksAndMessages((Object) null);
            this.f330470d.f330439c.quitSafely();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: r80.a$d */
    public static final class C110509d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C110505a f330471d;

        /* renamed from: e */
        public final /* synthetic */ byte[] f330472e;

        /* renamed from: f */
        public final /* synthetic */ long f330473f;

        /* renamed from: g */
        public final /* synthetic */ C32226l<byte[], C13598b0> f330474g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110509d(C110505a aVar, byte[] bArr, long j, C32226l<? super byte[], C13598b0> lVar) {
            super(0);
            this.f330471d = aVar;
            this.f330472e = bArr;
            this.f330473f = j;
            this.f330474g = lVar;
        }

        public Object invoke() {
            if (!this.f330471d.f330458v) {
                Log.m105920e(this.f330471d.f330438b, "requestDraw not init now");
            } else {
                try {
                    C110777a.m150772l(this.f330471d.f330437a, this.f330472e, false, 2, (Object) null);
                    this.f330471d.f330437a.mo157957p();
                    C110505a aVar = this.f330471d;
                    if (aVar.f330443g != null) {
                        aVar.mo161981j(this.f330473f);
                        C111742d.C65942b bVar = this.f330471d.f330441e;
                        if (bVar != null) {
                            C111742d.f334647a.mo163474t(bVar.f189591a, bVar.f189592b);
                        }
                    }
                    C32226l<? super Boolean, C13598b0> lVar = this.f330471d.f330442f;
                    if (lVar != null) {
                        lVar.invoke(Boolean.TRUE);
                    }
                    this.f330474g.invoke(this.f330472e);
                } catch (Exception e) {
                    Log.m105924i("MicroMsg.MediaEditorIDKeyStat", "markMediaCodecWriteYUVError");
                    C115669n.INSTANCE.mo175913w(985, 27, 1);
                    Log.printErrStackTrace(this.f330471d.f330438b, e, "", new Object[0]);
                    C32226l<? super Boolean, C13598b0> lVar2 = this.f330471d.f330442f;
                    if (lVar2 != null) {
                        lVar2.invoke(Boolean.FALSE);
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: r80.a$e */
    public static final class C110510e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C32224a f330475d;

        public C110510e(C32224a aVar) {
            this.f330475d = aVar;
        }

        public final /* synthetic */ void run() {
            this.f330475d.invoke();
        }
    }

    public C110505a(C110777a aVar) {
        C87412m.m108594g(aVar, "renderer");
        this.f330437a = aVar;
        int i = C58834h.f168432b;
        HandlerThread a = C97749e.m126093a("CodecInputSurface_renderThread", 5);
        this.f330439c = a;
        this.f330447k = new Object();
        this.f330452p = new Object();
        this.f330454r = 33000000;
        a.start();
        this.f330440d = new MMHandler(a.getLooper());
    }

    /* renamed from: a */
    public static final void m150444a(C110505a aVar, long j, Bitmap bitmap, Bitmap bitmap2) {
        C111742d.C65942b bVar;
        aVar.getClass();
        try {
            if (!aVar.f330458v) {
                Log.m105920e(aVar.f330438b, "requestDraw not init now");
                return;
            }
            String str = aVar.f330438b;
            Log.m105924i(str, "render pts:" + j);
            long currentTicks = Util.currentTicks();
            C110777a aVar2 = aVar.f330437a;
            if (aVar2 instanceof C110779b) {
                C87412m.m108592e(aVar2, "null cannot be cast to non-null type com.tencent.mm.media.render.MixRenderer");
                ((C110779b) aVar2).mo162337v(bitmap, bitmap2);
            }
            String str2 = aVar.f330438b;
            StringBuilder sb = new StringBuilder();
            sb.append("render cost ");
            sb.append(Util.ticksToNow(currentTicks));
            sb.append(", surface timestamp:");
            SurfaceTexture surfaceTexture = aVar.f330444h;
            Long l = null;
            sb.append(surfaceTexture != null ? Long.valueOf(surfaceTexture.getTimestamp()) : null);
            sb.append(", lastFrameTimestamp:");
            sb.append(aVar.f330459w);
            Log.m105918d(str2, sb.toString());
            if (aVar.f330444h != null && aVar.f330445i) {
                long j2 = aVar.f330459w;
                SurfaceTexture surfaceTexture2 = aVar.f330444h;
                if (surfaceTexture2 != null) {
                    l = Long.valueOf(surfaceTexture2.getTimestamp());
                }
                C87412m.m108591d(l);
                if (j2 > l.longValue()) {
                    Log.m105920e(aVar.f330438b, "not stickily monotonic increase timestamp");
                    aVar.f330451o = false;
                    C32224a<C13598b0> aVar3 = aVar.f330453q;
                    if (aVar3 != null) {
                        aVar3.invoke();
                        return;
                    }
                    return;
                }
            }
            SurfaceTexture surfaceTexture3 = aVar.f330444h;
            aVar.f330457u = surfaceTexture3 != null ? surfaceTexture3.getTimestamp() : 0;
            long currentTicks2 = Util.currentTicks();
            SurfaceTexture surfaceTexture4 = aVar.f330444h;
            if (surfaceTexture4 != null) {
                Long valueOf = Long.valueOf(surfaceTexture4.getTimestamp());
                C87412m.m108591d(valueOf);
                long longValue = valueOf.longValue();
                SurfaceTexture surfaceTexture5 = aVar.f330444h;
                if (surfaceTexture5 != null && aVar.f330459w == surfaceTexture5.getTimestamp()) {
                    Log.m105924i(aVar.f330438b, "same frame timestamp!!");
                } else {
                    j = longValue;
                }
                aVar.f330459w = j;
                if (aVar.f330443g != null) {
                    long j3 = aVar.f330456t;
                    if (j3 > 0) {
                        j -= j3 * ((long) 1000000);
                    }
                    aVar.mo161981j(j);
                }
            } else if (aVar.f330443g != null) {
                long j4 = aVar.f330456t;
                if (j4 > 0) {
                    j -= j4 * ((long) 1000000);
                }
                aVar.mo161981j(j);
            }
            if (!(aVar.f330443g == null || (bVar = aVar.f330441e) == null)) {
                C111742d.f334647a.mo163474t(bVar.f189591a, bVar.f189592b);
            }
            String str3 = aVar.f330438b;
            Log.m105918d(str3, "swap buffer cost " + Util.ticksToNow(currentTicks2));
            C32226l<? super Boolean, C13598b0> lVar = aVar.f330442f;
            if (lVar != null) {
                lVar.invoke(Boolean.TRUE);
            }
        } catch (Exception e) {
            Log.printErrStackTrace(aVar.f330438b, e, "", new Object[0]);
            C32226l<? super Boolean, C13598b0> lVar2 = aVar.f330442f;
            if (lVar2 != null) {
                lVar2.invoke(Boolean.FALSE);
            }
        }
    }

    /* renamed from: b */
    public final void mo161973b(Surface surface, boolean z, int i, int i2, long j, C32226l<? super Boolean, C13598b0> lVar) {
        this.f330443g = surface;
        String str = this.f330438b;
        StringBuilder sb = new StringBuilder();
        sb.append(hashCode());
        sb.append(" initForRemuxer, surface:");
        sb.append(surface);
        sb.append(", callback:");
        sb.append(lVar == null);
        sb.append(", drawInOnFrameAvailable:");
        sb.append(this.f330451o);
        Log.m105924i(str, sb.toString());
        if (!z) {
            Log.m105924i(this.f330438b, "cannot use drawInFrameAvailable!");
            mo161980i(false);
        } else {
            Log.m105924i(this.f330438b, "default use drawInFrameAvailable");
            mo161980i(true);
        }
        this.f330455s = 0;
        this.f330456t = j;
        mo161975d(new C110506a(this, surface, i, i2, lVar));
    }

    /* renamed from: c */
    public final void mo161974c(Surface surface, EGLContext eGLContext, boolean z, C32226l<? super Boolean, C13598b0> lVar) {
        C87412m.m108594g(surface, "surface");
        this.f330443g = surface;
        String str = this.f330438b;
        StringBuilder sb = new StringBuilder();
        sb.append(hashCode());
        sb.append(" initWithSurface, eglContext:");
        sb.append(eGLContext);
        sb.append(", surface:");
        sb.append(surface);
        sb.append(", waitNewFrame:");
        sb.append(z);
        sb.append(", callback:");
        sb.append(lVar == null);
        Log.m105924i(str, sb.toString());
        mo161975d(new C110507b(eGLContext, this, surface, lVar));
    }

    /* renamed from: d */
    public final void mo161975d(C32224a<C13598b0> aVar) {
        synchronized (this.f330447k) {
            if (!this.f330439c.isAlive() || this.f330446j) {
                String str = this.f330438b;
                Log.m105920e(str, hashCode() + " queue already release");
                C13598b0 b0Var = C13598b0.f38549a;
            } else {
                this.f330440d.post(aVar != null ? new C110510e(aVar) : null);
            }
        }
    }

    /* renamed from: e */
    public final void mo161976e() {
        String str = this.f330438b;
        Log.m105924i(str, hashCode() + " release resources");
        C110508c cVar = new C110508c(this);
        synchronized (this.f330447k) {
            if (!this.f330439c.isAlive() || this.f330446j) {
                String str2 = this.f330438b;
                Log.m105920e(str2, hashCode() + " queueFirst already release");
                C13598b0 b0Var = C13598b0.f38549a;
            } else {
                this.f330440d.removeCallbacksAndMessages((Object) null);
                this.f330440d.post(new C110510e(cVar));
            }
        }
        synchronized (this.f330447k) {
            this.f330446j = true;
            this.f330458v = false;
            C13598b0 b0Var2 = C13598b0.f38549a;
        }
    }

    /* renamed from: f */
    public final void mo161977f(byte[] bArr, long j, C32226l<? super byte[], C13598b0> lVar) {
        C87412m.m108594g(bArr, "data");
        C87412m.m108594g(lVar, "inputCallback");
        String str = this.f330438b;
        Log.m105918d(str, "ByteArray length : " + bArr.length);
        mo161975d(new C110509d(this, bArr, j, lVar));
    }

    /* renamed from: g */
    public final void mo161978g(C32226l<? super Long, Bitmap> lVar) {
        String str = this.f330438b;
        StringBuilder sb = new StringBuilder();
        sb.append("setDrawBlendBitmapProvider:");
        sb.append(lVar != null ? lVar.hashCode() : 0);
        Log.m105924i(str, sb.toString());
        this.f330448l = lVar;
    }

    /* renamed from: h */
    public final void mo161979h(C32226l<? super Long, Bitmap> lVar) {
        String str = this.f330438b;
        StringBuilder sb = new StringBuilder();
        sb.append("setDrawBlurBgBitmapProvider:");
        sb.append(lVar != null ? lVar.hashCode() : 0);
        Log.m105924i(str, sb.toString());
        this.f330450n = lVar;
    }

    /* renamed from: i */
    public final void mo161980i(boolean z) {
        synchronized (this.f330452p) {
            this.f330451o = z;
            String str = this.f330438b;
            Log.m105924i(str, "setDrawInOnFrameAvailable:" + z);
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }

    /* renamed from: j */
    public final void mo161981j(long j) {
        C111742d.C65942b bVar = this.f330441e;
        if (bVar != null) {
            EGLExt.eglPresentationTimeANDROID(bVar.f189591a, bVar.f189592b, j);
        }
        this.f330457u = j;
        C111742d.f334647a.mo163460c("eglPresentationTimeANDROID", "MicroMsg.GLEnvironmentUtil");
    }

    /* renamed from: k */
    public final void mo161982k(MediaFormat mediaFormat) {
        C87412m.m108594g(mediaFormat, "mediaFormat");
        C110777a aVar = this.f330437a;
        aVar.getClass();
        if (C117731d.m166007c().mo182445g("clicfg_handle_media_format_change", true, true)) {
            if (mediaFormat.containsKey("width") && mediaFormat.containsKey("height")) {
                aVar.f331376a = mediaFormat.getInteger("width");
                int integer = mediaFormat.getInteger("height");
                aVar.f331377b = integer;
                C111139a aVar2 = aVar.f331382g;
                if (aVar2 != null) {
                    aVar2.mo143263u(aVar.f331376a, integer);
                }
            }
            int i = aVar.f331377b;
            int i2 = aVar.f331376a;
            int i3 = 0;
            int integer2 = mediaFormat.containsKey("crop-left") ? mediaFormat.getInteger("crop-left") : 0;
            if (mediaFormat.containsKey("crop-top")) {
                i3 = mediaFormat.getInteger("crop-top");
            }
            if (mediaFormat.containsKey("crop-right")) {
                i2 = mediaFormat.getInteger("crop-right") + 1;
            }
            if (mediaFormat.containsKey("crop-bottom")) {
                i = mediaFormat.getInteger("crop-bottom") + 1;
            }
            Log.m105924i("MicroMsg.Media.AbsSurfaceRenderer", "updateTextureSizeByMediaFormat:textureWidth->" + aVar.f331376a + " textureHeight->" + aVar.f331377b + " validLeft->" + integer2 + " validTop->" + i + " validRight->" + i2 + "  validBottom -> " + i3);
            C111139a aVar3 = aVar.f331382g;
            if (aVar3 != null) {
                Point point = new Point(integer2, i + 1);
                Point point2 = new Point(i2 + 1, i3);
                aVar3.f332771z = point;
                aVar3.f332745A = point2;
            }
        }
    }
}
