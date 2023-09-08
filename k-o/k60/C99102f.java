package k60;

import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.animation.Animation;
import com.tencent.p014mm.loader.cache.memory.C92699b;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import l60.C99344b;
import m60.C99792d;
import n60.C100074e;
import n60.C100075f;
import o60.C100284b;
import o60.C100291e;
import o60.C100292f;
import p60.C62208h;
import r60.C101340b;
import r60.C101342d;
import r60.C101344e;
import s60.C101535a;
import t60.C101723d;
import t60.C101724f;
import t60.C101725g;
import t60.C64205a;
import t60.C64206c;
import t60.C64207e;
import u60.C65220d;
import u60.C65222f;
import x60.C102564a;

/* renamed from: k60.f */
public final class C99102f<T, R> {

    /* renamed from: a */
    public final C99344b<T, R> f290572a;

    /* renamed from: b */
    public final C100075f f290573b;

    /* renamed from: c */
    public final C64207e<T, R> f290574c;

    /* renamed from: d */
    public final C101723d f290575d;

    /* renamed from: e */
    public C101724f f290576e;

    /* renamed from: f */
    public C64206c<T> f290577f;

    /* renamed from: g */
    public C100284b<T> f290578g;

    /* renamed from: h */
    public C92699b<T, R> f290579h;

    /* renamed from: i */
    public C99792d<T, R> f290580i;

    /* renamed from: j */
    public C100292f f290581j;

    /* renamed from: k */
    public C100291e<R> f290582k;

    /* renamed from: l */
    public C101535a<R> f290583l;

    /* renamed from: m */
    public C101535a<R> f290584m;

    /* renamed from: n */
    public C64205a f290585n;

    /* renamed from: o */
    public C65222f<C65220d> f290586o;

    /* renamed from: p */
    public C101725g f290587p;

    /* renamed from: q */
    public int f290588q;

    /* renamed from: r */
    public Animation f290589r;

    /* renamed from: s */
    public Drawable f290590s;

    /* renamed from: t */
    public C102564a<T> f290591t;

    /* renamed from: u */
    public C101342d<R> f290592u;

    /* renamed from: v */
    public String f290593v;

    /* renamed from: k60.f$a */
    public static final class C99103a implements C101340b {

        /* renamed from: a */
        public final /* synthetic */ C99102f<T, R> f290594a;

        public C99103a(C99102f<T, R> fVar) {
            this.f290594a = fVar;
        }

        /* renamed from: a */
        public void mo138483a(boolean z) {
            if (z) {
                C101344e.f296885b.mo140836a().mo140835a(this.f290594a.mo138481a(), this.f290594a.f290591t, "may be hit cache");
            }
        }
    }

    public C99102f(C99344b<T, R> bVar, C100074e<T, R> eVar) {
        Drawable drawable;
        C87412m.m108594g(bVar, "builder");
        C87412m.m108594g(eVar, "mImageLoaderConfiguration");
        this.f290572a = bVar;
        C64207e hVar = new C62208h((C64207e) null);
        C100075f fVar = bVar.f291319c;
        fVar = fVar == null ? eVar.mo139384j() : fVar;
        this.f290573b = fVar;
        C64207e eVar2 = bVar.f291320d;
        this.f290574c = eVar2 != null ? eVar2 : hVar;
        this.f290575d = bVar.f291321e;
        this.f290576e = eVar.mo139389o();
        this.f290577f = bVar.f291322f;
        this.f290578g = eVar.mo139393t();
        this.f290579h = eVar.mo139388n();
        this.f290580i = eVar.mo139385k();
        eVar.mo139394u();
        if (bVar.f291323g == null) {
            eVar.mo139390p();
        }
        this.f290581j = eVar.mo139392s();
        this.f290582k = eVar.mo139395v();
        C101535a<R> aVar = bVar.f291325i;
        this.f290583l = aVar == null ? eVar.mo132665r() : aVar;
        this.f290584m = null;
        this.f290585n = bVar.f291324h;
        this.f290586o = eVar.mo139387m();
        eVar.mo139391q();
        this.f290587p = eVar.mo139386l();
        this.f290588q = fVar.f293170h;
        this.f290589r = fVar.f293173k;
        Resources resources = MMApplicationContext.getResources();
        C87412m.m108593f(resources, "getResources()");
        if (fVar.f293171i != 0) {
            drawable = new ColorDrawable(resources.getColor(fVar.f293171i));
        } else {
            int i = fVar.f293170h;
            drawable = i != 0 ? resources.getDrawable(i) : fVar.f293172j;
        }
        this.f290590s = drawable;
        this.f290591t = bVar.f291317a;
        this.f290593v = "";
    }

