package ox0;

import gy3.C87412m;
import ht1.C60171g1;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import te3.C22521pi1;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: ox0.b */
public final class C21905b {

    /* renamed from: a */
    public static final C21905b f61956a = new C21905b();

    /* renamed from: b */
    public static final Object f61957b = new Object();

    /* renamed from: c */
    public static final Map<WeakReference<C60171g1>, String> f61958c = new LinkedHashMap();

    /* renamed from: d */
    public static final Set<C60171g1> f61959d = new LinkedHashSet();

    /* renamed from: e */
    public static final Set<C60171g1> f61960e = new LinkedHashSet();

    @C91590f(mo125468c = "com.tencent.mm.plugin.brandservice.ui.timeline.finder.BizTimeLineFinderPlayerHelper", mo125469f = "BizTimeLineFinderPlayerHelper.kt", mo125470l = {36}, mo125471m = "createFinderPlayer")
    /* renamed from: ox0.b$b */
    public static final class C21906b extends C66704d {

        /* renamed from: d */
        public Object f61961d;

        /* renamed from: e */
        public /* synthetic */ Object f61962e;

        /* renamed from: f */
        public final /* synthetic */ C21905b f61963f;

        /* renamed from: g */
        public int f61964g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21906b(C21905b bVar, C15601d<? super C21906b> dVar) {
            super(dVar);
            this.f61963f = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f61962e = obj;
            this.f61964g |= Integer.MIN_VALUE;
            return this.f61963f.mo34946a((C22521pi1) null, this);
        }
    }

    /* renamed from: ox0.b$a */
    public static final class C21907a<T> extends WeakReference<T> {
        public C21907a(T t) {
            super(t);
        }

