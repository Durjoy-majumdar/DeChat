package com.tencent.p014mm.plugin.appbrand.jsapi.file;

import ai0.C79553f;
import com.tencent.p014mm.autogen.mmdata.rpt.WeAppFileSystemTempFileSingleAllocStatStruct;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.app.C1510o;
import com.tencent.p014mm.plugin.appbrand.appstorage.AppBrandStorageQuotaManager;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81413f0;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81415h0;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81417i0;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81418k0;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81439t0;
import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import com.tencent.p014mm.plugin.appbrand.jsapi.nfc.C82852c;
import com.tencent.p014mm.plugin.appbrand.p025ad.p945ui.AppBrandAdUI;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84185b;
import com.tencent.p014mm.plugin.appbrand.report.quality.QualitySessionRuntime;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.tmassistantsdk.downloadservice.DownloadHelper;
import di3.C86312j;
import gy3.C87412m;
import h81.C32735h;
import iy3.C60641c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import js0.C9514m;
import o40.C61926c;
import rx3.C13598b0;
import rx3.C13604l;
import z04.C112551y;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.b */
public class C82409b extends C82419d1 {

    /* renamed from: g */
    public final C82417d f241488g;

    /* renamed from: h */
    public final String f241489h;

    /* renamed from: i */
    public long f241490i = 314572800;

    /* renamed from: j */
    public long f241491j = DownloadHelper.SAVE_LENGTH;

    /* renamed from: n */
    public long f241492n = 314572800;

    /* renamed from: o */
    public long f241493o;

