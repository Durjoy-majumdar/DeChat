package p247u3;

import java.util.List;
import k14.C60949f;
import k14.C99088c;
import sx3.C64186f0;
import sx3.C64188i0;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: u3.t */
public final class C65167t<T> {

    /* renamed from: a */
    public final C65172u<T> f187599a = new C65172u<>();

    /* renamed from: b */
    public List<C65041c2<T>> f187600b = C64186f0.f181907d;

    /* renamed from: c */
    public final C99088c f187601c = C60949f.m71437a(false, 1, (Object) null);

    @C91590f(mo125468c = "androidx.paging.FlattenedPageController", mo125469f = "CachedPageEventFlow.kt", mo125470l = {310, 188}, mo125471m = "createTemporaryDownstream")
    /* renamed from: u3.t$a */
    public static final class C65168a extends C66704d {

        /* renamed from: d */
        public /* synthetic */ Object f187602d;

        /* renamed from: e */
        public int f187603e;

        /* renamed from: f */
        public final /* synthetic */ C65167t f187604f;

        /* renamed from: g */
        public Object f187605g;

        /* renamed from: h */
        public Object f187606h;

        /* renamed from: i */
        public Object f187607i;

        /* renamed from: j */
        public Object f187608j;

        /* renamed from: n */
        public int f187609n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65168a(C65167t tVar, C15601d dVar) {
            super(dVar);
            this.f187604f = tVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f187602d = obj;
            this.f187603e |= Integer.MIN_VALUE;
            return this.f187604f.mo89323a(this);
        }
    }

    @C91590f(mo125468c = "androidx.paging.FlattenedPageController", mo125469f = "CachedPageEventFlow.kt", mo125470l = {297, 174}, mo125471m = "record")
    /* renamed from: u3.t$b */
    public static final class C65169b extends C66704d {

        /* renamed from: d */
        public /* synthetic */ Object f187610d;

        /* renamed from: e */
        public int f187611e;

        /* renamed from: f */
        public final /* synthetic */ C65167t f187612f;

        /* renamed from: g */
        public Object f187613g;

        /* renamed from: h */
        public Object f187614h;

        /* renamed from: i */
        public Object f187615i;

        /* renamed from: j */
        public Object f187616j;

        /* renamed from: n */
        public Object f187617n;

