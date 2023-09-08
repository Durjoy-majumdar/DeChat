package p865v3;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import a14.C53952u;
import a14.C53973z1;
import c14.C54612b0;
import d14.C45252f;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: v3.c */
public final class C65512c<T> {

    /* renamed from: a */
    public final C65512c<T>.a f188495a = new C65513a();

    /* renamed from: b */
    public final C0000n0 f188496b;

    /* renamed from: c */
    public final int f188497c;

    /* renamed from: d */
    public final boolean f188498d;

    /* renamed from: e */
    public final C32227p<T, C15601d<? super C13598b0>, Object> f188499e;

    /* renamed from: f */
    public final boolean f188500f;

    /* renamed from: g */
    public final C45252f<T> f188501g;

    /* renamed from: v3.c$a */
    public final class C65513a extends C65543k<C65520c<T>> {

        /* renamed from: e */
        public final C65510a<T> f188502e;

        /* renamed from: f */
        public C65537i<T> f188503f;

        /* renamed from: g */
        public boolean f188504g;

        /* renamed from: h */
        public C53952u<C13598b0> f188505h;

        /* renamed from: i */
        public final List<C65519b<T>> f188506i;

        @C91590f(mo125468c = "androidx.paging.multicast.ChannelManager$Actor", mo125469f = "ChannelManager.kt", mo125470l = {248}, mo125471m = "addEntry")
        /* renamed from: v3.c$a$a */
        public static final class C65514a extends C66704d {

            /* renamed from: d */
            public /* synthetic */ Object f188508d;

            /* renamed from: e */
            public int f188509e;

            /* renamed from: f */
            public final /* synthetic */ C65513a f188510f;

            /* renamed from: g */
            public Object f188511g;

            /* renamed from: h */
            public Object f188512h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C65514a(C65513a aVar, C15601d dVar) {
                super(dVar);
                this.f188510f = aVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f188508d = obj;
                this.f188509e |= Integer.MIN_VALUE;
                return this.f188510f.mo89627f((C65519b) null, this);
            }
        }

        @C91590f(mo125468c = "androidx.paging.multicast.ChannelManager$Actor", mo125469f = "ChannelManager.kt", mo125470l = {216}, mo125471m = "doAdd")
        /* renamed from: v3.c$a$b */
        public static final class C65515b extends C66704d {

            /* renamed from: d */
            public /* synthetic */ Object f188513d;

            /* renamed from: e */
            public int f188514e;

            /* renamed from: f */
            public final /* synthetic */ C65513a f188515f;

            /* renamed from: g */
            public Object f188516g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C65515b(C65513a aVar, C15601d dVar) {
                super(dVar);
                this.f188515f = aVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f188513d = obj;
                this.f188514e |= Integer.MIN_VALUE;
                return this.f188515f.mo89628g((C65520c.C65521a) null, this);
            }
        }

        @C91590f(mo125468c = "androidx.paging.multicast.ChannelManager$Actor", mo125469f = "ChannelManager.kt", mo125470l = {172, 181}, mo125471m = "doDispatchValue")
        /* renamed from: v3.c$a$c */
        public static final class C65516c extends C66704d {

            /* renamed from: d */
            public /* synthetic */ Object f188517d;

            /* renamed from: e */
            public int f188518e;

            /* renamed from: f */
            public final /* synthetic */ C65513a f188519f;

            /* renamed from: g */
            public Object f188520g;

            /* renamed from: h */
            public Object f188521h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C65516c(C65513a aVar, C15601d dVar) {
                super(dVar);
                this.f188519f = aVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f188517d = obj;
                this.f188518e |= Integer.MIN_VALUE;
                return this.f188519f.mo89629h((C65520c.C65522b.C65525c) null, this);
            }
        }

        @C91590f(mo125468c = "androidx.paging.multicast.ChannelManager$Actor", mo125469f = "ChannelManager.kt", mo125470l = {206}, mo125471m = "doRemove")
        /* renamed from: v3.c$a$d */
        public static final class C65517d extends C66704d {

