package f40;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.os.SystemClock;
import bp3.C79753e;
import bp3.C79760s;
import com.tencent.p014mm.app.C80637z0;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C85798u1;
import di3.C86301e;
import di3.C86311i;
import di3.C86312j;
import eb0.C116746l3;
import eb0.C31461f3;
import eb0.C31468g3;
import eb0.C86480a;
import eb0.C86484b;
import f40.C31887k0;
import f40.C31896o0;
import f40.C86744o;
import g40.C87135g;
import h40.C87424c;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import junit.framework.Assert;
import kj2.C117407d;
import ob0.C117744o0;
import p156gj.C87203t;
import p261wl.C38166b;
import p261wl.C38174i;
import p573jk.C87974c;
import p787ai.C79546a;
import p823sg.C101615j;
import p823sg.C77710q;
import qe3.C101127f;
import qe3.C89625d;
import qe3.C89626p;
import zt3.C119157j;

/* renamed from: f40.e */
public final class C86718e {

    /* renamed from: s */
    public static boolean f251743s = true;

    /* renamed from: t */
    public static boolean f251744t;

    /* renamed from: u */
    public static C86720e f251745u = new C86720e();

    /* renamed from: v */
    public static String f251746v = "NoResetUinStack";

    /* renamed from: w */
    public static String f251747w = null;

    /* renamed from: x */
    public static boolean f251748x;

    /* renamed from: y */
    public static int f251749y = -1;

    /* renamed from: a */
    public C87135g f251750a;

    /* renamed from: b */
    public C117744o0 f251751b;

    /* renamed from: c */
    public byte[] f251752c = new byte[0];

    /* renamed from: d */
    public C86480a f251753d;

    /* renamed from: e */
    public C86744o.C75680f f251754e;

    /* renamed from: f */
    public C45747a f251755f;

    /* renamed from: g */
    public int f251756g;

    /* renamed from: h */
    public boolean f251757h = false;

    /* renamed from: i */
    public boolean f251758i = false;

    /* renamed from: j */
    public int f251759j = 0;

    /* renamed from: k */
    public int f251760k;

    /* renamed from: l */
    public List<C31461f3> f251761l = new LinkedList();

    /* renamed from: m */
    public long f251762m;

    /* renamed from: n */
    public volatile C58914d f251763n = C58914d.NotReady;

    /* renamed from: o */
    public volatile boolean f251764o = false;

    /* renamed from: p */
    public volatile boolean f251765p = false;

    /* renamed from: q */
    public String f251766q = "";

    /* renamed from: r */
    public Map<String, Integer> f251767r = new HashMap();

    /* renamed from: f40.e$c */
    public enum C7980c {
        WeiXin,
        WeChat
    }

    /* renamed from: f40.e$a */
    public class C31881a implements Runnable {
        public C31881a() {
        }

        public void run() {
            int size = ((LinkedList) C86718e.this.f251761l).size();
            C31461f3[] f3VarArr = new C31461f3[size];
            ((LinkedList) C86718e.this.f251761l).toArray(f3VarArr);
            for (int i = 0; i < size; i++) {
                f3VarArr[i].mo24653f4();
            }
            C38166b.m41755b(C31468g3.class, new e$a$$a());
        }
    }

    /* renamed from: f40.e$d */
    public enum C58914d {
        NotReady,
        AccountHasReady
    }

    /* renamed from: f40.e$b */
    public class C86719b implements Runnable {
        public C86719b() {
        }

        public void run() {
            C86718e.this.mo121122w();
        }
    }

    /* renamed from: f40.e$e */
    public static final class C86720e {

        /* renamed from: d */
        public static boolean f251769d = true;

        /* renamed from: a */
        public int f251770a = 0;

        /* renamed from: b */
        public boolean f251771b = false;

        /* renamed from: c */
        public C85798u1 f251772c;

        /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
            java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
            	at java.base/java.util.Objects.checkIndex(Objects.java:372)
            	at java.base/java.util.ArrayList.get(ArrayList.java:458)
            	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
            */
        /* renamed from: a */
        public static int m107576a(f40.C86718e.C86720e r1) {
            /*
                monitor-enter(r1)
                boolean r0 = r1.f251771b     // Catch:{ all -> 0x001f }
                if (r0 != 0) goto L_0x001b
                monitor-enter(r1)     // Catch:{ all -> 0x001f }
                com.tencent.mm.storage.u1 r0 = r1.f251772c     // Catch:{ all -> 0x0018 }
                junit.framework.Assert.assertNotNull(r0)     // Catch:{ all -> 0x0018 }
                com.tencent.mm.storage.u1 r0 = r1.f251772c     // Catch:{ all -> 0x0018 }
                int r0 = m107578c(r0)     // Catch:{ all -> 0x0018 }
                r1.f251770a = r0     // Catch:{ all -> 0x0018 }
                monitor-exit(r1)     // Catch:{ all -> 0x001f }
                r0 = 1
                r1.f251771b = r0     // Catch:{ all -> 0x001f }
                goto L_0x001b
            L_0x0018:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x001f }
                throw r0     // Catch:{ all -> 0x001f }
            L_0x001b:
                int r0 = r1.f251770a     // Catch:{ all -> 0x001f }
                monitor-exit(r1)
                return r0
            L_0x001f:
                r0 = move-exception
                monitor-exit(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: f40.C86718e.C86720e.m107576a(f40.e$e):int");
        }

        /* renamed from: b */
        public static void m107577b(C86720e eVar, int i) {
            synchronized (eVar) {
                Log.m105925i("MMKernel.CoreAccount", "Uin From %s To %s hash:%d thread:%d[%s] stack:%s", C77710q.m93738a(eVar.f251770a), C77710q.m93738a(i), Integer.valueOf(C101615j.m133462b(i, 100)), Long.valueOf(Thread.currentThread().getId()), Thread.currentThread().getName(), Util.getStack());
                Assert.assertNotNull(eVar.f251772c);
                m107580e(eVar.f251772c, i);
                eVar.f251770a = i;
            }
        }

        /* renamed from: c */
        public static int m107578c(C85798u1 u1Var) {
            if (u1Var == null) {
                Log.m105928w("MMKernel.CoreAccount", "summer read detault uin exception sysCfg is null!");
                return 0;
            }
            Integer num = (Integer) u1Var.mo119660a(1);
            if (num == null) {
                if (u1Var.f249882c) {
                    C117407d.INSTANCE.idkeyStat(148, 40, 1, false);
                }
                Integer valueOf = Integer.valueOf(m107579d());
                if (valueOf != null) {
                    Log.m105925i("MMKernel.CoreAccount", "summer read detault uin[%d], bakUin[%d] sysCfg.isOpenException[%b]", num, valueOf, Boolean.valueOf(u1Var.f249882c));
                    if (f251769d) {
                        Log.m105929w("MMKernel.CoreAccount", "summer read detault uin exception backup uin[%d], stack[%s]", valueOf, Util.getStack());
                        C117407d.INSTANCE.mo160131h(11911, Integer.valueOf(Util.nullAsNil(valueOf)));
                        f251769d = false;
                    }
                    m107580e(u1Var, valueOf.intValue());
                    num = valueOf;
                }
            } else if (num.intValue() != 0) {
                int d = m107579d();
                if (!num.equals(Integer.valueOf(d))) {
                    Log.m105925i("MMKernel.CoreAccount", "bak uin(%s) != uin(%s), reset it.", Integer.valueOf(d), num);
                    m107580e(u1Var, num.intValue());
                }
            }
            Log.m105925i("MMKernel.CoreAccount", "summer getDefaultUin uin[%d]", Integer.valueOf(Util.nullAsNil(num)));
            return Util.nullAsNil(num);
        }

        /* renamed from: d */
        public static int m107579d() {
            return MMApplicationContext.getContext().getSharedPreferences("system_config_prefs", 4).getInt("default_uin", 0);
        }

        /* renamed from: e */
        public static void m107580e(C85798u1 u1Var, int i) {
            Log.m105925i("MMKernel.CoreAccount", "setSysUin uin: %d, stack: %s", Integer.valueOf(i), Util.getStack());
            if (!MMApplicationContext.getContext().getSharedPreferences("system_config_prefs", 4).edit().putInt("default_uin", i).commit()) {
                C117407d.INSTANCE.idkeyStat(148, 150, 1, false);
                Log.m105920e("MMKernel.CoreAccount", "uin_sp save fail");
            }
            MultiProcessMMKV.getMMKV("system_config_prefs").encode("default_uin", i);
            u1Var.mo119664f(1, Integer.valueOf(i));
            u1Var.mo119670k();
            MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("system_config_prefs");
            mmkv.encode("default_uin_timely", i);
            mmkv.encode("has_uin_timely", true);
        }
    }

    public C86718e(C87135g gVar) {
        boolean z = false;
        Assert.assertNotNull(f251745u);
        C86709a0.m107528h();
        f251743s = Util.nullAsNil((Integer) C86709a0.m107535s().mo121145l().mo119660a(17)) != 0 ? true : z;
        C89626p.C89627a.m112064b(new C116746l3(C101127f.f296015a ? 763 : 702));
        this.f251750a = gVar;
        this.f251755f = new C45747a();
    }

    /* renamed from: A */
    public static void m107545A(int i) {
        int i2 = f251749y;
        if (i2 == -1 || i2 != i) {
            f251749y = i;
            m107552u().edit().putInt("notification.user.state", i).commit();
            Log.m105925i("MMKernel.CoreAccount", "[NOTIFICATION SETTINGS]save UserStatus: %d", Integer.valueOf(i));
        }
    }

    /* renamed from: E */
    public static void m107546E() {
        String str;
        Object[] objArr = new Object[2];
        C86709a0.m107528h();
        if (C86709a0.m107523b() != null) {
            C86709a0.m107528h();
            str = C77710q.m93738a(C86709a0.m107523b().mo121110g());
        } else {
            str = "-1";
        }
        objArr[0] = str;
        objArr[1] = Boolean.valueOf(C86709a0.m107523b().mo121114l());
        Log.m105929w("MMKernel.CoreAccount", " UN HOLD ACCOUNT! uin:%s init:%b", objArr);
        f251743s = false;
        C86709a0.m107528h();
        C86709a0.m107535s().f251803a.mo119664f(17, 0);
    }

