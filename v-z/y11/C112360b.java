package y11;

import a14.C0000n0;
import a14.C53895h;
import a14.C53896h0;
import android.util.ArrayMap;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87412m;
import java.io.Closeable;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.ResultKt;
import p80.C110193b;
import p80.C110194c;
import rx3.C13598b0;
import t11.C110892b;
import wx3.C15601d;
import x11.C112018e;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: y11.b */
public final class C112360b implements Closeable {

    /* renamed from: d */
    public final C53896h0 f336394d;

    /* renamed from: e */
    public final ConcurrentLinkedQueue<C110194c> f336395e = new ConcurrentLinkedQueue<>();

    /* renamed from: f */
    public final ConcurrentLinkedQueue<C110194c> f336396f = new ConcurrentLinkedQueue<>();

    /* renamed from: g */
    public final ArrayMap<String, C112363c> f336397g = new ArrayMap<>();

    /* renamed from: h */
    public C112361a f336398h;

    /* renamed from: i */
    public C112364d f336399i;

    /* renamed from: y11.b$a */
    public final class C112361a {

        /* renamed from: a */
        public final String f336400a;

        /* renamed from: b */
        public final C110194c f336401b;

        /* renamed from: c */
        public C112018e f336402c;

        public C112361a(C112360b bVar, String str, C110194c cVar) {
            C87412m.m108594g(str, "username");
            C87412m.m108594g(cVar, "textureObj");
            this.f336400a = str;
            this.f336401b = cVar;
        }
    }

    /* renamed from: y11.b$b */
    public final class C112362b {

        /* renamed from: a */
        public final C110194c f336403a;

        /* renamed from: b */
        public volatile boolean f336404b = true;

        /* renamed from: c */
        public final /* synthetic */ C112360b f336405c;

        public C112362b(C112360b bVar, C110194c cVar) {
            C87412m.m108594g(cVar, "textureObj");
            this.f336405c = bVar;
            this.f336403a = cVar;
        }

        /* renamed from: a */
        public final void mo164086a() {
            this.f336404b = false;
            C112360b bVar = this.f336405c;
            bVar.f336395e.add(this.f336403a);
        }
    }

    /* renamed from: y11.b$c */
    public final class C112363c {

        /* renamed from: a */
        public final C112362b f336406a;

        /* renamed from: b */
        public final C112362b f336407b;

        /* renamed from: c */
        public final C112362b f336408c;

        /* renamed from: d */
        public volatile boolean f336409d = true;

        /* renamed from: e */
        public ReentrantLock f336410e = new ReentrantLock();

        /* renamed from: f */
        public C112018e f336411f;

        public C112363c(C112360b bVar, String str, C112362b bVar2, C112362b bVar3, C112362b bVar4) {
            C87412m.m108594g(str, "username");
            C87412m.m108594g(bVar2, "yGLTextureObject");
            C87412m.m108594g(bVar3, "uGLTextureObject");
            C87412m.m108594g(bVar4, "vGLTextureObject");
            this.f336406a = bVar2;
            this.f336407b = bVar3;
            this.f336408c = bVar4;
        }
    }

    /* renamed from: y11.b$d */
    public final class C112364d {

        /* renamed from: a */
        public final String f336412a;

        /* renamed from: b */
        public final C112362b f336413b;

        /* renamed from: c */
        public volatile boolean f336414c;

