package com.tencent.p014mm.plugin.appbrand.appcache;

import android.database.Cursor;
import android.net.Uri;
import android.os.StatFs;
import android.util.Pair;
import com.tencent.p014mm.autogen.mmdata.rpt.WeAppPackageDeleteActionStruct;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.appcache.C29293q1;
import com.tencent.p014mm.plugin.appbrand.appcache.C81258h3;
import com.tencent.p014mm.plugin.appbrand.appcache.predownload.export.C81331p;
import com.tencent.p014mm.plugin.appbrand.appcache.predownload.storage.WxaSyncCmdPersistentStorage;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81412d0;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandGlobalSystemConfig;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.plugin.appbrand.launching.C29563c1;
import com.tencent.p014mm.plugin.appbrand.launching.C29567d1;
import com.tencent.p014mm.plugin.appbrand.launching.C29583l3;
import com.tencent.p014mm.plugin.appbrand.page.C83864o3;
import com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager;
import com.tencent.p014mm.plugin.appbrand.v8_snapshot.C84871v;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C116335w;
import com.tencent.p014mm.vfs.C86001b0;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86011o1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.vfs.FileSystem;
import com.tencent.p014mm.vfs.r1$$a;
import com.tencent.xweb.BuildConfig;
import di3.C7335d;
import di3.C86312j;
import gy3.C87412m;
import h81.C32735h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import kr0.C33987b1;
import qp3.C118196a;
import qp3.C118201e;
import u24.C90595a;
import u24.C90599h;
import wi0.C90982g0;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.i0 */
public class C81259i0 implements Runnable {

    /* renamed from: d */
    public final AtomicBoolean f238666d = new AtomicBoolean();

