package p1126j5;

import coil.size.Size;
import d24.C106982e;
import d24.C20397d;
import d24.C20421s;
import gy3.C87412m;
import p1106e5.C107228a;
import p972h5.C108143i;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: j5.i */
public abstract class C108578i<T> implements C108576g<T> {

    /* renamed from: b */
    public static final C20397d f325033b;

    /* renamed from: c */
    public static final C20397d f325034c;

    /* renamed from: a */
    public final C106982e.C106983a f325035a;

    @C91590f(mo125468c = "coil.fetch.HttpFetcher", mo125469f = "HttpFetcher.kt", mo125470l = {125}, mo125471m = "fetch$suspendImpl")
    /* renamed from: j5.i$a */
    public static final class C108579a extends C66704d {

        /* renamed from: d */
        public Object f325036d;

        /* renamed from: e */
        public Object f325037e;

        /* renamed from: f */
        public Object f325038f;

        /* renamed from: g */
        public /* synthetic */ Object f325039g;

        /* renamed from: h */
        public final /* synthetic */ C108578i<T> f325040h;

        /* renamed from: i */
        public int f325041i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108579a(C108578i<T> iVar, C15601d<? super C108579a> dVar) {
            super(dVar);
            this.f325040h = iVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f325039g = obj;
            this.f325041i |= Integer.MIN_VALUE;
            return C108578i.m147179d(this.f325040h, (C107228a) null, (Object) null, (Size) null, (C108143i) null, this);
        }
    }

    static {
        C20397d.C20398a aVar = new C20397d.C20398a();
        aVar.f57195a = true;
        aVar.f57196b = true;
        f325033b = new C20397d(aVar);
        C20397d.C20398a aVar2 = new C20397d.C20398a();
        aVar2.f57195a = true;
        aVar2.f57198d = true;
        f325034c = new C20397d(aVar2);
    }

