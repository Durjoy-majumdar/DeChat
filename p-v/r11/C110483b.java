package r11;

import a14.C0000n0;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.io.Closeable;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import q11.C110337g;
import q11.C110339h;
import q11.C110342i;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36570n;
import s11.C110698a;
import s11.C110708b;
import s11.C110714c;
import t11.C110886a;
import u11.C111099b;
import ux3.C65486b;
import wx3.C15601d;
import wx3.C66212f;
import y11.C112358a;
import y11.C112360b;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: r11.b */
public final class C110483b implements Closeable {

    /* renamed from: d */
    public final Set<C89861a> f330379d = new LinkedHashSet();

    /* renamed from: e */
    public boolean f330380e = true;

    /* renamed from: f */
    public final C110886a f330381f;

    /* renamed from: g */
    public final C112360b f330382g;

    /* renamed from: h */
    public final C112358a f330383h;

    /* renamed from: i */
    public final C0000n0 f330384i;

    /* renamed from: j */
    public final C111099b f330385j;

    /* renamed from: n */
    public final C13601g f330386n;

    /* renamed from: o */
    public final C13601g f330387o;

    /* renamed from: r11.b$a */
    public static final class C89861a {

        /* renamed from: a */
        public final Closeable f258295a;

        /* renamed from: b */
        public final C66212f f258296b;

        /* renamed from: c */
        public final int f258297c;

