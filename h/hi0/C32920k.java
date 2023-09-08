package hi0;

import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.appcache.C29299s1;
import com.tencent.p014mm.plugin.appbrand.appcache.C29301t1;
import com.tencent.p014mm.plugin.appbrand.appcache.C29305u1;
import com.tencent.p014mm.plugin.appbrand.appcache.C29309v1;
import com.tencent.p014mm.plugin.appbrand.appcache.C81372u2;
import com.tencent.p014mm.plugin.appbrand.appcache.WxaPkgIntegrityChecker;
import com.tencent.p014mm.protocal.MMProtocalJni;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.thumbplayer.api.TPOptionalID;
import ii0.C87732a;
import te3.e75;
import te3.n75;

/* renamed from: hi0.k */
public class C32920k extends C87491a<Boolean, n75> {

    /* renamed from: hi0.k$a */
    public enum C32921a {
        ISSUE_DECRYPT,
        GET_CODE
    }

    /* renamed from: f */
    public static boolean m39851f(C29299s1 s1Var, C32921a aVar) {
        C29309v1 v1Var = (C29309v1) C81161g2.Bx0(C29309v1.class);
        String str = s1Var.field_appId;
        int i = s1Var.field_version;
        v1Var.getClass();
        C29305u1 u1Var = new C29305u1();
        u1Var.field_appId = str;
        u1Var.field_appVersion = i;
        if (!v1Var.get(u1Var, new String[0])) {
            u1Var = null;
        }
        if (u1Var != null) {
            return m39852g(s1Var, u1Var.field_decryptKey, u1Var.field_pkgMd5, u1Var.field_reportId, aVar);
        }
        Log.m105925i("MicroMsg.AppBrand.Predownload.CmdIssueDecryptKey", "decryptPkgAndSave get null key with %s", s1Var.mo56576l2());
        return false;
    }

    /* renamed from: g */
    public static boolean m39852g(C29299s1 s1Var, String str, String str2, int i, C32921a aVar) {
        C29299s1 s1Var2 = s1Var;
        String str3 = str2;
        int i2 = i;
        int i3 = aVar.ordinal() != 0 ? 127 : 131;
        C87732a aVar2 = C87732a.INSTANCE;
        aVar2.mo122144a(i, i3);
        String i4 = C81372u2.m99809i(s1Var2.field_appId, s1Var2.field_version);
        int aesDecryptFile = MMProtocalJni.aesDecryptFile(s1Var2.field_pkgPath, i4, str.getBytes());
        boolean z = false;
        Log.m105925i("MicroMsg.AppBrand.Predownload.CmdIssueDecryptKey", "decryptPkgAndSave, appId(%s), version(%d), ret %d", s1Var2.field_appId, Integer.valueOf(s1Var2.field_version), Integer.valueOf(aesDecryptFile));
        if (aesDecryptFile != 0) {
            aVar2.mo122144a(i, aVar.ordinal() != 0 ? 129 : 133);
            return false;
        }
        String q = C86013q1.m106456q(i4);
        if (!q.equals(str2)) {
            Log.m105921e("MicroMsg.AppBrand.Predownload.CmdIssueDecryptKey", "decryptPkgAndSave, file_md5(%s) expect_md5(%s) mismatch", q, str3);
            aVar2.mo122144a(i, aVar.ordinal() != 0 ? 130 : 134);
            return false;
        }
        C81161g2.requireAccountInitializedOnDemand();
        C81161g2.f238471g.mo113527k(s1Var2.field_appId, 0, s1Var2.field_version, str2, (String) null);
        C81161g2.requireAccountInitializedOnDemand();
        boolean C = C81161g2.f238471g.mo113514C(s1Var2.field_appId, 0, s1Var2.field_version, i4);
        aVar2.mo122144a(i, aVar.ordinal() != 0 ? C ? TPOptionalID.f349338xc9bdf6cd : 144 : C ? 147 : 148);
        C86013q1.m106447h(s1Var2.field_pkgPath);
        aVar2.mo122144a(i, ((C29301t1) C81161g2.Bx0(C29301t1.class)).delete(s1Var, new String[0]) ? 139 : 140);
        if (aVar != C32921a.ISSUE_DECRYPT) {
            C29309v1 v1Var = (C29309v1) C81161g2.Bx0(C29309v1.class);
            String str4 = s1Var2.field_appId;
            int i5 = s1Var2.field_version;
            v1Var.getClass();
            if (!Util.isNullOrNil(str4)) {
                C29305u1 u1Var = new C29305u1();
                u1Var.field_appId = str4;
                u1Var.field_appVersion = i5;
                z = v1Var.delete(u1Var, new String[0]);
            }
            aVar2.mo122144a(i, z ? 141 : TPOptionalID.OPTION_ID_BEFORE_LONG_SEEK_AV_PTS_ALIGN_MAX_THRESHOLD_MS);
        }
        aVar2.mo122144a(i, aVar.ordinal() != 0 ? 128 : 132);
        return true;
    }