    /* renamed from: e */
    public static String m107547e() {
        C86709a0.m107528h();
        if (Util.isNullOrNil(C86709a0.m107523b().f251766q)) {
            C86709a0.m107528h();
            C86718e b = C86709a0.m107523b();
            b.f251766q = C87203t.m108273i() + "_" + System.currentTimeMillis();
        }
        C86709a0.m107528h();
        return C86709a0.m107523b().f251766q;
    }

    /* renamed from: f */
    public static int m107548f(String str) {
        int i;
        C86709a0.m107528h();
        if (((HashMap) C86709a0.m107523b().f251767r).get(str) == null) {
            i = 0;
        } else {
            C86709a0.m107528h();
            i = ((Integer) ((HashMap) C86709a0.m107523b().f251767r).get(str)).intValue();
        }
        int nowSecond = (int) Util.nowSecond();
        if (i == 0) {
            C86709a0.m107528h();
            ((HashMap) C86709a0.m107523b().f251767r).put(str, Integer.valueOf(nowSecond));
            return i;
        }
        int i2 = nowSecond - i;
        C86709a0.m107528h();
        ((HashMap) C86709a0.m107523b().f251767r).put(str, Integer.valueOf(nowSecond));
        if (i2 >= 0) {
            return i2;
        }
        return 0;
    }

    /* renamed from: h */
    public static int m107549h() {
        Integer valueOf = Integer.valueOf(MMApplicationContext.getContext().getSharedPreferences("system_config_prefs", 4).getInt("default_uin", 0));
        if (valueOf.intValue() == 0) {
            valueOf = Integer.valueOf(MultiProcessMMKV.getMMKV("system_config_prefs").decodeInt("default_uin", 0));
            if (valueOf.intValue() != 0) {
                C117407d.INSTANCE.idkeyStat(148, 151, 1, false);
                Log.m105920e("MMKernel.CoreAccount", "getUinFromSharedPreferences get from sp fail");
            }
        }
        return valueOf.intValue();
    }

    /* renamed from: n */
    public static void m107550n() {
        String str;
        Object[] objArr = new Object[3];
        C86709a0.m107528h();
        if (C86709a0.m107523b() != null) {
            C86709a0.m107528h();
            str = C77710q.m93738a(C86709a0.m107523b().mo121110g());
        } else {
            str = "-1";
        }
        objArr[0] = str;
        objArr[1] = Util.getStack();
        objArr[2] = Boolean.valueOf(C86709a0.m107523b().mo121114l());
        Log.m105929w("MMKernel.CoreAccount", " HOLD ACCOUNT! uin:%s stack:%s init:%b", objArr);
        f251743s = true;
        C86709a0.m107528h();
        C86709a0.m107535s().f251803a.mo119664f(17, 1);
    }

    /* renamed from: r */
    public static boolean m107551r() {
        String str;
        if (f251743s) {
            Object[] objArr = new Object[2];
            C86709a0.m107528h();
            if (C86709a0.m107523b() != null) {
                C86709a0.m107528h();
                str = C77710q.m93738a(C86709a0.m107523b().mo121110g());
            } else {
                str = "-1";
            }
            objArr[0] = str;
            objArr[1] = Boolean.valueOf(C86709a0.m107523b().mo121114l());
            Log.m105929w("MMKernel.CoreAccount", "account holded :%s init:%b", objArr);
        }
        return f251743s;
    }

    /* renamed from: u */
    public static SharedPreferences m107552u() {
        return MMApplicationContext.getContext().getSharedPreferences("notify_key_pref_settings", 4);
    }

    /* renamed from: z */
    public static void m107553z() {
        C86709a0.m107528h();
        C86709a0.m107523b().f251766q = "";
        C86709a0.m107528h();
        ((HashMap) C86709a0.m107523b().f251767r).clear();
    }

    /* renamed from: B */
    public final void mo121103B() {
        Log.m105924i("MMKernel.CoreAccount", "changeToNotReady");
        this.f251763n = C58914d.NotReady;
        this.f251765p = false;
        C87974c.f254567a = false;
        Log.m105924i("MMKernel.CoreAccount", "mAccountStatus to NotReady");
        MMApplicationContext.getContext().getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0).edit().putBoolean("isLogin", false).commit();
        Log.m105929w("MMKernel.CoreAccount", "[arthurdan.AccountNR] account storage reset! uin:%d, resetStack is:%s, resetTime:%s", Integer.valueOf(C86720e.m107576a(f251745u)), f251746v, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSZ", Locale.getDefault()).format(new Date()));
    }

    /* renamed from: C */
    public void mo121104C() {
        Log.m105925i("MMKernel.CoreAccount", "summerasyncinit setInitializedNotifyAllDone[%b] to true stack[%s]", Boolean.valueOf(this.f251765p), Util.getStack());
        this.f251765p = true;
        C87974c.f254567a = true;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Log.m105925i("MMKernel.CoreAccount", "summerhardcoder setInitializedNotifyAllDone [%d %d] take[%d]ms, stack[%s]", Long.valueOf(this.f251762m), Long.valueOf(elapsedRealtime), Long.valueOf(elapsedRealtime - this.f251762m), Util.getStack());
    }

