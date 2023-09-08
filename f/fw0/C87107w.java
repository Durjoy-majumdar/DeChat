package fw0;

import android.app.Activity;
import android.app.Application;
import bc0.C67216a;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.hardcoder.C40318k;
import com.tencent.p014mm.p136ui.C85927s;
import com.tencent.p014mm.p136ui.MMAppMgr;
import com.tencent.p014mm.plugin.ipcall.C4611d;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.zero.C30630c;
import com.tencent.p014mm.plugin.zero.C85597u;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.sdk.platformtools.AndroidOSafety;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteTrace;
import com.tencent.xweb.file.XVFSFile;
import di3.C86301e;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C45629t0;
import eb0.C75569c4;
import ei3.C86522b;
import f40.C86709a0;
import f62.C75699i1;
import f62.C75700k0;
import f62.C75704m0;
import java.util.List;
import kj2.C117407d;
import nj3.C88990b;
import nr3.C35015b;
import p227rn.C48053v;
import p876cj.C67380a;
import p966fj.C86869a;
import pd3.C89346a;
import rb0.C47984k;
import sb0.C48340e;
import zc2.C79318h;

@C86522b(dependencies = {C85597u.class, C30630c.class}, onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND, C80625v0.MATCH_TOOLS, C80625v0.MATCH_PUSH, C80625v0.MATCH_SUPPORT, C80625v0.MATCH_SANDBOX, C80625v0.MATCH_EXDEVICE, C80625v0.MATCH_PATCH})
/* renamed from: fw0.w */
public class C87107w extends C86301e {

    /* renamed from: f */
    public static final MMAppMgr f252708f = new MMAppMgr();

    /* renamed from: d */
    public Application f252709d;

    /* renamed from: e */
    public C45814j f252710e = new C45814j();

    /* renamed from: fw0.w$c */
    public class C75813c implements C67380a {
        public C75813c(C87107w wVar) {
        }

        /* renamed from: a */
        public String mo106106a(C72963f4 f4Var) {
            return ((C48053v) C86312j.m106911c(C48053v.class)).mo72614OE(f4Var.mo108768t()) ? C48340e.m53666g(f4Var.f230724G) : C75569c4.m90672e((C72963f4) null);
        }

