package com.tencent.p014mm.p136ui;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.JDSysMsgNotifyEvent;
import com.tencent.p014mm.autogen.events.SearchSysMsgNotifyEvent;
import com.tencent.p014mm.autogen.events.UnreadChangeEvent;
import com.tencent.p014mm.p136ui.LauncherUI;
import com.tencent.p014mm.plugin.ipcall.C4611d;
import com.tencent.p014mm.plugin.newtips.model.C115620d;
import com.tencent.p014mm.plugin.newtips.model.C115627l;
import com.tencent.p014mm.plugin.subapp.jdbiz.C96461f;
import com.tencent.p014mm.plugin.subapp.jdbiz.C96463h;
import com.tencent.p014mm.pluginsdk.platformtools.C96796d;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C75592q0;
import eb0.C97625j3;
import f40.C86709a0;
import gc2.C116945b;
import hp3.C87581a;
import ht1.C76244c4;
import java.lang.ref.WeakReference;
import jr2.C99018v;
import lc3.C10485b;
import lp3.C88633e;
import lp3.C88643g;
import m13.C88689b;
import na3.C88908g;
import nc0.C76850a;
import o03.C21723h;
import p03.C21912d;
import p167hz.C21032k;
import p274xx.C66446g;
import p327ct.C20362d;
import p787ai.C79547b;
import te3.rh4;
import u73.C22611g1;

/* renamed from: com.tencent.mm.ui.MainTabUnreadMgr */
public class MainTabUnreadMgr implements MStorageEx.IOnStorageChange {

    /* renamed from: d */
    public MMFragmentActivity f214450d;

    /* renamed from: e */
    public LauncherUI.C73064e f214451e;

    /* renamed from: f */
    public C76244c4 f214452f;

    /* renamed from: g */
    public C74809q f214453g;

    /* renamed from: h */
    public boolean f214454h = false;

    /* renamed from: i */
    public boolean f214455i;

    /* renamed from: j */
    public Runnable f214456j = new C73088a();

    /* renamed from: n */
    public IListener f214457n;

    /* renamed from: o */
    public IListener<SearchSysMsgNotifyEvent> f214458o;

    /* renamed from: p */
    public C73091e f214459p;

    /* renamed from: q */
    public C20362d.C20363a f214460q;

    /* renamed from: r */
    public MStorageEx.IOnStorageChange f214461r;

    /* renamed from: s */
    public IListener f214462s;

    /* renamed from: t */
    public final C76244c4.C60156a f214463t;

    /* renamed from: com.tencent.mm.ui.MainTabUnreadMgr$b */
    public class C57632b implements C76244c4.C60156a {
        public C57632b() {
        }