        public C89861a(Closeable closeable, C66212f fVar, int i) {
            C87412m.m108594g(closeable, "closable");
            this.f258295a = closeable;
            this.f258296b = fVar;
            this.f258297c = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C89861a)) {
                return false;
            }
            C89861a aVar = (C89861a) obj;
            return C87412m.m108589b(this.f258295a, aVar.f258295a) && C87412m.m108589b(this.f258296b, aVar.f258296b) && this.f258297c == aVar.f258297c;
        }

        public int hashCode() {
            int hashCode = this.f258295a.hashCode() * 31;
            C66212f fVar = this.f258296b;
            return ((hashCode + (fVar == null ? 0 : fVar.hashCode())) * 31) + this.f258297c;
        }

        public String toString() {
            return "ClosableInfo(closable=" + this.f258295a + ", coroutineContext=" + this.f258296b + ", stage=" + this.f258297c + ')';
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.cloudvoip.cloudvoice.mt_render.mt_render_impl.MTRContext$close$1", mo125469f = "MTRContext.kt", mo125470l = {61, 63}, mo125471m = "invokeSuspend")
    /* renamed from: r11.b$b */
    public static final class C89862b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f258298d;

        /* renamed from: e */
        public int f258299e;

        /* renamed from: f */
        public final /* synthetic */ C110483b f258300f;

        /* renamed from: r11.b$b$a */
        public static final class C89863a<T> implements Comparator {
            public final int compare(T t, T t2) {
                return C65486b.m77169a(Integer.valueOf(((C89861a) t).f258297c), Integer.valueOf(((C89861a) t2).f258297c));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C89862b(C110483b bVar, C15601d<? super C89862b> dVar) {
            super(2, dVar);
            this.f258300f = bVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C89862b(this.f258300f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C89862b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x003c  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x008b A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                int r1 = r7.f258299e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0021
                if (r1 == r3) goto L_0x0019
                if (r1 != r2) goto L_0x0011
                kotlin.ResultKt.throwOnFailure(r8)
                goto L_0x008c
            L_0x0011:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L_0x0019:
                java.lang.Object r1 = r7.f258298d
                java.util.Iterator r1 = (java.util.Iterator) r1
                kotlin.ResultKt.throwOnFailure(r8)
                goto L_0x0035
            L_0x0021:
                kotlin.ResultKt.throwOnFailure(r8)
                r11.b r8 = r7.f258300f
                java.util.Set<r11.b$a> r8 = r8.f330379d
                r11.b$b$a r1 = new r11.b$b$a
                r1.<init>()
                java.util.List r8 = sx3.C110818d0.m150943o0(r8, r1)
                java.util.Iterator r1 = r8.iterator()
            L_0x0035:
                boolean r8 = r1.hasNext()
                r4 = 0
                if (r8 == 0) goto L_0x0075
                java.lang.Object r8 = r1.next()
                r11.b$a r8 = (r11.C110483b.C89861a) r8
                r7.f258298d = r1
                r7.f258299e = r3
                wx3.f r5 = r8.f258296b
                if (r5 == 0) goto L_0x0059
                r11.a r6 = new r11.a
                r6.<init>(r8, r4)
                java.lang.Object r8 = a14.C53895h.m60469g(r5, r6, r7)
                if (r8 != r0) goto L_0x0056
                goto L_0x0072
            L_0x0056:
                rx3.b0 r8 = rx3.C13598b0.f38549a
                goto L_0x0072
            L_0x0059:
                kotlin.Result$Companion r4 = kotlin.Result.Companion     // Catch:{ all -> 0x0066 }
                java.io.Closeable r8 = r8.f258295a     // Catch:{ all -> 0x0066 }
                r8.close()     // Catch:{ all -> 0x0066 }
                rx3.b0 r8 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0066 }
                kotlin.Result.m168114constructorimpl(r8)     // Catch:{ all -> 0x0066 }
                goto L_0x0070
            L_0x0066:
                r8 = move-exception
                kotlin.Result$Companion r4 = kotlin.Result.Companion
                java.lang.Object r8 = kotlin.ResultKt.createFailure(r8)
                kotlin.Result.m168114constructorimpl(r8)
            L_0x0070:
                rx3.b0 r8 = rx3.C13598b0.f38549a
            L_0x0072:
                if (r8 != r0) goto L_0x0035
                return r0
            L_0x0075:
                r11.b r8 = r7.f258300f
                rx3.g r8 = r8.f330386n
                rx3.n r8 = (rx3.C36570n) r8
                java.lang.Object r8 = r8.getValue()
                s11.a r8 = (s11.C110698a) r8
                r7.f258298d = r4
                r7.f258299e = r2
                java.lang.Object r8 = r8.mo161500a(r7)
                if (r8 != r0) goto L_0x008c
                return r0
            L_0x008c:
                rx3.b0 r8 = rx3.C13598b0.f38549a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: r11.C110483b.C89862b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: r11.b$c */
    public static final class C110484c extends C87413o implements C32224a<C110698a> {

        /* renamed from: d */
        public final /* synthetic */ C110483b f330388d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110484c(C110483b bVar) {
            super(0);
            this.f330388d = bVar;
        }

        public Object invoke() {
            C110483b bVar = this.f330388d;
            return new C110698a(bVar.f330381f, bVar.f330385j, bVar.f330382g);
        }
    }

    /* renamed from: r11.b$d */
    public static final class C110485d extends C87413o implements C32224a<C110342i> {

        /* renamed from: d */
        public final /* synthetic */ C110483b f330389d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110485d(C110483b bVar) {
            super(0);
            this.f330389d = bVar;
        }

        public Object invoke() {
            C110483b bVar = this.f330389d;
            C110342i iVar = new C110342i();
            C110483b.m150383a(bVar, iVar, (C66212f) null, 0, 3, (Object) null);
            return iVar;
        }
    }

    /* renamed from: r11.b$e */
    public static final class C110486e extends C87413o implements C32224a<C110337g<? super C110708b, ? extends C110714c>> {

        /* renamed from: d */
        public final /* synthetic */ C110483b f330390d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110486e(C110483b bVar) {
            super(0);
            this.f330390d = bVar;
        }

        public Object invoke() {
            C110483b bVar = this.f330390d;
            C110337g gVar = new C110337g((C110698a) ((C36570n) bVar.f330386n).getValue());
            C53895h.m60466d(gVar.f330068g, (C66212f) null, (C53934p0) null, new C110339h(gVar, (C15601d<? super C110339h>) null), 3, (Object) null);
            Log.m105924i("MicroMsg.MTR.MTRExecutor", "executor started");
            C110483b.m150383a(bVar, gVar, (C66212f) null, 1, 1, (Object) null);
            return gVar;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x002d, code lost:
        r2 = (r2 = r2.f330064e).f189593c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C110483b() {
        /*
            r14 = this;
            r14.<init>()
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r14.f330379d = r0
            r6 = 1
            r14.f330380e = r6
            t11.a r7 = new t11.a
            r7.<init>()
            java.lang.String r0 = "MicroMsg.MTR.GLDispatcher"
            java.lang.String r1 = "init"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            java.lang.String r1 = "create new worker"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            q11.f r1 = new q11.f
            r2 = 0
            r8 = 0
            r1.<init>(r2, r6, r8)
            q11.f r2 = r7.f331690e
            if (r2 == 0) goto L_0x0031
            w80.d$b r2 = r2.f330064e
            if (r2 == 0) goto L_0x0031
            android.opengl.EGLContext r2 = r2.f189593c
            if (r2 != 0) goto L_0x0033
        L_0x0031:
            android.opengl.EGLContext r2 = android.opengl.EGL14.EGL_NO_CONTEXT
        L_0x0033:
            java.lang.String r3 = r1.f330060a
            java.lang.String r4 = "bindGLEnvironment"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            rx3.g r3 = r1.f330062c
            rx3.n r3 = (rx3.C36570n) r3
            java.lang.Object r3 = r3.getValue()
            android.os.HandlerThread r3 = (android.os.HandlerThread) r3
            r3.start()
            rx3.g r3 = r1.f330063d
            rx3.n r3 = (rx3.C36570n) r3
            java.lang.Object r3 = r3.getValue()
            android.os.Handler r3 = (android.os.Handler) r3
            q11.b r4 = new q11.b
            r4.<init>(r1, r2)
            r3.post(r4)
            r7.f331690e = r1
            java.lang.String r1 = "create main GLThread"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            r2 = 0
            r3 = 1
            r4 = 1
            r9 = 0
            r0 = r14
            r1 = r7
            r5 = r9
            m150383a(r0, r1, r2, r3, r4, r5)
            r14.f330381f = r7
            y11.b r10 = new y11.b
            r10.<init>(r7)
            t11.b r0 = t11.C110892b.f331702f
            wx3.f r2 = r7.plus(r0)
            r11 = 0
            r4 = 2
            r12 = 0
            r3 = 0
            r0 = r14
            r1 = r10
            m150383a(r0, r1, r2, r3, r4, r5)
            r14.f330382g = r10
            y11.a r9 = new y11.a
            r9.<init>()
            r10 = 0
            r13 = 3
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r13
            r5 = r12
            m150383a(r0, r1, r2, r3, r4, r5)
            r14.f330383h = r9
            a14.w r0 = a14.C53959v2.m60598a(r8, r6, r8)
            wx3.f r0 = r7.plus(r0)
            a14.n0 r0 = a14.C53930o0.m60554a(r0)
            r14.f330384i = r0
            u11.b r6 = new u11.b
            r6.<init>(r0)
            r3 = 0
            r5 = 0
            r0 = r14
            r1 = r6
            m150383a(r0, r1, r2, r3, r4, r5)
            r14.f330385j = r6
            r11.b$c r0 = new r11.b$c
            r0.<init>(r14)
            rx3.g r0 = rx3.C36568h.m40985a(r0)
            r14.f330386n = r0
            r11.b$e r0 = new r11.b$e
            r0.<init>(r14)
            rx3.g r0 = rx3.C36568h.m40985a(r0)
            r14.f330387o = r0
            r11.b$d r0 = new r11.b$d
            r0.<init>(r14)
            rx3.C36568h.m40985a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r11.C110483b.<init>():void");
    }

    /* renamed from: a */
    public static Object m150383a(C110483b bVar, Object obj, C66212f fVar, int i, int i2, Object obj2) {
        Closeable closeable = null;
        if ((i2 & 1) != 0) {
            fVar = null;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        bVar.getClass();
        if (obj instanceof Closeable) {
            closeable = (Closeable) obj;
        }
        if (closeable != null) {
            Log.m105924i("MicroMsg.MTR.MTRContext", "register " + obj);
            bVar.f330379d.add(new C89861a((Closeable) obj, fVar, i));
        }
        return obj;
    }

    public void close() {
        Log.m105924i("MicroMsg.MTR.MTRContext", "close");
        this.f330380e = false;
        C53895h.m60466d(C53930o0.m60555b(), (C66212f) null, (C53934p0) null, new C89862b(this, (C15601d<? super C89862b>) null), 3, (Object) null);
    }
}
