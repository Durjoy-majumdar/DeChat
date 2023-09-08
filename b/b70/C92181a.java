package b70;

import android.graphics.Bitmap;
import b70.C92186b;
import com.tencent.p014mm.loader.cache.memory.C92699b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import cy3.C58003b;
import fy3.C32224a;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import k60.C99102f;
import m60.C99792d;
import n60.C100075f;
import o40.C61925b;
import o60.C100284b;
import o60.C100287c;
import o60.C100291e;
import r60.C101342d;
import rx3.C13598b0;
import s60.C101535a;
import s60.C101536b;
import t60.C101724f;
import t60.C101725g;
import t60.C64205a;
import t60.C64206c;
import u60.C101960c;
import w60.C102353e;
import w60.C102355h;
import w60.C65941g;
import x60.C102564a;
import y60.C102802a;

/* renamed from: b70.a */
public final class C92181a<T, R> extends C92186b<T, R> {

    /* renamed from: q */
    public C99792d<T, R> f263838q;

    /* renamed from: r */
    public C92699b<T, R> f263839r;

    /* renamed from: s */
    public C100291e<R> f263840s;

    /* renamed from: b70.a$a */
    public static final class C92182a<R> {

        /* renamed from: a */
        public C65941g<R> f263841a;

        /* renamed from: b */
        public final C32224a<C13598b0> f263842b;

        public C92182a(C65941g<R> gVar, C32224a<C13598b0> aVar) {
            C87412m.m108594g(aVar, "block");
            this.f263841a = gVar;
            this.f263842b = aVar;
        }
    }

    /* renamed from: b70.a$b */
    public static final class C92183b implements C100284b.C100286b {

        /* renamed from: a */
        public final /* synthetic */ C92186b.C92187a<R> f263843a;

        /* renamed from: b */
        public final /* synthetic */ C92181a<T, R> f263844b;

        /* renamed from: c */
        public final /* synthetic */ long f263845c;

        public C92183b(C92186b.C92187a<R> aVar, C92181a<T, R> aVar2, long j) {
            this.f263843a = aVar;
            this.f263844b = aVar2;
            this.f263845c = j;
        }

        /* renamed from: a */
        public void mo126149a() {
            this.f263844b.mo126148l((C102355h<?>) null, this.f263845c, this.f263843a);
        }

        /* renamed from: b */
        public void mo126150b(C102355h<?> hVar) {
            C87412m.m108594g(hVar, "resp");
            this.f263844b.mo126148l(hVar, this.f263845c, this.f263843a);
        }
    }

    /* renamed from: b70.a$c */
    public static final class C92184c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C92184c f263846d = new C92184c();

