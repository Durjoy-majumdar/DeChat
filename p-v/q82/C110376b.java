package q82;

import a14.C0000n0;
import a14.C53895h;
import a14.C53896h0;
import android.util.ArrayMap;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87412m;
import java.io.Closeable;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.ResultKt;
import l82.C109284b;
import p80.C110193b;
import p80.C110194c;
import p82.C110201e;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: q82.b */
public final class C110376b implements Closeable {

    /* renamed from: d */
    public final C53896h0 f330174d;

    /* renamed from: e */
    public final ConcurrentLinkedQueue<C110194c> f330175e = new ConcurrentLinkedQueue<>();

    /* renamed from: f */
    public final ConcurrentLinkedQueue<C110194c> f330176f = new ConcurrentLinkedQueue<>();

    /* renamed from: g */
    public final ArrayMap<String, C110379c> f330177g = new ArrayMap<>();

    /* renamed from: h */
    public C110377a f330178h;

    /* renamed from: i */
    public C110380d f330179i;

    /* renamed from: q82.b$a */
    public final class C110377a {

        /* renamed from: a */
        public final String f330180a;

        /* renamed from: b */
        public final C110194c f330181b;

        /* renamed from: c */
        public C110201e f330182c;

        public C110377a(C110376b bVar, String str, C110194c cVar) {
            C87412m.m108594g(str, "username");
            C87412m.m108594g(cVar, "textureObj");
            this.f330180a = str;
            this.f330181b = cVar;
        }
    }

    /* renamed from: q82.b$b */
    public final class C110378b {

        /* renamed from: a */
        public final C110194c f330183a;

        /* renamed from: b */
        public volatile boolean f330184b = true;

        /* renamed from: c */
        public final /* synthetic */ C110376b f330185c;

        public C110378b(C110376b bVar, C110194c cVar) {
            C87412m.m108594g(cVar, "textureObj");
            this.f330185c = bVar;
            this.f330183a = cVar;
        }

        /* renamed from: a */
        public final void mo161895a() {
            this.f330184b = false;
            C110376b bVar = this.f330185c;
            bVar.f330175e.add(this.f330183a);
        }
    }

    /* renamed from: q82.b$c */
    public final class C110379c {

        /* renamed from: a */
        public final C110378b f330186a;

        /* renamed from: b */
        public final C110378b f330187b;

        /* renamed from: c */
        public final C110378b f330188c;

        /* renamed from: d */
        public volatile boolean f330189d = true;

        /* renamed from: e */
        public ReentrantLock f330190e = new ReentrantLock();

        /* renamed from: f */
        public C110201e f330191f;

        public C110379c(C110376b bVar, String str, C110378b bVar2, C110378b bVar3, C110378b bVar4) {
            C87412m.m108594g(str, "username");
            C87412m.m108594g(bVar2, "yGLTextureObject");
            C87412m.m108594g(bVar3, "uGLTextureObject");
            C87412m.m108594g(bVar4, "vGLTextureObject");
            this.f330186a = bVar2;
            this.f330187b = bVar3;
            this.f330188c = bVar4;
        }
    }

    /* renamed from: q82.b$d */
    public final class C110380d {

        /* renamed from: a */
        public final String f330192a;

        /* renamed from: b */
        public final C110378b f330193b;

        /* renamed from: c */
        public volatile boolean f330194c;

        /* renamed from: d */
        public final ReadWriteLock f330195d = new ReentrantReadWriteLock();

        /* renamed from: e */
        public C110201e f330196e;

