package com.tencent.p014mm.plugin.lite.storage;

import com.tencent.liteapp.storage.WxaLiteAppBaselibInfo;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;

/* renamed from: com.tencent.mm.plugin.lite.storage.f */
public class C115504f extends C115502b {

    /* renamed from: D */
    public static IAutoDBItem.MAutoDBInfo f346323D = C115502b.initAutoDBInfo(C115504f.class);

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return null;
    }

    /* renamed from: l2 */
    public WxaLiteAppBaselibInfo mo175483l2() {
        WxaLiteAppBaselibInfo wxaLiteAppBaselibInfo = new WxaLiteAppBaselibInfo();
        wxaLiteAppBaselibInfo.f339281d = this.field_majorVersion;
        wxaLiteAppBaselibInfo.f339285h = this.field_pkgPath;
        wxaLiteAppBaselibInfo.f339284g = this.field_signatureKey;
        wxaLiteAppBaselibInfo.f339288n = this.field_updateTime;
        wxaLiteAppBaselibInfo.f339287j = this.field_patchId;
        wxaLiteAppBaselibInfo.f339282e = this.field_url;
        wxaLiteAppBaselibInfo.f339283f = this.field_md5;
        wxaLiteAppBaselibInfo.f339289o = this.field_lastUseTime;
        wxaLiteAppBaselibInfo.f339286i = this.field_pkgType;
        return wxaLiteAppBaselibInfo;
    }
}