    /* renamed from: D */
    public void mo121105D(int i, int i2) {
        boolean z = (this.f251759j == i && this.f251760k == i2) ? false : true;
        Log.m105919d("MMKernel.CoreAccount", "online status, %d, %d, %d ,%d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(this.f251760k), Integer.valueOf(this.f251759j));
        if (z) {
            this.f251759j = i;
            this.f251760k = i2;
            new MMHandler(Looper.getMainLooper()).post(new C86719b());
        }
    }

    /* renamed from: a */
    public void mo121106a(C31461f3 f3Var) {
        Log.m105925i("MMKernel.CoreAccount", "UserStatusChange: add %s", f3Var);
        synchronized (this.f251761l) {
            if (!this.f251761l.contains(f3Var)) {
                this.f251761l.add(f3Var);
            }
        }
    }

    /* renamed from: b */
    public void mo121107b() {
        if (mo121114l() && C87424c.f253334g.f253336e) {
            Log.m105924i("MMKernel.CoreAccount", "Flush client version.");
            C86744o s = C86709a0.m107535s();
            s.f251812j.mo119676J(14, Integer.valueOf(C89625d.f257841g));
            s.f251812j.mo119676J(93, BuildInfo.BUILD_RAND_ID);
        }
    }

    /* renamed from: c */
    public void mo121108c() {
        if (!mo121114l()) {
            throw new C86484b();
        }
    }

    /* renamed from: d */
    public C7980c mo121109d() {
        String str = (String) C86709a0.m107535s().mo121142i().mo119684e(274436, (Object) null);
        return (Util.isNullOrNil(str) || "CN".equalsIgnoreCase(str)) ? C7980c.WeiXin : C7980c.WeChat;
    }

    /* renamed from: g */
    public int mo121110g() {
        return C86720e.m107576a(f251745u);
    }

    /* renamed from: i */
    public String mo121111i() {
        return new C77710q(mo121110g()).toString();
    }

    /* renamed from: j */
    public String mo121112j() {
        C86709a0.m107528h();
        return Util.nullAsNil((String) C86709a0.m107535s().mo121142i().mo119684e(2, (Object) null));
    }

    /* renamed from: k */
    public synchronized C117744o0 mo121113k() {
        if (this.f251751b == null) {
            this.f251751b = new C117744o0();
        }
        return this.f251751b;
    }

    /* renamed from: l */
    public boolean mo121114l() {
        return this.f251763n == C58914d.AccountHasReady;
    }

    /* renamed from: m */
    public boolean mo121115m() {
        return C86720e.m107576a(f251745u) != 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0096, code lost:
        return;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo121116o() {
        /*
            r7 = this;
            boolean r0 = r7.mo121114l()
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            byte[] r0 = r7.f251752c
            monitor-enter(r0)
            boolean r1 = r7.mo121114l()     // Catch:{ all -> 0x0097 }
            if (r1 == 0) goto L_0x0012
            monitor-exit(r0)     // Catch:{ all -> 0x0097 }
            return
        L_0x0012:
            r1 = 0
            r2 = 1
            boolean r3 = p156gj.C87203t.m108265a()     // Catch:{ Error -> 0x0065 }
            if (r3 == 0) goto L_0x006e
            com.tencent.mm.autogen.mmdata.rpt.DeviceIdChangeStatStruct r3 = new com.tencent.mm.autogen.mmdata.rpt.DeviceIdChangeStatStruct     // Catch:{ Error -> 0x0065 }
            r3.<init>()     // Catch:{ Error -> 0x0065 }
            java.lang.String r4 = p156gj.C87203t.f252890o     // Catch:{ Error -> 0x0065 }
            java.lang.String r5 = "PreFirstInstallTime"
            java.lang.String r4 = r3.mo86045b(r5, r4, r2)     // Catch:{ Error -> 0x0065 }
            r3.f236375d = r4     // Catch:{ Error -> 0x0065 }
            java.lang.String r4 = p156gj.C87203t.m108267c()     // Catch:{ Error -> 0x0065 }
            java.lang.String r5 = "CurFirstInstallTime"
            java.lang.String r4 = r3.mo86045b(r5, r4, r2)     // Catch:{ Error -> 0x0065 }
            r3.f236376e = r4     // Catch:{ Error -> 0x0065 }
            java.lang.String r4 = p156gj.C87203t.f252891p     // Catch:{ Error -> 0x0065 }
            java.lang.String r5 = "PreAndroidId"
            java.lang.String r4 = r3.mo86045b(r5, r4, r2)     // Catch:{ Error -> 0x0065 }
            r3.f236377f = r4     // Catch:{ Error -> 0x0065 }
            java.lang.String r4 = p156gj.C87203t.m108266b()     // Catch:{ Error -> 0x0065 }
            java.lang.String r5 = "CurAndroidId"
            java.lang.String r4 = r3.mo86045b(r5, r4, r2)     // Catch:{ Error -> 0x0065 }
            r3.f236378g = r4     // Catch:{ Error -> 0x0065 }
            java.lang.String r4 = p156gj.C87203t.f252892q     // Catch:{ Error -> 0x0065 }
            java.lang.String r5 = "PreDeviceModel"
            java.lang.String r4 = r3.mo86045b(r5, r4, r2)     // Catch:{ Error -> 0x0065 }
            r3.f236379h = r4     // Catch:{ Error -> 0x0065 }
            java.lang.String r4 = p156gj.C87203t.m108275k()     // Catch:{ Error -> 0x0065 }
            java.lang.String r5 = "CurDeviceModel"
            java.lang.String r4 = r3.mo86045b(r5, r4, r2)     // Catch:{ Error -> 0x0065 }
            r3.f236380i = r4     // Catch:{ Error -> 0x0065 }
            r3.mo86054n()     // Catch:{ Error -> 0x0065 }
            goto L_0x006e
        L_0x0065:
            r3 = move-exception
            java.lang.String r4 = "MMKernel.CoreAccount"
            r5 = 0
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ all -> 0x0097 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r3, r5, r6)     // Catch:{ all -> 0x0097 }
        L_0x006e:
            f40.e$e r3 = f251745u     // Catch:{ all -> 0x0097 }
            int r3 = f40.C86718e.C86720e.m107576a(r3)     // Catch:{ all -> 0x0097 }
            if (r3 == 0) goto L_0x0095
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0097 }
            r7.f251762m = r4     // Catch:{ all -> 0x0097 }
            java.lang.String r4 = "MMKernel.CoreAccount"
            java.lang.String r5 = "auto set up account storage uin: %d, stack: %s"
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x0097 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0097 }
            r6[r1] = r3     // Catch:{ all -> 0x0097 }
            com.tencent.mm.sdk.platformtools.MMStack r3 = com.tencent.p014mm.sdk.platformtools.Util.getStack()     // Catch:{ all -> 0x0097 }
            r6[r2] = r3     // Catch:{ all -> 0x0097 }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r5, r6)     // Catch:{ all -> 0x0097 }
            r7.mo121117p(r1)     // Catch:{ all -> 0x0097 }
        L_0x0095:
            monitor-exit(r0)     // Catch:{ all -> 0x0097 }
            return
        L_0x0097:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0097 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: f40.C86718e.mo121116o():void");
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r5v13, types: [boolean] */
    /* JADX WARNING: type inference failed for: r5v39 */
    /* JADX WARNING: type inference failed for: r5v69 */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: p */
    public final void mo121117p(boolean r24) {
        /*
            r23 = this;
            r1 = r23
            r2 = 2
            r3 = 1
            r4 = 0
            if (r24 != 0) goto L_0x0070
            com.tencent.mm.hardcoder.WXHardCoderJNI r5 = com.tencent.p014mm.hardcoder.C40318k.m43492a()
            com.tencent.mm.hardcoder.WXHardCoderJNI r0 = com.tencent.p014mm.hardcoder.C40318k.m43492a()
            boolean r6 = r0.getHcBootEnable()
            com.tencent.mm.hardcoder.WXHardCoderJNI r0 = com.tencent.p014mm.hardcoder.C40318k.m43492a()
            int r7 = r0.getHcBootDelay()
            com.tencent.mm.hardcoder.WXHardCoderJNI r0 = com.tencent.p014mm.hardcoder.C40318k.m43492a()
            int r8 = r0.getHcBootCPU()
            com.tencent.mm.hardcoder.WXHardCoderJNI r0 = com.tencent.p014mm.hardcoder.C40318k.m43492a()
            int r9 = r0.getHcBootIO()
            com.tencent.mm.hardcoder.WXHardCoderJNI r0 = com.tencent.p014mm.hardcoder.C40318k.m43492a()
            boolean r0 = r0.getHcBootThr()
            if (r0 == 0) goto L_0x003f
            com.tencent.mm.sdk.platformtools.MMHandlerThread r0 = f40.C86709a0.m107525e()
            int r0 = r0.getProcessTid()
            r10 = r0
            goto L_0x0040
        L_0x003f:
            r10 = 0
        L_0x0040:
            com.tencent.mm.hardcoder.WXHardCoderJNI r0 = com.tencent.p014mm.hardcoder.C40318k.m43492a()
            int r11 = r0.getHcBootTimeout()
            r12 = 101(0x65, float:1.42E-43)
            com.tencent.mm.hardcoder.WXHardCoderJNI r0 = com.tencent.p014mm.hardcoder.C40318k.m43492a()
            long r13 = r0.getHcBootAction()
            java.lang.String r15 = "MMKernel.CoreAccount"
            int r0 = r5.startPerformance(r6, r7, r8, r9, r10, r11, r12, r13, r15)
            r1.f251756g = r0
            java.lang.String r5 = "MMKernel.CoreAccount"
            java.lang.String r6 = "summerhardcoder startPerformance[%s] stack[%s]"
            java.lang.Object[] r7 = new java.lang.Object[r2]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7[r4] = r0
            com.tencent.mm.sdk.platformtools.MMStack r0 = com.tencent.p014mm.sdk.platformtools.Util.getStack()
            r7[r3] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r6, r7)
        L_0x0070:
            java.lang.String r0 = "MMKernel.CoreAccount"
            java.lang.String r5 = "UserStatusChange: clear"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r5)
            java.util.List<eb0.f3> r5 = r1.f251761l
            monitor-enter(r5)
            java.util.List<eb0.f3> r0 = r1.f251761l     // Catch:{ all -> 0x0b24 }
            java.util.LinkedList r0 = (java.util.LinkedList) r0     // Catch:{ all -> 0x0b24 }
            r0.clear()     // Catch:{ all -> 0x0b24 }
            monitor-exit(r5)     // Catch:{ all -> 0x0b24 }
            long r5 = java.lang.System.currentTimeMillis()
            f40.e$e r0 = f251745u
            int r7 = f40.C86718e.C86720e.m107576a(r0)
            java.lang.String r0 = "MMKernel.CoreAccount"
            java.lang.String r8 = "dkacc setAccuin %s hash:%d thread:%d[%s] stack:%s"
            r9 = 5
            java.lang.Object[] r10 = new java.lang.Object[r9]
            java.lang.String r11 = p823sg.C77710q.m93738a(r7)
            r10[r4] = r11
            r11 = 100
            int r11 = p823sg.C101615j.m133462b(r7, r11)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r10[r3] = r11
            java.lang.Thread r11 = java.lang.Thread.currentThread()
            long r11 = r11.getId()
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r10[r2] = r11
            java.lang.Thread r11 = java.lang.Thread.currentThread()
            java.lang.String r11 = r11.getName()
            r12 = 3
            r10[r12] = r11
            com.tencent.mm.sdk.platformtools.MMStack r11 = com.tencent.p014mm.sdk.platformtools.Util.getStack()
            r13 = 4
            r10[r13] = r11
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r8, r10)
            if (r7 == 0) goto L_0x00cc
            r0 = 1
            goto L_0x00cd
        L_0x00cc:
            r0 = 0
        L_0x00cd:
            if (r0 != 0) goto L_0x00db
            java.lang.String r0 = "MMKernel.CoreAccount"
            java.lang.String r7 = "setAccUin, Reset by MMCore.resetAccUin"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r7)
            r21 = r5
            goto L_0x0aa8
        L_0x00db:
            java.lang.String r0 = p823sg.C77710q.m93738a(r7)
            com.tencent.p014mm.sdk.crash.CrashReportFactory.setReportID(r0)
            p156gj.C87203t.f252876a = r3
            java.lang.String r0 = "MicroMsg.DeviceInfo"
            java.lang.String r8 = "allowGetSensitiveDataFromSys"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r8)
            java.lang.String r0 = "storage().prepareStorage"
            bp3.C79760s.m96908a(r0)
            f40.C86709a0.m107528h()
            f40.o r8 = f40.C86709a0.m107535s()
            f40.d r10 = new f40.d
            r10.<init>(r1)
            r8.getClass()
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getDefaultPreferencePath()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r4)
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r11, r4)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r11 = "isLogin"
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r11, r3)
            r0.apply()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r11 = "mm"
            r0.append(r11)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            byte[] r0 = r0.getBytes()
            java.lang.String r11 = p823sg.C90193h.m112878f(r0)
            com.tencent.mm.vfs.m1 r15 = new com.tencent.mm.vfs.m1
            java.lang.String r0 = a70.C112760b.m154216X()
            java.lang.String r9 = "account.bin"
            r15.<init>((java.lang.String) r0, (java.lang.String) r9)
            com.tencent.mm.vfs.m1 r9 = new com.tencent.mm.vfs.m1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r13 = a70.C112760b.m154216X()
            r0.append(r13)
            java.lang.String r13 = "MicroMsg/"
            r0.append(r13)
            r0.append(r11)
            java.lang.String r12 = "/account.bin"
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            r9.<init>((java.lang.String) r0)
            com.tencent.mm.vfs.m1 r12 = new com.tencent.mm.vfs.m1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = a70.C112760b.m154216X()
            r0.append(r3)
            r0.append(r13)
            r0.append(r11)
            java.lang.String r3 = "/account.mapping"
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r12.<init>((java.lang.String) r0)
            byte[] r3 = f40.C86744o.m107607p(r15)
            byte[] r13 = f40.C86744o.m107607p(r9)
            java.lang.String r2 = "MMKernel.CoreStorage"
            if (r13 == 0) goto L_0x0194
            r21 = r5
            r5 = r13
            r0 = 0
            goto L_0x01e2
        L_0x0194:
            if (r3 == 0) goto L_0x019b
            r21 = r5
            r0 = 0
            r5 = r3
            goto L_0x01e2
        L_0x019b:
            java.lang.String r0 = "/dev/urandom"
            java.io.InputStream r4 = com.tencent.p014mm.vfs.C86013q1.m106423E(r0)     // Catch:{ IOException -> 0x01d2 }
            r0 = 4096(0x1000, float:5.74E-42)
            r21 = r5
            byte[] r5 = new byte[r0]     // Catch:{ all -> 0x01c2 }
            r6 = 0
        L_0x01a8:
            int r0 = 4096 - r6
            int r0 = r4.read(r5, r6, r0)     // Catch:{ all -> 0x01c2 }
            if (r0 >= 0) goto L_0x01b9
            java.lang.String r0 = "EOF of /dev/urandom ?!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)     // Catch:{ all -> 0x01c2 }
            r4.close()     // Catch:{ IOException -> 0x01d0 }
            goto L_0x01dd
        L_0x01b9:
            int r6 = r6 + r0
            r0 = 4096(0x1000, float:5.74E-42)
            if (r6 < r0) goto L_0x01a8
            r4.close()     // Catch:{ IOException -> 0x01d0 }
            goto L_0x01de
        L_0x01c2:
            r0 = move-exception
            r5 = r0
            if (r4 == 0) goto L_0x01cf
            r4.close()     // Catch:{ all -> 0x01ca }
            goto L_0x01cf
        L_0x01ca:
            r0 = move-exception
            r4 = r0
            r5.addSuppressed(r4)     // Catch:{ IOException -> 0x01d0 }
        L_0x01cf:
            throw r5     // Catch:{ IOException -> 0x01d0 }
        L_0x01d0:
            r0 = move-exception
            goto L_0x01d5
        L_0x01d2:
            r0 = move-exception
            r21 = r5
        L_0x01d5:
            r4 = 0
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.String r4 = "Cannot generate account file."
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r4, r5)
        L_0x01dd:
            r5 = 0
        L_0x01de:
            if (r5 != 0) goto L_0x01e1
            goto L_0x020f
        L_0x01e1:
            r0 = 1
        L_0x01e2:
            r17 = 4112(0x1010, double:2.0316E-320)
            if (r13 == 0) goto L_0x01f1
            long r19 = r9.mo119980r()
            int r4 = (r19 > r17 ? 1 : (r19 == r17 ? 0 : -1))
            if (r4 == 0) goto L_0x01ef
            goto L_0x01f1
        L_0x01ef:
            r4 = 0
            goto L_0x01f7
        L_0x01f1:
            boolean r4 = f40.C86744o.m107610v(r9, r5)
            r6 = 0
            r4 = r4 | r6
        L_0x01f7:
            if (r3 == 0) goto L_0x0201
            long r19 = r15.mo119980r()
            int r3 = (r19 > r17 ? 1 : (r19 == r17 ? 0 : -1))
            if (r3 == 0) goto L_0x0206
        L_0x0201:
            boolean r3 = f40.C86744o.m107610v(r15, r5)
            r4 = r4 | r3
        L_0x0206:
            if (r0 == 0) goto L_0x0212
            if (r4 != 0) goto L_0x0212
            java.lang.String r0 = "Cannot write new generated data to account files."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
        L_0x020f:
            r3 = 0
            goto L_0x029a
        L_0x0212:
            java.lang.String r0 = "MD5"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch:{ NoSuchAlgorithmException -> 0x0b1d }
            r0.update(r5)
            java.lang.String r3 = java.lang.Integer.toString(r7)
            byte[] r3 = r3.getBytes()
            r0.update(r3)
            byte[] r0 = r0.digest()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r4 = r0.length
            r5 = 2
            int r4 = r4 * 2
            r3.<init>(r4)
            r4 = 16
            char[] r5 = new char[r4]
            r5 = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102} // fill-array
            r6 = 0
        L_0x023b:
            if (r6 >= r4) goto L_0x0252
            byte r9 = r0[r6]
            int r13 = r9 >>> 4
            r13 = r13 & 15
            char r13 = r5[r13]
            r3.append(r13)
            r9 = r9 & 15
            char r9 = r5[r9]
            r3.append(r9)
            int r6 = r6 + 1
            goto L_0x023b
        L_0x0252:
            java.lang.String r3 = r3.toString()
            boolean r0 = r12.mo119967g()
            if (r0 != 0) goto L_0x029a
            java.io.OutputStream r4 = com.tencent.p014mm.vfs.C86013q1.m106426H(r12)     // Catch:{ IOException -> 0x028d }
            byte[] r0 = r3.getBytes()     // Catch:{ all -> 0x027f }
            r4.write(r0)     // Catch:{ all -> 0x027f }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x027f }
            r0.<init>()     // Catch:{ all -> 0x027f }
            java.lang.String r5 = "Write account mapping "
            r0.append(r5)     // Catch:{ all -> 0x027f }
            r0.append(r12)     // Catch:{ all -> 0x027f }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x027f }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)     // Catch:{ all -> 0x027f }
            r4.close()     // Catch:{ IOException -> 0x028d }
            goto L_0x029a
        L_0x027f:
            r0 = move-exception
            r5 = r0
            if (r4 == 0) goto L_0x028c
            r4.close()     // Catch:{ all -> 0x0287 }
            goto L_0x028c
        L_0x0287:
            r0 = move-exception
            r4 = r0
            r5.addSuppressed(r4)     // Catch:{ IOException -> 0x028d }
        L_0x028c:
            throw r5     // Catch:{ IOException -> 0x028d }
        L_0x028d:
            r0 = move-exception
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r4 = 0
            r5[r4] = r12
            java.lang.String r6 = "Cannot write to account mapping %s"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r6, r5)
            goto L_0x029b
        L_0x029a:
            r4 = 0
        L_0x029b:
            java.lang.String r0 = "MMKernel.CoreStorage"
            java.lang.String r2 = "uinPath: %s, uinSaltPath: %s"
            r5 = 2
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r6[r4] = r11
            r4 = 1
            r6[r4] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r2, r6)
            boolean r2 = p206nj.C88955f.m111058b()
            java.lang.String r0 = "LegacyAccountMigrate"
            bp3.C79760s.m96908a(r0)
            if (r3 != 0) goto L_0x02c0
            java.lang.String r0 = "MMKernel.CoreStorage"
            java.lang.String r4 = "Cannot generate account path, skip account renaming!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r4)
            r0 = 6
            goto L_0x0353
        L_0x02c0:
            java.lang.String r0 = r8.f251805c
            java.lang.String r4 = a70.C112760b.m154230f0()
            boolean r0 = r0.startsWith(r4)
            if (r0 == 0) goto L_0x034b
            if (r2 != 0) goto L_0x02d0
            goto L_0x034b
        L_0x02d0:
            com.tencent.mm.vfs.m1 r0 = new com.tencent.mm.vfs.m1
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r8.f251805c
            r4.append(r5)
            r4.append(r11)
            java.lang.String r4 = r4.toString()
            r0.<init>((java.lang.String) r4)
            com.tencent.mm.vfs.m1 r4 = new com.tencent.mm.vfs.m1
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r8.f251805c
            r5.append(r6)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            r4.<init>((java.lang.String) r5)
            boolean r5 = r0.mo119977o()
            if (r5 == 0) goto L_0x033c
            boolean r5 = r4.mo119977o()
            if (r5 == 0) goto L_0x0311
            java.lang.String r0 = "MMKernel.CoreStorage"
            java.lang.String r4 = "Both uinPath exists, migration shall be taken."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r4)
            r9 = 2
            goto L_0x0349
        L_0x0311:
            r4.mo119966f()
            java.lang.String r5 = "MMKernel.CoreStorage"
            java.lang.String r6 = "Move account directory: %s => %s"
            r9 = 2
            java.lang.Object[] r12 = new java.lang.Object[r9]
            r9 = 0
            r12[r9] = r0
            r9 = 1
            r12[r9] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r6, r12)
            boolean r0 = r0.mo119988y(r4)
            if (r0 != 0) goto L_0x0333
            java.lang.String r0 = "MMKernel.CoreStorage"
            java.lang.String r4 = "Failed to move uinPath, use old accPath"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r4)
            r0 = 4
            goto L_0x0353
        L_0x0333:
            java.lang.String r0 = "MMKernel.CoreStorage"
            java.lang.String r4 = "Moved to new uinPath"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r4)
            r9 = 3
            goto L_0x0349
        L_0x033c:
            boolean r0 = r4.mo119977o()
            if (r0 != 0) goto L_0x0345
            r4.mo119966f()
        L_0x0345:
            r4.mo119987x()
            r9 = 5
        L_0x0349:
            r4 = 1
            goto L_0x0355
        L_0x034b:
            java.lang.String r0 = "MMKernel.CoreStorage"
            java.lang.String r4 = "SDCard not available, skip account renaming!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r4)
            r0 = 1
        L_0x0353:
            r9 = r0
            r4 = 0
        L_0x0355:
            bp3.C79760s.m96909b()
            r8.f251808f = r11
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = com.tencent.p014mm.storage.C72994y1.f212832a
            r0.append(r5)
            java.lang.String r5 = r8.f251808f
            r0.append(r5)
            r5 = 47
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            r8.f251807e = r0
            if (r4 == 0) goto L_0x0378
            r0 = r3
            goto L_0x0379
        L_0x0378:
            r0 = r11
        L_0x0379:
            r8.f251810h = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = r8.f251805c
            r0.append(r6)
            java.lang.String r6 = r8.f251810h
            r0.append(r6)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            r8.f251806d = r0
            if (r3 != 0) goto L_0x0397
            r0 = r11
            goto L_0x0398
        L_0x0397:
            r0 = r3
        L_0x0398:
            r8.f251809g = r0
            com.tencent.p014mm.vfs.VFSStrategy.m163778f(r9)
            java.lang.String r0 = r8.f251807e
            android.net.Uri r0 = com.tencent.p014mm.vfs.C116299g2.m163858n(r0)
            java.lang.String r5 = r0.getPath()
            if (r5 == 0) goto L_0x03c4
            r6 = 0
            java.lang.String r5 = com.tencent.p014mm.vfs.C116299g2.m163855k(r5, r6, r6)
            java.lang.String r6 = r0.getPath()
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L_0x03c4
            android.net.Uri$Builder r0 = r0.buildUpon()
            android.net.Uri$Builder r0 = r0.path(r5)
            android.net.Uri r0 = r0.build()
        L_0x03c4:
            java.lang.String r5 = "MMKernel.CoreStorage"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r9 = "dkacc cachePath:"
            r6.append(r9)
            java.lang.String r9 = r8.f251807e
            r6.append(r9)
            java.lang.String r9 = " accPath:"
            r6.append(r9)
            java.lang.String r9 = r8.f251806d
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            com.tencent.mm.vfs.f0 r5 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            r6 = 0
            com.tencent.mm.vfs.f0$h r9 = r5.mo177799l(r0, r6)
            boolean r6 = r9.mo177810a()
            if (r6 != 0) goto L_0x03f5
            r6 = 0
            goto L_0x03fd
        L_0x03f5:
            com.tencent.mm.vfs.FileSystem$c r6 = r9.f348991a
            java.lang.String r12 = r9.f348992b
            boolean r6 = r6.mo119948x(r12)
        L_0x03fd:
            if (r6 != 0) goto L_0x04fe
            java.lang.String r6 = "MMKernel.CoreStorage"
            java.lang.String r12 = "setUin REBUILD data now ! DO NOT TELL ME DB BROKEN !!! uin:%s data:%s sd:%s"
            r13 = 3
            java.lang.Object[] r15 = new java.lang.Object[r13]
            java.lang.String r13 = p823sg.C77710q.m93738a(r7)
            r16 = 0
            r15[r16] = r13
            java.lang.String r13 = r8.f251807e
            r16 = 1
            r15[r16] = r13
            java.lang.String r13 = r8.f251806d
            r16 = 2
            r15[r16] = r13
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r6, r12, r15)
            com.tencent.mm.vfs.f0$h r0 = r5.mo177799l(r0, r9)
            boolean r6 = r0.mo177810a()
            if (r6 != 0) goto L_0x0429
            goto L_0x0430
        L_0x0429:
            com.tencent.mm.vfs.FileSystem$c r6 = r0.f348991a
            java.lang.String r0 = r0.f348992b
            r6.mo119937g(r0)
        L_0x0430:
            java.lang.String r0 = r8.f251807e
            java.lang.String r6 = r8.f251806d
            boolean r0 = r0.equalsIgnoreCase(r6)
            if (r0 != 0) goto L_0x04fa
            long r12 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = r8.f251806d
            android.net.Uri r0 = com.tencent.p014mm.vfs.C116299g2.m163858n(r0)
            java.lang.String r6 = r0.getPath()
            if (r6 == 0) goto L_0x0465
            r9 = 0
            java.lang.String r6 = com.tencent.p014mm.vfs.C116299g2.m163855k(r6, r9, r9)
            java.lang.String r9 = r0.getPath()
            boolean r9 = r9.equals(r6)
            if (r9 != 0) goto L_0x0465
            android.net.Uri$Builder r0 = r0.buildUpon()
            android.net.Uri$Builder r0 = r0.path(r6)
            android.net.Uri r0 = r0.build()
        L_0x0465:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r11)
            java.lang.String r9 = "temp"
            r6.append(r9)
            r9 = r14
            long r14 = java.lang.System.currentTimeMillis()
            r6.append(r14)
            java.lang.String r6 = r6.toString()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = a70.C112760b.m154195C()
            r14.append(r15)
            r14.append(r6)
            java.lang.String r6 = r14.toString()
            android.net.Uri r14 = com.tencent.p014mm.vfs.C116299g2.m163858n(r6)
            java.lang.String r15 = r14.getPath()
            if (r15 == 0) goto L_0x04b7
            r1 = 0
            java.lang.String r15 = com.tencent.p014mm.vfs.C116299g2.m163855k(r15, r1, r1)
            java.lang.String r1 = r14.getPath()
            boolean r1 = r1.equals(r15)
            if (r1 != 0) goto L_0x04b7
            android.net.Uri$Builder r1 = r14.buildUpon()
            android.net.Uri$Builder r1 = r1.path(r15)
            android.net.Uri r14 = r1.build()
        L_0x04b7:
            r1 = 0
            com.tencent.mm.vfs.f0$h r0 = r5.mo177799l(r0, r1)
            com.tencent.mm.vfs.f0$h r5 = r5.mo177799l(r14, r1)
            boolean r1 = r0.mo177810a()
            if (r1 == 0) goto L_0x04d8
            boolean r1 = r5.mo177810a()
            if (r1 != 0) goto L_0x04cd
            goto L_0x04d8
        L_0x04cd:
            com.tencent.mm.vfs.FileSystem$c r1 = r5.f348991a     // Catch:{ IOException -> 0x04d8 }
            java.lang.String r5 = r5.f348992b     // Catch:{ IOException -> 0x04d8 }
            com.tencent.mm.vfs.FileSystem$c r14 = r0.f348991a     // Catch:{ IOException -> 0x04d8 }
            java.lang.String r0 = r0.f348992b     // Catch:{ IOException -> 0x04d8 }
            r1.mo119946t(r5, r14, r0)     // Catch:{ IOException -> 0x04d8 }
        L_0x04d8:
            java.lang.String r0 = "MMKernel.CoreStorage"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "find the old files and rename then %s"
            r1.append(r5)
            long r14 = java.lang.System.currentTimeMillis()
            long r14 = r14 - r12
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            r5 = 1
            java.lang.Object[] r12 = new java.lang.Object[r5]
            r5 = 0
            r12[r5] = r6
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r12)
            goto L_0x04fc
        L_0x04fa:
            r9 = r14
            r5 = 0
        L_0x04fc:
            r1 = 1
            goto L_0x0501
        L_0x04fe:
            r9 = r14
            r5 = 0
            r1 = 0
        L_0x0501:
            eb0.f6 r0 = new eb0.f6
            java.lang.String r6 = r8.f251807e
            r0.<init>(r6, r1, r5)
            java.util.concurrent.Future<eb0.f6>[] r6 = eb0.C86487f6.f251311d     // Catch:{ all -> 0x0535 }
            monitor-enter(r6)     // Catch:{ all -> 0x0535 }
            r12 = r6[r5]     // Catch:{ all -> 0x0532 }
            monitor-exit(r6)     // Catch:{ all -> 0x0532 }
            if (r12 != 0) goto L_0x0511
            goto L_0x0540
        L_0x0511:
            java.lang.Object r5 = r12.get()     // Catch:{ all -> 0x0535 }
            eb0.f6 r5 = (eb0.C86487f6) r5     // Catch:{ all -> 0x0535 }
            java.util.ArrayList<java.lang.String> r6 = r5.f251312a     // Catch:{ all -> 0x0535 }
            int r6 = r6.size()     // Catch:{ all -> 0x0535 }
            java.util.ArrayList<java.lang.String> r12 = r0.f251312a     // Catch:{ all -> 0x0535 }
            int r12 = r12.size()     // Catch:{ all -> 0x0535 }
            if (r6 < r12) goto L_0x0526
            goto L_0x0540
        L_0x0526:
            java.util.ArrayList<java.lang.String> r6 = r0.f251312a     // Catch:{ all -> 0x0535 }
            r5.f251312a = r6     // Catch:{ all -> 0x0535 }
            java.lang.String r0 = r0.f251313b     // Catch:{ all -> 0x0535 }
            java.lang.String r5 = r5.f251313b     // Catch:{ all -> 0x0535 }
            com.tencent.p014mm.vfs.C86013q1.m106442c(r0, r5)     // Catch:{ all -> 0x0535 }
            goto L_0x0540
        L_0x0532:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0532 }
            throw r0     // Catch:{ all -> 0x0535 }
        L_0x0535:
            r0 = move-exception
            java.lang.String r5 = "MicroMsg.VersionHistory"
            java.lang.String r6 = "[-] Failure in <init>()"
            r12 = 0
            java.lang.Object[] r13 = new java.lang.Object[r12]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r0, r6, r13)
        L_0x0540:
            if (r2 == 0) goto L_0x0550
            java.lang.String r0 = r8.f251805c
            java.lang.String r2 = a70.C112760b.m154230f0()
            boolean r0 = r0.startsWith(r2)
            if (r0 == 0) goto L_0x0550
            r0 = 1
            goto L_0x0551
        L_0x0550:
            r0 = 0
        L_0x0551:
            com.tencent.mm.vfs.f0 r2 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            com.tencent.mm.vfs.f0$b r2 = r2.mo177789b()
            java.lang.String r5 = "account"
            r2.mo177806f(r5, r11)
            java.lang.String r5 = "accountSalt"
            java.lang.String r6 = r8.f251809g
            r2.mo177806f(r5, r6)
            java.lang.String r5 = "accountSd"
            if (r0 == 0) goto L_0x0573
            r6 = 2
            java.lang.String[] r12 = new java.lang.String[r6]
            java.lang.String r6 = r8.f251809g
            r13 = 0
            r12[r13] = r6
            r6 = 1
            r12[r6] = r11
            goto L_0x0579
        L_0x0573:
            r6 = 1
            r13 = 0
            java.lang.String[] r12 = new java.lang.String[r6]
            r12[r13] = r11
        L_0x0579:
            com.tencent.mm.vfs.v0 r13 = r2.f348981a
            java.util.Map<java.lang.String, java.lang.Object> r13 = r13.f349109e
            r13.put(r5, r12)
            r2.f348982b = r6
            if (r3 == 0) goto L_0x0586
            r3 = 1
            goto L_0x0587
        L_0x0586:
            r3 = 0
        L_0x0587:
            com.tencent.p014mm.vfs.VFSStrategy.m163782j(r2, r0, r3)
            java.lang.String r0 = r8.f251805c
            com.tencent.p014mm.vfs.VFSStrategy.m163780h(r2, r0, r4)
            r3 = 0
            r2.mo177802b(r3)
            java.lang.String r0 = "VFS.Debug"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "SetEnv ${account} = "
            r2.append(r3)
            r2.append(r11)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            java.lang.Class<com.tencent.mm.vfs.VFSStrategy> r2 = com.tencent.p014mm.vfs.VFSStrategy.class
            monitor-enter(r2)
            java.lang.String r0 = "VFS.VFSStrategy"
            java.lang.String r3 = "Account ready."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)     // Catch:{ all -> 0x0b18 }
            r3 = 1
            com.tencent.p014mm.vfs.VFSStrategy.f348874d = r3     // Catch:{ all -> 0x0b18 }
            monitor-enter(r2)     // Catch:{ all -> 0x0b18 }
            boolean r0 = com.tencent.p014mm.vfs.VFSStrategy.f348872b     // Catch:{ all -> 0x0b0f }
            if (r0 == 0) goto L_0x05c8
            boolean r0 = com.tencent.p014mm.vfs.VFSStrategy.f348875e     // Catch:{ all -> 0x0b0f }
            if (r0 == 0) goto L_0x05c8
            boolean r0 = com.tencent.p014mm.vfs.VFSStrategy.f348876f     // Catch:{ all -> 0x0b0f }
            r3 = 1
            r0 = r0 ^ r3
            if (r0 == 0) goto L_0x05c9
            com.tencent.p014mm.vfs.VFSStrategy.f348876f = r3     // Catch:{ all -> 0x0b0f }
            goto L_0x05c9
        L_0x05c8:
            r0 = 0
        L_0x05c9:
            monitor-exit(r2)     // Catch:{ all -> 0x0b0f }
            if (r0 == 0) goto L_0x05cf
            com.tencent.p014mm.vfs.VFSStrategy.m163773a(r4)     // Catch:{ all -> 0x0b18 }
        L_0x05cf:
            monitor-exit(r2)
            r8.mo121150r()
            java.lang.String r0 = "initDB"
            bp3.C79760s.m96908a(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = r8.f251807e
            r0.append(r2)
            java.lang.String r2 = "MicroMsg.db"
            r0.append(r2)
            java.lang.String r13 = r0.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = r8.f251807e
            r0.append(r2)
            java.lang.String r2 = "EnMicroMsg.db"
            r0.append(r2)
            java.lang.String r14 = r0.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = r8.f251807e
            r0.append(r2)
            java.lang.String r2 = "EnMicroMsg2.db"
            r0.append(r2)
            java.lang.String r15 = r0.toString()
            r2 = 0
            r8.mo121137c(r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r14)
            java.lang.String r2 = "-recovery"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.mm.vfs.m1 r2 = new com.tencent.mm.vfs.m1
            r2.<init>((java.lang.String) r0)
            boolean r0 = r2.mo119978p()
            java.lang.String r3 = "MMKernel.CoreStorage"
            if (r0 == 0) goto L_0x066e
            java.lang.String r0 = "Recovery database found, replace original one."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r14)
            java.lang.String r4 = ".ini"
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.vfs.C86013q1.m106447h(r0)
            com.tencent.mm.vfs.m1 r0 = new com.tencent.mm.vfs.m1
            r0.<init>((java.lang.String) r14)
            r4 = 3
            com.tencent.p014mm.vfs.AccessControlFileSystem.m163532d(r4, r14)
            r0.mo119966f()
            com.tencent.p014mm.vfs.AccessControlFileSystem.m163534f(r4)
            r4 = 8
            com.tencent.p014mm.vfs.AccessControlFileSystem.m163532d(r4, r14)
            boolean r0 = r2.mo119988y(r0)
            if (r0 != 0) goto L_0x066b
            java.lang.String r0 = "Rename database file failed!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
        L_0x066b:
            com.tencent.p014mm.vfs.AccessControlFileSystem.m163534f(r4)
        L_0x066e:
            java.lang.String r0 = r2.getName()
            com.tencent.mm.vfs.m1 r2 = r2.mo119974l()
            f40.k r4 = new f40.k
            r4.<init>(r8, r0)
            com.tencent.mm.vfs.m1[] r0 = r2.mo119986w(r4)
            if (r0 == 0) goto L_0x06a5
            int r2 = r0.length
            r4 = 0
        L_0x0683:
            if (r4 >= r2) goto L_0x06a5
            r5 = r0[r4]
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r12 = "Delete temporary recovery database file: "
            r6.append(r12)
            java.lang.String r12 = r5.getName()
            r6.append(r12)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r6)
            r5.mo119966f()
            int r4 = r4 + 1
            goto L_0x0683
        L_0x06a5:
            java.lang.String r0 = "Init dataDB"
            bp3.C79760s.m96908a(r0)
            zh3.f r12 = new zh3.f
            f40.l r0 = new f40.l
            r0.<init>(r8)
            r12.<init>(r0)
            r8.f251811i = r12
            long r4 = (long) r7
            r2 = 1
            java.lang.String r18 = p156gj.C87203t.m108270f(r2)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.HashMap<java.lang.Integer, zh3.f$b> r2 = f40.C86744o.f251802w
            r0.putAll(r2)
            r20 = 1
            r16 = r4
            r19 = r0
            boolean r0 = r12.mo125624n(r13, r14, r15, r16, r18, r19, r20)
            if (r0 == 0) goto L_0x0b05
            zh3.f r0 = r8.f251811i
            java.lang.String r0 = r0.f262820g
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r2 != 0) goto L_0x070b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "dbinit failed :"
            r2.append(r4)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "init db Failed: [ "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = "]"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = "DBinit"
            com.tencent.p014mm.sdk.crash.CrashReportFactory.reportRawMessage(r0, r2)
        L_0x070b:
            zh3.f r0 = r8.f251811i
            zh3.a r0 = r0.f262817d
            if (r0 == 0) goto L_0x0714
            boolean r0 = r0.f262809g
            goto L_0x0715
        L_0x0714:
            r0 = 0
        L_0x0715:
            if (r0 == 0) goto L_0x071a
            r2 = 1
            r8.f251816n = r2
        L_0x071a:
            bp3.C79760s.m96909b()
            java.lang.String r0 = "Init userConfigStg/tablesVersionStg"
            bp3.C79760s.m96908a(r0)
            com.tencent.mm.storage.v1 r0 = new com.tencent.mm.storage.v1
            zh3.f r2 = r8.f251811i
            r0.<init>(r2)
            r8.f251812j = r0
            com.tencent.mm.storage.c5 r0 = new com.tencent.mm.storage.c5
            zh3.f r2 = r8.f251811i
            r0.<init>(r2)
            r8.f251814l = r0
            zh3.f r0 = r8.f251811i
            f40.m r2 = new f40.m
            r2.<init>(r8)
            r0.f262819f = r2
            bp3.C79760s.m96909b()
            com.tencent.mm.storage.c5 r0 = r8.f251814l
            zh3.f r0 = r0.f82644d
            r2 = 0
            java.lang.String[] r3 = new java.lang.String[r2]
            java.lang.String r2 = "select * from TablesVersion"
            android.database.Cursor r2 = r0.rawQuery(r2, r3)
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            if (r2 != 0) goto L_0x0756
            goto L_0x0771
        L_0x0756:
            boolean r3 = r2.moveToNext()     // Catch:{ all -> 0x0afe }
            if (r3 == 0) goto L_0x076e
            r3 = 0
            int r4 = r2.getInt(r3)     // Catch:{ all -> 0x0afe }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0afe }
            r4 = 1
            java.lang.String r5 = r2.getString(r4)     // Catch:{ all -> 0x0afe }
            r0.putIfAbsent(r3, r5)     // Catch:{ all -> 0x0afe }
            goto L_0x0756
        L_0x076e:
            r2.close()
        L_0x0771:
            r8.f251815m = r0
            java.lang.String r0 = "Init svrCfgInfoStg"
            bp3.C79760s.m96908a(r0)
            com.tencent.mm.storage.t4 r0 = new com.tencent.mm.storage.t4
            com.tencent.mm.storage.v1 r2 = r8.f251812j
            r0.<init>(r2)
            r8.f251813k = r0
            f40.n r2 = new f40.n
            r2.<init>(r8)
            r0.add(r2)
            com.tencent.mm.storage.t4 r0 = r8.f251813k
            r0.mo119658Yt()
            bp3.C79760s.m96909b()
            bp3.C79760s.m96909b()
            r10.run()
            if (r1 == 0) goto L_0x082c
            com.tencent.mm.storage.v1 r0 = r8.f251812j
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_INSTALL_FIRST_TIME_LONG
            r2 = 0
            java.lang.Long r4 = java.lang.Long.valueOf(r2)
            java.lang.Object r0 = r0.mo119685f(r1, r4)
            java.lang.Long r0 = (java.lang.Long) r0
            long r4 = r0.longValue()
            com.tencent.mm.storage.v1 r0 = r8.f251812j
            com.tencent.mm.storage.y1$a r6 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_INSTALL_FIRST_CLIENT_VERSION_INT
            java.lang.Object r0 = r0.mo119685f(r6, r9)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            int r10 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r10 <= 0) goto L_0x07d2
            java.lang.String r10 = "MMKernel.CoreStorage"
            java.lang.String r12 = "summerinstall new install but firsttime[%d] > 0"
            r13 = 1
            java.lang.Object[] r14 = new java.lang.Object[r13]
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r5 = 0
            r14[r5] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r10, r12, r14)
            goto L_0x07df
        L_0x07d2:
            com.tencent.mm.storage.v1 r4 = r8.f251812j
            long r12 = java.lang.System.currentTimeMillis()
            java.lang.Long r5 = java.lang.Long.valueOf(r12)
            r4.mo119677K(r1, r5)
        L_0x07df:
            if (r0 <= 0) goto L_0x07f4
            java.lang.String r4 = "MMKernel.CoreStorage"
            java.lang.String r5 = "summerinstall new install but version[%d] > 0"
            r10 = 1
            java.lang.Object[] r12 = new java.lang.Object[r10]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r10 = 0
            r12[r10] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r5, r12)
            goto L_0x07ff
        L_0x07f4:
            com.tencent.mm.storage.v1 r0 = r8.f251812j
            int r4 = qe3.C89625d.f257841g
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.mo119677K(r6, r4)
        L_0x07ff:
            java.lang.String r0 = "MMKernel.CoreStorage"
            java.lang.String r4 = "edw setAccUin, summerinstall time[%d]，version[%d], clientversion[%d]"
            r5 = 3
            java.lang.Object[] r10 = new java.lang.Object[r5]
            com.tencent.mm.storage.v1 r5 = r8.f251812j
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Object r1 = r5.mo119685f(r1, r2)
            java.lang.Long r1 = (java.lang.Long) r1
            r2 = 0
            r10[r2] = r1
            com.tencent.mm.storage.v1 r1 = r8.f251812j
            java.lang.Object r1 = r1.mo119685f(r6, r9)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r2 = 1
            r10[r2] = r1
            int r1 = qe3.C89625d.f257841g
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 2
            r10[r2] = r1
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r4, r10)
        L_0x082c:
            java.lang.String r0 = "%s:%s:%s"
            r1 = 3
            java.lang.Object[] r2 = new java.lang.Object[r1]
            long r3 = r8.f251819q
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r3 = 0
            r2[r3] = r1
            long r3 = r8.f251818p
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r3 = 1
            r2[r3] = r1
            long r3 = r8.f251820r
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r3 = 2
            r2[r3] = r1
            java.lang.String r1 = java.lang.String.format(r0, r2)
            f40.y r3 = f40.C86755y.f251837b
            zh3.f r0 = r8.f251811i
            zh3.a r0 = r0.f262817d
            boolean r0 = r0.f262807e
            java.lang.String r2 = r8.f251807e
            monitor-enter(r3)
            f40.v r4 = r3.f251838a     // Catch:{ all -> 0x0af7 }
            if (r4 != 0) goto L_0x0869
            f40.v r4 = new f40.v     // Catch:{ all -> 0x0af7 }
            r4.<init>(r2, r3)     // Catch:{ all -> 0x0af7 }
            r3.f251838a = r4     // Catch:{ all -> 0x0af7 }
            r4.startWatching()     // Catch:{ all -> 0x0af7 }
        L_0x0869:
            monitor-exit(r3)     // Catch:{ all -> 0x0af7 }
            if (r0 != 0) goto L_0x0871
            r3.mo121161e(r11, r1)
            goto L_0x0946
        L_0x0871:
            f40.o r0 = f40.C86709a0.m107535s()
            java.lang.String r0 = r0.mo121148o()
            if (r0 == 0) goto L_0x087d
            r0 = 1
            goto L_0x087e
        L_0x087d:
            r0 = 0
        L_0x087e:
            if (r0 == 0) goto L_0x0882
            r2 = 3
            goto L_0x08ec
        L_0x0882:
            java.io.File r0 = new java.io.File
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.io.File r2 = r2.getFilesDir()
            java.lang.String r4 = "identity_records"
            r0.<init>(r2, r4)
            r0.mkdirs()
            java.io.File r2 = new java.io.File
            r2.<init>(r0, r11)
            boolean r0 = r2.exists()
            if (r0 == 0) goto L_0x08a1
            r2 = 1
            goto L_0x08ec
        L_0x08a1:
            java.io.File r0 = r3.mo121157a()
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x08ac
            goto L_0x08e4
        L_0x08ac:
            java.io.File r0 = new java.io.File
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.io.File r2 = r2.getFilesDir()
            java.lang.String r4 = "identity_records"
            r0.<init>(r2, r4)
            boolean r2 = r0.exists()
            if (r2 == 0) goto L_0x08e1
            boolean r2 = r0.isDirectory()
            if (r2 == 0) goto L_0x08e1
            java.io.File[] r0 = r0.listFiles()
            if (r0 == 0) goto L_0x08e1
            r2 = 1
            java.lang.Object[] r4 = new java.lang.Object[r2]
            int r2 = r0.length
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5 = 0
            r4[r5] = r2
            java.lang.String r2 = "MicroMsg.FindOutDataDisappeared"
            java.lang.String r5 = "identity files count %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r5, r4)
            int r0 = r0.length
            goto L_0x08e2
        L_0x08e1:
            r0 = 0
        L_0x08e2:
            if (r0 <= 0) goto L_0x08e6
        L_0x08e4:
            r0 = 0
            goto L_0x08e7
        L_0x08e6:
            r0 = 1
        L_0x08e7:
            if (r0 == 0) goto L_0x08eb
            r2 = 2
            goto L_0x08ec
        L_0x08eb:
            r2 = 0
        L_0x08ec:
            if (r2 == 0) goto L_0x0943
            java.io.File r0 = r3.mo121157a()
            boolean r4 = r0.exists()
            java.lang.String r5 = ""
            if (r4 != 0) goto L_0x08fb
            goto L_0x090f
        L_0x08fb:
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ all -> 0x0906 }
            java.lang.String r0 = com.tencent.p014mm.vfs.C86013q1.m106432N(r0)     // Catch:{ all -> 0x0906 }
            r19 = r0
            goto L_0x0911
        L_0x0906:
            r0 = move-exception
            r4 = 0
            java.lang.Object[] r6 = new java.lang.Object[r4]
            java.lang.String r4 = "MicroMsg.FindOutDataDisappeared"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r5, r6)
        L_0x090f:
            r19 = r5
        L_0x0911:
            f40.x r0 = new f40.x
            r15 = r0
            r16 = r3
            r17 = r2
            r18 = r1
            r20 = r11
            r15.<init>(r16, r17, r18, r19, r20)
            r0.run()
            zt3.t r4 = zt3.C119157j.f356862d
            zt3.j r4 = (zt3.C119157j) r4
            r5 = 600000(0x927c0, double:2.964394E-318)
            r4.mo183878i(r0, r5)
            zt3.t r4 = zt3.C119157j.f356862d
            zt3.j r4 = (zt3.C119157j) r4
            r5 = 1800000(0x1b7740, double:8.89318E-318)
            r4.mo183878i(r0, r5)
            zt3.t r4 = zt3.C119157j.f356862d
            zt3.j r4 = (zt3.C119157j) r4
            r5 = 3600000(0x36ee80, double:1.7786363E-317)
            r4.mo183878i(r0, r5)
            r3.mo121159c(r2)
        L_0x0943:
            r3.mo121161e(r11, r1)
        L_0x0946:
            bp3.C79760s.m96909b()
            if (r24 != 0) goto L_0x09cc
            f40.C86709a0.m107528h()
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            r1 = 0
            r2 = 2
            java.lang.Object r0 = r0.mo119684e(r2, r1)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r1 = 0
            r2[r1] = r0
            java.lang.String r1 = "MMKernel.CoreAccount"
            java.lang.String r3 = "summerinit validateUsername username[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r3, r2)
            int r0 = r0.length()
            if (r0 > 0) goto L_0x09b1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "username of acc stg not set: uin="
            r0.append(r2)
            int r2 = r23.mo121110g()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            r1 = 1
            f251748x = r1
            r23.mo121103B()
            f40.e$e r0 = f251745u
            r1 = 0
            f40.C86718e.C86720e.m107577b(r0, r1)
            com.tencent.mm.sdk.platformtools.MMStack r0 = com.tencent.p014mm.sdk.platformtools.Util.getStack()
            java.lang.String r0 = r0.toString()
            f251746v = r0
            f40.f r0 = new f40.f
            r1 = r23
            r0.<init>(r1)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r0)
            r0 = 0
            goto L_0x09b4
        L_0x09b1:
            r1 = r23
            r0 = 1
        L_0x09b4:
            if (r0 != 0) goto L_0x09ce
            kj2.d r8 = kj2.C117407d.INSTANCE
            r9 = 598(0x256, double:2.955E-321)
            r11 = 21
            r13 = 1
            r15 = 1
            r8.idkeyStat(r9, r11, r13, r15)
            java.lang.String r0 = "MMKernel.CoreAccount"
            java.lang.String r2 = "setAccUin, validateUsername false no need initialize!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r2)
            goto L_0x0aa8
        L_0x09cc:
            r1 = r23
        L_0x09ce:
            java.lang.String r0 = "MMKernel.CoreAccount"
            java.lang.String r2 = "check is update :%b "
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            f40.o$f r5 = r1.f251754e
            boolean r5 = r5.f222289a
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r6 = 0
            r4[r6] = r5
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r2, r4)
            r1.f251758i = r3
            java.lang.String r0 = "invokeKernelExtensions"
            bp3.C79760s.m96908a(r0)
            java.lang.String r0 = "invokeKernelExtensions"
            int[] r2 = p787ai.C79546a.f233229a
            f40.C86739i0.m107600b(r0)
            r23.mo121118q()
            bp3.C79760s.m96909b()
            java.lang.String r0 = "notifyAccountInitialized"
            bp3.C79760s.m96908a(r0)
            boolean r0 = r1.f251757h
            if (r0 != 0) goto L_0x0a0a
            r23.mo121121v(r24)
            f40.e r0 = f40.C86709a0.m107523b()
            r0.mo121104C()
        L_0x0a0a:
            bp3.C79760s.m96909b()
            eb0.i3 r0 = eb0.C7624i3.f25910c
            java.lang.String r2 = "last_login_uin"
            java.lang.String r3 = p823sg.C77710q.m93738a(r7)
            r0.mo8756d(r2, r3)
            java.lang.Class<com.tencent.mm.plugin.zero.o> r0 = com.tencent.p014mm.plugin.zero.C30644o.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            com.tencent.mm.plugin.zero.o r0 = (com.tencent.p014mm.plugin.zero.C30644o) r0
            r0.mo57522b(r7)
            eb0.a r0 = new eb0.a
            r0.<init>()
            r1.f251753d = r0
            java.lang.String r0 = "MMKernel.CoreAccount"
            java.lang.String r2 = "setAccUin done :%s"
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r3 = p823sg.C77710q.m93738a(r7)
            r5 = 0
            r4[r5] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r2, r4)
            f40.C86709a0.m107528h()
            f40.g r0 = f40.C86709a0.m107529k()
            ob0.b0 r0 = r0.f251779b
            if (r0 == 0) goto L_0x0aa8
            f40.C86709a0.m107528h()
            f40.g r0 = f40.C86709a0.m107529k()
            ob0.b0 r0 = r0.f251779b
            com.tencent.mm.network.g r0 = r0.f256809d
            if (r0 == 0) goto L_0x0aa8
            f40.C86709a0.m107528h()
            f40.g r0 = f40.C86709a0.m107529k()
            ob0.b0 r0 = r0.f251779b
            com.tencent.mm.network.g r0 = r0.f256809d
            r2 = 1
            r0.mo55479j0(r2)
            f40.C86709a0.m107528h()
            f40.g r0 = f40.C86709a0.m107529k()
            ob0.b0 r0 = r0.f251779b
            com.tencent.mm.network.g r0 = r0.f256809d
            com.tencent.mm.network.e r0 = r0.mo55443A3()
            if (r7 == 0) goto L_0x0aa8
            if (r0 == 0) goto L_0x0aa8
            int r2 = r0.getUin()
            if (r7 == r2) goto L_0x0aa8
            java.lang.String r2 = "MMKernel.CoreAccount"
            java.lang.String r3 = "summerauth update acc info with acc stg: old acc uin=%d, this uin=%d"
            r4 = 2
            java.lang.Object[] r5 = new java.lang.Object[r4]
            int r4 = r0.getUin()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6 = 0
            r5[r6] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            r6 = 1
            r5[r6] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r2, r3, r5)
            kj2.d r8 = kj2.C117407d.INSTANCE
            r9 = 148(0x94, double:7.3E-322)
            r11 = 46
            r13 = 1
            r15 = 0
            r8.idkeyStat(r9, r11, r13, r15)
            r0.mo55425b(r7)
        L_0x0aa8:
            java.lang.String r0 = "MMKernel.CoreAccount"
            java.lang.String r2 = "start time check setUinImpl end total time %d"
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r21
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            r5 = 0
            r4[r5] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r2, r4)
            java.lang.String r0 = "MMKernel.CoreAccount"
            java.lang.String r2 = "mAccountStatus to AccountHasReady"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            r2 = 4
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r2 = p156gj.C87203t.m108273i()
            r0[r5] = r2
            gj.t$r r2 = p156gj.C87203t.f252887l
            java.lang.String r2 = r2.mo121645a()
            r3 = 1
            r0[r3] = r2
            gj.t$r r2 = p156gj.C87203t.f252888m
            java.lang.String r2 = r2.mo121645a()
            r3 = 2
            r0[r3] = r2
            gj.t$r r2 = p156gj.C87203t.f252882g
            java.lang.String r2 = r2.mo121645a()
            r3 = 3
            r0[r3] = r2
            java.lang.String r2 = "init DeviceInfo mmguild:%s, deviceId:%s, firstInstallTime:%s, androidId:%s"
            java.lang.String r0 = java.lang.String.format(r2, r0)
            java.lang.String r2 = "MicroMsg.DeviceInfo"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            return
        L_0x0af7:
            r0 = move-exception
            r1 = r23
        L_0x0afa:
            monitor-exit(r3)     // Catch:{ all -> 0x0afc }
            throw r0
        L_0x0afc:
            r0 = move-exception
            goto L_0x0afa
        L_0x0afe:
            r0 = move-exception
            r1 = r23
            r2.close()
            throw r0
        L_0x0b05:
            r1 = r23
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException
            java.lang.String r2 = "main db init failed"
            r0.<init>(r2)
            throw r0
        L_0x0b0f:
            r0 = move-exception
            r1 = r23
        L_0x0b12:
            monitor-exit(r2)     // Catch:{ all -> 0x0b16 }
            throw r0     // Catch:{ all -> 0x0b14 }
        L_0x0b14:
            r0 = move-exception
            goto L_0x0b1b
        L_0x0b16:
            r0 = move-exception
            goto L_0x0b12
        L_0x0b18:
            r0 = move-exception
            r1 = r23
        L_0x0b1b:
            monitor-exit(r2)
            throw r0
        L_0x0b1d:
            r0 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r0)
            throw r2
        L_0x0b24:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0b24 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f40.C86718e.mo121117p(boolean):void");
    }

    /* renamed from: q */
    public void mo121118q() {
        C80637z0.INSTANCE.mo112374e(C80637z0.C80646h.UNTIL_INVOKE_KERNEL_EXTENSION_BEGIN);
        Context context = MMApplicationContext.getContext();
        C31887k0 k0Var = C31887k0.INSTANCE;
        boolean[] zArr = k0Var.f84960e;
        boolean z = false;
        if (!zArr[0]) {
            synchronized (zArr) {
                boolean[] zArr2 = k0Var.f84960e;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    int nullAsNil = Util.nullAsNil((Integer) C86709a0.m107535s().mo121142i().mo119684e(14, (Object) null));
                    int i = C89625d.f257841g;
                    String nullAsNil2 = Util.nullAsNil((String) C86709a0.m107535s().mo121142i().mo119684e(93, (Object) null));
                    String str = BuildInfo.BUILD_RAND_ID;
                    boolean m = C86709a0.m107535s().mo121146m();
                    Log.m105925i("MicroMsg.StorageManager", "dispatchCreateCoreDBTable, prev_cv: %s, curr_cv: %s, prev_build_rand_id: %s, curr_build_rand_id: %s, has corrupted DB %s", Integer.valueOf(nullAsNil), Integer.valueOf(i), nullAsNil2, str, Boolean.valueOf(m));
                    boolean z2 = nullAsNil != i || !str.equals(nullAsNil2) || m;
                    synchronized (k0Var.f84959d) {
                        k0Var.f84959d[0] = z2;
                    }
                    if (BuildInfo.DEBUG || z2) {
                        ArrayList arrayList = new ArrayList();
                        C38166b.C38167a aVar = (C38166b.C38167a) C38166b.m41759f(C31887k0.C31890c.class);
                        C38166b.C38167a.C38169b bVar = new C38166b.C38167a.C38169b(aVar, aVar.f100837d.all().iterator());
                        while (bVar.hasNext()) {
                            arrayList.add(((C119157j) C119157j.f356862d).mo183870a(new C31885j0(k0Var, (C38174i) bVar.next())));
                        }
                        C79753e.m96889a(arrayList);
                    } else {
                        Log.m105928w("MicroMsg.StorageManager", "dispatchCreateCoreDBTable, not first startup, skip dispatching.");
                    }
                }
            }
        }
        C31887k0.INSTANCE.mo58409b(context);
        C31896o0 o0Var = C31896o0.INSTANCE;
        boolean[] zArr3 = o0Var.f84971d;
        if (!zArr3[0]) {
            synchronized (zArr3) {
                boolean[] zArr4 = o0Var.f84971d;
                if (!zArr4[0]) {
                    zArr4[0] = true;
                    int nullAsNil3 = Util.nullAsNil((Integer) C86709a0.m107535s().mo121142i().mo119684e(14, (Object) null));
                    int i2 = C89625d.f257841g;
                    Log.m105925i("MicroMsg.UpgradeManager", "dispatchClientUpgradedOnDemand, prev_cv: %s, curr_cv: %s", Integer.valueOf(nullAsNil3), Integer.valueOf(i2));
                    if (nullAsNil3 != i2) {
                        z = true;
                    }
                    if (!z) {
                        Log.m105928w("MicroMsg.UpgradeManager", "dispatchClientUpgradedOnDemand, not upgrade, skip dispatching.");
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        C38166b.C38167a aVar2 = (C38166b.C38167a) C38166b.m41759f(C31896o0.C31897a.class);
                        C38166b.C38167a.C38169b bVar2 = new C38166b.C38167a.C38169b(aVar2, aVar2.f100837d.all().iterator());
                        while (bVar2.hasNext()) {
                            arrayList2.add(((C119157j) C119157j.f356862d).mo183870a(new C31894n0(o0Var, (C38174i) bVar2.next(), nullAsNil3)));
                        }
                        C79753e.m96889a(arrayList2);
                    }
                }
            }
        }
        this.f251764o = true;
        C80637z0.INSTANCE.mo112374e(C80637z0.C80646h.UNTIL_INVOKE_KERNEL_EXTENSION_END);
    }

    @Deprecated
    /* renamed from: s */
    public boolean mo121119s() {
        return this.f251765p;
    }

    /* renamed from: t */
    public boolean mo121120t() {
        return (this.f251759j & 1) != 0;
    }

    /* renamed from: v */
    public void mo121121v(boolean z) {
        if (!this.f251758i) {
            Log.m105924i("MMKernel.CoreAccount", "no need do account initialized notify.");
            return;
        }
        this.f251758i = false;
        Log.m105925i("MMKernel.CoreAccount", "summerasyncinit onAccountInitialized tid:%d, stack[%s]", Long.valueOf(Thread.currentThread().getId()), Util.getStack());
        long currentTimeMillis = System.currentTimeMillis();
        C79760s.m96908a("accountModelOwner.onAccountInitialized");
        C45747a aVar = this.f251755f;
        aVar.f123612f.moveToCreateState();
        aVar.f123611e = new LifecycleScope("AccountScope", aVar, 4);
        C79760s.m96909b();
        this.f251750a.mo113297j(this.f251754e);
        if (z) {
            int[] iArr = C79546a.f233229a;
            C86739i0.m107600b("initializeAccountForActivatedServices-manual_login");
            C86312j.m106913e(true, true);
        }
        Log.m105925i("MMKernel.CoreAccount", "summerasyncinit onAccountInitialized run tid[%d] take[%d]ms", Long.valueOf(Thread.currentThread().getId()), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        mo121107b();
    }

    /* renamed from: w */
    public void mo121122w() {
        new MMHandler(Looper.getMainLooper()).post(new C31881a());
    }

    /* renamed from: x */
    public final void mo121123x() {
        Log.m105929w("MMKernel.CoreAccount", "account storage release  uin:%s thread:%s stack:%s", C77710q.m93738a(C86720e.m107576a(f251745u)), Thread.currentThread().getName(), Util.getStack());
        if (!mo121114l()) {
            Log.m105925i("MMKernel.CoreAccount", "Fatal crash error!!! status is not initialized when release(), this callStack is:%s, last reset stack is:%s", Util.getStack().toString(), f251746v);
            return;
        }
        C45747a aVar = this.f251755f;
        aVar.f123611e = null;
        aVar.f123612f.moveToDestroyState();
        this.f251750a.mo113298l();
        Application application = C86312j.f250984a;
        Set<C86301e> set = C86312j.f250989f;
        ArrayList arrayList = new ArrayList(set.size());
        boolean[] zArr = C86312j.f250992i;
        synchronized (zArr) {
            zArr[0] = true;
        }
        synchronized (set) {
            Throwable th = new Throwable();
            for (C86301e iVar : set) {
                arrayList.add(C86312j.f250986c.submit(new C86311i(iVar, th)));
            }
            C86312j.f250990g = false;
        }
        C86312j.m106921m(arrayList, true);
        C86709a0.m107528h();
        C86709a0.m107535s().mo121137c((String) null);
        mo121103B();
        C86709a0.m107528h();
        C86709a0.m107535s().f251817o.clear();
    }

    /* renamed from: y */
    public void mo121124y(C31461f3 f3Var) {
        Log.m105925i("MMKernel.CoreAccount", "UserStatusChange: remove %s", f3Var);
        synchronized (this.f251761l) {
            this.f251761l.remove(f3Var);
        }
    }
}
