package i40;

import androidx.lifecycle.C0123n0;
import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C54209k0;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.mvvm.BaseMvvmDB;
import com.tencent.p014mm.sdk.storage.mvvm.IMvvmDBProvider;
import com.tencent.p014mm.sdk.storage.mvvm.MvvmStorage;
import f40.C86709a0;
import gy3.C8480h;
import gy3.C87412m;
import zh3.C91753f;

/* renamed from: i40.c */
public abstract class C60247c extends BaseMvvmDB {

    /* renamed from: g */
    public static final C60248a f171775g = new C60248a((C8480h) null);

    /* renamed from: h */
    public static final byte[] f171776h = new byte[0];

    /* renamed from: d */
    public final Object f171777d = new Object();

    /* renamed from: e */
    public volatile boolean f171778e;

    /* renamed from: f */
    public C91753f f171779f;

    /* renamed from: i40.c$a */
    public static final class C60248a {

        /* renamed from: i40.c$a$a */
        public static final class C60249a implements C54209k0.C54210b {
            public <T extends C39622i0> T create(Class<T> cls) {
                C87412m.m108594g(cls, "modelClass");
                return (C39622i0) cls.newInstance();
            }
        }

        public C60248a(C8480h hVar) {
        }

        /* renamed from: a */
        public final <T extends C39622i0> T mo85234a(Class<T> cls) {
            T a;
            C87412m.m108594g(cls, "modelClass");
            synchronized (C60247c.f171776h) {
                C86709a0.m107523b().mo121108c();
                if (C60247c.class.isAssignableFrom(cls)) {
                    a = new C54209k0((C0123n0) C86709a0.m107523b().f251755f, (C54209k0.C54210b) new C60249a()).mo75002a(cls);
                } else {
                    throw new IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                }
            }
            return a;
        }
    }

    /* renamed from: i40.c$b */
    public static final class C60250b implements C54209k0.C54210b {

        /* renamed from: a */
        public final /* synthetic */ C60247c f171780a;

        public C60250b(C60247c cVar) {
            this.f171780a = cVar;
        }

