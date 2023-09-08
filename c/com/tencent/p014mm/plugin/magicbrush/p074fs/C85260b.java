package com.tencent.p014mm.plugin.magicbrush.p074fs;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81413f0;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81415h0;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81439t0;
import com.tencent.p014mm.plugin.magicbrush.p074fs.MagicBrushStorageQuotaManager;
import com.tencent.p014mm.plugin.magicbrush.report.IMagicBrushMonitor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.vfs.VFSStrategy;
import di3.C86312j;
import gy3.C87412m;
import i52.C33209f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import js0.C9514m;
import q52.C35765d;
import z04.C112550d0;

/* renamed from: com.tencent.mm.plugin.magicbrush.fs.b */
public class C85260b extends C85261d {

    /* renamed from: f */
    public String f248406f;

    /* renamed from: g */
    public C86009m1 f248407g;

    /* renamed from: h */
    public long f248408h = 4294967296L;

    /* renamed from: i */
    public long f248409i = 2147483648L;

    /* renamed from: j */
    public long f248410j = 6442450944L;

    /* renamed from: n */
    public final HashMap<String, String> f248411n = new HashMap<>();

    /* renamed from: o */
    public long f248412o;

    public C85260b(String str) {
        String str2;
        C87412m.m108594g(str, "instanceName");
        String a = C33209f.m39985a();
        if (!Util.isNullOrNil(a)) {
            boolean v = C86013q1.m106461v(a);
            Log.m105925i("MicroMsg.MagicBrushFileSystemBizRegistry", "mkdir %s ret:%b", a, Boolean.valueOf(v));
            if (v) {
                C86013q1.m106460u(a);
            }
        }
        String g0 = C112550d0.m153797g0(str, "-", str);
        Iterator it = ((ArrayList) C35765d.f95533c).iterator();
        while (true) {
            if (!it.hasNext()) {
                str2 = null;
                break;
            }
            String str3 = (String) it.next();
            if (g0.equalsIgnoreCase(str3.toLowerCase())) {
                str2 = str3.toLowerCase();
                break;
            }
        }
        if (Util.isNullOrNil(str2)) {
            Log.m105920e("MicroMsg.MagicBrushFileSystemBizRegistry", "file system invalid instanceName:" + str + ",not register");
            return;
        }
        VFSStrategy.m163776d("magic");
        if (Util.isNullOrNil(a)) {
            Log.m105920e("MicroMsg.MagicBrushFileSystemBizRegistry", "file system vfs init failed instanceName:" + str);
            return;
        }
        this.f248406f = str2;
        this.f248407g = new C86009m1(a);
        Log.m105924i("MicroMsg.MagicBrushFileSystemBizRegistry", "file system established instanceName:" + str);
    }

    /* renamed from: g */
    private final boolean m105217g(long j) {
        boolean z = this.f248412o + j > this.f248408h;
        if (z) {
            ((IMagicBrushMonitor) C86312j.m106911c(IMagicBrushMonitor.class)).Ov0(IMagicBrushMonitor.Key.MagicTempFileSizeExceedLimit.name(), 1, (String) null);
            Log.m105929w("MicroMsg.MagicBrushFileSystemBizRegistry", "temp file size exceed limit! %d limit:%d", Long.valueOf(this.f248412o + j), Long.valueOf(this.f248408h));
        }
        return z;
    }

    public C86009m1 allocTempFile(String str) {
        if (m105217g(0)) {
            return null;
        }
        return ((C81413f0) mo118423b(C81413f0.class)).allocTempFile(str);
    }

    public C81410b0 createTempFileFrom(C86009m1 m1Var, String str, boolean z, C9514m<String> mVar) {
        long j = 0;
        if (m105217g(m1Var != null ? m1Var.mo119980r() : 0)) {
            if (mVar != null) {
                mVar.f29691a = null;
            }
            return C81410b0.ERR_EXCEED_DIRECTORY_MAX_SIZE;
        }
        long j2 = this.f248412o;
        if (m1Var != null) {
            j = m1Var.mo119980r();
        }
        this.f248412o = j2 + j;
        C81410b0 b0Var = C81410b0.ERR_NOT_SUPPORTED;
        Iterator<C81415h0> it = mo118425d().iterator();
        while (true) {
            if (it.hasNext()) {
                C81410b0 createTempFileFrom = it.next().createTempFileFrom(m1Var, str, z, mVar);
                if (createTempFileFrom != b0Var) {
                    b0Var = createTempFileFrom;
                    break;
                }
            } else {
                break;
            }
        }
        C87412m.m108593f(b0Var, "super.createTempFileFrom…, deleteSrc, pResultPath)");
        return b0Var;
    }

