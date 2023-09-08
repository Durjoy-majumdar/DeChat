package com.tencent.p014mm.plugin.appbrand.backgroundfetch;

import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;

/* renamed from: com.tencent.mm.plugin.appbrand.backgroundfetch.f */
public class C29421f extends MAutoStorage<C29420e> {

    /* renamed from: d */
    public static final String[] f80239d = {MAutoStorage.getCreateSQLs(C29420e.f80238z, "AppBrandBackgroundFetchData")};

    public C29421f(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C29420e.f80238z, "AppBrandBackgroundFetchData", (String[]) null);
    }

    /* renamed from: OF */
    public boolean mo56695OF(String str, int i, String str2, String str3, String str4, int i2, long j) {
        if (Util.isNullOrNil(str)) {
            return true;
        }
        C29420e eVar = new C29420e();
        eVar.field_username = str;
        eVar.field_fetchType = i;
        eVar.field_data = str2;
        eVar.field_path = str3;
        eVar.field_query = str4;
        eVar.field_scene = i2;
        eVar.field_updateTime = j;
        C29420e eVar2 = null;
        if (!Util.isNullOrNil(str)) {
            C29420e eVar3 = new C29420e();
            eVar3.field_username = str;
            eVar3.field_fetchType = i;
            if (super.get(eVar3, "username", "fetchType")) {
                eVar2 = eVar3;
            }
        }
        return eVar2 == null ? super.insert(eVar) : super.update(eVar, "username", "fetchType");
    }

    /* renamed from: QV */
    public AppBrandBackgroundFetchDataParcel mo56696QV(String str, int i) {
        if (Util.isNullOrNil(str)) {
            return null;
        }
        C29420e eVar = new C29420e();
        eVar.field_username = str;
        eVar.field_fetchType = i;
        if (!super.get(eVar, "username", "fetchType")) {
            return null;
        }
        AppBrandBackgroundFetchDataParcel appBrandBackgroundFetchDataParcel = new AppBrandBackgroundFetchDataParcel();
        appBrandBackgroundFetchDataParcel.f80216d = eVar.field_username;
        appBrandBackgroundFetchDataParcel.f80217e = eVar.field_fetchType;
        appBrandBackgroundFetchDataParcel.f80218f = eVar.field_path;
        appBrandBackgroundFetchDataParcel.f80219g = eVar.field_query;
        appBrandBackgroundFetchDataParcel.f80220h = eVar.field_data;
        appBrandBackgroundFetchDataParcel.f80221i = eVar.field_scene;
        appBrandBackgroundFetchDataParcel.f80222j = eVar.field_updateTime;
        return appBrandBackgroundFetchDataParcel;
    }

    /* renamed from: W0 */
    public boolean mo56697W0(String str, int i) {
        if (Util.isNullOrNil(str)) {
            return true;
        }
        C29420e eVar = new C29420e();
        eVar.field_username = str;
        eVar.field_fetchType = i;
        return super.delete(eVar, "username", "fetchType");
    }
}
