package com.tencent.p014mm.plugin.appbrand.appcache.predownload.export;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.appcache.C29315z2;
import com.tencent.p014mm.plugin.appbrand.appcache.C81258h3;
import com.tencent.p014mm.plugin.appbrand.appcache.C81293m3;
import com.tencent.p014mm.plugin.appbrand.appcache.C81372u2;
import com.tencent.p014mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.p014mm.plugin.appbrand.config.C81661j;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.sdk.platformtools.FilesCopy;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86301e;
import ei3.C86522b;
import gy3.C8480h;
import gy3.C87412m;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import js0.C9513g;
import js0.C9514m;
import ki0.C33914i;
import ki0.C33915j;
import kr0.C33987b1;
import wi0.C38163u;
import wi0.C90978e0;

@C86522b(dependencies = {C81161g2.class}, onProcess = {C80625v0.MATCH_MM})
/* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.export.p */
public final class C81331p extends C86301e implements C33987b1 {

    /* renamed from: d */
    public final ConcurrentHashMap<String, C29266b> f238793d = new ConcurrentHashMap<>();

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.export.p$b */
    public static final class C29266b implements Comparable<C29266b> {

        /* renamed from: d */
        public final String f79951d;

        /* renamed from: e */
        public final int f79952e;

        /* renamed from: f */
        public final int f79953f;

        public C29266b(String str, int i, int i2) {
            C87412m.m108594g(str, "appId");
            this.f79951d = str;
            this.f79952e = i;
            this.f79953f = i2;
        }

        public int compareTo(Object obj) {
            C29266b bVar = (C29266b) obj;
            C87412m.m108594g(bVar, "other");
            return hashCode() - bVar.hashCode();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!C87412m.m108589b(C29266b.class, obj != null ? obj.getClass() : null)) {
                return false;
            }
            C87412m.m108592e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgStorageExportServiceImpl.OccupiedPkgKey");
            C29266b bVar = (C29266b) obj;
            return C87412m.m108589b(this.f79951d, bVar.f79951d) && this.f79952e == bVar.f79952e && this.f79953f == bVar.f79953f;
        }

        public int hashCode() {
            return (((this.f79951d.hashCode() * 31) + this.f79952e) * 31) + this.f79953f;
        }