        public <T extends C39622i0> T create(Class<T> cls) {
            C87412m.m108594g(cls, "modelClass");
            return (C39622i0) cls.getConstructor(new Class[]{IMvvmDBProvider.class}).newInstance(new Object[]{this.f171780a});
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ce, code lost:
        return r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00db, code lost:
        return r11;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0095 A[LOOP:0: B:23:0x008f->B:25:0x0095, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c9  */
    /* renamed from: c3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo85232c3(java.lang.String r17) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            java.lang.String r2 = "dbPath"
            gy3.C87412m.m108594g(r0, r2)
            java.lang.Object r10 = r1.f171777d
            monitor-enter(r10)
            boolean r2 = r1.f171778e     // Catch:{ all -> 0x00dc }
            r11 = 0
            r12 = 1
            if (r2 != 0) goto L_0x00cf
            zh3.f r2 = r1.f171779f     // Catch:{ all -> 0x00dc }
            if (r2 != 0) goto L_0x00cf
            long r13 = eb0.C31543z5.m39453c()     // Catch:{ all -> 0x00dc }
            java.lang.String r2 = com.tencent.p014mm.vfs.C86013q1.m106458s(r17)     // Catch:{ all -> 0x00dc }
            boolean r3 = com.tencent.p014mm.vfs.C86013q1.m106450k(r2)     // Catch:{ all -> 0x00dc }
            if (r3 != 0) goto L_0x0027
            com.tencent.p014mm.vfs.C86013q1.m106461v(r2)     // Catch:{ all -> 0x00dc }
        L_0x0027:
            zh3.f r2 = new zh3.f     // Catch:{ all -> 0x00dc }
            r2.<init>()     // Catch:{ all -> 0x00dc }
            r1.f171779f = r2     // Catch:{ all -> 0x00dc }
            java.util.HashMap r8 = new java.util.HashMap     // Catch:{ all -> 0x00dc }
            r8.<init>()     // Catch:{ all -> 0x00dc }
            boolean r2 = r16.mo75299e3()     // Catch:{ all -> 0x00dc }
            r15 = 0
            if (r2 == 0) goto L_0x0059
            zh3.f r2 = r1.f171779f     // Catch:{ all -> 0x00dc }
            if (r2 == 0) goto L_0x0066
            java.lang.String r3 = ""
            f40.e r4 = f40.C86709a0.m107523b()     // Catch:{ all -> 0x00dc }
            int r4 = r4.mo121110g()     // Catch:{ all -> 0x00dc }
            long r5 = (long) r4     // Catch:{ all -> 0x00dc }
            java.lang.String r7 = p156gj.C87203t.m108270f(r12)     // Catch:{ all -> 0x00dc }
            r9 = 0
            r4 = r17
            boolean r2 = r2.mo125623m(r3, r4, r5, r7, r8, r9)     // Catch:{ all -> 0x00dc }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x00dc }
            goto L_0x0067
        L_0x0059:
            zh3.f r2 = r1.f171779f     // Catch:{ all -> 0x00dc }
            if (r2 == 0) goto L_0x0066
            boolean r2 = r2.mo125626p(r0, r8, r11, r12)     // Catch:{ all -> 0x00dc }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x00dc }
            goto L_0x0067
        L_0x0066:
            r2 = r15
        L_0x0067:
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00dc }
            boolean r3 = gy3.C87412m.m108589b(r2, r3)     // Catch:{ all -> 0x00dc }
            if (r3 != 0) goto L_0x0087
            java.lang.String r3 = "MicroMsg.Mvvm.MMMvvmDB"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00dc }
            r4.<init>()     // Catch:{ all -> 0x00dc }
            java.lang.String r5 = "create db error, dbPath:"
            r4.append(r5)     // Catch:{ all -> 0x00dc }
            r4.append(r0)     // Catch:{ all -> 0x00dc }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x00dc }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)     // Catch:{ all -> 0x00dc }
            r1.f171779f = r15     // Catch:{ all -> 0x00dc }
        L_0x0087:
            java.util.Set r3 = r16.getAutoDBItemSet()     // Catch:{ all -> 0x00dc }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x00dc }
        L_0x008f:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x00dc }
            if (r4 == 0) goto L_0x00a1
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x00dc }
            com.tencent.mm.sdk.storage.IAutoDBItem r4 = (com.tencent.p014mm.sdk.storage.IAutoDBItem) r4     // Catch:{ all -> 0x00dc }
            zh3.f r5 = r1.f171779f     // Catch:{ all -> 0x00dc }
            r4.createMyTable(r5)     // Catch:{ all -> 0x00dc }
            goto L_0x008f
        L_0x00a1:
            long r3 = eb0.C31543z5.m39453c()     // Catch:{ all -> 0x00dc }
            r1.f171778e = r12     // Catch:{ all -> 0x00dc }
            java.lang.String r5 = "MicroMsg.Mvvm.MMMvvmDB"
            java.lang.String r6 = "initDB params %d %s %s"
            r7 = 3
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x00dc }
            long r3 = r3 - r13
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x00dc }
            r7[r11] = r3     // Catch:{ all -> 0x00dc }
            long r3 = com.tencent.p014mm.vfs.C86013q1.m106451l(r17)     // Catch:{ all -> 0x00dc }
            r8 = 4636737291354636288(0x4059000000000000, double:100.0)
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.getSizeMB(r3, r8)     // Catch:{ all -> 0x00dc }
            r7[r12] = r3     // Catch:{ all -> 0x00dc }
            r3 = 2
            r7[r3] = r0     // Catch:{ all -> 0x00dc }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r6, r7)     // Catch:{ all -> 0x00dc }
            if (r2 == 0) goto L_0x00cd
            boolean r11 = r2.booleanValue()     // Catch:{ all -> 0x00dc }
        L_0x00cd:
            monitor-exit(r10)
            return r11
        L_0x00cf:
            zh3.f r0 = r1.f171779f     // Catch:{ all -> 0x00dc }
            if (r0 == 0) goto L_0x00da
            boolean r0 = r0.mo125628r()     // Catch:{ all -> 0x00dc }
            if (r0 != r12) goto L_0x00da
            r11 = 1
        L_0x00da:
            monitor-exit(r10)
            return r11
        L_0x00dc:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i40.C60247c.mo85232c3(java.lang.String):boolean");
    }

    /* renamed from: d3 */
    public final <T extends MvvmStorage<? extends IAutoDBItem>> T mo85233d3(Class<T> cls) {
        C87412m.m108594g(cls, "modelClass");
        T a = new C54209k0(getViewModelStore(), (C54209k0.C54210b) new C60250b(this)).mo75002a(cls);
        C87412m.m108593f(a, "fun <T : MvvmStorage<out… }).get(modelClass)\n    }");
        return (MvvmStorage) a;
    }

    /* renamed from: e3 */
    public abstract boolean mo75299e3();

    public ISQLiteDatabase getDB() {
        synchronized (this.f171777d) {
            C91753f fVar = this.f171779f;
            boolean z = true;
            if (fVar == null || !fVar.mo125628r()) {
                z = false;
            }
            if (!z) {
                return null;
            }
            C91753f fVar2 = this.f171779f;
            return fVar2;
        }
    }

    public void onCleared() {
        C91753f fVar;
        super.onCleared();
        C91753f fVar2 = this.f171779f;
        boolean z = true;
        if (fVar2 == null || !fVar2.mo125628r()) {
            z = false;
        }
        if (z && (fVar = this.f171779f) != null) {
            fVar.mo124432b();
        }
        this.f171778e = false;
        this.f171779f = null;
    }
}
