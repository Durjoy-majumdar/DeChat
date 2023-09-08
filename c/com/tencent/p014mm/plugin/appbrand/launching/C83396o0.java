package com.tencent.p014mm.plugin.appbrand.launching;

import android.text.TextUtils;
import android.util.Pair;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.appcache.C29315z2;
import com.tencent.p014mm.plugin.appbrand.appcache.C81258h3;
import com.tencent.p014mm.plugin.appbrand.appcache.C81355t2;
import com.tencent.p014mm.plugin.appbrand.appcache.C81372u2;
import com.tencent.p014mm.plugin.appbrand.appcache.WxaPkgIntegrityChecker;
import com.tencent.p014mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.p014mm.pointers.PString;
import com.tencent.p014mm.sdk.platformtools.FilePathGenerator;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import java.util.Locale;
import u24.C90599h;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.o0 */
public final class C83396o0 {
    /* renamed from: a */
    public static boolean m102336a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        C81161g2.requireAccountInitializedOnDemand();
        for (C29315z2 next : C81161g2.f238471g.mo113540v(str, i)) {
            if (next != null && C86013q1.m106450k(next.field_pkgPath)) {
                String c = WxaPkgIntegrityChecker.m99520c(next.field_pkgPath);
                if (!TextUtils.isEmpty(c) && (C90599h.m113509b(c, next.field_versionMd5) || C90599h.m113509b(c, next.field_NewMd5))) {
                    Log.m105925i("MicroMsg.AppBrand.Launching.CheckPkgLogic", "checkMainPkgExistedForAppPreLaunch(%s), return true by key:%s", str, next.field_appId);
                    return true;
                }
            }
        }
        Log.m105925i("MicroMsg.AppBrand.Launching.CheckPkgLogic", "checkMainPkgExistedForAppPreLaunch(%s), not found", str);
        return false;
    }

    /* renamed from: b */
    public static WxaPkgWrappingInfo m102337b(String str, int i) {
        Object obj;
        C81161g2.requireAccountInitializedOnDemand();
        int[] y = C81161g2.f238471g.mo113543y(str);
        if (y != null && y.length > i) {
            while (true) {
                int i2 = i + 1;
                Pair<WxaPkgIntegrityChecker.C81220a, WxaPkgWrappingInfo> b = WxaPkgIntegrityChecker.m99519b(str, 0, y[i], (String) null);
                Object obj2 = b.first;
                if (obj2 == WxaPkgIntegrityChecker.C81220a.APP_READY && (obj = b.second) != null) {
                    return (WxaPkgWrappingInfo) obj;
                }
                if (obj2 == WxaPkgIntegrityChecker.C81220a.APP_NEED_MOVE && b.second != null) {
                    Log.m105924i("MicroMsg.AppBrand.Launching.CheckPkgLogic", "wxapkg need move, return legacy path");
                    return (WxaPkgWrappingInfo) b.second;
                } else if (obj2 == WxaPkgIntegrityChecker.C81220a.APP_LOCAL_EXIST && b.second != null) {
                    Log.m105924i("MicroMsg.AppBrand.Launching.CheckPkgLogic", "wxapkg local exist");
                    C81161g2.requireAccountInitializedOnDemand();
                    C81258h3 h3Var = C81161g2.f238471g;
                    Object obj3 = b.second;
                    h3Var.mo113514C(str, ((WxaPkgWrappingInfo) obj3).f238585d, ((WxaPkgWrappingInfo) obj3).pkgVersion, ((WxaPkgWrappingInfo) obj3).pkgPath);
                    return (WxaPkgWrappingInfo) b.second;
                } else if (i2 >= y.length) {
                    break;
                } else {
                    i = i2;
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    public static String m102338c(String str, int i, String[] strArr, PString pString) {
        Log.m105925i("MicroMsg.AppBrand.Launching.CheckPkgLogic", "findPkgFromPublicStorage appId:%s, targetVersion:%d", str, Integer.valueOf(i));
        String i2 = C81372u2.m99809i(str, i);
        String str2 = C81355t2.m99776b() + "firstParty/";
        FilePathGenerator.checkMkdir(str2);
        boolean startsWith = i2.startsWith(str2);
        String c = WxaPkgIntegrityChecker.m99520c(i2);
        if (m102339d(c, strArr)) {
            Log.m105924i("MicroMsg.AppBrand.Launching.CheckPkgLogic", "find pkg from public storage success");
            if (pString != null) {
                pString.value = c;
            }
            return i2;
        } else if (!startsWith) {
            return null;
        } else {
            StringBuilder sb = new StringBuilder();
            String str3 = C81355t2.m99776b() + "general/";
            FilePathGenerator.checkMkdir(str3);
            sb.append(str3);
            sb.append(String.format(Locale.US, "_%d_%d.wxapkg", new Object[]{Integer.valueOf(str.hashCode()), Integer.valueOf(i)}));
            String sb4 = sb.toString();
            String c2 = WxaPkgIntegrityChecker.m99520c(sb4);
            if (!m102339d(c2, strArr)) {
                return null;
            }
            Log.m105924i("MicroMsg.AppBrand.Launching.CheckPkgLogic", "find first party pkg from public storage success");
            if (pString != null) {
                pString.value = c2;
            }
            return sb4;
        }
    }

    /* renamed from: d */
    public static boolean m102339d(String str, String[] strArr) {
        if (!(Util.isNullOrNil(str) || strArr == null || strArr.length == 0)) {
            for (String str2 : strArr) {
                if (!Util.isNullOrNil(str2) && C90599h.m113509b(str2, str)) {
                    return true;
                }
            }
        }
        return false;
    }
}
