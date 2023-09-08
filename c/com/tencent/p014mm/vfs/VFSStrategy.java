package com.tencent.p014mm.vfs;

import a70.C112760b;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.CoreAccountInitializationNotifiedEvent;
import com.tencent.p014mm.sdcard_migrate.ExtStorageMigrateMonitor;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116314o;
import com.tencent.p014mm.vfs.FileSystem;
import com.tencent.xweb.xwalk.plugin.XWalkPlugin;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import kj2.C117407d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.vfs.VFSStrategy */
public final class VFSStrategy {

    /* renamed from: a */
    public static final VFSStrategy$$b f348871a = new VFSStrategy$$b((C86002c2) null);

    /* renamed from: b */
    public static volatile boolean f348872b;

    /* renamed from: c */
    public static boolean f348873c;

    /* renamed from: d */
    public static volatile boolean f348874d;

    /* renamed from: e */
    public static volatile boolean f348875e;

    /* renamed from: f */
    public static volatile boolean f348876f;

    /* renamed from: g */
    public static volatile String f348877g = "";

    /* renamed from: h */
    public static String f348878h = null;

    /* renamed from: i */
    public static final Pattern f348879i = Pattern.compile("^[0-9a-f]{32}$");

    /* renamed from: j */
    public static volatile List<String> f348880j;

    static {
        new ArrayList();
        new HashSet();
    }

