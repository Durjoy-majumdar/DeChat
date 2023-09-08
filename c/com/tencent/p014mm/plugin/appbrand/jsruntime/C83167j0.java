package com.tencent.p014mm.plugin.appbrand.jsruntime;

import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.appcache.C81352s2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86001b0;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tinker.loader.shareutil.SharePatchInfo;
import com.tencent.wcdb.database.SQLiteDoneException;
import com.tencent.wcdb.database.SQLiteException;
import com.tencent.wcdb.database.SQLiteStatement;
import com.tencent.xweb.file.XVFSFile;
import fy3.C32228q;
import gy3.C87412m;
import java.util.List;
import sf0.C90189z;
import sx3.C110818d0;
import z04.C112550d0;
import z04.C66713a;
import zh3.C91753f;

/* renamed from: com.tencent.mm.plugin.appbrand.jsruntime.j0 */
public final class C83167j0 {

    /* renamed from: a */
    public static final C83167j0 f242981a = new C83167j0();

    /* renamed from: com.tencent.mm.plugin.appbrand.jsruntime.j0$a */
    public static final class C83168a implements C32228q<String, String, C86001b0, Integer> {

        /* renamed from: d */
        public final SQLiteStatement f242982d;

        public C83168a(C91753f fVar) {
            C87412m.m108594g(fVar, "db");
            this.f242982d = C83167j0.m102063a(C83167j0.f242981a, fVar, "SELECT COUNT(*) FROM AppBrandWxaPkgManifestRecord WHERE appId =? AND version=? ;");
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            int i;
            long j;
            String str = (String) obj;
            String str2 = (String) obj2;
            C86001b0 b0Var = (C86001b0) obj3;
            C87412m.m108594g(str, "appId");
            C87412m.m108594g(str2, "rootDir");
            C87412m.m108594g(b0Var, SharePatchInfo.OAT_DIR);
            int i2 = 0;
            if (this.f242982d == null) {
                return 0;
            }
            Iterable<C86001b0> t = C86013q1.m106459t(str2 + XVFSFile.SEPARATOR_CHAR + b0Var.f250472b, false);
            if (t != null) {
                for (C86001b0 next : t) {
                    try {
                        String str3 = next.f250472b;
                        C87412m.m108593f(str3, "file.name");
                        String substring = str3.substring(1);
                        C87412m.m108593f(substring, "this as java.lang.String).substring(startIndex)");
                        C66713a.m78712a(10);
                        i = Integer.parseInt(substring, 10);
                    } catch (NumberFormatException unused) {
                        i = -1;
                    }
                    if (!(i == -1 || i == 0)) {
                        int i3 = C81352s2.f238828a;
                        if (!(i == 0 || i == C81352s2.f238828a)) {
                            this.f242982d.bindString(1, str);
                            this.f242982d.bindLong(2, (long) i);
                            try {
                                j = this.f242982d.simpleQueryForLong();
                            } catch (SQLiteException e) {
                                boolean z = e instanceof SQLiteDoneException;
                                j = 0;
                            }
                            if (j <= 0) {
                                next.mo119954a();
                                i2++;
                            }
                        }
                    }
                }
            }
            return Integer.valueOf(i2);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsruntime.j0$b */
    public static final class C83169b implements C32228q<String, String, C86001b0, Integer> {

        /* renamed from: d */
        public final SQLiteStatement f242983d;

        /* renamed from: e */
        public final SQLiteStatement f242984e;

        public C83169b(C91753f fVar) {
            C87412m.m108594g(fVar, "db");
            C83167j0 j0Var = C83167j0.f242981a;
            this.f242983d = C83167j0.m102063a(j0Var, fVar, "SELECT COUNT(*) FROM AppBrandWxaPkgManifestRecord WHERE appId LIKE ? AND versionMd5=? ;");
            this.f242984e = C83167j0.m102063a(j0Var, fVar, "SELECT COUNT(*) FROM AppBrandWxaPkgManifestRecord WHERE appId LIKE ? AND NewMd5=? ;");
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            long j;
            long j2;
            String str = (String) obj;
            String str2 = (String) obj2;
            C86001b0 b0Var = (C86001b0) obj3;
            C87412m.m108594g(str, "appId");
            C87412m.m108594g(str2, "rootDir");
            C87412m.m108594g(b0Var, SharePatchInfo.OAT_DIR);
            int i = 0;
            if (this.f242983d == null || this.f242984e == null) {
                return 0;
            }
            Iterable<C86001b0> t = C86013q1.m106459t(str2 + XVFSFile.SEPARATOR_CHAR + b0Var.f250472b, false);
            if (t != null) {
                int i2 = 0;
                for (C86001b0 next : t) {
                    if (!next.f250476f) {
                        String str3 = next.f250472b;
                        C87412m.m108593f(str3, "file.name");
                        String str4 = next.f250472b;
                        C87412m.m108593f(str4, "file.name");
                        if (C112550d0.m153801u(str4, ".", false)) {
                            String str5 = next.f250472b;
                            C87412m.m108593f(str5, "file.name");
                            str3 = (String) C112550d0.m153785U(str5, new String[]{"."}, false, 0, 6, (Object) null).get(0);
                        }
                        this.f242983d.bindString(1, str + "%%");
                        this.f242983d.bindString(2, str3);
                        try {
                            j = this.f242983d.simpleQueryForLong();
                        } catch (SQLiteException e) {
                            boolean z = e instanceof SQLiteDoneException;
                            j = 0;
                        }
                        this.f242984e.bindString(1, str + "%%");
                        this.f242984e.bindString(2, str3);
                        try {
                            j2 = this.f242984e.simpleQueryForLong();
                        } catch (SQLiteException e2) {
                            boolean z2 = e2 instanceof SQLiteDoneException;
                            j2 = 0;
                        }
                        if (j + j2 <= 0) {
                            next.mo119954a();
                            i2++;
                        }
                    }
                }
                i = i2;
            }
            return Integer.valueOf(i);
        }
    }

    /* renamed from: a */
    public static final SQLiteStatement m102063a(C83167j0 j0Var, C91753f fVar, String str) {
        j0Var.getClass();
        try {
            return fVar.mo125615f().compileStatement(str);
        } catch (SQLiteException e) {
            Log.m105920e("MicroMsg.AppBrand.V8WasmCacheCleanupLogic", "compileStatement with sql:" + str + ", get exception:" + e);
            return null;
        } catch (IllegalStateException e2) {
            Log.m105920e("MicroMsg.AppBrand.V8WasmCacheCleanupLogic", "compileStatement with sql:" + str + ", get exception:" + e2);
            return null;
        }
    }

    /* renamed from: b */
    public static final void m102064b() {
        int i;
        C81161g2.requireAccountInitializedOnDemand();
        C90189z.C90190a aVar = C81161g2.f238476o;
        if (aVar != null) {
            C32228q bVar = new C83169b(aVar);
            C32228q aVar2 = new C83168a(aVar);
            long currentTicks = Util.currentTicks();
            int i2 = 0;
            Iterable<C86001b0> t = C86013q1.m106459t(C83173l0.m102077a(), false);
            if (t != null) {
                int i3 = 0;
                i = 0;
                for (C86001b0 next : t) {
                    if (next.f250476f) {
                        String str = next.f250472b;
                        C87412m.m108593f(str, "dir.name");
                        C32228q qVar = null;
                        if (C87412m.m108589b(str, "@LibraryAppId")) {
                            qVar = aVar2;
                        }
                        if (qVar == null) {
                            qVar = bVar;
                        }
                        String str2 = C83173l0.m102077a() + XVFSFile.SEPARATOR_CHAR + next.f250472b;
                        Iterable<C86001b0> t2 = C86013q1.m106459t(str2, false);
                        if (t2 != null) {
                            for (C86001b0 next2 : t2) {
                                if (next2.f250476f) {
                                    i3++;
                                    i += ((Number) qVar.invoke(str, str2, next2)).intValue();
                                    if (f242981a.mo115434c(next2, str2)) {
                                        next2.mo119954a();
                                    }
                                }
                            }
                        }
                        C83167j0 j0Var = f242981a;
                        String a = C83173l0.m102077a();
                        C87412m.m108593f(a, "retrieve()");
                        if (j0Var.mo115434c(next, a)) {
                            Log.m105925i("MicroMsg.AppBrand.V8WasmCacheCleanupLogic", "delete appID %s relPath %s", str, next.f250471a);
                            next.mo119954a();
                        }
                    }
                }
                i2 = i3;
            } else {
                i = 0;
            }
            Log.m105924i("MicroMsg.AppBrand.V8WasmCacheCleanupLogic", "doCleanup() cost:" + (Util.currentTicks() - currentTicks) + "ms, dirVisitedCount:" + i2 + ", fileDeletedCount:" + i);
        }
    }

    /* renamed from: c */
    public final boolean mo115434c(C86001b0 b0Var, String str) {
        if (b0Var.f250476f) {
            Iterable<C86001b0> t = C86013q1.m106459t(str + XVFSFile.SEPARATOR_CHAR + b0Var.f250472b, false);
            List<C86001b0> y0 = t != null ? C110818d0.m150953y0(t) : null;
            if (y0 == null || y0.isEmpty()) {
                return true;
            }
        }
        return false;
    }
}