        /* renamed from: o */
        public Object f187618o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65169b(C65167t tVar, C15601d dVar) {
            super(dVar);
            this.f187612f = tVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f187610d = obj;
            this.f187611e |= Integer.MIN_VALUE;
            return this.f187612f.mo89324b((C64188i0) null, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0086 A[Catch:{ all -> 0x003e }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo89323a(wx3.C15601d<? super p247u3.C65041c2<T>> r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof p247u3.C65167t.C65168a
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == 0) goto L_0x0013
            r0 = r13
            u3.t$a r0 = (p247u3.C65167t.C65168a) r0
            int r2 = r0.f187603e
            r3 = r2 & r1
            if (r3 == 0) goto L_0x0013
            int r2 = r2 - r1
            r0.f187603e = r2
            goto L_0x0018
        L_0x0013:
            u3.t$a r0 = new u3.t$a
            r0.<init>(r12, r13)
        L_0x0018:
            java.lang.Object r13 = r0.f187602d
            xx3.a r2 = xx3.C15911a.COROUTINE_SUSPENDED
            int r3 = r0.f187603e
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L_0x0056
            if (r3 == r5) goto L_0x0049
            if (r3 != r4) goto L_0x0041
            int r3 = r0.f187609n
            java.lang.Object r5 = r0.f187608j
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r7 = r0.f187607i
            u3.c2 r7 = (p247u3.C65041c2) r7
            java.lang.Object r8 = r0.f187606h
            u3.c2 r8 = (p247u3.C65041c2) r8
            java.lang.Object r9 = r0.f187605g
            k14.c r9 = (k14.C99088c) r9
            kotlin.ResultKt.throwOnFailure(r13)     // Catch:{ all -> 0x003e }
            r13 = r3
            goto L_0x0080
        L_0x003e:
            r13 = move-exception
            goto L_0x00bc
        L_0x0041:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x0049:
            java.lang.Object r3 = r0.f187606h
            k14.c r3 = (k14.C99088c) r3
            java.lang.Object r5 = r0.f187605g
            u3.t r5 = (p247u3.C65167t) r5
            kotlin.ResultKt.throwOnFailure(r13)
            r9 = r3
            goto L_0x006c
        L_0x0056:
            kotlin.ResultKt.throwOnFailure(r13)
            k14.c r13 = r12.f187601c
            r0.f187605g = r12
            r0.f187606h = r13
            r0.f187603e = r5
            k14.d r13 = (k14.C60942d) r13
            java.lang.Object r3 = r13.mo85908b(r6, r0)
            if (r3 != r2) goto L_0x006a
            return r2
        L_0x006a:
            r5 = r12
            r9 = r13
        L_0x006c:
            u3.c2 r13 = new u3.c2     // Catch:{ all -> 0x003e }
            r13.<init>()     // Catch:{ all -> 0x003e }
            u3.u<T> r3 = r5.f187599a     // Catch:{ all -> 0x003e }
            java.util.List r3 = r3.mo89328b()     // Catch:{ all -> 0x003e }
            r5 = 0
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x003e }
            r7 = r13
            r8 = r7
            r5 = r3
            r13 = 0
        L_0x0080:
            boolean r3 = r5.hasNext()     // Catch:{ all -> 0x003e }
            if (r3 == 0) goto L_0x00b8
            java.lang.Object r3 = r5.next()     // Catch:{ all -> 0x003e }
            int r10 = r13 + 1
            if (r13 < 0) goto L_0x00b4
            java.lang.Integer r11 = new java.lang.Integer     // Catch:{ all -> 0x003e }
            r11.<init>(r13)     // Catch:{ all -> 0x003e }
            u3.n0 r3 = (p247u3.C65086n0) r3     // Catch:{ all -> 0x003e }
            int r13 = r11.intValue()     // Catch:{ all -> 0x003e }
            sx3.i0 r11 = new sx3.i0     // Catch:{ all -> 0x003e }
            int r13 = r13 + r1
            r11.<init>(r13, r3)     // Catch:{ all -> 0x003e }
            r0.f187605g = r9     // Catch:{ all -> 0x003e }
            r0.f187606h = r8     // Catch:{ all -> 0x003e }
            r0.f187607i = r7     // Catch:{ all -> 0x003e }
            r0.f187608j = r5     // Catch:{ all -> 0x003e }
            r0.f187609n = r10     // Catch:{ all -> 0x003e }
            r0.f187603e = r4     // Catch:{ all -> 0x003e }
            java.lang.Object r13 = r7.mo89242a(r11, r0)     // Catch:{ all -> 0x003e }
            if (r13 != r2) goto L_0x00b2
            return r2
        L_0x00b2:
            r13 = r10
            goto L_0x0080
        L_0x00b4:
            sx3.C64197v.m75542k()     // Catch:{ all -> 0x003e }
            throw r6     // Catch:{ all -> 0x003e }
        L_0x00b8:
            r9.mo85909c(r6)
            return r8
        L_0x00bc:
            r9.mo85909c(r6)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p247u3.C65167t.mo89323a(wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0095 A[Catch:{ all -> 0x0042 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c1 A[Catch:{ all -> 0x0042 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c5 A[Catch:{ all -> 0x0042 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo89324b(sx3.C64188i0<? extends p247u3.C65086n0<T>> r10, wx3.C15601d<? super rx3.C13598b0> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof p247u3.C65167t.C65169b
            if (r0 == 0) goto L_0x0013
            r0 = r11
            u3.t$b r0 = (p247u3.C65167t.C65169b) r0
            int r1 = r0.f187611e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f187611e = r1
            goto L_0x0018
        L_0x0013:
            u3.t$b r0 = new u3.t$b
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.f187610d
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f187611e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x005f
            if (r2 == r4) goto L_0x004d
            if (r2 != r3) goto L_0x0045
            java.lang.Object r10 = r0.f187618o
            java.lang.Object r2 = r0.f187617n
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r4 = r0.f187616j
            java.util.Collection r4 = (java.util.Collection) r4
            java.lang.Object r6 = r0.f187615i
            u3.t r6 = (p247u3.C65167t) r6
            java.lang.Object r7 = r0.f187614h
            k14.c r7 = (k14.C99088c) r7
            java.lang.Object r8 = r0.f187613g
            sx3.i0 r8 = (sx3.C64188i0) r8
            kotlin.ResultKt.throwOnFailure(r11)     // Catch:{ all -> 0x0042 }
            goto L_0x00b1
        L_0x0042:
            r10 = move-exception
            goto L_0x00d1
        L_0x0045:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x004d:
            java.lang.Object r10 = r0.f187615i
            k14.c r10 = (k14.C99088c) r10
            java.lang.Object r2 = r0.f187614h
            sx3.i0 r2 = (sx3.C64188i0) r2
            java.lang.Object r4 = r0.f187613g
            u3.t r4 = (p247u3.C65167t) r4
            kotlin.ResultKt.throwOnFailure(r11)
            r7 = r10
            r10 = r2
            goto L_0x0077
        L_0x005f:
            kotlin.ResultKt.throwOnFailure(r11)
            k14.c r11 = r9.f187601c
            r0.f187613g = r9
            r0.f187614h = r10
            r0.f187615i = r11
            r0.f187611e = r4
            k14.d r11 = (k14.C60942d) r11
            java.lang.Object r2 = r11.mo85908b(r5, r0)
            if (r2 != r1) goto L_0x0075
            return r1
        L_0x0075:
            r4 = r9
            r7 = r11
        L_0x0077:
            u3.u<T> r11 = r4.f187599a     // Catch:{ all -> 0x0042 }
            T r2 = r10.f181910b     // Catch:{ all -> 0x0042 }
            u3.n0 r2 = (p247u3.C65086n0) r2     // Catch:{ all -> 0x0042 }
            r11.mo89327a(r2)     // Catch:{ all -> 0x0042 }
            java.util.List<u3.c2<T>> r11 = r4.f187600b     // Catch:{ all -> 0x0042 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0042 }
            r2.<init>()     // Catch:{ all -> 0x0042 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x0042 }
            r8 = r10
            r6 = r4
            r4 = r2
            r2 = r11
        L_0x008f:
            boolean r10 = r2.hasNext()     // Catch:{ all -> 0x0042 }
            if (r10 == 0) goto L_0x00c5
            java.lang.Object r10 = r2.next()     // Catch:{ all -> 0x0042 }
            r11 = r10
            u3.c2 r11 = (p247u3.C65041c2) r11     // Catch:{ all -> 0x0042 }
            r0.f187613g = r8     // Catch:{ all -> 0x0042 }
            r0.f187614h = r7     // Catch:{ all -> 0x0042 }
            r0.f187615i = r6     // Catch:{ all -> 0x0042 }
            r0.f187616j = r4     // Catch:{ all -> 0x0042 }
            r0.f187617n = r2     // Catch:{ all -> 0x0042 }
            r0.f187618o = r10     // Catch:{ all -> 0x0042 }
            r0.f187611e = r3     // Catch:{ all -> 0x0042 }
            java.lang.Object r11 = r11.mo89242a(r8, r0)     // Catch:{ all -> 0x0042 }
            if (r11 != r1) goto L_0x00b1
            return r1
        L_0x00b1:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch:{ all -> 0x0042 }
            boolean r11 = r11.booleanValue()     // Catch:{ all -> 0x0042 }
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)     // Catch:{ all -> 0x0042 }
            boolean r11 = r11.booleanValue()     // Catch:{ all -> 0x0042 }
            if (r11 == 0) goto L_0x008f
            r4.add(r10)     // Catch:{ all -> 0x0042 }
            goto L_0x008f
        L_0x00c5:
            java.util.List r4 = (java.util.List) r4     // Catch:{ all -> 0x0042 }
            r6.f187600b = r4     // Catch:{ all -> 0x0042 }
            rx3.b0 r10 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0042 }
            r7.mo85909c(r5)
            rx3.b0 r10 = rx3.C13598b0.f38549a
            return r10
        L_0x00d1:
            r7.mo85909c(r5)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p247u3.C65167t.mo89324b(sx3.i0, wx3.d):java.lang.Object");
    }
}
