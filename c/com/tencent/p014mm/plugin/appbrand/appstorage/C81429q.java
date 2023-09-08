package com.tencent.p014mm.plugin.appbrand.appstorage;

import android.database.Cursor;
import android.net.Uri;
import com.tencent.p014mm.autogen.mmdata.rpt.WeAppFileSystemTempFileLastOccupationStatStruct;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.appcache.C29229o1;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandGlobalSystemConfig;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82419d1;
import com.tencent.p014mm.plugin.appbrand.jsapi.nfc.C82852c;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.FilePathGenerator;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86001b0;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86011o1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.file.XVFSFile;
import com.tencent.xweb.util.WXWebReporter;
import gy3.C8480h;
import gy3.C87412m;
import iy3.C60641c;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import z04.C112551y;

/* renamed from: com.tencent.mm.plugin.appbrand.appstorage.q */
public final class C81429q {

    /* renamed from: a */
    public static final C81431b f238972a = new C81431b((C8480h) null);

    /* renamed from: b */
    public static final long f238973b = TimeUnit.DAYS.toMillis(1);

    /* renamed from: c */
    public static final C86011o1 f238974c = C81430a.f238975a;

    /* renamed from: com.tencent.mm.plugin.appbrand.appstorage.q$a */
    public static final class C81430a implements C86011o1 {

        /* renamed from: a */
        public static final C81430a f238975a = new C81430a();

