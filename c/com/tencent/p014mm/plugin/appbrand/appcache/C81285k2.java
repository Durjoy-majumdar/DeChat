package com.tencent.p014mm.plugin.appbrand.appcache;

import android.util.Pair;
import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.appcache.WxaPkgIntegrityChecker;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import f40.C86709a0;
import java.io.IOException;
import te3.u45;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.k2 */
public enum C81285k2 {
    ;

    /* renamed from: a */
    public static void m99657a(boolean z, Runnable runnable) {
        ((C119157j) C119157j.f356862d).mo183876g(new k2$$a(z, runnable), "WxaCommLibVersionChecker");
    }

    /* renamed from: b */
    public static void m99658b(int i, u45 u45, k2$$b k2__b, Runnable runnable) {
        Object obj;
        int i2 = i;
        u45 u452 = u45;
        Runnable runnable2 = runnable;
        int ordinal = k2__b.ordinal();
        if (ordinal == 0) {
            if (u452.f259847i > 0) {
                C115669n.INSTANCE.mo175911u(1509, 3);
            }
            if (u452.f259846h > 0) {
                C115669n.INSTANCE.mo175911u(1509, 4);
            }
        } else if (ordinal == 2) {
            if (u452.f259847i > 0) {
                C115669n.INSTANCE.mo175911u(1509, 22);
            }
            if (u452.f259846h > 0) {
                C115669n.INSTANCE.mo175911u(1509, 23);
            }
        }
        C81161g2.requireAccountInitializedOnDemand();
        if (C81161g2.f238471g != null) {
            PInt pInt = new PInt();
            C81161g2.requireAccountInitializedOnDemand();
            C81161g2.f238471g.mo113525i(u452, pInt);
            boolean z = pInt.value > 0;
            C81161g2.requireAccountInitializedOnDemand();
            int l = C81161g2.f238471g.mo113528l("@LibraryAppId", 0);
            Pair<WxaPkgIntegrityChecker.C81220a, WxaPkgWrappingInfo> a = WxaPkgIntegrityChecker.m99518a(true, true);
            Object obj2 = a.first;
            boolean z2 = obj2 == WxaPkgIntegrityChecker.C81220a.APP_BROKEN;
            boolean z3 = obj2 == WxaPkgIntegrityChecker.C81220a.APP_NEED_MOVE;
            boolean z4 = obj2 == WxaPkgIntegrityChecker.C81220a.APP_LOCAL_EXIST;
            if (z) {
                int ordinal2 = k2__b.ordinal();
                if (ordinal2 == 0) {
                    C115669n nVar = C115669n.INSTANCE;
                    nVar.mo175911u(1509, 5);
                    nVar.mo175911u(1509, z2 ? 7 : 6);
                } else if (ordinal2 == 2) {
                    C115669n nVar2 = C115669n.INSTANCE;
                    nVar2.mo175911u(1509, 24);
                    nVar2.mo175911u(1509, z2 ? 26 : 25);
                }
            }
            Log.m105925i("MicroMsg.WxaCommLibVersionChecker", "onResp, requestUsingLibVersion %d, scene %s, needDownload = %b, version = %d, forceUpdate = %d, md5 = %s, url = %s, localMaxVersion = %d", Integer.valueOf(i), k2__b.name(), Boolean.valueOf(z2), Integer.valueOf(u452.f259844f), Integer.valueOf(u452.f259846h), u452.f259843e, u452.f259842d, Integer.valueOf(l));
            String str = null;
            if (z2) {
                if (i2 <= 0 || Util.isNullOrNil(u452.f259848j)) {
                    C81236c1 vx02 = C81236c1.vx0();
                    vx02.f238624d = -1;
                    vx02.f238625e = null;
                } else {
                    C81236c1 vx03 = C81236c1.vx0();
                    String str2 = u452.f259848j;
                    vx03.f238624d = i2;
                    vx03.f238625e = str2;
                }
                C81236c1.vx0().mo58016kh(true, runnable2);
                C29225l1 l1Var = new C29225l1();
                l1Var.field_key = "@LibraryAppId";
                l1Var.field_version = u452.f259844f;
                C81161g2.requireAccountInitializedOnDemand();
                if (!C81161g2.f238479r.get(l1Var, "key", ProviderConstants.API_COLNAME_FEATURE_VERSION)) {
                    l1Var.field_updateTime = Util.nowSecond();
                    l1Var.field_scene = k2__b.ordinal() + 1;
                    C81161g2.requireAccountInitializedOnDemand();
                    C81161g2.f238479r.insert(l1Var);
                }
            } else if (z3) {
                C81161g2.requireAccountInitializedOnDemand();
                C29315z2 m = C81161g2.f238471g.mo113533pl("@LibraryAppId", u452.f259844f, 0, new String[0]);
                if (m != null && !Util.isNullOrNil(m.field_pkgPath)) {
                    Log.m105925i("MicroMsg.WxaCommLibVersionChecker", "lib need to move into new path, version: %d", Integer.valueOf(u452.f259844f));
                    String str3 = m.field_pkgPath;
                    String j = C81372u2.m99810j(m.field_appId, str3);
                    if (!Util.isNullOrNil(j)) {
                        Log.m105925i("MicroMsg.WxaCommLibVersionChecker", "prepare to move wxapkg to new dir, legacy path: %s", str3);
                        if (C86013q1.m106463x(str3, j)) {
                            Log.m105924i("MicroMsg.WxaCommLibVersionChecker", "move wxapkg to new dir success");
                            try {
                                str = WxaPkgWrappingInfo.m99521f(new C86009m1(j));
                            } catch (IOException e) {
                                Log.m105921e("MicroMsg.WxaCommLibVersionChecker", "get file md5 fail", e);
                            }
                            String nullAsNil = Util.nullAsNil(str);
                            if (nullAsNil.equals(m.field_versionMd5) || nullAsNil.equals(m.field_NewMd5)) {
                                C81161g2.requireAccountInitializedOnDemand();
                                if (C81161g2.f238471g.mo113514C("@LibraryAppId", 0, u452.f259844f, j)) {
                                    ((C81295n0) C86312j.m106911c(C81295n0.class)).mo56503tJ(str3);
                                    Log.m105924i("MicroMsg.WxaCommLibVersionChecker", "update dir success");
                                }
                            } else {
                                Log.m105920e("MicroMsg.WxaCommLibVersionChecker", "check md5 fail after file move");
                            }
                        } else {
                            Log.m105921e("MicroMsg.WxaCommLibVersionChecker", "move wxapkg to new dir, move fail, new path: %s", j);
                        }
                    }
                }
            } else if (z4 && (obj = a.second) != null) {
                Log.m105925i("MicroMsg.WxaCommLibVersionChecker", "find lib in public pkg storage, version: %d", Integer.valueOf(((WxaPkgWrappingInfo) obj).pkgVersion));
                C81161g2.requireAccountInitializedOnDemand();
                C81258h3 h3Var = C81161g2.f238471g;
                Object obj3 = a.second;
                h3Var.mo113514C("@LibraryAppId", ((WxaPkgWrappingInfo) obj3).f238585d, ((WxaPkgWrappingInfo) obj3).pkgVersion, ((WxaPkgWrappingInfo) obj3).pkgPath);
            } else if (runnable2 != null) {
                runnable.run();
            }
            if (u452.f259846h > 0 && pInt.value > 0) {
                C81263i2.m99623a();
                return;
            }
            return;
        }
        Log.m105920e("MicroMsg.WxaCommLibVersionChecker", "onResp, null storage");
    }

    /* renamed from: c */
    public static void m99659c(boolean z) {
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_APP_BRAND_PUBLIC_LIB_UPDATE_NEXT_TIME_SEC_LONG, Long.valueOf(Util.nowSecond() - 1));
        if (z) {
            C86709a0.m107535s().mo121142i().mo119681a(true);
        }
    }
}
