package i52;

import com.tencent.p014mm.plugin.magicbrush.api.WxaMagicPkgInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.vfs.VFSStrategy;
import q52.C35766o;

/* renamed from: i52.f */
public class C33209f {
    /* renamed from: a */
    public static String m39985a() {
        String d = VFSStrategy.m163776d("magic");
        if (Util.isNullOrNil(d)) {
            return null;
        }
        return d + "/biz/";
    }

    /* renamed from: b */
    public static String m39986b(String str, String str2) {
        return m39988d(str) + "/" + str2;
    }

    /* renamed from: c */
    public static String m39987c(String str, String str2) {
        if (Util.isNullOrNil(str2)) {
            str2 = "_";
        }
        return m39988d(str) + "/" + str2;
    }

    /* renamed from: d */
    public static String m39988d(String str) {
        String e = m39989e();
        if (Util.isNullOrNil(e)) {
            return null;
        }
        return e + "/pkg/" + str;
    }

    /* renamed from: e */
    public static String m39989e() {
        String d = VFSStrategy.m163776d("magic");
        if (Util.isNullOrNil(d)) {
            return null;
        }
        return d + "/magicpkg";
    }

    /* renamed from: f */
    public static String m39990f(String str, String str2) {
        return m39988d(str) + "/" + str2 + ".zip";
    }

    /* renamed from: g */
    public static boolean m39991g(WxaMagicPkgInfo wxaMagicPkgInfo) {
        if (wxaMagicPkgInfo != null) {
            try {
                String str = wxaMagicPkgInfo.f81567g;
                String a = Util.isNullOrNil(wxaMagicPkgInfo.f81569i) ? C35766o.f95534a.mo60387a(wxaMagicPkgInfo.f81568h) : wxaMagicPkgInfo.f81567g;
                Log.m105925i("MicroMsg.MagicPkgPath", "pkgFileExist pkgId:%s,pid:%s,md5:%s,wxaPkgPath:%s", wxaMagicPkgInfo.f81564d, wxaMagicPkgInfo.f81571n, wxaMagicPkgInfo.f81566f, a);
                if (C86013q1.m106450k(a) && C86013q1.m106450k(str)) {
                    Log.m105924i("MicroMsg.MagicPkgPath", "wxapkg exist");
                    return true;
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.MagicPkgPath", e, "pkgFileExist", new Object[0]);
            }
        }
        Log.m105924i("MicroMsg.MagicPkgPath", "pkg not exist");
        return false;
    }
}