        public final boolean accept(C86009m1 m1Var) {
            C87412m.m108594g(m1Var, "pathname");
            String name = m1Var.getName();
            C87412m.m108593f(name, "pathname.name");
            if (C112551y.m153808h(name, ".data", false, 2, (Object) null)) {
                return false;
            }
            String name2 = m1Var.getName();
            C87412m.m108593f(name2, "pathname.name");
            if (C112551y.m153819s(name2, "store_", false)) {
                return false;
            }
            String name3 = m1Var.getName();
            C87412m.m108593f(name3, "pathname.name");
            return !C112551y.m153808h(name3, FilePathGenerator.NO_MEDIA_FILENAME, false, 2, (Object) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appstorage.q$b */
    public static final class C81431b {
        public C81431b(C8480h hVar) {
        }

        /* renamed from: a */
        public final boolean mo113749a(String str) {
            C86001b0 q;
            if (C86013q1.m106450k(str + "/dir.lock")) {
                long nowMilliSecond = Util.nowMilliSecond();
                Uri n = C116299g2.m163858n(str + "/dir.lock");
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
                if (nowMilliSecond - j < C81429q.f238973b) {
                    Log.m105925i("MicroMsg.AppBrandTempFileCleaner", "checkAppDirHasLocked path %s, locked", str);
                    return true;
                }
                Log.m105921e("MicroMsg.AppBrandTempFileCleaner", "checkAppDirHasLocked path %s, lock expired", str);
            }
            Log.m105925i("MicroMsg.AppBrandTempFileCleaner", "checkAppDirHasLocked path %s, lock free", str);
            return false;
        }

        /* renamed from: b */
        public final void mo113750b(long j, WeAppFileSystemTempFileLastOccupationStatStruct weAppFileSystemTempFileLastOccupationStatStruct) {
            long j2;
            LinkedList linkedList;
            Iterator it;
            long j3;
            long j4 = j;
            WeAppFileSystemTempFileLastOccupationStatStruct weAppFileSystemTempFileLastOccupationStatStruct2 = weAppFileSystemTempFileLastOccupationStatStruct;
            long currentTimeMillis = System.currentTimeMillis();
            int i = C82419d1.f241503f;
            C86009m1[] u = new C86009m1(AppBrandLocalMediaObjectManager.f238909a).mo119984u();
            if (u != null) {
                j2 = 0;
                for (C86009m1 m1Var : u) {
                    AppBrandStorageQuotaManager appBrandStorageQuotaManager = AppBrandStorageQuotaManager.f238916a;
                    String name = m1Var.getName();
                    C87412m.m108593f(name, "it.name");
                    if (appBrandStorageQuotaManager.mo113687d(name, "temp")) {
                        String name2 = m1Var.getName();
                        C87412m.m108593f(name2, "it.name");
                        j3 = appBrandStorageQuotaManager.mo113686c(name2, "temp");
                    } else {
                        String name3 = m1Var.getName();
                        C87412m.m108593f(name3, "it.name");
                        j3 = appBrandStorageQuotaManager.mo113684a(name3, "temp", m1Var);
                    }
                    j2 += j3;
                }
            } else {
                j2 = 0;
            }
            Log.m105924i("MicroMsg.AppBrandTempFileCleaner", "checkTotalTempFileLimit current: " + j2 + " max: " + j4 + " cost:" + (System.currentTimeMillis() - currentTimeMillis));
            if (weAppFileSystemTempFileLastOccupationStatStruct2 != null) {
                weAppFileSystemTempFileLastOccupationStatStruct2.f236567k = C60641c.m70922c(((double) j2) / 1024.0d);
            }
            if (j2 > j4) {
                if (weAppFileSystemTempFileLastOccupationStatStruct2 != null) {
                    weAppFileSystemTempFileLastOccupationStatStruct2.f236569m = 1;
                }
                long j5 = j4 / ((long) 2);
                long j6 = j2 - j5;
                C29229o1 o1Var = (C29229o1) C81161g2.Bx0(C29229o1.class);
                if (o1Var != null) {
                    linkedList = new LinkedList();
                    Cursor query = o1Var.f79885d.query("PkgUsageLRURecord", new String[]{"appId"}, (String) null, (String[]) null, (String) null, (String) null, String.format(Locale.US, " %s, %s ASC", new Object[]{"hit", "hitTimeMS"}), 2);
                    if (query != null) {
                        if (!query.moveToFirst()) {
                            query.close();
                        } else {
                            do {
                                try {
                                    linkedList.add(query.getString(0));
                                } catch (Exception e) {
                                    Log.m105921e("MicroMsg.PkgUsageLRUStorage", "getLRUAppIdList error:%s", e);
                                } catch (Throwable th) {
                                    query.close();
                                    throw th;
                                }
                            } while (query.moveToNext());
                            query.close();
                        }
                    }
                } else {
                    linkedList = null;
                }
                C87412m.m108591d(linkedList);
                int i2 = C82419d1.f241503f;
                C86009m1[] u2 = new C86009m1(AppBrandLocalMediaObjectManager.f238909a).mo119984u();
                if (u2 != null) {
                    for (C86009m1 m1Var2 : u2) {
                        if (!linkedList.contains(m1Var2.getName())) {
                            linkedList.addFirst(m1Var2.getName());
                        }
                    }
                }
                for (Iterator it4 = linkedList.iterator(); it4.hasNext(); it4 = it) {
                    String str = (String) it4.next();
                    AppBrandStorageQuotaManager appBrandStorageQuotaManager2 = AppBrandStorageQuotaManager.f238916a;
                    C87412m.m108593f(str, "appId");
                    long c = appBrandStorageQuotaManager2.mo113686c(str, "temp");
                    if (c > 0) {
                        C81431b bVar = C81429q.f238972a;
                        StringBuilder sb = new StringBuilder();
                        it = it4;
                        sb.append(AppBrandLocalMediaObjectManager.f238909a);
                        sb.append(str);
                        sb.append(XVFSFile.SEPARATOR_CHAR);
                        C86009m1 m1Var3 = new C86009m1(sb.toString());
                        Log.m105924i("MicroMsg.AppBrandTempFileCleaner", "pruneAppDirTempFiles " + m1Var3.mo119971i());
                        if (m1Var3.mo119967g() && m1Var3.mo119977o()) {
                            String i3 = m1Var3.mo119971i();
                            C87412m.m108593f(i3, "dir.absolutePath");
                            if (!bVar.mo113749a(i3)) {
                                C86009m1[] v = m1Var3.mo119985v(C81429q.f238974c);
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("pruneAppDirTempFiles listFile done:");
                                sb4.append(v != null ? Integer.valueOf(v.length) : null);
                                Log.m105924i("MicroMsg.AppBrandTempFileCleaner", sb4.toString());
                                if (v != null) {
                                    for (C86009m1 i4 : v) {
                                        C86013q1.m106447h(i4.mo119971i());
                                    }
                                }
                                AppBrandStorageQuotaManager.f238916a.mo113690g(str, "temp", 0, true);
                            }
                        }
                        j6 -= c;
                    } else {
                        it = it4;
                    }
                    if (j6 <= 0) {
                        break;
                    }
                }
                Log.m105924i("MicroMsg.AppBrandTempFileCleaner", "allAppDir lru clean done, nowSize:" + (j5 + j6));
                Log.m105924i("MicroMsg.AppBrandTempFileCleaner", "checkTotalTempFileLimit cost " + (System.currentTimeMillis() - currentTimeMillis));
            }
        }
    }

    /* renamed from: a */
    public static final void m99908a() {
        C81431b bVar = f238972a;
        long j = ((long) AppBrandGlobalSystemConfig.m100099b().f239306g) * ((long) 1048576);
        Log.m105924i("MicroMsg.AppBrandTempFileCleaner", "checkTotalTempFileLimitSync limit:" + j);
        if (j > 0) {
            WeAppFileSystemTempFileLastOccupationStatStruct weAppFileSystemTempFileLastOccupationStatStruct = new WeAppFileSystemTempFileLastOccupationStatStruct();
            bVar.mo113750b(j, weAppFileSystemTempFileLastOccupationStatStruct);
            if (weAppFileSystemTempFileLastOccupationStatStruct.f236569m > 0) {
                C115669n.INSTANCE.mo175911u(C82852c.CTRL_INDEX, WXWebReporter.KEY_TRY_FIX_DEX_FAILED);
            }
        }
    }
}
