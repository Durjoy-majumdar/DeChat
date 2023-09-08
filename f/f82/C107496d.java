package f82;

import com.tencent.p014mm.plugin.multitalk.ilinkservice.C105713v2;
import com.tencent.p014mm.plugin.multitalk.model.C105851w0;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C24565l;
import gy3.C87412m;
import gy3.C87413o;
import q82.C110374a;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: f82.d */
public final class C107496d {

    /* renamed from: a */
    public final C107493b f321614a;

    /* renamed from: b */
    public final C110374a f321615b;

    /* renamed from: c */
    public volatile boolean f321616c;

    /* renamed from: d */
    public volatile boolean f321617d;

    /* renamed from: e */
    public final C13601g f321618e = C36568h.m40985a(new C107504d(this));

    /* renamed from: f */
    public final C105713v2 f321619f = new C107503c(this);

    /* renamed from: f82.d$a */
    public final class C107497a {

        /* renamed from: a */
        public final int f321620a;

        /* renamed from: b */
        public final C32226l<C32226l<? super C15601d<? super C13598b0>, ? extends Object>, C13598b0> f321621b;

        /* renamed from: c */
        public final /* synthetic */ C107496d f321622c;

        @C91590f(mo125468c = "com.tencent.mm.plugin.multitalk.model.engine_op.MultiTalkEngineOp$ScreenSuspendRunner", mo125469f = "MultiTalkEngineOp.kt", mo125470l = {149}, mo125471m = "run")
        /* renamed from: f82.d$a$a */
        public static final class C107498a extends C66704d {

            /* renamed from: d */
            public Object f321623d;

            /* renamed from: e */
            public /* synthetic */ Object f321624e;

            /* renamed from: f */
            public final /* synthetic */ C107497a f321625f;

            /* renamed from: g */
            public int f321626g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C107498a(C107497a aVar, C15601d<? super C107498a> dVar) {
                super(dVar);
                this.f321625f = aVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f321624e = obj;
                this.f321626g |= Integer.MIN_VALUE;
                return this.f321625f.mo157925a(this);
            }
        }