            /* renamed from: d */
            public /* synthetic */ Object f188522d;

            /* renamed from: e */
            public int f188523e;

            /* renamed from: f */
            public final /* synthetic */ C65513a f188524f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C65517d(C65513a aVar, C15601d dVar) {
                super(dVar);
                this.f188524f = aVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f188522d = obj;
                this.f188523e |= Integer.MIN_VALUE;
                return this.f188524f.mo89630i((C54612b0) null, this);
            }
        }

        @C91590f(mo125468c = "androidx.paging.multicast.ChannelManager$Actor", mo125469f = "ChannelManager.kt", mo125470l = {103, 104, 105}, mo125471m = "handle")
        /* renamed from: v3.c$a$e */
        public static final class C65518e extends C66704d {

            /* renamed from: d */
            public /* synthetic */ Object f188525d;

            /* renamed from: e */
            public int f188526e;

            /* renamed from: f */
            public final /* synthetic */ C65513a f188527f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C65518e(C65513a aVar, C15601d dVar) {
                super(dVar);
                this.f188527f = aVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f188525d = obj;
                this.f188526e |= Integer.MIN_VALUE;
                return this.f188527f.mo89624c((C65520c) null, this);
            }
        }

        public C65513a() {
            super(C65512c.this.f188496b);
            int i = C65512c.this.f188497c;
            this.f188502e = i > 0 ? new C65511b<>(i) : new C65536h<>();
            this.f188506i = new ArrayList();
        }

        /* renamed from: d */
        public void mo89625d() {
            Iterator it = ((ArrayList) this.f188506i).iterator();
            while (it.hasNext()) {
                C54612b0.C54613a.m61404a(((C65519b) it.next()).f188528a, (Throwable) null, 1, (Object) null);
            }
            ((ArrayList) this.f188506i).clear();
            C65537i<T> iVar = this.f188503f;
            if (iVar != null) {
                C53973z1.C53974a.m60623a(iVar.f188562a, (CancellationException) null, 1, (Object) null);
            }
        }