        /* renamed from: a */
        public void mo81977a(String str) {
            C74809q qVar = MainTabUnreadMgr.this.f214453g;
            if (qVar != null) {
                ((LauncherUIBottomTabView) qVar).mo101398g(true, str);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.MainTabUnreadMgr$d */
    public class C57633d implements MStorageEx.IOnStorageChange {
        public C57633d() {
        }

        public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
            int nullAsInt = Util.nullAsInt(obj, 0);
            Log.m105919d("MicroMsg.LauncherUI.MainTabUnreadMgr", "onNotifyChange event:%d obj:%d stg:%s", Integer.valueOf(i), Integer.valueOf(nullAsInt), mStorageEx);
            if (mStorageEx != C97625j3.m125812b().mo105906u() || nullAsInt <= 0) {
                Log.m105921e("MicroMsg.LauncherUI.MainTabUnreadMgr", "onNotifyChange error obj:%d stg:%s", Integer.valueOf(nullAsInt), mStorageEx);
                return;
            }
            MainTabUnreadMgr mainTabUnreadMgr = MainTabUnreadMgr.this;
            mainTabUnreadMgr.getClass();
            C79547b.f233255g.mo109607a(new C57849s2(mainTabUnreadMgr));
            if (nullAsInt == 143618) {
                MainTabUnreadMgr mainTabUnreadMgr2 = MainTabUnreadMgr.this;
                mainTabUnreadMgr2.getClass();
                MMHandlerThread.postToMainThread(new C57845o2(mainTabUnreadMgr2));
            } else if (nullAsInt == 204817 || nullAsInt == 204820) {
                MainTabUnreadMgr.m86008a(MainTabUnreadMgr.this);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.MainTabUnreadMgr$a */
    public class C73088a implements Runnable {

        /* renamed from: com.tencent.mm.ui.MainTabUnreadMgr$a$a */
        public class C19678a implements C87581a<Void, Integer> {
            public C19678a() {
            }

            public Object call(Object obj) {
                Integer num = (Integer) obj;
                Class cls = C88908g.class;
                Class cls2 = C21912d.class;
                Class cls3 = C10485b.class;
                ((LauncherUIBottomTabView) MainTabUnreadMgr.this.f214453g).mo101397f(false);
                ((LauncherUIBottomTabView) MainTabUnreadMgr.this.f214453g).mo101401i(num.intValue());
                if (MainTabUnreadMgr.this.f214452f.mo77217i()) {
                    MainTabUnreadMgr mainTabUnreadMgr = MainTabUnreadMgr.this;
                    ((LauncherUIBottomTabView) mainTabUnreadMgr.f214453g).mo101398g(true, mainTabUnreadMgr.f214452f.mo77209a());
                } else {
                    if (MainTabUnreadMgr.this.f214452f.mo77213e()) {
                        ((LauncherUIBottomTabView) MainTabUnreadMgr.this.f214453g).mo101397f(true);
                    }
                    if (num.intValue() <= 0 && (C75592q0.m90785o() & 32768) == 0 && ((C66446g) C86312j.m106911c(C66446g.class)).mo61613tF()) {
                        if (!Util.isNullOrNil((String) C97625j3.m125812b().mo105906u().mo119684e(68377, (Object) null))) {
                            ((LauncherUIBottomTabView) MainTabUnreadMgr.this.f214453g).mo101397f(true);
                        } else if (((Boolean) C97625j3.m125812b().mo105906u().mo119684e(589825, Boolean.FALSE)).booleanValue()) {
                            ((LauncherUIBottomTabView) MainTabUnreadMgr.this.f214453g).mo101397f(true);
                        } else {
                            Object f = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_SNS_MEDIA_COLLAPSE_SNS_ID_LONG, (Object) null);
                            long longValue = f == null ? 0 : ((Long) f).longValue();
                            if (longValue != 0 && ((C99018v) C86312j.m106911c(C99018v.class)).ej0(longValue)) {
                                ((LauncherUIBottomTabView) MainTabUnreadMgr.this.f214453g).mo101397f(true);
                            }
                        }
                    }
                    if (num.intValue() <= 0) {
                        if (!((C75592q0.m90781k() & 4194304) != 0) && !C96463h.yx0().mo134444UX() && C96796d.m124292a() != null) {
                            C96463h.yx0().getClass();
                            boolean equals = "1".equals((String) C97625j3.m125812b().mo105906u().mo119684e(327938, ""));
                            Log.m105924i("MicroMsg.LauncherUI.MainTabUnreadMgr", "jdshowFriend " + equals);
                            if (equals) {
                                C96461f Dx0 = C96463h.yx0().Dx0();
                                if (!Dx0.mo134437e() || Dx0.mo134436d()) {
                                    Log.m105924i("MicroMsg.LauncherUI.MainTabUnreadMgr", "jd time is not start or jd time isExpire");
                                } else {
                                    ((LauncherUIBottomTabView) MainTabUnreadMgr.this.f214453g).mo101397f(true);
                                }
                            }
                        }
                        C21032k t4 = ((C21912d) C86312j.m106911c(cls2)).mo34966t4();
                        if (C76850a.m92639k((String) C86709a0.m107535s().mo121142i().mo119684e(274436, (Object) null))) {
                            Log.m105924i("MicroMsg.LauncherUI.MainTabUnreadMgr", "checkLookVisibility EuropeanUnionCountry");
                        } else if (t4 != null && ((C21723h) t4).mo33981A()) {
                            rh4 rh4 = ((C21723h) ((C21912d) C86312j.m106911c(cls2)).mo34966t4()).f61498b;
                            if (rh4 != null && rh4.f64542p == 1) {
                                ((LauncherUIBottomTabView) MainTabUnreadMgr.this.f214453g).mo101397f(true);
                            }
                        }
                        if (((C88908g) C86312j.m106911c(cls)).Ib0("labs_nearbylife") && ((C88908g) C86312j.m106911c(cls)).mo123296x("labs_nearbylife") && ((Boolean) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.MY_LIFE_AROUND_APP_NEW_RED_DOT_TAG_BOOLEAN, Boolean.TRUE)).booleanValue()) {
                            ((LauncherUIBottomTabView) MainTabUnreadMgr.this.f214453g).mo101397f(true);
                        }
                        if (!((C75592q0.m90781k() & 2097152) != 0)) {
                            C22611g1 g1Var = C22611g1.f65023c;
                            C22611g1.C22612a aVar = g1Var.f65024a;
                            if (aVar != null && aVar.mo35735a() && g1Var.f65024a.f65035j == 1) {
                                ((LauncherUIBottomTabView) MainTabUnreadMgr.this.f214453g).mo101397f(true);
                            }
                        }
                        boolean z = (C75592q0.m90781k() & 33554432) != 0;
                        if (!C4611d.m4902a()) {
                            C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERFINO_IPCALL_HAS_ENTRY_BOOLEAN, Boolean.FALSE);
                        } else if (!z && !MainTabUnreadMgr.this.f214453g.getShowFriendPoint() && (((Integer) C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERFINO_IPCALL_HAS_ENTRY_FIND_REDDOT_INT, 0)).intValue() < ((C10485b) C86709a0.m107533q(cls3)).vh0().mo107404b("WCOEntranceRedDot", 0) || ((Boolean) C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERFINO_IPCALL_HAS_ENTRY_FIND_REDDOT_NEWXML_BOOLEAN, Boolean.FALSE)).booleanValue())) {
                            ((LauncherUIBottomTabView) MainTabUnreadMgr.this.f214453g).mo101397f(true);
                        }
                    }
                    boolean z2 = (C97625j3.m125812b().mo105906u().mo119688i(40, 0) & 131072) == 0;
                    if ((Util.getInt(((C10485b) C86709a0.m107533q(cls3)).vh0().mo107405c("VoiceprintEntry"), 0) == 1 ? ((Boolean) C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERINFO_VOICEPRINT_MORE_TAB_DOT_SHOW_BOOLEAN, Boolean.FALSE)).booleanValue() : false) && z2) {
                        Log.m105924i("MicroMsg.LauncherUI.MainTabUnreadMgr", "show voiceprint dot");
                        ((LauncherUIBottomTabView) MainTabUnreadMgr.this.f214453g).mo69852a(true);
                    }
                    MainTabUnreadMgr.this.f214455i = false;
                }
                return null;
            }
        }

