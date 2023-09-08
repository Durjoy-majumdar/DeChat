package oh3;

import android.net.Uri;
import coil.size.Size;
import gy3.C87412m;
import p1106e5.C107228a;
import p1126j5.C108576g;
import p972h5.C108143i;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: oh3.i */
public final class C110050i implements C108576g<Uri> {

    @C91590f(mo125468c = "com.tencent.mm.sns_compose.widget.SnsCdnFetcher", mo125469f = "NetworkImageLoader.kt", mo125470l = {55}, mo125471m = "fetch")
    /* renamed from: oh3.i$a */
    public static final class C110051a extends C66704d {

        /* renamed from: d */
        public Object f329319d;

        /* renamed from: e */
        public Object f329320e;

        /* renamed from: f */
        public /* synthetic */ Object f329321f;

        /* renamed from: g */
        public final /* synthetic */ C110050i f329322g;

        /* renamed from: h */
        public int f329323h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110051a(C110050i iVar, C15601d<? super C110051a> dVar) {
            super(dVar);
            this.f329322g = iVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f329321f = obj;
            this.f329323h |= Integer.MIN_VALUE;
            return this.f329322g.mo159570c((C107228a) null, (Uri) null, (Size) null, (C108143i) null, this);
        }
    }

    /* renamed from: a */
    public boolean mo159568a(Object obj) {
        Uri uri = (Uri) obj;
        C87412m.m108594g(uri, "data");
        return C87412m.m108589b(uri.getScheme(), "sns");
    }

    /* renamed from: b */
    public String mo159569b(Object obj) {
        Uri uri = (Uri) obj;
        C87412m.m108594g(uri, "data");
        String uri2 = uri.toString();
        C87412m.m108593f(uri2, "data.toString()");
        return uri2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo159570c(p1106e5.C107228a r10, android.net.Uri r11, coil.size.Size r12, p972h5.C108143i r13, wx3.C15601d<? super p1126j5.C108575f> r14) {
        /*
            r9 = this;
            boolean r10 = r14 instanceof oh3.C110050i.C110051a
            if (r10 == 0) goto L_0x0013
            r10 = r14
            oh3.i$a r10 = (oh3.C110050i.C110051a) r10
            int r12 = r10.f329323h
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r12 & r13
            if (r0 == 0) goto L_0x0013
            int r12 = r12 - r13
            r10.f329323h = r12
            goto L_0x0018
        L_0x0013:
            oh3.i$a r10 = new oh3.i$a
            r10.<init>(r9, r14)
        L_0x0018:
            java.lang.Object r12 = r10.f329321f
            xx3.a r13 = xx3.C15911a.COROUTINE_SUSPENDED
            int r14 = r10.f329323h
            java.lang.String r0 = " Uri:"
            java.lang.String r1 = "SnsCdnFetcher"
            r2 = 1
            if (r14 == 0) goto L_0x003d
            if (r14 != r2) goto L_0x0035
            java.lang.Object r11 = r10.f329320e
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r10 = r10.f329319d
            android.net.Uri r10 = (android.net.Uri) r10
            kotlin.ResultKt.throwOnFailure(r12)
            r14 = r11
            r11 = r10
            goto L_0x0085
        L_0x0035:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x003d:
            kotlin.ResultKt.throwOnFailure(r12)
            java.lang.String r12 = r11.toString()
            java.lang.String r14 = "data.toString()"
            gy3.C87412m.m108593f(r12, r14)
            java.lang.String r14 = "//"
            java.lang.String r3 = z04.C112550d0.m153794d0(r12, r14, r12)
            java.lang.String r14 = "/"
            java.lang.String[] r4 = new java.lang.String[]{r14}
            r5 = 0
            r6 = 0
            r7 = 6
            r8 = 0
            java.util.List r14 = z04.C112550d0.m153785U(r3, r4, r5, r6, r7, r8)
            int r3 = r14.size()
            r4 = 4
            if (r3 != r4) goto L_0x00d8
            r12 = 0
            java.lang.Object r12 = r14.get(r12)
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r12 = r14.get(r2)
            java.lang.String r12 = (java.lang.String) r12
            r12 = 2
            java.lang.Object r12 = r14.get(r12)
            java.lang.String r3 = "1"
            gy3.C87412m.m108589b(r12, r3)
            r10.f329319d = r11
            r10.f329320e = r14
            r10.f329323h = r2
            r12 = 0
            if (r13 != 0) goto L_0x0085
            return r13
        L_0x0085:
            java.lang.String r12 = (java.lang.String) r12
            if (r12 == 0) goto L_0x00af
            boolean r10 = com.tencent.p014mm.vfs.C86013q1.m106450k(r12)
            if (r10 == 0) goto L_0x00af
            java.io.InputStream r10 = com.tencent.p014mm.vfs.C86013q1.m106423E(r12)
            java.lang.String r11 = "openRead(path)"
            gy3.C87412m.m108593f(r10, r11)
            j5.m r11 = new j5.m
            o24.d0 r10 = o24.C21777r.m24939f(r10)
            o24.j r10 = o24.C21777r.m24935b(r10)
            r12 = 3
            java.lang.Object r12 = r14.get(r12)
            java.lang.String r12 = (java.lang.String) r12
            h5.b r13 = p972h5.C108136b.DISK
            r11.<init>(r10, r12, r13)
            return r11
        L_0x00af:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r13 = " path is null, or file is not exists :"
            r10.append(r13)
            r10.append(r12)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r1, r10)
            java.io.FileNotFoundException r10 = new java.io.FileNotFoundException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r0)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            r10.<init>(r11)
            throw r10
        L_0x00d8:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r13 = "url:"
            r10.append(r13)
            r10.append(r12)
            java.lang.String r12 = " splits:"
            r10.append(r12)
            int r12 = r14.size()
            r10.append(r12)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r1, r10)
            java.io.FileNotFoundException r10 = new java.io.FileNotFoundException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r0)
            r12.append(r11)
            java.lang.String r11 = " split size "
            r12.append(r11)
            int r11 = r14.size()
            r12.append(r11)
            java.lang.String r11 = ", Uri(\"sns://id/mediaId/thumb\")"
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: oh3.C110050i.mo159570c(e5.a, android.net.Uri, coil.size.Size, h5.i, wx3.d):java.lang.Object");
    }
}
