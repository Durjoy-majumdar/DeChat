package pc0;

import com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner;
import com.tencent.p014mm.autogen.events.BypNewSyncEvent;
import com.tencent.p014mm.autogen.events.FinderSyncEvent;
import com.tencent.p014mm.autogen.events.OpenIMSyncEvent;
import com.tencent.p014mm.autogen.events.SnsSyncEvent;
import com.tencent.p014mm.booter.C114716m;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMStack;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel;
import f40.C86709a0;
import f40.C86718e;
import junit.framework.Assert;
import kj2.C117407d;
import ob0.C11385n;
import ob0.C117746w;
import ob0.C117747y;
import ob0.y$$d;
import p156gj.C87200o;
import p206nj.C76861g;
import p285zh.C119114c;
import p285zh.c$$e;
import pc0.C118000d0;
import qe3.C101126c1;
import qe3.C101130q0;
import qe3.C62605p0;
import qe3.C89625d;
import qe3.C89631w;
import sf0.C48374j0;
import te3.C51024qx;
import te3.C64794w33;

/* renamed from: pc0.u */
public class C118018u extends C117747y implements C1311n {

    /* renamed from: A */
    public static boolean f352775A = false;

    /* renamed from: B */
    public static int f352776B = 0;

    /* renamed from: z */
    public static int f352777z = 7;

    /* renamed from: d */
    public String f352778d = "MicroMsg.NetSceneSync";

    /* renamed from: e */
    public C11385n f352779e;

    /* renamed from: f */
    public int f352780f = 0;

    /* renamed from: g */
    public int f352781g = 0;

    /* renamed from: h */
    public String f352782h = "";

    /* renamed from: i */
    public C118008g0 f352783i = null;

    /* renamed from: j */
    public boolean f352784j = false;

    /* renamed from: n */
    public int f352785n = 0;

    /* renamed from: o */
    public MTimerHandler f352786o = null;

    /* renamed from: p */
    public MTimerHandler f352787p = null;

    /* renamed from: q */
    public C76861g.C47263a f352788q;

    /* renamed from: r */
    public int f352789r;

    /* renamed from: s */
    public long f352790s = -1;

    /* renamed from: t */
    public boolean f352791t = false;

    /* renamed from: u */
    public boolean f352792u = false;

    /* renamed from: v */
    public boolean f352793v = false;

    /* renamed from: w */
    public String f352794w = "";

    /* renamed from: x */
    public C101130q0 f352795x = null;

    /* renamed from: y */
    public long f352796y = 0;

    /* renamed from: pc0.u$a */
    public class C118019a implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final /* synthetic */ C118020b f352797d;

        public C118019a(C118020b bVar) {
            this.f352797d = bVar;
        }