    /* renamed from: a */
    public static void m163773a(boolean z) {
        Set<String> set;
        Set<String> set2;
        Set<String> set3;
        Set<String> set4;
        Set<String> set5;
        Bundle g;
        Uri.Builder builder;
        Log.m105924i("VFS.VFSStrategy", "Broadcasting enabled.");
        C116281f0 f0Var = C116281f0.C116289i.f348994a;
        f0Var.getClass();
        boolean z2 = true;
        C116281f0.C116283b bVar = new C116281f0.C116283b(true);
        synchronized (C116314o.f349036g) {
            set = C116314o.f349041l;
            set2 = C116314o.f349042m;
            set3 = C116314o.f349044o;
            set4 = C116314o.f349043n;
            set5 = C116314o.f349045p;
            set3.addAll(Arrays.asList(new String[]{".vfs", "MicroMsg", XWalkPlugin.PRIVATE_CACHE_DIR_NAME, "files", "lib", "code_cache"}));
            C116314o.f349041l = Collections.unmodifiableSet(set);
            C116314o.f349042m = Collections.unmodifiableSet(set2);
            C116314o.f349044o = Collections.unmodifiableSet(set3);
            C116314o.f349043n = Collections.unmodifiableSet(set4);
            C116314o.f349045p = Collections.unmodifiableSet(set5);
            C116314o.f349040k = Collections.unmodifiableSet(C116314o.f349040k);
        }
        C116281f0.C116283b bVar2 = bVar;
        C116314o.m163918d(bVar2, "@DiskSpace-NonAccountSdcard-", 10, new String[]{"${sdFrom}/MicroMsg", "${sdTo}/MicroMsg", "${sdToCache}"}, set, false, true);
        C116314o.m163918d(bVar2, "@DiskSpace-AccountSdcard-", 11, new String[]{"${sdFrom}/MicroMsg/${account}", "${sdTo}/MicroMsg/${account}", "${sdToCache}/${account}", "${sdFrom}/MicroMsg/${accountSalt}", "${sdTo}/MicroMsg/${accountSalt}", "${sdToCache}/${accountSalt}"}, set2, false, true);
        C116314o.m163918d(bVar, "@DiskSpace-NonAccountData-", 7, new String[]{"${data}", "${dataCache}", "${data}/MicroMsg"}, set3, false, true);
        C116314o.m163918d(bVar, "@DiskSpace-FilesData-", 7, new String[]{"${data}/files"}, set5, false, true);
        C116314o.m163918d(bVar, "@DiskSpace-AccountData-", 8, new String[]{"${data}/MicroMsg/${account}", "${dataCache}/${account}"}, set4, false, false);
        Map<String, Object> d = f0Var.mo177791d();
        HashSet hashSet = new HashSet();
        String d2 = C116299g2.m163848d(d, "account");
        if (d2 instanceof String) {
            hashSet.add(d2);
        } else if (d2 instanceof String[]) {
            hashSet.addAll(Arrays.asList((String[]) d2));
        }
        String d3 = C116299g2.m163848d(d, "accountSalt");
        if (d3 instanceof String) {
            hashSet.add(d3);
        } else if (d3 instanceof String[]) {
            hashSet.addAll(Arrays.asList((String[]) d3));
        }
        HashSet hashSet2 = hashSet;
        C116314o.m163918d(bVar, "@DiskSpace-OtherAccountSdcard-", 5, new String[]{"${sdFrom}/MicroMsg", "${sdTo}/MicroMsg", "${sdToCache}"}, hashSet2, true, false);
        C116314o.m163918d(bVar, "@DiskSpace-OtherAccountData-", 9, new String[]{"${data}/MicroMsg"}, hashSet2, true, false);
        bVar.mo177801a();
        try {
            File filesDir = MMApplicationContext.getContext().getFilesDir();
            Uri n = filesDir == null ? null : C116299g2.m163858n(filesDir.getPath());
            if (n == null) {
                builder = new Uri.Builder().path("vfs-statistics");
            } else {
                builder = n.buildUpon();
                builder.appendPath("vfs-statistics");
            }
            Uri build = builder.build();
            String path = build.getPath();
            if (path != null) {
                String k = C116299g2.m163855k(path, false, false);
                if (!build.getPath().equals(k)) {
                    build = builder.path(k).build();
                }
            }
            JSONObject jSONObject = new JSONObject(C86013q1.m106432N(C116299g2.m163865u(build)));
            if (jSONObject.optInt(ProviderConstants.API_COLNAME_FEATURE_VERSION) != 1) {
                Log.m105920e("VFS.DiskFileStatistics", "Mismatched file version: " + jSONObject.optInt(ProviderConstants.API_COLNAME_FEATURE_VERSION));
            } else {
                JSONArray jSONArray = jSONObject.getJSONArray("content");
                int length = jSONArray.length();
                HashMap hashMap = new HashMap();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    String string = jSONObject2.getString("name");
                    String string2 = jSONObject2.getString("path");
                    hashMap.put(string2 + '|' + string, new C116314o.C116316b(string, jSONObject2.getInt("type"), jSONObject2.getInt("flags"), string2, jSONObject2.getLong("totalSize"), jSONObject2.getInt("fileCount"), jSONObject2.getInt("dirCount"), jSONObject2.getInt("maxDepth"), jSONObject2.getLong("maxFileSize"), jSONObject2.getLong("filesAge"), jSONObject2.optLong("targetSize"), jSONObject2.optLong("expireTime")));
                }
                Log.m105924i("VFS.DiskFileStatistics", "Loaded statistics, count: " + hashMap.size());
                synchronized (C116314o.f349036g) {
                    C116314o.f349037h = hashMap;
                    C116314o.f349039j = true;
                }
            }
        } catch (IOException | JSONException e) {
            Log.printErrStackTrace("VFS.DiskFileStatistics", e, "Unable to load statistics", new Object[0]);
        }
        C116314o.m163922h(new C116318p("XWalk", 13, 0, "${data}/app_xwalk_*"));
        C116314o.m163922h(new C116320q("TBSEngine", 13, 0, "${data}/app_tbs_*"));
        C116314o.m163922h(new C116321r("WebViewData", 13, 0, "${data}/app_webview_com_tencent_mm*"));
        C116314o.m163922h(new C116323s("WebViewDataCache", 13, 0, "${dataCache}/webview_com_tencent_mm*"));
        C116314o.m163922h(new C116325t("WeiXin External", 0, 0, "${sdFrom}/MicroMsg/WeiXin"));
        C116314o.m163922h(new C116327u("@DiskSpace-NonAccountData-${data}-MISC", 7, 0, "${data}/*"));
        C116312m0 m0Var = C116312m0.f349030b;
        C116281f0.C116286f fVar = C116314o.f349047r;
        synchronized (m0Var) {
            if (fVar != null) {
                m0Var.f349031a.add(fVar);
            }
        }
        C116266a2 a2Var = C116266a2.f348897a;
        synchronized (m0Var) {
            m0Var.f349031a.add(a2Var);
        }
        C116281f0 f0Var2 = C116281f0.C116289i.f348994a;
        f0Var2.f348958C = true;
        synchronized (f0Var2.f348966j) {
            g = f0Var2.f348968o.mo177831g();
        }
        f0Var2.mo177797j(g);
        if (z) {
            C116281f0.C116283b bVar3 = new C116281f0.C116283b(true);
            List<Pair<String, String>> c = m163775c();
            String d4 = C116299g2.m163848d(f0Var2.mo177791d(), "account");
            ArrayList arrayList = (ArrayList) c;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                if (((String) pair.first).equals(d4) || ((String) pair.first).equals("ee1da3ae2100e09165c2e52382cfe79f")) {
                    it.remove();
                } else {
                    Log.m105925i("VFS.VFSStrategy", " * Other account pair: %s / %s", pair.first, pair.second);
                }
            }
            if (arrayList.isEmpty()) {
                z2 = false;
            } else {
                int size = arrayList.size();
                String[] strArr = new String[size];
                for (int i2 = 0; i2 < size; i2++) {
                    Pair pair2 = (Pair) arrayList.get(i2);
                    strArr[i2] = ((String) pair2.first) + '|' + ((String) pair2.second) + '|' + ((String) pair2.second);
                    StringBuilder sb = new StringBuilder();
                    sb.append(" * Other account env: ");
                    sb.append(strArr[i2]);
                    Log.m105924i("VFS.VFSStrategy", sb.toString());
                }
                bVar3.f348981a.f349109e.put("accountOtherList", strArr);
                bVar3.f348982b = true;
            }
            if (z2) {
                bVar3.mo177801a();
            }
            f0Var2.f348978y = C116312m0.f349030b;
            f0Var2.mo177790c(420000, 86400000, true);
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
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
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: b */
    public static synchronized void m163774b(j40.C46396a r8) {
        /*
            java.lang.Class<com.tencent.mm.vfs.VFSStrategy> r0 = com.tencent.p014mm.vfs.VFSStrategy.class
            monitor-enter(r0)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess()     // Catch:{ all -> 0x00d9 }
            f348872b = r1     // Catch:{ all -> 0x00d9 }
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x00d9 }
            android.app.Application r3 = r8.f124990c     // Catch:{ all -> 0x00d9 }
            java.io.File r3 = r3.getFilesDir()     // Catch:{ all -> 0x00d9 }
            java.io.File r3 = r3.getParentFile()     // Catch:{ all -> 0x00d9 }
            java.lang.String r4 = ".vfs"
            r2.<init>(r3, r4)     // Catch:{ all -> 0x00d9 }
            boolean r2 = r2.exists()     // Catch:{ all -> 0x00d9 }
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L_0x0024
            r2 = 1
            goto L_0x0025
        L_0x0024:
            r2 = 0
        L_0x0025:
            f348873c = r2     // Catch:{ all -> 0x00d9 }
            android.app.Application r8 = r8.f124990c     // Catch:{ all -> 0x00d9 }
            com.tencent.p014mm.vfs.C116281f0.m163819m(r8)     // Catch:{ all -> 0x00d9 }
            int r8 = com.tencent.p014mm.sdk.platformtools.BuildInfo.CLIENT_VERSION_INT     // Catch:{ all -> 0x00d9 }
            com.tencent.p014mm.vfs.C116281f0.f348954H = r8     // Catch:{ all -> 0x00d9 }
            if (r1 != 0) goto L_0x0034
            r8 = 1
            goto L_0x0035
        L_0x0034:
            r8 = 0
        L_0x0035:
            com.tencent.p014mm.vfs.C116281f0.f348953G = r8     // Catch:{ all -> 0x00d9 }
            com.tencent.mm.vfs.VFSStrategy$$b r8 = f348871a     // Catch:{ all -> 0x00d9 }
            com.tencent.p014mm.vfs.C116281f0.f348952F = r8     // Catch:{ all -> 0x00d9 }
            com.tencent.mm.vfs.VFSStrategy$$a r8 = new com.tencent.mm.vfs.VFSStrategy$$a     // Catch:{ all -> 0x00d9 }
            r8.<init>()     // Catch:{ all -> 0x00d9 }
            com.tencent.p014mm.vfs.C116281f0.f348955I = r8     // Catch:{ all -> 0x00d9 }
            com.tencent.mm.sdcard_migrate.ExtStorageMigrateMonitor$b r8 = com.tencent.p014mm.sdcard_migrate.ExtStorageMigrateMonitor.f249775e     // Catch:{ all -> 0x009f }
            java.lang.String r2 = "VFS.VFSStrategy"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x009f }
            r5.<init>()     // Catch:{ all -> 0x009f }
            java.lang.String r6 = "Early init, isMainProcess: "
            r5.append(r6)     // Catch:{ all -> 0x009f }
            r5.append(r1)     // Catch:{ all -> 0x009f }
            java.lang.String r1 = ", VFSSwitch.isAsyncMigrationOpen():"
            r5.append(r1)     // Catch:{ all -> 0x009f }
            r5.append(r3)     // Catch:{ all -> 0x009f }
            java.lang.String r1 = ", asyncMigrationDynCfgOpen:"
            r5.append(r1)     // Catch:{ all -> 0x009f }
            r5.append(r3)     // Catch:{ all -> 0x009f }
            java.lang.String r1 = ", syncMigrationDynCfgOpen:"
            r5.append(r1)     // Catch:{ all -> 0x009f }
            r5.append(r3)     // Catch:{ all -> 0x009f }
            java.lang.String r1 = ", isNewInstalled:"
            r5.append(r1)     // Catch:{ all -> 0x009f }
            java.lang.Class<com.tencent.mm.vfs.e2> r1 = com.tencent.p014mm.vfs.C86004e2.class
            monitor-enter(r1)     // Catch:{ all -> 0x009f }
            java.lang.Boolean r6 = com.tencent.p014mm.vfs.C86004e2.f250478a     // Catch:{ all -> 0x00a1 }
            if (r6 != 0) goto L_0x0089
            java.lang.String r6 = "extmig_status_memo_storage"
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r6 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r6)     // Catch:{ all -> 0x00a1 }
            java.lang.String r7 = "key_is_olddata_ignored_v2"
            boolean r6 = r6.getBoolean(r7, r4)     // Catch:{ all -> 0x00a1 }
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch:{ all -> 0x00a1 }
            com.tencent.p014mm.vfs.C86004e2.f250478a = r6     // Catch:{ all -> 0x00a1 }
        L_0x0089:
            java.lang.Boolean r6 = com.tencent.p014mm.vfs.C86004e2.f250478a     // Catch:{ all -> 0x00a1 }
            boolean r6 = r6.booleanValue()     // Catch:{ all -> 0x00a1 }
            monitor-exit(r1)     // Catch:{ all -> 0x009f }
            r5.append(r6)     // Catch:{ all -> 0x009f }
            java.lang.String r1 = r5.toString()     // Catch:{ all -> 0x009f }
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ all -> 0x009f }
            com.tencent.mm.sdcard_migrate.ExtStorageMigrateMonitor$a r8 = (com.tencent.p014mm.sdcard_migrate.ExtStorageMigrateMonitor.C85724a) r8     // Catch:{ all -> 0x009f }
            r8.mo119341c(r2, r1, r5)     // Catch:{ all -> 0x009f }
            goto L_0x00b1
        L_0x009f:
            r8 = move-exception
            goto L_0x00a4
        L_0x00a1:
            r8 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x009f }
            throw r8     // Catch:{ all -> 0x009f }
        L_0x00a4:
            com.tencent.mm.sdcard_migrate.ExtStorageMigrateMonitor$b r1 = com.tencent.p014mm.sdcard_migrate.ExtStorageMigrateMonitor.f249775e     // Catch:{ all -> 0x00d9 }
            java.lang.String r2 = "VFS.VFSStrategy"
            java.lang.String r5 = "Rarely exception."
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ all -> 0x00d9 }
            com.tencent.mm.sdcard_migrate.ExtStorageMigrateMonitor$a r1 = (com.tencent.p014mm.sdcard_migrate.ExtStorageMigrateMonitor.C85724a) r1     // Catch:{ all -> 0x00d9 }
            r1.mo119342d(r2, r8, r5, r6)     // Catch:{ all -> 0x00d9 }
        L_0x00b1:
            com.tencent.mm.sdcard_migrate.ExtStorageMigrateMonitor$b r8 = com.tencent.p014mm.sdcard_migrate.ExtStorageMigrateMonitor.f249775e     // Catch:{ all -> 0x00d9 }
            java.lang.String r1 = "VFS.VFSStrategy"
            java.lang.String r2 = "[+] updateSdCardPathOnDemand, isPathRemapOpened, NEW_SDCARD_ROOT: %s"
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ all -> 0x00d9 }
            java.lang.String r6 = a70.C112760b.m154228e0()     // Catch:{ all -> 0x00d9 }
            r5[r4] = r6     // Catch:{ all -> 0x00d9 }
            com.tencent.mm.sdcard_migrate.ExtStorageMigrateMonitor$a r8 = (com.tencent.p014mm.sdcard_migrate.ExtStorageMigrateMonitor.C85724a) r8     // Catch:{ all -> 0x00d9 }
            r8.mo119341c(r1, r2, r5)     // Catch:{ all -> 0x00d9 }
            java.lang.Class<a70.b> r8 = a70.C112760b.class
            monitor-enter(r8)     // Catch:{ all -> 0x00d9 }
            java.lang.String[] r1 = a70.C112760b.f337650e     // Catch:{ all -> 0x00d6 }
            r2 = 0
            r1[r4] = r2     // Catch:{ all -> 0x00d6 }
            monitor-exit(r8)     // Catch:{ all -> 0x00d9 }
            java.lang.String r8 = a70.C112760b.m154228e0()     // Catch:{ all -> 0x00d9 }
            a70.C112760b.m154238j0(r8, r3)     // Catch:{ all -> 0x00d9 }
            monitor-exit(r0)
            return
        L_0x00d6:
            r1 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x00d9 }
            throw r1     // Catch:{ all -> 0x00d9 }
        L_0x00d9:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.vfs.VFSStrategy.m163774b(j40.a):void");
    }

    /* renamed from: c */
    public static List<Pair<String, String>> m163775c() {
        String str;
        InputStream openRead;
        FileSystem.C85995c d = new NativeFileSystem("${data}/MicroMsg").mo177578v(C116281f0.C116289i.f348994a.mo177791d());
        Iterable<C86001b0> list = d.list("");
        if (list == null) {
            list = Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (C86001b0 b0Var : list) {
            if (b0Var.f250476f && f348879i.matcher(b0Var.f250472b).matches()) {
                String str2 = b0Var.f250472b;
                try {
                    openRead = d.openRead(b0Var.f250471a + "/account.mapping");
                    byte[] bArr = new byte[32];
                    int i = 0;
                    while (i < 32) {
                        int read = openRead.read(bArr, i, 32 - i);
                        if (read == -1) {
                            break;
                        }
                        i += read;
                    }
                    str = new String(bArr, 0, i);
                    if (openRead != null) {
                        openRead.close();
                    }
                } catch (IOException e) {
                    Log.m105929w("VFS.VFSStrategy", "No mapping for account '%s' : %s", str2, e.getMessage());
                    str = str2;
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
                arrayList.add(new Pair(str2, str));
            }
        }
        return arrayList;
        throw th;
    }

    /* renamed from: d */
    public static String m163776d(String str) {
        return C116343y1.f349133a.mo177858a(str);
    }

    /* renamed from: e */
    public static List<String> m163777e() {
        List<String> list = f348880j;
        if (list != null) {
            return list;
        }
        List<Pair<String, String>> c = m163775c();
        String d = C116299g2.m163848d(C116281f0.C116289i.f348994a.mo177791d(), "account");
        ArrayList arrayList = (ArrayList) c;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            if (((String) pair.first).equals(d) || ((String) pair.first).equals("ee1da3ae2100e09165c2e52382cfe79f")) {
                it.remove();
            } else {
                Log.m105925i("VFS.VFSStrategy", " * Other account pair: %s / %s", pair.first, pair.second);
            }
        }
        HashSet hashSet = new HashSet();
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            Pair pair2 = (Pair) it4.next();
            hashSet.add((String) pair2.first);
            hashSet.add((String) pair2.second);
        }
        ArrayList arrayList2 = new ArrayList(hashSet);
        f348880j = arrayList2;
        return arrayList2;
    }

    /* renamed from: f */
    public static void m163778f(final int i) {
        new IListener<CoreAccountInitializationNotifiedEvent>(C40008f.f107254d) {
            {
                this.__eventId = 19430116;
            }

            public boolean callback(IEvent iEvent) {
                CoreAccountInitializationNotifiedEvent coreAccountInitializationNotifiedEvent = (CoreAccountInitializationNotifiedEvent) iEvent;
                if (!VFSStrategy.f348872b) {
                    return false;
                }
                C117407d.INSTANCE.mo160138m(1146, i, 0, 1, true);
                return false;
            }
        }.alive();
    }

    /* renamed from: g */
    public static boolean m163779g(String str, long j, int i, boolean z) {
        String d;
        int indexOf;
        if (C86013q1.m106450k(str) || (d = C116299g2.m163848d(C116281f0.C116289i.f348994a.mo177791d(), "accountSalt")) == null || d.isEmpty() || (indexOf = str.indexOf(d)) < 0) {
            return false;
        }
        File file = new File(str);
        List<String> e = m163777e();
        StringBuilder sb = new StringBuilder(str.length());
        for (String append : e) {
            sb.setLength(0);
            sb.append(str, 0, indexOf);
            sb.append(append);
            sb.append(str, d.length() + indexOf, str.length());
            File file2 = new File(sb.toString());
            if (file2.isFile() && (j < 0 || file2.length() == j)) {
                if (!z) {
                    file2.renameTo(file);
                }
                C116314o.m163919e(i);
                Log.m105928w("VFS.VFSStrategy", "Found wrong moving file: " + file.getAbsolutePath() + ", dryRun: " + z);
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public static C116281f0.C116283b m163780h(C116281f0.C116283b bVar, String str, boolean z) {
        Log.m105924i("VFS.VFSStrategy", "Update account migration: sysPath = " + str + ", useSaltPath = " + z);
        String str2 = f348877g;
        if (z) {
            NativeFileSystem nativeFileSystem = new NativeFileSystem(str + "${accountSalt}");
            MigrationFileSystem migrationFileSystem = new MigrationFileSystem(false, false, (FileSystem) nativeFileSystem, new NativeFileSystem(str + "${account}"), new NativeFileSystem(C112760b.m154223c() + "${accountSalt}"), new NativeFileSystem(C112760b.m154223c() + "${account}"));
            f348877g = str;
            bVar.mo177803c("accPathMigration", migrationFileSystem);
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append("${accountSalt}");
            bVar.mo177807g(sb.toString());
            bVar.mo177807g(str2 + "${account}");
            bVar.mo177805e(str + "${accountSalt}", "accPathMigration");
            bVar.mo177805e(str + "${account}", "accPathMigration");
            return bVar;
        }
        f348877g = "";
        bVar.f348981a.f349106b.put("accPathMigration", (Object) null);
        bVar.mo177807g(str2 + "${accountSalt}");
        bVar.mo177807g(str2 + "${account}");
        return bVar;
    }

    /* renamed from: i */
    public static synchronized C116281f0.C116283b m163781i(C116281f0.C116283b bVar) {
        C116281f0.C116283b bVar2 = bVar;
        synchronized (VFSStrategy.class) {
            if (f348878h != null) {
                bVar2.f348981a.f349106b.put("camera-path-remapfs", (Object) null);
                bVar2.mo177807g(f348878h);
            }
            String a0 = C112760b.m154220a0();
            String c = C112760b.m154223c();
            ExtStorageMigrateMonitor.C85725b bVar3 = ExtStorageMigrateMonitor.f249775e;
            ((ExtStorageMigrateMonitor.C85724a) bVar3).mo119341c("VFS.VFSStrategy", "[+] updateMigratePathRemappings, lastMountNewCameraPath: %s, newCameraPath: %s", f348878h, a0);
            if (C112760b.m154220a0().equals(C112760b.m154221b())) {
                ((ExtStorageMigrateMonitor.C85724a) bVar3).mo119340b("VFS.VFSStrategy", "[-] Fail to get new camera path, and we use old camera path for fallback.", new Object[0]);
                if (MMApplicationContext.isMainProcess()) {
                    ExtStorageMigrateMonitor.m105904c(1315, 142, 1);
                }
            }
            f348878h = a0;
            NativeFileSystem nativeFileSystem = new NativeFileSystem(a0);
            bVar2.mo177803c("camera-path-remapfs", new MigrationFileSystem(false, false, (FileSystem) nativeFileSystem, new NativeFileSystem(c + "WeChat/"), new NativeFileSystem(c + "WeiXin/")));
            bVar2.mo177805e(a0, "camera-path-remapfs");
            StringBuilder sb = new StringBuilder();
            sb.append(c);
            sb.append("WeChat/");
            bVar2.mo177805e(sb.toString(), "camera-path-remapfs");
            bVar2.mo177805e(c + "WeiXin/", "camera-path-remapfs");
        }
        return bVar2;
    }

    /* renamed from: j */
    public static C116281f0.C116283b m163782j(C116281f0.C116283b bVar, boolean z, boolean z2) {
        String str;
        Context context = MMApplicationContext.getContext();
        Log.m105924i("VFS.VFSStrategy", "Update SDCard status: isSDCardAvailAndSysPathOk = " + z);
        File file = null;
        if (z) {
            String str2 = C112760b.m154217Y() + "/tencent";
            String e0 = C112760b.m154228e0();
            File externalCacheDir = context.getExternalCacheDir();
            if (!z2) {
                Log.m105928w("VFS.VFSStrategy", "do not use external private storage.");
            } else {
                file = externalCacheDir;
            }
            bVar.mo177806f("sdFrom", str2);
            bVar.mo177806f("sdTo", file == null ? str2 : file.getParent());
            if (file == null) {
                str = str2 + "/MicroMsg";
            } else {
                str = file.getPath();
            }
            bVar.mo177806f("sdToCache", str);
            bVar.mo177806f("extSDFrom", e0);
            return bVar;
        }
        File cacheDir = context.getCacheDir();
        bVar.f348981a.f349109e.put("sdFrom", (Object) null);
        bVar.f348982b = true;
        bVar.f348981a.f349109e.put("extSDFrom", (Object) null);
        bVar.f348982b = true;
        bVar.mo177806f("sdTo", cacheDir.getParent());
        bVar.mo177806f("sdToCache", cacheDir.getPath());
        return bVar;
    }
}
