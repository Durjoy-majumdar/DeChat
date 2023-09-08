package fn1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j31.C9279c;
import ob0.C89132b;
import te3.C49548ge1;
import wx3.C15601d;
import xm1.C15819a;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: fn1.b */
public final class C8168b extends C9279c<String, C89132b.C89134c<C49548ge1>> {

    /* renamed from: e */
    public boolean f27055e;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.nearby.newlivesquare.net.cgi.NearLiveStreamCache", mo125469f = "NearLiveStreamFutureTask.kt", mo125470l = {67}, mo125471m = "clear")
    /* renamed from: fn1.b$a */
    public static final class C8169a extends C66704d {

        /* renamed from: d */
        public Object f27056d;

        /* renamed from: e */
        public /* synthetic */ Object f27057e;

        /* renamed from: f */
        public final /* synthetic */ C8168b f27058f;

        /* renamed from: g */
        public int f27059g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8169a(C8168b bVar, C15601d<? super C8169a> dVar) {
            super(dVar);
            this.f27058f = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f27057e = obj;
            this.f27059g |= Integer.MIN_VALUE;
            return this.f27058f.mo9228j(this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.nearby.newlivesquare.net.cgi.NearLiveStreamCache", mo125469f = "NearLiveStreamFutureTask.kt", mo125470l = {55}, mo125471m = "requestCache")
    /* renamed from: fn1.b$b */
    public static final class C8170b extends C66704d {

        /* renamed from: d */
        public Object f27060d;

        /* renamed from: e */
        public /* synthetic */ Object f27061e;

        /* renamed from: f */
        public final /* synthetic */ C8168b f27062f;

        /* renamed from: g */
        public int f27063g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8170b(C8168b bVar, C15601d<? super C8170b> dVar) {
            super(dVar);
            this.f27062f = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f27061e = obj;
            this.f27063g |= Integer.MIN_VALUE;
            return this.f27062f.mo378d(this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8168b(String str) {
        super(str);
        C87412m.m108594g(str, "key");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo378d(wx3.C15601d<? super ob0.C89132b.C89134c<te3.C49548ge1>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof fn1.C8168b.C8170b
            if (r0 == 0) goto L_0x0013
            r0 = r6
            fn1.b$b r0 = (fn1.C8168b.C8170b) r0
            int r1 = r0.f27063g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f27063g = r1
            goto L_0x0018
        L_0x0013:
            fn1.b$b r0 = new fn1.b$b
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f27061e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f27063g
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0034
            if (r2 != r4) goto L_0x002c
            java.lang.Object r0 = r0.f27060d
            fn1.b r0 = (fn1.C8168b) r0
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0052
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0034:
            kotlin.ResultKt.throwOnFailure(r6)
            a14.u0<? extends _result> r6 = r5.f29029d
            if (r6 == 0) goto L_0x0043
            boolean r6 = r6.mo74466a()
            if (r6 != r4) goto L_0x0043
            r6 = 1
            goto L_0x0044
        L_0x0043:
            r6 = 0
        L_0x0044:
            r5.f27055e = r6
            r0.f27060d = r5
            r0.f27063g = r4
            java.lang.Object r6 = j31.C9279c.m8917i(r5, r0)
            if (r6 != r1) goto L_0x0051
            return r1
        L_0x0051:
            r0 = r5
        L_0x0052:
            ob0.b$c r6 = (ob0.C89132b.C89134c) r6
            r0.f27055e = r3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "requestCache: errType = "
            r0.append(r1)
            r1 = 0
            if (r6 == 0) goto L_0x006b
            int r2 = r6.f256793a
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r2)
            goto L_0x006c
        L_0x006b:
            r3 = r1
        L_0x006c:
            r0.append(r3)
            java.lang.String r2 = ", errCode="
            r0.append(r2)
            if (r6 == 0) goto L_0x007e
            int r1 = r6.f256794b
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r1)
            r1 = r2
        L_0x007e:
            r0.append(r1)
            java.lang.String r1 = ", cache="
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "NearLiveStreamCache"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: fn1.C8168b.mo378d(wx3.d):java.lang.Object");
    }

    /* renamed from: e */
    public void mo379e(Object obj, long j) {
        _result _result = (C89132b.C89134c) obj;
        C87412m.m108594g(_result, "result");
        this.f29027b = _result;
        this.f29028c = j;
        C49548ge1 ge12 = (C49548ge1) _result.f256796d;
        if (ge12 != null) {
            C15819a aVar = C15819a.f42619a;
            C15819a.f42621c = System.currentTimeMillis();
            C15819a.f42620b = ((long) ge12.f133996f) * ((long) 1000);
            Log.m105924i("NearLiveStreamCache", "saveCache: prefetchInterval = " + C15819a.f42620b);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
        if ((r2 + xm1.C15819a.f42621c) > java.lang.System.currentTimeMillis()) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000e, code lost:
        r0 = (te3.C49548ge1) r0.f256796d;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo380g() {
        /*
            r6 = this;
            _result r0 = r6.f29027b
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            boolean r2 = r6.f27055e
            if (r2 != 0) goto L_0x0028
            ob0.b$c r0 = (ob0.C89132b.C89134c) r0
            if (r0 == 0) goto L_0x0017
            T r0 = r0.f256796d
            te3.ge1 r0 = (te3.C49548ge1) r0
            if (r0 == 0) goto L_0x0017
            int r0 = r0.f133996f
            goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            int r0 = r0 * 1000
            long r2 = (long) r0
            xm1.a r0 = xm1.C15819a.f42619a
            long r4 = xm1.C15819a.f42621c
            long r2 = r2 + r4
            long r4 = java.lang.System.currentTimeMillis()
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0029
        L_0x0028:
            r1 = 1
        L_0x0029:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "checkCacheAvailable: result="
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", doNotCheckTime="
            r0.append(r2)
            boolean r2 = r6.f27055e
            r0.append(r2)
            java.lang.String r2 = "prefech_min_interval="
            r0.append(r2)
            _result r2 = r6.f29027b
            ob0.b$c r2 = (ob0.C89132b.C89134c) r2
            if (r2 == 0) goto L_0x0058
            T r2 = r2.f256796d
            te3.ge1 r2 = (te3.C49548ge1) r2
            if (r2 == 0) goto L_0x0058
            int r2 = r2.f133996f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0059
        L_0x0058:
            r2 = 0
        L_0x0059:
            r0.append(r2)
            java.lang.String r2 = ", lastRespSetTime="
            r0.append(r2)
            xm1.a r2 = xm1.C15819a.f42619a
            long r2 = xm1.C15819a.f42621c
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "NearLiveStreamCache"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: fn1.C8168b.mo380g():boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo9228j(wx3.C15601d<? super rx3.C13598b0> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof fn1.C8168b.C8169a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            fn1.b$a r0 = (fn1.C8168b.C8169a) r0
            int r1 = r0.f27059g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f27059g = r1
            goto L_0x0018
        L_0x0013:
            fn1.b$a r0 = new fn1.b$a
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f27057e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f27059g
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0034
            if (r2 != r4) goto L_0x002c
            java.lang.Object r0 = r0.f27056d
            fn1.b r0 = (fn1.C8168b) r0
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0075
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0034:
            kotlin.ResultKt.throwOnFailure(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r2 = "clearCache: preloadJob="
            r6.append(r2)
            a14.u0<? extends _result> r2 = r5.f29029d
            r6.append(r2)
            java.lang.String r2 = ", isActive="
            r6.append(r2)
            a14.u0<? extends _result> r2 = r5.f29029d
            if (r2 == 0) goto L_0x0058
            boolean r2 = r2.mo74466a()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            goto L_0x0059
        L_0x0058:
            r2 = r3
        L_0x0059:
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            java.lang.String r2 = "NearLiveStreamCache"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r6)
            a14.u0<? extends _result> r6 = r5.f29029d
            if (r6 == 0) goto L_0x0074
            r0.f27056d = r5
            r0.f27059g = r4
            java.lang.Object r6 = a14.C53873d2.m60391c(r6, r0)
            if (r6 != r1) goto L_0x0074
            return r1
        L_0x0074:
            r0 = r5
        L_0x0075:
            r0.f29027b = r3
            r1 = 0
            r0.f29028c = r1
            rx3.b0 r6 = rx3.C13598b0.f38549a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: fn1.C8168b.mo9228j(wx3.d):java.lang.Object");
    }
}
