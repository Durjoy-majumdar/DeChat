package g32;

import a70.C112760b;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import b42.C28256f;
import b42.C67150b;
import b42.C67152d;
import b63.C67186g0;
import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.app.C114668z;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.CheckResUpdateCacheFileEvent;
import com.tencent.p014mm.plugin.luckymoney.model.C30158a1;
import com.tencent.p014mm.plugin.luckymoney.model.C30170x0;
import com.tencent.p014mm.plugin.luckymoney.model.C69239k1;
import com.tencent.p014mm.plugin.luckymoney.model.C69266u0;
import com.tencent.p014mm.plugin.luckymoney.model.C69274y0;
import com.tencent.p014mm.plugin.luckymoney.model.C69276z;
import com.tencent.p014mm.plugin.luckymoney.model.C69277z0;
import com.tencent.p014mm.plugin.luckymoney.model.LuckMoneyEffectResourceMgr;
import com.tencent.p014mm.plugin.luckymoney.model.WearLuckyLogic;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.WCWebUpdater;
import di3.C86301e;
import di3.C86312j;
import e63.C75562i;
import eb0.C31543z5;
import ei3.C86522b;
import f12.C7970a;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import nr3.C35015b;
import nr3.C35016g;
import p281yz.C79173v;
import p523fp.C32147e;
import p763ym.C39073u;
import zt3.C119157j;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: g32.b */
public class C75846b extends C86301e implements C114668z {

    /* renamed from: q */
    public static int f222485q = -1;

    /* renamed from: d */
    public C69276z f222486d;

    /* renamed from: e */
    public C69239k1 f222487e;

    /* renamed from: f */
    public C69277z0 f222488f;

    /* renamed from: g */
    public C69274y0 f222489g;

    /* renamed from: h */
    public C30158a1 f222490h;

    /* renamed from: i */
    public WearLuckyLogic f222491i;

    /* renamed from: j */
    public C35016g<C30170x0> f222492j = new C35016g<>(new C32305a(this));

    /* renamed from: n */
    public C35016g<C67150b> f222493n = new C35016g<>(new C75847b(this));

    /* renamed from: o */
    public C35016g<C67152d> f222494o = new C35016g<>(new C75848c(this));

    /* renamed from: p */
    public C35016g<C28256f> f222495p = new C35016g<>(new C32306d(this));

    /* renamed from: g32.b$a */
    public class C32305a implements C35015b<C30170x0> {
        public C32305a(C75846b bVar) {
        }

        public Object get() {
            return new C30170x0(C86709a0.m107535s().f251811i);
        }
    }

    /* renamed from: g32.b$d */
    public class C32306d implements C35015b<C28256f> {
        public C32306d(C75846b bVar) {
        }

        public Object get() {
            return new C28256f(C86709a0.m107535s().f251811i);
        }
    }

    /* renamed from: g32.b$b */
    public class C75847b implements C35015b<C67150b> {
        public C75847b(C75846b bVar) {
        }

        public Object get() {
            return new C67150b(C86709a0.m107535s().f251811i);
        }
    }

    /* renamed from: g32.b$c */
    public class C75848c implements C35015b<C67152d> {
        public C75848c(C75846b bVar) {
        }

        public Object get() {
            return new C67152d(C86709a0.m107535s().f251811i);
        }
    }

    /* renamed from: g32.b$e */
    public class C75849e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f222496d;

