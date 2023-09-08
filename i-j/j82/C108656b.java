package j82;

import a14.C0000n0;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import i82.C108409g;
import i82.C108411h;
import i82.C108414i;
import java.io.Closeable;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import k82.C108945a;
import k82.C108957b;
import k82.C108963c;
import l82.C109278a;
import m82.C109548c;
import q82.C110374a;
import q82.C110376b;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36570n;
import ux3.C65486b;
import wx3.C15601d;
import wx3.C66212f;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: j82.b */
public final class C108656b implements Closeable {

    /* renamed from: d */
    public final Set<C87908a> f325395d = new LinkedHashSet();

    /* renamed from: e */
    public boolean f325396e = true;

    /* renamed from: f */
    public final C109278a f325397f;

    /* renamed from: g */
    public final C110376b f325398g;

    /* renamed from: h */
    public final C110374a f325399h;

    /* renamed from: i */
    public final C0000n0 f325400i;

    /* renamed from: j */
    public final C109548c f325401j;

    /* renamed from: n */
    public final C13601g f325402n;

    /* renamed from: o */
    public final C13601g f325403o;

    /* renamed from: p */
    public final C13601g f325404p;

    /* renamed from: j82.b$a */
    public static final class C87908a {

        /* renamed from: a */
        public final Closeable f254442a;

        /* renamed from: b */
        public final C66212f f254443b;

        /* renamed from: c */
        public final int f254444c;

