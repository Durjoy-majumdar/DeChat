package yc1;

import ad1.C54028b;
import ad1.C54029c;
import android.content.ContentValues;
import bd1.C0263a;
import bd1.C0264h;
import bd1.C39757e;
import bd1.C39758f;
import bd1.C39759i;
import bd1.C54446b;
import bd1.C54447c;
import bd1.C54449g;
import bd1.C54450j;
import bl3.C54496x;
import cd1.C0448b;
import cd1.C0449c;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.p014mm.vfs.C86013q1;
import cy3.C86147a;
import dd1.C45327d;
import dd1.C45328f;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C45983e0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import hd1.C46019a;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import jd1.C46470a;
import jd1.C60793b;
import kotlin.Result;
import kotlin.ResultKt;
import o40.C35102g;
import o40.C61937h;
import ob0.C89132b;
import p151er.C58676k;
import p823sg.C101614i;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import sx3.C110823p;
import sx3.C36907w;
import te3.C49183dr2;
import te3.C50119ke1;
import te3.C51430tq0;
import tf0.C64916p1;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C66704d;
import yx3.C91590f;
import zc1.C66783a;

/* renamed from: yc1.g */
public final class C66611g extends C54496x<C58676k, C54449g> implements C66783a {

    /* renamed from: d */
    public final C13601g f191536d = C36568h.m40985a(new C66620i(this));

    /* renamed from: e */
    public final MMHandler f191537e;

    /* renamed from: f */
    public final C46019a f191538f;

    /* renamed from: g */
    public final ConcurrentHashMap<String, C54446b> f191539g;

    /* renamed from: h */
    public final C13601g f191540h;

    /* renamed from: i */
    public final C13601g f191541i;

    /* renamed from: j */
    public final C101614i<String, C0264h> f191542j;

    /* renamed from: n */
    public boolean f191543n;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.account.FinderAccountManager", mo125469f = "FinderAccountManager.kt", mo125470l = {322}, mo125471m = "awaitCgiFinderCreateAccount-gIAlu-s")
    /* renamed from: yc1.g$a */
    public static final class C66612a extends C66704d {

        /* renamed from: d */
        public /* synthetic */ Object f191544d;

        /* renamed from: e */
        public final /* synthetic */ C66611g f191545e;

        /* renamed from: f */
        public int f191546f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66612a(C66611g gVar, C15601d<? super C66612a> dVar) {
            super(dVar);
            this.f191545e = gVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f191544d = obj;
            this.f191546f |= Integer.MIN_VALUE;
            Object J2 = this.f191545e.mo90659J2((C0263a) null, this);
            return J2 == C15911a.COROUTINE_SUSPENDED ? J2 : Result.m168113boximpl(J2);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.account.FinderAccountManager", mo125469f = "FinderAccountManager.kt", mo125470l = {318}, mo125471m = "awaitCgiFinderInit-gIAlu-s")
    /* renamed from: yc1.g$b */
    public static final class C66613b extends C66704d {

        /* renamed from: d */
        public /* synthetic */ Object f191547d;

        /* renamed from: e */
        public final /* synthetic */ C66611g f191548e;

        /* renamed from: f */
        public int f191549f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66613b(C66611g gVar, C15601d<? super C66613b> dVar) {
            super(dVar);
            this.f191548e = gVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f191547d = obj;
            this.f191549f |= Integer.MIN_VALUE;
            Object W0 = this.f191548e.mo90666W0((String) null, this);
            return W0 == C15911a.COROUTINE_SUSPENDED ? W0 : Result.m168113boximpl(W0);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.account.FinderAccountManager", mo125469f = "FinderAccountManager.kt", mo125470l = {314}, mo125471m = "awaitCgiFinderUsersPrepare-gIAlu-s")
    /* renamed from: yc1.g$c */
    public static final class C66614c extends C66704d {

        /* renamed from: d */
        public /* synthetic */ Object f191550d;

        /* renamed from: e */
        public final /* synthetic */ C66611g f191551e;

        /* renamed from: f */
        public int f191552f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66614c(C66611g gVar, C15601d<? super C66614c> dVar) {
            super(dVar);
            this.f191551e = gVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f191550d = obj;
            this.f191552f |= Integer.MIN_VALUE;
            Object u0 = this.f191551e.mo90679u0(0, this);
            return u0 == C15911a.COROUTINE_SUSPENDED ? u0 : Result.m168113boximpl(u0);
        }
    }

    /* renamed from: yc1.g$d */
    public static final class C66615d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C66611g f191553d;

        /* renamed from: e */
        public final /* synthetic */ C54446b f191554e;

        /* renamed from: f */
        public final /* synthetic */ C39759i f191555f;

        public C66615d(C66611g gVar, C54446b bVar, C39759i iVar) {
            this.f191553d = gVar;
            this.f191554e = bVar;
            this.f191555f = iVar;
        }

        public final void run() {
            CopyOnWriteArraySet<C54028b> copyOnWriteArraySet = this.f191553d.mo75316W2().f152701f;
            C54446b bVar = this.f191554e;
            C39759i iVar = this.f191555f;
            for (C54028b c : copyOnWriteArraySet) {
                c.mo74691c(bVar, iVar.name());
            }
        }
    }

    /* renamed from: yc1.g$e */
    public static final class C66616e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ HashSet<C54446b> f191556d;

        /* renamed from: e */
        public final /* synthetic */ C66611g f191557e;

        /* renamed from: f */
        public final /* synthetic */ C39759i f191558f;

        public C66616e(HashSet<C54446b> hashSet, C66611g gVar, C39759i iVar) {
            this.f191556d = hashSet;
            this.f191557e = gVar;
            this.f191558f = iVar;
        }

        public final void run() {
            HashSet<C54446b> hashSet = this.f191556d;
            C66611g gVar = this.f191557e;
            C39759i iVar = this.f191558f;
            for (C54446b bVar : hashSet) {
                for (C54028b c : gVar.mo75316W2().f152701f) {
                    C87412m.m108593f(bVar, "deletedAccount");
                    c.mo74691c(bVar, iVar.name());
                }
            }
        }
    }

    /* renamed from: yc1.g$f */
    public static final class C66617f extends C87413o implements C32224a<C46470a> {

        /* renamed from: d */
        public static final C66617f f191559d = new C66617f();

        public C66617f() {
            super(0);
        }

        public Object invoke() {
            return new C46470a(((C58676k) C86312j.m106911c(C58676k.class)).Kg0());
        }
    }

    /* renamed from: yc1.g$g */
    public static final class C66618g implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C66611g f191560d;

        /* renamed from: e */
        public final /* synthetic */ C45983e0 f191561e;

        /* renamed from: f */
        public final /* synthetic */ C54446b f191562f;

        /* renamed from: g */
        public final /* synthetic */ C39759i f191563g;

        public C66618g(C66611g gVar, C45983e0 e0Var, C54446b bVar, C39759i iVar) {
            this.f191560d = gVar;
            this.f191561e = e0Var;
            this.f191562f = bVar;
            this.f191563g = iVar;
        }

        public final void run() {
            CopyOnWriteArraySet<C54028b> copyOnWriteArraySet = this.f191560d.mo75316W2().f152701f;
            C45983e0 e0Var = this.f191561e;
            C54446b bVar = this.f191562f;
            C39759i iVar = this.f191563g;
            for (C54028b bVar2 : copyOnWriteArraySet) {
                int i = (e0Var.f124000d > 0 ? 1 : (e0Var.f124000d == 0 ? 0 : -1));
                String name = iVar.name();
                if (i < 0) {
                    bVar2.mo74692d(bVar, name);
                } else {
                    bVar2.mo74690a(bVar, name);
                }
            }
        }
    }

    /* renamed from: yc1.g$h */
    public static final class C66619h extends C87413o implements C32224a<C60793b> {

        /* renamed from: d */
        public static final C66619h f191564d = new C66619h();

        public C66619h() {
            super(0);
        }

        public Object invoke() {
            return new C60793b(((C58676k) C86312j.m106911c(C58676k.class)).a20());
        }
    }

    /* renamed from: yc1.g$i */
    public static final class C66620i extends C87413o implements C32224a<C54449g> {

        /* renamed from: d */
        public final /* synthetic */ C66611g f191565d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66620i(C66611g gVar) {
            super(0);
            this.f191565d = gVar;
        }

