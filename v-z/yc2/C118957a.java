package yc2;

import android.app.ActivityManager;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import ce2.C28545b;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import oa1.C117731d;
import p206nj.C88956h;
import yc2.C118965e;

/* renamed from: yc2.a */
public final class C118957a implements C118965e.C118974g {

    /* renamed from: i */
    public static final C118959b<String> f356329i;

    /* renamed from: a */
    public long f356330a = 0;

    /* renamed from: b */
    public long f356331b = 0;

    /* renamed from: c */
    public long f356332c = 0;

    /* renamed from: d */
    public long f356333d = 0;

    /* renamed from: e */
    public long f356334e = 0;

    /* renamed from: f */
    public int f356335f = 0;

    /* renamed from: g */
    public boolean f356336g = false;

    /* renamed from: h */
    public long f356337h = 0;

    /* renamed from: yc2.a$b */
    public static final class C118959b<T> extends HashSet<T> {
        public C118959b(C118958a aVar) {
        }

        public boolean add(T t) {
            if (!contains(t)) {
                return super.add(t);
            }
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            throw new UnsupportedOperationException();
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: yc2.a$c */
    public static final class C118960c {

        /* renamed from: a */
        public static final C118957a f356338a = new C118957a((C118958a) null);
    }

    /* renamed from: yc2.a$d */
    public static final class C118961d {
        /* renamed from: a */
        public static boolean m167726a() {
            Class<C118961d> cls = C118961d.class;
            StringBuilder sb = new StringBuilder();
            try {
                sb.append(C28545b.m38262a("¸¸¼µ±·»²¿¾§¼ ¹¦©©¤« ¡"));
                String sb4 = sb.toString();
                sb.delete(0, sb.length());
                sb.append(((cls.hashCode() >>> 31) | 1) ^ 1);
                return !sb.toString().equals(C118957a.m167719c(sb4, sb.toString()));
            } catch (Throwable unused) {
                String sb5 = sb.toString();
                sb.delete(0, sb.length());
                sb.append(((cls.hashCode() >>> 31) | 1) ^ 1);
                return !sb.toString().equals(C118957a.m167719c(sb5, sb.toString()));
            }
        }

        /* renamed from: b */
        public static boolean m167727b() {
            Class<C118961d> cls = C118961d.class;
            StringBuilder sb = new StringBuilder();
            try {
                sb.append(C28545b.m38262a("µ»¹²´´¤¯¼» ¹­¶µ°µº®"));
                String sb4 = sb.toString();
                sb.delete(0, sb.length());
                sb.append(((cls.hashCode() >>> 31) | 1) ^ 1);
                return !sb.toString().equals(C118957a.m167719c(sb4, sb.toString()));
            } catch (Throwable unused) {
                String sb5 = sb.toString();
                sb.delete(0, sb.length());
                sb.append(((cls.hashCode() >>> 31) | 1) ^ 1);
                return !sb.toString().equals(C118957a.m167719c(sb5, sb.toString()));
            }
        }
    }

    static {
        C118959b<String> bVar = new C118959b<>((C118958a) null);
        f356329i = bVar;
        bVar.add("");
        bVar.add(":tools");
        bVar.add(":appbrand0");
        bVar.add(":appbrand1");
        bVar.add(":appbrand2");
        bVar.add(":appbrand3");
        bVar.add(":appbrand4");
    }

    public C118957a(C118958a aVar) {
        synchronized (this) {
            DataInputStream dataInputStream = null;
            try {
                DataInputStream dataInputStream2 = new DataInputStream(new BufferedInputStream(new FileInputStream(new File(MMApplicationContext.getContext().getCacheDir(), C118978g.m167742b("ãçÜºÈ­Üòù")))));
                try {
                    if (((long) dataInputStream2.readInt()) == -606158847) {
                        this.f356330a = dataInputStream2.readLong();
                        this.f356331b = dataInputStream2.readLong();
                        this.f356332c = dataInputStream2.readLong();
                        this.f356333d = dataInputStream2.readLong();
                        long readLong = dataInputStream2.readLong();
                        if (readLong > 0 && this.f356334e <= 0) {
                            this.f356334e = readLong;
                        }
                        Util.qualityClose(dataInputStream2);
                    } else {
                        throw new IllegalStateException("bad magic.");
                    }
                } catch (Throwable th) {
                    th = th;
                    dataInputStream = dataInputStream2;
                    try {
                        Log.printErrStackTrace("MircoMsg.AEDHLP", th, "[tomys] failure to load rec.", new Object[0]);
                        this.f356330a = 0;
                        this.f356331b = 0;
                        this.f356332c = 0;
                        this.f356333d = System.currentTimeMillis();
                        this.f356334e = 0;
                        mo183641g();
                    } finally {
                        Util.qualityClose(dataInputStream);
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                Log.printErrStackTrace("MircoMsg.AEDHLP", th, "[tomys] failure to load rec.", new Object[0]);
                this.f356330a = 0;
                this.f356331b = 0;
                this.f356332c = 0;
                this.f356333d = System.currentTimeMillis();
                this.f356334e = 0;
                mo183641g();
            }
        }
    }

    /* renamed from: c */
    public static String m167719c(String str, String str2) {
        return C117731d.m166007c().mo182444f(str, str2, false, true);
    }

    /* renamed from: d */
    public static String m167720d(int i) {
        ActivityManager activityManager = (ActivityManager) MMApplicationContext.getContext().getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        if (activityManager == null) {
            return "";
        }
        try {
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
            if (runningAppProcesses != null) {
                for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                    if (next.pid == i) {
                        return next.processName;
                    }
                }
            }
        } catch (Throwable th) {
            Log.printErrStackTrace("MircoMsg.AEDHLP", th, "[tomys] failure on step1.", new Object[0]);
        }
        try {
            List<ActivityManager.RunningServiceInfo> runningServices = activityManager.getRunningServices(16384);
            if (runningServices != null) {
                for (ActivityManager.RunningServiceInfo next2 : runningServices) {
                    if (next2.pid == i) {
                        return next2.process;
                    }
                }
            }
        } catch (Throwable th4) {
            Log.printErrStackTrace("MircoMsg.AEDHLP", th4, "[tomys] failure on step2.", new Object[0]);
        }
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(String.format(Locale.ENGLISH, C118978g.m167742b("ÃìîâÍè£À­É¥Ì¢Ç"), new Object[]{Integer.valueOf(i)})));
            try {
                String readLine = bufferedReader2.readLine();
                if (readLine != null) {
                    String trim = readLine.trim();
                    Util.qualityClose(bufferedReader2);
                    return trim;
                }
                Util.qualityClose(bufferedReader2);
                return "";
            } catch (Throwable th5) {
                th = th5;
                bufferedReader = bufferedReader2;
                try {
                    Log.printErrStackTrace("MircoMsg.AEDHLP", th, "[tomys] failure on step3.", new Object[0]);
                    return "";
                } finally {
                    Util.qualityClose(bufferedReader);
                }
            }
        } catch (Throwable th6) {
            th = th6;
            Log.printErrStackTrace("MircoMsg.AEDHLP", th, "[tomys] failure on step3.", new Object[0]);
            return "";
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: a */
    public boolean mo183637a(int r11, int r12, android.view.View r13) {
        /*
            r10 = this;
            if (r13 == 0) goto L_0x0007
            java.lang.String r0 = r13.toString()
            goto L_0x0009
        L_0x0007:
            java.lang.String r0 = ""
        L_0x0009:
            java.lang.String r1 = m167720d(r12)
            java.lang.String r2 = "MircoMsg.AEDHLP"
            java.lang.String r3 = "[tomys] ae about action, pid:%d, pname:%s, vwinfo:%s, action:%d"
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r5 = 0
            r4[r5] = r12
            r12 = 1
            r4[r12] = r1
            r6 = 2
            r4[r6] = r0
            r6 = 3
            java.lang.Integer r7 = java.lang.Integer.valueOf(r11)
            r4[r6] = r7
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r4)
            monitor-enter(r10)
            if (r13 != 0) goto L_0x0030
            monitor-exit(r10)
            goto L_0x0056
        L_0x0030:
            r2 = 16
            if (r11 == r2) goto L_0x0036
            monitor-exit(r10)
            goto L_0x0056
        L_0x0036:
            monitor-enter(r10)     // Catch:{ all -> 0x00c0 }
            int r2 = r10.f356335f     // Catch:{ all -> 0x00bd }
            if (r2 != 0) goto L_0x003e
            monitor-exit(r10)     // Catch:{ all -> 0x00bd }
            monitor-exit(r10)
            goto L_0x0056
        L_0x003e:
            boolean r2 = r13 instanceof android.widget.Button     // Catch:{ all -> 0x00bd }
            if (r2 == 0) goto L_0x0054
            int r13 = r13.getId()     // Catch:{ all -> 0x00bd }
            int r2 = r10.f356335f     // Catch:{ all -> 0x00bd }
            if (r13 != r2) goto L_0x0054
            long r2 = r10.f356334e     // Catch:{ all -> 0x00bd }
            r6 = 1
            long r2 = r2 + r6
            r10.f356334e = r2     // Catch:{ all -> 0x00bd }
            r10.mo183641g()     // Catch:{ all -> 0x00bd }
        L_0x0054:
            monitor-exit(r10)     // Catch:{ all -> 0x00bd }
            monitor-exit(r10)
        L_0x0056:
            monitor-enter(r10)
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00ba }
            long r6 = r10.f356331b     // Catch:{ all -> 0x00ba }
            long r6 = r2 - r6
            r8 = 86400000(0x5265c00, double:4.2687272E-316)
            int r13 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r13 <= 0) goto L_0x0094
            com.tencent.mm.plugin.report.service.n r13 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ all -> 0x00ba }
            java.lang.String r4 = "Normsg_AED"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r6.<init>()     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = "action: "
            r6.append(r7)     // Catch:{ all -> 0x00ba }
            r6.append(r11)     // Catch:{ all -> 0x00ba }
            java.lang.String r11 = ", pkg: "
            r6.append(r11)     // Catch:{ all -> 0x00ba }
            r6.append(r1)     // Catch:{ all -> 0x00ba }
            java.lang.String r11 = ", view: "
            r6.append(r11)     // Catch:{ all -> 0x00ba }
            r6.append(r0)     // Catch:{ all -> 0x00ba }
            java.lang.String r11 = r6.toString()     // Catch:{ all -> 0x00ba }
            r0 = 0
            r13.mo160135k(r4, r11, r0)     // Catch:{ all -> 0x00ba }
            r10.f356331b = r2     // Catch:{ all -> 0x00ba }
            r10.mo183641g()     // Catch:{ all -> 0x00ba }
        L_0x0094:
            boolean r11 = p206nj.C88956h.m111063d()     // Catch:{ all -> 0x00ba }
            if (r11 == 0) goto L_0x00a3
            boolean r11 = yc2.C118957a.C118961d.m167727b()     // Catch:{ all -> 0x00ba }
            if (r11 == 0) goto L_0x00a3
            r10.mo183640f()     // Catch:{ all -> 0x00ba }
        L_0x00a3:
            monitor-exit(r10)
            boolean r11 = yc2.C118957a.C118961d.m167726a()
            if (r11 == 0) goto L_0x00b9
            if (r1 == 0) goto L_0x00b9
            java.lang.String r11 = ">\u0010r\u001bc\u0001xV"
            java.lang.String r11 = yc2.C118978g.m167742b(r11)
            boolean r11 = r1.contains(r11)
            if (r11 == 0) goto L_0x00b9
            return r5
        L_0x00b9:
            return r12
        L_0x00ba:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        L_0x00bd:
            r11 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x00bd }
            throw r11     // Catch:{ all -> 0x00c0 }
        L_0x00c0:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: yc2.C118957a.mo183637a(int, int, android.view.View):boolean");
    }

    /* renamed from: b */
    public void mo183638b(int i, View view, List<AccessibilityNodeInfo> list) {
        String view2 = view != null ? view.toString() : "";
        String d = m167720d(i);
        Object[] objArr = new Object[4];
        int i2 = 0;
        objArr[0] = Integer.valueOf(i);
        boolean z = true;
        objArr[1] = d;
        objArr[2] = view2;
        if (list == null || list.size() <= 0) {
            z = false;
        }
        objArr[3] = Boolean.valueOf(z);
        Log.m105925i("MircoMsg.AEDHLP", "[tomys] ae about searching, pid:%d, pname:%s, vwinfo:%s, is_found:%b", objArr);
        if (list != null) {
            i2 = list.size();
        }
        synchronized (this) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f356330a > 86400000) {
                C115669n nVar = C115669n.INSTANCE;
                nVar.mo160135k("Normsg_AED", "findview, pkg: " + d + ", res_count: " + i2, (Map<String, Object>) null);
                this.f356330a = currentTimeMillis;
                mo183641g();
            }
            if (C88956h.m111063d() && C118961d.m167727b()) {
                mo183640f();
            }
        }
        if (C118961d.m167726a() && d != null && d.contains(C118978g.m167742b(">\u0010r\u001bc\u0001xV")) && list != null) {
            list.clear();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:7|8|9|10|11|12|13|14|17) */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004a, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0022 */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo183639e(java.lang.Throwable r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            if (r8 != 0) goto L_0x0005
            monitor-exit(r7)
            return
        L_0x0005:
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x004b }
            long r2 = r7.f356332c     // Catch:{ all -> 0x004b }
            long r2 = r0 - r2
            r4 = 86400000(0x5265c00, double:4.2687272E-316)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x0049
            java.io.StringWriter r2 = new java.io.StringWriter     // Catch:{ all -> 0x004b }
            r2.<init>()     // Catch:{ all -> 0x004b }
            r3 = 0
            java.io.PrintWriter r4 = new java.io.PrintWriter     // Catch:{ all -> 0x0026 }
            r4.<init>(r2)     // Catch:{ all -> 0x0026 }
            r8.printStackTrace(r4)     // Catch:{ all -> 0x0022 }
        L_0x0022:
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r4)     // Catch:{ all -> 0x004b }
            goto L_0x0028
        L_0x0026:
            r4 = r3
            goto L_0x0022
        L_0x0028:
            com.tencent.mm.plugin.report.service.n r8 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ all -> 0x004b }
            java.lang.String r4 = "Normsg_AED_Errors"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x004b }
            r5.<init>()     // Catch:{ all -> 0x004b }
            java.lang.String r6 = "error:"
            r5.append(r6)     // Catch:{ all -> 0x004b }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x004b }
            r5.append(r2)     // Catch:{ all -> 0x004b }
            java.lang.String r2 = r5.toString()     // Catch:{ all -> 0x004b }
            r8.mo160135k(r4, r2, r3)     // Catch:{ all -> 0x004b }
            r7.f356332c = r0     // Catch:{ all -> 0x004b }
            r7.mo183641g()     // Catch:{ all -> 0x004b }
        L_0x0049:
            monitor-exit(r7)
            return
        L_0x004b:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: yc2.C118957a.mo183639e(java.lang.Throwable):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        return;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo183640f() {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.f356336g     // Catch:{ all -> 0x0024 }
            if (r0 != 0) goto L_0x0022
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0024 }
            long r2 = r7.f356337h     // Catch:{ all -> 0x0024 }
            long r2 = r0 - r2
            r4 = 2000(0x7d0, double:9.88E-321)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x0015
            monitor-exit(r7)
            return
        L_0x0015:
            r7.f356337h = r0     // Catch:{ all -> 0x0024 }
            r0 = 1
            r7.f356336g = r0     // Catch:{ all -> 0x0024 }
            jm2.f r0 = jm2.C117361f.INSTANCE     // Catch:{ all -> 0x0024 }
            r1 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            r0.vo0(r1)     // Catch:{ all -> 0x0024 }
        L_0x0022:
            monitor-exit(r7)
            return
        L_0x0024:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yc2.C118957a.mo183640f():void");
    }

    /* renamed from: g */
    public final synchronized void mo183641g() {
        DataOutputStream dataOutputStream = null;
        try {
            DataOutputStream dataOutputStream2 = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(new File(MMApplicationContext.getContext().getCacheDir(), C118978g.m167742b("ãçÜºÈ­Üòù")))));
            try {
                dataOutputStream2.writeInt(-606158847);
                dataOutputStream2.writeLong(this.f356330a);
                dataOutputStream2.writeLong(this.f356331b);
                dataOutputStream2.writeLong(this.f356332c);
                dataOutputStream2.writeLong(this.f356333d);
                dataOutputStream2.writeLong(this.f356334e);
                Util.qualityClose(dataOutputStream2);
            } catch (Throwable th) {
                th = th;
                dataOutputStream = dataOutputStream2;
                try {
                    Log.printErrStackTrace("MircoMsg.AEDHLP", th, "[tomys] failure to save rec.", new Object[0]);
                } finally {
                    Util.qualityClose(dataOutputStream);
                }
            }
        } catch (Throwable th4) {
            th = th4;
            Log.printErrStackTrace("MircoMsg.AEDHLP", th, "[tomys] failure to save rec.", new Object[0]);
        }
    }

    public void onError(Throwable th) {
        Log.printErrStackTrace("MircoMsg.AEDHLP", th, "[tomys] unexpected error happens.", new Object[0]);
        mo183639e(th);
    }
}
