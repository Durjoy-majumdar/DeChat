package com.tencent.p014mm.plugin.appbrand.appcache;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.vfs.C86013q1;
import p749xh.C38645q7;
import tr0.C37242c;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.t1 */
public class C29301t1 extends C37242c<C29299s1> {

    /* renamed from: f */
    public static final String[] f80013f = {MAutoStorage.getCreateSQLs(C29299s1.f80009w, "PredownloadEncryptPkgInfo")};

    /* renamed from: e */
    public final ISQLiteDatabase f80014e;

    public C29301t1(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C29299s1.f80009w, "PredownloadEncryptPkgInfo", C38645q7.f103417j);
        this.f80014e = iSQLiteDatabase;
    }

    /* renamed from: jo */
    public static boolean m38619jo(C29299s1 s1Var) {
        if (Util.isNullOrNil(s1Var.field_pkgPath)) {
            Log.m105925i("MicroMsg.AppBrand.PredownloadEncryptPkgStorage", "checkPkgIntegrity, with %s path nil", s1Var.mo56576l2());
            return false;
        } else if (Util.isNullOrNil(s1Var.field_pkgMd5)) {
            Log.m105925i("MicroMsg.AppBrand.PredownloadEncryptPkgStorage", "checkPkgIntegrity, with %s record md5 nil", s1Var.mo56576l2());
            return false;
        } else {
            String q = C86013q1.m106456q(s1Var.field_pkgPath);
            Log.m105925i("MicroMsg.AppBrand.PredownloadEncryptPkgStorage", "checkPkgIntegrity with %s, file_md5(%s), record_md5(%s)", s1Var.mo56576l2(), q, s1Var.field_pkgMd5);
            return s1Var.field_pkgMd5.equals(q);
        }
    }

    /* renamed from: Lo */
    public C29299s1 mo56577Lo(String str, int i, int i2) {
        if (Util.isNullOrNil(str)) {
            return null;
        }
        C29299s1 s1Var = new C29299s1();
        s1Var.field_appId = str;
        s1Var.field_type = i;
        s1Var.field_version = i2;
        if (get(s1Var, C29299s1.f80008v)) {
            return s1Var;
        }
        return null;
    }

    /* renamed from: qq */
    public C29299s1 mo56578qq(String str, int i, int i2) {
        C29299s1 Lo = mo56577Lo(str, i, i2);
        if (Lo == null || !m38619jo(Lo)) {
            return null;
        }
        return Lo;
    }
}
