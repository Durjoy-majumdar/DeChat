package com.tencent.p014mm.plugin.appbrand.backgroundfetch;

import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;

/* renamed from: com.tencent.mm.plugin.appbrand.backgroundfetch.k */
public class C29430k extends MAutoStorage<C29429j> {

    /* renamed from: d */
    public static final String[] f80252d = {MAutoStorage.getCreateSQLs(C29429j.f80251p, "AppBrandBackgroundFetchDataToken")};

    public C29430k(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C29429j.f80251p, "AppBrandBackgroundFetchDataToken", (String[]) null);
    }

    /* renamed from: B9 */
    public boolean mo56701B9(String str, String str2) {
        if (Util.isNullOrNil(str) || Util.isNullOrNil(str2)) {
            return true;
        }
        C29429j jVar = new C29429j();
        jVar.field_username = str;
        jVar.field_token = str2;
        C29429j jVar2 = null;
        if (!Util.isNullOrNil(str)) {
            C29429j jVar3 = new C29429j();
            jVar3.field_username = str;
            if (super.get(jVar3, "username")) {
                jVar2 = jVar3;
            }
        }
        return jVar2 == null ? super.insert(jVar) : super.update(jVar, "username");
    }

    /* renamed from: c */
    public boolean mo56702c(String str) {
        if (Util.isNullOrNil(str)) {
            return true;
        }
        C29429j jVar = new C29429j();
        jVar.field_username = str;
        return super.delete(jVar, "username");
    }

    public AppBrandBackgroundFetchDataTokenParcel get(String str) {
        if (Util.isNullOrNil(str)) {
            return null;
        }
        C29429j jVar = new C29429j();
        jVar.field_username = str;
        if (!super.get(jVar, "username")) {
            return null;
        }
        AppBrandBackgroundFetchDataTokenParcel appBrandBackgroundFetchDataTokenParcel = new AppBrandBackgroundFetchDataTokenParcel();
        appBrandBackgroundFetchDataTokenParcel.f80234d = jVar.field_username;
        appBrandBackgroundFetchDataTokenParcel.f80235e = jVar.field_token;
        return appBrandBackgroundFetchDataTokenParcel;
    }
}
