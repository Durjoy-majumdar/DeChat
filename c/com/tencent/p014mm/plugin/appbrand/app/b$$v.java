package com.tencent.p014mm.plugin.appbrand.app;

import com.tencent.p014mm.plugin.appbrand.appcache.predownload.storage.WxaSyncCmdPersistentStorage;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;

/* renamed from: com.tencent.mm.plugin.appbrand.app.b$$v */
public class b$$v implements b$$h0<WxaSyncCmdPersistentStorage> {
    /* renamed from: a */
    public Object mo113337a(ISQLiteDatabase iSQLiteDatabase) {
        WxaSyncCmdPersistentStorage.f79982e = new C81149c(this);
        WxaSyncCmdPersistentStorage.f79983f = new C81151d(this);
        return new WxaSyncCmdPersistentStorage(iSQLiteDatabase);
    }
}
