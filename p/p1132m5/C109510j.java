package p1132m5;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import gy3.C87412m;
import p1105d5.C106991c;
import p1106e5.C107230c;
import p1144q5.C110366b;
import p632o5.C109954f;
import p632o5.C109963m;
import p864t5.C110908h;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: m5.j */
public final class C109510j extends C109528s {

    /* renamed from: a */
    public final C110366b f327750a;

    /* renamed from: b */
    public final C107230c f327751b;

    /* renamed from: c */
    public final C106991c f327752c;

    @C91590f(mo125468c = "coil.memory.InvalidatableTargetDelegate", mo125469f = "TargetDelegate.kt", mo125470l = {225}, mo125471m = "error")
    /* renamed from: m5.j$a */
    public static final class C109511a extends C66704d {

        /* renamed from: d */
        public Object f327753d;

        /* renamed from: e */
        public Object f327754e;

        /* renamed from: f */
        public /* synthetic */ Object f327755f;

        /* renamed from: g */
        public final /* synthetic */ C109510j f327756g;

        /* renamed from: h */
        public int f327757h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109511a(C109510j jVar, C15601d<? super C109511a> dVar) {
            super(dVar);
            this.f327756g = jVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f327755f = obj;
            this.f327757h |= Integer.MIN_VALUE;
            return this.f327756g.mo160740b((C109954f) null, this);
        }
    }

    @C91590f(mo125468c = "coil.memory.InvalidatableTargetDelegate", mo125469f = "TargetDelegate.kt", mo125470l = {228}, mo125471m = "success")
    /* renamed from: m5.j$b */
    public static final class C109512b extends C66704d {

        /* renamed from: d */
        public Object f327758d;

        /* renamed from: e */
        public Object f327759e;

        /* renamed from: f */
        public /* synthetic */ Object f327760f;

        /* renamed from: g */
        public final /* synthetic */ C109510j f327761g;

        /* renamed from: h */
        public int f327762h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109512b(C109510j jVar, C15601d<? super C109512b> dVar) {
            super(dVar);
            this.f327761g = jVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f327760f = obj;
            this.f327762h |= Integer.MIN_VALUE;
            return this.f327761g.mo160739e((C109963m) null, this);
        }
    }