        public C112364d(C112360b bVar, String str, C112362b bVar2) {
            C87412m.m108594g(str, "username");
            C87412m.m108594g(bVar2, "textureWrapper");
            this.f336412a = str;
            this.f336413b = bVar2;
            this.f336414c = bVar2.f336404b;
            new ReentrantReadWriteLock();
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.cloudvoip.cloudvoice.mt_render.mt_render_impl.resource_pool.GLTextureManager$getTexture$2", mo125469f = "GLTextureManager.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: y11.b$e */
    public static final class C112365e extends C91594j implements C32227p<C0000n0, C15601d<? super C112362b>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C112360b f336415d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112365e(C112360b bVar, C15601d<? super C112365e> dVar) {
            super(2, dVar);
            this.f336415d = bVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C112365e(this.f336415d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C112365e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C112360b bVar = this.f336415d;
            C110194c poll = bVar.f336395e.poll();
            if (poll == null) {
                poll = C110193b.m149776b(true, 19);
                this.f336415d.f336396f.add(poll);
            }
            return new C112362b(bVar, poll);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.cloudvoip.cloudvoice.mt_render.mt_render_impl.resource_pool.GLTextureManager", mo125469f = "GLTextureManager.kt", mo125470l = {80}, mo125471m = "getVBTextureWrapper")
    /* renamed from: y11.b$f */
    public static final class C112366f extends C66704d {

        /* renamed from: d */
        public Object f336416d;

        /* renamed from: e */
        public Object f336417e;

        /* renamed from: f */
        public Object f336418f;

        /* renamed from: g */
        public /* synthetic */ Object f336419g;

        /* renamed from: h */
        public final /* synthetic */ C112360b f336420h;

        /* renamed from: i */
        public int f336421i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112366f(C112360b bVar, C15601d<? super C112366f> dVar) {
            super(dVar);
            this.f336420h = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f336419g = obj;
            this.f336421i |= Integer.MIN_VALUE;
            return this.f336420h.mo164083b((String) null, false, this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.cloudvoip.cloudvoice.mt_render.mt_render_impl.resource_pool.GLTextureManager", mo125469f = "GLTextureManager.kt", mo125470l = {52, 52, 52}, mo125471m = "getYuvTextureGroup")
    /* renamed from: y11.b$g */
    public static final class C112367g extends C66704d {

        /* renamed from: d */
        public Object f336422d;

        /* renamed from: e */
        public Object f336423e;

        /* renamed from: f */
        public Object f336424f;

        /* renamed from: g */
        public Object f336425g;

        /* renamed from: h */
        public Object f336426h;

        /* renamed from: i */
        public Object f336427i;

        /* renamed from: j */
        public /* synthetic */ Object f336428j;

        /* renamed from: n */
        public final /* synthetic */ C112360b f336429n;

        /* renamed from: o */
        public int f336430o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112367g(C112360b bVar, C15601d<? super C112367g> dVar) {
            super(dVar);
            this.f336429n = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f336428j = obj;
            this.f336430o |= Integer.MIN_VALUE;
            return this.f336429n.mo164084c((String) null, this);
        }
    }

    public C112360b(C53896h0 h0Var) {
        C87412m.m108594g(h0Var, "coroutineDispatcher");
        this.f336394d = h0Var;
    }

    /* renamed from: a */
    public final Object mo164082a(C15601d<? super C112362b> dVar) {
        C53896h0 h0Var = this.f336394d;
        C110892b.C110898b bVar = C110892b.f331701e;
        return C53895h.m60469g(h0Var.plus(C110892b.f331702f), new C112365e(this, (C15601d<? super C112365e>) null), dVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo164083b(java.lang.String r6, boolean r7, wx3.C15601d<? super y11.C112360b.C112364d> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof y11.C112360b.C112366f
            if (r0 == 0) goto L_0x0013
            r0 = r8
            y11.b$f r0 = (y11.C112360b.C112366f) r0
            int r1 = r0.f336421i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f336421i = r1
            goto L_0x0018
        L_0x0013:
            y11.b$f r0 = new y11.b$f
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f336419g
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f336421i
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 != r4) goto L_0x0034
            java.lang.Object r6 = r0.f336418f
            y11.b r6 = (y11.C112360b) r6
            java.lang.Object r7 = r0.f336417e
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r0 = r0.f336416d
            y11.b r0 = (y11.C112360b) r0
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x0066
        L_0x0034:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003c:
            kotlin.ResultKt.throwOnFailure(r8)
            y11.b$d r8 = r5.f336399i
            if (r8 == 0) goto L_0x0052
            java.lang.String r2 = r8.f336412a
            boolean r2 = gy3.C87412m.m108589b(r2, r6)
            if (r2 == 0) goto L_0x004c
            goto L_0x004d
        L_0x004c:
            r8 = r3
        L_0x004d:
            if (r8 != 0) goto L_0x0050
            goto L_0x0052
        L_0x0050:
            r3 = r8
            goto L_0x006f
        L_0x0052:
            if (r7 == 0) goto L_0x006f
            r0.f336416d = r5
            r0.f336417e = r6
            r0.f336418f = r5
            r0.f336421i = r4
            java.lang.Object r8 = r5.mo164082a(r0)
            if (r8 != r1) goto L_0x0063
            return r1
        L_0x0063:
            r0 = r5
            r7 = r6
            r6 = r0
        L_0x0066:
            y11.b$b r8 = (y11.C112360b.C112362b) r8
            y11.b$d r3 = new y11.b$d
            r3.<init>(r6, r7, r8)
            r0.f336399i = r3
        L_0x006f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: y11.C112360b.mo164083b(java.lang.String, boolean, wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00c0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00de A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo164084c(java.lang.String r18, wx3.C15601d<? super y11.C112360b.C112363c> r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r2 instanceof y11.C112360b.C112367g
            if (r3 == 0) goto L_0x0019
            r3 = r2
            y11.b$g r3 = (y11.C112360b.C112367g) r3
            int r4 = r3.f336430o
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f336430o = r4
            goto L_0x001e
        L_0x0019:
            y11.b$g r3 = new y11.b$g
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r2 = r3.f336428j
            xx3.a r4 = xx3.C15911a.COROUTINE_SUSPENDED
            int r5 = r3.f336430o
            r6 = 3
            r7 = 2
            r8 = 1
            if (r5 == 0) goto L_0x008a
            if (r5 == r8) goto L_0x0070
            if (r5 == r7) goto L_0x0058
            if (r5 != r6) goto L_0x0050
            java.lang.Object r1 = r3.f336427i
            y11.b$b r1 = (y11.C112360b.C112362b) r1
            java.lang.Object r4 = r3.f336426h
            y11.b$b r4 = (y11.C112360b.C112362b) r4
            java.lang.Object r5 = r3.f336425g
            y11.b r5 = (y11.C112360b) r5
            java.lang.Object r6 = r3.f336424f
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r3.f336423e
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r3 = r3.f336422d
            y11.b r3 = (y11.C112360b) r3
            kotlin.ResultKt.throwOnFailure(r2)
            r14 = r1
            r13 = r4
            r11 = r5
            r12 = r6
            goto L_0x00e6
        L_0x0050:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0058:
            java.lang.Object r1 = r3.f336426h
            y11.b$b r1 = (y11.C112360b.C112362b) r1
            java.lang.Object r5 = r3.f336425g
            y11.b r5 = (y11.C112360b) r5
            java.lang.Object r7 = r3.f336424f
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r3.f336423e
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r3.f336422d
            y11.b r9 = (y11.C112360b) r9
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x00c8
        L_0x0070:
            java.lang.Object r1 = r3.f336425g
            y11.b r1 = (y11.C112360b) r1
            java.lang.Object r5 = r3.f336424f
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r8 = r3.f336423e
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r3.f336422d
            y11.b r9 = (y11.C112360b) r9
            kotlin.ResultKt.throwOnFailure(r2)
            r16 = r2
            r2 = r1
            r1 = r5
            r5 = r16
            goto L_0x00ac
        L_0x008a:
            kotlin.ResultKt.throwOnFailure(r2)
            android.util.ArrayMap<java.lang.String, y11.b$c> r2 = r0.f336397g
            java.lang.Object r2 = r2.get(r1)
            y11.b$c r2 = (y11.C112360b.C112363c) r2
            if (r2 != 0) goto L_0x00f4
            r3.f336422d = r0
            r3.f336423e = r1
            r3.f336424f = r1
            r3.f336425g = r0
            r3.f336430o = r8
            java.lang.Object r2 = r0.mo164082a(r3)
            if (r2 != r4) goto L_0x00a8
            return r4
        L_0x00a8:
            r9 = r0
            r8 = r1
            r5 = r2
            r2 = r9
        L_0x00ac:
            y11.b$b r5 = (y11.C112360b.C112362b) r5
            r3.f336422d = r9
            r3.f336423e = r8
            r3.f336424f = r1
            r3.f336425g = r2
            r3.f336426h = r5
            r3.f336430o = r7
            java.lang.Object r7 = r9.mo164082a(r3)
            if (r7 != r4) goto L_0x00c1
            return r4
        L_0x00c1:
            r16 = r7
            r7 = r1
            r1 = r5
            r5 = r2
            r2 = r16
        L_0x00c8:
            y11.b$b r2 = (y11.C112360b.C112362b) r2
            r3.f336422d = r9
            r3.f336423e = r8
            r3.f336424f = r7
            r3.f336425g = r5
            r3.f336426h = r1
            r3.f336427i = r2
            r3.f336430o = r6
            java.lang.Object r3 = r9.mo164082a(r3)
            if (r3 != r4) goto L_0x00df
            return r4
        L_0x00df:
            r13 = r1
            r14 = r2
            r2 = r3
            r11 = r5
            r12 = r7
            r7 = r8
            r3 = r9
        L_0x00e6:
            r15 = r2
            y11.b$b r15 = (y11.C112360b.C112362b) r15
            y11.b$c r2 = new y11.b$c
            r10 = r2
            r10.<init>(r11, r12, r13, r14, r15)
            android.util.ArrayMap<java.lang.String, y11.b$c> r1 = r3.f336397g
            r1.put(r7, r2)
        L_0x00f4:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: y11.C112360b.mo164084c(java.lang.String, wx3.d):java.lang.Object");
    }

    public void close() {
        Log.m105924i("MicroMsg.MTR.GLTextureManager", "close");
        C112364d dVar = this.f336399i;
        if (dVar != null) {
            dVar.f336413b.mo164086a();
        }
        for (Map.Entry next : this.f336397g.entrySet()) {
            C87412m.m108593f(next, "yuvTextureGroupHolder.entries");
            C112363c cVar = (C112363c) next.getValue();
            cVar.f336409d = false;
            cVar.f336406a.mo164086a();
            cVar.f336407b.mo164086a();
            cVar.f336408c.mo164086a();
        }
        for (C110194c close : this.f336396f) {
            close.close();
        }
        this.f336397g.clear();
        this.f336395e.clear();
        this.f336396f.clear();
    }
}
