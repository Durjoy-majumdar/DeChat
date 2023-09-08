package p247u3;

import a14.C0000n0;
import a14.C53973z1;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import java.util.concurrent.CancellationException;
import k14.C60949f;
import k14.C99088c;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: u3.y1 */
public final class C65199y1 {

    /* renamed from: a */
    public final C65201b f187699a;

    /* renamed from: u3.y1$a */
    public static final class C65200a extends CancellationException {

        /* renamed from: d */
        public final C65199y1 f187700d;

        public C65200a(C65199y1 y1Var) {
            C87412m.m108594g(y1Var, "runner");
            this.f187700d = y1Var;
        }
    }

    /* renamed from: u3.y1$b */
    public static final class C65201b {

        /* renamed from: a */
        public final C99088c f187701a = C60949f.m71437a(false, 1, (Object) null);

        /* renamed from: b */
        public C53973z1 f187702b;

        /* renamed from: c */
        public int f187703c;

        /* renamed from: d */
        public final C65199y1 f187704d;

        /* renamed from: e */
        public final boolean f187705e;

        @C91590f(mo125468c = "androidx.paging.SingleRunner$Holder", mo125469f = "SingleRunner.kt", mo125470l = {140}, mo125471m = "onFinish")
        /* renamed from: u3.y1$b$a */
        public static final class C65202a extends C66704d {

            /* renamed from: d */
            public /* synthetic */ Object f187706d;

            /* renamed from: e */
            public int f187707e;

            /* renamed from: f */
            public final /* synthetic */ C65201b f187708f;

            /* renamed from: g */
            public Object f187709g;

            /* renamed from: h */
            public Object f187710h;

            /* renamed from: i */
            public Object f187711i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C65202a(C65201b bVar, C15601d dVar) {
                super(dVar);
                this.f187708f = bVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f187706d = obj;
                this.f187707e |= Integer.MIN_VALUE;
                return this.f187708f.mo89339a((C53973z1) null, this);
            }
        }

        @C91590f(mo125468c = "androidx.paging.SingleRunner$Holder", mo125469f = "SingleRunner.kt", mo125470l = {129, 100}, mo125471m = "tryEnqueue")
        /* renamed from: u3.y1$b$b */
        public static final class C65203b extends C66704d {

            /* renamed from: d */
            public /* synthetic */ Object f187712d;

            /* renamed from: e */
            public int f187713e;

            /* renamed from: f */
            public final /* synthetic */ C65201b f187714f;

            /* renamed from: g */
            public Object f187715g;

            /* renamed from: h */
            public Object f187716h;

            /* renamed from: i */
            public Object f187717i;

            /* renamed from: j */
            public int f187718j;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C65203b(C65201b bVar, C15601d dVar) {
                super(dVar);
                this.f187714f = bVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f187712d = obj;
                this.f187713e |= Integer.MIN_VALUE;
                return this.f187714f.mo89340b(0, (C53973z1) null, this);
            }
        }

        public C65201b(C65199y1 y1Var, boolean z) {
            C87412m.m108594g(y1Var, "singleRunner");
            this.f187704d = y1Var;
            this.f187705e = z;
        }

