package com.tencent.p014mm.plugin.appbrand.v8_snapshot;

import android.net.Uri;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.plugin.appbrand.AppBrandFileCleaner;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import gy3.C87412m;
import org.xwalk.core.XWalkEnvironment;
import p156gj.C87203t;
import x20.C15618a;

/* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.k0 */
public final class C84847k0 {

    /* renamed from: a */
    public static final C84847k0 f247331a = new C84847k0();

    /* renamed from: b */
    public static C86009m1 f247332b;

    /* renamed from: c */
    public static final String f247333c = (C87203t.m108279o() ? XWalkEnvironment.RUNTIME_ABI_ARM64_STR : XWalkEnvironment.RUNTIME_ABI_ARM32_STR);

    /* renamed from: d */
    public static C86009m1 f247334d;

    /* renamed from: a */
    public final boolean mo117590a(WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo) {
        C87412m.m108594g(wxaPkgV8SnapshotInfo, "snapshotInfo");
        C86009m1 m1Var = new C86009m1(wxaPkgV8SnapshotInfo.f247273i);
        Log.m105924i("MicroMsg.WxaCommLibV8SnapshotManager", "deleteSnapshotFile, snapshot: " + m1Var);
        return m1Var.mo119966f();
    }

    /* renamed from: b */
    public final C86009m1 mo117591b(WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo) {
        C87412m.m108594g(wxaPkgV8SnapshotInfo, "snapshotInfo");
        C86009m1 m1Var = f247334d;
        if (m1Var == null) {
            C86009m1 c = mo117592c();
            if (c != null) {
                C86009m1 m1Var2 = new C86009m1(c, f247333c);
                if (!m1Var2.mo119967g()) {
                    C86013q1.m106461v(m1Var2.mo119971i());
                }
                m1Var = m1Var2;
            } else {
                m1Var = null;
            }
            f247334d = m1Var;
        }
        if (m1Var == null) {
            Log.m105920e("MicroMsg.WxaCommLibV8SnapshotManager", "getOrCreateSnapshotDir, curArchSnapshotParentDir is null");
            return null;
        }
        Uri n = C116299g2.m163858n(wxaPkgV8SnapshotInfo.f247270f);
        String path = n.getPath();
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!n.getPath().equals(k)) {
                n = n.buildUpon().path(k).build();
            }
        }
        String path2 = n.getPath();
        int lastIndexOf = path2.lastIndexOf("/");
        if (lastIndexOf >= 0) {
            path2 = path2.substring(lastIndexOf + 1);
        }
        C87412m.m108593f(path2, "VFSFile(wxaPkgPath).name");
        C86009m1 m1Var3 = new C86009m1(m1Var, path2);
        if (!m1Var3.mo119967g()) {
            C86013q1.m106461v(m1Var3.mo119971i());
        }
        C86009m1 m1Var4 = new C86009m1(m1Var3, wxaPkgV8SnapshotInfo.f247272h.name());
        if (!m1Var4.mo119967g()) {
            C86013q1.m106461v(m1Var4.mo119971i());
        }
        Log.m105918d("MicroMsg.WxaCommLibV8SnapshotManager", "getOrCreateSnapshotDir, dir: " + m1Var4);
        return m1Var4;
    }

    /* renamed from: c */
    public final C86009m1 mo117592c() {
        C86009m1 m1Var = f247332b;
        if (m1Var != null) {
            return m1Var;
        }
        IPCString iPCString = (IPCString) C15618a.m14628d(IPCVoid.f10316d, C84845j0.f247329a);
        C86009m1 m1Var2 = null;
        String str = iPCString != null ? iPCString.f10315d : null;
        if (str != null) {
            m1Var2 = new C86009m1(str, AppBrandFileCleaner.f238098c);
            if (!m1Var2.mo119967g()) {
                C86013q1.m106461v(m1Var2.mo119971i());
            }
        }
        C86009m1 m1Var3 = m1Var2;
        f247332b = m1Var3;
        return m1Var3;
    }
}
