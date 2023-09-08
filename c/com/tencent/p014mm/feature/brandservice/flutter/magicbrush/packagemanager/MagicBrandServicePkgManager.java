package com.tencent.p014mm.feature.brandservice.flutter.magicbrush.packagemanager;

import com.tencent.p014mm.plugin.magicbrush.api.MagicBrushConstants$BizNames;
import com.tencent.p014mm.plugin.magicbrush.base.MBBootsPkgManagementBiz;
import e42.C86425a;
import e42.C86426b;
import e42.C86427c;
import gy3.C87412m;

/* renamed from: com.tencent.mm.feature.brandservice.flutter.magicbrush.packagemanager.MagicBrandServicePkgManager */
public final class MagicBrandServicePkgManager extends MBBootsPkgManagementBiz {

    /* renamed from: d */
    public final String f237639d = "surface/app/MagicBrandService.wspkg";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MagicBrandServicePkgManager(String str) {
        super(str);
        C87412m.m108594g(str, "instanceName");
    }

    /* renamed from: c */
    public String mo109579c() {
        return MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_BRAND_SERVICE;
    }

    /* renamed from: i */
    public C86425a mo112232i() {
        return new C86425a("jsapi/" + this.f237639d, 4, "20a606c1047e7170346a3e85cfdd34bc");
    }

    /* renamed from: k */
    public C86427c mo112233k() {
        return new C86427c(this.f237639d, C86426b.DEFAULT);
    }

    /* renamed from: m */
    public String mo112234m() {
        return "/index.js";
    }
}