        public boolean onTimerExpired() {
            C118018u.this.f352791t = true;
            C117407d.INSTANCE.idkeyStat(99, 231, 1, false);
            C118018u.this.onGYNetEnd(-1, 0, 0, "", this.f352797d, (byte[]) null);
            return false;
        }
    }

    public C118018u(int i) {
        String str = this.f352778d + "[" + hashCode() + "]";
        this.f352778d = str;
        Log.m105925i(str, "dkpush NetSceneSync scene:%d stack:%s", Integer.valueOf(i), Util.getStack());
        this.f352794w = MMStack.getCaller();
        this.f352788q = new C76861g.C47263a();
        if (this.f352783i == null) {
            this.f352783i = new C118008g0();
        }
        this.f352783i.f352752a = i;
        C86709a0.m107528h();
        if (C86709a0.m107535s() != null && C86709a0.m107522a()) {
            C86709a0.m107528h();
            if (C86709a0.m107535s().mo121142i() != null && !C86718e.m107551r()) {
                C86709a0.m107528h();
                long nullAs = Util.nullAs((Long) C86709a0.m107535s().mo121142i().mo119684e(8196, (Object) null), 0);
                if (nullAs != 0) {
                    C86709a0.m107528h();
                    C86709a0.m107535s().mo121142i().mo119676J(8196, 0L);
                    f352777z = ((int) (nullAs | ((long) f352777z))) & 95;
                }
            }
        }
        if (i == 1) {
            f352775A = true;
        }
        if (i == 1010) {
            f352777z |= 16;
            f352775A = true;
            this.f352789r = 7;
        } else if (i == 1011) {
            f352777z |= 64;
            f352775A = true;
            this.f352789r = 7;
        } else if (i == 3) {
            f352777z |= 262144;
            f352775A = true;
            this.f352789r = 3;
            Log.m105925i(this.f352778d, "summerbadcr NetSceneSync aiScene[%d], selector[%d], syncScene[%d]", Integer.valueOf(i), Integer.valueOf(f352777z), Integer.valueOf(this.f352789r));
        } else {
            this.f352789r = i;
        }
        if (f352776B == 0) {
            mo182789j1();
        }
    }

    public boolean accept(C117747y yVar) {
        if (!(yVar instanceof C118018u)) {
            return false;
        }
        C118018u uVar = (C118018u) yVar;
        if (uVar.f352784j || !f352775A) {
            return false;
        }
        boolean z = true;
        Log.m105921e(this.f352778d, "old not busy and notified, maybe cancel old scene, last dispatch=%d", Long.valueOf(uVar.lastdispatch));
        if (Util.ticksToNow(uVar.lastdispatch) <= 360000) {
            z = false;
        }
        if (z) {
            Log.m105924i(this.f352778d, "summerworker NetSceneSync timeout");
            if (C86709a0.m107525e().findTaskByRunTime(false, 0) != null) {
                String str = this.f352778d;
                Log.m105920e(str, "summerworker worker is just blocked by task: " + C86709a0.m107525e().dump(false, false));
                return false;
            }
        }
        return z;
    }

    public void cancel() {
        super.cancel();
        C117407d.INSTANCE.idkeyStat(99, 229, 1, false);
        this.f352793v = true;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        int i = 0;
        if (C100769w.m131943b()) {
            f352776B = 0;
            Log.m105920e(this.f352778d, "dkinit never do sync before init done");
            return -1;
        }
        this.f352779e = nVar;
        if (this.f352783i == null) {
            this.f352783i = new C118008g0();
        }
        this.f352783i.getClass();
        if (this.f352787p != null) {
            Log.m105924i(this.f352778d, "pushSyncRespHandler not null");
            prepareDispatcher(gVar);
            this.f352787p.startTimer(0);
            return 0;
        }
        int i2 = f352776B;
        if (i2 > 0) {
            Log.m105929w(this.f352778d, "other sync is dealing with resp data :%d", Integer.valueOf(i2));
            return -1;
        } else if (this.f352786o != null) {
            Log.m105924i(this.f352778d, "pusher not null");
            prepareDispatcher(gVar);
            this.f352786o.startTimer(0);
            return 0;
        } else {
            C118020b bVar = new C118020b(false);
            C64794w33 w332 = ((C62605p0) bVar.getReqObj()).f177798a;
            int i3 = this.f352789r;
            if (i3 == 3) {
                w332.f186057i = 1;
            } else {
                w332.f186057i = 0;
            }
            if (this.f352792u) {
                i3 = 6;
            }
            this.f352789r = i3;
            w332.f186053e = f352777z;
            byte[] a = C118000d0.f352701a.mo182756a();
            w332.f186054f = C48374j0.m53712a(a);
            w332.f186055g = this.f352789r;
            w332.f186052d = new C51024qx();
            int i4 = C89625d.f257835a;
            w332.f186056h = C87200o.f252868a;
            Log.m105925i(this.f352778d, "doScene Selector:%d Scene:%d key[%s]", Integer.valueOf(w332.f186053e), Integer.valueOf(w332.f186055g), C101126c1.m132547d(a));
            f352775A = false;
            C118008g0 g0Var = this.f352783i;
            if (g0Var != null) {
                i = g0Var.f352752a;
            }
            int i5 = f352777z;
            boolean z = C119114c.f356684a;
            C119114c.m167920e("MicroMsg.NotifyPowerInspector", "netSync: scene=" + i + ", selector=0x" + Integer.toBinaryString(i));
            if (MMApplicationContext.isMainProcess() && AppExplicitBackgroundOwner.INSTANCE.isBackground()) {
                String str = i + "-" + Integer.toBinaryString(i5);
                c$$e c__e = C119114c.f356690g;
                if (c__e.mo183788b() || !C119114c.f356685b) {
                    c__e.mo183789c(str);
                }
            }
            return dispatch(gVar, bVar, this);
        }
    }

    public int getType() {
        return 138;
    }

    /* renamed from: j1 */
    public final boolean mo182789j1() {
        PInt pInt = new PInt();
        C86709a0.m107528h();
        byte[] f = C114716m.m161365f(pInt, C86709a0.m107523b().mo121110g());
        String str = this.f352778d;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.valueOf(pInt.value);
        objArr[1] = Integer.valueOf(hashCode());
        objArr[2] = Integer.valueOf(f != null ? f.length : 0);
        Log.m105925i(str, "dealWithRespData index:%d, hashcode:%d, buf.len:%d", objArr);
        int i = pInt.value;
        f352776B = i;
        if (i == 0 || Util.isNullOrNil(f)) {
            f352776B = 0;
            return false;
        }
        C101130q0 q0Var = new C101130q0();
        try {
            q0Var.fromProtoBuf(f);
            this.f352787p = new MTimerHandler(C86709a0.m107525e().getLooper(), (MTimerHandler.CallBack) new C118019a(new C118020b(q0Var)), false);
            return true;
        } catch (Exception unused) {
            C117407d.INSTANCE.idkeyStat(99, 226, 1, false);
            Log.m105920e(this.f352778d, "dealWithRespData SyncResp fromProtoBuf failed");
            int i2 = f352776B;
            C86709a0.m107528h();
            C114716m.m161361b(i2, C86709a0.m107523b().mo121110g());
            f352776B = 0;
            return false;
        } catch (Error unused2) {
            long freeMemory = Runtime.getRuntime().freeMemory() / 1000;
            long j = Runtime.getRuntime().totalMemory() / 1000;
            Log.m105925i(this.f352778d, "dealWithRespData memoryInfo avail/total, dalvik[%dk, %dk, user:%dk]", Long.valueOf(freeMemory), Long.valueOf(j), Long.valueOf(j - freeMemory));
            Assert.assertTrue("dealWithRespData error", false);
            return false;
        }
    }

    /* renamed from: k1 */
    public void mo182790k1(C101130q0 q0Var) {
        C101130q0 q0Var2 = q0Var;
        C118000d0.C118001a aVar = C118000d0.f352701a;
        aVar.mo182758c(C48374j0.m53715d(q0Var2.f296025a.f299848g), true);
        C86709a0.m107528h();
        C86709a0.m107535s().mo121142i().mo119676J(8196, Long.valueOf((long) q0Var2.f296025a.f299847f));
        boolean z = (q0Var2.f296025a.f299847f & f352777z) != 0 && !super.securityLimitCountReach();
        Log.m105925i(this.f352778d, "canContinue cont:%b ContinueFlag:%d selector:%d securityLimitCountReach:%b", Boolean.valueOf(z), Integer.valueOf(q0Var2.f296025a.f299847f), Integer.valueOf(f352777z), Boolean.valueOf(super.securityLimitCountReach()));
        if (!z && (q0Var2.f296025a.f299847f & 256) != 0) {
            SnsSyncEvent snsSyncEvent = new SnsSyncEvent();
            snsSyncEvent.f79001d.f79002a = 1;
            snsSyncEvent.publish();
        }
        if (!z && (q0Var2.f296025a.f299847f & 2097152) != 0) {
            new OpenIMSyncEvent().publish();
        }
        if (!z && (q0Var2.f296025a.f299847f & TPMediaCodecProfileLevel.HEVCMainTierLevel62) != 0) {
            new FinderSyncEvent().publish();
        }
        if (!z && (q0Var2.f296025a.f299847f & 32) != 0) {
            new BypNewSyncEvent().publish();
        }
        C117407d.INSTANCE.idkeyStat(99, z ? 234 : 235, 1, false);
        Log.m105925i(this.f352778d, "onRespHandled continueFlag:%d isNotifyData:%b conCont:%b notifyPending:%b pushSyncFlag:%d isContinueScene:%b respHandler:%s ", Integer.valueOf(q0Var2.f296025a.f299847f), Boolean.valueOf(this.f352791t), Boolean.valueOf(z), Boolean.valueOf(f352775A), Integer.valueOf(this.f352785n), Boolean.valueOf(this.f352792u), this.f352787p);
        if (!this.f352791t && z) {
            this.f352792u = true;
            doScene(dispatcher(), this.f352779e);
        } else if (f352775A) {
            Log.m105924i(this.f352778d, "dkpush new notify pending, sync now");
            int i = f352776B;
            if (i != 0) {
                C86709a0.m107528h();
                C114716m.m161361b(i, C86709a0.m107523b().mo121110g());
            }
            f352776B = 0;
            this.f352787p = null;
            f352775A = false;
            this.f352792u = true;
            doScene(dispatcher(), this.f352779e);
        } else if (this.f352787p != null) {
            int i2 = f352776B;
            C86709a0.m107528h();
            C114716m.m161361b(i2, C86709a0.m107523b().mo121110g());
            this.f352787p = null;
            mo182789j1();
            doScene(dispatcher(), this.f352779e);
        } else {
            if ((this.f352785n & 1) > 0) {
                C86709a0.m107524d().mo123460f(new C118014p(this.f352790s, aVar.mo182756a()));
            }
            String str = this.f352778d;
            Log.m105918d(str, "sync or init end: reset selector : now = " + f352777z + " default = " + 7);
            f352777z = 7;
            this.f352779e.onSceneEnd(this.f352780f, this.f352781g, this.f352782h, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:69:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0205  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onGYNetEnd(int r29, int r30, int r31, java.lang.String r32, com.tencent.p014mm.network.C114799u r33, byte[] r34) {
        /*
            r28 = this;
            r1 = r28
            r2 = r32
            r3 = 1
            r4 = 0
            if (r33 == 0) goto L_0x0218
            int r0 = r33.getType()
            r5 = 138(0x8a, float:1.93E-43)
            if (r0 == r5) goto L_0x0012
            goto L_0x0218
        L_0x0012:
            qe3.w$e r0 = r33.getRespObj()
            r5 = r0
            qe3.q0 r5 = (qe3.C101130q0) r5
            java.lang.String r0 = r1.f352778d
            r6 = 8
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r30)
            r6[r4] = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r31)
            r6[r3] = r7
            r7 = 2
            r6[r7] = r2
            r8 = 3
            nj.g$a r9 = r1.f352788q
            long r9 = r9.mo72288a()
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            r6[r8] = r9
            boolean r8 = r1.f352791t
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r9 = 4
            r6[r9] = r8
            r8 = 5
            te3.x33 r10 = r5.f296025a
            te3.qx r10 = r10.f299846e
            r11 = -1
            if (r10 != 0) goto L_0x004e
            r10 = -1
            goto L_0x0050
        L_0x004e:
            int r10 = r10.f140593d
        L_0x0050:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r6[r8] = r10
            r8 = 6
            com.tencent.mm.sdk.platformtools.MTimerHandler r10 = r1.f352786o
            r6[r8] = r10
            r8 = 7
            com.tencent.mm.sdk.platformtools.MTimerHandler r10 = r1.f352787p
            r6[r8] = r10
            java.lang.String r8 = "onGYNetEnd:[%d,%d,%s] time:%d  isnotifydata:%b count:%d pusher:%s pushSyncRespHandler:%s "
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r8, r6)
            te3.x33 r0 = r5.f296025a
            te3.qx r0 = r0.f299846e
            if (r0 != 0) goto L_0x006d
            r0 = -1
            goto L_0x006f
        L_0x006d:
            int r0 = r0.f140593d
        L_0x006f:
            if (r0 <= 0) goto L_0x0073
            r6 = 1
            goto L_0x0074
        L_0x0073:
            r6 = 0
        L_0x0074:
            java.lang.Class<android.os.PowerManager> r0 = android.os.PowerManager.class
            java.lang.String r8 = "isScreenOn"
            java.lang.Class[] r10 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x0097 }
            java.lang.reflect.Method r0 = r0.getMethod(r8, r10)     // Catch:{ Exception -> 0x0097 }
            android.content.Context r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x0097 }
            java.lang.String r10 = "power"
            java.lang.Object r8 = r8.getSystemService(r10)     // Catch:{ Exception -> 0x0097 }
            android.os.PowerManager r8 = (android.os.PowerManager) r8     // Catch:{ Exception -> 0x0097 }
            java.lang.Object[] r10 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0097 }
            java.lang.Object r0 = r0.invoke(r8, r10)     // Catch:{ Exception -> 0x0097 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x0097 }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x0097 }
            goto L_0x00ac
        L_0x0097:
            r0 = move-exception
            java.lang.String r8 = r1.f352778d
            java.lang.Object[] r10 = new java.lang.Object[r7]
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            r10[r4] = r12
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
            r10[r3] = r0
            java.lang.String r0 = "reflectScreenOn invoke ERROR use isScreenOn:%s e:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r8, r0, r10)
            r0 = 1
        L_0x00ac:
            if (r0 != 0) goto L_0x00c1
            kj2.d r12 = kj2.C117407d.INSTANCE
            r13 = 99
            if (r6 == 0) goto L_0x00b7
            r15 = 221(0xdd, double:1.09E-321)
            goto L_0x00b9
        L_0x00b7:
            r15 = 218(0xda, double:1.077E-321)
        L_0x00b9:
            r17 = 1
            r19 = 0
            r12.idkeyStat(r13, r15, r17, r19)
            goto L_0x00ec
        L_0x00c1:
            boolean r0 = com.tencent.p014mm.sdk.crash.CrashReportFactory.foreground
            if (r0 != 0) goto L_0x00d8
            kj2.d r12 = kj2.C117407d.INSTANCE
            r13 = 99
            if (r6 == 0) goto L_0x00ce
            r15 = 220(0xdc, double:1.087E-321)
            goto L_0x00d0
        L_0x00ce:
            r15 = 217(0xd9, double:1.07E-321)
        L_0x00d0:
            r17 = 1
            r19 = 0
            r12.idkeyStat(r13, r15, r17, r19)
            goto L_0x00ec
        L_0x00d8:
            kj2.d r20 = kj2.C117407d.INSTANCE
            r21 = 99
            if (r6 == 0) goto L_0x00e1
            r12 = 219(0xdb, double:1.08E-321)
            goto L_0x00e3
        L_0x00e1:
            r12 = 216(0xd8, double:1.067E-321)
        L_0x00e3:
            r23 = r12
            r25 = 1
            r27 = 0
            r20.idkeyStat(r21, r23, r25, r27)
        L_0x00ec:
            r0 = 0
            r1.f352786o = r0
            r1.f352784j = r3
            r6 = r30
            if (r6 != r9) goto L_0x010c
            r0 = -2006(0xfffffffffffff82a, float:NaN)
            r8 = r31
            if (r8 != r0) goto L_0x010e
            kj2.d r12 = kj2.C117407d.INSTANCE
            r13 = 99
            r15 = 227(0xe3, double:1.12E-321)
            r17 = 1
            r19 = 0
            r12.idkeyStat(r13, r15, r17, r19)
            r0 = 1
            r6 = 0
            r8 = 0
            goto L_0x010f
        L_0x010c:
            r8 = r31
        L_0x010e:
            r0 = 0
        L_0x010f:
            if (r6 != 0) goto L_0x01e9
            if (r8 == 0) goto L_0x0115
            goto L_0x01e9
        L_0x0115:
            kj2.d r12 = kj2.C117407d.INSTANCE
            r13 = 99
            r15 = 233(0xe9, double:1.15E-321)
            r17 = 1
            r19 = 0
            r12.idkeyStat(r13, r15, r17, r19)
            qe3.w$d r2 = r33.getReqObj()
            qe3.p0 r2 = (qe3.C62605p0) r2
            te3.w33 r2 = r2.f177798a
            te3.qv3 r2 = r2.f186054f
            byte[] r2 = sf0.C48374j0.m53715d(r2)
            te3.x33 r6 = r5.f296025a
            te3.qv3 r6 = r6.f299848g
            byte[] r6 = sf0.C48374j0.m53715d(r6)
            java.lang.String r8 = r1.f352778d
            java.lang.Object[] r9 = new java.lang.Object[r7]
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r0)
            r9[r4] = r10
            java.lang.String r10 = qe3.C101126c1.m132547d(r2)
            r9[r3] = r10
            java.lang.String r10 = "onGYNetEnd replace key:%b req :%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r10, r9)
            java.lang.String r8 = r1.f352778d
            java.lang.Object[] r9 = new java.lang.Object[r7]
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r0)
            r9[r4] = r10
            java.lang.String r10 = qe3.C101126c1.m132547d(r6)
            r9[r3] = r10
            java.lang.String r10 = "onGYNetEnd replace key:%b resp:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r10, r9)
            if (r0 != 0) goto L_0x01a4
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r2)
            if (r0 == 0) goto L_0x0189
            pc0.d0$a r0 = pc0.C118000d0.f352701a
            byte[] r2 = r0.mo182756a()
            java.lang.String r0 = r1.f352778d
            java.lang.Object[] r7 = new java.lang.Object[r7]
            if (r2 != 0) goto L_0x0177
            goto L_0x0178
        L_0x0177:
            int r11 = r2.length
        L_0x0178:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r11)
            r7[r4] = r8
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.dumpHex(r2)
            r7[r3] = r8
            java.lang.String r8 = "dkpush userinfo key : %d[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r0, r8, r7)
        L_0x0189:
            byte[] r0 = qe3.C101126c1.m132546c(r2, r6)
            if (r0 == 0) goto L_0x0195
            int r2 = r0.length
            if (r2 > 0) goto L_0x0193
            goto L_0x0195
        L_0x0193:
            r6 = r0
            goto L_0x019c
        L_0x0195:
            java.lang.String r0 = r1.f352778d
            java.lang.String r2 = "merge key failed, use server side instead"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r2)
        L_0x019c:
            te3.x33 r0 = r5.f296025a
            te3.qv3 r2 = sf0.C48374j0.m53712a(r6)
            r0.f299848g = r2
        L_0x01a4:
            f40.C86709a0.m107528h()
            f40.e r0 = f40.C86709a0.m107523b()
            te3.x33 r2 = r5.f296025a
            int r6 = r2.f299849h
            int r2 = r2.f299850i
            r0.mo121105D(r6, r2)
            f40.C86709a0.m107528h()
            f40.C86709a0.m107523b()
            te3.x33 r0 = r5.f296025a
            int r0 = r0.f299849h
            f40.C86718e.m107545A(r0)
            qe3.q0 r0 = r1.f352795x
            if (r0 != 0) goto L_0x01c6
            r4 = 1
        L_0x01c6:
            junit.framework.Assert.assertTrue(r4)
            r1.f352795x = r5
            long r4 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r1.f352796y = r4
            com.tencent.mm.sdk.platformtools.MTimerHandler r0 = new com.tencent.mm.sdk.platformtools.MTimerHandler
            com.tencent.mm.sdk.platformtools.MMHandlerThread r2 = f40.C86709a0.m107525e()
            android.os.Looper r2 = r2.getLooper()
            pc0.v r4 = new pc0.v
            r4.<init>(r1)
            r0.<init>((android.os.Looper) r2, (com.tencent.p014mm.sdk.platformtools.MTimerHandler.CallBack) r4, (boolean) r3)
            r2 = 50
            r0.startTimer(r2)
            return
        L_0x01e9:
            qe3.q0 r0 = r1.f352795x
            if (r0 == 0) goto L_0x0205
            java.lang.String r0 = r1.f352778d
            java.lang.String r3 = "oreh sync mIRH.processingResp is not null, and simulate not continue"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)
            r1.f352780f = r6
            r1.f352781g = r8
            r1.f352782h = r2
            qe3.w$e r0 = r33.getRespObj()
            qe3.q0 r0 = (qe3.C101130q0) r0
            te3.x33 r0 = r0.f296025a
            r0.f299847f = r4
            goto L_0x020a
        L_0x0205:
            ob0.n r0 = r1.f352779e
            r0.onSceneEnd(r6, r8, r2, r1)
        L_0x020a:
            kj2.d r9 = kj2.C117407d.INSTANCE
            r10 = 99
            r12 = 232(0xe8, double:1.146E-321)
            r14 = 1
            r16 = 0
            r9.idkeyStat(r10, r12, r14, r16)
            return
        L_0x0218:
            java.lang.String r0 = r1.f352778d
            java.lang.Object[] r2 = new java.lang.Object[r3]
            if (r33 != 0) goto L_0x0220
            r3 = -2
            goto L_0x0224
        L_0x0220:
            int r3 = r33.getType()
        L_0x0224:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r4] = r3
            java.lang.String r3 = "onGYNetEnd error type:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pc0.C118018u.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.u, byte[]):void");
    }

    public int securityLimitCount() {
        return 100;
    }

    public boolean securityLimitCountReach() {
        boolean securityLimitCountReach = super.securityLimitCountReach();
        if (securityLimitCountReach) {
            C117407d dVar = C117407d.INSTANCE;
            dVar.idkeyStat(99, 228, 1, false);
            Object[] objArr = new Object[9];
            objArr[0] = 0;
            int i = 1;
            objArr[1] = 0;
            objArr[2] = 0;
            objArr[3] = 0;
            objArr[4] = 0;
            objArr[5] = 0;
            objArr[6] = 0;
            if (!CrashReportFactory.foreground) {
                i = 2;
            }
            objArr[7] = Integer.valueOf(i);
            objArr[8] = "9999";
            dVar.mo160131h(12063, objArr);
        }
        return securityLimitCountReach;
    }

    public y$$d securityVerificationChecked(C114799u uVar) {
        return y$$d.EOk;
    }

    public boolean uniqueInNetsceneQueue() {
        return true;
    }

    /* renamed from: pc0.u$b */
    public static class C118020b extends C117746w {

        /* renamed from: a */
        public final C62605p0 f352799a;

        /* renamed from: b */
        public final C101130q0 f352800b;

        /* renamed from: c */
        public final boolean f352801c;

        public C118020b(boolean z) {
            this.f352799a = new C62605p0();
            this.f352800b = new C101130q0();
            this.f352801c = z;
        }

        public boolean getPush() {
            return this.f352801c;
        }

        public C89631w.C89634d getReqObjImp() {
            return this.f352799a;
        }

        public C89631w.C89636e getRespObj() {
            return this.f352800b;
        }

        public int getType() {
            return 138;
        }

        public String getUri() {
            return "/cgi-bin/micromsg-bin/newsync";
        }

        public C118020b(C101130q0 q0Var) {
            this.f352799a = new C62605p0();
            this.f352800b = q0Var;
            this.f352801c = true;
        }
    }
}