        public C87908a(Closeable closeable, C66212f fVar, int i) {
            C87412m.m108594g(closeable, "closable");
            this.f254442a = closeable;
            this.f254443b = fVar;
            this.f254444c = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C87908a)) {
                return false;
            }
            C87908a aVar = (C87908a) obj;
            return C87412m.m108589b(this.f254442a, aVar.f254442a) && C87412m.m108589b(this.f254443b, aVar.f254443b) && this.f254444c == aVar.f254444c;
        }

        public int hashCode() {
            int hashCode = this.f254442a.hashCode() * 31;
            C66212f fVar = this.f254443b;
            return ((hashCode + (fVar == null ? 0 : fVar.hashCode())) * 31) + this.f254444c;
        }

        public String toString() {
            return "ClosableInfo(closable=" + this.f254442a + ", coroutineContext=" + this.f254443b + ", stage=" + this.f254444c + ')';
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.multitalk.mt_render.mt_render_impl.MTRContext$close$1", mo125469f = "MTRContext.kt", mo125470l = {61, 63}, mo125471m = "invokeSuspend")
    /* renamed from: j82.b$b */
    public static final class C87909b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f254445d;

        /* renamed from: e */
        public int f254446e;

        /* renamed from: f */
        public final /* synthetic */ C108656b f254447f;

        /* renamed from: j82.b$b$a */
        public static final class C87910a<T> implements Comparator {
            public final int compare(T t, T t2) {
                return C65486b.m77169a(Integer.valueOf(((C87908a) t).f254444c), Integer.valueOf(((C87908a) t2).f254444c));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C87909b(C108656b bVar, C15601d<? super C87909b> dVar) {
            super(2, dVar);
            this.f254447f = bVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C87909b(this.f254447f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C87909b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x003c  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x008b A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                int r1 = r7.f254446e
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
                java.lang.Object r1 = r7.f254445d
                java.util.Iterator r1 = (java.util.Iterator) r1
                kotlin.ResultKt.throwOnFailure(r8)
                goto L_0x0035
            L_0x0021:
                kotlin.ResultKt.throwOnFailure(r8)
                j82.b r8 = r7.f254447f
                java.util.Set<j82.b$a> r8 = r8.f325395d
                j82.b$b$a r1 = new j82.b$b$a
                r1.<init>()
                java.util.List r8 = sx3.C110818d0.m150943o0(r8, r1)
                java.util.Iterator r1 = r8.iterator()
            L_0x0035:
                boolean r8 = r1.hasNext()
                r4 = 0
                if (r8 == 0) goto L_0x0075
                java.lang.Object r8 = r1.next()
                j82.b$a r8 = (j82.C108656b.C87908a) r8
                r7.f254445d = r1
                r7.f254446e = r3
                wx3.f r5 = r8.f254443b
                if (r5 == 0) goto L_0x0059
                j82.a r6 = new j82.a
                r6.<init>(r8, r4)
                java.lang.Object r8 = a14.C53895h.m60469g(r5, r6, r7)
                if (r8 != r0) goto L_0x0056
                goto L_0x0072
            L_0x0056:
                rx3.b0 r8 = rx3.C13598b0.f38549a
                goto L_0x0072
            L_0x0059:
                kotlin.Result$Companion r4 = kotlin.Result.Companion     // Catch:{ all -> 0x0066 }
                java.io.Closeable r8 = r8.f254442a     // Catch:{ all -> 0x0066 }
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
                j82.b r8 = r7.f254447f
                rx3.g r8 = r8.f325402n
                rx3.n r8 = (rx3.C36570n) r8
                java.lang.Object r8 = r8.getValue()
                k82.a r8 = (k82.C108945a) r8
                r7.f254445d = r4
                r7.f254446e = r2
                java.lang.Object r8 = r8.mo158580a(r7)
                if (r8 != r0) goto L_0x008c
                return r0
            L_0x008c:
                rx3.b0 r8 = rx3.C13598b0.f38549a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: j82.C108656b.C87909b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: j82.b$c */
    public static final class C108657c extends C87413o implements C32224a<C108945a> {

        /* renamed from: d */
        public final /* synthetic */ C108656b f325405d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108657c(C108656b bVar) {
            super(0);
            this.f325405d = bVar;
        }

        public Object invoke() {
            C108656b bVar = this.f325405d;
            return new C108945a(bVar.f325397f, bVar.f325401j, bVar.f325398g);
        }
    }

    /* renamed from: j82.b$d */
    public static final class C108658d extends C87413o implements C32224a<C108414i> {

        /* renamed from: d */
        public final /* synthetic */ C108656b f325406d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108658d(C108656b bVar) {
            super(0);
            this.f325406d = bVar;
        }

        public Object invoke() {
            C108656b bVar = this.f325406d;
            C108414i iVar = new C108414i();
            C108656b.m147359b(bVar, iVar, (C66212f) null, 0, 3, (Object) null);
            return iVar;
        }
    }

    /* renamed from: j82.b$e */
    public static final class C108659e extends C87413o implements C32224a<C108409g<? super C108957b, ? extends C108963c>> {

        /* renamed from: d */
        public final /* synthetic */ C108656b f325407d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108659e(C108656b bVar) {
            super(0);
            this.f325407d = bVar;
        }

        public Object invoke() {
            C108656b bVar = this.f325407d;
            C108409g gVar = new C108409g((C108945a) ((C36570n) bVar.f325402n).getValue());
            C53895h.m60466d(gVar.f324615g, (C66212f) null, (C53934p0) null, new C108411h(gVar, (C15601d<? super C108411h>) null), 3, (Object) null);
            Log.m105924i("MicroMsg.MTR.MTRExecutor", "executor started");
            C108656b.m147359b(bVar, gVar, (C66212f) null, 1, 1, (Object) null);
            return gVar;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x002d, code lost:
        r2 = (r2 = r2.f324611e).f189593c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C108656b() {
        /*
            r12 = this;
            r12.<init>()
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r12.f325395d = r0
            r6 = 1
            r12.f325396e = r6
            l82.a r7 = new l82.a
            r7.<init>()
            java.lang.String r0 = "MicroMsg.MTR.GLDispatcher"
            java.lang.String r1 = "init"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            java.lang.String r1 = "create new worker"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            i82.f r1 = new i82.f
            r2 = 0
            r8 = 0
            r1.<init>(r2, r6, r8)
            i82.f r2 = r7.f327172e
            if (r2 == 0) goto L_0x0031
            w80.d$b r2 = r2.f324611e
            if (r2 == 0) goto L_0x0031
            android.opengl.EGLContext r2 = r2.f189593c
            if (r2 != 0) goto L_0x0033
        L_0x0031:
            android.opengl.EGLContext r2 = android.opengl.EGL14.EGL_NO_CONTEXT
        L_0x0033:
            java.lang.String r3 = r1.f324607a
            java.lang.String r4 = "bindGLEnvironment"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            rx3.g r3 = r1.f324609c
            rx3.n r3 = (rx3.C36570n) r3
            java.lang.Object r3 = r3.getValue()
            android.os.HandlerThread r3 = (android.os.HandlerThread) r3
            r3.start()
            rx3.g r3 = r1.f324610d
            rx3.n r3 = (rx3.C36570n) r3
            java.lang.Object r3 = r3.getValue()
            android.os.Handler r3 = (android.os.Handler) r3
            i82.b r4 = new i82.b
            r4.<init>(r1, r2)
            r3.post(r4)
            r7.f327172e = r1
            java.lang.String r1 = "create main GLThread"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            r2 = 0
            r3 = 1
            r4 = 1
            r5 = 0
            r0 = r12
            r1 = r7
            m147359b(r0, r1, r2, r3, r4, r5)
            r12.f325397f = r7
            q82.b r9 = new q82.b
            r9.<init>(r7)
            l82.b r0 = l82.C109284b.f327184f
            wx3.f r2 = r7.plus(r0)
            r10 = 0
            r4 = 2
            r11 = 0
            r3 = 0
            r0 = r12
            r1 = r9
            m147359b(r0, r1, r2, r3, r4, r5)
            r12.f325398g = r9
            q82.a r9 = new q82.a
            r9.<init>()
            r2 = 0
            r4 = 3
            r1 = r9
            r3 = r10
            r5 = r11
            m147359b(r0, r1, r2, r3, r4, r5)
            r12.f325399h = r9
            a14.w r0 = a14.C53959v2.m60598a(r8, r6, r8)
            wx3.f r0 = r7.plus(r0)
            a14.n0 r0 = a14.C53930o0.m60554a(r0)
            r12.f325400i = r0
            m82.c r6 = new m82.c
            r6.<init>(r0)
            r3 = 0
            r5 = 0
            r0 = r12
            r1 = r6
            m147359b(r0, r1, r2, r3, r4, r5)
            r12.f325401j = r6
            j82.b$c r0 = new j82.b$c
            r0.<init>(r12)
            rx3.g r0 = rx3.C36568h.m40985a(r0)
            r12.f325402n = r0
            j82.b$e r0 = new j82.b$e
            r0.<init>(r12)
            rx3.g r0 = rx3.C36568h.m40985a(r0)
            r12.f325403o = r0
            j82.b$d r0 = new j82.b$d
            r0.<init>(r12)
            rx3.g r0 = rx3.C36568h.m40985a(r0)
            r12.f325404p = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j82.C108656b.<init>():void");
    }

    /* renamed from: b */
    public static Object m147359b(C108656b bVar, Object obj, C66212f fVar, int i, int i2, Object obj2) {
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
            bVar.f325395d.add(new C87908a((Closeable) obj, fVar, i));
        }
        return obj;
    }

    /* renamed from: a */
    public final C108409g<C108957b, C108963c> mo159679a() {
        return (C108409g) ((C36570n) this.f325403o).getValue();
    }

    public void close() {
        Log.m105924i("MicroMsg.MTR.MTRContext", "close");
        this.f325396e = false;
        C53895h.m60466d(C53930o0.m60555b(), (C66212f) null, (C53934p0) null, new C87909b(this, (C15601d<? super C87909b>) null), 3, (Object) null);
    }
}
