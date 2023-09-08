package com.tencent.p014mm.plugin.appbrand.task.checkdemo;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import p749xh.C38592ja;

/* renamed from: com.tencent.mm.plugin.appbrand.task.checkdemo.d */
public class C29640d extends MAutoStorage<C29639c> {

    /* renamed from: d */
    public static final String[] f80573d = {MAutoStorage.getCreateSQLs(C29639c.f80572r, "WxaCheckDemoInfo")};

    public C29640d(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C29639c.f80572r, "WxaCheckDemoInfo", C38592ja.f102698h);
    }

    /* renamed from: Lo */
    public boolean mo56868Lo(String str, boolean z) {
        if (Util.isNullOrNil(str)) {
            Log.m105925i("MicroMsg.AppBrandTaskWxaCheckDemoInfoStorage", "setWxaCheckDemoInfoData,invalid input %s", str);
            return false;
        }
        C29639c cVar = new C29639c();
        cVar.field_appId = str;
        boolean z2 = get(cVar, new String[0]);
        cVar.field_permissionDemo = z;
        cVar.field_versiontime = Util.nowSecond();
        if (!(z2 ? update(cVar, new String[0]) : insert(cVar))) {
            return false;
        }
        Log.m105925i("MicroMsg.AppBrandTaskWxaCheckDemoInfoStorage", "setWxaCheckDemoInfoData appId:%s ok", str);
        return true;
    }

    /* renamed from: jo */
    public void mo56869jo() {
        try {
            Log.m105924i("MicroMsg.AppBrandTaskWxaCheckDemoInfoStorage", "deleteAll");
            super.execSQL("WxaCheckDemoInfo", "delete from WxaCheckDemoInfo");
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.AppBrandTaskWxaCheckDemoInfoStorage", e, " deleteAll Exception", new Object[0]);
        }
    }
}
