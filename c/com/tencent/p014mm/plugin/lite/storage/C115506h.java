package com.tencent.p014mm.plugin.lite.storage;

import com.tencent.liteapp.storage.WxaLiteAppInfo;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;

/* renamed from: com.tencent.mm.plugin.lite.storage.h */
public class C115506h extends C115503c {

    /* renamed from: H */
    public static IAutoDBItem.MAutoDBInfo f346326H = C115503c.initAutoDBInfo(C115506h.class);

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return null;
    }

    /* renamed from: l2 */
    public WxaLiteAppInfo mo175486l2() {
        WxaLiteAppInfo wxaLiteAppInfo = new WxaLiteAppInfo();
        wxaLiteAppInfo.f339290d = this.field_appId;
        wxaLiteAppInfo.f339295i = this.field_pkgPath;
        wxaLiteAppInfo.f339294h = this.field_signatureKey;
        wxaLiteAppInfo.f339301r = this.field_updateTime;
        wxaLiteAppInfo.f339297n = this.field_patchId;
        wxaLiteAppInfo.f339292f = this.field_url;
        wxaLiteAppInfo.f339293g = this.field_md5;
        wxaLiteAppInfo.f339302s = this.field_lastUseTime;
        wxaLiteAppInfo.f339291e = this.field_groupId;
        wxaLiteAppInfo.f339296j = this.field_pkgType;
        return wxaLiteAppInfo;
    }
}
