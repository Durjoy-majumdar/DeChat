package p1128k5;

import android.content.Context;
import android.graphics.Bitmap;
import coil.size.Size;
import gy3.C87412m;
import java.util.List;
import p1105d5.C106991c;
import p1128k5.C108894b;
import p632o5.C109956h;
import p632o5.C109961j;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: k5.c */
public final class C108896c implements C108894b.C108895a {

    /* renamed from: a */
    public final C109956h f326159a;

    /* renamed from: b */
    public final int f326160b;

    /* renamed from: c */
    public final List<C108894b> f326161c;

    /* renamed from: d */
    public final int f326162d;

    /* renamed from: e */
    public final C109956h f326163e;

    /* renamed from: f */
    public final Size f326164f;

    /* renamed from: g */
    public final Bitmap f326165g;

    /* renamed from: h */
    public final C106991c f326166h;

    @C91590f(mo125468c = "coil.intercept.RealInterceptorChain", mo125469f = "RealInterceptorChain.kt", mo125470l = {27}, mo125471m = "proceed")
    /* renamed from: k5.c$a */
    public static final class C108897a extends C66704d {

        /* renamed from: d */
        public Object f326167d;

        /* renamed from: e */
        public Object f326168e;

        /* renamed from: f */
        public /* synthetic */ Object f326169f;

        /* renamed from: g */
        public final /* synthetic */ C108896c f326170g;

        /* renamed from: h */
        public int f326171h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108897a(C108896c cVar, C15601d<? super C108897a> dVar) {
            super(dVar);
            this.f326170g = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f326169f = obj;
            this.f326171h |= Integer.MIN_VALUE;
            return this.f326170g.mo160028c((C109956h) null, this);
        }
    }

    public C108896c(C109956h hVar, int i, List<? extends C108894b> list, int i2, C109956h hVar2, Size size, Bitmap bitmap, C106991c cVar) {
        C87412m.m108594g(hVar, "initialRequest");
        C87412m.m108594g(list, "interceptors");
        C87412m.m108594g(hVar2, "request");
        C87412m.m108594g(size, "size");
        C87412m.m108594g(cVar, "eventListener");
        this.f326159a = hVar;
        this.f326160b = i;
        this.f326161c = list;
        this.f326162d = i2;
        this.f326163e = hVar2;
        this.f326164f = size;
        this.f326165g = bitmap;
        this.f326166h = cVar;
    }

    /* renamed from: a */
    public C109956h mo160025a() {
        return this.f326163e;
    }

    /* renamed from: b */
    public final void mo160027b(C109956h hVar, C108894b bVar) {
        Context context = hVar.f328992a;
        C109956h hVar2 = this.f326159a;
        boolean z = true;
        if (context == hVar2.f328992a) {
            if (hVar.f328993b != C109961j.f329058a) {
                if (hVar.f328994c == hVar2.f328994c) {
                    if (hVar.f329004m == hVar2.f329004m) {
                        if (hVar.f329005n != hVar2.f329005n) {
                            z = false;
                        }
                        if (!z) {
                            throw new IllegalStateException(("Interceptor '" + bVar + "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.").toString());
                        }
                        return;
                    }
                    throw new IllegalStateException(("Interceptor '" + bVar + "' cannot modify the request's lifecycle.").toString());
                }
                throw new IllegalStateException(("Interceptor '" + bVar + "' cannot modify the request's target.").toString());
            }
            throw new IllegalStateException(("Interceptor '" + bVar + "' cannot set the request's data to null.").toString());
        }
        throw new IllegalStateException(("Interceptor '" + bVar + "' cannot modify the request's context.").toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo160028c(p632o5.C109956h r17, wx3.C15601d<? super p632o5.C109959i> r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            boolean r2 = r1 instanceof p1128k5.C108896c.C108897a
            if (r2 == 0) goto L_0x0017
            r2 = r1
            k5.c$a r2 = (p1128k5.C108896c.C108897a) r2
            int r3 = r2.f326171h
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f326171h = r3
            goto L_0x001c
        L_0x0017:
            k5.c$a r2 = new k5.c$a
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.f326169f
            xx3.a r3 = xx3.C15911a.COROUTINE_SUSPENDED
            int r4 = r2.f326171h
            r5 = 1
            if (r4 == 0) goto L_0x003b
            if (r4 != r5) goto L_0x0033
            java.lang.Object r3 = r2.f326168e
            k5.b r3 = (p1128k5.C108894b) r3
            java.lang.Object r2 = r2.f326167d
            k5.c r2 = (p1128k5.C108896c) r2
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x0085
        L_0x0033:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x003b:
            kotlin.ResultKt.throwOnFailure(r1)
            int r1 = r0.f326162d
            if (r1 <= 0) goto L_0x0051
            java.util.List<k5.b> r4 = r0.f326161c
            int r1 = r1 - r5
            java.lang.Object r1 = r4.get(r1)
            k5.b r1 = (p1128k5.C108894b) r1
            r4 = r17
            r0.mo160027b(r4, r1)
            goto L_0x0053
        L_0x0051:
            r4 = r17
        L_0x0053:
            java.util.List<k5.b> r1 = r0.f326161c
            int r6 = r0.f326162d
            java.lang.Object r1 = r1.get(r6)
            k5.b r1 = (p1128k5.C108894b) r1
            int r6 = r0.f326162d
            int r10 = r6 + 1
            coil.size.Size r12 = r0.f326164f
            k5.c r15 = new k5.c
            o5.h r7 = r0.f326159a
            int r8 = r0.f326160b
            java.util.List<k5.b> r9 = r0.f326161c
            android.graphics.Bitmap r13 = r0.f326165g
            d5.c r14 = r0.f326166h
            r6 = r15
            r11 = r17
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            r2.f326167d = r0
            r2.f326168e = r1
            r2.f326171h = r5
            java.lang.Object r2 = r1.mo160022a(r15, r2)
            if (r2 != r3) goto L_0x0082
            return r3
        L_0x0082:
            r3 = r1
            r1 = r2
            r2 = r0
        L_0x0085:
            o5.i r1 = (p632o5.C109959i) r1
            o5.h r4 = r1.mo161276b()
            r2.mo160027b(r4, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p1128k5.C108896c.mo160028c(o5.h, wx3.d):java.lang.Object");
    }

    public Size getSize() {
        return this.f326164f;
    }
}