        public boolean equals(Object obj) {
            if (!(obj == null ? true : obj instanceof WeakReference)) {
                return false;
            }
            WeakReference weakReference = (WeakReference) obj;
            return C87412m.m108589b(get(), weakReference != null ? weakReference.get() : null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo34946a(te3.C22521pi1 r18, wx3.C15601d<? super ht1.C60171g1> r19) {
        /*
            r17 = this;
            r0 = r18
            r1 = r19
            boolean r2 = r1 instanceof ox0.C21905b.C21906b
            if (r2 == 0) goto L_0x0019
            r2 = r1
            ox0.b$b r2 = (ox0.C21905b.C21906b) r2
            int r3 = r2.f61964g
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0019
            int r3 = r3 - r4
            r2.f61964g = r3
            r3 = r17
            goto L_0x0020
        L_0x0019:
            ox0.b$b r2 = new ox0.b$b
            r3 = r17
            r2.<init>(r3, r1)
        L_0x0020:
            r13 = r2
            java.lang.Object r1 = r13.f61962e
            xx3.a r2 = xx3.C15911a.COROUTINE_SUSPENDED
            int r4 = r13.f61964g
            r14 = 0
            r15 = 0
            r12 = 1
            if (r4 == 0) goto L_0x0041
            if (r4 != r12) goto L_0x0039
            java.lang.Object r0 = r13.f61961d
            te3.pi1 r0 = (te3.C22521pi1) r0
            kotlin.ResultKt.throwOnFailure(r1)
            r16 = 1
            goto L_0x00d7
        L_0x0039:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0041:
            kotlin.ResultKt.throwOnFailure(r1)
            if (r0 == 0) goto L_0x0118
            java.lang.Object r1 = f61957b
            monitor-enter(r1)
            java.util.Set<ht1.g1> r4 = f61960e     // Catch:{ all -> 0x0115 }
            int r5 = r4.size()     // Catch:{ all -> 0x0115 }
            if (r5 <= 0) goto L_0x005f
            java.lang.Object r5 = sx3.C110818d0.m150913K(r4)     // Catch:{ all -> 0x0115 }
            r6 = r5
            ht1.g1 r6 = (ht1.C60171g1) r6     // Catch:{ all -> 0x0115 }
            r4.remove(r6)     // Catch:{ all -> 0x0115 }
            ht1.g1 r5 = (ht1.C60171g1) r5     // Catch:{ all -> 0x0115 }
            r11 = r5
            goto L_0x0060
        L_0x005f:
            r11 = r14
        L_0x0060:
            monitor-exit(r1)
            java.lang.String r1 = "MicroMsg.BizTimeLineFinderPlayerHelper"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "[createFinderPlayer] is using cache to create player:"
            r5.append(r6)
            if (r11 == 0) goto L_0x0071
            r6 = 1
            goto L_0x0072
        L_0x0071:
            r6 = 0
        L_0x0072:
            r5.append(r6)
            java.lang.String r6 = "  current cache size:"
            r5.append(r6)
            java.util.Set<ht1.g1> r6 = f61959d
            int r6 = r6.size()
            int r4 = r4.size()
            int r6 = r6 + r4
            r5.append(r6)
            java.lang.String r4 = "  using cache["
            r5.append(r4)
            if (r11 == 0) goto L_0x0095
            java.lang.String r4 = r11.toString()
            if (r4 != 0) goto L_0x0097
        L_0x0095:
            java.lang.String r4 = ""
        L_0x0097:
            r5.append(r4)
            java.lang.String r4 = "] for:"
            r5.append(r4)
            java.lang.String r4 = r0.f64433p
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r4)
            java.lang.Class<ht1.t1> r1 = ht1.C60200t1.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            r4 = r1
            ht1.t1 r4 = (ht1.C60200t1) r4
            if (r4 == 0) goto L_0x0114
            java.lang.String r1 = r0.f64435r
            long r5 = o40.C61926c.m72671P(r1)
            java.lang.String r7 = r0.f64437t
            java.lang.String r1 = "finderData.finder_object_nonce_id"
            gy3.C87412m.m108593f(r7, r1)
            r8 = 25
            r9 = 600000(0x927c0, double:2.964394E-318)
            r1 = 0
            r13.f61961d = r0
            r13.f61964g = r12
            r16 = 1
            r12 = r1
            java.lang.Object r1 = r4.Jb0(r5, r7, r8, r9, r11, r12, r13)
            if (r1 != r2) goto L_0x00d7
            return r2
        L_0x00d7:
            ht1.g1 r1 = (ht1.C60171g1) r1
            if (r1 == 0) goto L_0x0114
            java.lang.Object r2 = f61957b
            monitor-enter(r2)
            java.util.Map<java.lang.ref.WeakReference<ht1.g1>, java.lang.String> r4 = f61958c     // Catch:{ all -> 0x0111 }
            ox0.b$a r5 = new ox0.b$a     // Catch:{ all -> 0x0111 }
            r5.<init>(r1)     // Catch:{ all -> 0x0111 }
            java.lang.String r0 = r0.f64435r     // Catch:{ all -> 0x0111 }
            java.lang.String r6 = "finderData.finder_object_id"
            gy3.C87412m.m108593f(r0, r6)     // Catch:{ all -> 0x0111 }
            r4.put(r5, r0)     // Catch:{ all -> 0x0111 }
            java.util.Set<ht1.g1> r0 = f61959d     // Catch:{ all -> 0x0111 }
            int r4 = r0.size()     // Catch:{ all -> 0x0111 }
            java.util.Set<ht1.g1> r5 = f61960e     // Catch:{ all -> 0x0111 }
            int r5 = r5.size()     // Catch:{ all -> 0x0111 }
            int r4 = r4 + r5
            r5 = 7
            if (r4 >= r5) goto L_0x0100
            r15 = 1
        L_0x0100:
            if (r15 == 0) goto L_0x010c
            java.lang.String r4 = "MicroMsg.BizTimeLineFinderPlayerHelper"
            java.lang.String r5 = "[createFinderPlayer] store result to using cache"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)     // Catch:{ all -> 0x0111 }
            r0.add(r1)     // Catch:{ all -> 0x0111 }
        L_0x010c:
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0111 }
            monitor-exit(r2)
            r14 = r1
            goto L_0x0114
        L_0x0111:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0114:
            return r14
        L_0x0115:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0118:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: ox0.C21905b.mo34946a(te3.pi1, wx3.d):java.lang.Object");
    }
}