        public C75849e(String str) {
            this.f222496d = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00bb, code lost:
            if (r10 != null) goto L_0x00bd;
         */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x00c8  */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x00f3  */
        /* JADX WARNING: Removed duplicated region for block: B:69:0x0175  */
        /* JADX WARNING: Removed duplicated region for block: B:70:0x01af  */
        /* JADX WARNING: Removed duplicated region for block: B:75:0x0158 A[EDGE_INSN: B:75:0x0158->B:64:0x0158 ?: BREAK  , SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r24 = this;
                r1 = r24
                java.lang.Class<f62.k0> r2 = f62.C75700k0.class
                java.lang.String r3 = "MicroMsg.SubCoreLuckyMoney"
                java.lang.String r0 = "start update"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
                long r4 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
                g32.b r0 = g32.C75846b.this
                java.lang.String r6 = r1.f222496d
                r0.getClass()
                boolean r0 = com.tencent.p014mm.storage.C72996z1.m85820U5(r6)
                r7 = 2
                r8 = 0
                r9 = 1
                if (r0 != 0) goto L_0x0022
                goto L_0x0158
            L_0x0022:
                java.lang.Class<yz.v> r0 = p281yz.C79173v.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                yz.v r0 = (p281yz.C79173v) r0
                e63.i r0 = r0.mo109172tc()
                r0.getClass()
                boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
                if (r10 == 0) goto L_0x0039
                goto L_0x00cf
            L_0x0039:
                com.tencent.mm.sdk.storage.ISQLiteDatabase r10 = r0.f221985d
                boolean r10 = r10 instanceof zh3.C91753f
                if (r10 == 0) goto L_0x00cf
                com.tencent.wcdb.support.CancellationSignal r10 = new com.tencent.wcdb.support.CancellationSignal
                r10.<init>()
                e63.h r15 = new e63.h
                r15.<init>(r0, r10, r6)
                r12 = 5000(0x1388, double:2.4703E-320)
                com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThreadDelayed(r15, r12)
                com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r0.f221985d     // Catch:{ Exception -> 0x00ae, all -> 0x00a9 }
                zh3.f r0 = (zh3.C91753f) r0     // Catch:{ Exception -> 0x00ae, all -> 0x00a9 }
                com.tencent.wcdb.database.SQLiteDatabase r12 = r0.mo125615f()     // Catch:{ Exception -> 0x00ae, all -> 0x00a9 }
                r13 = 0
                java.lang.String r14 = "WalletLuckyMoney"
                java.lang.String r0 = "*"
                java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch:{ Exception -> 0x00ae, all -> 0x00a9 }
                java.lang.String r16 = "sender=?"
                java.lang.String[] r11 = new java.lang.String[r9]     // Catch:{ Exception -> 0x00ae, all -> 0x00a9 }
                r11[r8] = r6     // Catch:{ Exception -> 0x00ae, all -> 0x00a9 }
                r18 = 0
                r19 = 0
                r20 = 0
                r21 = 0
                r23 = r15
                r15 = r0
                r17 = r11
                r22 = r10
                com.tencent.wcdb.Cursor r10 = r12.query(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x00a7, all -> 0x00a5 }
                boolean r0 = r10.moveToFirst()     // Catch:{ Exception -> 0x00a3 }
                if (r0 == 0) goto L_0x009f
                java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ Exception -> 0x00a3 }
                r0.<init>()     // Catch:{ Exception -> 0x00a3 }
            L_0x0083:
                b63.g0 r11 = new b63.g0     // Catch:{ Exception -> 0x00a3 }
                r11.<init>()     // Catch:{ Exception -> 0x00a3 }
                r11.convertFrom(r10)     // Catch:{ Exception -> 0x00a3 }
                r0.add(r11)     // Catch:{ Exception -> 0x00a3 }
                boolean r11 = r10.moveToNext()     // Catch:{ Exception -> 0x00a3 }
                if (r11 != 0) goto L_0x0083
                r10.close()     // Catch:{ Exception -> 0x00a3 }
                r10.close()
                com.tencent.p014mm.sdk.platformtools.MMHandlerThread.removeRunnable(r23)
                r11 = r0
                goto L_0x00d0
            L_0x009f:
                r10.close()     // Catch:{ Exception -> 0x00a3 }
                goto L_0x00bd
            L_0x00a3:
                r0 = move-exception
                goto L_0x00b2
            L_0x00a5:
                r0 = move-exception
                goto L_0x00ac
            L_0x00a7:
                r0 = move-exception
                goto L_0x00b1
            L_0x00a9:
                r0 = move-exception
                r23 = r15
            L_0x00ac:
                r11 = 0
                goto L_0x00c6
            L_0x00ae:
                r0 = move-exception
                r23 = r15
            L_0x00b1:
                r10 = 0
            L_0x00b2:
                java.lang.String r11 = "MicroMsg.WalletLuckyMoneyStg"
                java.lang.String r12 = ""
                java.lang.Object[] r13 = new java.lang.Object[r8]     // Catch:{ all -> 0x00c4 }
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r11, r0, r12, r13)     // Catch:{ all -> 0x00c4 }
                if (r10 == 0) goto L_0x00c0
            L_0x00bd:
                r10.close()
            L_0x00c0:
                com.tencent.p014mm.sdk.platformtools.MMHandlerThread.removeRunnable(r23)
                goto L_0x00cf
            L_0x00c4:
                r0 = move-exception
                r11 = r10
            L_0x00c6:
                if (r11 == 0) goto L_0x00cb
                r11.close()
            L_0x00cb:
                com.tencent.p014mm.sdk.platformtools.MMHandlerThread.removeRunnable(r23)
                throw r0
            L_0x00cf:
                r11 = 0
            L_0x00d0:
                if (r11 == 0) goto L_0x0158
                boolean r0 = r11.isEmpty()
                if (r0 != 0) goto L_0x0158
                java.lang.Object[] r0 = new java.lang.Object[r9]
                int r10 = r11.size()
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
                r0[r8] = r10
                java.lang.String r10 = "query record count: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r10, r0)
                java.util.Iterator r0 = r11.iterator()
            L_0x00ed:
                boolean r10 = r0.hasNext()
                if (r10 == 0) goto L_0x0158
                java.lang.Object r10 = r0.next()
                b63.g0 r10 = (b63.C67186g0) r10
                int r11 = r10.field_hbType
                r12 = 3
                if (r11 != r12) goto L_0x00ed
                java.lang.String r11 = eb0.C75592q0.m90789s()
                java.lang.String r12 = r10.field_exclusiveUsername
                boolean r11 = r11.equals(r12)
                if (r11 == 0) goto L_0x00ed
                int r11 = r10.field_hbStatus
                r12 = 4
                if (r11 == r12) goto L_0x00ed
                r12 = 5
                if (r11 == r12) goto L_0x00ed
                int r11 = r10.field_invalidtime
                long r11 = (long) r11
                r13 = 1000(0x3e8, double:4.94E-321)
                long r11 = r11 * r13
                long r13 = eb0.C31543z5.m39453c()
                long r11 = r11 - r13
                r13 = 0
                int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                if (r15 <= 0) goto L_0x00ed
                k40.a r11 = f40.C86709a0.m107533q(r2)
                f62.k0 r11 = (f62.C75700k0) r11
                g62.l r11 = r11.mo96095LE()
                long r8 = r10.field_msgSvrId
                com.tencent.mm.storage.g4 r11 = (com.tencent.p014mm.storage.C72972g4) r11
                com.tencent.mm.storage.f4 r8 = r11.h30(r6, r8)
                long r8 = r8.getMsgId()
                int r11 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
                if (r11 <= 0) goto L_0x0155
                java.lang.Object[] r0 = new java.lang.Object[r7]
                long r8 = r10.field_msgSvrId
                java.lang.Long r6 = java.lang.Long.valueOf(r8)
                r8 = 0
                r0[r8] = r6
                java.lang.String r6 = r10.field_sendId
                r8 = 1
                r0[r8] = r6
                java.lang.String r6 = "need mark red: %s, %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r6, r0)
                r8 = 1
                goto L_0x0159
            L_0x0155:
                r8 = 0
                r9 = 1
                goto L_0x00ed
            L_0x0158:
                r8 = 0
            L_0x0159:
                k40.a r0 = f40.C86709a0.m107533q(r2)
                f62.k0 r0 = (f62.C75700k0) r0
                com.tencent.mm.storage.v3 r0 = r0.mo96094Ku()
                java.lang.String r6 = r1.f222496d
                com.tencent.mm.storage.i2 r0 = (com.tencent.p014mm.storage.C44660i2) r0
                com.tencent.mm.storage.h2 r0 = r0.mo69771j(r6)
                if (r0 == 0) goto L_0x01af
                java.lang.String r6 = r1.f222496d
                boolean r6 = com.tencent.p014mm.storage.C72996z1.m85820U5(r6)
                if (r6 == 0) goto L_0x01af
                java.lang.Object[] r6 = new java.lang.Object[r7]
                java.lang.String r7 = r1.f222496d
                r9 = 0
                r6[r9] = r7
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r8)
                r9 = 1
                r6[r9] = r7
                java.lang.String r7 = "update red flag: %s, %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r7, r6)
                r0.mo108802X2(r8)
                k40.a r2 = f40.C86709a0.m107533q(r2)
                f62.k0 r2 = (f62.C75700k0) r2
                com.tencent.mm.storage.v3 r2 = r2.mo96094Ku()
                java.lang.String r6 = r1.f222496d
                com.tencent.mm.storage.i2 r2 = (com.tencent.p014mm.storage.C44660i2) r2
                r7 = 1
                int r0 = r2.mo69775m0(r0, r6, r7, r7)
                java.lang.Object[] r2 = new java.lang.Object[r7]
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r6 = 0
                r2[r6] = r0
                java.lang.String r0 = "update ret: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r0, r2)
                goto L_0x01b1
            L_0x01af:
                r6 = 0
                r7 = 1
            L_0x01b1:
                java.lang.Object[] r0 = new java.lang.Object[r7]
                long r7 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
                long r7 = r7 - r4
                java.lang.Long r2 = java.lang.Long.valueOf(r7)
                r0[r6] = r2
                java.lang.String r2 = "finish update red flag: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r2, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: g32.C75846b.C75849e.run():void");
        }
    }

    /* renamed from: g32.b$f */
    public class C75850f implements Runnable {
        public C75850f() {
        }

        public void run() {
            Cursor query;
            Throwable th;
            C75846b bVar = C75846b.this;
            bVar.getClass();
            Class cls = C79173v.class;
            C85801v1 i = C86709a0.m107535s().mo121142i();
            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_WALLET_HB_RED_FLAG_CHECK_LONG_SYNC;
            if (C31543z5.m39453c() - ((Long) i.mo119685f(aVar, 0L)).longValue() > 43200000) {
                C86709a0.m107535s().mo121142i().mo119677K(aVar, Long.valueOf(C31543z5.m39453c()));
                C75562i zx02 = ((C79173v) C86312j.m106911c(cls)).mo109172tc();
                zx02.getClass();
                ArrayList arrayList = new ArrayList();
                try {
                    query = zx02.f221985d.query("WalletLuckyMoney", new String[]{"*", "rowid"}, "hbType=? AND hbStatus!=? AND hbStatus!=?", new String[]{"3", WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL}, (String) null, (String) null, (String) null, 2);
                    if (query.moveToFirst()) {
                        do {
                            C67186g0 g0Var = new C67186g0();
                            g0Var.convertFrom(query);
                            arrayList.add(g0Var);
                        } while (query.moveToNext());
                        query.close();
                    } else {
                        query.close();
                    }
                    query.close();
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.WalletLuckyMoneyStg", e, "getActiveLuckyMoneyItem error: %s", e.getMessage());
                } catch (Throwable th4) {
                    th.addSuppressed(th4);
                }
                HashSet hashSet = new HashSet();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C67186g0 g0Var2 = (C67186g0) it.next();
                    Log.m105919d("MicroMsg.SubCoreLuckyMoney", "check status: %s, type: %s", Integer.valueOf(g0Var2.field_hbStatus), Integer.valueOf(g0Var2.field_hbType));
                    if (!hashSet.contains(g0Var2.field_sender)) {
                        bVar.Fx0(g0Var2.field_sender);
                        hashSet.add(g0Var2.field_sender);
                    }
                }
                Cursor all = ((C79173v) C86312j.m106911c(cls)).mo109172tc().getAll();
                if (all != null) {
                    C115669n.INSTANCE.mo160131h(22303, Integer.valueOf(all.getCount()));
                    Log.m105925i("MicroMsg.SubCoreLuckyMoney", "get record count: %s", all);
                    return;
                }
                return;
            }
            Log.m105924i("MicroMsg.SubCoreLuckyMoney", "not time");
            return;
            throw th;
        }
    }

