package fj1;

import androidx.lifecycle.C0125s;
import androidx.lifecycle.C103766u;
import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C39623j;
import androidx.lifecycle.C54209k0;
import cl1.C54991o;
import com.tencent.p014mm.plugin.finder.live.infrastructure.coroutine.C55908a;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: fj1.b */
public final class C45795b extends C32060d implements C0125s {

    /* renamed from: j */
    public static final C32059a f123697j = new C32059a((C8480h) null);

    /* renamed from: n */
    public static C45795b f123698n = new C45795b("from LivingBuContext");

    /* renamed from: f */
    public final String f123699f;

    /* renamed from: g */
    public final String f123700g;

    /* renamed from: h */
    public C103766u f123701h;

    /* renamed from: i */
    public C55908a f123702i;

    /* renamed from: fj1.b$a */
    public static final class C32059a {
        public C32059a(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo58474a(C45795b bVar) {
            C45795b.f123698n = bVar;
            Log.m105924i("LivingBuContext", "LivingBuContext set value " + bVar + ' ' + "");
        }
    }

    /* renamed from: fj1.b$b */
    public static final class C45796b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C45795b f123703d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45796b(C45795b bVar) {
            super(0);
            this.f123703d = bVar;
        }

        public Object invoke() {
            C103766u uVar = this.f123703d.f123701h;
            if (uVar.f306531b != C39623j.C39626c.INITIALIZED) {
                uVar.mo145138f(C39623j.C39626c.DESTROYED);
            }
            return C13598b0.f38549a;
        }
    }

    public C45795b() {
        this((String) null, 1, (C8480h) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45795b(String str) {
        super(str);
        C87412m.m108594g(str, "tag");
        this.f123699f = str;
        this.f123700g = "LiveBuContext_TAG";
        Log.m105924i("LiveBuContext_TAG", "init name = " + str + ", hashCode = " + hashCode());
        this.f123701h = new C103766u(this);
        this.f123702i = new C55908a(this, "liveScope");
    }

    /* renamed from: a */
    public final <T extends C39622i0> T mo71262a(Class<T> cls) {
        C87412m.m108594g(cls, "bu");
        T a = new C54209k0(getViewModelStore(), (C54209k0.C54210b) new C45794a(this)).mo75002a(cls);
        C87412m.m108593f(a, "of(this).get(bu)");
        return a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a6, code lost:
        er1.C58739j4.f168176a.mo83712h0(r0, "LiveContext clear");
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo71263b() {
        /*
            r5 = this;
            java.lang.String r0 = r5.f123700g
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "clear name = "
            r1.append(r2)
            java.lang.String r2 = r5.f123699f
            r1.append(r2)
            java.lang.String r2 = ", hashCode = "
            r1.append(r2)
            int r2 = r5.hashCode()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            java.lang.String r0 = "LiveContext"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "LiveContext clear "
            r1.append(r2)
            fj1.d$a<java.lang.String, androidx.lifecycle.i0> r2 = r5.f85307d
            int r2 = r2.size()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            java.util.LinkedList r0 = new java.util.LinkedList     // Catch:{ Exception -> 0x00a5 }
            r0.<init>()     // Catch:{ Exception -> 0x00a5 }
            fj1.d$a<java.lang.String, androidx.lifecycle.i0> r1 = r5.f85307d     // Catch:{ Exception -> 0x00a5 }
            monitor-enter(r1)     // Catch:{ Exception -> 0x00a5 }
            java.util.Set r2 = r1.entrySet()     // Catch:{ all -> 0x00a2 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x00a2 }
        L_0x0050:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x00a2 }
            if (r3 == 0) goto L_0x006e
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x00a2 }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x00a2 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x00a2 }
            boolean r4 = r3 instanceof cl1.C39970c     // Catch:{ all -> 0x00a2 }
            if (r4 == 0) goto L_0x0067
            cl1.c r3 = (cl1.C39970c) r3     // Catch:{ all -> 0x00a2 }
            goto L_0x0068
        L_0x0067:
            r3 = 0
        L_0x0068:
            if (r3 == 0) goto L_0x0050
            r0.add(r3)     // Catch:{ all -> 0x00a2 }
            goto L_0x0050
        L_0x006e:
            monitor-exit(r1)     // Catch:{ Exception -> 0x00a5 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x00a5 }
        L_0x0073:
            boolean r1 = r0.hasNext()     // Catch:{ Exception -> 0x00a5 }
            if (r1 == 0) goto L_0x00ad
            java.lang.Object r1 = r0.next()     // Catch:{ Exception -> 0x00a5 }
            cl1.c r1 = (cl1.C39970c) r1     // Catch:{ Exception -> 0x00a5 }
            java.lang.String r2 = "LiveContext"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a5 }
            r3.<init>()     // Catch:{ Exception -> 0x00a5 }
            java.lang.String r4 = "[reset] "
            r3.append(r4)     // Catch:{ Exception -> 0x00a5 }
            int r4 = r1.hashCode()     // Catch:{ Exception -> 0x00a5 }
            r3.append(r4)     // Catch:{ Exception -> 0x00a5 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x00a5 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)     // Catch:{ Exception -> 0x00a5 }
            r1.onCleared()     // Catch:{ Exception -> 0x00a5 }
            jp3.c<jp3.a> r1 = r1.f107147e     // Catch:{ Exception -> 0x00a5 }
            r1.dead()     // Catch:{ Exception -> 0x00a5 }
            goto L_0x0073
        L_0x00a2:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ Exception -> 0x00a5 }
            throw r0     // Catch:{ Exception -> 0x00a5 }
        L_0x00a5:
            r0 = move-exception
            er1.j4 r1 = er1.C58739j4.f168176a
            java.lang.String r2 = "LiveContext clear"
            r1.mo83712h0(r0, r2)
        L_0x00ad:
            fj1.b$b r0 = new fj1.b$b
            r0.<init>(r5)
            o40.C61926c.m72668M(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fj1.C45795b.mo71263b():void");
    }

    public C39623j getLifecycle() {
        return this.f123701h;
    }

    public String toString() {
        return this.f123699f + '_' + mo71262a(C54991o.class);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C45795b(String str, int i, C8480h hVar) {
        this((i & 1) != 0 ? "" : str);
    }
}