        public String toString() {
            return "OccupiedPkgKey(appId=" + this.f79951d + ", versionType=" + this.f79952e + ", version=" + this.f79953f + ')';
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.export.p$a */
    public static final class C81332a {
        public C81332a(C8480h hVar) {
        }
    }

    static {
        new C81332a((C8480h) null);
    }

    /* renamed from: Da */
    public int mo59390Da(String str) {
        WxaAttributes mL;
        WxaAttributes.WxaVersionInfo o2;
        C33914i jo;
        boolean z = true;
        if (str == null || str.length() == 0) {
            return 0;
        }
        String f = C81661j.m100181f(str);
        if (f == null || f.length() == 0) {
            f = C38163u.f100829c.get(str);
        }
        if (!(f == null || f.length() == 0)) {
            z = false;
        }
        int i = (!z && (jo = ((C33915j) C81161g2.Bx0(C33915j.class)).mo59363jo(f)) != null) ? jo.field_appVersion : 0;
        if (i >= 0) {
            return i;
        }
        C90978e0 Cx0 = C81161g2.Cx0();
        if (Cx0 == null || (mL = Cx0.mo114011mL(str, "versionInfo")) == null || (o2 = mL.mo113942o2()) == null) {
            return 0;
        }
        return o2.f239452d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0085 A[RETURN] */
    /* renamed from: Ef */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo59391Ef(java.lang.String r5, int r6) {
        /*
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L_0x000c
            int r1 = r5.length()
            if (r1 != 0) goto L_0x000a
            goto L_0x000c
        L_0x000a:
            r1 = 0
            goto L_0x000d
        L_0x000c:
            r1 = 1
        L_0x000d:
            if (r1 == 0) goto L_0x0010
            return r0
        L_0x0010:
            r1 = 0
            if (r6 != 0) goto L_0x003c
            wi0.e0 r2 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.Cx0()
            java.lang.String r3 = "versionInfo"
            java.lang.String[] r3 = new java.lang.String[]{r3}
            com.tencent.mm.plugin.appbrand.config.WxaAttributes r2 = r2.mo114011mL(r5, r3)
            if (r2 == 0) goto L_0x0029
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo r2 = r2.mo113942o2()
            goto L_0x002a
        L_0x0029:
            r2 = r1
        L_0x002a:
            if (r2 == 0) goto L_0x003c
            int r3 = r2.f239452d
            if (r3 <= 0) goto L_0x003c
            com.tencent.p014mm.plugin.appbrand.app.C81161g2.requireAccountInitializedOnDemand()
            com.tencent.mm.plugin.appbrand.appcache.h3 r3 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.f238471g
            int r2 = r2.f239452d
            java.util.List r5 = r3.mo113539u(r5, r6, r2)
            goto L_0x0046
        L_0x003c:
            com.tencent.p014mm.plugin.appbrand.app.C81161g2.requireAccountInitializedOnDemand()
            com.tencent.mm.plugin.appbrand.appcache.h3 r2 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.f238471g
            r3 = -1
            java.util.List r5 = r2.mo113539u(r5, r6, r3)
        L_0x0046:
            java.lang.String r6 = "run {\n                if…onType, -1)\n            }"
            gy3.C87412m.m108593f(r5, r6)
            java.util.Iterator r5 = r5.iterator()
            boolean r6 = r5.hasNext()
            if (r6 != 0) goto L_0x0057
            goto L_0x007a
        L_0x0057:
            java.lang.Object r1 = r5.next()
            boolean r6 = r5.hasNext()
            if (r6 != 0) goto L_0x0062
            goto L_0x007a
        L_0x0062:
            r6 = r1
            com.tencent.mm.plugin.appbrand.appcache.z2 r6 = (com.tencent.p014mm.plugin.appbrand.appcache.C29315z2) r6
            int r6 = r6.field_version
        L_0x0067:
            java.lang.Object r2 = r5.next()
            r3 = r2
            com.tencent.mm.plugin.appbrand.appcache.z2 r3 = (com.tencent.p014mm.plugin.appbrand.appcache.C29315z2) r3
            int r3 = r3.field_version
            if (r6 >= r3) goto L_0x0074
            r1 = r2
            r6 = r3
        L_0x0074:
            boolean r2 = r5.hasNext()
            if (r2 != 0) goto L_0x0067
        L_0x007a:
            com.tencent.mm.plugin.appbrand.appcache.z2 r1 = (com.tencent.p014mm.plugin.appbrand.appcache.C29315z2) r1
            if (r1 == 0) goto L_0x0085
            com.tencent.mm.plugin.appbrand.appcache.m2 r5 = com.tencent.p014mm.plugin.appbrand.appcache.C81292m2.f238703a
            boolean r5 = r5.mo113566a(r1)
            return r5
        L_0x0085:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.appcache.predownload.export.C81331p.mo59391Ef(java.lang.String, int):boolean");
    }

    /* renamed from: Yh */
    public C29315z2 mo59392Yh(String str, int i, int i2) {
        C29315z2 z2Var;
        boolean z = true;
        if (str == null || str.length() == 0) {
            return null;
        }
        if (i2 == 0) {
            C81161g2.requireAccountInitializedOnDemand();
            z2Var = C81161g2.f238471g.mo113516Kn(str, i, new String[0]);
        } else {
            C81161g2.requireAccountInitializedOnDemand();
            z2Var = C81161g2.f238471g.mo113533pl(str, i2, i, new String[0]);
        }
        if (z2Var != null) {
            String str2 = z2Var.field_pkgPath;
            if (!(str2 == null || str2.length() == 0) && C86013q1.m106450k(z2Var.field_pkgPath)) {
                C86009m1 m1Var = new C86009m1(z2Var.field_pkgPath);
                String[] strArr = {z2Var.field_versionMd5, z2Var.field_NewMd5};
                long j = z2Var.field_checksum;
                if (j == 0 || !C81293m3.m99677c()) {
                    z = C81293m3.m99684j(m1Var, strArr, str, "getPkgRecord", (C9514m<String>) null);
                } else {
                    long a = C9513g.m9208a(m1Var.mo119976n());
                    if (a != j) {
                        Log.m105921e("MicroMsg.WxaPkgUpdater", "[%s]verifyPkg, appId[%s] checksum[%d] != file.crc32[%s]", "getPkgRecord", str, Long.valueOf(j), Long.valueOf(a));
                        z = false;
                    }
                }
                if (z) {
                    return z2Var;
                }
            }
        }
        return null;
    }

    public boolean cm0(String str, int i, String str2) {
        String str3;
        if (C86013q1.m106450k(str2)) {
            if (!(str == null || str.length() == 0)) {
                String str4 = null;
                if (Util.isNullOrNil((String) null)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    if (Util.isNullOrNil((String) null)) {
                        str3 = "";
                    } else {
                        str3 = '$' + null;
                    }
                    sb.append(str3);
                    str4 = sb.toString();
                }
                String i2 = C81372u2.m99809i(str4, i);
                if (!FilesCopy.copy(str2, i2, false)) {
                    Log.m105921e("MicroMsg.WxaPkgStorageExportServiceImpl", "copy pkg failed: appId[%s] version[%d] from %s to %s", str, Integer.valueOf(i), str2, i2);
                    return false;
                }
                try {
                    C87412m.m108591d(i2);
                    String f = WxaPkgWrappingInfo.m99521f(new C86009m1(i2));
                    C29315z2 z2Var = new C29315z2();
                    z2Var.field_appId = str;
                    z2Var.field_version = i;
                    z2Var.field_debugType = 0;
                    z2Var.field_pkgPath = i2;
                    z2Var.field_versionMd5 = f;
                    z2Var.field_NewMd5 = f;
                    C81161g2.requireAccountInitializedOnDemand();
                    C81258h3 h3Var = C81161g2.f238471g;
                    if (h3Var != null) {
                        return h3Var.mo113535r(z2Var);
                    }
                    Log.m105920e("MicroMsg.WxaPkgStorageExportServiceImpl", "insertPkg failed: appId:" + str + ", version:" + i + ", filePath:" + str2 + ", storage is null");
                    return false;
                } catch (IOException e) {
                    Log.m105920e("MicroMsg.WxaPkgStorageExportServiceImpl", "insertPkg(appId:" + str + ", version:" + i + ", filePath:" + str2 + "), get exception:" + e);
                }
            }
        }
        return false;
    }

    /* renamed from: hF */
    public void mo59394hF(String str, int i) {
        if (!(str == null || str.length() == 0)) {
            this.f238793d.put(str, new C29266b(str, 0, i));
        }
    }

    public C29315z2 so0(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        C81161g2.requireAccountInitializedOnDemand();
        C29315z2 x = C81161g2.f238471g.mo113516Kn(str, 0, new String[0]);
        if (x != null) {
            String str2 = x.field_pkgPath;
            if (!(str2 == null || str2.length() == 0) && C86013q1.m106450k(x.field_pkgPath)) {
                if (C81293m3.m99684j(new C86009m1(x.field_pkgPath), new String[]{x.field_versionMd5, x.field_NewMd5}, str, "getPkgRecord", (C9514m<String>) null)) {
                    return x;
                }
            }
        }
        return null;
    }

    public final List<C29266b> vx0() {
        return new LinkedList(this.f238793d.values());
    }
}