    public C109510j(C110366b bVar, C107230c cVar, C106991c cVar2, C110908h hVar) {
        C87412m.m108594g(bVar, "target");
        C87412m.m108594g(cVar, "referenceCounter");
        C87412m.m108594g(cVar2, "eventListener");
        this.f327750a = bVar;
        this.f327751b = cVar;
        this.f327752c = cVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo160740b(p632o5.C109954f r8, wx3.C15601d<? super rx3.C13598b0> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof p1132m5.C109510j.C109511a
            if (r0 == 0) goto L_0x0013
            r0 = r9
            m5.j$a r0 = (p1132m5.C109510j.C109511a) r0
            int r1 = r0.f327757h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f327757h = r1
            goto L_0x0018
        L_0x0013:
            m5.j$a r0 = new m5.j$a
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f327755f
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f327757h
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r8 = r0.f327754e
            d5.c r8 = (p1105d5.C106991c) r8
            java.lang.Object r0 = r0.f327753d
            o5.f r0 = (p632o5.C109954f) r0
            kotlin.ResultKt.throwOnFailure(r9)
            r2 = r8
            r8 = r0
            goto L_0x006e
        L_0x0031:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0039:
            kotlin.ResultKt.throwOnFailure(r9)
            q5.b r9 = r7.f327750a
            d5.c r2 = r7.f327752c
            o5.h r4 = r8.f328980b
            s5.c r5 = r4.f329008q
            s5.b r6 = p1152s5.C110739b.f331206b
            if (r5 != r6) goto L_0x004e
            android.graphics.drawable.Drawable r8 = r8.f328979a
            r9.mo794d(r8)
            goto L_0x0073
        L_0x004e:
            boolean r6 = r9 instanceof p1152s5.C110741d
            if (r6 != 0) goto L_0x005c
            o5.d r0 = r4.f328990G
            s5.c r0 = r0.f328971e
            android.graphics.drawable.Drawable r8 = r8.f328979a
            r9.mo794d(r8)
            goto L_0x0073
        L_0x005c:
            r2.mo157433g(r4)
            s5.d r9 = (p1152s5.C110741d) r9
            r0.f327753d = r8
            r0.f327754e = r2
            r0.f327757h = r3
            java.lang.Object r9 = r5.mo162258a(r9, r8, r0)
            if (r9 != r1) goto L_0x006e
            return r1
        L_0x006e:
            o5.h r8 = r8.f328980b
            r2.mo157435i(r8)
        L_0x0073:
            rx3.b0 r8 = rx3.C13598b0.f38549a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p1132m5.C109510j.mo160740b(o5.f, wx3.d):java.lang.Object");
    }

    /* renamed from: c */
    public C110366b mo160741c() {
        return this.f327750a;
    }

    /* renamed from: d */
    public void mo160742d(Drawable drawable, Bitmap bitmap) {
        C107230c cVar = this.f327751b;
        if (bitmap != null) {
            cVar.mo157701a(bitmap, false);
        }
        this.f327750a.mo793c(drawable);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo160739e(p632o5.C109963m r8, wx3.C15601d<? super rx3.C13598b0> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof p1132m5.C109510j.C109512b
            if (r0 == 0) goto L_0x0013
            r0 = r9
            m5.j$b r0 = (p1132m5.C109510j.C109512b) r0
            int r1 = r0.f327762h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f327762h = r1
            goto L_0x0018
        L_0x0013:
            m5.j$b r0 = new m5.j$b
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f327760f
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f327762h
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r8 = r0.f327759e
            d5.c r8 = (p1105d5.C106991c) r8
            java.lang.Object r0 = r0.f327758d
            o5.m r0 = (p632o5.C109963m) r0
            kotlin.ResultKt.throwOnFailure(r9)
            r2 = r8
            r8 = r0
            goto L_0x008a
        L_0x0031:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0039:
            kotlin.ResultKt.throwOnFailure(r9)
            e5.c r9 = r7.f327751b
            android.graphics.drawable.Drawable r2 = r8.mo161275a()
            boolean r4 = r2 instanceof android.graphics.drawable.BitmapDrawable
            r5 = 0
            if (r4 == 0) goto L_0x004a
            android.graphics.drawable.BitmapDrawable r2 = (android.graphics.drawable.BitmapDrawable) r2
            goto L_0x004b
        L_0x004a:
            r2 = r5
        L_0x004b:
            if (r2 != 0) goto L_0x004e
            goto L_0x0052
        L_0x004e:
            android.graphics.Bitmap r5 = r2.getBitmap()
        L_0x0052:
            if (r5 == 0) goto L_0x0058
            r2 = 0
            r9.mo157701a(r5, r2)
        L_0x0058:
            q5.b r9 = r7.f327750a
            d5.c r2 = r7.f327752c
            o5.h r4 = r8.f329060b
            s5.c r5 = r4.f329008q
            s5.b r6 = p1152s5.C110739b.f331206b
            if (r5 != r6) goto L_0x006a
            android.graphics.drawable.Drawable r8 = r8.f329059a
            r9.mo792b(r8)
            goto L_0x008f
        L_0x006a:
            boolean r6 = r9 instanceof p1152s5.C110741d
            if (r6 != 0) goto L_0x0078
            o5.d r0 = r4.f328990G
            s5.c r0 = r0.f328971e
            android.graphics.drawable.Drawable r8 = r8.f329059a
            r9.mo792b(r8)
            goto L_0x008f
        L_0x0078:
            r2.mo157433g(r4)
            s5.d r9 = (p1152s5.C110741d) r9
            r0.f327758d = r8
            r0.f327759e = r2
            r0.f327762h = r3
            java.lang.Object r9 = r5.mo162258a(r9, r8, r0)
            if (r9 != r1) goto L_0x008a
            return r1
        L_0x008a:
            o5.h r8 = r8.f329060b
            r2.mo157435i(r8)
        L_0x008f:
            rx3.b0 r8 = rx3.C13598b0.f38549a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p1132m5.C109510j.mo160739e(o5.m, wx3.d):java.lang.Object");
    }
}