        /* renamed from: b */
        public String mo106107b(String str, int i) {
            if (!((C48053v) C86312j.m106911c(C48053v.class)).mo72614OE(str)) {
                return C75569c4.m90672e((C72963f4) null);
            }
            return C48340e.m53666g(((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00((long) i).f230724G);
        }

        /* renamed from: c */
        public void mo106108c(C72963f4 f4Var) {
            if (((C48053v) C86312j.m106911c(C48053v.class)).mo72614OE(f4Var.mo108768t())) {
                f4Var.mo101012p4(C48340e.m53669j());
            } else {
                f4Var.mo101012p4(C75569c4.m90672e((C72963f4) null));
            }
        }
    }

    /* renamed from: fw0.w$f */
    public class C75814f implements C67216a.C67219b {
        public C75814f(C87107w wVar) {
        }
    }

    /* renamed from: fw0.w$h */
    public class C75815h implements C75704m0 {
        public C75815h(C87107w wVar) {
        }

        /* renamed from: a */
        public String mo106109a(C72963f4 f4Var) {
            if (!(f4Var.mo108759l2() != -1 && ((C48053v) C86312j.m106911c(C48053v.class)).mo72614OE(f4Var.mo108768t()))) {
                return f4Var.mo108768t();
            }
            String str = f4Var.mo108768t() + XVFSFile.PATH_SEPARATOR + f4Var.mo108759l2();
            Log.m105919d("MicroMsg.PluginBigBallOfMud", "mapNotifyInfo key:%s", str);
            return str;
        }
    }

    /* renamed from: fw0.w$i */
    public class C75816i implements C45629t0.C45630a {
        public C75816i(C87107w wVar) {
        }

        /* renamed from: a */
        public boolean mo71148a(String str, String str2, PInt pInt) {
            Class cls = C48053v.class;
            if (!C45628s0.m50738C(str)) {
                return false;
            }
            if (((C48053v) C86312j.m106911c(cls)).mo72614OE(str)) {
                if (C48340e.m53675p(str2)) {
                    pInt.value = 5;
                    return true;
                }
                pInt.value = 4;
                return true;
            } else if (C47984k.m53335i(str)) {
                pInt.value = 3;
                return true;
            } else if (((C48053v) C86312j.m106911c(cls)).mo72617gl(str)) {
                pInt.value = 0;
                return true;
            } else if (C47984k.m53340n(str)) {
                pInt.value = 6;
                return true;
            } else {
                pInt.value = 7;
                return true;
            }
        }
    }

    /* renamed from: fw0.w$j */
    public class C75817j implements C35015b<C75699i1> {
        public C75817j(C87107w wVar) {
        }

        public Object get() {
            return new C79318h(false);
        }
    }

    /* renamed from: fw0.w$a */
    public class C87108a implements C89346a {
        public C87108a(C87107w wVar) {
        }

        /* renamed from: a */
        public boolean mo121562a(int i) {
            return i == 39 && !C4611d.m4902a();
        }
    }

    /* renamed from: fw0.w$b */
    public class C87109b implements C85927s.C85928a {
        public C87109b(C87107w wVar) {
        }
    }

    /* renamed from: fw0.w$d */
    public class C87110d implements C86869a.C86871b {
        public C87110d(C87107w wVar) {
        }

        /* renamed from: a */
        public void mo121332a(int i, Object... objArr) {
            C115669n.INSTANCE.mo160131h(i, objArr);
        }

        /* renamed from: b */
        public void mo121333b(long j, long j2, long j3, boolean z) {
            C115669n.INSTANCE.idkeyStat(j, j2, j3, z);
        }
    }

    /* renamed from: fw0.w$e */
    public class C87111e implements AndroidOSafety.ISafetyCallback {
        public C87111e(C87107w wVar) {
        }

        public void invokeToOpaque(Activity activity) {
            C88990b.m111193b(activity);
        }

        public void reportState(int i, Activity activity) {
            C117407d.INSTANCE.idkeyStat(1221, (long) i, 1, false);
        }

        public boolean supportSwipe(Activity activity) {
            return (C88990b.m111195d(activity.getClass()) & 1) == 0;
        }
    }

    /* renamed from: fw0.w$g */
    public class C87112g implements SQLiteTrace {
        public C87112g(C87107w wVar) {
        }

        public void onConnectionObtained(SQLiteDatabase sQLiteDatabase, String str, long j, boolean z) {
        }

        public void onConnectionPoolBusy(SQLiteDatabase sQLiteDatabase, String str, long j, boolean z, List<SQLiteTrace.TraceInfo<String>> list, List<SQLiteTrace.TraceInfo<StackTraceElement[]>> list2) {
            C40318k.m43492a().startPerformance(C40318k.m43492a().getHcDBEnable(), C40318k.m43492a().getHcDBDelayWrite(), C40318k.m43492a().getHcDBCPU(), C40318k.m43492a().getHcDBIO(), C40318k.m43492a().getHcDBThr() ? C86709a0.m107525e().getProcessTid() : 0, C40318k.m43492a().getHcDBTimeoutBusy(), 501, C40318k.m43492a().getHcDBActionWrite(), "MicroMsg.PluginBigBallOfMud");
        }

        public void onDatabaseCorrupted(SQLiteDatabase sQLiteDatabase) {
        }

        public void onSQLExecuted(SQLiteDatabase sQLiteDatabase, String str, int i, long j) {
        }
    }

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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x01fa  */
    public void onCreate(android.content.Context r12) {
        /*
            r11 = this;
            java.lang.Class<f62.x0> r0 = f62.C75710x0.class
            super.onCreate(r12)
            fw0.w$b r12 = new fw0.w$b
            r12.<init>(r11)
            com.tencent.p014mm.p136ui.C85927s.f250292a = r12
            com.tencent.mm.booter.i r12 = new com.tencent.mm.booter.i
            r12.<init>()
            com.tencent.p014mm.booter.MMReceivers$ToolsProcessReceiver.f237512a = r12
            com.tencent.mm.booter.h r12 = new com.tencent.mm.booter.h
            r12.<init>()
            com.tencent.p014mm.booter.MMReceivers$SandBoxProcessReceiver.f237511a = r12
            java.lang.Class<jc3.i> r12 = jc3.C87948i.class
            di3.d r12 = di3.C86312j.m106911c(r12)
            jc3.i r12 = (jc3.C87948i) r12
            fw0.o r1 = new fw0.o
            r1.<init>()
            r12.Mm0(r1)
            fw0.t r1 = new fw0.t
            r1.<init>()
            r12.ee0(r1)
            fw0.g r1 = new fw0.g
            r1.<init>()
            r12.mo119064bM(r1)
            java.lang.String r1 = "MicroMsg.PluginBigBallOfMud"
            java.lang.String r2 = "zero %s"
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r5 = 0
            r4[r5] = r12
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r4)
            com.tencent.tinker.entry.ApplicationLike r12 = com.tencent.p014mm.app.C80589e.f235760a
            android.app.Application r12 = r12.getApplication()
            r11.f252709d = r12
            java.lang.String r1 = "MicroMsg.PluginBigBallOfMud"
            java.lang.String r2 = "app. %s"
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r4[r5] = r12
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r4)
            android.app.Application r12 = r11.f252709d
            com.tencent.mm.modelstat.f r1 = com.tencent.p014mm.modelstat.C81027f.m98943c()
            com.tencent.mm.modelstat.f$b r1 = r1.f238000a
            r12.registerActivityLifecycleCallbacks(r1)
            java.lang.String r12 = "MicroMsg.PluginBigBallOfMud"
            java.lang.String r1 = "ClickFlowStatSender registerActivityLifeCycle"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r1)
            long r1 = java.lang.System.currentTimeMillis()
            hj.e r12 = new hj.e
            r12.<init>()
            android.app.Application r4 = r11.f252709d
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getProcessName()
            r7 = 0
            if (r6 == 0) goto L_0x0085
            int r8 = r6.length()
            if (r8 > 0) goto L_0x00a3
        L_0x0085:
            java.lang.String r6 = "ProfileFactoryImp_handlerThread"
            mu3.a r6 = mu3.C109639a.m148950a(r6)
            hj.d r8 = new hj.d
            r9 = 2000(0x7d0, double:9.88E-321)
            r8.<init>(r12, r9, r7)
            com.tencent.mm.sdk.platformtools.MMHandler r12 = new com.tencent.mm.sdk.platformtools.MMHandler
            r12.<init>((mu3.C109639a) r6)
            java.lang.Object r12 = r8.exec(r12)
            java.lang.String r12 = (java.lang.String) r12
            mu3.d r6 = r6.f328238b
            r6.mo182313f()
            r6 = r12
        L_0x00a3:
            java.lang.String r12 = "MicroMsg.ProfileFactoryImpl"
            if (r6 != 0) goto L_0x00af
            java.lang.String r4 = "get process name failed, retry later"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r4)
        L_0x00ac:
            r4 = r7
            goto L_0x0185
        L_0x00af:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getPackageName()
            r8.append(r9)
            java.lang.String r9 = ":tools"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            boolean r8 = r6.startsWith(r8)
            if (r8 == 0) goto L_0x00d2
            java.lang.String r8 = ".app.ToolsProfile"
            hj.c r4 = p977hj.C87530e.m108861a(r4, r8)
            goto L_0x017c
        L_0x00d2:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getPackageName()
            r8.append(r9)
            java.lang.String r9 = ":sandbox"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            boolean r8 = r6.equals(r8)
            if (r8 == 0) goto L_0x00f5
            java.lang.String r8 = ".app.SandBoxProfile"
            hj.c r4 = p977hj.C87530e.m108861a(r4, r8)
            goto L_0x017c
        L_0x00f5:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getPackageName()
            r8.append(r9)
            java.lang.String r9 = ":exdevice"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            boolean r8 = r6.equals(r8)
            if (r8 == 0) goto L_0x0117
            java.lang.String r8 = ".app.ExDeviceProfile"
            hj.c r4 = p977hj.C87530e.m108861a(r4, r8)
            goto L_0x017c
        L_0x0117:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getPackageName()
            r8.append(r9)
            java.lang.String r9 = ":patch"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            boolean r8 = r6.equals(r8)
            if (r8 == 0) goto L_0x0139
            java.lang.String r8 = ".app.PatchProfile"
            hj.c r4 = p977hj.C87530e.m108861a(r4, r8)
            goto L_0x017c
        L_0x0139:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getPackageName()
            r8.append(r9)
            java.lang.String r9 = ":appbrand"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            boolean r8 = r6.startsWith(r8)
            if (r8 == 0) goto L_0x015b
            java.lang.String r8 = ".app.AppBrandProfile"
            hj.c r4 = p977hj.C87530e.m108861a(r4, r8)
            goto L_0x017c
        L_0x015b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getPackageName()
            r8.append(r9)
            java.lang.String r9 = ":support"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            boolean r8 = r6.startsWith(r8)
            if (r8 == 0) goto L_0x00ac
            java.lang.String r8 = ".app.SupportProfile"
            hj.c r4 = p977hj.C87530e.m108861a(r4, r8)
        L_0x017c:
            java.lang.Object[] r8 = new java.lang.Object[r3]
            r8[r5] = r6
            java.lang.String r6 = "application started, profile = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r12, r6, r8)
        L_0x0185:
            if (r4 == 0) goto L_0x0197
            boolean r12 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess()
            if (r12 != 0) goto L_0x0197
            java.lang.String r12 = "MicroMsg.PluginBigBallOfMud"
            java.lang.String r6 = "before profile oncreate."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r6)
            r4.mo112236a()
        L_0x0197:
            java.lang.String r12 = "MicroMsg.PluginBigBallOfMud"
            java.lang.String r4 = "after profile oncreate."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r4)
            android.app.Application r12 = r11.f252709d
            android.content.Context r12 = r12.getApplicationContext()
            com.tencent.p014mm.app.C80593h.m98211a(r12)
            android.app.Application r12 = r11.f252709d
            java.lang.String r4 = "system_config_prefs"
            android.content.SharedPreferences r12 = r12.getSharedPreferences(r4, r5)
            if (r12 == 0) goto L_0x01b9
            java.lang.String r4 = "default_uin"
            int r12 = r12.getInt(r4, r5)
            goto L_0x01ba
        L_0x01b9:
            r12 = 0
        L_0x01ba:
            java.lang.String r4 = "MicroMsg.PluginBigBallOfMud"
            java.lang.String r6 = "APPonCreate proc:%s time:%d (loader:%d) ueh:%d data[%s] sdcard[%s]"
            r8 = 6
            java.lang.Object[] r8 = new java.lang.Object[r8]
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getProcessName()
            r8[r5] = r9
            long r9 = com.tencent.p014mm.app.C80589e.f235761b
            long r9 = com.tencent.p014mm.sdk.platformtools.Util.milliSecondsToNow(r9)
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            r8[r3] = r9
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.milliSecondsToNow(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 2
            r8[r2] = r1
            r1 = 3
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r8[r1] = r12
            java.lang.String r12 = com.tencent.p014mm.storage.C72994y1.f212832a
            r1 = 4
            r8[r1] = r12
            java.lang.String r12 = a70.C112760b.m154230f0()
            r9 = 5
            r8[r9] = r12
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r6, r8)
            boolean r12 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess()
            if (r12 == 0) goto L_0x0201
            fw0.w$c r12 = new fw0.w$c
            r12.<init>(r11)
            p876cj.C67380a.C67381a.f193260a = r12
        L_0x0201:
            fw0.w$d r12 = new fw0.w$d
            r12.<init>(r11)
            java.lang.Class<fj.a> r4 = p966fj.C86869a.class
            monitor-enter(r4)
            p966fj.C86869a.f252160e = r12     // Catch:{ all -> 0x04aa }
            monitor-exit(r4)
            fw0.w$e r12 = new fw0.w$e
            r12.<init>(r11)
            com.tencent.p014mm.sdk.platformtools.AndroidOSafety.setISafetyCallback(r12)
            boolean r12 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess()
            if (r12 == 0) goto L_0x04a9
            fw0.w$f r12 = new fw0.w$f
            r12.<init>(r11)
            bc0.C67216a.f193009g = r12
            fw0.w$g r12 = new fw0.w$g
            r12.<init>(r11)
            zh3.C119118e.f356736p = r12
            fw0.w$h r12 = new fw0.w$h
            r12.<init>(r11)
            com.tencent.p014mm.storage.C72959e.f212647b = r12
            fw0.w$i r12 = new fw0.w$i
            r12.<init>(r11)
            eb0.C45629t0.m50814a(r12)
            fw0.w$j r12 = new fw0.w$j
            r12.<init>(r11)
            f62.C75701k1.f222304b = r12
            pc0.b r12 = new pc0.b
            r12.<init>()
            r4 = 69
            f62.C75694f1.C75695a.m90941a(r4, r12)
            r4 = 68
            f62.C75694f1.C75695a.m90941a(r4, r12)
            r4 = 22
            f62.C75694f1.C75695a.m90941a(r4, r12)
            r4 = 13
            f62.C75694f1.C75695a.m90941a(r4, r12)
            r4 = 15
            f62.C75694f1.C75695a.m90941a(r4, r12)
            r4 = 23
            f62.C75694f1.C75695a.m90941a(r4, r12)
            r4 = 25
            f62.C75694f1.C75695a.m90941a(r4, r12)
            r4 = 24
            f62.C75694f1.C75695a.m90941a(r4, r12)
            r4 = 33
            f62.C75694f1.C75695a.m90941a(r4, r12)
            r4 = 35
            f62.C75694f1.C75695a.m90941a(r4, r12)
            r4 = 44
            f62.C75694f1.C75695a.m90941a(r4, r12)
            r4 = 999999(0xf423f, float:1.401297E-39)
            f62.C75694f1.C75695a.m90941a(r4, r12)
            r4 = 53
            f62.C75694f1.C75695a.m90941a(r4, r12)
            r4 = 204(0xcc, float:2.86E-43)
            f62.C75694f1.C75695a.m90941a(r4, r12)
            r4 = 219(0xdb, float:3.07E-43)
            f62.C75694f1.C75695a.m90941a(r4, r12)
            fw0.d r12 = new fw0.d
            r12.<init>()
            java.lang.Class<f62.d0> r4 = f62.C31926d0.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            f62.d0 r4 = (f62.C31926d0) r4
            r4.bx0(r12)
            ob0.b0 r4 = f40.C86709a0.m107524d()
            r6 = 681(0x2a9, float:9.54E-43)
            r4.mo123455a(r6, r12)
            java.lang.Class<md3.b> r12 = md3.C47001b.class
            fw0.j r4 = r11.f252710e
            f40.C86709a0.m107532n(r12, r4)
            fw0.q r12 = new fw0.q
            r12.<init>()
            f62.C75701k1.m90961a(r9, r12)
            fw0.a0 r12 = new fw0.a0
            r12.<init>()
            f62.C75701k1.m90961a(r3, r12)
            fw0.i r12 = new fw0.i
            r12.<init>()
            f62.C75701k1.m90961a(r1, r12)
            java.lang.Class<su0.e> r12 = su0.C36833e.class
            di3.d r12 = di3.C86312j.m106911c(r12)
            su0.e r12 = (su0.C36833e) r12
            fw0.b r1 = new fw0.b
            r1.<init>()
            r12.mo60841CI(r1)
            fw0.r r12 = new fw0.r
            r12.<init>()
            di3.d r1 = di3.C86312j.m106911c(r0)
            f62.x0 r1 = (f62.C75710x0) r1
            r1.lk0(r12)
            di3.d r1 = di3.C86312j.m106911c(r0)
            f62.x0 r1 = (f62.C75710x0) r1
            r1.mo106032eK(r12)
            di3.d r12 = di3.C86312j.m106911c(r0)
            f62.x0 r12 = (f62.C75710x0) r12
            fw0.h r0 = new fw0.h
            r0.<init>()
            r12.mo106029Al(r0)
            fw0.c r12 = new fw0.c
            r12.<init>()
            eb0.f$$c r0 = eb0.C75573f.f222005d
            r0.add(r12)
            com.tencent.mm.permission.PermissionMgr r12 = new com.tencent.mm.permission.PermissionMgr
            r12.<init>()
            com.tencent.mm.plugin.bbom.PostSyncTaskDeprecatedListener r12 = new com.tencent.mm.plugin.bbom.PostSyncTaskDeprecatedListener
            r12.<init>()
            r12.alive()
            ob0.b0 r12 = f40.C86709a0.m107524d()
            fw0.s r0 = fw0.C75810s.f222430d
            r1 = 138(0x8a, float:1.93E-43)
            r12.mo123470p(r1, r0)
            ob0.b0 r12 = f40.C86709a0.m107524d()
            fw0.s r0 = fw0.C75810s.f222430d
            r4 = 39
            r12.mo123470p(r4, r0)
            ob0.b0 r12 = f40.C86709a0.m107524d()
            fw0.s r0 = fw0.C75810s.f222430d
            r6 = 268369922(0xfff0002, float:2.5144944E-29)
            r12.mo123470p(r6, r0)
            fw0.s r12 = fw0.C75810s.f222430d
            if (r12 != 0) goto L_0x0340
            fw0.s r12 = new fw0.s
            r12.<init>()
            fw0.C75810s.f222430d = r12
        L_0x0340:
            ob0.b0 r12 = f40.C86709a0.m107524d()
            fw0.s r0 = fw0.C75810s.f222430d
            r12.mo123455a(r1, r0)
            ob0.b0 r12 = f40.C86709a0.m107524d()
            fw0.s r0 = fw0.C75810s.f222430d
            r12.mo123455a(r4, r0)
            ob0.b0 r12 = f40.C86709a0.m107524d()
            fw0.s r0 = fw0.C75810s.f222430d
            r12.mo123455a(r6, r0)
            android.app.Application r12 = r11.f252709d
            java.lang.Class<fw0.v> r0 = fw0.C87106v.class
            monitor-enter(r0)
            boolean r1 = fw0.C87106v.f252707a     // Catch:{ all -> 0x04a6 }
            if (r1 == 0) goto L_0x0366
            monitor-exit(r0)
            goto L_0x0375
        L_0x0366:
            fw0.C87106v.f252707a = r3     // Catch:{ all -> 0x04a6 }
            f40.g r1 = f40.C86709a0.m107529k()     // Catch:{ all -> 0x04a6 }
            fw0.u r6 = new fw0.u     // Catch:{ all -> 0x04a6 }
            r6.<init>(r12)     // Catch:{ all -> 0x04a6 }
            r1.mo121126a(r6)     // Catch:{ all -> 0x04a6 }
            monitor-exit(r0)
        L_0x0375:
            eb0.f0 r12 = new eb0.f0
            r12.<init>()
            java.lang.String r0 = "delchatroommember"
            sc0.C36652a.C36653a.m41027b(r0, r12)
            eb0.g0 r12 = new eb0.g0
            r12.<init>()
            java.lang.String r0 = "NewXmlChatRoomAccessVerifyApplication"
            sc0.C36652a.C36653a.m41027b(r0, r12)
            eb0.h0 r12 = new eb0.h0
            r12.<init>()
            java.lang.String r0 = "NewXmlChatRoomAccessVerifyApproval"
            sc0.C36652a.C36653a.m41027b(r0, r12)
            eb0.i0 r12 = new eb0.i0
            r12.<init>()
            java.lang.String r0 = "NewXmlOpenIMChatRoomAddChatRoomMemberApplication"
            sc0.C36652a.C36653a.m41027b(r0, r12)
            eb0.j0 r12 = new eb0.j0
            r12.<init>()
            java.lang.String r0 = "NewXmlOpenIMChatRoomAddChatRoomMemberApplicationApproved"
            sc0.C36652a.C36653a.m41027b(r0, r12)
            eb0.k0 r12 = new eb0.k0
            r12.<init>()
            java.lang.String r0 = "FinderPersonalMsgSysMsg"
            sc0.C36652a.C36653a.m41027b(r0, r12)
            kk3.c r12 = new kk3.c
            r12.<init>()
            java.lang.String r0 = "invokeMessage"
            sc0.C36652a.C36653a.m41027b(r0, r12)
            kk3.d r12 = new kk3.d
            r12.<init>()
            java.lang.String r0 = "NewXmlOpenIMFriReqAcceptedInWxWork"
            sc0.C36652a.C36653a.m41027b(r0, r12)
            eb0.m4 r12 = new eb0.m4
            r12.<init>()
            java.lang.String r0 = "reportbizlocation"
            sc0.C36652a.C36653a.m41027b(r0, r12)
            eb0.w r12 = new eb0.w
            r12.<init>()
            java.lang.String r0 = "biz_services_mute"
            sc0.C36652a.C36653a.m41027b(r0, r12)
            com.tencent.mm.ui.MMAppMgr r12 = f252708f
            android.app.Application r0 = r11.f252709d
            com.tencent.mm.ui.MMAppMgr$Receiver r1 = r12.f214419c
            if (r1 != 0) goto L_0x03e9
            com.tencent.mm.ui.MMAppMgr$Receiver r1 = new com.tencent.mm.ui.MMAppMgr$Receiver
            r1.<init>(r12)
            r12.f214419c = r1
        L_0x03e9:
            com.tencent.p014mm.p136ui.MMActivity.setMainProcess()
            android.content.IntentFilter r1 = new android.content.IntentFilter
            r1.<init>()
            java.lang.String r6 = "com.tencent.mm.ui.ACTION_ACTIVE"
            r1.addAction(r6)
            java.lang.String r6 = "com.tencent.mm.ui.ACTION_DEACTIVE"
            r1.addAction(r6)
            java.lang.String r6 = "com.tencent.mm.sandbox.updater.intent.ACTION_EXIT_APP"
            r1.addAction(r6)
            java.lang.String r6 = "com.tencent.mm.sandbox.updater.intent.ACTION_UPDATE"
            r1.addAction(r6)
            java.lang.String r6 = "MINIQB_OPEN_RET"
            r1.addAction(r6)
            com.tencent.mm.ui.MMAppMgr$Receiver r12 = r12.f214419c
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.WeChatPermissions.PERMISSION_MM_MESSAGE()
            r0.registerReceiver(r12, r1, r6, r7)
            android.content.Context r12 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.ComponentName r12 = com.tencent.p014mm.sdk.platformtools.Util.getTopActivity(r12)
            if (r12 == 0) goto L_0x0454
            java.lang.String r0 = r12.getPackageName()
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getPackageName()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0454
            java.lang.String r0 = r12.getClassName()
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getLaunchName()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0454
            com.tencent.p014mm.app.C80610p1.f235825g = r3
            com.tencent.p014mm.app.C80610p1.f235826h = r3
            java.lang.String r0 = "MicroMsg.PluginBigBallOfMud"
            java.lang.String r1 = "start time check currentActivity.getPackageName() :%s, currentActivity.getClassName(): %s"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r6 = r12.getPackageName()
            r2[r5] = r6
            java.lang.String r12 = r12.getClassName()
            r2[r3] = r12
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r2)
            goto L_0x0487
        L_0x0454:
            if (r12 == 0) goto L_0x046d
            java.lang.String r0 = "MicroMsg.PluginBigBallOfMud"
            java.lang.String r1 = "start time check onCreate appOnCreate currentActivity.getPackageName() :%s, currentActivity.getClassName(): %s"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r6 = r12.getPackageName()
            r2[r5] = r6
            java.lang.String r5 = r12.getClassName()
            r2[r3] = r5
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r2)
            goto L_0x0475
        L_0x046d:
            java.lang.String r0 = "MicroMsg.PluginBigBallOfMud"
            java.lang.String r1 = "start time check onCreate appOnCreate currentActivity == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
        L_0x0475:
            if (r12 == 0) goto L_0x0487
            java.lang.String r12 = r12.getPackageName()
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getPackageName()
            boolean r12 = r12.equals(r0)
            if (r12 != 0) goto L_0x0487
            com.tencent.p014mm.app.C80610p1.f235825g = r3
        L_0x0487:
            java.lang.String r12 = "mm"
            android.content.Intent r0 = ke3.C88144b.m109786e(r12)
            com.tencent.p014mm.service.C116024c.m163163c(r12, r3, r0)
            java.lang.Class<zo.f> r12 = p407zo.C23546f.class
            di3.d r12 = di3.C86312j.m106911c(r12)
            zo.f r12 = (p407zo.C23546f) r12
            r12.init()
            fw0.w$a r12 = new fw0.w$a
            r12.<init>(r11)
            android.util.SparseArray<pd3.a> r0 = com.tencent.p014mm.pluginsdk.res.downloader.checkresupdate.C115894p.f347753f
            r0.put(r4, r12)
            goto L_0x04a9
        L_0x04a6:
            r12 = move-exception
            monitor-exit(r0)
            throw r12
        L_0x04a9:
            return
        L_0x04aa:
            r12 = move-exception
            monitor-exit(r4)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: fw0.C87107w.onCreate(android.content.Context):void");
    }
}