        /* renamed from: f82.d$a$b */
        public /* synthetic */ class C107499b extends C24565l implements C32226l<C15601d<? super C13598b0>, Object> {
            public C107499b(Object obj) {
                super(1, obj, C107497a.class, "run", "run(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            }

            public Object invoke(Object obj) {
                return ((C107497a) this.receiver).mo157925a((C15601d) obj);
            }
        }

        public C107497a(C107496d dVar, int i, C32226l<? super C32226l<? super C15601d<? super C13598b0>, ? extends Object>, C13598b0> lVar) {
            C87412m.m108594g(lVar, "runner");
            this.f321622c = dVar;
            this.f321620a = i;
            this.f321621b = lVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x006b  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object mo157925a(wx3.C15601d<? super rx3.C13598b0> r7) {
            /*
                r6 = this;
                boolean r0 = r7 instanceof f82.C107496d.C107497a.C107498a
                if (r0 == 0) goto L_0x0013
                r0 = r7
                f82.d$a$a r0 = (f82.C107496d.C107497a.C107498a) r0
                int r1 = r0.f321626g
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f321626g = r1
                goto L_0x0018
            L_0x0013:
                f82.d$a$a r0 = new f82.d$a$a
                r0.<init>(r6, r7)
            L_0x0018:
                java.lang.Object r7 = r0.f321624e
                xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
                int r2 = r0.f321626g
                r3 = 1
                if (r2 == 0) goto L_0x0033
                if (r2 != r3) goto L_0x002b
                java.lang.Object r0 = r0.f321623d
                f82.d$a r0 = (f82.C107496d.C107497a) r0
                kotlin.ResultKt.throwOnFailure(r7)
                goto L_0x0065
            L_0x002b:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L_0x0033:
                kotlin.ResultKt.throwOnFailure(r7)
                f82.d r7 = r6.f321622c
                rx3.g r7 = r7.f321618e
                rx3.n r7 = (rx3.C36570n) r7
                java.lang.Object r7 = r7.getValue()
                f82.c r7 = (f82.C107494c) r7
                int r2 = r6.f321620a
                f82.c$a r7 = r7.mo157921c(r2)
                if (r7 == 0) goto L_0x0054
                f82.d r2 = r6.f321622c
                f82.b r2 = r2.f321614a
                r2.mo150731a(r7)
                rx3.b0 r7 = rx3.C13598b0.f38549a
                goto L_0x0055
            L_0x0054:
                r7 = 0
            L_0x0055:
                if (r7 != 0) goto L_0x0064
                r4 = 10
                r0.f321623d = r6
                r0.f321626g = r3
                java.lang.Object r7 = a14.C53965x0.m60607b(r4, r0)
                if (r7 != r1) goto L_0x0064
                return r1
            L_0x0064:
                r0 = r6
            L_0x0065:
                f82.d r7 = r0.f321622c
                boolean r7 = r7.f321617d
                if (r7 == 0) goto L_0x0075
                fy3.l<fy3.l<? super wx3.d<? super rx3.b0>, ? extends java.lang.Object>, rx3.b0> r7 = r0.f321621b
                f82.d$a$b r1 = new f82.d$a$b
                r1.<init>(r0)
                r7.invoke(r1)
            L_0x0075:
                rx3.b0 r7 = rx3.C13598b0.f38549a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: f82.C107496d.C107497a.mo157925a(wx3.d):java.lang.Object");
        }
    }

    /* renamed from: f82.d$b */
    public final class C107500b {

        /* renamed from: a */
        public final C32226l<C32226l<? super C15601d<? super C13598b0>, ? extends Object>, C13598b0> f321627a;

        /* renamed from: b */
        public final /* synthetic */ C107496d f321628b;

        @C91590f(mo125468c = "com.tencent.mm.plugin.multitalk.model.engine_op.MultiTalkEngineOp$VideoSuspendRunner", mo125469f = "MultiTalkEngineOp.kt", mo125470l = {130}, mo125471m = "run")
        /* renamed from: f82.d$b$a */
        public static final class C107501a extends C66704d {

            /* renamed from: d */
            public Object f321629d;

            /* renamed from: e */
            public /* synthetic */ Object f321630e;

            /* renamed from: f */
            public final /* synthetic */ C107500b f321631f;

            /* renamed from: g */
            public int f321632g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C107501a(C107500b bVar, C15601d<? super C107501a> dVar) {
                super(dVar);
                this.f321631f = bVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f321630e = obj;
                this.f321632g |= Integer.MIN_VALUE;
                return this.f321631f.mo157926a(this);
            }
        }

        /* renamed from: f82.d$b$b */
        public /* synthetic */ class C107502b extends C24565l implements C32226l<C15601d<? super C13598b0>, Object> {
            public C107502b(Object obj) {
                super(1, obj, C107500b.class, "run", "run(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            }

            public Object invoke(Object obj) {
                return ((C107500b) this.receiver).mo157926a((C15601d) obj);
            }
        }

        public C107500b(C107496d dVar, C32226l<? super C32226l<? super C15601d<? super C13598b0>, ? extends Object>, C13598b0> lVar) {
            C87412m.m108594g(lVar, "runner");
            this.f321628b = dVar;
            this.f321627a = lVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0069  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object mo157926a(wx3.C15601d<? super rx3.C13598b0> r7) {
            /*
                r6 = this;
                boolean r0 = r7 instanceof f82.C107496d.C107500b.C107501a
                if (r0 == 0) goto L_0x0013
                r0 = r7
                f82.d$b$a r0 = (f82.C107496d.C107500b.C107501a) r0
                int r1 = r0.f321632g
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f321632g = r1
                goto L_0x0018
            L_0x0013:
                f82.d$b$a r0 = new f82.d$b$a
                r0.<init>(r6, r7)
            L_0x0018:
                java.lang.Object r7 = r0.f321630e
                xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
                int r2 = r0.f321632g
                r3 = 1
                if (r2 == 0) goto L_0x0033
                if (r2 != r3) goto L_0x002b
                java.lang.Object r0 = r0.f321629d
                f82.d$b r0 = (f82.C107496d.C107500b) r0
                kotlin.ResultKt.throwOnFailure(r7)
                goto L_0x0063
            L_0x002b:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L_0x0033:
                kotlin.ResultKt.throwOnFailure(r7)
                f82.d r7 = r6.f321628b
                rx3.g r7 = r7.f321618e
                rx3.n r7 = (rx3.C36570n) r7
                java.lang.Object r7 = r7.getValue()
                f82.c r7 = (f82.C107494c) r7
                f82.c$a r7 = r7.mo157919a()
                if (r7 == 0) goto L_0x0052
                f82.d r2 = r6.f321628b
                f82.b r2 = r2.f321614a
                r2.mo150731a(r7)
                rx3.b0 r7 = rx3.C13598b0.f38549a
                goto L_0x0053
            L_0x0052:
                r7 = 0
            L_0x0053:
                if (r7 != 0) goto L_0x0062
                r4 = 10
                r0.f321629d = r6
                r0.f321632g = r3
                java.lang.Object r7 = a14.C53965x0.m60607b(r4, r0)
                if (r7 != r1) goto L_0x0062
                return r1
            L_0x0062:
                r0 = r6
            L_0x0063:
                f82.d r7 = r0.f321628b
                boolean r7 = r7.f321616c
                if (r7 == 0) goto L_0x0073
                fy3.l<fy3.l<? super wx3.d<? super rx3.b0>, ? extends java.lang.Object>, rx3.b0> r7 = r0.f321627a
                f82.d$b$b r1 = new f82.d$b$b
                r1.<init>(r0)
                r7.invoke(r1)
            L_0x0073:
                rx3.b0 r7 = rx3.C13598b0.f38549a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: f82.C107496d.C107500b.mo157926a(wx3.d):java.lang.Object");
        }
    }

    /* renamed from: f82.d$c */
    public static final class C107503c implements C105713v2 {

        /* renamed from: a */
        public final /* synthetic */ C107496d f321633a;

        public C107503c(C107496d dVar) {
            this.f321633a = dVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
            r5 = (java.lang.ref.WeakReference) r3.poll();
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo150580a(int r14, java.nio.ByteBuffer r15, int r16, int r17, int r18) {
            /*
                r13 = this;
                r1 = r13
                r0 = r18
                f82.d r2 = r1.f321633a
                q82.a r4 = r2.f321615b
                int r2 = r16 * r17
                int r2 = r2 * 3
                r9 = 2
                int r2 = r2 / r9
                android.util.SparseArray<java.util.concurrent.ConcurrentLinkedDeque<java.lang.ref.WeakReference<java.nio.ByteBuffer>>> r3 = r4.f330164e
                java.lang.Object r3 = r3.get(r2)
                java.util.concurrent.ConcurrentLinkedDeque r3 = (java.util.concurrent.ConcurrentLinkedDeque) r3
            L_0x0015:
                r10 = 0
                if (r3 == 0) goto L_0x0027
                java.lang.Object r5 = r3.poll()
                java.lang.ref.WeakReference r5 = (java.lang.ref.WeakReference) r5
                if (r5 == 0) goto L_0x0027
                java.lang.Object r5 = r5.get()
                java.nio.ByteBuffer r5 = (java.nio.ByteBuffer) r5
                goto L_0x0028
            L_0x0027:
                r5 = r10
            L_0x0028:
                r11 = 0
                if (r3 == 0) goto L_0x0030
                int r6 = r3.size()
                goto L_0x0031
            L_0x0030:
                r6 = 0
            L_0x0031:
                if (r6 <= 0) goto L_0x0035
                if (r5 == 0) goto L_0x0015
            L_0x0035:
                int r3 = r4.f330165f
                int r6 = r3 + 1
                r4.f330165f = r6
                int r3 = r3 % 200
                java.lang.String r6 = "MicroMsg.MTR.BufferManager"
                if (r3 != 0) goto L_0x004b
                java.lang.String r3 = "clear cache"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r3)
                android.util.SparseArray<java.util.concurrent.ConcurrentLinkedDeque<java.lang.ref.WeakReference<java.nio.ByteBuffer>>> r3 = r4.f330164e
                r3.clear()
            L_0x004b:
                r7 = 0
                if (r5 != 0) goto L_0x0070
                int r3 = r4.f330166g
                r5 = 70
                if (r3 <= r5) goto L_0x006a
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r5 = "cur buffer size "
                r3.append(r5)
                int r5 = r4.f330166g
                r3.append(r5)
                java.lang.String r3 = r3.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r3)
            L_0x006a:
                java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocateDirect(r2)
                r6 = r2
                goto L_0x0071
            L_0x0070:
                r6 = r5
            L_0x0071:
                r2 = 1
                r8 = 0
                q82.a$a r12 = new q82.a$a
                r3 = r12
                r5 = r7
                r7 = r2
                r3.<init>(r4, r5, r6, r7, r8)
                long r2 = java.lang.System.currentTimeMillis()
                long r4 = r12.f330170d
                long r2 = r2 - r4
                r4 = 200(0xc8, double:9.9E-322)
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 > 0) goto L_0x008b
                boolean r2 = r12.f330171e
                goto L_0x008f
            L_0x008b:
                r12.mo161890b()
                r2 = 0
            L_0x008f:
                if (r2 == 0) goto L_0x0093
                java.nio.ByteBuffer r10 = r12.f330168b
            L_0x0093:
                if (r10 == 0) goto L_0x00ef
                monitor-enter(r10)
                r10.clear()     // Catch:{ all -> 0x00ec }
                java.nio.Buffer r2 = r15.clear()     // Catch:{ all -> 0x00ec }
                int r3 = r10.capacity()     // Catch:{ all -> 0x00ec }
                r2.limit(r3)     // Catch:{ all -> 0x00ec }
                r2 = r15
                r10.put(r15)     // Catch:{ all -> 0x00ec }
                monitor-exit(r10)
                f82.d r2 = r1.f321633a
                r3 = r0 & 128(0x80, float:1.794E-43)
                r4 = 128(0x80, float:1.794E-43)
                r5 = 1
                if (r3 != r4) goto L_0x00b4
                r10 = 1
                goto L_0x00b5
            L_0x00b4:
                r10 = 0
            L_0x00b5:
                f82.b r2 = r2.f321614a
                f82.c$a r3 = new f82.c$a
                com.tencent.mm.plugin.multitalk.ilinkservice.z r4 = com.tencent.p014mm.plugin.multitalk.ilinkservice.C105724z.INSTANCE
                com.tencent.mm.plugin.multitalk.ilinkservice.s r4 = r4.f314388f
                r6 = r14
                java.lang.String r4 = r4.mo150551c(r14)
                if (r4 != 0) goto L_0x00c6
                java.lang.String r4 = ""
            L_0x00c6:
                r6 = r4
                if (r10 == 0) goto L_0x00dd
                r4 = r0 & 256(0x100, float:3.59E-43)
                if (r4 != 0) goto L_0x00db
                r4 = r0 & 512(0x200, float:7.175E-43)
                if (r4 == 0) goto L_0x00d2
                goto L_0x00d3
            L_0x00d2:
                r9 = 1
            L_0x00d3:
                r0 = r0 & 1024(0x400, float:1.435E-42)
                if (r0 == 0) goto L_0x00d9
                int r9 = r9 + 2
            L_0x00d9:
                r11 = r9
                goto L_0x00df
            L_0x00db:
                r11 = 1
                goto L_0x00df
            L_0x00dd:
                r0 = -1
                r11 = -1
            L_0x00df:
                r5 = r3
                r7 = r12
                r8 = r16
                r9 = r17
                r5.<init>(r6, r7, r8, r9, r10, r11)
                r2.mo150731a(r3)
                goto L_0x00ef
            L_0x00ec:
                r0 = move-exception
                monitor-exit(r10)
                throw r0
            L_0x00ef:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: f82.C107496d.C107503c.mo150580a(int, java.nio.ByteBuffer, int, int, int):void");
        }
    }

    /* renamed from: f82.d$d */
    public static final class C107504d extends C87413o implements C32224a<C107494c> {

        /* renamed from: d */
        public final /* synthetic */ C107496d f321634d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107504d(C107496d dVar) {
            super(0);
            this.f321634d = dVar;
        }

        public Object invoke() {
            return C105851w0.zx0().mo150680v() ? new C107492a(this.f321634d.f321615b) : new C107507g(this.f321634d.f321615b);
        }
    }

    public C107496d(C107493b bVar, C110374a aVar) {
        C87412m.m108594g(bVar, "decodeResultHandler");
        C87412m.m108594g(aVar, "bufferManager");
        this.f321614a = bVar;
        this.f321615b = aVar;
    }
}