    public C81410b0 getTempDirectory(C9514m<String> mVar) {
        if (m105217g(0)) {
            if (mVar != null) {
                mVar.f29691a = null;
            }
            return C81410b0.ERR_EXCEED_DIRECTORY_MAX_SIZE;
        }
        C81410b0 b0Var = C81410b0.ERR_NOT_SUPPORTED;
        Iterator<C81415h0> it = mo118425d().iterator();
        while (true) {
            if (it.hasNext()) {
                C81410b0 tempDirectory = it.next().getTempDirectory(mVar);
                if (tempDirectory != b0Var) {
                    b0Var = tempDirectory;
                    break;
                }
            } else {
                break;
            }
        }
        C87412m.m108593f(b0Var, "super.getTempDirectory(pPath)");
        return b0Var;
    }

    public void initialize() {
        Iterator<C81415h0> it = mo118425d().iterator();
        while (it.hasNext()) {
            it.next().initialize();
        }
        this.f248414e.getClass();
        this.f248411n.clear();
        CopyOnWriteArrayList<C81415h0> d = mo118425d();
        C87412m.m108593f(d, "orderedFileSystemList");
        Iterator<C81415h0> it4 = d.iterator();
        while (it4.hasNext()) {
            C81415h0 next = it4.next();
            boolean z = false;
            if (next instanceof C81413f0) {
                C81413f0 f0Var = (C81413f0) next;
                String str = f0Var.f238947e;
                if (str == null || str.length() == 0) {
                    z = true;
                }
                if (z) {
                    Log.m105928w("MicroMsg.MagicBrushFileSystemBizRegistry", "fs root path is null, skip");
                } else if (C87412m.m108589b(f0Var.f238948f, "wxfile://")) {
                    String str2 = f0Var.f238947e;
                    C87412m.m108593f(str2, "fs.rootPath");
                    this.f248411n.put(this.f248406f + "-temp", str2);
                    String str3 = f0Var.f238947e;
                    C87412m.m108593f(str3, "fs.rootPath");
                    this.f248411n.put(this.f248406f + "-saved_temp", str3);
                }
            } else if (next instanceof C81439t0) {
                C81439t0 t0Var = (C81439t0) next;
                String str4 = t0Var.f238992d;
                if (str4 == null || str4.length() == 0) {
                    z = true;
                }
                if (z) {
                    Log.m105928w("MicroMsg.MagicBrushFileSystemBizRegistry", "fs root path is null, skip");
                } else if (C87412m.m108589b(t0Var.f238993e, "wxfile://usr")) {
                    String str5 = t0Var.f238992d;
                    C87412m.m108593f(str5, "fs.rootPath");
                    this.f248411n.put(this.f248406f + "-normal_none_flatten", str5);
                }
            }
        }
        String str6 = this.f248406f;
        if (str6 != null) {
            this.f248412o = MagicBrushStorageQuotaManager.f248404a.mo118420c(str6, "temp");
            Log.m105924i("MicroMsg.MagicBrushFileSystemBizRegistry", this.f248406f + " currentTempSize " + this.f248412o);
        }
    }

    public void release() {
        String str = this.f248406f;
        if (str != null) {
            long j = this.f248409i;
            long j2 = this.f248408h;
            long j3 = this.f248410j;
            HashMap<String, String> hashMap = this.f248411n;
            C87412m.m108594g(hashMap, "storageKey2Path");
            Log.m105924i("MicroMsg.MagicBrushStorageQuotaManager", "start check: bizName[" + str + "] minTemp[" + j + "] maxTemp[" + j2 + "] maxTotal[" + j3 + ']');
            XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, new MagicBrushStorageQuotaManager.CleanupTempFilesOnMBBIzExitParams(str, j, j2, j3, hashMap), MagicBrushStorageQuotaManager.C85258a.class, (C1256g) null);
        }
        Iterator<C81415h0> it = mo118425d().iterator();
        while (it.hasNext()) {
            it.next().release();
        }
        this.f248414e.getClass();
    }

    public C81410b0 saveFile(C86009m1 m1Var, String str, C9514m<String> mVar) {
        C87412m.m108594g(m1Var, "srcFile");
        C87412m.m108594g(str, "specifiedPath");
        this.f248412o -= m1Var.mo119980r();
        C81410b0 b0Var = C81410b0.ERR_NOT_SUPPORTED;
        String f = mo118426f(str);
        Iterator<C81415h0> it = mo118425d().iterator();
        while (true) {
            if (it.hasNext()) {
                C81410b0 saveFile = it.next().saveFile(m1Var, f, mVar);
                if (saveFile != b0Var) {
                    b0Var = saveFile;
                    break;
                }
            } else {
                break;
            }
        }
        C87412m.m108593f(b0Var, "super.saveFile(srcFile, …ifiedPath, generatedPath)");
        return b0Var;
    }
}