        /* renamed from: com.tencent.mm.ui.MainTabUnreadMgr$a$b */
        public class C73089b implements C87581a<Integer, Void> {
            public C73089b(C73088a aVar) {
            }

            public Object call(Object obj) {
                Void voidR = (Void) obj;
                return Integer.valueOf(C19802n4.m21509b());
            }
        }

        public C73088a() {
        }

        public void run() {
            if (!C86709a0.m107523b().mo121114l()) {
                Log.m105920e("MicroMsg.LauncherUI.MainTabUnreadMgr", "Account not Ready!!!");
            } else if (MainTabUnreadMgr.this.f214453g == null) {
                Log.m105928w("MicroMsg.LauncherUI.MainTabUnreadMgr", "set tag job, but tab view is null");
            } else {
                ((C88633e) C88643g.m110546d()).mo123064p(new C73089b(this)).mo123062e(new C19678a()).mo11397F(MainTabUnreadMgr.this.f214450d);
                if (((C88689b) C86312j.m106911c(C88689b.class)).mo122757jc()) {
                    ((LauncherUIBottomTabView) MainTabUnreadMgr.this.f214453g).mo69852a(true);
                }
            }
        }

        public String toString() {
            return super.toString() + "|setTagRunnable";
        }
    }

    /* renamed from: com.tencent.mm.ui.MainTabUnreadMgr$c */
    public class C73090c implements C20362d.C20363a {
        public C73090c() {
        }

        /* renamed from: P0 */
        public void mo31843P0(int i, int i2, String str) {
            if (i == 262145 || i == 262156 || i == 262152 || i == 266260 || i == 266267) {
                MainTabUnreadMgr.m86008a(MainTabUnreadMgr.this);
            }
            if (i == 262147 || i == 262149 || i == 352279 || i == 352280) {
                MainTabUnreadMgr.m86008a(MainTabUnreadMgr.this);
            }
        }

        /* renamed from: v0 */
        public void mo31844v0(C72994y1.C72995a aVar, int i, String str) {
            if (aVar == C72994y1.C72995a.USERINFO_WALLET_New_MY_ENTRY_TAB_REDDOT_STRING_SYNC) {
                MainTabUnreadMgr.m86008a(MainTabUnreadMgr.this);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.MainTabUnreadMgr$e */
    public static class C73091e implements C115627l.C69942c {

        /* renamed from: a */
        public WeakReference<C74809q> f214467a;

        public C73091e(C74809q qVar) {
            this.f214467a = new WeakReference<>(qVar);
        }

        /* renamed from: a */
        public void mo96256a(C115620d dVar) {
            C74809q qVar;
            if (dVar != null && dVar.field_tipId == 1 && C116945b.wx0().mo175755d(1) && (qVar = this.f214467a.get()) != null) {
                qVar.mo69852a(true);
            }
        }
    }

    public MainTabUnreadMgr() {
        C40008f fVar = C40008f.f107254d;
        this.f214457n = new IListener<JDSysMsgNotifyEvent>(fVar) {
            {
                this.__eventId = 1450669203;
            }

            public boolean callback(IEvent iEvent) {
                JDSysMsgNotifyEvent jDSysMsgNotifyEvent = (JDSysMsgNotifyEvent) iEvent;
                C79547b.f233255g.mo109607a(new C74808p2(this));
                return true;
            }
        };
        this.f214458o = new IListener<SearchSysMsgNotifyEvent>(fVar) {
            {
                this.__eventId = 1507664325;
            }

            public boolean callback(IEvent iEvent) {
                SearchSysMsgNotifyEvent searchSysMsgNotifyEvent = (SearchSysMsgNotifyEvent) iEvent;
                MainTabUnreadMgr mainTabUnreadMgr = MainTabUnreadMgr.this;
                mainTabUnreadMgr.f214455i = true;
                MMHandlerThread.removeRunnable(mainTabUnreadMgr.f214456j);
                MMHandlerThread.postToMainThread(MainTabUnreadMgr.this.f214456j);
                return false;
            }
        };
        this.f214460q = new C73090c();
        this.f214461r = new C57633d();
        this.f214462s = new IListener<UnreadChangeEvent>(fVar) {
            {
                this.__eventId = 1649005931;
            }

            public boolean callback(IEvent iEvent) {
                Log.m105927v("MicroMsg.LauncherUI.MainTabUnreadMgr", "appTagUnreadChangeListener, event:%s", ((UnreadChangeEvent) iEvent).toString());
                MainTabUnreadMgr mainTabUnreadMgr = MainTabUnreadMgr.this;
                mainTabUnreadMgr.getClass();
                C79547b.f233255g.mo109607a(new C57849s2(mainTabUnreadMgr));
                return false;
            }
        };
        this.f214463t = new C57632b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x03dd  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x03e0  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0435  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0447  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0210  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0271  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0273  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0286  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0294  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x02c5  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x02c7  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x02ca A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0374  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x03ab  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x03b1  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m86008a(com.tencent.p014mm.p136ui.MainTabUnreadMgr r31) {
        /*
            r0 = r31
            r31.getClass()
            java.lang.Class<nz0.e> r1 = nz0.C76982e.class
            java.lang.Class<ct.c> r2 = p327ct.C30914c.class
            boolean r3 = eb0.C97625j3.m125811a()
            java.lang.String r4 = "MicroMsg.LauncherUI.MainTabUnreadMgr"
            if (r3 != 0) goto L_0x0019
            java.lang.String r0 = "want update more menu new tips, but mmcore not ready"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r0)
            goto L_0x0459
        L_0x0019:
            di3.d r3 = di3.C86312j.m106911c(r1)
            nz0.e r3 = (nz0.C76982e) r3
            if (r3 == 0) goto L_0x0024
            r3.mo59836A6()
        L_0x0024:
            di3.d r3 = di3.C86312j.m106911c(r2)
            ct.c r3 = (p327ct.C30914c) r3
            ct.d r3 = r3.mo17862sM()
            l20.a r3 = (l20.C21388a) r3
            r5 = 262156(0x4000c, float:3.67359E-40)
            r6 = 266241(0x41001, float:3.73083E-40)
            boolean r3 = r3.mo33497e(r5, r6)
            di3.d r7 = di3.C86312j.m106911c(r2)
            ct.c r7 = (p327ct.C30914c) r7
            ct.d r7 = r7.mo17862sM()
            l20.a r7 = (l20.C21388a) r7
            boolean r7 = r7.mo33494b(r5, r6)
            f40.C86709a0.m107528h()
            f40.o r8 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r8 = r8.mo121142i()
            com.tencent.mm.storage.y1$a r9 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WALLET_REGION_TYPE_INT_SYNC
            r10 = 0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            java.lang.Object r8 = r8.mo119685f(r9, r11)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            f40.C86709a0.m107528h()
            f40.o r9 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r9 = r9.mo121142i()
            com.tencent.mm.storage.y1$a r11 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WALLET_ENTRY_REDDOT_WALLET_REGION_INT_SYNC
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)
            java.lang.Object r9 = r9.mo119685f(r11, r12)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r11 = 2
            r12 = 1
            if (r8 == 0) goto L_0x00b0
            if (r8 == r12) goto L_0x00b0
            f40.C86709a0.m107528h()
            f40.o r3 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r3 = r3.mo121142i()
            com.tencent.mm.storage.y1$a r7 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WALLET_ENTRY_REDDOT_WALLET_REGION_TYPE_INT_SYNC
            java.lang.Integer r13 = java.lang.Integer.valueOf(r10)
            java.lang.Object r3 = r3.mo119685f(r7, r13)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r8 == r9) goto L_0x00a5
            goto L_0x00ae
        L_0x00a5:
            if (r3 != r12) goto L_0x00a9
            r3 = 1
            goto L_0x00af
        L_0x00a9:
            if (r3 != r11) goto L_0x00ae
            r3 = 0
            r7 = 1
            goto L_0x00b0
        L_0x00ae:
            r3 = 0
        L_0x00af:
            r7 = 0
        L_0x00b0:
            java.lang.Object[] r8 = new java.lang.Object[r11]
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r3)
            r8[r10] = r9
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r7)
            r8[r12] = r9
            java.lang.String r9 = "hasMallNew: %s, hasMallDot: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r9, r8)
            if (r3 != 0) goto L_0x00c7
            if (r7 == 0) goto L_0x015f
        L_0x00c7:
            eb0.c r16 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r6 = r16.mo105906u()
            com.tencent.mm.storage.y1$a r5 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WALLET_ENTRY_REDDOT_PUSH_DATE_LONG_SYNC
            r14 = -1
            java.lang.Long r13 = java.lang.Long.valueOf(r14)
            java.lang.Object r5 = r6.mo119685f(r5, r13)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            java.lang.Class<lc3.b> r13 = lc3.C10485b.class
            k40.a r13 = f40.C86709a0.m107533q(r13)
            lc3.b r13 = (lc3.C10485b) r13
            pj.f r13 = r13.vh0()
            java.lang.String r8 = "PayWalletRedDotExpire"
            java.lang.String r8 = r13.mo107405c(r8)
            long r13 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r8, r14)
            r22 = 86400000(0x5265c00, double:4.2687272E-316)
            long r22 = r22 * r13
            long r11 = java.lang.System.currentTimeMillis()
            double r8 = (double) r11
            r24 = r11
            double r10 = (double) r5
            double r8 = r8 - r10
            r10 = 4725570615333879808(0x4194997000000000, double:8.64E7)
            double r9 = r8 / r10
            r8 = 5
            java.lang.Object[] r11 = new java.lang.Object[r8]
            java.lang.Long r8 = java.lang.Long.valueOf(r5)
            r12 = 0
            r11[r12] = r8
            java.lang.Long r8 = java.lang.Long.valueOf(r13)
            r12 = 1
            r11[r12] = r8
            java.lang.Long r8 = java.lang.Long.valueOf(r22)
            r12 = 2
            r11[r12] = r8
            java.lang.Long r12 = java.lang.Long.valueOf(r24)
            r21 = 3
            r11[r21] = r12
            java.lang.Double r12 = java.lang.Double.valueOf(r9)
            r20 = 4
            r11[r20] = r12
            java.lang.String r12 = "pushTick: %s, expireTime: %s, expireTick: %s, currentTick: %s, passDay: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r12, r11)
            r11 = 0
            int r18 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r18 <= 0) goto L_0x015f
            int r5 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r5 <= 0) goto L_0x015f
            double r5 = (double) r13
            int r11 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r11 < 0) goto L_0x015f
            di3.d r3 = di3.C86312j.m106911c(r2)
            ct.c r3 = (p327ct.C30914c) r3
            ct.d r3 = r3.mo17862sM()
            l20.a r3 = (l20.C21388a) r3
            r5 = 262156(0x4000c, float:3.67359E-40)
            r6 = 0
            r3.mo33509r(r5, r6)
            r3 = 0
            r5 = 2
            r7 = 0
            goto L_0x0161
        L_0x015f:
            r6 = 0
            r5 = 2
        L_0x0161:
            java.lang.Object[] r9 = new java.lang.Object[r5]
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            r9[r6] = r5
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r7)
            r6 = 1
            r9[r6] = r5
            java.lang.String r5 = "after check, hasMallNew: %s, hasMallDot: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r9)
            di3.d r5 = di3.C86312j.m106911c(r2)
            ct.c r5 = (p327ct.C30914c) r5
            ct.d r5 = r5.mo17862sM()
            r6 = 262145(0x40001, float:3.67343E-40)
            l20.a r5 = (l20.C21388a) r5
            r9 = 266241(0x41001, float:3.73083E-40)
            boolean r5 = r5.mo33497e(r6, r9)
            di3.d r6 = di3.C86312j.m106911c(r2)
            ct.c r6 = (p327ct.C30914c) r6
            ct.d r6 = r6.mo17862sM()
            r10 = 266260(0x41014, float:3.7311E-40)
            l20.a r6 = (l20.C21388a) r6
            boolean r6 = r6.mo33494b(r10, r9)
            di3.d r10 = di3.C86312j.m106911c(r2)
            ct.c r10 = (p327ct.C30914c) r10
            ct.d r10 = r10.mo17862sM()
            r11 = 262147(0x40003, float:3.67346E-40)
            l20.a r10 = (l20.C21388a) r10
            boolean r10 = r10.mo33497e(r11, r9)
            di3.d r11 = di3.C86312j.m106911c(r2)
            ct.c r11 = (p327ct.C30914c) r11
            ct.d r11 = r11.mo17862sM()
            r12 = 262149(0x40005, float:3.67349E-40)
            l20.a r11 = (l20.C21388a) r11
            boolean r11 = r11.mo33497e(r12, r9)
            di3.d r12 = di3.C86312j.m106911c(r2)
            ct.c r12 = (p327ct.C30914c) r12
            ct.d r12 = r12.mo17862sM()
            l20.a r12 = (l20.C21388a) r12
            r13 = 262152(0x40008, float:3.67353E-40)
            boolean r12 = r12.mo33494b(r13, r9)
            di3.d r14 = di3.C86312j.m106911c(r2)
            ct.c r14 = (p327ct.C30914c) r14
            ct.d r14 = r14.mo17862sM()
            l20.a r14 = (l20.C21388a) r14
            boolean r14 = r14.mo33497e(r13, r9)
            di3.d r16 = di3.C86312j.m106911c(r2)
            ct.c r16 = (p327ct.C30914c) r16
            ct.d r16 = r16.mo17862sM()
            com.tencent.mm.storage.y1$a r8 = com.tencent.p014mm.storage.C72994y1.C72995a.NEW_BANDAGE_DATASOURCE_DEVICE_PROTECT_STRING_SYNC
            r15 = r16
            l20.a r15 = (l20.C21388a) r15
            boolean r8 = r15.mo33495c(r8, r9)
            di3.d r15 = di3.C86312j.m106911c(r2)
            ct.c r15 = (p327ct.C30914c) r15
            ct.d r15 = r15.mo17862sM()
            r13 = 352279(0x56017, float:4.93648E-40)
            l20.a r15 = (l20.C21388a) r15
            boolean r13 = r15.mo33497e(r13, r9)
            if (r13 != 0) goto L_0x0242
            java.lang.Class<xv2.d> r9 = xv2.C102775d.class
            di3.d r9 = di3.C86312j.m106911c(r9)
            xv2.d r9 = (xv2.C102775d) r9
            xv2.h r9 = r9.ik0()
            boolean r9 = r9.mo108963a()
            if (r9 == 0) goto L_0x023c
            f40.o r9 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r9 = r9.mo121142i()
            com.tencent.mm.storage.y1$a r13 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_STORY_NEW_FEATURE_TIP_BOOLEAN_SYNC
            java.lang.Boolean r15 = java.lang.Boolean.TRUE
            java.lang.Object r9 = r9.mo119685f(r13, r15)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x023c
            r15 = 1
            goto L_0x023d
        L_0x023c:
            r15 = 0
        L_0x023d:
            if (r15 == 0) goto L_0x0240
            goto L_0x0242
        L_0x0240:
            r9 = 0
            goto L_0x0243
        L_0x0242:
            r9 = 1
        L_0x0243:
            di3.d r13 = di3.C86312j.m106911c(r2)
            ct.c r13 = (p327ct.C30914c) r13
            ct.d r13 = r13.mo17862sM()
            r15 = 352280(0x56018, float:4.9365E-40)
            l20.a r13 = (l20.C21388a) r13
            r23 = r9
            r9 = 266241(0x41001, float:3.73083E-40)
            boolean r9 = r13.mo33494b(r15, r9)
            java.lang.Class<na3.i> r13 = na3.C76846i.class
            di3.d r13 = di3.C86312j.m106911c(r13)
            na3.i r13 = (na3.C76846i) r13
            if (r13 == 0) goto L_0x0273
            boolean r15 = r13.mo59628HQ()
            if (r15 != 0) goto L_0x0271
            boolean r13 = r13.mo59630iY()
            if (r13 == 0) goto L_0x0273
        L_0x0271:
            r15 = 1
            goto L_0x0274
        L_0x0273:
            r15 = 0
        L_0x0274:
            di3.d r13 = di3.C86312j.m106911c(r2)
            ct.c r13 = (p327ct.C30914c) r13
            ct.d r13 = r13.mo17862sM()
            l20.a r13 = (l20.C21388a) r13
            r17 = r9
            boolean r9 = r13.f60497c
            if (r9 != 0) goto L_0x0294
            java.lang.String r9 = "MicroMsg.NewBadge"
            java.lang.String r13 = "hasUnreadNum NewBadge has not initialized"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r9, r13)
            r16 = r6
            r24 = r8
            r25 = r15
            goto L_0x02a9
        L_0x0294:
            l20.b r9 = r13.f60495a
            r24 = r8
            r8 = 266256(0x41010, float:3.73104E-40)
            r16 = r6
            r25 = r15
            r6 = 4
            r15 = 262152(0x40008, float:3.67353E-40)
            l20.b$a r8 = r9.mo33516f(r15, r8, r6)
            if (r8 != 0) goto L_0x02ab
        L_0x02a9:
            r6 = 0
            goto L_0x02b1
        L_0x02ab:
            java.lang.String r6 = r8.f60519d
            int r6 = r13.mo33502k(r6)
        L_0x02b1:
            di3.d r1 = di3.C86312j.m106911c(r1)
            nz0.e r1 = (nz0.C76982e) r1
            if (r1 == 0) goto L_0x02c7
            boolean r8 = r1.mo59841yc()
            if (r8 != 0) goto L_0x02c5
            boolean r1 = r1.mo59840r9()
            if (r1 == 0) goto L_0x02c7
        L_0x02c5:
            r15 = 1
            goto L_0x02c8
        L_0x02c7:
            r15 = 0
        L_0x02c8:
            if (r15 == 0) goto L_0x02d2
            if (r12 != 0) goto L_0x02d0
            if (r14 != 0) goto L_0x02d0
            if (r6 <= 0) goto L_0x02d2
        L_0x02d0:
            r15 = 1
            goto L_0x02d3
        L_0x02d2:
            r15 = 0
        L_0x02d3:
            f40.C86709a0.m107528h()
            f40.o r1 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r1 = r1.mo121142i()
            com.tencent.mm.storage.y1$a r6 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WALLET_MY_ENTRY_TAB_REDDOT_BOOLEAN_SYNC
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            java.lang.Object r1 = r1.mo119685f(r6, r8)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            f40.C86709a0.m107528h()
            f40.o r9 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r9 = r9.mo121142i()
            com.tencent.mm.storage.y1$a r12 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WALLET_MY_ENTRY_TAB_REDDOT_EXPIRETIME_LONG_SYNC
            r26 = r11
            r13 = 0
            java.lang.Long r11 = java.lang.Long.valueOf(r13)
            java.lang.Object r9 = r9.mo119685f(r12, r11)
            java.lang.Long r9 = (java.lang.Long) r9
            long r27 = r9.longValue()
            java.lang.String r9 = "hasNewMallDot expire, ignore redot"
            if (r1 == 0) goto L_0x0341
            int r11 = (r27 > r13 ? 1 : (r27 == r13 ? 0 : -1))
            if (r11 <= 0) goto L_0x0341
            long r13 = java.lang.System.currentTimeMillis()
            int r11 = (r13 > r27 ? 1 : (r13 == r27 ? 0 : -1))
            if (r11 <= 0) goto L_0x0341
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r9)
            f40.C86709a0.m107528h()
            f40.o r1 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r1 = r1.mo121142i()
            r1.mo119677K(r6, r8)
            f40.C86709a0.m107528h()
            f40.o r1 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r1 = r1.mo121142i()
            r13 = 0
            java.lang.Long r6 = java.lang.Long.valueOf(r13)
            r1.mo119677K(r12, r6)
            r1 = 0
        L_0x0341:
            di3.d r6 = di3.C86312j.m106911c(r2)
            ct.c r6 = (p327ct.C30914c) r6
            ct.d r6 = r6.mo17862sM()
            com.tencent.mm.storage.y1$a r8 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WALLET_New_MY_ENTRY_TAB_REDDOT_STRING_SYNC
            com.tencent.mm.storage.y1$a r11 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_NEW_BANDAGE_WATCHER_ME_TAB_STRING_SYNC
            l20.a r6 = (l20.C21388a) r6
            boolean r6 = r6.mo33496d(r8, r11)
            f40.C86709a0.m107528h()
            f40.o r12 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r12 = r12.mo121142i()
            com.tencent.mm.storage.y1$a r13 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WALLET_New_MY_ENTRY_TAB_REDDOT_EXPIRETIME_LONG_SYNC
            r18 = 0
            java.lang.Long r14 = java.lang.Long.valueOf(r18)
            java.lang.Object r12 = r12.mo119685f(r13, r14)
            java.lang.Long r12 = (java.lang.Long) r12
            long r27 = r12.longValue()
            if (r6 == 0) goto L_0x03ab
            int r12 = (r27 > r18 ? 1 : (r27 == r18 ? 0 : -1))
            if (r12 <= 0) goto L_0x03a8
            long r29 = java.lang.System.currentTimeMillis()
            int r12 = (r29 > r27 ? 1 : (r29 == r27 ? 0 : -1))
            if (r12 <= 0) goto L_0x03a8
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r9)
            di3.d r1 = di3.C86312j.m106911c(r2)
            ct.c r1 = (p327ct.C30914c) r1
            ct.d r1 = r1.mo17862sM()
            l20.a r1 = (l20.C21388a) r1
            r1.mo33501j(r8, r11)
            f40.C86709a0.m107528h()
            f40.o r1 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r1 = r1.mo121142i()
            r8 = 0
            java.lang.Long r2 = java.lang.Long.valueOf(r8)
            r1.mo119677K(r13, r2)
            r1 = 0
            goto L_0x03ad
        L_0x03a8:
            r8 = 0
            goto L_0x03ad
        L_0x03ab:
            r8 = r18
        L_0x03ad:
            com.tencent.mm.ui.q r2 = r0.f214453g
            if (r2 == 0) goto L_0x03d9
            if (r7 != 0) goto L_0x03d3
            if (r3 != 0) goto L_0x03d3
            if (r5 != 0) goto L_0x03d3
            if (r15 != 0) goto L_0x03d3
            if (r10 != 0) goto L_0x03d3
            if (r26 != 0) goto L_0x03d3
            if (r16 != 0) goto L_0x03d3
            if (r25 != 0) goto L_0x03d3
            if (r24 != 0) goto L_0x03d3
            if (r1 != 0) goto L_0x03d3
            if (r6 != 0) goto L_0x03d3
            if (r23 != 0) goto L_0x03d3
            if (r17 == 0) goto L_0x03cc
            goto L_0x03d3
        L_0x03cc:
            com.tencent.mm.ui.LauncherUIBottomTabView r2 = (com.tencent.p014mm.p136ui.LauncherUIBottomTabView) r2
            r1 = 0
            r2.mo69852a(r1)
            goto L_0x03d9
        L_0x03d3:
            com.tencent.mm.ui.LauncherUIBottomTabView r2 = (com.tencent.p014mm.p136ui.LauncherUIBottomTabView) r2
            r1 = 1
            r2.mo69852a(r1)
        L_0x03d9:
            jw2.d r1 = jw2.C99069d.f290418a
            if (r23 == 0) goto L_0x03e0
            r1 = 1
            goto L_0x03e1
        L_0x03e0:
            r1 = r8
        L_0x03e1:
            jw2.C99069d.f290433p = r1
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r2 = 14872(0x3a18, float:2.084E-41)
            r3 = 5
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 6
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 0
            r3[r5] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            r5 = 1
            r3[r5] = r4
            java.lang.String r4 = ""
            r7 = 2
            r3[r7] = r4
            r8 = 3
            r3[r8] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r8 = 4
            r3[r8] = r4
            r1.mo160131h(r2, r3)
            if (r6 == 0) goto L_0x0427
            boolean r2 = r0.f214454h
            if (r2 != 0) goto L_0x0427
            r2 = 25075(0x61f3, float:3.5138E-41)
            java.lang.Object[] r3 = new java.lang.Object[r7]
            r4 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            r3[r4] = r6
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r5] = r4
            r1.mo160131h(r2, r3)
            r0.f214454h = r5
        L_0x0427:
            jc2.a r1 = gc2.C116945b.vx0()
            com.tencent.mm.plugin.newtips.model.d r1 = r1.mo182002jo(r5)
            if (r1 == 0) goto L_0x0447
            boolean r1 = r1.field_isExit
            if (r1 != 0) goto L_0x0447
            com.tencent.mm.ui.MainTabUnreadMgr$e r1 = new com.tencent.mm.ui.MainTabUnreadMgr$e
            com.tencent.mm.ui.q r2 = r0.f214453g
            r1.<init>(r2)
            r0.f214459p = r1
            com.tencent.mm.plugin.newtips.model.l r1 = gc2.C116945b.yx0()
            com.tencent.mm.ui.MainTabUnreadMgr$e r0 = r0.f214459p
            r1.f346855e = r0
            goto L_0x0459
        L_0x0447:
            com.tencent.mm.plugin.newtips.model.e r1 = gc2.C116945b.wx0()
            r2 = 1
            boolean r1 = r1.mo175755d(r2)
            if (r1 == 0) goto L_0x0459
            com.tencent.mm.ui.q r0 = r0.f214453g
            com.tencent.mm.ui.LauncherUIBottomTabView r0 = (com.tencent.p014mm.p136ui.LauncherUIBottomTabView) r0
            r0.mo69852a(r2)
        L_0x0459:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.MainTabUnreadMgr.m86008a(com.tencent.mm.ui.MainTabUnreadMgr):void");
    }

    public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
        if (obj == null || !(obj instanceof String)) {
            Log.m105919d("MicroMsg.LauncherUI.MainTabUnreadMgr", "onNotifyChange obj not String event:%d stg:%s obj:%s", Integer.valueOf(i), mStorageEx, obj);
        } else if (mStorageEx == C97625j3.m125812b().mo105908w()) {
            Log.m105919d("MicroMsg.LauncherUI.MainTabUnreadMgr", "Launcherui onNotifyChange event type %d, username %s", Integer.valueOf(i), obj);
            if (C72996z1.m85811N4((String) obj)) {
                C79547b.f233255g.mo109607a(new C57849s2(this));
            }
        }
    }
}
