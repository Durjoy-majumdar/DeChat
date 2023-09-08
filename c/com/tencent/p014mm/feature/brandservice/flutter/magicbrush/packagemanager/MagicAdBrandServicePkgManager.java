package com.tencent.p014mm.feature.brandservice.flutter.magicbrush.packagemanager;

import com.tencent.p014mm.plugin.magicbrush.api.MagicBrushConstants$BizNames;
import com.tencent.p014mm.plugin.magicbrush.base.MBBootsPkgManagementBiz;
import e42.C86425a;
import e42.C86426b;
import e42.C86427c;
import gy3.C87412m;

/* renamed from: com.tencent.mm.feature.brandservice.flutter.magicbrush.packagemanager.MagicAdBrandServicePkgManager */
public final class MagicAdBrandServicePkgManager extends MBBootsPkgManagementBiz {

    /* renamed from: d */
    public final String f237638d = "surface/app/MagicAdBrandService.wspkg";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MagicAdBrandServicePkgManager(String str) {
        super(str);
        C87412m.m108594g(str, "instanceName");
    }

    /* renamed from: c */
    public String mo109579c() {
        return MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_AD_BRAND_SERVICE;
    }

    /* renamed from: i */
    public C86425a mo112232i() {
        return new C86425a("jsapi/" + this.f237638d, 7, "514c8af890070cfd88c4e3b396405a74");
    }

    /* renamed from: k */
    public C86427c mo112233k() {
        return new C86427c(this.f237638d, C86426b.DEFAULT);
    }

    /* renamed from: m */
    public String mo112234m() {
        return "/index.js";
    }
}