        public C110380d(C110376b bVar, String str, C110378b bVar2) {
            C87412m.m108594g(str, "username");
            C87412m.m108594g(bVar2, "textureWrapper");
            this.f330192a = str;
            this.f330193b = bVar2;
            this.f330194c = bVar2.f330184b;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.multitalk.mt_render.mt_render_impl.resource_pool.GLTextureManager$getTexture$2", mo125469f = "GLTextureManager.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: q82.b$e */
    public static final class C110381e extends C91594j implements C32227p<C0000n0, C15601d<? super C110378b>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C110376b f330197d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110381e(C110376b bVar, C15601d<? super C110381e> dVar) {
            super(2, dVar);
            this.f330197d = bVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C110381e(this.f330197d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C110381e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C110376b bVar = this.f330197d;
            C110194c poll = bVar.f330175e.poll();
            if (poll == null) {
                poll = C110193b.m149776b(true, 19);
                this.f330197d.f330176f.add(poll);
            }
            return new C110378b(bVar, poll);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.multitalk.mt_render.mt_render_impl.resource_pool.GLTextureManager", mo125469f = "GLTextureManager.kt", mo125470l = {80}, mo125471m = "getVBTextureWrapper")
    /* renamed from: q82.b$f */
    public static final class C110382f extends C66704d {

        /* renamed from: d */
        public Object f330198d;

        /* renamed from: e */
        public Object f330199e;

        /* renamed from: f */
        public Object f330200f;

        /* renamed from: g */
        public /* synthetic */ Object f330201g;

        /* renamed from: h */
        public final /* synthetic */ C110376b f330202h;

        /* renamed from: i */
        public int f330203i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110382f(C110376b bVar, C15601d<? super C110382f> dVar) {
            super(dVar);
            this.f330202h = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f330201g = obj;
            this.f330203i |= Integer.MIN_VALUE;
            return this.f330202h.mo161892b((String) null, false, this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.multitalk.mt_render.mt_render_impl.resource_pool.GLTextureManager", mo125469f = "GLTextureManager.kt", mo125470l = {52, 52, 52}, mo125471m = "getYuvTextureGroup")
    /* renamed from: q82.b$g */
    public static final class C110383g extends C66704d {

        /* renamed from: d */
        public Object f330204d;

        /* renamed from: e */
        public Object f330205e;

        /* renamed from: f */
        public Object f330206f;

        /* renamed from: g */
        public Object f330207g;

        /* renamed from: h */
        public Object f330208h;

        /* renamed from: i */
        public Object f330209i;

        /* renamed from: j */
        public /* synthetic */ Object f330210j;

        /* renamed from: n */
        public final /* synthetic */ C110376b f330211n;

        /* renamed from: o */
        public int f330212o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110383g(C110376b bVar, C15601d<? super C110383g> dVar) {
            super(dVar);
            this.f330211n = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f330210j = obj;
            this.f330212o |= Integer.MIN_VALUE;
            return this.f330211n.mo161893c((String) null, this);
        }
    }

    public C110376b(C53896h0 h0Var) {
        C87412m.m108594g(h0Var, "coroutineDispatcher");
        this.f330174d = h0Var;
    }

    /* renamed from: a */
    public final Object mo161891a(C15601d<? super C110378b> dVar) {
        C53896h0 h0Var = this.f330174d;
        C109284b.C109290b bVar = C109284b.f327183e;
        return C53895h.m60469g(h0Var.plus(C109284b.f327184f), new C110381e(this, (C15601d<? super C110381e>) null), dVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo161892b(java.lang.String r6, boolean r7, wx3.C15601d<? super q82.C110376b.C110380d> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof q82.C110376b.C110382f
            if (r0 == 0) goto L_0x0013
            r0 = r8
            q82.b$f r0 = (q82.C110376b.C110382f) r0
            int r1 = r0.f330203i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f330203i = r1
            goto L_0x0018
        L_0x0013:
            q82.b$f r0 = new q82.b$f
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f330201g
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f330203i
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 != r4) goto L_0x0034
            java.lang.Object r6 = r0.f330200f
            q82.b r6 = (q82.C110376b) r6
            java.lang.Object r7 = r0.f330199e
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r0 = r0.f330198d
            q82.b r0 = (q82.C110376b) r0
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x0066
        L_0x0034:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003c:
            kotlin.ResultKt.throwOnFailure(r8)
            q82.b$d r8 = r5.f330179i
            if (r8 == 0) goto L_0x0052
            java.lang.String r2 = r8.f330192a
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
            r0.f330198d = r5
            r0.f330199e = r6
            r0.f330200f = r5
            r0.f330203i = r4
            java.lang.Object r8 = r5.mo161891a(r0)
            if (r8 != r1) goto L_0x0063
            return r1
        L_0x0063:
            r0 = r5
            r7 = r6
            r6 = r0
        L_0x0066:
            q82.b$b r8 = (q82.C110376b.C110378b) r8
            q82.b$d r3 = new q82.b$d
            r3.<init>(r6, r7, r8)
            r0.f330179i = r3
        L_0x006f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: q82.C110376b.mo161892b(java.lang.String, boolean, wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00c0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00de A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo161893c(java.lang.String r18, wx3.C15601d<? super q82.C110376b.C110379c> r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r2 instanceof q82.C110376b.C110383g
            if (r3 == 0) goto L_0x0019
            r3 = r2
            q82.b$g r3 = (q82.C110376b.C110383g) r3
            int r4 = r3.f330212o
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f330212o = r4
            goto L_0x001e
        L_0x0019:
            q82.b$g r3 = new q82.b$g
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r2 = r3.f330210j
            xx3.a r4 = xx3.C15911a.COROUTINE_SUSPENDED
            int r5 = r3.f330212o
            r6 = 3
            r7 = 2
            r8 = 1
            if (r5 == 0) goto L_0x008a
            if (r5 == r8) goto L_0x0070
            if (r5 == r7) goto L_0x0058
            if (r5 != r6) goto L_0x0050
            java.lang.Object r1 = r3.f330209i
            q82.b$b r1 = (q82.C110376b.C110378b) r1
            java.lang.Object r4 = r3.f330208h
            q82.b$b r4 = (q82.C110376b.C110378b) r4
            java.lang.Object r5 = r3.f330207g
            q82.b r5 = (q82.C110376b) r5
            java.lang.Object r6 = r3.f330206f
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r3.f330205e
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r3 = r3.f330204d
            q82.b r3 = (q82.C110376b) r3
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
            java.lang.Object r1 = r3.f330208h
            q82.b$b r1 = (q82.C110376b.C110378b) r1
            java.lang.Object r5 = r3.f330207g
            q82.b r5 = (q82.C110376b) r5
            java.lang.Object r7 = r3.f330206f
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r3.f330205e
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r3.f330204d
            q82.b r9 = (q82.C110376b) r9
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x00c8
        L_0x0070:
            java.lang.Object r1 = r3.f330207g
            q82.b r1 = (q82.C110376b) r1
            java.lang.Object r5 = r3.f330206f
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r8 = r3.f330205e
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r3.f330204d
            q82.b r9 = (q82.C110376b) r9
            kotlin.ResultKt.throwOnFailure(r2)
            r16 = r2
            r2 = r1
            r1 = r5
            r5 = r16
            goto L_0x00ac
        L_0x008a:
            kotlin.ResultKt.throwOnFailure(r2)
            android.util.ArrayMap<java.lang.String, q82.b$c> r2 = r0.f330177g
            java.lang.Object r2 = r2.get(r1)
            q82.b$c r2 = (q82.C110376b.C110379c) r2
            if (r2 != 0) goto L_0x00f4
            r3.f330204d = r0
            r3.f330205e = r1
            r3.f330206f = r1
            r3.f330207g = r0
            r3.f330212o = r8
            java.lang.Object r2 = r0.mo161891a(r3)
            if (r2 != r4) goto L_0x00a8
            return r4
        L_0x00a8:
            r9 = r0
            r8 = r1
            r5 = r2
            r2 = r9
        L_0x00ac:
            q82.b$b r5 = (q82.C110376b.C110378b) r5
            r3.f330204d = r9
            r3.f330205e = r8
            r3.f330206f = r1
            r3.f330207g = r2
            r3.f330208h = r5
            r3.f330212o = r7
            java.lang.Object r7 = r9.mo161891a(r3)
            if (r7 != r4) goto L_0x00c1
            return r4
        L_0x00c1:
            r16 = r7
            r7 = r1
            r1 = r5
            r5 = r2
            r2 = r16
        L_0x00c8:
            q82.b$b r2 = (q82.C110376b.C110378b) r2
            r3.f330204d = r9
            r3.f330205e = r8
            r3.f330206f = r7
            r3.f330207g = r5
            r3.f330208h = r1
            r3.f330209i = r2
            r3.f330212o = r6
            java.lang.Object r3 = r9.mo161891a(r3)
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
            q82.b$b r15 = (q82.C110376b.C110378b) r15
            q82.b$c r2 = new q82.b$c
            r10 = r2
            r10.<init>(r11, r12, r13, r14, r15)
            android.util.ArrayMap<java.lang.String, q82.b$c> r1 = r3.f330177g
            r1.put(r7, r2)
        L_0x00f4:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: q82.C110376b.mo161893c(java.lang.String, wx3.d):java.lang.Object");
    }

    public void close() {
        Log.m105924i("MicroMsg.MTR.GLTextureManager", "close");
        C110380d dVar = this.f330179i;
        if (dVar != null) {
            dVar.f330193b.mo161895a();
        }
        for (Map.Entry next : this.f330177g.entrySet()) {
            C87412m.m108593f(next, "yuvTextureGroupHolder.entries");
            C110379c cVar = (C110379c) next.getValue();
            cVar.f330189d = false;
            cVar.f330186a.mo161895a();
            cVar.f330187b.mo161895a();
            cVar.f330188c.mo161895a();
        }
        Iterator<C110194c> it = this.f330176f.iterator();
        while (it.hasNext()) {
            it.next().close();
        }
        this.f330177g.clear();
        this.f330175e.clear();
        this.f330176f.clear();
    }
}
