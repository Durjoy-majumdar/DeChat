package p1132m5;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import gy3.C87412m;
import p1105d5.C106991c;
import p1106e5.C107230c;
import p1106e5.C107232e;
import p1144q5.C110365a;
import p1144q5.C110366b;
import p632o5.C109954f;
import p632o5.C109963m;
import p864t5.C110905d;
import p864t5.C110908h;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: m5.m */
public final class C109515m extends C109528s {

    /* renamed from: a */
    public final C110365a<?> f327770a;

    /* renamed from: b */
    public final C107230c f327771b;

    /* renamed from: c */
    public final C106991c f327772c;

    @C91590f(mo125468c = "coil.memory.PoolableTargetDelegate", mo125469f = "TargetDelegate.kt", mo125470l = {227, 240}, mo125471m = "error")
    /* renamed from: m5.m$a */
    public static final class C109516a extends C66704d {

        /* renamed from: d */
        public Object f327773d;

        /* renamed from: e */
        public Object f327774e;

        /* renamed from: f */
        public Object f327775f;

        /* renamed from: g */
        public /* synthetic */ Object f327776g;

        /* renamed from: h */
        public final /* synthetic */ C109515m f327777h;

        /* renamed from: i */
        public int f327778i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109516a(C109515m mVar, C15601d<? super C109516a> dVar) {
            super(dVar);
            this.f327777h = mVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f327776g = obj;
            this.f327778i |= Integer.MIN_VALUE;
            return this.f327777h.mo160740b((C109954f) null, this);
        }
    }

    @C91590f(mo125468c = "coil.memory.PoolableTargetDelegate", mo125469f = "TargetDelegate.kt", mo125470l = {228, 251}, mo125471m = "success")
    /* renamed from: m5.m$b */
    public static final class C109517b extends C66704d {

        /* renamed from: d */
        public Object f327779d;

        /* renamed from: e */
        public Object f327780e;

        /* renamed from: f */
        public Object f327781f;

        /* renamed from: g */
        public Object f327782g;

        /* renamed from: h */
        public /* synthetic */ Object f327783h;

        /* renamed from: i */
        public final /* synthetic */ C109515m f327784i;

        /* renamed from: j */
        public int f327785j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109517b(C109515m mVar, C15601d<? super C109517b> dVar) {
            super(dVar);
            this.f327784i = mVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f327783h = obj;
            this.f327785j |= Integer.MIN_VALUE;
            return this.f327784i.mo160739e((C109963m) null, this);
        }
    }

    public C109515m(C110365a<?> aVar, C107230c cVar, C106991c cVar2, C110908h hVar) {
        C87412m.m108594g(aVar, "target");
        C87412m.m108594g(cVar, "referenceCounter");
        C87412m.m108594g(cVar2, "eventListener");
        this.f327770a = aVar;
        this.f327771b = cVar;
        this.f327772c = cVar2;
    }

    /* renamed from: f */
    public static final void m148729f(C109515m mVar, Bitmap bitmap) {
        C109529t b = C110905d.m151206b(mVar.f327770a.getView());
        Bitmap put = bitmap != null ? b.f327813i.put(mVar, bitmap) : b.f327813i.remove(mVar);
        if (put != null) {
            mVar.f327771b.mo157702b(put);
        }
    }