    /* renamed from: e */
    public final List<C81256h0> f238667e = new CopyOnWriteArrayList();

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.i0$a */
    public class C81260a extends HashMap<String, C81331p.C29266b> {
        public C81260a(C81259i0 i0Var) {
            C7335d c = C86312j.m106911c(C33987b1.class);
            C87412m.m108592e(c, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgStorageExportServiceImpl");
            for (C81331p.C29266b next : ((C81331p) c).vx0()) {
                if (next != null) {
                    put(next.f79951d, next);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.i0$b */
    public class C81261b implements C86011o1 {
        public C81261b(C81259i0 i0Var) {
        }

        public boolean accept(C86009m1 m1Var) {
            return m1Var.mo119978p();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.i0$c */
    public class C81262c implements C29293q1.C29294a {
        public C81262c() {
        }

        /* renamed from: a */
        public boolean mo56575a() {
            return C81259i0.this.f238666d.get();
        }
    }

    /* renamed from: a */
    public void mo113545a() {
        if (this.f238666d.get()) {
            throw new InterruptedException();
        }
    }

    /* renamed from: b */
    public final void mo113546b(List<C29208e0> list) {
        mo113545a();
        StatFs statFs = new StatFs(C81355t2.m99776b());
        StatFs statFs2 = new StatFs(C81355t2.m99777c());
        long blockCountLong = statFs.getBlockCountLong() + statFs2.getBlockCountLong();
        long c = C81412d0.m99869c(new C86009m1(C81355t2.m99776b())) + C81412d0.m99869c(new C86009m1(C81355t2.m99777c()));
        double d = (double) blockCountLong;
        double blockSizeLong = ((double) (c / (statFs.getBlockSizeLong() + statFs2.getBlockSizeLong()))) / d;
        double d2 = (double) (((float) AppBrandGlobalSystemConfig.m100099b().f239288K.f239340g) / 100.0f);
        char c2 = 0;
        boolean z = blockSizeLong > d2 && c > AppBrandGlobalSystemConfig.m100099b().f239288K.f239339f * 1048576;
        double d3 = blockSizeLong;
        Log.m105925i("MicroMsg.AppBrand.PkgCleanupNewLogic", "processByFilesystemUsage, usedPercent(%f), maxPercent(%f), usedBytes(%d), maxMB(%d), shouldCleanup=%B", Double.valueOf(blockSizeLong), Double.valueOf(d2), Long.valueOf(c), Long.valueOf(AppBrandGlobalSystemConfig.m100099b().f239288K.f239339f), Boolean.valueOf(z));
        if (z) {
            Log.m105925i("MicroMsg.AppBrand.PkgCleanupNewLogic", "processByFilesystemUsage, cleanup by conditions usedPercent(%f) > maxPercent(%f)", Double.valueOf(d3), Double.valueOf(d2));
            long blockSizeLong2 = (long) ((d3 - d2) * d * ((double) statFs.getBlockSizeLong()));
            int i = (blockSizeLong2 > 0 ? 1 : (blockSizeLong2 == 0 ? 0 : -1));
            if (i < 0) {
                Log.m105920e("MicroMsg.AppBrand.PkgCleanupNewLogic", "processByFilesystemUsage, calculated bytesToTrim is minus");
                return;
            }
            mo113545a();
            if (i > 0) {
                StatFs statFs3 = new StatFs(C81355t2.m99776b());
                StatFs statFs4 = new StatFs(C81355t2.m99777c());
                long availableBlocks = (((long) statFs3.getAvailableBlocks()) * ((long) statFs3.getBlockSize())) + (((long) statFs4.getAvailableBlocks()) * ((long) statFs4.getBlockSize()));
                if (availableBlocks >= 0 && availableBlocks <= blockSizeLong2) {
                    C29229o1 o1Var = (C29229o1) C81161g2.Bx0(C29229o1.class);
                    if (o1Var == null) {
                        Log.m105921e("MicroMsg.AppBrand.PkgPruneLRULogic", "trimBy %d, lruStorage NULL", Long.valueOf(blockSizeLong2));
                    } else {
                        String format = String.format(Locale.US, " %s, %s ASC", new Object[]{"hit", "hitTimeMS"});
                        LinkedList linkedList = new LinkedList();
                        synchronized (C29223i1.f79873a) {
                            Cursor query = o1Var.f79885d.query("PkgUsageLRURecord", new String[]{"appId", "type"}, (String) null, (String[]) null, (String) null, (String) null, format, 2);
                            if (query != null) {
                                if (!query.moveToFirst()) {
                                    query.close();
                                } else {
                                    do {
                                        try {
                                            linkedList.add(Pair.create(query.getString(0), Integer.valueOf(query.getInt(1))));
                                        } catch (Exception e) {
                                            try {
                                                Log.m105921e("MicroMsg.AppBrand.PkgPruneLRULogic", "trimBy, read from cursor e = %s", e);
                                            } catch (Throwable th) {
                                                query.close();
                                                throw th;
                                            }
                                        }
                                    } while (query.moveToNext());
                                    query.close();
                                    C81161g2.requireAccountInitializedOnDemand();
                                    C81258h3 h3Var = C81161g2.f238471g;
                                    if (h3Var == null) {
                                        Log.m105921e("MicroMsg.AppBrand.PkgPruneLRULogic", "trimBy %d, pkgStorage NULL", Long.valueOf(blockSizeLong2));
                                    } else if (!this.f238666d.get()) {
                                        Iterator it = linkedList.iterator();
                                        long j = 0;
                                        int i2 = 0;
                                        loop1:
                                        while (true) {
                                            if (!it.hasNext()) {
                                                break;
                                            }
                                            Pair pair = (Pair) it.next();
                                            C29208e0 e0Var = new C29208e0((String) pair.first, ((Integer) pair.second).intValue());
                                            if (list.contains(e0Var)) {
                                                Object[] objArr = new Object[1];
                                                objArr[c2] = e0Var;
                                                Log.m105925i("MicroMsg.AppBrand.PkgPruneLRULogic", "trimOffSize appPkg: %s is in white list, skip", objArr);
                                            } else {
                                                for (C29315z2 next : h3Var.mo113541w((String) pair.first, ((Integer) pair.second).intValue(), C81258h3.C68580b.ASC, "pkgPath")) {
                                                    j += C86013q1.m106451l(next.field_pkgPath);
                                                    C86013q1.m106447h(next.field_pkgPath);
                                                    i2++;
                                                    o1Var.mo56528W0((String) pair.first, ((Integer) pair.second).intValue());
                                                    if (!this.f238666d.get()) {
                                                        if (j >= blockSizeLong2) {
                                                            WeAppPackageDeleteActionStruct weAppPackageDeleteActionStruct = new WeAppPackageDeleteActionStruct();
                                                            weAppPackageDeleteActionStruct.f79220d = 3;
                                                            weAppPackageDeleteActionStruct.f79223g = (long) i2;
                                                            weAppPackageDeleteActionStruct.f79224h = 1;
                                                            weAppPackageDeleteActionStruct.mo86054n();
                                                            break loop1;
                                                        }
                                                    } else {
                                                        throw new InterruptedException();
                                                    }
                                                }
                                                continue;
                                            }
                                            c2 = 0;
                                        }
                                    } else {
                                        throw new InterruptedException();
                                    }
                                }
                            }
                        }
                    }
                }
            }
            long j2 = blockSizeLong2 / 5;
            C81262c cVar = new C81262c();
            if (j2 > 0) {
                StatFs statFs5 = new StatFs(C81355t2.m99776b());
                StatFs statFs6 = new StatFs(C81355t2.m99777c());
                long availableBlocks2 = (((long) statFs5.getAvailableBlocks()) * ((long) statFs5.getBlockSize())) + (((long) statFs6.getAvailableBlocks()) * ((long) statFs6.getBlockSize()));
                if (availableBlocks2 >= 0 && availableBlocks2 <= j2) {
                    C29293q1.m38616c(j2, cVar);
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo113547c(List<C29208e0> list) {
        C81161g2.requireAccountInitializedOnDemand();
        C81258h3 h3Var = C81161g2.f238471g;
        h3Var.getClass();
        StringBuilder sb = new StringBuilder("debugType");
        sb.append(" in (");
        int[] iArr = C81289m.f238700i0;
        for (int i = 0; i < 3; i++) {
            sb.append(iArr[i]);
            sb.append(',');
        }
        sb.append(-1);
        sb.append(')');
        Cursor query = h3Var.f238664d.query("AppBrandWxaPkgManifestRecord", (String[]) null, sb.toString(), (String[]) null, (String) null, (String) null, (String) null, 2);
        ArrayList<C29315z2> arrayList = null;
        if (query != null) {
            if (!query.moveToFirst()) {
                query.close();
            } else {
                arrayList = new ArrayList<>();
                while (true) {
                    C29315z2 z2Var = new C29315z2();
                    z2Var.convertFrom(query);
                    arrayList.add(z2Var);
                    if (!query.moveToNext()) {
                        break;
                    }
                    List<C29208e0> list2 = list;
                }
                query.close();
            }
        }
        if (!Util.isNullOrNil((List) arrayList)) {
            mo113545a();
            long nowSecond = Util.nowSecond();
            for (C29315z2 z2Var2 : arrayList) {
                if (AppBrandProcessesManager.m103869I().mo111384F(z2Var2.field_appId)) {
                    Log.m105925i("MicroMsg.AppBrand.PkgCleanupNewLogic", "processDebug appID(%s) is running, skip", z2Var2.field_appId);
                } else {
                    C29208e0 e0Var = new C29208e0(z2Var2.field_appId, z2Var2.field_debugType);
                    if (list.contains(e0Var)) {
                        Log.m105925i("MicroMsg.AppBrand.PkgCleanupNewLogic", "processDebug appPkg: %s is in white list, skip", e0Var);
                    } else {
                        mo113545a();
                        long j = z2Var2.field_endTime;
                        if (j <= 0 || j > nowSecond) {
                            if (z2Var2.field_debugType == 999) {
                                Log.m105925i("MicroMsg.AppBrand.PkgCleanupNewLogic", "processDebug, debug library not exceed time range[%d %d]", Long.valueOf(z2Var2.field_startTime), Long.valueOf(z2Var2.field_endTime));
                            }
                        } else if (z2Var2.field_debugType == 999) {
                            C68579f0.m80843a(z2Var2.field_pkgPath);
                            C81161g2.requireAccountInitializedOnDemand();
                            C81161g2.f238471g.mo113517a(z2Var2);
                            String str = z2Var2.field_pkgPath;
                            if (!Util.isNullOrNil(str)) {
                                C87412m.m108594g(str, "wxaPkgPath");
                                C84871v vVar = (C84871v) C86312j.m106911c(C84871v.class);
                                if (vVar != null) {
                                    vVar.mo117582Fr(str);
                                }
                            }
                            Log.m105925i("MicroMsg.AppBrand.PkgCleanupNewLogic", "processDebug, (%s, %d) exceed time range[%d, %d]", z2Var2.field_appId, Integer.valueOf(z2Var2.field_debugType), Long.valueOf(z2Var2.field_startTime), Long.valueOf(z2Var2.field_endTime));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo113548d(List<C29208e0> list) {
        C86001b0 q;
        Class cls = C29301t1.class;
        mo113545a();
        long nowSecond = Util.nowSecond() - AppBrandGlobalSystemConfig.m100099b().f239288K.f239338e;
        Cursor all = ((C29301t1) C81161g2.Bx0(cls)).getAll();
        if (all != null && !all.isClosed()) {
            LinkedList<C29299s1> linkedList = new LinkedList<>();
            if (all.moveToFirst()) {
                do {
                    C29299s1 s1Var = new C29299s1();
                    s1Var.convertFrom(all);
                    linkedList.add(s1Var);
                } while (all.moveToNext());
            }
            all.close();
            mo113545a();
            for (C29299s1 s1Var2 : linkedList) {
                if (C86013q1.m106450k(s1Var2.field_pkgPath)) {
                    C29208e0 e0Var = new C29208e0(s1Var2.field_appId, 0);
                    if (list.contains(e0Var)) {
                        Log.m105925i("MicroMsg.AppBrand.PkgCleanupNewLogic", "processEncrypted appPkg: %s is in white list, skip", e0Var);
                    } else {
                        mo113545a();
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        Uri n = C116299g2.m163858n(s1Var2.field_pkgPath);
                        String path = n.getPath();
                        if (path != null) {
                            String k = C116299g2.m163855k(path, false, false);
                            if (!n.getPath().equals(k)) {
                                n = n.buildUpon().path(k).build();
                            }
                        }
                        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
                        long j = 0;
                        if (l.mo177810a() && (q = l.f348991a.mo119945q(l.f348992b)) != null) {
                            j = q.f250475e;
                        }
                        if (timeUnit.toSeconds(j) < nowSecond) {
                            Log.m105925i("MicroMsg.AppBrand.PkgCleanupNewLogic", "processEncrypted, delete record(%s %d %d)", s1Var2.field_appId, Integer.valueOf(s1Var2.field_type), Integer.valueOf(s1Var2.field_version));
                            ((C29301t1) C81161g2.Bx0(cls)).delete(s1Var2, new String[0]);
                            C86013q1.m106445f(s1Var2.field_pkgPath);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo113549e() {
        /*
            r13 = this;
            com.tencent.p014mm.plugin.appbrand.app.C81161g2.requireAccountInitializedOnDemand()
            com.tencent.mm.plugin.appbrand.appcache.h3 r0 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.f238471g
            if (r0 != 0) goto L_0x0008
            return
        L_0x0008:
            com.tencent.mm.plugin.appbrand.task.AppBrandProcessesManager r1 = com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager.m103869I()
            java.util.List r1 = r1.mo111395j()
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = sx3.C36907w.m41090l(r1, r3)
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L_0x001f:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0035
            java.lang.Object r3 = r1.next()
            com.tencent.mm.plugin.appbrand.task.k r3 = (com.tencent.p014mm.plugin.appbrand.task.C84310k) r3
            int r3 = r3.f246199l
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.add(r3)
            goto L_0x001f
        L_0x0035:
            int[] r1 = sx3.C110818d0.m150952x0(r2)
            int r2 = r1.length
            r3 = 2147483647(0x7fffffff, float:NaN)
            r4 = 0
            r5 = 0
            r6 = 2147483647(0x7fffffff, float:NaN)
        L_0x0042:
            if (r5 >= r2) goto L_0x004f
            r7 = r1[r5]
            if (r7 <= 0) goto L_0x004c
            int r6 = java.lang.Math.min(r6, r7)
        L_0x004c:
            int r5 = r5 + 1
            goto L_0x0042
        L_0x004f:
            java.lang.String r1 = "@LibraryAppId"
            if (r3 != r6) goto L_0x005e
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo r2 = com.tencent.p014mm.plugin.appbrand.launching.C83396o0.m102337b(r1, r4)
            if (r2 != 0) goto L_0x005b
            r6 = 0
            goto L_0x005e
        L_0x005b:
            int r2 = r2.pkgVersion
            r6 = r2
        L_0x005e:
            if (r6 <= 0) goto L_0x013e
            r2 = 1
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r5[r4] = r7
            java.lang.String r7 = "MicroMsg.AppBrand.PkgCleanupNewLogic"
            java.lang.String r8 = "processExpiredCommLibFiles, library.minValidVersion = %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r8, r5)
            r0.getClass()
            r5 = 3
            int r8 = java.lang.Math.max(r4, r5)
            int r3 = p282z2.C16095a.m14980b(r6, r4, r3)
            java.util.Locale r6 = java.util.Locale.ENGLISH
            r9 = 6
            java.lang.Object[] r9 = new java.lang.Object[r9]
            java.lang.String r10 = "version"
            r9[r4] = r10
            java.lang.String r11 = r0.mo113531o()
            r9[r2] = r11
            r11 = 2
            java.lang.String r12 = "appId"
            r9[r11] = r12
            r9[r5] = r10
            r5 = 4
            r9[r5] = r10
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            r8 = 5
            r9[r8] = r5
            java.lang.String r5 = "select %s from %s where %s=? and %s<=? order by %s desc limit 1 offset %d"
            java.lang.String r5 = java.lang.String.format(r6, r5, r9)
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r0.f238664d
            java.lang.String[] r6 = new java.lang.String[r11]
            r6[r4] = r1
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r6[r2] = r3
            android.database.Cursor r0 = r0.rawQuery(r5, r6)
            if (r0 == 0) goto L_0x00cf
            boolean r3 = r0.moveToFirst()     // Catch:{ all -> 0x00c5 }
            if (r3 == 0) goto L_0x00cf
            int r3 = r0.getInt(r4)     // Catch:{ all -> 0x00c5 }
            r0.close()
            goto L_0x00d5
        L_0x00c5:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x00ca }
            goto L_0x00ce
        L_0x00ca:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x00ce:
            throw r1
        L_0x00cf:
            if (r0 == 0) goto L_0x00d4
            r0.close()
        L_0x00d4:
            r3 = -1
        L_0x00d5:
            com.tencent.p014mm.plugin.appbrand.app.C81161g2.requireAccountInitializedOnDemand()
            com.tencent.mm.plugin.appbrand.appcache.h3 r0 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.f238471g
            int[] r0 = r0.mo113543y(r1)
            com.tencent.p014mm.plugin.appbrand.app.C81161g2.requireAccountInitializedOnDemand()
            com.tencent.mm.plugin.appbrand.appcache.h3 r5 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.f238471g
            int r1 = r5.mo113523g(r1, r4, r3)
            java.lang.Object[] r5 = new java.lang.Object[r11]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            r5[r4] = r6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r5[r2] = r1
            java.lang.String r1 = "processExpiredCommLibFiles, delete libraries record < %d, count:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r1, r5)
            java.lang.Class<com.tencent.mm.plugin.appbrand.v8_snapshot.v> r1 = com.tencent.p014mm.plugin.appbrand.v8_snapshot.C84871v.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            com.tencent.mm.plugin.appbrand.v8_snapshot.v r1 = (com.tencent.p014mm.plugin.appbrand.v8_snapshot.C84871v) r1
            if (r1 == 0) goto L_0x0108
            r1.Lf0(r3)
        L_0x0108:
            if (r0 == 0) goto L_0x013e
            int r1 = r0.length
            if (r1 <= 0) goto L_0x013e
            int r1 = r0.length
            r5 = 0
        L_0x010f:
            if (r5 >= r1) goto L_0x013e
            r6 = r0[r5]
            if (r6 < r3) goto L_0x0124
            java.lang.Object[] r8 = new java.lang.Object[r2]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r8[r4] = r6
            java.lang.String r6 = "processExpiredCommLibFiles, skip delete WebViewCodeCache for version:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r6, r8)
            goto L_0x013b
        L_0x0124:
            java.lang.Object[] r8 = new java.lang.Object[r2]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
            r8[r4] = r9
            java.lang.String r9 = "processExpiredCommLibFiles, perform delete WebViewCodeCache for version:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r9, r8)
            com.tencent.mm.plugin.appbrand.page.o3$a r8 = com.tencent.p014mm.plugin.appbrand.page.C83864o3.f244851c
            java.lang.String r6 = r8.mo116422b(r6)
            com.tencent.p014mm.vfs.C86013q1.m106446g(r6, r2)
        L_0x013b:
            int r5 = r5 + 1
            goto L_0x010f
        L_0x013e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.appcache.C81259i0.mo113549e():void");
    }

    /* renamed from: f */
    public final void mo113550f() {
        C86009m1 m1Var = new C86009m1(C83864o3.f244851c.mo116423c());
        if (!m1Var.mo119967g() || !m1Var.mo119977o()) {
            m1Var.mo119966f();
            return;
        }
        C86009m1[] u = m1Var.mo119984u();
        if (u == null || u.length == 0) {
            m1Var.mo119966f();
            return;
        }
        HashMap hashMap = new HashMap();
        for (C86009m1 m1Var2 : u) {
            String[] split = m1Var2.getName().split(Pattern.quote("-"));
            if (split == null || split.length < 2) {
                C86013q1.m106447h(m1Var2.mo119971i());
                C86013q1.m106446g(m1Var2.mo119971i(), true);
            } else {
                String str = split[0];
                if (BuildConfig.INSTALL_TYPE.equals(str)) {
                    str = "@LibraryAppId";
                }
                int i = Util.getInt(C90599h.m113521n(split[1], 1), 0);
                int[] iArr = (int[]) hashMap.get(str);
                if (iArr == null) {
                    C81161g2.requireAccountInitializedOnDemand();
                    iArr = C81161g2.f238471g.mo113543y(str);
                    if (iArr == null) {
                        iArr = new int[]{0};
                    }
                    Log.m105925i("MicroMsg.AppBrand.PkgCleanupNewLogic", "processExpiredWebViewCodeCache, select_versionArray(%s), get(%s)", str, C90595a.m113499c(iArr, "-1"));
                    hashMap.put(str, iArr);
                }
                if (!C90595a.m113497a(iArr, i)) {
                    C86013q1.m106447h(m1Var2.mo119971i());
                    C86013q1.m106446g(m1Var2.mo119971i(), true);
                    Log.m105925i("MicroMsg.AppBrand.PkgCleanupNewLogic", "processExpiredWebViewCodeCache, file(%s) deleted", m1Var2.mo119971i());
                }
            }
        }
    }

    /* renamed from: g */
    public final void mo113551g() {
        mo113545a();
        boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_android_appbrand_remove_legacy_wxapkg_dir, false);
        Log.m105925i("MicroMsg.PkgABTest", "removeLegacyWxapkgDir exp:%d", Integer.valueOf(wf ? 1 : 0));
        if (wf) {
            C116281f0 f0Var = C116281f0.C116289i.f348994a;
            C118196a aVar = null;
            C116281f0.C116288h l = f0Var.mo177799l(C116299g2.m163858n("wcf://WxaCodePkgsCache"), (C116281f0.C116288h) null);
            if (l.mo177810a()) {
                Iterable<FileSystem.C85995c> a = new C116335w.C116336a(l.f348991a.mo119930u(), "${accountOtherList}", "account|accountSalt|accountSd").mo177839a(f0Var.mo177791d());
                Iterable[] iterableArr = new Iterable[2];
                iterableArr[0] = Collections.singleton(l.f348991a);
                if (a == null) {
                    a = Collections.emptyList();
                }
                iterableArr[1] = a;
                aVar = new C118196a(new C118201e(iterableArr), new r1$$a(new HashSet(), false, l));
            }
            if (aVar != null) {
                Iterator it = aVar.iterator();
                while (it.hasNext()) {
                    C86001b0 b0Var = (C86001b0) it.next();
                    if ("pkg".equals(b0Var.f250471a)) {
                        Log.m105925i("MicroMsg.AppBrand.PkgCleanupNewLogic", "remove WxaCodePkgsCache path: %b", Boolean.valueOf(b0Var.mo119955b(true)));
                    }
                }
            }
        }
    }

    /* renamed from: h */
    public final void mo113552h() {
        try {
            C81161g2.requireAccountInitializedOnDemand();
            ((WxaSyncCmdPersistentStorage) C81161g2.Bx0(WxaSyncCmdPersistentStorage.class)).mo56568a(C81161g2.f238471g);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.AppBrand.PkgCleanupNewLogic", "processPersistentSyncCommands get exception %s", e);
        }
    }

    /* renamed from: i */
    public final void mo113553i() {
        String str;
        LinkedList<C29563c1> linkedList = new LinkedList<>();
        Cursor all = ((C29567d1) C81161g2.Bx0(C29567d1.class)).getAll();
        if (all != null && !all.isClosed()) {
            try {
                if (all.moveToFirst()) {
                    do {
                        C29563c1 c1Var = new C29563c1();
                        c1Var.convertFrom(all);
                        linkedList.add(c1Var);
                    } while (all.moveToNext());
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.AppBrand.PkgCleanupNewLogic", e, "getDevPkgLaunchExtInfoStorage", new Object[0]);
            } catch (Throwable th) {
                all.close();
                throw th;
            }
            all.close();
            LinkedList linkedList2 = new LinkedList();
            for (C29563c1 c1Var2 : linkedList) {
                String str2 = c1Var2.field_extJson;
                if (Util.isNullOrNil(str2) || (!Util.isNullOrNil(str2) && str2.equals("{}"))) {
                    Log.m105925i("MicroMsg.AppBrand.PkgCleanupNewLogic", "processPluginDebug appID(%s) extJson null", c1Var2.field_appId);
                } else {
                    WxaAttributes.WxaVersionInfo a = C90982g0.m114149a(str2);
                    Objects.requireNonNull(a);
                    List<WxaAttributes.WxaPluginCodeInfo> list = a.f239458j;
                    if (list != null && list.size() > 0) {
                        for (WxaAttributes.WxaPluginCodeInfo next : list) {
                            if (!Util.isNullOrNil(next.f239444n)) {
                                linkedList2.add(next);
                                Log.m105925i("MicroMsg.AppBrand.PkgCleanupNewLogic", "processPluginDebug needKeep provider:%s,versionDesc:%s", next.f239437d, next.f239444n);
                            }
                        }
                    }
                }
            }
            LinkedList<C81227a3> linkedList3 = new LinkedList<>();
            C81161g2.requireAccountInitializedOnDemand();
            Cursor all2 = C81161g2.f238472h.getAll();
            if (all2 != null && !all2.isClosed()) {
                try {
                    if (all2.moveToFirst()) {
                        do {
                            C81227a3 a3Var = new C81227a3();
                            a3Var.convertFrom(all2);
                            linkedList3.add(a3Var);
                        } while (all2.moveToNext());
                    }
                } catch (Exception e2) {
                    Log.printErrStackTrace("MicroMsg.AppBrand.PkgCleanupNewLogic", e2, "getWxaPkgDescIndexedStorage", new Object[0]);
                } catch (Throwable th4) {
                    all2.close();
                    throw th4;
                }
                all2.close();
                for (C81227a3 a3Var2 : linkedList3) {
                    Log.m105919d("MicroMsg.AppBrand.PkgCleanupNewLogic", "processPluginDebug pkgRecord provider:%s", a3Var2.field_appId);
                    Iterator it = linkedList2.iterator();
                    boolean z = false;
                    while (true) {
                        str = "";
                        if (!it.hasNext()) {
                            break;
                        }
                        WxaAttributes.WxaPluginCodeInfo wxaPluginCodeInfo = (WxaAttributes.WxaPluginCodeInfo) it.next();
                        if (!Util.isNullOrNil(a3Var2.field_appId) && !Util.isNullOrNil(wxaPluginCodeInfo.f239437d) && !Util.isNullOrNil(a3Var2.field_versionDesc) && !Util.isNullOrNil(wxaPluginCodeInfo.f239444n)) {
                            String str3 = a3Var2.field_appId;
                            String str4 = null;
                            String str5 = wxaPluginCodeInfo.f239437d;
                            if (Util.isNullOrNil((String) null)) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(str5);
                                if (!Util.isNullOrNil(ModulePkgInfo.PLUGIN_CODE)) {
                                    str = '$' + ModulePkgInfo.PLUGIN_CODE;
                                }
                                sb.append(str);
                                str4 = sb.toString();
                            }
                            if (str3.equals(str4) && a3Var2.field_versionDesc.equals(wxaPluginCodeInfo.f239444n)) {
                                z = true;
                            }
                        }
                    }
                    if (!z) {
                        C68579f0.m80843a(a3Var2.field_pkgPath);
                        C81161g2.requireAccountInitializedOnDemand();
                        boolean delete = C81161g2.f238472h.delete(a3Var2, new String[0]);
                        if (!Util.isNullOrNil(a3Var2.field_appId) && a3Var2.field_appId.contains("$")) {
                            str = a3Var2.field_appId.split(Pattern.quote("$"))[0];
                        }
                        Log.m105925i("MicroMsg.AppBrand.PkgCleanupNewLogic", "processPluginDebug no need keep dev plugin provider:%s,pkgPath:%s,deletePkgRecord:%b,deletePluginContactRecord:%b", str, a3Var2.field_pkgPath, Boolean.valueOf(delete), Boolean.valueOf(((C29583l3) C81161g2.Bx0(C29583l3.class)).mo56824jo(str, a3Var2.field_versionDesc)));
                    }
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r11v4, types: [boolean] */
    /* JADX WARNING: Removed duplicated region for block: B:153:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0326  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo113554j(java.util.List<com.tencent.p014mm.plugin.appbrand.appcache.C29208e0> r22) {
        /*
            r21 = this;
            r0 = r22
            r21.mo113545a()
            com.tencent.p014mm.plugin.appbrand.app.C81161g2.requireAccountInitializedOnDemand()
            com.tencent.mm.plugin.appbrand.appcache.h3 r1 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.f238471g
            r1.getClass()
            java.util.Locale r2 = java.util.Locale.ENGLISH
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r5 = 0
            java.lang.String r6 = "appId"
            r4[r5] = r6
            r7 = 1
            java.lang.String r8 = "AppBrandWxaPkgManifestRecord"
            r4[r7] = r8
            java.lang.String r8 = "select distinct %s from %s"
            java.lang.String r2 = java.lang.String.format(r2, r8, r4)
            com.tencent.mm.sdk.storage.ISQLiteDatabase r1 = r1.f238664d
            r4 = 0
            android.database.Cursor r1 = r1.rawQuery(r2, r4)
            r2 = 36
            if (r1 == 0) goto L_0x0069
            boolean r4 = r1.moveToFirst()     // Catch:{ all -> 0x005d }
            if (r4 == 0) goto L_0x0069
            java.util.HashSet r4 = new java.util.HashSet     // Catch:{ all -> 0x005d }
            r4.<init>()     // Catch:{ all -> 0x005d }
        L_0x0039:
            java.lang.String r8 = r1.getString(r5)     // Catch:{ all -> 0x005d }
            int r9 = r8.indexOf(r2)     // Catch:{ all -> 0x005d }
            if (r9 >= 0) goto L_0x0047
            r4.add(r8)     // Catch:{ all -> 0x005d }
            goto L_0x004e
        L_0x0047:
            java.lang.String r8 = r8.substring(r5, r9)     // Catch:{ all -> 0x005d }
            r4.add(r8)     // Catch:{ all -> 0x005d }
        L_0x004e:
            boolean r8 = r1.moveToNext()     // Catch:{ all -> 0x005d }
            if (r8 != 0) goto L_0x0039
            java.util.LinkedList r8 = new java.util.LinkedList     // Catch:{ all -> 0x005d }
            r8.<init>(r4)     // Catch:{ all -> 0x005d }
            r1.close()
            goto L_0x0072
        L_0x005d:
            r0 = move-exception
            r2 = r0
            r1.close()     // Catch:{ all -> 0x0063 }
            goto L_0x0068
        L_0x0063:
            r0 = move-exception
            r1 = r0
            r2.addSuppressed(r1)
        L_0x0068:
            throw r2
        L_0x0069:
            if (r1 == 0) goto L_0x006e
            r1.close()
        L_0x006e:
            java.util.List r8 = java.util.Collections.emptyList()
        L_0x0072:
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            r21.mo113545a()
            com.tencent.mm.plugin.appbrand.appcache.i0$a r4 = new com.tencent.mm.plugin.appbrand.appcache.i0$a
            r9 = r21
            r4.<init>(r9)
            java.util.Iterator r8 = r8.iterator()
        L_0x0085:
            boolean r10 = r8.hasNext()
            java.lang.String r11 = "__PLUGINCODE__"
            java.lang.String r12 = "MicroMsg.AppBrand.PkgCleanupNewLogic"
            r13 = 4
            if (r10 == 0) goto L_0x031e
            java.lang.Object r10 = r8.next()
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r14 = "@LibraryAppId"
            boolean r14 = r14.equals(r10)
            if (r14 == 0) goto L_0x00a0
            goto L_0x0143
        L_0x00a0:
            com.tencent.mm.plugin.appbrand.task.AppBrandProcessesManager r14 = com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager.m103869I()
            boolean r14 = r14.mo111385G(r10, r5)
            if (r14 == 0) goto L_0x00b6
            java.lang.Object[] r11 = new java.lang.Object[r7]
            r11[r5] = r10
            java.lang.String r10 = "processRelease appID(%s) is running, skip"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r10, r11)
            goto L_0x0143
        L_0x00b6:
            wi0.e0 r14 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.Cx0()
            java.lang.String r17 = "versionInfo"
            java.lang.String[] r2 = new java.lang.String[]{r17}
            com.tencent.mm.plugin.appbrand.config.WxaAttributes r2 = r14.mo114011mL(r10, r2)
            if (r2 == 0) goto L_0x0304
            java.lang.String r14 = r2.field_versionInfo
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            if (r14 == 0) goto L_0x00d1
            goto L_0x0304
        L_0x00d1:
            r21.mo113545a()
            boolean r14 = r4.containsKey(r10)
            if (r14 == 0) goto L_0x012e
            java.lang.Object r2 = r4.get(r10)
            com.tencent.mm.plugin.appbrand.appcache.predownload.export.p$b r2 = (com.tencent.p014mm.plugin.appbrand.appcache.predownload.export.C81331p.C29266b) r2
            if (r2 != 0) goto L_0x00ed
            java.lang.Object[] r2 = new java.lang.Object[r7]
            r2[r5] = r10
            java.lang.String r10 = "processReleaseContact, for export occupied, pkg(%s) is null!"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r12, r10, r2)
            goto L_0x0143
        L_0x00ed:
            com.tencent.p014mm.plugin.appbrand.app.C81161g2.requireAccountInitializedOnDemand()
            com.tencent.mm.plugin.appbrand.appcache.h3 r10 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.f238471g
            java.lang.String r11 = r2.f79951d
            int r14 = r2.f79952e
            int r15 = r2.f79953f
            int r10 = r10.mo113523g(r11, r14, r15)
            com.tencent.p014mm.plugin.appbrand.app.C81161g2.requireAccountInitializedOnDemand()
            com.tencent.mm.plugin.appbrand.appcache.h3 r11 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.f238471g
            java.lang.String r14 = r2.f79951d
            int r15 = r2.f79952e
            int r3 = r2.f79953f
            int r3 = r11.mo113522f(r14, r15, r3)
            java.lang.Object[] r11 = new java.lang.Object[r13]
            java.lang.String r13 = r2.f79951d
            r11[r5] = r13
            int r2 = r2.f79953f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r11[r7] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            r10 = 2
            r11[r10] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r3 = 3
            r11[r3] = r2
            java.lang.String r2 = "processReleaseContact, for export occupied, delete record(%s) < %d, deleting pkgCount: %d, moduleCount: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r2, r11)
            goto L_0x0143
        L_0x012e:
            com.tencent.mm.plugin.appbrand.appcache.e0 r3 = new com.tencent.mm.plugin.appbrand.appcache.e0
            r3.<init>(r10, r5)
            boolean r14 = r0.contains(r3)
            if (r14 == 0) goto L_0x0148
            java.lang.Object[] r2 = new java.lang.Object[r7]
            r2[r5] = r3
            java.lang.String r3 = "processReleaseContact appPkg: %s is in white list, skip"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r3, r2)
        L_0x0143:
            r2 = 36
            r3 = 2
            goto L_0x0085
        L_0x0148:
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo r3 = r2.mo113942o2()
            if (r3 != 0) goto L_0x0150
            r3 = 0
            goto L_0x0156
        L_0x0150:
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo r3 = r2.mo113942o2()
            int r3 = r3.f239452d
        L_0x0156:
            if (r3 <= 0) goto L_0x02f8
            java.lang.Class<wi0.b0> r14 = wi0.C90975b0.class
            java.lang.Object r14 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.Bx0(r14)
            wi0.b0 r14 = (wi0.C90975b0) r14
            java.lang.String r2 = r2.field_appId
            java.lang.String[] r15 = new java.lang.String[r5]
            com.tencent.mm.plugin.appbrand.config.WxaAttributes r2 = r14.mo114011mL(r2, r15)
            if (r2 == 0) goto L_0x0178
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo r14 = r2.mo113942o2()
            if (r14 != 0) goto L_0x0171
            goto L_0x0178
        L_0x0171:
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo r2 = r2.mo113942o2()
            int r2 = r2.f239452d
            goto L_0x0179
        L_0x0178:
            r2 = 0
        L_0x0179:
            com.tencent.p014mm.plugin.appbrand.app.C81161g2.requireAccountInitializedOnDemand()
            com.tencent.mm.plugin.appbrand.appcache.h3 r14 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.f238471g
            int[] r14 = r14.mo113543y(r10)
            com.tencent.p014mm.plugin.appbrand.app.C81161g2.requireAccountInitializedOnDemand()
            com.tencent.mm.plugin.appbrand.appcache.h3 r15 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.f238471g
            int[] r13 = new int[r7]
            r13[r5] = r2
            java.lang.String r7 = "version"
            java.lang.String r5 = "deleteReleasePkgsBelowVersionIncludingModulesAndExcludeVersions(appId:%s, maxVersion:%d, excludeVersion:%s) deleteCount:%d"
            r18 = r4
            java.lang.String r4 = "MicroMsg.AppBrandWxaPkgStorage"
            r19 = r8
            java.lang.String r8 = " AND "
            r15.getClass()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x02d8 }
            r9.<init>()     // Catch:{ all -> 0x02d8 }
            r9.append(r6)     // Catch:{ all -> 0x02d8 }
            java.lang.String r0 = " like ?"
            r9.append(r0)     // Catch:{ all -> 0x02d8 }
            r9.append(r8)     // Catch:{ all -> 0x02d8 }
            r9.append(r6)     // Catch:{ all -> 0x02d8 }
            java.lang.String r0 = " != ?"
            r9.append(r0)     // Catch:{ all -> 0x02d8 }
            r9.append(r8)     // Catch:{ all -> 0x02d8 }
            java.lang.String r0 = "debugType"
            r9.append(r0)     // Catch:{ all -> 0x02d8 }
            java.lang.String r0 = " = "
            r9.append(r0)     // Catch:{ all -> 0x02d8 }
            r0 = r6
            r6 = 0
            r9.append(r6)     // Catch:{ all -> 0x02d8 }
            r9.append(r8)     // Catch:{ all -> 0x02d8 }
            r9.append(r7)     // Catch:{ all -> 0x02d8 }
            java.lang.String r6 = " <?"
            r9.append(r6)     // Catch:{ all -> 0x02d8 }
            r9.append(r8)     // Catch:{ all -> 0x02d8 }
            r20 = r1
            r1 = 1
            r6 = 0
        L_0x01d7:
            if (r6 >= r1) goto L_0x01ea
            r1 = r13[r6]     // Catch:{ all -> 0x02d8 }
            r9.append(r7)     // Catch:{ all -> 0x02d8 }
            java.lang.String r1 = " !=?"
            r9.append(r1)     // Catch:{ all -> 0x02d8 }
            r9.append(r8)     // Catch:{ all -> 0x02d8 }
            int r6 = r6 + 1
            r1 = 1
            goto L_0x01d7
        L_0x01ea:
            java.lang.String r1 = "1=1"
            r9.append(r1)     // Catch:{ all -> 0x02d8 }
            r1 = 4
            java.lang.String[] r6 = new java.lang.String[r1]     // Catch:{ all -> 0x02d8 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x02d8 }
            r1.<init>()     // Catch:{ all -> 0x02d8 }
            r1.append(r10)     // Catch:{ all -> 0x02d8 }
            r7 = 36
            r1.append(r7)     // Catch:{ all -> 0x02d8 }
            r7 = 37
            r1.append(r7)     // Catch:{ all -> 0x02d8 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x02d8 }
            r7 = 0
            r6[r7] = r1     // Catch:{ all -> 0x02d8 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x02d8 }
            r1.<init>()     // Catch:{ all -> 0x02d8 }
            r1.append(r10)     // Catch:{ all -> 0x02d8 }
            r7 = 36
            r1.append(r7)     // Catch:{ all -> 0x02d8 }
            r1.append(r11)     // Catch:{ all -> 0x02d8 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x02d8 }
            r8 = 1
            r6[r8] = r1     // Catch:{ all -> 0x02d8 }
            java.lang.String r1 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x02d8 }
            r11 = 2
            r6[r11] = r1     // Catch:{ all -> 0x02d8 }
            r1 = 3
            r11 = 0
        L_0x022b:
            if (r11 >= r8) goto L_0x023b
            r8 = r13[r11]     // Catch:{ all -> 0x02d8 }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x02d8 }
            r6[r1] = r8     // Catch:{ all -> 0x02d8 }
            int r1 = r1 + 1
            int r11 = r11 + 1
            r8 = 1
            goto L_0x022b
        L_0x023b:
            com.tencent.mm.sdk.storage.ISQLiteDatabase r1 = r15.f238664d     // Catch:{ all -> 0x02d8 }
            java.lang.String r8 = r15.mo113531o()     // Catch:{ all -> 0x02d8 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x02d8 }
            int r1 = r1.delete(r8, r9, r6)     // Catch:{ all -> 0x02d8 }
            r6 = 4
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r8 = 0
            r6[r8] = r10
            java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
            r11 = 1
            r6[r11] = r9
            java.lang.String r9 = java.util.Arrays.toString(r13)
            r13 = 2
            r6[r13] = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)
            r15 = 3
            r6[r15] = r9
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r6)
            if (r1 <= 0) goto L_0x02bb
            java.lang.Object[] r4 = new java.lang.Object[r15]
            r4[r8] = r10
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            r4[r11] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            r4[r13] = r5
            java.lang.String r5 = "processRelease, delete record(%s) < %d, count(%d)"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r5, r4)
            com.tencent.mm.autogen.mmdata.rpt.WeAppPackageDeleteActionStruct r4 = new com.tencent.mm.autogen.mmdata.rpt.WeAppPackageDeleteActionStruct
            r4.<init>()
            r5 = 2
            r4.f79220d = r5
            java.lang.String r5 = "Appid"
            java.lang.String r5 = r4.mo86045b(r5, r10, r11)
            r4.f79221e = r5
            r5 = 0
            r4.f79222f = r5
            long r5 = (long) r1
            r4.f79223g = r5
            r5 = 1
            r4.f79224h = r5
            r4.mo86054n()
            if (r14 == 0) goto L_0x02bb
            int r1 = r14.length
            if (r1 <= 0) goto L_0x02bb
            int r1 = r14.length
            r4 = 0
        L_0x02a5:
            if (r4 >= r1) goto L_0x02bb
            r5 = r14[r4]
            if (r5 >= r3) goto L_0x02b8
            if (r5 != r2) goto L_0x02ae
            goto L_0x02b8
        L_0x02ae:
            com.tencent.mm.plugin.appbrand.page.o3$a r6 = com.tencent.p014mm.plugin.appbrand.page.C83864o3.f244851c
            java.lang.String r5 = r6.mo116421a(r10, r5)
            r6 = 1
            com.tencent.p014mm.vfs.C86013q1.m106446g(r5, r6)
        L_0x02b8:
            int r4 = r4 + 1
            goto L_0x02a5
        L_0x02bb:
            java.lang.Class<gs0.b> r1 = gs0.C87324b.class
            java.lang.Object r1 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.Bx0(r1)
            gs0.b r1 = (gs0.C87324b) r1
            gs0.b$b$c r2 = new gs0.b$b$c
            r2.<init>(r3)
            r4 = 0
            r1.mo121719jo(r10, r4, r2)
            java.lang.Class<com.tencent.mm.plugin.appbrand.appcache.a4> r1 = com.tencent.p014mm.plugin.appbrand.appcache.C29182a4.class
            java.lang.Object r1 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.Bx0(r1)
            com.tencent.mm.plugin.appbrand.appcache.a4 r1 = (com.tencent.p014mm.plugin.appbrand.appcache.C29182a4) r1
            r1.mo56499jo(r10, r3)
            goto L_0x0301
        L_0x02d8:
            r0 = move-exception
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r10
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6 = 1
            r1[r6] = r3
            java.lang.String r3 = java.util.Arrays.toString(r13)
            r6 = 2
            r1[r6] = r3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 3
            r1[r3] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r1)
            throw r0
        L_0x02f8:
            r20 = r1
            r18 = r4
            r0 = r6
            r19 = r8
            r7 = 36
        L_0x0301:
            r1 = r20
            goto L_0x030e
        L_0x0304:
            r18 = r4
            r0 = r6
            r19 = r8
            r7 = 36
            r1.add(r10)
        L_0x030e:
            r9 = r21
            r6 = r0
            r4 = r18
            r8 = r19
            r2 = 36
            r3 = 2
            r5 = 0
            r7 = 1
            r0 = r22
            goto L_0x0085
        L_0x031e:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r1)
            if (r0 == 0) goto L_0x0326
            goto L_0x04d9
        L_0x0326:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>(r1)
            java.lang.Class<kr0.b1> r1 = kr0.C33987b1.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            java.lang.String r2 = "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgStorageExportServiceImpl"
            gy3.C87412m.m108592e(r1, r2)
            com.tencent.mm.plugin.appbrand.appcache.predownload.export.p r1 = (com.tencent.p014mm.plugin.appbrand.appcache.predownload.export.C81331p) r1
            java.util.List r1 = r1.vx0()
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L_0x03b9
            java.util.Iterator r1 = r1.iterator()
        L_0x0346:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x03b9
            java.lang.Object r2 = r1.next()
            com.tencent.mm.plugin.appbrand.appcache.predownload.export.p$b r2 = (com.tencent.p014mm.plugin.appbrand.appcache.predownload.export.C81331p.C29266b) r2
            if (r2 != 0) goto L_0x0355
            goto L_0x0346
        L_0x0355:
            java.lang.String r3 = r2.f79951d
            r0.remove(r3)
            hi0.v r3 = hi0.C87507t.m108819a()
            java.lang.String r4 = r2.f79951d
            boolean r3 = r3.mo121959a(r4)
            if (r3 == 0) goto L_0x0375
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r2 = r2.f79951d
            r3 = 0
            r4[r3] = r2
            java.lang.String r2 = "processReleaseWithoutContact, for export occupied, appID(%s) is pre-download-ing, skip"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r2, r4)
            goto L_0x0346
        L_0x0375:
            com.tencent.p014mm.plugin.appbrand.app.C81161g2.requireAccountInitializedOnDemand()
            com.tencent.mm.plugin.appbrand.appcache.h3 r3 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.f238471g
            java.lang.String r4 = r2.f79951d
            int r5 = r2.f79952e
            int r6 = r2.f79953f
            int r3 = r3.mo113523g(r4, r5, r6)
            com.tencent.p014mm.plugin.appbrand.app.C81161g2.requireAccountInitializedOnDemand()
            com.tencent.mm.plugin.appbrand.appcache.h3 r4 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.f238471g
            java.lang.String r5 = r2.f79951d
            int r6 = r2.f79952e
            int r7 = r2.f79953f
            int r4 = r4.mo113522f(r5, r6, r7)
            r5 = 4
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.String r5 = r2.f79951d
            r7 = 0
            r6[r7] = r5
            int r2 = r2.f79953f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5 = 1
            r6[r5] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r3 = 2
            r6[r3] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r3 = 3
            r6[r3] = r2
            java.lang.String r2 = "processReleaseWithoutContact, for export occupied, delete record(%s) < %d, deleting pkgCount: %d, moduleCount: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r2, r6)
            goto L_0x0346
        L_0x03b9:
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig r3 = com.tencent.p014mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.m100099b()
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig$PackageManager r3 = r3.f239288K
            long r3 = r3.f239338e
            long r1 = r1 - r3
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
            long r1 = r3.toMillis(r1)
            java.util.Iterator r0 = r0.iterator()
        L_0x03d0:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x04d9
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            com.tencent.mm.plugin.appbrand.appcache.e0 r4 = new com.tencent.mm.plugin.appbrand.appcache.e0
            r5 = 0
            r4.<init>(r3, r5)
            r6 = r22
            boolean r7 = r6.contains(r4)
            if (r7 == 0) goto L_0x03f6
            r7 = 1
            java.lang.Object[] r3 = new java.lang.Object[r7]
            r3[r5] = r4
            java.lang.String r4 = "processReleaseWithoutContact appPkg: %s is in white list, skip"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r4, r3)
            goto L_0x03d0
        L_0x03f6:
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r4 != 0) goto L_0x0403
            boolean r4 = r3.endsWith(r11)
            if (r4 == 0) goto L_0x0403
            goto L_0x03d0
        L_0x0403:
            hi0.v r4 = hi0.C87507t.m108819a()
            boolean r4 = r4.mo121959a(r3)
            if (r4 == 0) goto L_0x041a
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r4 = 0
            r5[r4] = r3
            java.lang.String r3 = "processReleaseWithoutContact appID(%s) is pre-download-ing, skip"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r3, r5)
            goto L_0x03d0
        L_0x041a:
            r4 = 0
            com.tencent.p014mm.plugin.appbrand.app.C81161g2.requireAccountInitializedOnDemand()
            com.tencent.mm.plugin.appbrand.appcache.h3 r5 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.f238471g
            java.util.List r3 = r5.mo113538t(r3, r4)
            java.util.Iterator r3 = r3.iterator()
        L_0x0428:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x03d0
            java.lang.Object r4 = r3.next()
            com.tencent.mm.plugin.appbrand.appcache.z2 r4 = (com.tencent.p014mm.plugin.appbrand.appcache.C29315z2) r4
            java.lang.String r7 = r4.field_pkgPath
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 == 0) goto L_0x0457
            r7 = 2
            java.lang.Object[] r8 = new java.lang.Object[r7]
            java.lang.String r7 = r4.field_appId
            r9 = 0
            r8[r9] = r7
            int r7 = r4.field_version
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r9 = 1
            r8[r9] = r7
            java.lang.String r7 = "processReleaseWithoutContact, empty path, delete record(%s, %d)"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r7, r8)
            r5.mo113517a(r4)
            goto L_0x0428
        L_0x0457:
            java.lang.String r7 = r4.field_pkgPath
            long r7 = com.tencent.p014mm.vfs.C86013q1.m106452m(r7)
            r9 = 0
            int r13 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r13 > 0) goto L_0x047e
            r13 = 2
            java.lang.Object[] r7 = new java.lang.Object[r13]
            java.lang.String r8 = r4.field_appId
            r13 = 0
            r7[r13] = r8
            int r8 = r4.field_version
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r13 = 1
            r7[r13] = r8
            java.lang.String r8 = "processReleaseWithoutContact, path not found, delete record(%s, %d)"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r8, r7)
            r5.mo113517a(r4)
            goto L_0x0428
        L_0x047e:
            r13 = 1
            int r14 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r14 > 0) goto L_0x04b1
            r14 = 4
            java.lang.Object[] r15 = new java.lang.Object[r14]
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r8 = 0
            r15[r8] = r7
            java.lang.Long r7 = java.lang.Long.valueOf(r1)
            r15[r13] = r7
            java.lang.String r7 = r4.field_appId
            r8 = 2
            r15[r8] = r7
            int r7 = r4.field_version
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8 = 3
            r15[r8] = r7
            java.lang.String r7 = "processReleaseWithoutContact, file expired(mtime:%d, expired_time:%d), delete record(%s, %d)"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r7, r15)
            java.lang.String r7 = r4.field_pkgPath
            com.tencent.p014mm.vfs.C86013q1.m106447h(r7)
            r5.mo113517a(r4)
            goto L_0x0428
        L_0x04b1:
            r13 = 4
            java.lang.Object[] r14 = new java.lang.Object[r13]
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r8 = 0
            r14[r8] = r7
            java.lang.Long r7 = java.lang.Long.valueOf(r1)
            r15 = 1
            r14[r15] = r7
            java.lang.String r7 = r4.field_appId
            r16 = 2
            r14[r16] = r7
            int r4 = r4.field_version
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r7 = 3
            r14[r7] = r4
            java.lang.String r4 = "processReleaseWithoutContact, file valid(mtime:%d, expired_time:%d), keep it(%s, %d)."
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r4, r14)
            goto L_0x0428
        L_0x04d9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.appcache.C81259i0.mo113554j(java.util.List):void");
    }

    /* renamed from: k */
    public void mo113555k() {
        Class cls = C84871v.class;
        C86009m1 m1Var = new C86009m1(C81355t2.m99777c());
        if (m1Var.mo119967g() && m1Var.mo119977o()) {
            C86009m1[] v = m1Var.mo119985v(new C81261b(this));
            if (v != null) {
                for (C86009m1 m1Var2 : v) {
                    C81161g2.requireAccountInitializedOnDemand();
                    if (!C81161g2.f238471g.mo113524h(m1Var2.mo119971i())) {
                        C84871v vVar = (C84871v) C86312j.m106911c(cls);
                        if (!(vVar != null ? vVar.mo117589zk(m1Var2) : false)) {
                            C68579f0.m80843a(m1Var2.mo119971i());
                        }
                    }
                }
            }
            C81295n0 n0Var = (C81295n0) C86312j.m106911c(C81295n0.class);
            ArrayList arrayList = new ArrayList();
            C81355t2.m99779e(C81355t2.m99776b(), arrayList);
            for (C86009m1 m1Var3 : (C86009m1[]) arrayList.toArray(new C86009m1[0])) {
                String i = m1Var3.mo119971i();
                C81161g2.requireAccountInitializedOnDemand();
                if (!C81161g2.f238471g.mo113524h(i)) {
                    C84871v vVar2 = (C84871v) C86312j.m106911c(cls);
                    if (!(vVar2 != null ? vVar2.mo117589zk(m1Var3) : false)) {
                        n0Var.mo56503tJ(i);
                        if (n0Var.mo56501An(i) <= 0) {
                            C68579f0.m80843a(i);
                        }
                    }
                }
            }
        }
    }

    public void run() {
        C81161g2.requireAccountInitializedOnDemand();
        if (C81161g2.f238471g == null) {
            Log.m105920e("MicroMsg.AppBrand.PkgCleanupNewLogic", "run() entered but storage not ready");
            return;
        }
        this.f238666d.set(false);
        try {
            C115669n.INSTANCE.mo175911u(1007, 1);
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.AppBrand.PkgCleanupNewLogic", th, "cleanup start report", new Object[0]);
        }
        long currentTicks = Util.currentTicks();
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((CopyOnWriteArrayList) this.f238667e).iterator();
            while (it.hasNext()) {
                arrayList.addAll(((C81256h0) it.next()).mo113511e());
            }
            mo113547c(arrayList);
            mo113553i();
            mo113549e();
            mo113554j(arrayList);
            mo113548d(arrayList);
            mo113555k();
            mo113550f();
            mo113552h();
            mo113546b(arrayList);
            mo113551g();
        } catch (InterruptedException e) {
            Log.m105925i("MicroMsg.AppBrand.PkgCleanupNewLogic", "interrupted %s", android.util.Log.getStackTraceString(e));
        } catch (Throwable th4) {
            Log.printErrStackTrace("MicroMsg.AppBrand.PkgCleanupNewLogic", th4, "process occur exception", new Object[0]);
        } finally {
            Log.m105925i("MicroMsg.AppBrand.PkgCleanupNewLogic", "run() cost %dms", Long.valueOf(Util.currentTicks() - currentTicks));
        }
    }
}