    public C108578i(C106982e.C106983a aVar) {
        C87412m.m108594g(aVar, "callFactory");
        this.f325035a = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0139, code lost:
        if (r5 == null) goto L_0x013b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object m147179d(p1126j5.C108578i r3, p1106e5.C107228a r4, java.lang.Object r5, coil.size.Size r6, p972h5.C108143i r7, wx3.C15601d r8) {
        /*
            boolean r4 = r8 instanceof p1126j5.C108578i.C108579a
            if (r4 == 0) goto L_0x0013
            r4 = r8
            j5.i$a r4 = (p1126j5.C108578i.C108579a) r4
            int r6 = r4.f325041i
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r6 & r0
            if (r1 == 0) goto L_0x0013
            int r6 = r6 - r0
            r4.f325041i = r6
            goto L_0x0018
        L_0x0013:
            j5.i$a r4 = new j5.i$a
            r4.<init>(r3, r8)
        L_0x0018:
            java.lang.Object r6 = r4.f325039g
            xx3.a r8 = xx3.C15911a.COROUTINE_SUSPENDED
            int r0 = r4.f325041i
            r1 = 1
            if (r0 == 0) goto L_0x003e
            if (r0 != r1) goto L_0x0036
            java.lang.Object r3 = r4.f325038f
            d24.e r3 = (d24.C106982e) r3
            java.lang.Object r3 = r4.f325037e
            d24.s r3 = (d24.C20421s) r3
            java.lang.Object r4 = r4.f325036d
            j5.i r4 = (p1126j5.C108578i) r4
            kotlin.ResultKt.throwOnFailure(r6)
            r5 = r3
            r3 = r4
            goto L_0x00de
        L_0x0036:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L_0x003e:
            kotlin.ResultKt.throwOnFailure(r6)
            d24.s r5 = r3.mo159574e(r5)
            d24.y$a r6 = new d24.y$a
            r6.<init>()
            r6.mo31973e(r5)
            d24.r r0 = r7.f323817h
            d24.r$a r0 = r0.mo31928e()
            r6.f57347c = r0
            o5.b r0 = r7.f323821l
            boolean r0 = r0.f328952d
            o5.b r7 = r7.f323820k
            boolean r2 = r7.f328952d
            if (r0 != 0) goto L_0x0067
            if (r2 == 0) goto L_0x0067
            d24.d r7 = d24.C20397d.f57181o
            r6.mo31970b(r7)
            goto L_0x0084
        L_0x0067:
            if (r0 == 0) goto L_0x007b
            if (r2 != 0) goto L_0x007b
            boolean r7 = r7.f328953e
            if (r7 == 0) goto L_0x0075
            d24.d r7 = d24.C20397d.f57180n
            r6.mo31970b(r7)
            goto L_0x0084
        L_0x0075:
            d24.d r7 = f325033b
            r6.mo31970b(r7)
            goto L_0x0084
        L_0x007b:
            if (r0 != 0) goto L_0x0084
            if (r2 != 0) goto L_0x0084
            d24.d r7 = f325034c
            r6.mo31970b(r7)
        L_0x0084:
            wx3.f r7 = r4.getContext()
            a14.h0$a r2 = a14.C53896h0.f151143d
            wx3.f$b r7 = r7.get(r2)
            boolean r7 = r7 instanceof a14.C53915k2
            if (r7 == 0) goto L_0x00a9
            if (r0 != 0) goto L_0x00a3
            d24.e$a r4 = r3.f325035a
            d24.y r6 = r6.mo31969a()
            d24.e r4 = r4.mo31953a(r6)
            d24.b0 r4 = r4.mo31956D()
            goto L_0x00e1
        L_0x00a3:
            android.os.NetworkOnMainThreadException r3 = new android.os.NetworkOnMainThreadException
            r3.<init>()
            throw r3
        L_0x00a9:
            d24.e$a r7 = r3.f325035a
            d24.y r6 = r6.mo31969a()
            d24.e r6 = r7.mo31953a(r6)
            java.lang.String r7 = "callFactory.newCall(request.build())"
            gy3.C87412m.m108593f(r6, r7)
            r4.f325036d = r3
            r4.f325037e = r5
            r4.f325038f = r6
            r4.f325041i = r1
            a14.m r7 = new a14.m
            wx3.d r4 = xx3.C66447b.m78392b(r4)
            r7.<init>(r4, r1)
            r7.mo74609p()
            t5.f r4 = new t5.f
            r4.<init>(r6, r7)
            r6.mo31958a2(r4)
            r7.mo74599v(r4)
            java.lang.Object r6 = r7.mo74608o()
            if (r6 != r8) goto L_0x00de
            return r8
        L_0x00de:
            r4 = r6
            d24.b0 r4 = (d24.C20387b0) r4
        L_0x00e1:
            int r6 = r4.f57127f
            r7 = 200(0xc8, float:2.8E-43)
            r8 = 0
            if (r6 < r7) goto L_0x00ed
            r7 = 300(0x12c, float:4.2E-43)
            if (r6 >= r7) goto L_0x00ed
            goto L_0x00ee
        L_0x00ed:
            r1 = 0
        L_0x00ee:
            if (r1 != 0) goto L_0x00fe
            d24.d0 r3 = r4.f57131j
            if (r3 != 0) goto L_0x00f5
            goto L_0x00f8
        L_0x00f5:
            r3.close()
        L_0x00f8:
            n5.b r3 = new n5.b
            r3.<init>(r4)
            throw r3
        L_0x00fe:
            d24.d0 r6 = r4.f57131j
            if (r6 == 0) goto L_0x0153
            j5.m r7 = new j5.m
            o24.j r0 = r6.mo31898c()
            java.lang.String r1 = "body.source()"
            gy3.C87412m.m108593f(r0, r1)
            r3.getClass()
            java.lang.String r3 = "data"
            gy3.C87412m.m108594g(r5, r3)
            d24.u r3 = r6.mo31897b()
            r6 = 0
            if (r3 != 0) goto L_0x011e
            r3 = r6
            goto L_0x0120
        L_0x011e:
            java.lang.String r3 = r3.f320231a
        L_0x0120:
            if (r3 == 0) goto L_0x012a
            java.lang.String r1 = "text/plain"
            boolean r8 = z04.C112551y.m153819s(r3, r1, r8)
            if (r8 == 0) goto L_0x013b
        L_0x012a:
            android.webkit.MimeTypeMap r8 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r1 = "getSingleton()"
            gy3.C87412m.m108593f(r8, r1)
            java.lang.String r5 = r5.f57273i
            java.lang.String r5 = p864t5.C110905d.m151205a(r8, r5)
            if (r5 != 0) goto L_0x0146
        L_0x013b:
            if (r3 != 0) goto L_0x013e
            goto L_0x0145
        L_0x013e:
            r5 = 59
            r8 = 2
            java.lang.String r6 = z04.C112550d0.m153796f0(r3, r5, r6, r8, r6)
        L_0x0145:
            r5 = r6
        L_0x0146:
            d24.b0 r3 = r4.f57133o
            if (r3 == 0) goto L_0x014d
            h5.b r3 = p972h5.C108136b.DISK
            goto L_0x014f
        L_0x014d:
            h5.b r3 = p972h5.C108136b.NETWORK
        L_0x014f:
            r7.<init>(r0, r5, r3)
            return r7
        L_0x0153:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Null response body!"
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p1126j5.C108578i.m147179d(j5.i, e5.a, java.lang.Object, coil.size.Size, h5.i, wx3.d):java.lang.Object");
    }

    /* renamed from: a */
    public boolean mo159568a(T t) {
        C87412m.m108594g(t, "data");
        return true;
    }

    /* renamed from: c */
    public Object mo159570c(C107228a aVar, T t, Size size, C108143i iVar, C15601d<? super C108575f> dVar) {
        return m147179d(this, aVar, t, size, iVar, dVar);
    }

    /* renamed from: e */
    public abstract C20421s mo159574e(T t);
}