    /* renamed from: a */
    public void mo160744a() {
        if (this.f327771b instanceof C107232e) {
            this.f327770a.mo791a();
            return;
        }
        this.f327770a.mo791a();
        m148729f(this, (Bitmap) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo160740b(p632o5.C109954f r8, wx3.C15601d<? super rx3.C13598b0> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof p1132m5.C109515m.C109516a
            if (r0 == 0) goto L_0x0013
            r0 = r9
            m5.m$a r0 = (p1132m5.C109515m.C109516a) r0
            int r1 = r0.f327778i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f327778i = r1
            goto L_0x0018
        L_0x0013:
            m5.m$a r0 = new m5.m$a
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f327776g
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f327778i
            r3 = 0
            r4 = 1
            r5 = 2
            if (r2 == 0) goto L_0x0050
            if (r2 == r4) goto L_0x0042
            if (r2 != r5) goto L_0x003a
            java.lang.Object r8 = r0.f327775f
            d5.c r8 = (p1105d5.C106991c) r8
            java.lang.Object r1 = r0.f327774e
            m5.m r1 = (p1132m5.C109515m) r1
            java.lang.Object r0 = r0.f327773d
            o5.f r0 = (p632o5.C109954f) r0
            kotlin.ResultKt.throwOnFailure(r9)
            r2 = r8
            r8 = r0
            goto L_0x00c9
        L_0x003a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0042:
            java.lang.Object r8 = r0.f327774e
            d5.c r8 = (p1105d5.C106991c) r8
            java.lang.Object r0 = r0.f327773d
            o5.f r0 = (p632o5.C109954f) r0
            kotlin.ResultKt.throwOnFailure(r9)
            r2 = r8
            r8 = r0
            goto L_0x008c
        L_0x0050:
            kotlin.ResultKt.throwOnFailure(r9)
            e5.c r9 = r7.f327771b
            boolean r9 = r9 instanceof p1106e5.C107232e
            if (r9 == 0) goto L_0x0092
            q5.a<?> r9 = r7.f327770a
            d5.c r2 = r7.f327772c
            o5.h r3 = r8.f328980b
            s5.c r4 = r3.f329008q
            s5.b r5 = p1152s5.C110739b.f331206b
            if (r4 != r5) goto L_0x006b
            android.graphics.drawable.Drawable r8 = r8.f328979a
            r9.mo794d(r8)
            goto L_0x00d1
        L_0x006b:
            boolean r5 = r9 instanceof p1152s5.C110741d
            if (r5 != 0) goto L_0x0079
            o5.d r0 = r3.f328990G
            s5.c r0 = r0.f328971e
            android.graphics.drawable.Drawable r8 = r8.f328979a
            r9.mo794d(r8)
            goto L_0x00d1
        L_0x0079:
            r2.mo157433g(r3)
            s5.d r9 = (p1152s5.C110741d) r9
            r0.f327773d = r8
            r0.f327774e = r2
            r3 = 1
            r0.f327778i = r3
            java.lang.Object r9 = r4.mo162258a(r9, r8, r0)
            if (r9 != r1) goto L_0x008c
            return r1
        L_0x008c:
            o5.h r8 = r8.f328980b
            r2.mo157435i(r8)
            goto L_0x00d1
        L_0x0092:
            q5.a<?> r9 = r7.f327770a
            d5.c r2 = r7.f327772c
            o5.h r4 = r8.f328980b
            s5.c r5 = r4.f329008q
            s5.b r6 = p1152s5.C110739b.f331206b
            if (r5 != r6) goto L_0x00a4
            android.graphics.drawable.Drawable r8 = r8.f328979a
            r9.mo794d(r8)
            goto L_0x00b1
        L_0x00a4:
            boolean r6 = r9 instanceof p1152s5.C110741d
            if (r6 != 0) goto L_0x00b3
            o5.d r0 = r4.f328990G
            s5.c r0 = r0.f328971e
            android.graphics.drawable.Drawable r8 = r8.f328979a
            r9.mo794d(r8)
        L_0x00b1:
            r1 = r7
            goto L_0x00ce
        L_0x00b3:
            r2.mo157433g(r4)
            s5.d r9 = (p1152s5.C110741d) r9
            r0.f327773d = r8
            r0.f327774e = r7
            r0.f327775f = r2
            r4 = 2
            r0.f327778i = r4
            java.lang.Object r9 = r5.mo162258a(r9, r8, r0)
            if (r9 != r1) goto L_0x00c8
            return r1
        L_0x00c8:
            r1 = r7
        L_0x00c9:
            o5.h r8 = r8.f328980b
            r2.mo157435i(r8)
        L_0x00ce:
            m148729f(r1, r3)
        L_0x00d1:
            rx3.b0 r8 = rx3.C13598b0.f38549a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p1132m5.C109515m.mo160740b(o5.f, wx3.d):java.lang.Object");
    }

    /* renamed from: c */
    public C110366b mo160741c() {
        return this.f327770a;
    }

    /* renamed from: d */
    public void mo160742d(Drawable drawable, Bitmap bitmap) {
        C107230c cVar = this.f327771b;
        if (cVar instanceof C107232e) {
            this.f327770a.mo793c(drawable);
            return;
        }
        if (bitmap != null) {
            cVar.mo157703c(bitmap);
        }
        this.f327770a.mo793c(drawable);
        m148729f(this, bitmap);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo160739e(p632o5.C109963m r8, wx3.C15601d<? super rx3.C13598b0> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof p1132m5.C109515m.C109517b
            if (r0 == 0) goto L_0x0013
            r0 = r9
            m5.m$b r0 = (p1132m5.C109515m.C109517b) r0
            int r1 = r0.f327785j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f327785j = r1
            goto L_0x0018
        L_0x0013:
            m5.m$b r0 = new m5.m$b
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f327783h
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f327785j
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L_0x0053
            if (r2 == r3) goto L_0x0045
            if (r2 != r4) goto L_0x003d
            java.lang.Object r8 = r0.f327782g
            d5.c r8 = (p1105d5.C106991c) r8
            java.lang.Object r1 = r0.f327781f
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            java.lang.Object r2 = r0.f327780e
            m5.m r2 = (p1132m5.C109515m) r2
            java.lang.Object r0 = r0.f327779d
            o5.m r0 = (p632o5.C109963m) r0
            kotlin.ResultKt.throwOnFailure(r9)
            r3 = r8
            r8 = r0
            goto L_0x00e9
        L_0x003d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0045:
            java.lang.Object r8 = r0.f327780e
            d5.c r8 = (p1105d5.C106991c) r8
            java.lang.Object r0 = r0.f327779d
            o5.m r0 = (p632o5.C109963m) r0
            kotlin.ResultKt.throwOnFailure(r9)
            r2 = r8
            r8 = r0
            goto L_0x00a3
        L_0x0053:
            kotlin.ResultKt.throwOnFailure(r9)
            android.graphics.drawable.Drawable r9 = r8.f329059a
            boolean r2 = r9 instanceof android.graphics.drawable.BitmapDrawable
            r3 = 0
            if (r2 == 0) goto L_0x0060
            android.graphics.drawable.BitmapDrawable r9 = (android.graphics.drawable.BitmapDrawable) r9
            goto L_0x0061
        L_0x0060:
            r9 = r3
        L_0x0061:
            if (r9 != 0) goto L_0x0065
            r9 = r3
            goto L_0x0069
        L_0x0065:
            android.graphics.Bitmap r9 = r9.getBitmap()
        L_0x0069:
            e5.c r2 = r7.f327771b
            boolean r3 = r2 instanceof p1106e5.C107232e
            if (r3 == 0) goto L_0x00a9
            q5.a<?> r9 = r7.f327770a
            d5.c r2 = r7.f327772c
            o5.h r3 = r8.f329060b
            s5.c r4 = r3.f329008q
            s5.b r5 = p1152s5.C110739b.f331206b
            if (r4 != r5) goto L_0x0082
            android.graphics.drawable.Drawable r8 = r8.f329059a
            r9.mo792b(r8)
            goto L_0x00f2
        L_0x0082:
            boolean r5 = r9 instanceof p1152s5.C110741d
            if (r5 != 0) goto L_0x0090
            o5.d r0 = r3.f328990G
            s5.c r0 = r0.f328971e
            android.graphics.drawable.Drawable r8 = r8.f329059a
            r9.mo792b(r8)
            goto L_0x00f2
        L_0x0090:
            r2.mo157433g(r3)
            s5.d r9 = (p1152s5.C110741d) r9
            r0.f327779d = r8
            r0.f327780e = r2
            r3 = 1
            r0.f327785j = r3
            java.lang.Object r9 = r4.mo162258a(r9, r8, r0)
            if (r9 != r1) goto L_0x00a3
            return r1
        L_0x00a3:
            o5.h r8 = r8.f329060b
            r2.mo157435i(r8)
            goto L_0x00f2
        L_0x00a9:
            if (r9 != 0) goto L_0x00ac
            goto L_0x00af
        L_0x00ac:
            r2.mo157703c(r9)
        L_0x00af:
            q5.a<?> r2 = r7.f327770a
            d5.c r3 = r7.f327772c
            o5.h r4 = r8.f329060b
            s5.c r5 = r4.f329008q
            s5.b r6 = p1152s5.C110739b.f331206b
            if (r5 != r6) goto L_0x00c1
            android.graphics.drawable.Drawable r8 = r8.f329059a
            r2.mo792b(r8)
            goto L_0x00ce
        L_0x00c1:
            boolean r6 = r2 instanceof p1152s5.C110741d
            if (r6 != 0) goto L_0x00d0
            o5.d r0 = r4.f328990G
            s5.c r0 = r0.f328971e
            android.graphics.drawable.Drawable r8 = r8.f329059a
            r2.mo792b(r8)
        L_0x00ce:
            r2 = r7
            goto L_0x00ef
        L_0x00d0:
            r3.mo157433g(r4)
            s5.d r2 = (p1152s5.C110741d) r2
            r0.f327779d = r8
            r0.f327780e = r7
            r0.f327781f = r9
            r0.f327782g = r3
            r4 = 2
            r0.f327785j = r4
            java.lang.Object r0 = r5.mo162258a(r2, r8, r0)
            if (r0 != r1) goto L_0x00e7
            return r1
        L_0x00e7:
            r2 = r7
            r1 = r9
        L_0x00e9:
            o5.h r8 = r8.f329060b
            r3.mo157435i(r8)
            r9 = r1
        L_0x00ef:
            m148729f(r2, r9)
        L_0x00f2:
            rx3.b0 r8 = rx3.C13598b0.f38549a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p1132m5.C109515m.mo160739e(o5.m, wx3.d):java.lang.Object");
    }
}