    /* renamed from: p */
    public C82503y1 f241494p;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.b$a */
    public static final class C82410a implements C81417i0 {
        /* renamed from: d */
        public void mo113734d(String str, C86009m1 m1Var) {
            QualitySessionRuntime c;
            if (str != null && m1Var != null && (c = C84185b.m103770c(str, true)) != null) {
                WeAppFileSystemTempFileSingleAllocStatStruct a = C82413c.m101171a(c);
                a.f236581h = C60641c.m70922c(((double) m1Var.mo119980r()) / 1024.0d);
                a.mo86054n();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C82409b(AppBrandRuntimeWC appBrandRuntimeWC, C82417d dVar) {
        super(appBrandRuntimeWC, dVar);
        boolean z;
        C87412m.m108594g(appBrandRuntimeWC, "rt");
        C87412m.m108594g(dVar, "config");
        this.f241488g = dVar;
        String str = appBrandRuntimeWC.f238147j;
        this.f241489h = str;
        ICommLibReader O1 = appBrandRuntimeWC.mo113184O1(false);
        if (O1 != null) {
            O1.mo113371a();
            C87412m.m108593f(str, "appId");
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_appbrand_dir_space_statics_enable, 0) == 1) {
                z = true;
            } else {
                MultiProcessMMKV a = C1510o.f10864a.mo1516a();
                if (a != null) {
                    z = a.getBoolean("appbrand_enable_file_storage_space_statistics_for_" + str, false);
                } else {
                    z = false;
                }
            }
            if (z) {
                C87412m.m108593f(str, "appId");
                C82503y1 y1Var = new C82503y1(str);
                MultiProcessMMKV a2 = C1510o.f10864a.mo1516a();
                y1Var.f241576f = a2 != null && a2.getBoolean("enable_appbrand_file_size_statistics_debug", false);
                this.f241494p = y1Var;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("init WxaStorageSpaceStatisticsService ?  ");
        sb.append(this.f241494p != null);
        Log.m105924i("MicroMsg.AppBrandRuntimeFileSystemRegistry", sb.toString());
        LinkedList<C81415h0> linkedList = this.f238970d;
        Map<String, Class<? extends AppBrandAdUI>> map = C79553f.f233288a;
        linkedList.addFirst(C79553f.C79554a.f233290a);
        LinkedList<C81415h0> linkedList2 = this.f238970d;
        C87412m.m108593f(linkedList2, "orderedFileSystemList");
        C87412m.m108593f(str, "appId");
        QualitySessionRuntime c = C84185b.m103770c(str, true);
        if (c != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = linkedList2.iterator();
            while (true) {
                C13604l lVar = null;
                if (!it.hasNext()) {
                    break;
                }
                C81415h0 h0Var = (C81415h0) it.next();
                if (h0Var instanceof C81413f0) {
                    C81413f0 f0Var = (C81413f0) h0Var;
                    f0Var.getClass();
                    lVar = new C13604l("tmp", f0Var.f238947e);
                } else if (h0Var instanceof C81439t0) {
                    C81439t0 t0Var = (C81439t0) h0Var;
                    String str2 = t0Var.f238993e;
                    C87412m.m108593f(str2, "fs.pathPrefix");
                    lVar = new C13604l(C112551y.m153814n(str2, "wxfile://", "", false), t0Var.f238992d);
                } else {
                    Log.m105929w("MicroMsg.AppBrand.AppBrandFileOccupationReporter", "unknown type: %s", h0Var.getClass().getSimpleName());
                }
                if (lVar != null) {
                    arrayList.add(lVar);
                }
            }
            C61926c.m72656A((String) null, new C82406a(arrayList, str, c));
        }
        AppBrandStorageQuotaManager.f238917b.clear();
        ((LinkedHashMap) AppBrandStorageQuotaManager.f238918c).clear();
        LinkedList<C81415h0> linkedList3 = this.f238970d;
        C87412m.m108593f(linkedList3, "orderedFileSystemList");
        for (C81415h0 h0Var2 : linkedList3) {
            long j = Long.MIN_VALUE;
            if (h0Var2 instanceof C81413f0) {
                C81413f0 f0Var2 = (C81413f0) h0Var2;
                String str3 = f0Var2.f238947e;
                if (str3 == null || str3.length() == 0) {
                    Log.m105928w("MicroMsg.AppBrandRuntimeFileSystemRegistry", "fs root path is null, skip");
                } else if (C87412m.m108589b(f0Var2.f238948f, "wxfile://")) {
                    AppBrandStorageQuotaManager appBrandStorageQuotaManager = AppBrandStorageQuotaManager.f238916a;
                    String str4 = f0Var2.f238947e;
                    C87412m.m108593f(str4, "fs.rootPath");
                    appBrandStorageQuotaManager.mo113689f("temp", str4);
                    String str5 = f0Var2.f238947e;
                    C87412m.m108593f(str5, "fs.rootPath");
                    appBrandStorageQuotaManager.mo113689f("saved_temp", str5);
                    String str6 = this.f241489h;
                    C87412m.m108593f(str6, "appId");
                    if (appBrandStorageQuotaManager.mo113687d(str6, "saved_temp")) {
                        String str7 = this.f241489h;
                        C87412m.m108593f(str7, "appId");
                        j = appBrandStorageQuotaManager.mo113686c(str7, "saved_temp");
                    }
                    C82503y1 y1Var2 = this.f241494p;
                    if (y1Var2 != null) {
                        String str8 = f0Var2.f238947e;
                        C87412m.m108593f(str8, "fs.rootPath");
                        C87412m.m108593f(h0Var2, "fs");
                        y1Var2.mo114834j(str8, new C82500x1((C81413f0) h0Var2), j);
                    }
                    appBrandStorageQuotaManager.mo113688e(this.f241489h, "saved_temp");
                    f0Var2.f238950h = this.f241494p;
                }
            } else if (h0Var2 instanceof C81439t0) {
                C81439t0 t0Var2 = (C81439t0) h0Var2;
                String str9 = t0Var2.f238992d;
                if (str9 == null || str9.length() == 0) {
                    Log.m105928w("MicroMsg.AppBrandRuntimeFileSystemRegistry", "fs root path is null, skip");
                } else if (C87412m.m108589b(t0Var2.f238993e, "wxfile://usr")) {
                    AppBrandStorageQuotaManager appBrandStorageQuotaManager2 = AppBrandStorageQuotaManager.f238916a;
                    String str10 = t0Var2.f238992d;
                    C87412m.m108593f(str10, "fs.rootPath");
                    appBrandStorageQuotaManager2.mo113689f("normal_none_flatten", str10);
                    String str11 = this.f241489h;
                    C87412m.m108593f(str11, "appId");
                    if (appBrandStorageQuotaManager2.mo113687d(str11, "normal_none_flatten")) {
                        String str12 = this.f241489h;
                        C87412m.m108593f(str12, "appId");
                        j = appBrandStorageQuotaManager2.mo113686c(str12, "normal_none_flatten");
                    }
                    C82503y1 y1Var3 = this.f241494p;
                    if (y1Var3 != null) {
                        String str13 = t0Var2.f238992d;
                        C87412m.m108593f(str13, "fs.rootPath");
                        y1Var3.mo114834j(str13, new C82498w1(), j);
                    }
                    appBrandStorageQuotaManager2.mo113688e(this.f241489h, "normal_none_flatten");
                    t0Var2.f238995g = this.f241494p;
                }
            }
        }
        AppBrandStorageQuotaManager appBrandStorageQuotaManager3 = AppBrandStorageQuotaManager.f238916a;
        String str14 = this.f241489h;
        C87412m.m108593f(str14, "appId");
        this.f241493o = appBrandStorageQuotaManager3.mo113686c(str14, "temp");
        Log.m105924i("MicroMsg.AppBrandRuntimeFileSystemRegistry", this.f241489h + " currentTempSize " + this.f241493o);
        C82417d dVar2 = this.f241488g;
        long j2 = (long) 1048576;
        this.f241490i = dVar2.f241499f * j2;
        this.f241491j = dVar2.f241500g * j2;
        this.f241492n = dVar2.f241498e * j2;
    }

    public C86009m1 allocTempFile(String str) {
        if (mo114805k(0)) {
            return null;
        }
        return super.allocTempFile(str);
    }

    public C81410b0 createTempFileFrom(C86009m1 m1Var, String str, boolean z, C9514m<String> mVar) {
        QualitySessionRuntime c;
        long j = 0;
        if (mo114805k(m1Var != null ? m1Var.mo119980r() : 0)) {
            if (mVar != null) {
                mVar.f29691a = null;
            }
            return C81410b0.ERR_EXCEED_DIRECTORY_MAX_SIZE;
        }
        long j2 = this.f241493o;
        if (m1Var != null) {
            j = m1Var.mo119980r();
        }
        this.f241493o = j2 + j;
        long c2 = m1Var != null ? C60641c.m70922c(((double) m1Var.mo119980r()) / 1024.0d) : -1;
        C81410b0 createTempFileFrom = super.createTempFileFrom(m1Var, str, z, mVar);
        if (createTempFileFrom == C81410b0.OK && (c = C84185b.m103770c(this.f241489h, true)) != null) {
            WeAppFileSystemTempFileSingleAllocStatStruct a = C82413c.m101171a(c);
            a.f236581h = c2;
            a.mo86054n();
        }
        return createTempFileFrom;
    }

    public C81418k0 getStorageSpaceStatistics() {
        return this.f241494p;
    }

    public C81410b0 getTempDirectory(C9514m<String> mVar) {
        if (mo114805k(0)) {
            if (mVar != null) {
                mVar.f29691a = null;
            }
            return C81410b0.ERR_EXCEED_DIRECTORY_MAX_SIZE;
        }
        C81410b0 tempDirectory = super.getTempDirectory(mVar);
        C87412m.m108593f(tempDirectory, "super.getTempDirectory(pPath)");
        return tempDirectory;
    }

    /* renamed from: k */
    public final boolean mo114805k(long j) {
        boolean z = this.f241493o + j > this.f241490i;
        if (z) {
            C115669n.INSTANCE.mo175911u(C82852c.CTRL_INDEX, 225);
            Log.m105929w("MicroMsg.AppBrandRuntimeFileSystemRegistry", "temp file size exceed limit! %d limit:%d", Long.valueOf(this.f241493o + j), Long.valueOf(this.f241490i));
        }
        return z;
    }

    public void release() {
        AppBrandStorageQuotaManager appBrandStorageQuotaManager = AppBrandStorageQuotaManager.f238916a;
        String str = this.f241489h;
        C87412m.m108593f(str, "appId");
        appBrandStorageQuotaManager.mo113685b(str, this.f241491j, this.f241490i, this.f241492n);
        C82503y1 y1Var = this.f241494p;
        if (y1Var != null) {
            synchronized (y1Var.f241575e) {
                ((LinkedHashMap) y1Var.f241574d).clear();
                ((LinkedHashMap) y1Var.f241573c).clear();
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
        super.release();
    }

    public C81410b0 saveFile(C86009m1 m1Var, String str, C9514m<String> mVar) {
        this.f241493o -= m1Var != null ? m1Var.mo119980r() : 0;
        C81410b0 saveFile = super.saveFile(m1Var, str, mVar);
        C87412m.m108593f(saveFile, "super.saveFile(srcFile, …ifiedPath, generatedPath)");
        return saveFile;
    }
}