        public C92184c() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return C13598b0.f38549a;
        }
    }

    /* renamed from: b70.a$d */
    public static final class C92185d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C92181a<T, R> f263847d;

        /* renamed from: e */
        public final /* synthetic */ C102355h<?> f263848e;

        /* renamed from: f */
        public final /* synthetic */ C65941g<R> f263849f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C92185d(C92181a<T, R> aVar, C102355h<?> hVar, C65941g<R> gVar) {
            super(0);
            this.f263847d = aVar;
            this.f263848e = hVar;
            this.f263849f = gVar;
        }

        public Object invoke() {
            C92181a<T, R> aVar = this.f263847d;
            aVar.mo126151e(this.f263848e, this.f263849f, (C65941g<R>) null, aVar);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92181a(C102564a<T> aVar, C101342d<R> dVar, C99102f<T, R> fVar) {
        super(aVar, dVar, fVar);
        C87412m.m108594g(aVar, "_url");
        C87412m.m108594g(dVar, "target");
        C87412m.m108594g(fVar, "reaper");
        C99102f<T, R> fVar2 = this.f263852h;
        this.f263838q = fVar2.f290580i;
        this.f263839r = fVar2.f290579h;
        this.f263840s = fVar2.f290582k;
    }

    /* renamed from: f */
    public void mo126144f(C100075f.C61628b bVar, C92186b.C92187a<R> aVar) {
        C87412m.m108594g(bVar, "fileType");
        C87412m.m108594g(aVar, "taskListener");
        try {
            mo126145i(bVar, aVar);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.Loader.ImageLoadWorkTask", e, "[ImageLoader execute] " + e.getMessage() + " run error " + this.f263850f + " [debug info " + null + ']', new Object[0]);
            aVar.mo126156c();
        }
    }

    /* renamed from: i */
    public final void mo126145i(C100075f.C61628b bVar, C92186b.C92187a<R> aVar) {
        Throwable th;
        C100075f.C61628b bVar2 = bVar;
        C92186b.C92187a<R> aVar2 = aVar;
        System.currentTimeMillis();
        Log.m105924i("MicroMsg.Loader.ImageLoadWorkTask", "[ImageLoader] run. get bitmap from disk. key:" + this.f263850f + " fileType " + bVar2 + " [width:" + this.f263851g + ".weakHolder.viewWidth height:" + this.f263851g + ".weakHolder.viewHeight] diskCache " + this.f263838q + " producer " + this.f263840s + " isLocalFile: " + mo126146j());
        C101536b.C101538b bVar3 = C101536b.C101538b.DECODED;
        C102353e eVar = new C102353e();
        try {
            C99102f<T, R> fVar = this.f263852h;
            C99792d<T, R> dVar = this.f263838q;
            if (dVar != null) {
                C102564a<T> aVar3 = this.f263850f;
                C100075f fVar2 = fVar.f290573b;
                C87412m.m108594g(aVar3, "url");
                C87412m.m108594g(fVar2, "opts");
                C102802a b = dVar.mo137107b(aVar3, fVar2, fVar);
                if (b != null) {
                    try {
                        C100291e<R> eVar2 = this.f263840s;
                        C65941g<R> a = eVar2 != null ? eVar2.mo87424a(fVar.mo138481a().f296881a, fVar, b) : null;
                        if (!(a instanceof C65941g)) {
                            a = null;
                        }
                        if (a != null) {
                            C101535a<R> aVar4 = fVar.f290584m;
                            C65941g<R> d = aVar4 != null ? aVar4.mo141014d(fVar.mo138481a().f296881a, fVar, a, bVar3) : null;
                            if (d != null) {
                                a = d;
                            }
                        }
                        if (a != null) {
                            C101535a<R> aVar5 = fVar.f290583l;
                            C65941g<R> d2 = aVar5 != null ? aVar5.mo141014d(fVar.mo138481a().f296881a, fVar, a, bVar3) : null;
                            if (d2 != null) {
                                a = d2;
                            }
                        }
                        if (a != null) {
                            T t = a.f189590a;
                            if (!(t == null ? false : t instanceof Bitmap ? !((Bitmap) t).isRecycled() : true)) {
                                a = null;
                            }
                            if (a != null) {
                                C92699b<T, R> bVar4 = this.f263839r;
                                if (bVar4 != null) {
                                    bVar4.mo126885c(fVar.f290591t, fVar.f290583l, a.f189590a);
                                }
                                eVar.f301453a = a.f189590a;
                            }
                        }
                        b.close();
                        C13598b0 b0Var = C13598b0.f38549a;
                        C58003b.m67160a(b, (Throwable) null);
                    } catch (Throwable th4) {
                        Throwable th5 = th4;
                        C58003b.m67160a(b, th);
                        throw th5;
                    }
                }
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.Loader.ImageLoadWorkTask", e, "[ImageLoader READ] run error %s [debug info %s]", this.f263850f, null);
        }
        boolean z = !mo126146j() && eVar.f301453a == null;
        Log.m105924i("MicroMsg.Loader.ImageLoadWorkTask", "[ImageLoader] run. get bitmap from disk. done result resultData " + eVar + " bitmap " + eVar.f301453a + " isNeedDownload " + z);
        if (!z) {
            aVar2.mo126155b(eVar);
            return;
        }
        C99102f<T, R> fVar3 = this.f263852h;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            Log.m105918d("MicroMsg.Loader.ImageLoadWorkTask", "[ImageLoader] run. get bitmap from memory failed.now try to get from network. " + this.f263850f + " fileType: " + bVar2);
            C64206c<T> cVar = fVar3.f290577f;
            if (cVar != null) {
                cVar.mo84453a(this.f263850f, fVar3.mo138481a().f296881a);
            }
            C100284b<T> bVar5 = fVar3.f290578g;
            if (!fVar3.f290581j.mo139546a(this.f263850f)) {
                bVar5 = null;
            }
            if (bVar5 == null) {
                mo126148l((C102355h<?>) null, currentTimeMillis, aVar2);
                Log.m105924i("MicroMsg.Loader.ImageLoadWorkTask", "can not download image, over limit " + this.f263850f);
                return;
            }
            C100284b<T> bVar6 = fVar3.f290578g;
            C102564a<T> aVar6 = this.f263850f;
            C101725g gVar = fVar3.f290587p;
            C101960c cVar2 = this.f187739d;
            if (cVar2 != null) {
                C92183b bVar7 = new C92183b(aVar2, this, currentTimeMillis);
                bVar6.getClass();
                C87412m.m108594g(aVar6, "url");
                C87412m.m108594g(gVar, "fileNameCreator");
                cVar2.mo89347a(new C100287c(cVar2, bVar6, aVar6, gVar, bVar7));
                return;
            }
            C87412m.m108603p("loader");
            throw null;
        } catch (Exception e2) {
            Log.printErrStackTrace("MicroMsg.Loader.ImageLoadWorkTask", e2, "[ImageLoader DownLoadException] run error %s [debug info %s]", this.f263850f, fVar3.f290593v);
            C13598b0 b0Var2 = C13598b0.f38549a;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0009, code lost:
        r0 = r0.f301996b;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo126146j() {
        /*
            r4 = this;
            x60.a<T> r0 = r4.f263850f
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            r2 = 1
            if (r0 == 0) goto L_0x001a
            x60.b r0 = r0.f301996b
            x60.b r3 = x60.C102565b.ASSET_DATA
            if (r0 == r3) goto L_0x001a
            x60.b r3 = x60.C102565b.DRAWABLE_ID
            if (r0 == r3) goto L_0x001a
            x60.b r3 = x60.C102565b.LOCAL_PATH
            if (r0 != r3) goto L_0x0018
            goto L_0x001a
        L_0x0018:
            r0 = 0
            goto L_0x001b
        L_0x001a:
            r0 = 1
        L_0x001b:
            if (r0 == 0) goto L_0x001e
            return r2
        L_0x001e:
            k60.f<T, R> r0 = r4.f263852h
            n60.f r0 = r0.f290573b
            n60.f$b r0 = r0.f293167e
            n60.f$b r3 = n60.C100075f.C61628b.FILE
            if (r0 != r3) goto L_0x0029
            r1 = 1
        L_0x0029:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b70.C92181a.mo126146j():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0060, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0061, code lost:
        cy3.C58003b.m67160a(r8, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0064, code lost:
        throw r0;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final b70.C92181a.C92182a<R> mo126147k(w60.C102355h<?> r7, y60.C102802a r8) {
        /*
            r6 = this;
            k60.f<T, R> r0 = r6.f263852h
            o60.e<R> r1 = r6.f263840s     // Catch:{ all -> 0x005e }
            r2 = 0
            if (r1 == 0) goto L_0x0014
            r60.d r3 = r0.mo138481a()     // Catch:{ all -> 0x005e }
            r60.i<?> r3 = r3.f296881a     // Catch:{ all -> 0x005e }
            k60.f<T, R> r4 = r6.f263852h     // Catch:{ all -> 0x005e }
            w60.g r1 = r1.mo87424a(r3, r4, r8)     // Catch:{ all -> 0x005e }
            goto L_0x0015
        L_0x0014:
            r1 = r2
        L_0x0015:
            boolean r3 = r1 instanceof w60.C65941g     // Catch:{ all -> 0x005e }
            if (r3 == 0) goto L_0x001a
            goto L_0x001b
        L_0x001a:
            r1 = r2
        L_0x001b:
            if (r1 == 0) goto L_0x005a
            s60.a<R> r3 = r0.f290583l     // Catch:{ all -> 0x005e }
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x002a
            boolean r3 = s60.C101535a.m133296e(r3, r2, r5, r2)     // Catch:{ all -> 0x005e }
            if (r3 != r5) goto L_0x002a
            r4 = 1
        L_0x002a:
            if (r4 == 0) goto L_0x004c
            s60.a<R> r3 = r0.f290583l     // Catch:{ all -> 0x005e }
            if (r3 == 0) goto L_0x005a
            r60.d r4 = r0.mo138481a()     // Catch:{ all -> 0x005e }
            r60.i<?> r4 = r4.f296881a     // Catch:{ all -> 0x005e }
            s60.b$b r5 = s60.C101536b.C101538b.DOWNLOADED     // Catch:{ all -> 0x005e }
            w60.g r0 = r3.mo141014d(r4, r0, r1, r5)     // Catch:{ all -> 0x005e }
            if (r0 == 0) goto L_0x005a
            r6.mo126151e(r7, r1, r0, r6)     // Catch:{ all -> 0x005e }
            b70.a$a r7 = new b70.a$a     // Catch:{ all -> 0x005e }
            b70.a$c r1 = b70.C92181a.C92184c.f263846d     // Catch:{ all -> 0x005e }
            r7.<init>(r0, r1)     // Catch:{ all -> 0x005e }
            cy3.C58003b.m67160a(r8, r2)
            return r7
        L_0x004c:
            b70.a$a r0 = new b70.a$a     // Catch:{ all -> 0x005e }
            b70.a$d r3 = new b70.a$d     // Catch:{ all -> 0x005e }
            r3.<init>(r6, r7, r1)     // Catch:{ all -> 0x005e }
            r0.<init>(r1, r3)     // Catch:{ all -> 0x005e }
            cy3.C58003b.m67160a(r8, r2)
            return r0
        L_0x005a:
            cy3.C58003b.m67160a(r8, r2)
            return r2
        L_0x005e:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x0060 }
        L_0x0060:
            r0 = move-exception
            cy3.C58003b.m67160a(r8, r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b70.C92181a.mo126147k(w60.h, y60.a):b70.a$a");
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: l */
    public final void mo126148l(C102355h<?> hVar, long j, C92186b.C92187a<R> aVar) {
        C102802a a;
        Throwable th;
        C92699b<T, R> bVar;
        C102355h<?> hVar2 = hVar;
        C101536b.C101538b bVar2 = C101536b.C101538b.DECODED;
        C102353e eVar = new C102353e();
        Log.m105924i("MicroMsg.Loader.ImageLoadWorkTask", "whenDataReady " + this.f263850f + " httpResponse " + hVar2);
        C99102f<T, R> fVar = this.f263852h;
        if (hVar2 != null) {
            if (!((hVar2.f301455a != null ? hVar2 : null) == null || (a = hVar.mo141918a()) == null)) {
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    C92182a<R> k = mo126147k(hVar2, a);
                    if (k != null) {
                        T t = k.f263841a;
                        if (t != null) {
                            C8479f0 f0Var = new C8479f0();
                            f0Var.f27484d = t;
                            C61925b bVar3 = new C61925b("Transcoder");
                            C65941g gVar = (C65941g) f0Var.f27484d;
                            C101535a<R> aVar2 = fVar.f290584m;
                            T d = aVar2 != null ? aVar2.mo141014d(fVar.mo138481a().f296881a, fVar, gVar, bVar2) : null;
                            if (d == null) {
                                d = (C65941g) f0Var.f27484d;
                            }
                            f0Var.f27484d = d;
                            C101535a<R> aVar3 = fVar.f290583l;
                            T d2 = aVar3 != null ? aVar3.mo141014d(fVar.mo138481a().f296881a, fVar, d, bVar2) : null;
                            if (d2 == null) {
                                d2 = (C65941g) f0Var.f27484d;
                            }
                            f0Var.f27484d = d2;
                            C101535a<R> aVar4 = fVar.f290583l;
                            T d3 = aVar4 != null ? aVar4.mo141014d(fVar.mo138481a().f296881a, fVar, d2, C101536b.C101538b.LOADED) : null;
                            if (d3 == null) {
                                d3 = (C65941g) f0Var.f27484d;
                            }
                            f0Var.f27484d = d3;
                            C13598b0 b0Var = C13598b0.f38549a;
                            bVar3.mo86838a();
                            Object obj = ((C65941g) f0Var.f27484d).f189590a;
                            eVar.f301453a = obj;
                            aVar.mo126154a(eVar);
                            if (!(obj == null || (bVar = this.f263839r) == null)) {
                                bVar.mo126885c(fVar.f290591t, fVar.f290583l, obj);
                            }
                        }
                        C61925b bVar4 = new C61925b("lazytask commit");
                        k.f263842b.invoke();
                        C13598b0 b0Var2 = C13598b0.f38549a;
                        bVar4.mo86838a();
                        long j2 = currentTimeMillis - j;
                        C101724f fVar2 = this.f263852h.f290576e;
                        if (fVar2 != null) {
                            fVar2.mo140079a(j2);
                        }
                        C64205a aVar5 = fVar.f290585n;
                        if (aVar5 != null) {
                            aVar5.mo729a(true, new Object[0]);
                        }
                        C58003b.m67160a(a, (Throwable) null);
                        return;
                    }
                    C92186b.C92187a<R> aVar6 = aVar;
                    C64205a aVar7 = fVar.f290585n;
                    if (aVar7 != null) {
                        aVar7.mo729a(false, new Object[0]);
                    }
                    aVar.mo126156c();
                    C58003b.m67160a(a, (Throwable) null);
                    return;
                } catch (Throwable th4) {
                    Throwable th5 = th4;
                    C58003b.m67160a(a, th);
                    throw th5;
                }
            }
        }
        C92186b.C92187a<R> aVar8 = aVar;
        Log.m105925i("MicroMsg.Loader.ImageLoadWorkTask", "httpRespone value is null %s %s", this.f263850f, Util.getStack().toString());
        C64205a aVar9 = fVar.f290585n;
        if (aVar9 != null) {
            aVar9.mo729a(false, new Object[0]);
        }
        aVar.mo126156c();
    }
}
