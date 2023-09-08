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
import fy3.C32227p;
import gy3.C8478d0;
import gy3.C87412m;
import java.util.List;
import sf0.C90189z;
import sx3.C110818d0;
import sx3.C110823p;
import u24.C90599h;
import z04.C112551y;
import z04.C66713a;
import zh3.C91753f;

/* renamed from: com.tencent.mm.plugin.appbrand.jsruntime.e0 */
public final class C83158e0 {

    /* renamed from: a */
    public static final C83158e0 f242971a = new C83158e0();

    /* renamed from: b */
    public static final String[] f242972b = {"page_scripts"};

    /* renamed from: com.tencent.mm.plugin.appbrand.jsruntime.e0$a */
    public static final class C83159a implements C32227p<String, C86001b0, Integer> {

        /* renamed from: d */
        public final SQLiteStatement f242973d;

        public C83159a(C91753f fVar) {
            C87412m.m108594g(fVar, "db");
            this.f242973d = C83158e0.m102048a(C83158e0.f242971a, fVar, "SELECT COUNT(*) FROM AppBrandWxaPkgManifestRecord WHERE appId =? AND version=? ;");
        }

        public Object invoke(Object obj, Object obj2) {
            int i;
            long j;
            String str = (String) obj;
            C86001b0 b0Var = (C86001b0) obj2;
            C87412m.m108594g(str, "rootDir");
            C87412m.m108594g(b0Var, SharePatchInfo.OAT_DIR);
            int i2 = 0;
            if (this.f242973d == null) {
                return 0;
            }
            Iterable<C86001b0> t = C86013q1.m106459t(str + XVFSFile.SEPARATOR_CHAR + b0Var.f250472b, false);
            if (t != null) {
                for (C86001b0 next : t) {
                    try {
                        String str2 = next.f250472b;
                        C87412m.m108593f(str2, "file.name");
                        String substring = str2.substring(1);
                        C87412m.m108593f(substring, "this as java.lang.String).substring(startIndex)");
                        C66713a.m78712a(10);
                        i = Integer.parseInt(substring, 10);
                    } catch (NumberFormatException unused) {
                        i = -1;
                    }
                    if (!(i == -1 || i == 0)) {
                        int i3 = C81352s2.f238828a;
                        if (!(i == 0 || i == C81352s2.f238828a)) {
                            this.f242973d.bindString(1, "@LibraryAppId");
                            this.f242973d.bindLong(2, (long) i);
                            try {
                                j = this.f242973d.simpleQueryForLong();
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

    /* renamed from: com.tencent.mm.plugin.appbrand.jsruntime.e0$b */
    public static final class C83160b implements C32227p<String, C86001b0, Integer> {

        /* renamed from: d */
        public final SQLiteStatement f242974d;

        /* renamed from: e */
        public final SQLiteStatement f242975e;

        public C83160b(C91753f fVar) {
            C87412m.m108594g(fVar, "db");
            C83158e0 e0Var = C83158e0.f242971a;
            this.f242974d = C83158e0.m102048a(e0Var, fVar, "SELECT COUNT(*) FROM AppBrandWxaPkgManifestRecord WHERE appId LIKE ? AND versionMd5=? ;");
            this.f242975e = C83158e0.m102048a(e0Var, fVar, "SELECT COUNT(*) FROM AppBrandWxaPkgManifestRecord WHERE appId LIKE ? AND NewMd5=? ;");
        }

        public Object invoke(Object obj, Object obj2) {
            long j;
            long j2;
            String str = (String) obj;
            C86001b0 b0Var = (C86001b0) obj2;
            C87412m.m108594g(str, "rootDir");
            C87412m.m108594g(b0Var, SharePatchInfo.OAT_DIR);
            int i = 0;
            if (this.f242974d == null || this.f242975e == null) {
                return 0;
            }
            String[] l = C90599h.m113519l(b0Var.f250472b, '_');
            String str2 = null;
            if (l != null) {
                if (!(l.length == 0)) {
                    str2 = l[l.length - 1];
                }
            }
            if (str2 == null || str2.length() == 0) {
                return 0;
            }
            Iterable<C86001b0> t = C86013q1.m106459t(str + XVFSFile.SEPARATOR_CHAR + b0Var.f250472b, false);
            if (t != null) {
                for (C86001b0 next : t) {
                    if (!next.f250476f) {
                        this.f242974d.bindString(1, str2 + "%%");
                        this.f242974d.bindString(2, next.f250472b);
                        try {
                            j = this.f242974d.simpleQueryForLong();
                        } catch (SQLiteException e) {
                            boolean z = e instanceof SQLiteDoneException;
                            j = 0;
                        }
                        this.f242975e.bindString(1, str2 + "%%");
                        this.f242975e.bindString(2, next.f250472b);
                        try {
                            j2 = this.f242975e.simpleQueryForLong();
                        } catch (SQLiteException e2) {
                            boolean z2 = e2 instanceof SQLiteDoneException;
                            j2 = 0;
                        }
                        if (j + j2 <= 0) {
                            next.mo119954a();
                            i++;
                        }
                    }
                }
            }
            return Integer.valueOf(i);
        }
    }

    /* renamed from: a */
    public static final SQLiteStatement m102048a(C83158e0 e0Var, C91753f fVar, String str) {
        e0Var.getClass();
        try {
            return fVar.mo125615f().compileStatement(str);
        } catch (SQLiteException e) {
            Log.m105920e("MicroMsg.AppBrand.V8CodeCacheCleanupLogic", "compileStatement with sql:" + str + ", get exception:" + e);
            return null;
        } catch (IllegalStateException e2) {
            Log.m105920e("MicroMsg.AppBrand.V8CodeCacheCleanupLogic", "compileStatement with sql:" + str + ", get exception:" + e2);
            return null;
        }
    }

    /* renamed from: b */
    public static final void m102049b(C8478d0 d0Var, C83162f0 f0Var, C8478d0 d0Var2, String str) {
        C8478d0 d0Var3 = d0Var;
        C8478d0 d0Var4 = d0Var2;
        String str2 = str;
        Iterable<C86001b0> t = C86013q1.m106459t(str2, false);
        if (t != null) {
            for (C86001b0 next : t) {
                if (next.f250476f) {
                    String[] strArr = f242972b;
                    String str3 = next.f250472b;
                    C87412m.m108593f(str3, "dir.name");
                    if (!C110823p.m151009y(strArr, str3)) {
                        d0Var3.f27483d++;
                        String[] strArr2 = C81352s2.f238829b;
                        C87412m.m108593f(strArr2, "LIB_FILES");
                        C83162f0 f0Var2 = null;
                        for (String str4 : strArr2) {
                            if (!C87412m.m108589b(str4, next.f250472b)) {
                                C87412m.m108593f(str4, "name");
                                String str5 = next.f250472b;
                                C87412m.m108593f(str5, "dir.name");
                                if (!C112551y.m153808h(str4, str5, false, 2, (Object) null)) {
                                }
                            }
                            f0Var2 = f0Var;
                        }
                        if (f0Var2 != null) {
                            d0Var4.f27483d += ((Number) f0Var2.invoke(str2, next)).intValue();
                            if (f242971a.mo115432e(next, str2)) {
                                Log.m105925i("MicroMsg.AppBrand.V8CodeCacheCleanupLogic", "delete relPath %s", next.f250471a);
                                next.mo119954a();
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public static final void m102050c() {
        StringBuilder sb;
        C81161g2.requireAccountInitializedOnDemand();
        C90189z.C90190a aVar = C81161g2.f238476o;
        if (aVar != null) {
            C83160b bVar = new C83160b(aVar);
            C83159a aVar2 = new C83159a(aVar);
            long currentTicks = Util.currentTicks();
            C8478d0 d0Var = new C8478d0();
            C8478d0 d0Var2 = new C8478d0();
            try {
                String a = C29552h0.m38798a();
                C87412m.m108593f(a, "retrieve()");
                m102051d(d0Var, aVar2, bVar, d0Var2, a);
                String c = C29552h0.m38800c();
                C86013q1.m106461v(c);
                C87412m.m108593f(c, "retrieveSnapshot()");
                m102051d(d0Var, aVar2, bVar, d0Var2, c);
                sb = new StringBuilder();
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.AppBrand.V8CodeCacheCleanupLogic", e, "doCleanup() get exception, db.isClose=" + aVar.isClose(), new Object[0]);
                sb = new StringBuilder();
            } catch (Throwable th) {
                Log.m105924i("MicroMsg.AppBrand.V8CodeCacheCleanupLogic", "doCleanup() cost:" + (Util.currentTicks() - currentTicks) + "ms, dirVisitedCount:" + d0Var.f27483d + ", fileDeletedCount:" + d0Var2.f27483d);
                throw th;
            }
            sb.append("doCleanup() cost:");
            sb.append(Util.currentTicks() - currentTicks);
            sb.append("ms, dirVisitedCount:");
            sb.append(d0Var.f27483d);
            sb.append(", fileDeletedCount:");
            sb.append(d0Var2.f27483d);
            Log.m105924i("MicroMsg.AppBrand.V8CodeCacheCleanupLogic", sb.toString());
        }
    }

    /* JADX WARNING: type inference failed for: r18v0, types: [com.tencent.mm.plugin.appbrand.jsruntime.e0$b] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m102051d(gy3.C8478d0 r16, com.tencent.p014mm.plugin.appbrand.jsruntime.C83158e0.C83159a r17, com.tencent.p014mm.plugin.appbrand.jsruntime.C83158e0.C83160b r18, gy3.C8478d0 r19, java.lang.String r20) {
        /*
            r0 = r16
            r1 = r19
            r2 = r20
            r3 = 0
            java.lang.Iterable r4 = com.tencent.p014mm.vfs.C86013q1.m106459t(r2, r3)
            if (r4 == 0) goto L_0x0090
            java.util.Iterator r4 = r4.iterator()
        L_0x0011:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0090
            java.lang.Object r5 = r4.next()
            com.tencent.mm.vfs.b0 r5 = (com.tencent.p014mm.vfs.C86001b0) r5
            boolean r6 = r5.f250476f
            if (r6 == 0) goto L_0x0011
            java.lang.String[] r6 = f242972b
            java.lang.String r7 = r5.f250472b
            java.lang.String r8 = "dir.name"
            gy3.C87412m.m108593f(r7, r8)
            boolean r6 = sx3.C110823p.m151009y(r6, r7)
            if (r6 == 0) goto L_0x0031
            goto L_0x0011
        L_0x0031:
            int r6 = r0.f27483d
            r7 = 1
            int r6 = r6 + r7
            r0.f27483d = r6
            java.lang.String[] r6 = com.tencent.p014mm.plugin.appbrand.appcache.C81352s2.f238829b
            java.lang.String r9 = "LIB_FILES"
            gy3.C87412m.m108593f(r6, r9)
            int r9 = r6.length
            r10 = 0
            r12 = r10
            r11 = 0
        L_0x0042:
            if (r11 >= r9) goto L_0x0064
            r13 = r6[r11]
            java.lang.String r14 = r5.f250472b
            boolean r14 = gy3.C87412m.m108589b(r13, r14)
            if (r14 != 0) goto L_0x005f
            java.lang.String r14 = "name"
            gy3.C87412m.m108593f(r13, r14)
            java.lang.String r14 = r5.f250472b
            gy3.C87412m.m108593f(r14, r8)
            r15 = 2
            boolean r13 = z04.C112551y.m153808h(r13, r14, r3, r15, r10)
            if (r13 == 0) goto L_0x0061
        L_0x005f:
            r12 = r17
        L_0x0061:
            int r11 = r11 + 1
            goto L_0x0042
        L_0x0064:
            if (r12 != 0) goto L_0x0068
            r12 = r18
        L_0x0068:
            int r6 = r1.f27483d
            java.lang.Object r8 = r12.invoke(r2, r5)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            int r6 = r6 + r8
            r1.f27483d = r6
            com.tencent.mm.plugin.appbrand.jsruntime.e0 r6 = f242971a
            boolean r6 = r6.mo115432e(r5, r2)
            if (r6 == 0) goto L_0x0011
            java.lang.Object[] r6 = new java.lang.Object[r7]
            java.lang.String r7 = r5.f250471a
            r6[r3] = r7
            java.lang.String r7 = "MicroMsg.AppBrand.V8CodeCacheCleanupLogic"
            java.lang.String r8 = "delete relPath %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r8, r6)
            r5.mo119954a()
            goto L_0x0011
        L_0x0090:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsruntime.C83158e0.m102051d(gy3.d0, com.tencent.mm.plugin.appbrand.jsruntime.e0$a, com.tencent.mm.plugin.appbrand.jsruntime.e0$b, gy3.d0, java.lang.String):void");
    }

    /* renamed from: e */
    public final boolean mo115432e(C86001b0 b0Var, String str) {
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