    /* renamed from: a */
    public final C101342d<R> mo138481a() {
        C101342d<R> dVar = this.f290592u;
        if (dVar != null) {
            return dVar;
        }
        C87412m.m108603p("target");
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0058, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3) != false) goto L_0x005d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x009c  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo138482b() {
        /*
            r9 = this;
            l60.b<T, R> r0 = r9.f290572a
            r60.d<R> r0 = r0.f291326j
            if (r0 != 0) goto L_0x000b
            r60.a r0 = new r60.a
            r0.<init>()
        L_0x000b:
            r9.f290592u = r0
            r60.e$b r0 = r60.C101344e.f296885b
            r60.e r1 = r0.mo140836a()
            r60.d r2 = r9.mo138481a()
            x60.a<T> r3 = r9.f290591t
            r1.getClass()
            java.lang.String r4 = "data"
            gy3.C87412m.m108594g(r3, r4)
            int r4 = r2.mo140831c()
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, rx3.l<x60.a<?>, r60.d<java.lang.Object>>> r1 = r1.f296888a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            rx3.l r5 = new rx3.l
            r5.<init>(r3, r2)
            r1.put(r4, r5)
            t60.d r1 = r9.f290575d
            r2 = 0
            if (r1 == 0) goto L_0x003b
            r1.mo11750a(r2)
        L_0x003b:
            x60.a<T> r1 = r9.f290591t
            T r3 = r1.f301995a
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x0045
            r6 = 1
            goto L_0x0046
        L_0x0045:
            r6 = 0
        L_0x0046:
            if (r6 == 0) goto L_0x005d
            boolean r6 = r3 instanceof java.lang.String
            if (r6 == 0) goto L_0x005b
            java.lang.String r6 = "null cannot be cast to non-null type kotlin.String"
            gy3.C87412m.m108592e(r3, r6)
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 == 0) goto L_0x005b
            goto L_0x005d
        L_0x005b:
            r3 = 0
            goto L_0x005e
        L_0x005d:
            r3 = 1
        L_0x005e:
            if (r3 == 0) goto L_0x0061
            goto L_0x0062
        L_0x0061:
            r1 = r2
        L_0x0062:
            if (r1 == 0) goto L_0x009c
            java.lang.String r1 = "MicroMsg.Loader.Reaper"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "uri value is isLegal "
            r3.append(r4)
            x60.a<T> r4 = r9.f290591t
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r3)
            r60.e r0 = r0.mo140836a()
            r60.d r1 = r9.mo138481a()
            x60.a<T> r3 = r9.f290591t
            java.lang.String r4 = "uri value is isLegal"
            r0.mo140835a(r1, r3, r4)
            t60.e<T, R> r0 = r9.f290574c
            x60.a<T> r1 = r9.f290591t
            r0.mo507a(r1, r2, r2)
            t60.d r0 = r9.f290575d
            if (r0 == 0) goto L_0x009b
            r0.mo11751b(r2)
        L_0x009b:
            return
        L_0x009c:
            gy3.f0 r0 = new gy3.f0
            r0.<init>()
            n60.f r1 = r9.f290573b
            boolean r1 = r1.f293163a
            if (r1 == 0) goto L_0x00b2
            com.tencent.mm.loader.cache.memory.b<T, R> r1 = r9.f290579h
            x60.a<T> r3 = r9.f290591t
            s60.a<R> r6 = r9.f290583l
            w60.g r1 = r1.mo126884a(r3, r6)
            goto L_0x00b3
        L_0x00b2:
            r1 = r2
        L_0x00b3:
            r0.f27484d = r1
            n60.f r3 = r9.f290573b
            boolean r3 = r3.f293165c
            if (r3 == 0) goto L_0x00c4
            com.tencent.mm.loader.cache.memory.b<T, R> r3 = r9.f290579h
            x60.a<T> r6 = r9.f290591t
            s60.a<R> r7 = r9.f290583l
            r3.mo126888e(r1, r6, r7)
        L_0x00c4:
            T r0 = r0.f27484d
            if (r0 != 0) goto L_0x00c9
            goto L_0x00d0
        L_0x00c9:
            r1 = r0
            w60.g r1 = (w60.C65941g) r1
            T r1 = r1.f189590a
            if (r1 != 0) goto L_0x00d2
        L_0x00d0:
            r1 = 1
            goto L_0x00d3
        L_0x00d2:
            r1 = 0
        L_0x00d3:
            w60.g r0 = (w60.C65941g) r0
            if (r0 == 0) goto L_0x0159
            T r3 = r0.f189590a
            if (r3 != 0) goto L_0x00dd
            r3 = 0
            goto L_0x00ea
        L_0x00dd:
            boolean r6 = r3 instanceof android.graphics.Bitmap
            if (r6 == 0) goto L_0x00e9
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
            boolean r3 = r3.isRecycled()
            r3 = r3 ^ r4
            goto L_0x00ea
        L_0x00e9:
            r3 = 1
        L_0x00ea:
            if (r3 == 0) goto L_0x00ed
            goto L_0x00ee
        L_0x00ed:
            r0 = r2
        L_0x00ee:
            if (r0 == 0) goto L_0x0159
            T r0 = r0.f189590a
            if (r0 == 0) goto L_0x0159
            java.lang.String r3 = "MicroMsg.Loader.Reaper"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "[ImageLoader] load from cache. no need from url: "
            r6.append(r7)
            x60.a<T> r7 = r9.f290591t
            r6.append(r7)
            java.lang.String r7 = " value "
            r6.append(r7)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r6)
            w60.g r3 = new w60.g
            r3.<init>(r0)
            s60.a<R> r6 = r9.f290583l
            if (r6 == 0) goto L_0x0128
            r60.d r7 = r9.mo138481a()
            r60.i<?> r7 = r7.f296881a
            s60.b$b r8 = s60.C101536b.C101538b.LOADED
            r6.mo141014d(r7, r9, r3, r8)
        L_0x0128:
            t60.d r3 = r9.f290575d
            if (r3 == 0) goto L_0x012f
            r3.mo11751b(r2)
        L_0x012f:
            r60.d r3 = r9.mo138481a()
            k60.f$a r6 = new k60.f$a
            r6.<init>(r9)
            r3.mo140833a(r0, r6)
            t60.c<T> r3 = r9.f290577f
            if (r3 == 0) goto L_0x0149
            x60.a<T> r6 = r9.f290591t
            w60.e r7 = new w60.e
            r7.<init>(r5, r5, r0)
            r3.mo84454b(r6, r2, r7)
        L_0x0149:
            t60.e<T, R> r3 = r9.f290574c
            x60.a<T> r6 = r9.f290591t
            r60.d r7 = r9.mo138481a()
            r60.i<?> r7 = r7.f296881a
            r3.mo507a(r6, r7, r0)
            if (r1 != 0) goto L_0x0159
            return
        L_0x0159:
            b70.a r0 = new b70.a
            x60.a<T> r1 = r9.f290591t
            r60.d r3 = r9.mo138481a()
            r0.<init>(r1, r3, r9)
            java.lang.String r1 = "MicroMsg.Loader.Reaper"
            java.lang.String r3 = "[ImageLoader] load from task:%s"
            java.lang.Object[] r6 = new java.lang.Object[r4]
            x60.a<T> r7 = r9.f290591t
            r6[r5] = r7
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r3, r6)
            r60.d r1 = r9.mo138481a()
            r60.d r3 = r9.mo138481a()
            r60.i<?> r3 = r3.f296881a
            r1.mo140832d(r3, r9)
            monitor-enter(r9)
            u60.f<u60.d> r1 = r9.f290586o     // Catch:{ all -> 0x0199 }
            if (r1 != 0) goto L_0x018b
            v60.e r1 = v60.C102155e.f300813a     // Catch:{ all -> 0x0199 }
            u60.f r1 = r1.mo141704a()     // Catch:{ all -> 0x0199 }
            r9.f290586o = r1     // Catch:{ all -> 0x0199 }
        L_0x018b:
            monitor-exit(r9)
            u60.f<u60.d> r1 = r9.f290586o
            if (r1 == 0) goto L_0x0198
            u60.e r3 = new u60.e
            r3.<init>(r1, r0, r4, r2)
            o40.C61926c.m72668M(r3)
        L_0x0198:
            return
        L_0x0199:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k60.C99102f.mo138482b():void");
    }
}
