package com.tencent.p014mm.plugin.appbrand.appcache;

import android.util.Pair;
import bp3.C28361q;
import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.appcache.C81355t2;
import com.tencent.p014mm.plugin.appbrand.appcache.WxaPkgIntegrityChecker;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di0.C31189h;
import di3.C86301e;
import ei3.C86522b;
import f40.C86709a0;
import zt3.C119157j;

@C86522b(creator = C81236c1.class, dependencies = {C81161g2.class}, onProcess = {C80625v0.MATCH_MM})
/* renamed from: com.tencent.mm.plugin.appbrand.appcache.c1 */
public class C81236c1 extends C86301e implements C31189h {

    /* renamed from: g */
    public static final C28361q<C81236c1> f238623g = new c1$$d();

    /* renamed from: d */
    public int f238624d = -1;

    /* renamed from: e */
    public String f238625e = null;

    /* renamed from: f */
    public volatile C81296n2 f238626f;

    public static C81236c1 vx0() {
        return f238623g.get();
    }

    /* renamed from: kh */
    public void mo58016kh(boolean z, Runnable runnable) {
        boolean z2 = z;
        Runnable runnable2 = runnable;
        Pair<WxaPkgIntegrityChecker.C81220a, WxaPkgWrappingInfo> a = WxaPkgIntegrityChecker.m99518a(z2, true);
        if (a.second != null) {
            Log.m105925i("MicroMsg.AppBrand.PkgDownloadService", "checkLibUnbrokenOrDownload, releaseLib:%b, skipLocalDevPack:true, already cached, version:%d", Boolean.valueOf(z), Integer.valueOf(((WxaPkgWrappingInfo) a.second).pkgVersion()));
        } else if (a.first == WxaPkgIntegrityChecker.C81220a.APP_BROKEN) {
            C81161g2.requireAccountInitializedOnDemand();
            C29315z2 x = C81161g2.f238471g.mo113516Kn("@LibraryAppId", z2 ? 0 : 999, "downloadURL", ProviderConstants.API_COLNAME_FEATURE_VERSION);
            if (x != null && !Util.isNullOrNil(x.field_downloadURL)) {
                c1$$e c1__e = new c1$$e(this, z2, z2 ? x.field_version : 0, runnable2);
                if (z2) {
                    if (this.f238624d > 0 && !Util.isNullOrNil(this.f238625e)) {
                        boolean a2 = C86709a0.m107522a();
                        Log.m105925i("MicroMsg.AppBrand.PkgDownloadService", "[incremental] lib can be patch, abtest open %b", Boolean.valueOf(a2));
                        if (a2) {
                            if (WxaPkgIntegrityChecker.m99519b("@LibraryAppId", 0, this.f238624d, (String) null).first == WxaPkgIntegrityChecker.C81220a.APP_READY) {
                                Log.m105924i("MicroMsg.AppBrand.PkgDownloadService", "[incremental] start incremental lib download");
                                C81300o2 o2Var = new C81300o2("@LibraryAppId", this.f238624d, x.field_version, this.f238625e, c1__e);
                                o2Var.f251361p = null;
                                C81293m3.m99681g(o2Var, c1__e);
                                return;
                            }
                            Log.m105921e("MicroMsg.AppBrand.PkgDownloadService", "[incremental] OldLibPkg[%d] or PatchUrl[%s] Invalid", Integer.valueOf(this.f238624d), this.f238625e);
                        }
                    }
                    C81293m3.m99683i("@LibraryAppId", 0, x.field_version, x.field_downloadURL, c1__e);
                    return;
                }
                C81296n2 n2Var = new C81296n2("@LibraryAppId", 999, (String) null, x.field_downloadURL, new c1$$a(x));
                this.f238626f = n2Var;
                C81293m3.m99681g(n2Var, c1__e);
                ((C119157j) C119157j.f356862d).mo183895z(new c1$$b());
            }
        } else if (runnable2 != null) {
            runnable.run();
        }
    }

    public void wx0(String str, String str2, String str3, long j, long j2) {
        C81161g2.requireAccountInitializedOnDemand();
        boolean j3 = C81161g2.f238471g.mo113526j("@LibraryAppId", 999, str2, str3, j, j2);
        Log.m105925i("MicroMsg.AppBrand.PkgDownloadService", "saveTestCommLibInfo, updated:%b, reason:%s, url:%s, md5:%s, startTime:%s, endTime:%s", Boolean.valueOf(j3), str, str2, str3, Util.formatUnixTime(j), Util.formatUnixTime(j2));
        if (j3) {
            C81296n2 n2Var = this.f238626f;
            if (n2Var != null) {
                Log.m105925i("MicroMsg.WxaPkgUpdater", "cancelRequest %s", n2Var.f249581a);
                try {
                    C81355t2.C81359d dVar = C81293m3.m99678d().f238706b.f238836a;
                    dVar.getClass();
                    dVar.mo119164b(n2Var.f249581a);
                } finally {
                    C81293m3.m99680f(n2Var.f249581a, true);
                }
            }
            mo58016kh(false, (Runnable) null);
        } else if (this.f238626f == null) {
            mo58016kh(false, (Runnable) null);
        } else {
            ((C119157j) C119157j.f356862d).mo183895z(new c1$$c());
        }
    }
}
