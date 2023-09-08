package com.tencent.p014mm.plugin.appbrand.appusage;

import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import p749xh.C38614n;

/* renamed from: com.tencent.mm.plugin.appbrand.appusage.r */
public final class C29384r extends MAutoStorage<C29357b> {

    /* renamed from: e */
    public static final String[] f80172e = {MAutoStorage.getCreateSQLs(C29357b.f80128r, "AppBrandAppLaunchUsernameDuplicateRecord2")};

    /* renamed from: d */
    public final ISQLiteDatabase f80173d;

    public C29384r(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C29357b.f80128r, "AppBrandAppLaunchUsernameDuplicateRecord2", C38614n.f103045h);
        this.f80173d = iSQLiteDatabase;
    }

    /* renamed from: Lo */
    public boolean mo56650Lo(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        C29357b bVar = new C29357b();
        bVar.field_username = str;
        bVar.field_usernameHash = str.hashCode();
        return super.delete(bVar, "usernameHash");
    }

    /* renamed from: jo */
    public boolean mo56651jo(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        C29357b bVar = new C29357b();
        bVar.field_usernameHash = str.hashCode();
        if (!get(bVar, "usernameHash") || (str2 = bVar.field_username) == null || !str2.equals(str)) {
            bVar = null;
        }
        return bVar != null && bVar.field_updateTime > 0;
    }

    /* renamed from: qq */
    public final boolean mo56652qq(String str, long j) {
        if (Util.isNullOrNil(str)) {
            return false;
        }
        C29357b bVar = new C29357b();
        bVar.field_usernameHash = str.hashCode();
        bVar.field_username = str;
        boolean z = get(bVar, new String[0]);
        bVar.field_updateTime = j;
        return z ? update(bVar, new String[0]) : insert(bVar);
    }
}