        /* JADX INFO: finally extract failed */
        /* JADX WARNING: type inference failed for: r6v7, types: [k14.c] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0059 A[Catch:{ all -> 0x0063 }] */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object mo89339a(a14.C53973z1 r6, wx3.C15601d<? super rx3.C13598b0> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof p247u3.C65199y1.C65201b.C65202a
                if (r0 == 0) goto L_0x0013
                r0 = r7
                u3.y1$b$a r0 = (p247u3.C65199y1.C65201b.C65202a) r0
                int r1 = r0.f187707e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f187707e = r1
                goto L_0x0018
            L_0x0013:
                u3.y1$b$a r0 = new u3.y1$b$a
                r0.<init>(r5, r7)
            L_0x0018:
                java.lang.Object r7 = r0.f187706d
                xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
                int r2 = r0.f187707e
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L_0x003e
                if (r2 != r3) goto L_0x0036
                java.lang.Object r6 = r0.f187711i
                k14.c r6 = (k14.C99088c) r6
                java.lang.Object r1 = r0.f187710h
                a14.z1 r1 = (a14.C53973z1) r1
                java.lang.Object r0 = r0.f187709g
                u3.y1$b r0 = (p247u3.C65199y1.C65201b) r0
                kotlin.ResultKt.throwOnFailure(r7)
                r7 = r6
                r6 = r1
                goto L_0x0055
            L_0x0036:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L_0x003e:
                kotlin.ResultKt.throwOnFailure(r7)
                k14.c r7 = r5.f187701a
                r0.f187709g = r5
                r0.f187710h = r6
                r0.f187711i = r7
                r0.f187707e = r3
                k14.d r7 = (k14.C60942d) r7
                java.lang.Object r0 = r7.mo85908b(r4, r0)
                if (r0 != r1) goto L_0x0054
                return r1
            L_0x0054:
                r0 = r5
            L_0x0055:
                a14.z1 r1 = r0.f187702b     // Catch:{ all -> 0x0063 }
                if (r6 != r1) goto L_0x005b
                r0.f187702b = r4     // Catch:{ all -> 0x0063 }
            L_0x005b:
                rx3.b0 r6 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0063 }
                r7.mo85909c(r4)
                rx3.b0 r6 = rx3.C13598b0.f38549a
                return r6
            L_0x0063:
                r6 = move-exception
                r7.mo85909c(r4)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p247u3.C65199y1.C65201b.mo89339a(a14.z1, wx3.d):java.lang.Object");
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0057  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0086 A[Catch:{ all -> 0x003a }] */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x0087 A[Catch:{ all -> 0x003a }] */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object mo89340b(int r10, a14.C53973z1 r11, wx3.C15601d<? super java.lang.Boolean> r12) {
            /*
                r9 = this;
                boolean r0 = r12 instanceof p247u3.C65199y1.C65201b.C65203b
                if (r0 == 0) goto L_0x0013
                r0 = r12
                u3.y1$b$b r0 = (p247u3.C65199y1.C65201b.C65203b) r0
                int r1 = r0.f187713e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f187713e = r1
                goto L_0x0018
            L_0x0013:
                u3.y1$b$b r0 = new u3.y1$b$b
                r0.<init>(r9, r12)
            L_0x0018:
                java.lang.Object r12 = r0.f187712d
                xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
                int r2 = r0.f187713e
                r3 = 2
                r4 = 0
                r5 = 1
                if (r2 == 0) goto L_0x0057
                if (r2 == r5) goto L_0x0045
                if (r2 != r3) goto L_0x003d
                int r10 = r0.f187718j
                java.lang.Object r11 = r0.f187717i
                k14.c r11 = (k14.C99088c) r11
                java.lang.Object r1 = r0.f187716h
                a14.z1 r1 = (a14.C53973z1) r1
                java.lang.Object r0 = r0.f187715g
                u3.y1$b r0 = (p247u3.C65199y1.C65201b) r0
                kotlin.ResultKt.throwOnFailure(r12)     // Catch:{ all -> 0x003a }
                goto L_0x00aa
            L_0x003a:
                r10 = move-exception
                goto L_0x00b8
            L_0x003d:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r11)
                throw r10
            L_0x0045:
                int r10 = r0.f187718j
                java.lang.Object r11 = r0.f187717i
                k14.c r11 = (k14.C99088c) r11
                java.lang.Object r2 = r0.f187716h
                a14.z1 r2 = (a14.C53973z1) r2
                java.lang.Object r6 = r0.f187715g
                u3.y1$b r6 = (p247u3.C65199y1.C65201b) r6
                kotlin.ResultKt.throwOnFailure(r12)
                goto L_0x0072
            L_0x0057:
                kotlin.ResultKt.throwOnFailure(r12)
                k14.c r12 = r9.f187701a
                r0.f187715g = r9
                r0.f187716h = r11
                r0.f187717i = r12
                r0.f187718j = r10
                r0.f187713e = r5
                k14.d r12 = (k14.C60942d) r12
                java.lang.Object r2 = r12.mo85908b(r4, r0)
                if (r2 != r1) goto L_0x006f
                return r1
            L_0x006f:
                r6 = r9
                r2 = r11
                r11 = r12
            L_0x0072:
                a14.z1 r12 = r6.f187702b     // Catch:{ all -> 0x003a }
                if (r12 == 0) goto L_0x0089
                boolean r7 = r12.mo74466a()     // Catch:{ all -> 0x003a }
                if (r7 == 0) goto L_0x0089
                int r7 = r6.f187703c     // Catch:{ all -> 0x003a }
                if (r7 < r10) goto L_0x0089
                if (r7 != r10) goto L_0x0087
                boolean r7 = r6.f187705e     // Catch:{ all -> 0x003a }
                if (r7 == 0) goto L_0x0087
                goto L_0x0089
            L_0x0087:
                r5 = 0
                goto L_0x00b0
            L_0x0089:
                if (r12 == 0) goto L_0x0095
                u3.y1$a r7 = new u3.y1$a     // Catch:{ all -> 0x003a }
                u3.y1 r8 = r6.f187704d     // Catch:{ all -> 0x003a }
                r7.<init>(r8)     // Catch:{ all -> 0x003a }
                r12.mo74528b(r7)     // Catch:{ all -> 0x003a }
            L_0x0095:
                if (r12 == 0) goto L_0x00ac
                r0.f187715g = r6     // Catch:{ all -> 0x003a }
                r0.f187716h = r2     // Catch:{ all -> 0x003a }
                r0.f187717i = r11     // Catch:{ all -> 0x003a }
                r0.f187718j = r10     // Catch:{ all -> 0x003a }
                r0.f187713e = r3     // Catch:{ all -> 0x003a }
                java.lang.Object r12 = r12.mo74521O(r0)     // Catch:{ all -> 0x003a }
                if (r12 != r1) goto L_0x00a8
                return r1
            L_0x00a8:
                r1 = r2
                r0 = r6
            L_0x00aa:
                r6 = r0
                r2 = r1
            L_0x00ac:
                r6.f187702b = r2     // Catch:{ all -> 0x003a }
                r6.f187703c = r10     // Catch:{ all -> 0x003a }
            L_0x00b0:
                java.lang.Boolean r10 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x003a }
                r11.mo85909c(r4)
                return r10
            L_0x00b8:
                r11.mo85909c(r4)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: p247u3.C65199y1.C65201b.mo89340b(int, a14.z1, wx3.d):java.lang.Object");
        }
    }

    @C91590f(mo125468c = "androidx.paging.SingleRunner", mo125469f = "SingleRunner.kt", mo125470l = {49}, mo125471m = "runInIsolation")
    /* renamed from: u3.y1$c */
    public static final class C65204c extends C66704d {

        /* renamed from: d */
        public /* synthetic */ Object f187719d;

        /* renamed from: e */
        public int f187720e;

        /* renamed from: f */
        public final /* synthetic */ C65199y1 f187721f;

        /* renamed from: g */
        public Object f187722g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65204c(C65199y1 y1Var, C15601d dVar) {
            super(dVar);
            this.f187721f = y1Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f187719d = obj;
            this.f187720e |= Integer.MIN_VALUE;
            return this.f187721f.mo89338a(0, (C32226l<? super C15601d<? super C13598b0>, ? extends Object>) null, this);
        }
    }

    @C91590f(mo125468c = "androidx.paging.SingleRunner$runInIsolation$2", mo125469f = "SingleRunner.kt", mo125470l = {55, 59, 61, 61}, mo125471m = "invokeSuspend")
    /* renamed from: u3.y1$d */
    public static final class C65205d extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public /* synthetic */ Object f187723d;

        /* renamed from: e */
        public int f187724e;

        /* renamed from: f */
        public final /* synthetic */ C65199y1 f187725f;

        /* renamed from: g */
        public final /* synthetic */ int f187726g;

        /* renamed from: h */
        public final /* synthetic */ C32226l f187727h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65205d(C65199y1 y1Var, int i, C32226l lVar, C15601d dVar) {
            super(2, dVar);
            this.f187725f = y1Var;
            this.f187726g = i;
            this.f187727h = lVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C87412m.m108594g(dVar, "completion");
            C65205d dVar2 = new C65205d(this.f187725f, this.f187726g, this.f187727h, dVar);
            dVar2.f187723d = obj;
            return dVar2;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C65205d) create(obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:29:0x0089 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                int r1 = r8.f187724e
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L_0x003a
                if (r1 == r5) goto L_0x0032
                if (r1 == r4) goto L_0x0028
                if (r1 == r3) goto L_0x0023
                if (r1 == r2) goto L_0x001a
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L_0x001a:
                java.lang.Object r0 = r8.f187723d
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                kotlin.ResultKt.throwOnFailure(r9)
                goto L_0x009a
            L_0x0023:
                kotlin.ResultKt.throwOnFailure(r9)
                goto L_0x009b
            L_0x0028:
                java.lang.Object r1 = r8.f187723d
                a14.z1 r1 = (a14.C53973z1) r1
                kotlin.ResultKt.throwOnFailure(r9)     // Catch:{ all -> 0x0030 }
                goto L_0x007a
            L_0x0030:
                r9 = move-exception
                goto L_0x008a
            L_0x0032:
                java.lang.Object r1 = r8.f187723d
                a14.z1 r1 = (a14.C53973z1) r1
                kotlin.ResultKt.throwOnFailure(r9)
                goto L_0x0065
            L_0x003a:
                kotlin.ResultKt.throwOnFailure(r9)
                java.lang.Object r9 = r8.f187723d
                a14.n0 r9 = (a14.C0000n0) r9
                wx3.f r9 = r9.getCoroutineContext()
                int r1 = a14.C53973z1.f151221b0
                a14.z1$b r1 = a14.C53973z1.C0004b.f3d
                wx3.f$b r9 = r9.get(r1)
                if (r9 == 0) goto L_0x009e
                a14.z1 r9 = (a14.C53973z1) r9
                u3.y1 r1 = r8.f187725f
                u3.y1$b r1 = r1.f187699a
                int r6 = r8.f187726g
                r8.f187723d = r9
                r8.f187724e = r5
                java.lang.Object r1 = r1.mo89340b(r6, r9, r8)
                if (r1 != r0) goto L_0x0062
                return r0
            L_0x0062:
                r7 = r1
                r1 = r9
                r9 = r7
            L_0x0065:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 == 0) goto L_0x009b
                fy3.l r9 = r8.f187727h     // Catch:{ all -> 0x0030 }
                r8.f187723d = r1     // Catch:{ all -> 0x0030 }
                r8.f187724e = r4     // Catch:{ all -> 0x0030 }
                java.lang.Object r9 = r9.invoke(r8)     // Catch:{ all -> 0x0030 }
                if (r9 != r0) goto L_0x007a
                return r0
            L_0x007a:
                u3.y1 r9 = r8.f187725f
                u3.y1$b r9 = r9.f187699a
                r2 = 0
                r8.f187723d = r2
                r8.f187724e = r3
                java.lang.Object r9 = r9.mo89339a(r1, r8)
                if (r9 != r0) goto L_0x009b
                return r0
            L_0x008a:
                u3.y1 r3 = r8.f187725f
                u3.y1$b r3 = r3.f187699a
                r8.f187723d = r9
                r8.f187724e = r2
                java.lang.Object r1 = r3.mo89339a(r1, r8)
                if (r1 != r0) goto L_0x0099
                return r0
            L_0x0099:
                r0 = r9
            L_0x009a:
                throw r0
            L_0x009b:
                rx3.b0 r9 = rx3.C13598b0.f38549a
                return r9
            L_0x009e:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "Internal error. coroutineScope should've created a job."
                java.lang.String r0 = r0.toString()
                r9.<init>(r0)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: p247u3.C65199y1.C65205d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C65199y1() {
        this(false, 1, (C8480h) null);
    }

    public C65199y1(boolean z) {
        this.f187699a = new C65201b(this, z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo89338a(int r5, fy3.C32226l<? super wx3.C15601d<? super rx3.C13598b0>, ? extends java.lang.Object> r6, wx3.C15601d<? super rx3.C13598b0> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof p247u3.C65199y1.C65204c
            if (r0 == 0) goto L_0x0013
            r0 = r7
            u3.y1$c r0 = (p247u3.C65199y1.C65204c) r0
            int r1 = r0.f187720e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f187720e = r1
            goto L_0x0018
        L_0x0013:
            u3.y1$c r0 = new u3.y1$c
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f187719d
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f187720e
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r5 = r0.f187722g
            u3.y1 r5 = (p247u3.C65199y1) r5
            kotlin.ResultKt.throwOnFailure(r7)     // Catch:{ a -> 0x002b }
            goto L_0x004f
        L_0x002b:
            r6 = move-exception
            goto L_0x004b
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0035:
            kotlin.ResultKt.throwOnFailure(r7)
            u3.y1$d r7 = new u3.y1$d     // Catch:{ a -> 0x0049 }
            r2 = 0
            r7.<init>(r4, r5, r6, r2)     // Catch:{ a -> 0x0049 }
            r0.f187722g = r4     // Catch:{ a -> 0x0049 }
            r0.f187720e = r3     // Catch:{ a -> 0x0049 }
            java.lang.Object r5 = a14.C53930o0.m60559f(r7, r0)     // Catch:{ a -> 0x0049 }
            if (r5 != r1) goto L_0x004f
            return r1
        L_0x0049:
            r6 = move-exception
            r5 = r4
        L_0x004b:
            u3.y1 r7 = r6.f187700d
            if (r7 != r5) goto L_0x0052
        L_0x004f:
            rx3.b0 r5 = rx3.C13598b0.f38549a
            return r5
        L_0x0052:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p247u3.C65199y1.mo89338a(int, fy3.l, wx3.d):java.lang.Object");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C65199y1(boolean z, int i, C8480h hVar) {
        this((i & 1) != 0 ? true : z);
    }
}