    public C75846b() {
        Uri n = C116299g2.m163858n(Dx0());
        String path = n.getPath();
        boolean z = false;
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!n.getPath().equals(k)) {
                n = n.buildUpon().path(k).build();
            }
        }
        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
        if (!(l.mo177810a() ? l.f348991a.mo119948x(l.f348992b) : z)) {
            C116281f0.C116288h l2 = C116281f0.C116289i.f348994a.mo177799l(n, l);
            if (l2.mo177810a()) {
                l2.f348991a.mo119937g(l2.f348992b);
            }
        }
    }

    public static C75846b zx0() {
        return (C75846b) C86312j.m106911c(C75846b.class);
    }

    public C28256f Ax0() {
        return this.f222495p.mo59825a();
    }

    public synchronized C30158a1 Bx0() {
        if (this.f222490h == null) {
            this.f222490h = new C30158a1();
        }
        return this.f222490h;
    }

    public C67150b Cx0() {
        return this.f222493n.mo59825a();
    }

    public String Dx0() {
        if (!C86709a0.m107522a()) {
            return "";
        }
        return C7970a.m8127a() + "luckymoney";
    }

    public C67152d Ex0() {
        return this.f222494o.mo59825a();
    }

    public void Fx0(String str) {
        ((C119157j) C119157j.f356862d).mo183876g(new C75849e(str), "update_hb_red_flag");
    }

    public void onAccountInitialized(Context context) {
        super.onAccountInitialized(context);
        String str = C69266u0.f199336d;
        Class cls = C32147e.class;
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo175911u(991, 18);
        ((C32147e) C86312j.m106911c(cls)).Yi0(58);
        nVar.mo175911u(991, 24);
        ((C32147e) C86312j.m106911c(cls)).Yi0(104);
        AppForegroundDelegate.INSTANCE.mo174208a(this);
        C86709a0.m107528h();
        boolean z = System.currentTimeMillis() - C86709a0.m107535s().mo121142i().mo119672F(352276, 0) >= 43200000;
        boolean z2 = C86709a0.m107523b().f251754e.f222289a;
        Log.m105924i("MicroMsg.SubCoreLuckyMoney", "isTime=" + z + ", isUpdate=" + z2);
        if (z2 || z) {
            Log.m105924i("MicroMsg.SubCoreLuckyMoney", "get service applist");
            ((C39073u) C86312j.m106911c(C39073u.class)).mo61916Ap(MMApplicationContext.getContext());
        }
        this.f222491i = new WearLuckyLogic();
        IListener<CheckResUpdateCacheFileEvent> iListener = LuckMoneyEffectResourceMgr.f81526a;
        C86009m1 m1Var = new C86009m1(C112760b.m154195C() + "wallet/luckyMoneyEffect" + "/");
        Log.m105918d("MicroMsg.LuckMoneyEffectResourceMgr", "no media");
        if (m1Var.mo119977o() && m1Var.mo119967g()) {
            Log.m105925i("MicroMsg.LuckMoneyEffectResourceMgr", "delete unused files: %s", Boolean.valueOf(C86013q1.m106446g(m1Var.mo119976n(), true)));
        }
    }

    public void onAccountReleased(Context context) {
        super.onAccountReleased(context);
        ((C39073u) C86312j.m106911c(C39073u.class)).mo61917eR();
        AppForegroundDelegate.INSTANCE.mo174215k(this);
        synchronized (this) {
            this.f222490h = null;
        }
        WearLuckyLogic wearLuckyLogic = this.f222491i;
        if (wearLuckyLogic != null) {
            wearLuckyLogic.f198937h.dead();
            if (wearLuckyLogic.f198934e != null) {
                C86709a0.m107528h();
                C86709a0.m107529k().f251779b.mo123458d(wearLuckyLogic.f198934e);
                wearLuckyLogic.f198934e = null;
            }
            if (wearLuckyLogic.f198935f != null) {
                C86709a0.m107528h();
                C86709a0.m107529k().f251779b.mo123458d(wearLuckyLogic.f198935f);
                wearLuckyLogic.f198935f = null;
            }
        }
        IListener<CheckResUpdateCacheFileEvent> iListener = LuckMoneyEffectResourceMgr.f81526a;
        Log.m105924i("MicroMsg.LuckMoneyEffectResourceMgr", "unInit");
        LuckMoneyEffectResourceMgr.f81526a.dead();
    }

    public void onAppBackground(String str) {
        ((C119157j) C119157j.f356862d).mo183876g(new C75850f(), "check_hb_red_flag_background");
    }

    public void onAppForeground(String str) {
    }

    public C69276z vx0() {
        Log.m105924i("MicroMsg.SubCoreLuckyMoney", "getConfigMgr()");
        C86709a0.m107523b().mo121108c();
        if (zx0().f222486d == null) {
            zx0().f222486d = new C69276z();
        }
        return zx0().f222486d;
    }

    public C69274y0 wx0() {
        Log.m105924i("MicroMsg.SubCoreLuckyMoney", "getConfigMgrHK()");
        C86709a0.m107523b().mo121108c();
        if (zx0().f222489g == null) {
            zx0().f222489g = new C69274y0();
        }
        return zx0().f222489g;
    }

    public C69277z0 xx0() {
        Log.m105924i("MicroMsg.SubCoreLuckyMoney", "getConfigMgrLive()");
        C86709a0.m107523b().mo121108c();
        if (zx0().f222488f == null) {
            zx0().f222488f = new C69277z0();
        }
        return zx0().f222488f;
    }

    public C69239k1 yx0() {
        Log.m105924i("MicroMsg.SubCoreLuckyMoney", "getConfigMgrUnion()");
        C86709a0.m107523b().mo121108c();
        if (zx0().f222487e == null) {
            zx0().f222487e = new C69239k1();
        }
        return zx0().f222487e;
    }
}