        /* renamed from: e */
        public final void mo89626e() {
            if (this.f188503f == null) {
                C65512c cVar = C65512c.this;
                C65537i<T> iVar = new C65537i<>(cVar.f188496b, cVar.f188501g, new C65527d(this));
                this.f188503f = iVar;
                this.f188504g = false;
                C53895h.m60466d(iVar.f188563b, (C66212f) null, (C53934p0) null, new C65542j(iVar, (C15601d) null), 3, (Object) null);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x007d  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00a8  */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x00eb  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object mo89627f(p865v3.C65512c.C65519b<T> r7, wx3.C15601d<? super rx3.C13598b0> r8) {
            /*
                r6 = this;
                xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                boolean r1 = r8 instanceof p865v3.C65512c.C65513a.C65514a
                if (r1 == 0) goto L_0x0015
                r1 = r8
                v3.c$a$a r1 = (p865v3.C65512c.C65513a.C65514a) r1
                int r2 = r1.f188509e
                r3 = -2147483648(0xffffffff80000000, float:-0.0)
                r4 = r2 & r3
                if (r4 == 0) goto L_0x0015
                int r2 = r2 - r3
                r1.f188509e = r2
                goto L_0x001a
            L_0x0015:
                v3.c$a$a r1 = new v3.c$a$a
                r1.<init>(r6, r8)
            L_0x001a:
                java.lang.Object r8 = r1.f188508d
                int r2 = r1.f188509e
                r3 = 1
                if (r2 == 0) goto L_0x0038
                if (r2 != r3) goto L_0x0030
                java.lang.Object r7 = r1.f188512h
                java.util.Iterator r7 = (java.util.Iterator) r7
                java.lang.Object r2 = r1.f188511g
                v3.c$b r2 = (p865v3.C65512c.C65519b) r2
                kotlin.ResultKt.throwOnFailure(r8)
                goto L_0x00a2
            L_0x0030:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L_0x0038:
                kotlin.ResultKt.throwOnFailure(r8)
                java.util.List<v3.c$b<T>> r8 = r6.f188506i
                boolean r2 = r8 instanceof java.util.Collection
                r4 = 0
                if (r2 == 0) goto L_0x004c
                r2 = r8
                java.util.ArrayList r2 = (java.util.ArrayList) r2
                boolean r2 = r2.isEmpty()
                if (r2 == 0) goto L_0x004c
                goto L_0x007a
            L_0x004c:
                java.util.ArrayList r8 = (java.util.ArrayList) r8
                java.util.Iterator r8 = r8.iterator()
            L_0x0052:
                boolean r2 = r8.hasNext()
                if (r2 == 0) goto L_0x007a
                java.lang.Object r2 = r8.next()
                v3.c$b r2 = (p865v3.C65512c.C65519b) r2
                r2.getClass()
                java.lang.String r5 = "entry"
                gy3.C87412m.m108594g(r7, r5)
                c14.b0<v3.c$c$b$c<T>> r2 = r2.f188528a
                c14.b0<v3.c$c$b$c<T>> r5 = r7.f188528a
                if (r2 != r5) goto L_0x006e
                r2 = 1
                goto L_0x006f
            L_0x006e:
                r2 = 0
            L_0x006f:
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                boolean r2 = r2.booleanValue()
                if (r2 == 0) goto L_0x0052
                goto L_0x007b
            L_0x007a:
                r4 = 1
            L_0x007b:
                if (r4 == 0) goto L_0x00eb
                boolean r8 = r7.f188529b
                r8 = r8 ^ r3
                if (r8 == 0) goto L_0x00d0
                java.util.List<v3.c$b<T>> r8 = r6.f188506i
                java.util.ArrayList r8 = (java.util.ArrayList) r8
                r8.add(r7)
                v3.a<T> r8 = r6.f188502e
                java.util.Collection r8 = r8.getItems()
                boolean r8 = r8.isEmpty()
                r8 = r8 ^ r3
                if (r8 == 0) goto L_0x00c4
                v3.a<T> r8 = r6.f188502e
                java.util.Collection r8 = r8.getItems()
                java.util.Iterator r8 = r8.iterator()
                r2 = r7
                r7 = r8
            L_0x00a2:
                boolean r8 = r7.hasNext()
                if (r8 == 0) goto L_0x00cd
                java.lang.Object r8 = r7.next()
                v3.c$c$b$c r8 = (p865v3.C65512c.C65520c.C65522b.C65525c) r8
                r1.f188511g = r2
                r1.f188512h = r7
                r1.f188509e = r3
                r2.f188529b = r3
                c14.b0<v3.c$c$b$c<T>> r4 = r2.f188528a
                java.lang.Object r8 = r4.mo75536o(r8, r1)
                if (r8 != r0) goto L_0x00bf
                goto L_0x00c1
            L_0x00bf:
                rx3.b0 r8 = rx3.C13598b0.f38549a
            L_0x00c1:
                if (r8 != r0) goto L_0x00a2
                return r0
            L_0x00c4:
                a14.u<rx3.b0> r7 = r6.f188505h
                if (r7 == 0) goto L_0x00cd
                rx3.b0 r8 = rx3.C13598b0.f38549a
                r7.mo74633n(r8)
            L_0x00cd:
                rx3.b0 r7 = rx3.C13598b0.f38549a
                return r7
            L_0x00d0:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r8.append(r7)
                java.lang.String r7 = " already received a value"
                r8.append(r7)
                java.lang.String r7 = r8.toString()
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r7 = r7.toString()
                r8.<init>(r7)
                throw r8
            L_0x00eb:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r8.append(r7)
                java.lang.String r7 = " is already in the list."
                r8.append(r7)
                java.lang.String r7 = r8.toString()
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r7 = r7.toString()
                r8.<init>(r7)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p865v3.C65512c.C65513a.mo89627f(v3.c$b, wx3.d):java.lang.Object");
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
        /* renamed from: g */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object mo89628g(p865v3.C65512c.C65520c.C65521a<T> r7, wx3.C15601d<? super rx3.C13598b0> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof p865v3.C65512c.C65513a.C65515b
                if (r0 == 0) goto L_0x0013
                r0 = r8
                v3.c$a$b r0 = (p865v3.C65512c.C65513a.C65515b) r0
                int r1 = r0.f188514e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f188514e = r1
                goto L_0x0018
            L_0x0013:
                v3.c$a$b r0 = new v3.c$a$b
                r0.<init>(r6, r8)
            L_0x0018:
                java.lang.Object r8 = r0.f188513d
                xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
                int r2 = r0.f188514e
                r3 = 1
                if (r2 == 0) goto L_0x0033
                if (r2 != r3) goto L_0x002b
                java.lang.Object r7 = r0.f188516g
                v3.c$a r7 = (p865v3.C65512c.C65513a) r7
                kotlin.ResultKt.throwOnFailure(r8)
                goto L_0x004c
            L_0x002b:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L_0x0033:
                kotlin.ResultKt.throwOnFailure(r8)
                v3.c$b r8 = new v3.c$b
                c14.b0<v3.c$c$b$c<T>> r7 = r7.f188530a
                r2 = 0
                r4 = 2
                r5 = 0
                r8.<init>(r7, r2, r4, r5)
                r0.f188516g = r6
                r0.f188514e = r3
                java.lang.Object r7 = r6.mo89627f(r8, r0)
                if (r7 != r1) goto L_0x004b
                return r1
            L_0x004b:
                r7 = r6
            L_0x004c:
                r7.mo89626e()
                rx3.b0 r7 = rx3.C13598b0.f38549a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: p865v3.C65512c.C65513a.mo89628g(v3.c$c$a, wx3.d):java.lang.Object");
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0046  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x006c  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0080  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
        /* renamed from: h */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object mo89629h(p865v3.C65512c.C65520c.C65522b.C65525c<T> r6, wx3.C15601d<? super rx3.C13598b0> r7) {
            /*
                r5 = this;
                xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                boolean r1 = r7 instanceof p865v3.C65512c.C65513a.C65516c
                if (r1 == 0) goto L_0x0015
                r1 = r7
                v3.c$a$c r1 = (p865v3.C65512c.C65513a.C65516c) r1
                int r2 = r1.f188518e
                r3 = -2147483648(0xffffffff80000000, float:-0.0)
                r4 = r2 & r3
                if (r4 == 0) goto L_0x0015
                int r2 = r2 - r3
                r1.f188518e = r2
                goto L_0x001a
            L_0x0015:
                v3.c$a$c r1 = new v3.c$a$c
                r1.<init>(r5, r7)
            L_0x001a:
                java.lang.Object r7 = r1.f188517d
                int r2 = r1.f188518e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L_0x0046
                if (r2 == r4) goto L_0x003a
                if (r2 != r3) goto L_0x0032
                java.lang.Object r6 = r1.f188521h
                java.util.Iterator r6 = (java.util.Iterator) r6
                java.lang.Object r2 = r1.f188520g
                v3.c$c$b$c r2 = (p865v3.C65512c.C65520c.C65522b.C65525c) r2
                kotlin.ResultKt.throwOnFailure(r7)
                goto L_0x007a
            L_0x0032:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L_0x003a:
                java.lang.Object r6 = r1.f188521h
                v3.c$c$b$c r6 = (p865v3.C65512c.C65520c.C65522b.C65525c) r6
                java.lang.Object r2 = r1.f188520g
                v3.c$a r2 = (p865v3.C65512c.C65513a) r2
                kotlin.ResultKt.throwOnFailure(r7)
                goto L_0x005d
            L_0x0046:
                kotlin.ResultKt.throwOnFailure(r7)
                v3.c r7 = p865v3.C65512c.this
                fy3.p<T, wx3.d<? super rx3.b0>, java.lang.Object> r7 = r7.f188499e
                T r2 = r6.f188533a
                r1.f188520g = r5
                r1.f188521h = r6
                r1.f188518e = r4
                java.lang.Object r7 = r7.invoke(r2, r1)
                if (r7 != r0) goto L_0x005c
                return r0
            L_0x005c:
                r2 = r5
            L_0x005d:
                v3.a<T> r7 = r2.f188502e
                r7.mo89621a(r6)
                r2.f188504g = r4
                v3.a<T> r7 = r2.f188502e
                boolean r7 = r7.isEmpty()
                if (r7 == 0) goto L_0x0070
                a14.u<rx3.b0> r7 = r6.f188534b
                r2.f188505h = r7
            L_0x0070:
                java.util.List<v3.c$b<T>> r7 = r2.f188506i
                java.util.ArrayList r7 = (java.util.ArrayList) r7
                java.util.Iterator r7 = r7.iterator()
                r2 = r6
                r6 = r7
            L_0x007a:
                boolean r7 = r6.hasNext()
                if (r7 == 0) goto L_0x009c
                java.lang.Object r7 = r6.next()
                v3.c$b r7 = (p865v3.C65512c.C65519b) r7
                r1.f188520g = r2
                r1.f188521h = r6
                r1.f188518e = r3
                r7.f188529b = r4
                c14.b0<v3.c$c$b$c<T>> r7 = r7.f188528a
                java.lang.Object r7 = r7.mo75536o(r2, r1)
                if (r7 != r0) goto L_0x0097
                goto L_0x0099
            L_0x0097:
                rx3.b0 r7 = rx3.C13598b0.f38549a
            L_0x0099:
                if (r7 != r0) goto L_0x007a
                return r0
            L_0x009c:
                rx3.b0 r6 = rx3.C13598b0.f38549a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p865v3.C65512c.C65513a.mo89629h(v3.c$c$b$c, wx3.d):java.lang.Object");
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
        /* renamed from: i */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object mo89630i(c14.C54612b0<? super p865v3.C65512c.C65520c.C65522b.C65525c<T>> r8, wx3.C15601d<? super rx3.C13598b0> r9) {
            /*
                r7 = this;
                xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                boolean r1 = r9 instanceof p865v3.C65512c.C65513a.C65517d
                if (r1 == 0) goto L_0x0015
                r1 = r9
                v3.c$a$d r1 = (p865v3.C65512c.C65513a.C65517d) r1
                int r2 = r1.f188523e
                r3 = -2147483648(0xffffffff80000000, float:-0.0)
                r4 = r2 & r3
                if (r4 == 0) goto L_0x0015
                int r2 = r2 - r3
                r1.f188523e = r2
                goto L_0x001a
            L_0x0015:
                v3.c$a$d r1 = new v3.c$a$d
                r1.<init>(r7, r9)
            L_0x001a:
                java.lang.Object r9 = r1.f188522d
                int r2 = r1.f188523e
                r3 = 1
                if (r2 == 0) goto L_0x0030
                if (r2 != r3) goto L_0x0028
                kotlin.ResultKt.throwOnFailure(r9)
                goto L_0x0094
            L_0x0028:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L_0x0030:
                kotlin.ResultKt.throwOnFailure(r9)
                java.util.List<v3.c$b<T>> r9 = r7.f188506i
                java.util.ArrayList r9 = (java.util.ArrayList) r9
                java.util.Iterator r9 = r9.iterator()
                r2 = 0
                r4 = 0
            L_0x003d:
                boolean r5 = r9.hasNext()
                if (r5 == 0) goto L_0x0066
                java.lang.Object r5 = r9.next()
                v3.c$b r5 = (p865v3.C65512c.C65519b) r5
                r5.getClass()
                java.lang.String r6 = "channel"
                gy3.C87412m.m108594g(r8, r6)
                c14.b0<v3.c$c$b$c<T>> r5 = r5.f188528a
                if (r5 != r8) goto L_0x0057
                r5 = 1
                goto L_0x0058
            L_0x0057:
                r5 = 0
            L_0x0058:
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                boolean r5 = r5.booleanValue()
                if (r5 == 0) goto L_0x0063
                goto L_0x0067
            L_0x0063:
                int r4 = r4 + 1
                goto L_0x003d
            L_0x0066:
                r4 = -1
            L_0x0067:
                if (r4 < 0) goto L_0x0094
                java.util.List<v3.c$b<T>> r8 = r7.f188506i
                java.util.ArrayList r8 = (java.util.ArrayList) r8
                r8.remove(r4)
                java.util.List<v3.c$b<T>> r8 = r7.f188506i
                java.util.ArrayList r8 = (java.util.ArrayList) r8
                boolean r8 = r8.isEmpty()
                if (r8 == 0) goto L_0x0094
                v3.c r8 = p865v3.C65512c.this
                boolean r8 = r8.f188500f
                if (r8 != 0) goto L_0x0094
                v3.i<T> r8 = r7.f188503f
                if (r8 == 0) goto L_0x0094
                r1.f188523e = r3
                a14.z1 r8 = r8.f188562a
                java.lang.Object r8 = a14.C53873d2.m60391c(r8, r1)
                if (r8 != r0) goto L_0x008f
                goto L_0x0091
            L_0x008f:
                rx3.b0 r8 = rx3.C13598b0.f38549a
            L_0x0091:
                if (r8 != r0) goto L_0x0094
                return r0
            L_0x0094:
                rx3.b0 r8 = rx3.C13598b0.f38549a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p865v3.C65512c.C65513a.mo89630i(c14.b0, wx3.d):java.lang.Object");
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0037  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        /* renamed from: j */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object mo89624c(p865v3.C65512c.C65520c<T> r7, wx3.C15601d<? super rx3.C13598b0> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof p865v3.C65512c.C65513a.C65518e
                if (r0 == 0) goto L_0x0013
                r0 = r8
                v3.c$a$e r0 = (p865v3.C65512c.C65513a.C65518e) r0
                int r1 = r0.f188526e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f188526e = r1
                goto L_0x0018
            L_0x0013:
                v3.c$a$e r0 = new v3.c$a$e
                r0.<init>(r6, r8)
            L_0x0018:
                java.lang.Object r8 = r0.f188525d
                xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
                int r2 = r0.f188526e
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L_0x0037
                if (r2 == r5) goto L_0x0032
                if (r2 == r4) goto L_0x0032
                if (r2 != r3) goto L_0x002a
                goto L_0x0032
            L_0x002a:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L_0x0032:
                kotlin.ResultKt.throwOnFailure(r8)
                goto L_0x0110
            L_0x0037:
                kotlin.ResultKt.throwOnFailure(r8)
                boolean r8 = r7 instanceof p865v3.C65512c.C65520c.C65521a
                if (r8 == 0) goto L_0x0049
                v3.c$c$a r7 = (p865v3.C65512c.C65520c.C65521a) r7
                r0.f188526e = r5
                java.lang.Object r7 = r6.mo89628g(r7, r0)
                if (r7 != r1) goto L_0x0110
                return r1
            L_0x0049:
                boolean r8 = r7 instanceof p865v3.C65512c.C65520c.C65526c
                if (r8 == 0) goto L_0x005a
                v3.c$c$c r7 = (p865v3.C65512c.C65520c.C65526c) r7
                c14.b0<v3.c$c$b$c<T>> r7 = r7.f188535a
                r0.f188526e = r4
                java.lang.Object r7 = r6.mo89630i(r7, r0)
                if (r7 != r1) goto L_0x0110
                return r1
            L_0x005a:
                boolean r8 = r7 instanceof p865v3.C65512c.C65520c.C65522b.C65525c
                if (r8 == 0) goto L_0x0069
                v3.c$c$b$c r7 = (p865v3.C65512c.C65520c.C65522b.C65525c) r7
                r0.f188526e = r3
                java.lang.Object r7 = r6.mo89629h(r7, r0)
                if (r7 != r1) goto L_0x0110
                return r1
            L_0x0069:
                boolean r8 = r7 instanceof p865v3.C65512c.C65520c.C65522b.C65523a
                if (r8 == 0) goto L_0x0097
                v3.c$c$b$a r7 = (p865v3.C65512c.C65520c.C65522b.C65523a) r7
                r6.f188504g = r5
                java.util.List<v3.c$b<T>> r8 = r6.f188506i
                java.util.ArrayList r8 = (java.util.ArrayList) r8
                java.util.Iterator r8 = r8.iterator()
            L_0x0079:
                boolean r0 = r8.hasNext()
                if (r0 == 0) goto L_0x0110
                java.lang.Object r0 = r8.next()
                v3.c$b r0 = (p865v3.C65512c.C65519b) r0
                java.lang.Throwable r1 = r7.f188531a
                r0.getClass()
                java.lang.String r2 = "error"
                gy3.C87412m.m108594g(r1, r2)
                r0.f188529b = r5
                c14.b0<v3.c$c$b$c<T>> r0 = r0.f188528a
                r0.mo75540w(r1)
                goto L_0x0079
            L_0x0097:
                boolean r8 = r7 instanceof p865v3.C65512c.C65520c.C65522b.C65524b
                if (r8 == 0) goto L_0x0110
                v3.c$c$b$b r7 = (p865v3.C65512c.C65520c.C65522b.C65524b) r7
                v3.i<T> r7 = r7.f188532a
                v3.i<T> r8 = r6.f188503f
                if (r8 == r7) goto L_0x00a4
                goto L_0x0110
            L_0x00a4:
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>()
                java.util.ArrayList r8 = new java.util.ArrayList
                r8.<init>()
                java.util.List<v3.c$b<T>> r0 = r6.f188506i
                java.util.ArrayList r0 = (java.util.ArrayList) r0
                java.util.Iterator r0 = r0.iterator()
            L_0x00b6:
                boolean r1 = r0.hasNext()
                r2 = 0
                if (r1 == 0) goto L_0x00ef
                java.lang.Object r1 = r0.next()
                v3.c$b r1 = (p865v3.C65512c.C65519b) r1
                boolean r3 = r1.f188529b
                if (r3 == 0) goto L_0x00d7
                v3.c r3 = p865v3.C65512c.this
                boolean r3 = r3.f188498d
                if (r3 != 0) goto L_0x00d3
                c14.b0<v3.c$c$b$c<T>> r1 = r1.f188528a
                c14.C54612b0.C54613a.m61404a(r1, r2, r5, r2)
                goto L_0x00b6
            L_0x00d3:
                r7.add(r1)
                goto L_0x00b6
            L_0x00d7:
                boolean r3 = r6.f188504g
                if (r3 == 0) goto L_0x00df
                r8.add(r1)
                goto L_0x00b6
            L_0x00df:
                v3.c r3 = p865v3.C65512c.this
                boolean r3 = r3.f188498d
                if (r3 != 0) goto L_0x00eb
                c14.b0<v3.c$c$b$c<T>> r1 = r1.f188528a
                c14.C54612b0.C54613a.m61404a(r1, r2, r5, r2)
                goto L_0x00b6
            L_0x00eb:
                r7.add(r1)
                goto L_0x00b6
            L_0x00ef:
                java.util.List<v3.c$b<T>> r0 = r6.f188506i
                java.util.ArrayList r0 = (java.util.ArrayList) r0
                r0.clear()
                java.util.List<v3.c$b<T>> r0 = r6.f188506i
                java.util.ArrayList r0 = (java.util.ArrayList) r0
                r0.addAll(r8)
                java.util.List<v3.c$b<T>> r0 = r6.f188506i
                java.util.ArrayList r0 = (java.util.ArrayList) r0
                r0.addAll(r7)
                r6.f188503f = r2
                boolean r7 = r8.isEmpty()
                r7 = r7 ^ r5
                if (r7 == 0) goto L_0x0110
                r6.mo89626e()
            L_0x0110:
                rx3.b0 r7 = rx3.C13598b0.f38549a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: p865v3.C65512c.C65513a.mo89624c(v3.c$c, wx3.d):java.lang.Object");
        }
    }

    /* renamed from: v3.c$b */
    public static final class C65519b<T> {

        /* renamed from: a */
        public final C54612b0<C65520c.C65522b.C65525c<T>> f188528a;

        /* renamed from: b */
        public boolean f188529b;

        public C65519b(C54612b0 b0Var, boolean z, int i, C8480h hVar) {
            z = (i & 2) != 0 ? false : z;
            C87412m.m108594g(b0Var, "channel");
            this.f188528a = b0Var;
            this.f188529b = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C65519b)) {
                return false;
            }
            C65519b bVar = (C65519b) obj;
            return C87412m.m108589b(this.f188528a, bVar.f188528a) && this.f188529b == bVar.f188529b;
        }

        public int hashCode() {
            C54612b0<C65520c.C65522b.C65525c<T>> b0Var = this.f188528a;
            int hashCode = (b0Var != null ? b0Var.hashCode() : 0) * 31;
            boolean z = this.f188529b;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public String toString() {
            return "ChannelEntry(channel=" + this.f188528a + ", _receivedValue=" + this.f188529b + ")";
        }
    }

    /* renamed from: v3.c$c */
    public static abstract class C65520c<T> {

        /* renamed from: v3.c$c$a */
        public static final class C65521a<T> extends C65520c<T> {

            /* renamed from: a */
            public final C54612b0<C65522b.C65525c<T>> f188530a;

            public C65521a(C54612b0<? super C65522b.C65525c<T>> b0Var) {
                C87412m.m108594g(b0Var, "channel");
                this.f188530a = b0Var;
            }
        }

        /* renamed from: v3.c$c$b */
        public static abstract class C65522b<T> extends C65520c<T> {

            /* renamed from: v3.c$c$b$a */
            public static final class C65523a<T> extends C65522b<T> {

                /* renamed from: a */
                public final Throwable f188531a;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C65523a(Throwable th) {
                    super((C8480h) null);
                    C87412m.m108594g(th, "error");
                    this.f188531a = th;
                }
            }

            /* renamed from: v3.c$c$b$b */
            public static final class C65524b<T> extends C65522b<T> {

                /* renamed from: a */
                public final C65537i<T> f188532a;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C65524b(C65537i<T> iVar) {
                    super((C8480h) null);
                    C87412m.m108594g(iVar, "producer");
                    this.f188532a = iVar;
                }
            }

            /* renamed from: v3.c$c$b$c */
            public static final class C65525c<T> extends C65522b<T> {

                /* renamed from: a */
                public final T f188533a;

                /* renamed from: b */
                public final C53952u<C13598b0> f188534b;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C65525c(T t, C53952u<C13598b0> uVar) {
                    super((C8480h) null);
                    C87412m.m108594g(uVar, "delivered");
                    this.f188533a = t;
                    this.f188534b = uVar;
                }
            }

            public C65522b(C8480h hVar) {
            }
        }

        /* renamed from: v3.c$c$c */
        public static final class C65526c<T> extends C65520c<T> {

            /* renamed from: a */
            public final C54612b0<C65522b.C65525c<T>> f188535a;

            public C65526c(C54612b0<? super C65522b.C65525c<T>> b0Var) {
                C87412m.m108594g(b0Var, "channel");
                this.f188535a = b0Var;
            }
        }
    }

    public C65512c(C0000n0 n0Var, int i, boolean z, C32227p<? super T, ? super C15601d<? super C13598b0>, ? extends Object> pVar, boolean z2, C45252f<? extends T> fVar) {
        C87412m.m108594g(n0Var, "scope");
        C87412m.m108594g(pVar, "onEach");
        C87412m.m108594g(fVar, "upstream");
        this.f188496b = n0Var;
        this.f188497c = i;
        this.f188498d = z;
        this.f188499e = pVar;
        this.f188500f = z2;
        this.f188501g = fVar;
    }
}