        public Object invoke() {
            C54449g gVar = new C54449g();
            C46470a aVar = (C46470a) ((C36570n) this.f191565d.f191541i).getValue();
            aVar.getClass();
            C39757e eVar = new C39757e();
            try {
                Result.Companion companion = Result.Companion;
                InputStream D = C86013q1.m106422D(aVar.f125196a);
                C87412m.m108593f(D, "openRead(this)");
                Result.m168114constructorimpl(eVar.parseFrom(C86147a.m106661c(D)));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                Result.m168114constructorimpl(ResultKt.createFailure(th));
            }
            gVar.f152700e = eVar;
            return gVar;
        }
    }

    public C66611g() {
        MMHandler mMHandler = new MMHandler("FinderAccountManager.Notify");
        mMHandler.setLogging(false);
        this.f191537e = mMHandler;
        this.f191538f = new C46019a();
        this.f191539g = new ConcurrentHashMap<>();
        this.f191540h = C36568h.m40985a(C66619h.f191564d);
        this.f191541i = C36568h.m40985a(C66617f.f191559d);
        this.f191542j = new C101614i<>(20);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: C2 */
    public void mo90655C2(C39759i iVar) {
        C87412m.m108594g(iVar, FirebaseAnalytics.C113379b.SOURCE);
        HashSet hashSet = new HashSet(this.f191539g.values());
        long currentTimeMillis = System.currentTimeMillis();
        try {
            for (C54446b delete : mo90668b2(true)) {
                mo90669c3().delete(delete, new String[0]);
            }
            this.f191539g.clear();
            this.f191537e.post(new C66616e(hashSet, this, iVar));
            C35102g gVar = new C35102g(Boolean.TRUE, System.currentTimeMillis() - currentTimeMillis, false, 4, (C8480h) null);
            mo90667X1("");
            Log.m105928w("Finder.AccountManager", "[deleteAllAccount] source=" + iVar + ' ' + hashSet + ' ' + gVar);
        } catch (Throwable th) {
            System.currentTimeMillis();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: D2 */
    public void mo90656D2(C39759i iVar) {
        C87412m.m108594g(iVar, FirebaseAnalytics.C113379b.SOURCE);
        long currentTimeMillis = System.currentTimeMillis();
        try {
            C35102g gVar = new C35102g(Boolean.valueOf(((C46470a) ((C36570n) this.f191541i).getValue()).f125196a.mo119966f()), System.currentTimeMillis() - currentTimeMillis, false, 4, (C8480h) null);
            Log.m105928w("Finder.AccountManager", "[deleteAccountPublicInfo] source=" + iVar + ' ' + gVar);
        } catch (Throwable th) {
            System.currentTimeMillis();
            throw th;
        }
    }

    /* renamed from: E1 */
    public void mo90657E1(String str, C0264h hVar) {
        C87412m.m108594g(str, "finderUserName");
        C87412m.m108594g(hVar, "info");
        this.f191542j.put(str, hVar);
        ((C64916p1) C86312j.m106911c(C64916p1.class)).sa0(str, hVar);
    }

    /* renamed from: I1 */
    public String mo90658I1() {
        String str = mo90673n0().f131580d;
        return str == null ? "" : str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: J2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo90659J2(bd1.C0263a r9, wx3.C15601d<? super kotlin.Result<? extends te3.C49998jj0>> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof yc1.C66611g.C66612a
            if (r0 == 0) goto L_0x0013
            r0 = r10
            yc1.g$a r0 = (yc1.C66611g.C66612a) r0
            int r1 = r0.f191546f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f191546f = r1
            goto L_0x0018
        L_0x0013:
            yc1.g$a r0 = new yc1.g$a
            r0.<init>(r8, r10)
        L_0x0018:
            r5 = r0
            java.lang.Object r10 = r5.f191544d
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r5.f191546f
            r2 = 1
            if (r1 == 0) goto L_0x0030
            if (r1 != r2) goto L_0x0028
            kotlin.ResultKt.throwOnFailure(r10)     // Catch:{ all -> 0x0050 }
            goto L_0x0049
        L_0x0028:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0030:
            kotlin.ResultKt.throwOnFailure(r10)
            kotlin.Result$Companion r10 = kotlin.Result.Companion     // Catch:{ all -> 0x0050 }
            dd1.b r1 = new dd1.b     // Catch:{ all -> 0x0050 }
            r1.<init>(r9)     // Catch:{ all -> 0x0050 }
            r9 = 0
            r4 = 0
            r6 = 3
            r7 = 0
            r5.f191546f = r2     // Catch:{ all -> 0x0050 }
            r2 = r9
            java.lang.Object r10 = q40.C89456b.m111831a(r1, r2, r4, r5, r6, r7)     // Catch:{ all -> 0x0050 }
            if (r10 != r0) goto L_0x0049
            return r0
        L_0x0049:
            te3.jj0 r10 = (te3.C49998jj0) r10     // Catch:{ all -> 0x0050 }
            java.lang.Object r9 = kotlin.Result.m168114constructorimpl(r10)     // Catch:{ all -> 0x0050 }
            goto L_0x005b
        L_0x0050:
            r9 = move-exception
            kotlin.Result$Companion r10 = kotlin.Result.Companion
            java.lang.Object r9 = kotlin.ResultKt.createFailure(r9)
            java.lang.Object r9 = kotlin.Result.m168114constructorimpl(r9)
        L_0x005b:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: yc1.C66611g.mo90659J2(bd1.a, wx3.d):java.lang.Object");
    }

    /* renamed from: L2 */
    public void mo90660L2(String str, C39759i iVar) {
        C87412m.m108594g(str, "username");
        C87412m.m108594g(iVar, FirebaseAnalytics.C113379b.SOURCE);
        long currentTimeMillis = System.currentTimeMillis();
        boolean z = false;
        try {
            C54446b a = C66783a.C66784a.m78798a(this, str, false, 2, (Object) null);
            if (a != null) {
                z = mo90669c3().delete(a, new String[0]);
            }
            if (z) {
                C54446b remove = this.f191539g.remove(str);
                if (remove != null) {
                    this.f191537e.post(new C66615d(this, remove, iVar));
                } else {
                    return;
                }
            }
            Boolean valueOf = Boolean.valueOf(z);
            C35102g gVar = new C35102g(valueOf, System.currentTimeMillis() - currentTimeMillis, false, 4, (C8480h) null);
            Log.m105928w("Finder.AccountManager", "[deleteAccount] username=" + str + " source=" + iVar + " ret=" + valueOf.booleanValue() + ' ' + gVar);
        } finally {
            System.currentTimeMillis();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0030 A[Catch:{ all -> 0x0057 }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0035 A[Catch:{ all -> 0x0057 }] */
    /* renamed from: N1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public bd1.C54446b mo90661N1(java.lang.String r3, boolean r4) {
        /*
            r2 = this;
            java.lang.String r0 = "username"
            gy3.C87412m.m108594g(r3, r0)
            java.lang.System.currentTimeMillis()
            if (r4 == 0) goto L_0x001b
            java.util.concurrent.ConcurrentHashMap<java.lang.String, bd1.b> r4 = r2.f191539g     // Catch:{ all -> 0x0057 }
            java.lang.Object r4 = r4.get(r3)     // Catch:{ all -> 0x0057 }
            bd1.b r4 = (bd1.C54446b) r4     // Catch:{ all -> 0x0057 }
            if (r4 != 0) goto L_0x0020
            bd1.b r4 = new bd1.b     // Catch:{ all -> 0x0057 }
            r4.<init>()     // Catch:{ all -> 0x0057 }
            goto L_0x0020
        L_0x001b:
            bd1.b r4 = new bd1.b     // Catch:{ all -> 0x0057 }
            r4.<init>()     // Catch:{ all -> 0x0057 }
        L_0x0020:
            java.lang.String r1 = r4.field_username     // Catch:{ all -> 0x0057 }
            if (r1 == 0) goto L_0x002d
            int r1 = r1.length()     // Catch:{ all -> 0x0057 }
            if (r1 != 0) goto L_0x002b
            goto L_0x002d
        L_0x002b:
            r1 = 0
            goto L_0x002e
        L_0x002d:
            r1 = 1
        L_0x002e:
            if (r1 != 0) goto L_0x0035
            bd1.b r3 = r4.clone()     // Catch:{ all -> 0x0057 }
            goto L_0x0050
        L_0x0035:
            r4.field_username = r3     // Catch:{ all -> 0x0057 }
            jd1.b r1 = r2.mo90669c3()     // Catch:{ all -> 0x0057 }
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch:{ all -> 0x0057 }
            boolean r0 = r1.get(r4, (java.lang.String[]) r0)     // Catch:{ all -> 0x0057 }
            if (r0 == 0) goto L_0x004f
            java.util.concurrent.ConcurrentHashMap<java.lang.String, bd1.b> r0 = r2.f191539g     // Catch:{ all -> 0x0057 }
            r0.put(r3, r4)     // Catch:{ all -> 0x0057 }
            bd1.b r3 = r4.clone()     // Catch:{ all -> 0x0057 }
            goto L_0x0050
        L_0x004f:
            r3 = 0
        L_0x0050:
            java.lang.System.currentTimeMillis()
            r4 = r3
            bd1.b r4 = (bd1.C54446b) r4
            return r3
        L_0x0057:
            r3 = move-exception
            java.lang.System.currentTimeMillis()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: yc1.C66611g.mo90661N1(java.lang.String, boolean):bd1.b");
    }

    /* renamed from: O5 */
    public String mo90662O5() {
        String h = C75592q0.m90778h();
        C87412m.m108593f(h, "getDefaultFinderUsername()");
        return h;
    }

    /* renamed from: P2 */
    public C0264h mo90663P2(String str) {
        C87412m.m108594g(str, "finderUserName");
        return (C0264h) this.f191542j.get(str);
    }

    /* renamed from: S */
    public C89132b<C50119ke1> mo90664S(int i) {
        return new C45328f(i);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0321, code lost:
        if (gy3.C87412m.m108589b(r0.mo490a((java.util.List) r5), r0.mo490a((java.util.List) r3)) != false) goto L_0x0323;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x03af A[Catch:{ all -> 0x046a }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0334 A[SYNTHETIC, Splitter:B:89:0x0334] */
    /* renamed from: S0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo90665S0(bd1.C39758f r26, bd1.C39759i r27) {
        /*
            r25 = this;
            r0 = r26
            r1 = r27
            java.lang.String r2 = "accountPublicInfo"
            gy3.C87412m.m108594g(r0, r2)
            java.lang.String r2 = "source"
            gy3.C87412m.m108594g(r1, r2)
            java.util.concurrent.atomic.AtomicLong r2 = bd1.C39758f.f106680n
            long r3 = r0.f106681j
            r5 = 1
            long r5 = r5 + r3
            boolean r2 = r2.compareAndSet(r3, r5)
            r3 = 0
            java.lang.String r4 = "Finder.AccountManager"
            if (r2 != 0) goto L_0x0044
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "[replaceAccountPublicInfo] replace accountPublicInfo modifyVersion["
            r1.append(r2)
            long r5 = r0.f106681j
            r1.append(r5)
            java.lang.String r0 = "] has invalid. current modifyVersion is "
            r1.append(r0)
            java.util.concurrent.atomic.AtomicLong r0 = bd1.C54447c.f152698g1
            long r5 = r0.get()
            r1.append(r5)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
            return r3
        L_0x0044:
            bd1.g r2 = r25.mo75316W2()
            bd1.e r2 = r2.f152700e
            long r5 = java.lang.System.currentTimeMillis()
            r7 = r25
            rx3.g r8 = r7.f191541i     // Catch:{ all -> 0x04ed }
            rx3.n r8 = (rx3.C36570n) r8     // Catch:{ all -> 0x04ed }
            java.lang.Object r8 = r8.getValue()     // Catch:{ all -> 0x04ed }
            jd1.a r8 = (jd1.C46470a) r8     // Catch:{ all -> 0x04ed }
            boolean r8 = r8.mo71847a(r0)     // Catch:{ all -> 0x04ed }
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch:{ all -> 0x04ed }
            long r9 = java.lang.System.currentTimeMillis()
            long r11 = r9 - r5
            o40.g r5 = new o40.g
            r13 = 0
            r14 = 4
            r15 = 0
            r9 = r5
            r10 = r8
            r9.<init>(r10, r11, r13, r14, r15)
            boolean r6 = r8.booleanValue()
            if (r6 == 0) goto L_0x04e3
            bd1.e r6 = new bd1.e
            r6.<init>()
            byte[] r0 = r26.toByteArray()
            r6.parseFrom(r0)
            cd1.b r0 = cd1.C0448b.f1074a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "[replaceAccountPublicInfo] COST="
            r8.append(r9)
            r8.append(r5)
            java.lang.String r9 = " source="
            r8.append(r9)
            r8.append(r1)
            java.lang.String r1 = r8.toString()
            r0.getClass()
            java.lang.String r8 = "\n"
            java.lang.String r9 = "head"
            gy3.C87412m.m108594g(r1, r9)
            java.lang.String r9 = "old"
            gy3.C87412m.m108594g(r2, r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            kotlin.Result$Companion r10 = kotlin.Result.Companion     // Catch:{ all -> 0x04aa }
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x04aa }
            java.lang.Class r12 = r2.getClass()     // Catch:{ all -> 0x04a0 }
            java.lang.String r12 = r12.getCanonicalName()     // Catch:{ all -> 0x04a0 }
            java.lang.Class r13 = r6.getClass()     // Catch:{ all -> 0x04a0 }
            java.lang.String r13 = r13.getCanonicalName()     // Catch:{ all -> 0x04a0 }
            gy3.C87412m.m108589b(r12, r13)     // Catch:{ all -> 0x04a0 }
            r9.append(r1)     // Catch:{ all -> 0x04a0 }
            r9.append(r8)     // Catch:{ all -> 0x04a0 }
            java.lang.String r1 = " =============================== proto ============================="
            r9.append(r1)     // Catch:{ all -> 0x04a0 }
            r9.append(r8)     // Catch:{ all -> 0x04a0 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x04a0 }
            r1.<init>()     // Catch:{ all -> 0x04a0 }
            java.lang.String r12 = "| class: "
            r1.append(r12)     // Catch:{ all -> 0x04a0 }
            java.lang.Class r12 = r6.getClass()     // Catch:{ all -> 0x04a0 }
            java.lang.String r12 = r12.getCanonicalName()     // Catch:{ all -> 0x04a0 }
            r1.append(r12)     // Catch:{ all -> 0x04a0 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x04a0 }
            r9.append(r1)     // Catch:{ all -> 0x04a0 }
            r9.append(r8)     // Catch:{ all -> 0x04a0 }
            java.util.LinkedList r1 = new java.util.LinkedList     // Catch:{ all -> 0x04a0 }
            r1.<init>()     // Catch:{ all -> 0x04a0 }
            java.lang.Class r12 = r2.getClass()     // Catch:{ all -> 0x04a0 }
            java.lang.reflect.Field[] r12 = r12.getFields()     // Catch:{ all -> 0x04a0 }
            java.lang.String r13 = "old.javaClass.fields"
            gy3.C87412m.m108593f(r12, r13)     // Catch:{ all -> 0x04a0 }
            int r13 = r12.length     // Catch:{ all -> 0x04a0 }
            r14 = 0
        L_0x010e:
            java.lang.String r15 = "obj.javaClass.fields"
            java.lang.String r3 = "..."
            java.lang.String r17 = "@null"
            if (r14 >= r13) goto L_0x01cd
            r7 = r12[r14]     // Catch:{ all -> 0x04a0 }
            r27 = r12
            java.lang.Object r12 = r7.get(r2)     // Catch:{ all -> 0x04a0 }
            r18 = r2
            boolean r2 = r12 instanceof pe3.C47465a     // Catch:{ all -> 0x04a0 }
            if (r2 == 0) goto L_0x01aa
            rx3.l r2 = new rx3.l     // Catch:{ all -> 0x04a0 }
            java.lang.String r7 = r7.getName()     // Catch:{ all -> 0x04a0 }
            r2.<init>(r7, r3)     // Catch:{ all -> 0x04a0 }
            r1.add(r2)     // Catch:{ all -> 0x04a0 }
            java.lang.Class r2 = r12.getClass()     // Catch:{ all -> 0x04a0 }
            java.lang.reflect.Field[] r2 = r2.getFields()     // Catch:{ all -> 0x04a0 }
            gy3.C87412m.m108593f(r2, r15)     // Catch:{ all -> 0x04a0 }
            int r3 = r2.length     // Catch:{ all -> 0x04a0 }
            r7 = 0
        L_0x013d:
            if (r7 >= r3) goto L_0x01a5
            r15 = r2[r7]     // Catch:{ all -> 0x04a0 }
            r19 = r2
            java.lang.Object r2 = r15.get(r12)     // Catch:{ all -> 0x04a0 }
            r20 = r3
            boolean r3 = r2 instanceof pe3.C47465a     // Catch:{ all -> 0x04a0 }
            if (r3 == 0) goto L_0x0175
            rx3.l r3 = new rx3.l     // Catch:{ all -> 0x04a0 }
            r21 = r13
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x04a0 }
            r13.<init>()     // Catch:{ all -> 0x04a0 }
            r22 = r5
            r5 = 32
            r13.append(r5)     // Catch:{ all -> 0x049c }
            java.lang.String r5 = r15.getName()     // Catch:{ all -> 0x049c }
            r13.append(r5)     // Catch:{ all -> 0x049c }
            java.lang.String r5 = r13.toString()     // Catch:{ all -> 0x049c }
            pe3.a r2 = (pe3.C47465a) r2     // Catch:{ all -> 0x049c }
            byte[] r2 = r2.toByteArray()     // Catch:{ all -> 0x049c }
            r3.<init>(r5, r2)     // Catch:{ all -> 0x049c }
            r1.add(r3)     // Catch:{ all -> 0x049c }
            goto L_0x019a
        L_0x0175:
            r22 = r5
            r21 = r13
            rx3.l r3 = new rx3.l     // Catch:{ all -> 0x049c }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x049c }
            r5.<init>()     // Catch:{ all -> 0x049c }
            r13 = 32
            r5.append(r13)     // Catch:{ all -> 0x049c }
            java.lang.String r13 = r15.getName()     // Catch:{ all -> 0x049c }
            r5.append(r13)     // Catch:{ all -> 0x049c }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x049c }
            if (r2 != 0) goto L_0x0194
            r2 = r17
        L_0x0194:
            r3.<init>(r5, r2)     // Catch:{ all -> 0x049c }
            r1.add(r3)     // Catch:{ all -> 0x049c }
        L_0x019a:
            int r7 = r7 + 1
            r2 = r19
            r3 = r20
            r13 = r21
            r5 = r22
            goto L_0x013d
        L_0x01a5:
            r22 = r5
            r21 = r13
            goto L_0x01be
        L_0x01aa:
            r22 = r5
            r21 = r13
            rx3.l r2 = new rx3.l     // Catch:{ all -> 0x049c }
            java.lang.String r3 = r7.getName()     // Catch:{ all -> 0x049c }
            if (r12 != 0) goto L_0x01b8
            r12 = r17
        L_0x01b8:
            r2.<init>(r3, r12)     // Catch:{ all -> 0x049c }
            r1.add(r2)     // Catch:{ all -> 0x049c }
        L_0x01be:
            int r14 = r14 + 1
            r7 = r25
            r12 = r27
            r2 = r18
            r13 = r21
            r5 = r22
            r3 = 0
            goto L_0x010e
        L_0x01cd:
            r22 = r5
            java.util.LinkedList r2 = new java.util.LinkedList     // Catch:{ all -> 0x049c }
            r2.<init>()     // Catch:{ all -> 0x049c }
            java.lang.Class r5 = r6.getClass()     // Catch:{ all -> 0x049c }
            java.lang.reflect.Field[] r5 = r5.getFields()     // Catch:{ all -> 0x049c }
            java.lang.String r7 = "new.javaClass.fields"
            gy3.C87412m.m108593f(r5, r7)     // Catch:{ all -> 0x049c }
            int r7 = r5.length     // Catch:{ all -> 0x049c }
            r12 = 0
        L_0x01e3:
            if (r12 >= r7) goto L_0x02ab
            r13 = r5[r12]     // Catch:{ all -> 0x049c }
            java.lang.Object r14 = r13.get(r6)     // Catch:{ all -> 0x049c }
            r27 = r5
            boolean r5 = r14 instanceof pe3.C47465a     // Catch:{ all -> 0x049c }
            if (r5 == 0) goto L_0x0283
            rx3.l r5 = new rx3.l     // Catch:{ all -> 0x049c }
            java.lang.String r13 = r13.getName()     // Catch:{ all -> 0x049c }
            r5.<init>(r13, r3)     // Catch:{ all -> 0x049c }
            r2.add(r5)     // Catch:{ all -> 0x049c }
            java.lang.Class r5 = r14.getClass()     // Catch:{ all -> 0x049c }
            java.lang.reflect.Field[] r5 = r5.getFields()     // Catch:{ all -> 0x049c }
            gy3.C87412m.m108593f(r5, r15)     // Catch:{ all -> 0x049c }
            int r13 = r5.length     // Catch:{ all -> 0x049c }
            r18 = r3
            r3 = 0
        L_0x020c:
            if (r3 >= r13) goto L_0x027a
            r19 = r7
            r7 = r5[r3]     // Catch:{ all -> 0x049c }
            r20 = r5
            java.lang.Object r5 = r7.get(r14)     // Catch:{ all -> 0x049c }
            r21 = r13
            boolean r13 = r5 instanceof pe3.C47465a     // Catch:{ all -> 0x049c }
            if (r13 == 0) goto L_0x0248
            rx3.l r13 = new rx3.l     // Catch:{ all -> 0x049c }
            r23 = r15
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ all -> 0x049c }
            r15.<init>()     // Catch:{ all -> 0x049c }
            r24 = r6
            r6 = 32
            r15.append(r6)     // Catch:{ all -> 0x046a }
            java.lang.String r6 = r7.getName()     // Catch:{ all -> 0x046a }
            r15.append(r6)     // Catch:{ all -> 0x046a }
            java.lang.String r6 = r15.toString()     // Catch:{ all -> 0x046a }
            pe3.a r5 = (pe3.C47465a) r5     // Catch:{ all -> 0x046a }
            byte[] r5 = r5.toByteArray()     // Catch:{ all -> 0x046a }
            r13.<init>(r6, r5)     // Catch:{ all -> 0x046a }
            r2.add(r13)     // Catch:{ all -> 0x046a }
            r15 = 32
            goto L_0x026d
        L_0x0248:
            r24 = r6
            r23 = r15
            rx3.l r6 = new rx3.l     // Catch:{ all -> 0x046a }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x046a }
            r13.<init>()     // Catch:{ all -> 0x046a }
            r15 = 32
            r13.append(r15)     // Catch:{ all -> 0x046a }
            java.lang.String r7 = r7.getName()     // Catch:{ all -> 0x046a }
            r13.append(r7)     // Catch:{ all -> 0x046a }
            java.lang.String r7 = r13.toString()     // Catch:{ all -> 0x046a }
            if (r5 != 0) goto L_0x0267
            r5 = r17
        L_0x0267:
            r6.<init>(r7, r5)     // Catch:{ all -> 0x046a }
            r2.add(r6)     // Catch:{ all -> 0x046a }
        L_0x026d:
            int r3 = r3 + 1
            r7 = r19
            r5 = r20
            r13 = r21
            r15 = r23
            r6 = r24
            goto L_0x020c
        L_0x027a:
            r24 = r6
            r19 = r7
            r23 = r15
            r15 = 32
            goto L_0x029d
        L_0x0283:
            r18 = r3
            r24 = r6
            r19 = r7
            r23 = r15
            r15 = 32
            rx3.l r3 = new rx3.l     // Catch:{ all -> 0x046a }
            java.lang.String r5 = r13.getName()     // Catch:{ all -> 0x046a }
            if (r14 != 0) goto L_0x0297
            r14 = r17
        L_0x0297:
            r3.<init>(r5, r14)     // Catch:{ all -> 0x046a }
            r2.add(r3)     // Catch:{ all -> 0x046a }
        L_0x029d:
            int r12 = r12 + 1
            r5 = r27
            r3 = r18
            r7 = r19
            r15 = r23
            r6 = r24
            goto L_0x01e3
        L_0x02ab:
            r24 = r6
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x046a }
            r3 = 0
        L_0x02b2:
            boolean r5 = r1.hasNext()     // Catch:{ all -> 0x046a }
            if (r5 == 0) goto L_0x046c
            java.lang.Object r5 = r1.next()     // Catch:{ all -> 0x046a }
            int r6 = r3 + 1
            if (r3 < 0) goto L_0x0465
            rx3.l r5 = (rx3.C13604l) r5     // Catch:{ all -> 0x046a }
            A r7 = r5.f38555d     // Catch:{ all -> 0x046a }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x046a }
            B r5 = r5.f38556e     // Catch:{ all -> 0x046a }
            java.lang.Object r3 = r2.get(r3)     // Catch:{ all -> 0x046a }
            rx3.l r3 = (rx3.C13604l) r3     // Catch:{ all -> 0x046a }
            B r3 = r3.f38556e     // Catch:{ all -> 0x046a }
            boolean r12 = r5 instanceof byte[]     // Catch:{ all -> 0x046a }
            if (r12 == 0) goto L_0x02f7
            boolean r12 = r3 instanceof byte[]     // Catch:{ all -> 0x046a }
            if (r12 == 0) goto L_0x02f7
            r12 = r5
            byte[] r12 = (byte[]) r12     // Catch:{ all -> 0x046a }
            int r12 = r12.length     // Catch:{ all -> 0x046a }
            r13 = r3
            byte[] r13 = (byte[]) r13     // Catch:{ all -> 0x046a }
            int r13 = r13.length     // Catch:{ all -> 0x046a }
            if (r12 != r13) goto L_0x0325
            r12 = r3
            byte[] r12 = (byte[]) r12     // Catch:{ all -> 0x046a }
            java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((byte[]) r12)     // Catch:{ all -> 0x046a }
            r13 = r5
            byte[] r13 = (byte[]) r13     // Catch:{ all -> 0x046a }
            java.lang.String r13 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((byte[]) r13)     // Catch:{ all -> 0x046a }
            boolean r12 = gy3.C87412m.m108589b(r12, r13)     // Catch:{ all -> 0x046a }
            if (r12 == 0) goto L_0x0325
            goto L_0x0323
        L_0x02f7:
            boolean r12 = r5 instanceof java.util.List     // Catch:{ all -> 0x046a }
            if (r12 == 0) goto L_0x0327
            boolean r12 = r3 instanceof java.util.List     // Catch:{ all -> 0x046a }
            if (r12 == 0) goto L_0x0327
            r12 = r5
            java.util.List r12 = (java.util.List) r12     // Catch:{ all -> 0x046a }
            int r12 = r12.size()     // Catch:{ all -> 0x046a }
            r13 = r3
            java.util.List r13 = (java.util.List) r13     // Catch:{ all -> 0x046a }
            int r13 = r13.size()     // Catch:{ all -> 0x046a }
            if (r12 != r13) goto L_0x0325
            r12 = r5
            java.util.List r12 = (java.util.List) r12     // Catch:{ all -> 0x046a }
            java.lang.String r12 = r0.mo490a(r12)     // Catch:{ all -> 0x046a }
            r13 = r3
            java.util.List r13 = (java.util.List) r13     // Catch:{ all -> 0x046a }
            java.lang.String r13 = r0.mo490a(r13)     // Catch:{ all -> 0x046a }
            boolean r12 = gy3.C87412m.m108589b(r12, r13)     // Catch:{ all -> 0x046a }
            if (r12 == 0) goto L_0x0325
        L_0x0323:
            r12 = 1
            goto L_0x032b
        L_0x0325:
            r12 = 0
            goto L_0x032b
        L_0x0327:
            boolean r12 = gy3.C87412m.m108589b(r5, r3)     // Catch:{ all -> 0x046a }
        L_0x032b:
            java.lang.String r13 = "| "
            java.lang.String r14 = ": "
            r15 = 30
            if (r12 == 0) goto L_0x03af
            boolean r12 = r5 instanceof byte[]     // Catch:{ all -> 0x046a }
            if (r12 == 0) goto L_0x035a
            r9.append(r13)     // Catch:{ all -> 0x046a }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x046a }
            r3.<init>()     // Catch:{ all -> 0x046a }
            r3.append(r7)     // Catch:{ all -> 0x046a }
            r3.append(r14)     // Catch:{ all -> 0x046a }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x046a }
            r9.append(r3)     // Catch:{ all -> 0x046a }
            byte[] r5 = (byte[]) r5     // Catch:{ all -> 0x046a }
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((byte[]) r5)     // Catch:{ all -> 0x046a }
            r9.append(r3)     // Catch:{ all -> 0x046a }
            r9.append(r8)     // Catch:{ all -> 0x046a }
            goto L_0x03ab
        L_0x035a:
            boolean r12 = r5 instanceof java.util.List     // Catch:{ all -> 0x046a }
            if (r12 == 0) goto L_0x0388
            boolean r3 = r3 instanceof java.util.List     // Catch:{ all -> 0x046a }
            if (r3 == 0) goto L_0x0388
            r9.append(r13)     // Catch:{ all -> 0x046a }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x046a }
            r3.<init>()     // Catch:{ all -> 0x046a }
            r3.append(r7)     // Catch:{ all -> 0x046a }
            r3.append(r14)     // Catch:{ all -> 0x046a }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x046a }
            r9.append(r3)     // Catch:{ all -> 0x046a }
            java.util.List r5 = (java.util.List) r5     // Catch:{ all -> 0x046a }
            java.lang.String r3 = r0.mo490a(r5)     // Catch:{ all -> 0x046a }
            java.lang.CharSequence r3 = cd1.C0449c.m383a(r3, r15)     // Catch:{ all -> 0x046a }
            r9.append(r3)     // Catch:{ all -> 0x046a }
            r9.append(r8)     // Catch:{ all -> 0x046a }
            goto L_0x03ab
        L_0x0388:
            r9.append(r13)     // Catch:{ all -> 0x046a }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x046a }
            r3.<init>()     // Catch:{ all -> 0x046a }
            r3.append(r7)     // Catch:{ all -> 0x046a }
            r3.append(r14)     // Catch:{ all -> 0x046a }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x046a }
            r9.append(r3)     // Catch:{ all -> 0x046a }
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x046a }
            java.lang.CharSequence r3 = cd1.C0449c.m383a(r3, r15)     // Catch:{ all -> 0x046a }
            r9.append(r3)     // Catch:{ all -> 0x046a }
            r9.append(r8)     // Catch:{ all -> 0x046a }
        L_0x03ab:
            r27 = r1
            goto L_0x0460
        L_0x03af:
            boolean r12 = r5 instanceof byte[]     // Catch:{ all -> 0x046a }
            java.lang.String r15 = "* "
            r27 = r1
            java.lang.String r1 = " => "
            if (r12 == 0) goto L_0x03eb
            boolean r12 = r3 instanceof byte[]     // Catch:{ all -> 0x046a }
            if (r12 == 0) goto L_0x03eb
            r9.append(r15)     // Catch:{ all -> 0x046a }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x046a }
            r12.<init>()     // Catch:{ all -> 0x046a }
            r12.append(r7)     // Catch:{ all -> 0x046a }
            r12.append(r14)     // Catch:{ all -> 0x046a }
            java.lang.String r7 = r12.toString()     // Catch:{ all -> 0x046a }
            r9.append(r7)     // Catch:{ all -> 0x046a }
            byte[] r5 = (byte[]) r5     // Catch:{ all -> 0x046a }
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((byte[]) r5)     // Catch:{ all -> 0x046a }
            r9.append(r5)     // Catch:{ all -> 0x046a }
            r9.append(r1)     // Catch:{ all -> 0x046a }
            byte[] r3 = (byte[]) r3     // Catch:{ all -> 0x046a }
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((byte[]) r3)     // Catch:{ all -> 0x046a }
            r9.append(r1)     // Catch:{ all -> 0x046a }
            r9.append(r8)     // Catch:{ all -> 0x046a }
            goto L_0x0460
        L_0x03eb:
            boolean r12 = r5 instanceof java.util.List     // Catch:{ all -> 0x046a }
            if (r12 == 0) goto L_0x042d
            boolean r12 = r3 instanceof java.util.List     // Catch:{ all -> 0x046a }
            if (r12 == 0) goto L_0x042d
            r9.append(r13)     // Catch:{ all -> 0x046a }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x046a }
            r12.<init>()     // Catch:{ all -> 0x046a }
            r12.append(r7)     // Catch:{ all -> 0x046a }
            r12.append(r14)     // Catch:{ all -> 0x046a }
            java.lang.String r7 = r12.toString()     // Catch:{ all -> 0x046a }
            r9.append(r7)     // Catch:{ all -> 0x046a }
            java.util.List r5 = (java.util.List) r5     // Catch:{ all -> 0x046a }
            java.lang.String r5 = r0.mo490a(r5)     // Catch:{ all -> 0x046a }
            r7 = 30
            java.lang.CharSequence r5 = cd1.C0449c.m383a(r5, r7)     // Catch:{ all -> 0x046a }
            r9.append(r5)     // Catch:{ all -> 0x046a }
            r9.append(r1)     // Catch:{ all -> 0x046a }
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x046a }
            java.lang.String r1 = r0.mo490a(r3)     // Catch:{ all -> 0x046a }
            r3 = 30
            java.lang.CharSequence r1 = cd1.C0449c.m383a(r1, r3)     // Catch:{ all -> 0x046a }
            r9.append(r1)     // Catch:{ all -> 0x046a }
            r9.append(r8)     // Catch:{ all -> 0x046a }
            goto L_0x0460
        L_0x042d:
            r9.append(r15)     // Catch:{ all -> 0x046a }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x046a }
            r12.<init>()     // Catch:{ all -> 0x046a }
            r12.append(r7)     // Catch:{ all -> 0x046a }
            r12.append(r14)     // Catch:{ all -> 0x046a }
            java.lang.String r7 = r12.toString()     // Catch:{ all -> 0x046a }
            r9.append(r7)     // Catch:{ all -> 0x046a }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x046a }
            r7 = 30
            java.lang.CharSequence r5 = cd1.C0449c.m383a(r5, r7)     // Catch:{ all -> 0x046a }
            r9.append(r5)     // Catch:{ all -> 0x046a }
            r9.append(r1)     // Catch:{ all -> 0x046a }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x046a }
            java.lang.CharSequence r1 = cd1.C0449c.m383a(r1, r7)     // Catch:{ all -> 0x046a }
            r9.append(r1)     // Catch:{ all -> 0x046a }
            r9.append(r8)     // Catch:{ all -> 0x046a }
        L_0x0460:
            r1 = r27
            r3 = r6
            goto L_0x02b2
        L_0x0465:
            sx3.C64197v.m75542k()     // Catch:{ all -> 0x046a }
            r0 = 0
            throw r0     // Catch:{ all -> 0x046a }
        L_0x046a:
            r0 = move-exception
            goto L_0x04a4
        L_0x046c:
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x046a }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x04a8 }
            long r12 = r1 - r10
            o40.g r1 = new o40.g     // Catch:{ all -> 0x04a8 }
            r14 = 0
            r15 = 4
            r16 = 0
            r10 = r1
            r11 = r0
            r10.<init>(r11, r12, r14, r15, r16)     // Catch:{ all -> 0x04a8 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x04a8 }
            r0.<init>()     // Catch:{ all -> 0x04a8 }
            java.lang.String r2 = " ============================== "
            r0.append(r2)     // Catch:{ all -> 0x04a8 }
            r0.append(r1)     // Catch:{ all -> 0x04a8 }
            java.lang.String r1 = " =============================="
            r0.append(r1)     // Catch:{ all -> 0x04a8 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x04a8 }
            r9.append(r0)     // Catch:{ all -> 0x04a8 }
            kotlin.Result.m168114constructorimpl(r9)     // Catch:{ all -> 0x04a8 }
            goto L_0x04b8
        L_0x049c:
            r0 = move-exception
        L_0x049d:
            r24 = r6
            goto L_0x04a4
        L_0x04a0:
            r0 = move-exception
            r22 = r5
            goto L_0x049d
        L_0x04a4:
            java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x04a8 }
            throw r0     // Catch:{ all -> 0x04a8 }
        L_0x04a8:
            r0 = move-exception
            goto L_0x04af
        L_0x04aa:
            r0 = move-exception
            r22 = r5
            r24 = r6
        L_0x04af:
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            kotlin.Result.m168114constructorimpl(r0)
        L_0x04b8:
            java.lang.String r0 = r9.toString()
            java.lang.String r1 = "fieldsContent.toString()"
            gy3.C87412m.m108593f(r0, r1)
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            bd1.g r0 = r25.mo75316W2()
            r0.getClass()
            r1 = r24
            r0.f152700e = r1
            bd1.g r0 = r25.mo75316W2()
            rx3.g r1 = r0.f152777d
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            d14.t0 r1 = (d14.C58085t0) r1
            r1.mo82832d(r0)
            r1 = r22
            goto L_0x04e4
        L_0x04e3:
            r1 = r5
        L_0x04e4:
            T r0 = r1.f94176a
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x04ed:
            r0 = move-exception
            java.lang.System.currentTimeMillis()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yc1.C66611g.mo90665S0(bd1.f, bd1.i):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: W0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo90666W0(java.lang.String r9, wx3.C15601d<? super kotlin.Result<? extends te3.C51430tq0>> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof yc1.C66611g.C66613b
            if (r0 == 0) goto L_0x0013
            r0 = r10
            yc1.g$b r0 = (yc1.C66611g.C66613b) r0
            int r1 = r0.f191549f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f191549f = r1
            goto L_0x0018
        L_0x0013:
            yc1.g$b r0 = new yc1.g$b
            r0.<init>(r8, r10)
        L_0x0018:
            r5 = r0
            java.lang.Object r10 = r5.f191547d
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r5.f191549f
            r2 = 1
            if (r1 == 0) goto L_0x0030
            if (r1 != r2) goto L_0x0028
            kotlin.ResultKt.throwOnFailure(r10)     // Catch:{ all -> 0x004f }
            goto L_0x0048
        L_0x0028:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0030:
            kotlin.ResultKt.throwOnFailure(r10)
            kotlin.Result$Companion r10 = kotlin.Result.Companion     // Catch:{ all -> 0x004f }
            ob0.b r1 = r8.mo90680v4(r9)     // Catch:{ all -> 0x004f }
            r9 = 0
            r4 = 0
            r6 = 3
            r7 = 0
            r5.f191549f = r2     // Catch:{ all -> 0x004f }
            r2 = r9
            java.lang.Object r10 = q40.C89456b.m111831a(r1, r2, r4, r5, r6, r7)     // Catch:{ all -> 0x004f }
            if (r10 != r0) goto L_0x0048
            return r0
        L_0x0048:
            te3.tq0 r10 = (te3.C51430tq0) r10     // Catch:{ all -> 0x004f }
            java.lang.Object r9 = kotlin.Result.m168114constructorimpl(r10)     // Catch:{ all -> 0x004f }
            goto L_0x005a
        L_0x004f:
            r9 = move-exception
            kotlin.Result$Companion r10 = kotlin.Result.Companion
            java.lang.Object r9 = kotlin.ResultKt.createFailure(r9)
            java.lang.Object r9 = kotlin.Result.m168114constructorimpl(r9)
        L_0x005a:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: yc1.C66611g.mo90666W0(java.lang.String, wx3.d):java.lang.Object");
    }

    /* renamed from: X1 */
    public void mo90667X1(String str) {
        C87412m.m108594g(str, "finderUsername");
        C85801v1 i = C86709a0.m107535s().mo121142i();
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_MY_FINDER_USERNAME_STRING_SYNC;
        String I = i.mo119675I(aVar, "");
        C86709a0.m107535s().mo121142i().mo119677K(aVar, str);
        Log.m105928w("Finder.AccountManager", "[setDefaultAccount] finderUsername=" + str + " rawDefaultUsername=" + I);
        if (!C87412m.m108589b(I, str)) {
            for (C54029c b : mo75316W2().f152702g) {
                C87412m.m108593f(I, "rawDefaultUsername");
                b.mo2445b(str, I);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009d, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009e, code lost:
        cy3.C58003b.m67160a(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a1, code lost:
        throw r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006c A[Catch:{ all -> 0x009d }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x004e A[SYNTHETIC] */
    /* renamed from: b2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<bd1.C54446b> mo90668b2(boolean r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L_0x0030
            java.util.concurrent.ConcurrentHashMap<java.lang.String, bd1.b> r6 = r5.f191539g
            java.util.Collection r6 = r6.values()
            java.lang.String r0 = "memoryCache.values"
            gy3.C87412m.m108593f(r6, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = sx3.C36907w.m41090l(r6, r1)
            r0.<init>(r1)
            java.util.Iterator r6 = r6.iterator()
        L_0x001c:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x0032
            java.lang.Object r1 = r6.next()
            bd1.b r1 = (bd1.C54446b) r1
            bd1.b r1 = r1.clone()
            r0.add(r1)
            goto L_0x001c
        L_0x0030:
            sx3.f0 r0 = sx3.C64186f0.f181907d
        L_0x0032:
            boolean r6 = r0.isEmpty()
            if (r6 == 0) goto L_0x00a2
            jd1.b r6 = r5.mo90669c3()
            r6.getClass()
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            android.database.Cursor r6 = r6.getAll()
            boolean r1 = r6.moveToFirst()     // Catch:{ all -> 0x009b }
            if (r1 == 0) goto L_0x0073
        L_0x004e:
            boolean r1 = r6.isAfterLast()     // Catch:{ all -> 0x009b }
            if (r1 != 0) goto L_0x0073
            bd1.b r1 = new bd1.b     // Catch:{ all -> 0x009b }
            r1.<init>()     // Catch:{ all -> 0x009b }
            r1.convertFrom(r6)     // Catch:{ all -> 0x009b }
            java.lang.String r2 = r1.field_username     // Catch:{ all -> 0x009b }
            if (r2 == 0) goto L_0x0069
            int r2 = r2.length()     // Catch:{ all -> 0x009b }
            if (r2 != 0) goto L_0x0067
            goto L_0x0069
        L_0x0067:
            r2 = 0
            goto L_0x006a
        L_0x0069:
            r2 = 1
        L_0x006a:
            if (r2 != 0) goto L_0x004e
            r0.add(r1)     // Catch:{ all -> 0x009b }
            r6.moveToNext()     // Catch:{ all -> 0x009b }
            goto L_0x004e
        L_0x0073:
            rx3.b0 r1 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x009b }
            r1 = 0
            cy3.C58003b.m67160a(r6, r1)
            java.util.Iterator r6 = r0.iterator()
        L_0x007d:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x009a
            java.lang.Object r1 = r6.next()
            bd1.b r1 = (bd1.C54446b) r1
            java.util.concurrent.ConcurrentHashMap<java.lang.String, bd1.b> r2 = r5.f191539g
            java.lang.String r3 = r1.field_username
            java.lang.String r4 = "it.field_username"
            gy3.C87412m.m108593f(r3, r4)
            bd1.b r1 = r1.clone()
            r2.put(r3, r1)
            goto L_0x007d
        L_0x009a:
            return r0
        L_0x009b:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x009d }
        L_0x009d:
            r1 = move-exception
            cy3.C58003b.m67160a(r6, r0)
            throw r1
        L_0x00a2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yc1.C66611g.mo90668b2(boolean):java.util.List");
    }

    /* renamed from: c3 */
    public final C60793b mo90669c3() {
        return (C60793b) ((C36570n) this.f191540h).getValue();
    }

    /* renamed from: d3 */
    public C54449g mo75316W2() {
        return (C54449g) ((C36570n) this.f191536d).getValue();
    }

    /* JADX INFO: finally extract failed */
    public void initialize() {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("[initialize] accountPublicInfo=[");
            C39757e eVar = mo75316W2().f152700e;
            C87412m.m108594g(eVar, "<this>");
            String jSONObject = C61937h.m72703b(eVar).toString();
            C87412m.m108593f(jSONObject, "pbToJSON(this).toString()");
            sb.append(jSONObject);
            sb.append(']');
            Log.m105924i("Finder.AccountManager", sb.toString());
            if (mo75316W2().f152700e.f131581e != 2) {
                C39758f fVar = new C39758f();
                if (this.f191538f.mo71439a(fVar)) {
                    Log.m105924i("Finder.AccountManager", "[initialize] successfully upgrade!(" + mo75316W2().f152700e.f131581e + " to 2)");
                    fVar.f131581e = 2;
                    mo90665S0(fVar, C39759i.UPGRADE);
                } else {
                    Log.m105920e("Finder.AccountManager", "[initialize] failure upgrade!(" + mo75316W2().f152700e.f131581e + ')');
                }
            }
            C35102g gVar = new C35102g(C13598b0.f38549a, System.currentTimeMillis() - currentTimeMillis, false, 4, (C8480h) null);
            Log.m105924i("Finder.AccountManager.onUpgrade", "COST=" + gVar);
            List<C54446b> b = C66783a.C66784a.m78799b(this, false, 1, (Object) null);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("[initialize] accounts=");
            ArrayList arrayList = new ArrayList(C36907w.m41090l(b, 10));
            for (C54446b bVar : b) {
                bVar.getClass();
                StringBuilder sb5 = new StringBuilder();
                sb5.append("nickname=");
                sb5.append(bVar.field_nickname);
                sb5.append(" user_flag=");
                C49183dr2 dr22 = bVar.field_prepareFinder;
                sb5.append(dr22 != null ? Integer.valueOf(dr22.f132494e) : null);
                sb5.append(" username=");
                sb5.append(bVar.field_username);
                sb5.append(' ');
                arrayList.add(sb5.toString());
            }
            sb4.append(arrayList);
            sb4.append(' ');
            Log.m105924i("Finder.AccountManager", sb4.toString());
        } catch (Throwable th) {
            System.currentTimeMillis();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: m1 */
    public boolean mo90672m1(C54447c cVar, C39759i iVar) {
        C54446b bVar;
        Iterator it;
        boolean z;
        C54447c cVar2 = cVar;
        C39759i iVar2 = iVar;
        C87412m.m108594g(cVar2, "account");
        C87412m.m108594g(iVar2, FirebaseAnalytics.C113379b.SOURCE);
        String str = cVar2.field_username;
        if (str == null || str.length() == 0) {
            return false;
        }
        AtomicLong atomicLong = C54447c.f152698g1;
        AtomicLong atomicLong2 = C54447c.f152698g1;
        long j = cVar2.f152699f1;
        if (!atomicLong2.compareAndSet(j, 1 + j)) {
            Log.m105920e("Finder.AccountManager", "[replaceFinderAccount] replace account modifyVersion[" + cVar2.f152699f1 + "] has invalid. current modifyVersion is " + atomicLong2.get());
            return false;
        }
        C45983e0 e0Var = new C45983e0();
        e0Var.f124000d = -1;
        C87412m.m108593f(str, "username");
        C54446b N1 = mo90661N1(str, true);
        if (N1 == null) {
            N1 = new C54446b();
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            if (!iVar2.f106704d.isEmpty()) {
                HashSet hashSet = new HashSet(iVar2.f106704d);
                hashSet.add("username");
                List y0 = C110818d0.m150953y0(hashSet);
                bVar = new C54446b();
                ContentValues convertTo = cVar.convertTo();
                IAutoDBItem.MAutoDBInfo mAutoDBInfo = C54446b.f152697e1;
                bVar.convertFrom(new C54450j(convertTo, C54446b.f152697e1, y0));
            } else {
                bVar = cVar2;
            }
            C60793b c3 = mo90669c3();
            String str2 = bVar.field_username;
            C87412m.m108593f(str2, "updateAccount.field_username");
            long jo = c3.mo85724jo(str2);
            e0Var.f124000d = jo;
            boolean insert = jo < 0 ? mo90669c3().insert(bVar) : mo90669c3().update(e0Var.f124000d, bVar);
            String str3 = bVar.field_username;
            C87412m.m108593f(str3, "updateAccount.field_username");
            C54446b N12 = mo90661N1(str3, false);
            if (N12 != null) {
                ConcurrentHashMap<String, C54446b> concurrentHashMap = this.f191539g;
                String str4 = bVar.field_username;
                C87412m.m108593f(str4, "updateAccount.field_username");
                concurrentHashMap.put(str4, N12);
            }
            Boolean valueOf = Boolean.valueOf(insert);
            C35102g gVar = new C35102g(valueOf, System.currentTimeMillis() - currentTimeMillis, false, 4, (C8480h) null);
            C54446b N13 = mo90661N1(str, true);
            if (N13 == null) {
                N13 = new C54446b();
            }
            String str5 = "[replaceFinderAccount] cost=" + gVar + " rowId=" + e0Var.f124000d + " ret=" + valueOf.booleanValue() + " source=" + iVar2;
            C0448b.f1074a.getClass();
            C87412m.m108594g(str5, "head");
            StringBuilder sb = new StringBuilder();
            long currentTimeMillis2 = System.currentTimeMillis();
            try {
                C87412m.m108589b(N1.getClass().getCanonicalName(), N13.getClass().getCanonicalName());
                sb.append(str5);
                sb.append("\n");
                sb.append(" ============================= db item ===============================");
                sb.append("\n");
                sb.append("| class: " + N13.getClass().getCanonicalName());
                sb.append("\n");
                ContentValues convertTo2 = N1.convertTo();
                ContentValues convertTo3 = N13.convertTo();
                String[] strArr = N1.getDBInfo().columns;
                C87412m.m108593f(strArr, "old.dbInfo.columns");
                Iterator it4 = C110823p.m151001a0(strArr).iterator();
                while (it4.hasNext()) {
                    String str6 = (String) it4.next();
                    Object obj = convertTo2.get(str6);
                    Object obj2 = convertTo3.get(str6);
                    ContentValues contentValues = convertTo2;
                    if (!(obj instanceof byte[]) || !(obj2 instanceof byte[])) {
                        it = it4;
                        z = C87412m.m108589b(obj, obj2);
                    } else {
                        it = it4;
                        z = ((byte[]) obj).length == ((byte[]) obj2).length && C87412m.m108589b(MD5Util.getMD5String((byte[]) obj2), MD5Util.getMD5String((byte[]) obj));
                    }
                    String str7 = null;
                    if (z) {
                        ContentValues contentValues2 = convertTo3;
                        if (obj instanceof byte[]) {
                            sb.append("| ");
                            sb.append(str6 + ": ");
                            sb.append(MD5Util.getMD5String((byte[]) obj));
                            sb.append("\n");
                        } else {
                            sb.append("| ");
                            sb.append(str6 + ": ");
                            if (obj2 != null) {
                                str7 = obj2.toString();
                            }
                            sb.append(C0449c.m383a(str7, 30));
                            sb.append("\n");
                        }
                        convertTo2 = contentValues;
                        it4 = it;
                        convertTo3 = contentValues2;
                    } else {
                        ContentValues contentValues3 = convertTo3;
                        C35102g gVar2 = gVar;
                        if (!(obj instanceof byte[])) {
                            if (!(obj2 instanceof byte[])) {
                                sb.append("* ");
                                sb.append(str6 + ": ");
                                sb.append(C0449c.m383a(obj != null ? obj.toString() : null, 30));
                                sb.append(" => ");
                                if (obj2 != null) {
                                    str7 = obj2.toString();
                                }
                                sb.append(C0449c.m383a(str7, 30));
                                sb.append("\n");
                                convertTo2 = contentValues;
                                it4 = it;
                                convertTo3 = contentValues3;
                                gVar = gVar2;
                            }
                        }
                        sb.append("* ");
                        sb.append(str6 + ": ");
                        String str8 = "@null";
                        sb.append(obj instanceof byte[] ? MD5Util.getMD5String((byte[]) obj) : str8);
                        sb.append(" => ");
                        if (obj2 instanceof byte[]) {
                            str8 = MD5Util.getMD5String((byte[]) obj2);
                        }
                        sb.append(str8);
                        sb.append("\n");
                        convertTo2 = contentValues;
                        it4 = it;
                        convertTo3 = contentValues3;
                        gVar = gVar2;
                    }
                }
                C35102g gVar3 = gVar;
                sb.append(" ============================== " + new C35102g(C13598b0.f38549a, System.currentTimeMillis() - currentTimeMillis2, false, 4, (C8480h) null) + " ==============================");
                String sb4 = sb.toString();
                C87412m.m108593f(sb4, "fieldsContent.toString()");
                Log.m105924i("Finder.AccountManager", sb4);
                this.f191537e.post(new C66618g(this, e0Var, N13, iVar2));
                return ((Boolean) gVar3.f94176a).booleanValue();
            } catch (Throwable th) {
                System.currentTimeMillis();
                throw th;
            }
        } catch (Throwable th4) {
            System.currentTimeMillis();
            throw th4;
        }
    }

    /* renamed from: n0 */
    public C39757e mo90673n0() {
        return mo75316W2().f152700e;
    }

    /* renamed from: o0 */
    public void mo90674o0(boolean z) {
        this.f191543n = z;
        Log.m105924i("Finder.AccountManager", "setEnableFinderGetCommentList :" + z);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: o1 */
    public List<String> mo90675o1(boolean z) {
        System.currentTimeMillis();
        try {
            List<C54446b> b2 = mo90668b2(z);
            ArrayList arrayList = new ArrayList(C36907w.m41090l(b2, 10));
            for (C54446b bVar : b2) {
                ConcurrentHashMap<String, C54446b> concurrentHashMap = this.f191539g;
                String str = bVar.field_username;
                C87412m.m108593f(str, "it.field_username");
                concurrentHashMap.put(str, bVar);
                arrayList.add(bVar.field_username);
            }
            System.currentTimeMillis();
            return arrayList;
        } catch (Throwable th) {
            System.currentTimeMillis();
            throw th;
        }
    }

    /* renamed from: q0 */
    public boolean mo90676q0(String str) {
        C87412m.m108594g(str, "finderUsername");
        return (mo90658I1().length() > 0) && C87412m.m108589b(mo90658I1(), str);
    }

    /* renamed from: q1 */
    public boolean mo90677q1(String str) {
        C87412m.m108594g(str, "finderUsername");
        return C66783a.C66784a.m78798a(this, str, false, 2, (Object) null) != null;
    }

    /* renamed from: t0 */
    public C54446b mo90678t0(boolean z) {
        return mo90661N1(mo90662O5(), z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: u0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo90679u0(int r9, wx3.C15601d<? super kotlin.Result<? extends te3.C50119ke1>> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof yc1.C66611g.C66614c
            if (r0 == 0) goto L_0x0013
            r0 = r10
            yc1.g$c r0 = (yc1.C66611g.C66614c) r0
            int r1 = r0.f191552f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f191552f = r1
            goto L_0x0018
        L_0x0013:
            yc1.g$c r0 = new yc1.g$c
            r0.<init>(r8, r10)
        L_0x0018:
            r5 = r0
            java.lang.Object r10 = r5.f191550d
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r5.f191552f
            r2 = 1
            if (r1 == 0) goto L_0x0030
            if (r1 != r2) goto L_0x0028
            kotlin.ResultKt.throwOnFailure(r10)     // Catch:{ all -> 0x0050 }
            goto L_0x0049
        L_0x0028:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0030:
            kotlin.ResultKt.throwOnFailure(r10)
            kotlin.Result$Companion r10 = kotlin.Result.Companion     // Catch:{ all -> 0x0050 }
            dd1.f r1 = new dd1.f     // Catch:{ all -> 0x0050 }
            r1.<init>(r9)     // Catch:{ all -> 0x0050 }
            r9 = 0
            r4 = 0
            r6 = 3
            r7 = 0
            r5.f191552f = r2     // Catch:{ all -> 0x0050 }
            r2 = r9
            java.lang.Object r10 = q40.C89456b.m111831a(r1, r2, r4, r5, r6, r7)     // Catch:{ all -> 0x0050 }
            if (r10 != r0) goto L_0x0049
            return r0
        L_0x0049:
            te3.ke1 r10 = (te3.C50119ke1) r10     // Catch:{ all -> 0x0050 }
            java.lang.Object r9 = kotlin.Result.m168114constructorimpl(r10)     // Catch:{ all -> 0x0050 }
            goto L_0x005b
        L_0x0050:
            r9 = move-exception
            kotlin.Result$Companion r10 = kotlin.Result.Companion
            java.lang.Object r9 = kotlin.ResultKt.createFailure(r9)
            java.lang.Object r9 = kotlin.Result.m168114constructorimpl(r9)
        L_0x005b:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: yc1.C66611g.mo90679u0(int, wx3.d):java.lang.Object");
    }

    /* renamed from: v4 */
    public C89132b<C51430tq0> mo90680v4(String str) {
        C87412m.m108594g(str, FirebaseAnalytics.C113379b.SOURCE);
        return new C45327d(str);
    }

    /* renamed from: z1 */
    public boolean mo90681z1() {
        return this.f191543n;
    }
}