    /* renamed from: b */
    public Object mo58858b(String str, String str2, Object obj) {
        boolean z;
        n75 n75 = (n75) obj;
        int i = n75.f138463f;
        String str3 = n75.f138462e;
        boolean z2 = false;
        if (Util.isNullOrNil(str3)) {
            Log.m105921e("MicroMsg.AppBrand.Predownload.CmdIssueDecryptKey", "call appId(%s) version(%d) key nil", str2, Integer.valueOf(i));
            C87732a.INSTANCE.mo122144a(n75.f138461d.f132768f, 124);
            return Boolean.FALSE;
        } else if (WxaPkgIntegrityChecker.m99519b(str2, 0, i, (String) null).first == WxaPkgIntegrityChecker.C81220a.APP_READY) {
            Log.m105925i("MicroMsg.AppBrand.Predownload.CmdIssueDecryptKey", "call, normal pkg ok appId(%s), version(%d)", str2, Integer.valueOf(i));
            C87732a.INSTANCE.mo122144a(n75.f138461d.f132768f, 125);
            return Boolean.FALSE;
        } else {
            C29299s1 qq = ((C29301t1) C81161g2.Bx0(C29301t1.class)).mo56578qq(str2, 1, i);
            if (qq == null) {
                Log.m105921e("MicroMsg.AppBrand.Predownload.CmdIssueDecryptKey", "call, null encrypt pkg info with %s, %d", str2, Integer.valueOf(i));
                C87732a.INSTANCE.mo122144a(n75.f138461d.f132768f, 126);
                z = true;
            } else {
                z = !m39852g(qq, n75.f138462e, n75.f138464g, n75.f138461d.f132768f, C32921a.ISSUE_DECRYPT);
            }
            if (z) {
                C29309v1 v1Var = (C29309v1) C81161g2.Bx0(C29309v1.class);
                String str4 = n75.f138464g;
                int i2 = n75.f138461d.f132768f;
                v1Var.getClass();
                if (Util.isNullOrNil(str2) || Util.isNullOrNil(str3)) {
                    Log.m105921e("MicroMsg.AppBrand.Predownload.PushWxaPkgDecryptKeyStorage", "setDecryptKey, invalid appId[%s], decryptKey[%s]", str2, str3);
                } else {
                    C29305u1 u1Var = new C29305u1();
                    u1Var.field_appId = str2;
                    u1Var.field_appVersion = i;
                    boolean z3 = v1Var.get(u1Var, new String[0]);
                    u1Var.field_decryptKey = str3;
                    u1Var.field_reportId = i2;
                    u1Var.field_pkgMd5 = str4;
                    z2 = z3 ? v1Var.update(u1Var, new String[0]) : v1Var.insert(u1Var);
                }
                C87732a.INSTANCE.mo122144a(n75.f138461d.f132768f, z2 ? 135 : 136);
            }
            return Boolean.TRUE;
        }
    }

    /* renamed from: d */
    public e75 mo58859d(Object obj) {
        return ((n75) obj).f138461d;
    }

    /* renamed from: e */
    public String mo58860e() {
        return "CmdIssueDecryptKey";
    }
}
