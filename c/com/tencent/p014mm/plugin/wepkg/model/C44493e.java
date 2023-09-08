package com.tencent.p014mm.plugin.wepkg.model;

import android.os.Bundle;
import android.os.Looper;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.plugin.wepkg.utils.C44536d;
import com.tencent.p014mm.pluginsdk.model.C44594n1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.p014mm.vfs.C86009m1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kb3.C46665a;
import kb3.C46668d;
import kb3.C46676l;
import kb3.C46677m;
import lb3.C46842d;
import lb3.C46844f;
import q20.C89449a;

/* renamed from: com.tencent.mm.plugin.wepkg.model.e */
public class C44493e {

    /* renamed from: a */
    public static C44493e f120679a;

    /* renamed from: com.tencent.mm.plugin.wepkg.model.e$a */
    public class C44494a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f120680d;

        /* renamed from: e */
        public final /* synthetic */ int f120681e;

        /* renamed from: f */
        public final /* synthetic */ int f120682f;

        public C44494a(String str, int i, int i2) {
            this.f120680d = str;
            this.f120681e = i;
            this.f120682f = i2;
        }

        public void run() {
            C44493e.this.mo69278g(this.f120680d, this.f120681e, this.f120682f);
        }
    }

    @C89449a
    /* renamed from: com.tencent.mm.plugin.wepkg.model.e$b */
    public static class C44495b implements C80916r<IPCString, Bundle> {
        private C44495b() {
        }

        public Object invoke(Object obj) {
            WepkgVersion wepkgVersion;
            IPCString iPCString = (IPCString) obj;
            String str = null;
            if (iPCString == null) {
                return null;
            }
            String str2 = iPCString.f10315d;
            Map<String, C44501k> map = C46676l.f125644a;
            if (!Util.isNullOrNil(str2)) {
                if (str2.equals(Util.nullAsNil(C46665a.m51974c()))) {
                    str = C46665a.m51972a();
                } else if (str2.equals("jscore_lib")) {
                    C46677m mVar = C46668d.f125639b;
                    if (mVar != null) {
                        WepkgVersion wepkgVersion2 = mVar.f125653f;
                        if (wepkgVersion2 != null) {
                            str = wepkgVersion2.f120653f;
                        }
                    }
                } else {
                    C44501k kVar = (C44501k) ((HashMap) C46676l.f125644a).get(str2);
                    if (!(kVar == null || (wepkgVersion = kVar.f120697d) == null)) {
                        str = wepkgVersion.f120653f;
                    }
                }
                Log.m105925i("MicroMsg.Wepkg.CleanWepkgMgr", "pkgid:%s used_version:%s", str2, str);
                Bundle bundle = new Bundle();
                bundle.putString("used_wepkg_version", str);
                return bundle;
            }
            str = "";
            Log.m105925i("MicroMsg.Wepkg.CleanWepkgMgr", "pkgid:%s used_version:%s", str2, str);
            Bundle bundle2 = new Bundle();
            bundle2.putString("used_wepkg_version", str);
            return bundle2;
        }
    }

    @C89449a
    /* renamed from: com.tencent.mm.plugin.wepkg.model.e$c */
    public static class C44496c implements C80916r<Bundle, Bundle> {
        private C44496c() {
        }

        public Object invoke(Object obj) {
            Bundle bundle = (Bundle) obj;
            if (bundle == null) {
                return null;
            }
            C44493e.m48858f(bundle.getString("ipc_param_pkgid"), bundle.getInt("ipc_param_type", -1), bundle.getInt("ipc_param_reason", 0));
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m48855a(String str, List list, int i) {
        C86009m1[] u;
        if (Util.isNullOrNil(list)) {
            m48859h(str, i);
            return true;
        }
        C86009m1 m1Var = new C86009m1(str);
        if (!m1Var.mo119967g() || !m1Var.mo119977o() || (u = m1Var.mo119984u()) == null) {
            return false;
        }
        for (C86009m1 m1Var2 : u) {
            if (m1Var2 != null && !list.contains(m1Var2.getName())) {
                m48859h(m1Var2.mo119971i(), i);
            }
        }
        return true;
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
    /* renamed from: c */
    public static synchronized com.tencent.p014mm.plugin.wepkg.model.C44493e m48856c() {
        /*
            java.lang.Class<com.tencent.mm.plugin.wepkg.model.e> r0 = com.tencent.p014mm.plugin.wepkg.model.C44493e.class
            monitor-enter(r0)
            com.tencent.mm.plugin.wepkg.model.e r1 = f120679a     // Catch:{ all -> 0x001c }
            if (r1 != 0) goto L_0x0018
            monitor-enter(r0)     // Catch:{ all -> 0x001c }
            com.tencent.mm.plugin.wepkg.model.e r1 = f120679a     // Catch:{ all -> 0x0015 }
            if (r1 != 0) goto L_0x0013
            com.tencent.mm.plugin.wepkg.model.e r1 = new com.tencent.mm.plugin.wepkg.model.e     // Catch:{ all -> 0x0015 }
            r1.<init>()     // Catch:{ all -> 0x0015 }
            f120679a = r1     // Catch:{ all -> 0x0015 }
        L_0x0013:
            monitor-exit(r0)     // Catch:{ all -> 0x0015 }
            goto L_0x0018
        L_0x0015:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0015 }
            throw r1     // Catch:{ all -> 0x001c }
        L_0x0018:
            com.tencent.mm.plugin.wepkg.model.e r1 = f120679a     // Catch:{ all -> 0x001c }
            monitor-exit(r0)
            return r1
        L_0x001c:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wepkg.model.C44493e.m48856c():com.tencent.mm.plugin.wepkg.model.e");
    }

    /* renamed from: d */
    public static List m48857d(String str) {
        Bundle bundle;
        String string;
        ArrayList arrayList = new ArrayList();
        if (Util.isNullOrNil(str)) {
            return arrayList;
        }
        String str2 = C44594n1.m49045a() ? WeChatProcess.PROCESS_MAIN : WeChatProcess.PROCESS_TOOLS;
        if (!((!str2.equals(WeChatProcess.PROCESS_MAIN) && !WeChatProcess.isToolsAlive()) || (bundle = (Bundle) C80907o.m98783f(str2, new IPCString(str), C44495b.class)) == null || (string = bundle.getString("used_wepkg_version")) == null)) {
            arrayList.add(string);
        }
        return arrayList;
    }

    /* renamed from: f */
    public static void m48858f(String str, int i, int i2) {
        if (!MMApplicationContext.isMMProcess()) {
            Log.m105924i("MicroMsg.Wepkg.CleanWepkgMgr", "removeWepkgInMMSync fail. only run on mm process");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            Log.m105924i("MicroMsg.Wepkg.CleanWepkgMgr", "removeWepkgInMMSync fail. can not process on Main thread");
        } else {
            Log.m105925i("MicroMsg.Wepkg.CleanWepkgMgr", "removeWepkgInMMSync, pkgid:[%s], type:%d", str, Integer.valueOf(i));
            if (i == 0) {
                C46844f Ow = C46844f.m52139Ow();
                if (Ow.f126002d) {
                    Log.m105925i("MicroMsg.Wepkg.WepkgVersionStorage", "WepkgVersionRecord clearWepkg ret:%s", Boolean.valueOf(Ow.execSQL("WepkgVersion", String.format("delete from %s", new Object[]{"WepkgVersion"}))));
                    Log.m105925i("MicroMsg.Wepkg.WepkgVersionStorage", "WepkgPreloadFilesRecord clearWepkg ret:%s", Boolean.valueOf(Ow.execSQL("WepkgPreloadFiles", String.format("delete from %s", new Object[]{"WepkgPreloadFiles"}))));
                }
                m48859h(C44498h.m48865c(), i2);
            } else if (i != 1) {
                if (i != 2) {
                    if (i == 3 && !Util.isNullOrNil(str)) {
                        String a = C44498h.m48863a(str);
                        List d = m48857d(str);
                        WepkgVersion d2 = C44509m.m48883d(str);
                        if (d2 != null) {
                            ((ArrayList) d).add(d2.f120653f);
                        }
                        m48855a(a, d, i2);
                    }
                } else if (!Util.isNullOrNil(str)) {
                    m48855a(C44498h.m48863a(str), m48857d(str), i2);
                    C46844f.m52139Ow().mo72044Lo(str);
                    C46842d.m52134Yt().mo72042jo(str);
                }
            } else if (!Util.isNullOrNil(str)) {
                m48859h(C44498h.m48863a(str), i2);
                C46844f.m52139Ow().mo72044Lo(str);
                C46842d.m52134Yt().mo72042jo(str);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x003d A[SYNTHETIC, Splitter:B:20:0x003d] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007e A[Catch:{ Exception -> 0x00ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0080 A[Catch:{ Exception -> 0x00ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0086 A[Catch:{ Exception -> 0x00ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0090 A[Catch:{ Exception -> 0x00ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a8 A[Catch:{ Exception -> 0x00ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00e5 A[SYNTHETIC, Splitter:B:57:0x00e5] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m48859h(java.lang.String r16, int r17) {
        /*
            r0 = r16
            java.lang.String r1 = "MicroMsg.Wepkg.CleanWepkgMgr"
            r2 = 0
            java.lang.String r3 = "Safe delete dir: %s, reason:%d"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x00ed }
            r4[r2] = r0     // Catch:{ Exception -> 0x00ed }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r17)     // Catch:{ Exception -> 0x00ed }
            r6 = 1
            r4[r6] = r5     // Catch:{ Exception -> 0x00ed }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r3, r4)     // Catch:{ Exception -> 0x00ed }
            java.lang.String r7 = "WepkgRemove"
            r8 = 0
            java.lang.String r3 = "/"
            java.lang.String r4 = "/wepkg/"
            java.lang.String r5 = ""
            if (r0 != 0) goto L_0x0023
        L_0x0021:
            r9 = r5
            goto L_0x0039
        L_0x0023:
            java.lang.String[] r9 = r0.split(r4)     // Catch:{ Exception -> 0x0021 }
            int r10 = r9.length     // Catch:{ Exception -> 0x0021 }
            if (r10 > r6) goto L_0x002b
            goto L_0x0021
        L_0x002b:
            r9 = r9[r6]     // Catch:{ Exception -> 0x0021 }
            if (r9 != 0) goto L_0x0030
            goto L_0x0021
        L_0x0030:
            java.lang.String[] r9 = r9.split(r3)     // Catch:{ Exception -> 0x0021 }
            int r10 = r9.length     // Catch:{ Exception -> 0x0021 }
            if (r10 <= 0) goto L_0x0021
            r9 = r9[r2]     // Catch:{ Exception -> 0x0021 }
        L_0x0039:
            if (r0 != 0) goto L_0x003d
        L_0x003b:
            r10 = r5
            goto L_0x0054
        L_0x003d:
            java.lang.String[] r4 = r0.split(r4)     // Catch:{ Exception -> 0x003b }
            int r10 = r4.length     // Catch:{ Exception -> 0x003b }
            if (r10 > r6) goto L_0x0045
            goto L_0x003b
        L_0x0045:
            r4 = r4[r6]     // Catch:{ Exception -> 0x003b }
            if (r4 != 0) goto L_0x004a
            goto L_0x003b
        L_0x004a:
            java.lang.String[] r3 = r4.split(r3)     // Catch:{ Exception -> 0x003b }
            int r4 = r3.length     // Catch:{ Exception -> 0x003b }
            if (r4 <= r6) goto L_0x003b
            r3 = r3[r6]     // Catch:{ Exception -> 0x003b }
            r10 = r3
        L_0x0054:
            r3 = r17
            long r11 = (long) r3
            r13 = 0
            r15 = 0
            com.tencent.p014mm.plugin.wepkg.utils.C44532a.m48912c(r7, r8, r9, r10, r11, r13, r15)     // Catch:{ Exception -> 0x00ed }
            com.tencent.mm.vfs.m1 r3 = new com.tencent.mm.vfs.m1     // Catch:{ Exception -> 0x00ed }
            r3.<init>((java.lang.String) r0)     // Catch:{ Exception -> 0x00ed }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ed }
            r0.<init>()     // Catch:{ Exception -> 0x00ed }
            java.lang.String r4 = r3.getName()     // Catch:{ Exception -> 0x00ed }
            r0.append(r4)     // Catch:{ Exception -> 0x00ed }
            java.lang.String r4 = "_temp"
            r0.append(r4)     // Catch:{ Exception -> 0x00ed }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00ed }
            java.lang.String r4 = r3.mo119973k()     // Catch:{ Exception -> 0x00ed }
            r5 = 0
            if (r4 != 0) goto L_0x0080
            r4 = r5
            goto L_0x0084
        L_0x0080:
            android.net.Uri r4 = com.tencent.p014mm.vfs.C116299g2.m163858n(r4)     // Catch:{ Exception -> 0x00ed }
        L_0x0084:
            if (r4 != 0) goto L_0x0090
            android.net.Uri$Builder r4 = new android.net.Uri$Builder     // Catch:{ Exception -> 0x00ed }
            r4.<init>()     // Catch:{ Exception -> 0x00ed }
            android.net.Uri$Builder r0 = r4.path(r0)     // Catch:{ Exception -> 0x00ed }
            goto L_0x009e
        L_0x0090:
            android.net.Uri$Builder r4 = r4.buildUpon()     // Catch:{ Exception -> 0x00ed }
            boolean r7 = r0.isEmpty()     // Catch:{ Exception -> 0x00ed }
            if (r7 != 0) goto L_0x009d
            r4.appendPath(r0)     // Catch:{ Exception -> 0x00ed }
        L_0x009d:
            r0 = r4
        L_0x009e:
            android.net.Uri r4 = r0.build()     // Catch:{ Exception -> 0x00ed }
            java.lang.String r7 = r4.getPath()     // Catch:{ Exception -> 0x00ed }
            if (r7 == 0) goto L_0x00be
            java.lang.String r7 = com.tencent.p014mm.vfs.C116299g2.m163855k(r7, r2, r2)     // Catch:{ Exception -> 0x00ed }
            java.lang.String r8 = r4.getPath()     // Catch:{ Exception -> 0x00ed }
            boolean r8 = r8.equals(r7)     // Catch:{ Exception -> 0x00ed }
            if (r8 != 0) goto L_0x00be
            android.net.Uri$Builder r0 = r0.path(r7)     // Catch:{ Exception -> 0x00ed }
            android.net.Uri r4 = r0.build()     // Catch:{ Exception -> 0x00ed }
        L_0x00be:
            com.tencent.mm.vfs.f0$h r0 = r3.mo119989z()     // Catch:{ Exception -> 0x00ed }
            com.tencent.mm.vfs.f0 r3 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ Exception -> 0x00ed }
            com.tencent.mm.vfs.f0$h r3 = r3.mo177799l(r4, r5)     // Catch:{ Exception -> 0x00ed }
            boolean r5 = r0.mo177810a()     // Catch:{ Exception -> 0x00ed }
            if (r5 == 0) goto L_0x00e2
            boolean r5 = r3.mo177810a()     // Catch:{ Exception -> 0x00ed }
            if (r5 != 0) goto L_0x00d5
            goto L_0x00e2
        L_0x00d5:
            com.tencent.mm.vfs.FileSystem$c r5 = r3.f348991a     // Catch:{ IOException -> 0x00e2 }
            java.lang.String r3 = r3.f348992b     // Catch:{ IOException -> 0x00e2 }
            com.tencent.mm.vfs.FileSystem$c r7 = r0.f348991a     // Catch:{ IOException -> 0x00e2 }
            java.lang.String r0 = r0.f348992b     // Catch:{ IOException -> 0x00e2 }
            boolean r0 = r5.mo119946t(r3, r7, r0)     // Catch:{ IOException -> 0x00e2 }
            goto L_0x00e3
        L_0x00e2:
            r0 = 0
        L_0x00e3:
            if (r0 == 0) goto L_0x0106
            java.lang.String r0 = com.tencent.p014mm.vfs.C116299g2.m163865u(r4)     // Catch:{ Exception -> 0x00ed }
            com.tencent.p014mm.vfs.C86013q1.m106445f(r0)     // Catch:{ Exception -> 0x00ed }
            return r6
        L_0x00ed:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "safeDeleteDir err:"
            r3.append(r4)
            java.lang.String r0 = r0.getMessage()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
        L_0x0106:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wepkg.model.C44493e.m48859h(java.lang.String, int):boolean");
    }

    /* renamed from: b */
    public final long mo69276b(C86009m1 m1Var) {
        long j = 0;
        if (m1Var == null) {
            return 0;
        }
        try {
            if (m1Var.mo119977o()) {
                for (C86009m1 m1Var2 : m1Var.mo119984u()) {
                    j += m1Var2.mo119978p() ? m1Var2.mo119980r() : mo69276b(m1Var2);
                }
                return j;
            } else if (m1Var.mo119978p()) {
                return 0 + m1Var.mo119980r();
            } else {
                return 0;
            }
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: e */
    public void mo69277e(String str, int i, int i2) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            C44536d.m48918d().postToWorker(new C44494a(str, i, i2));
        } else {
            mo69278g(str, i, i2);
        }
    }

    /* renamed from: g */
    public void mo69278g(String str, int i, int i2) {
        if (MMApplicationContext.isMMProcess()) {
            m48858f(str, i, i2);
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            Log.m105924i("MicroMsg.Wepkg.CleanWepkgMgr", "removeWepkgSync fail. can not process on Main thread");
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("ipc_param_pkgid", str);
            bundle.putInt("ipc_param_type", i);
            bundle.putInt("ipc_param_reason", i2);
            C80907o.m98783f(WeChatProcess.PROCESS_MAIN, bundle, C44496c.class);
        }
    }
}
