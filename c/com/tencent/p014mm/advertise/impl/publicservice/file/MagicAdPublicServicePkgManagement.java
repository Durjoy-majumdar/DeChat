package com.tencent.p014mm.advertise.impl.publicservice.file;

import com.tencent.p014mm.plugin.magicbrush.api.MagicBrushConstants$BizNames;
import com.tencent.p014mm.plugin.magicbrush.api.MagicBrushConstants$PublicServiceNames;
import com.tencent.p014mm.plugin.magicbrush.base.MBBootsPkgManagementPublicService;
import e42.C86425a;
import e42.C86426b;
import e42.C86427c;
import gy3.C87412m;
import java.util.Collection;
import sx3.C110826x0;

/* renamed from: com.tencent.mm.advertise.impl.publicservice.file.MagicAdPublicServicePkgManagement */
public final class MagicAdPublicServicePkgManagement extends MBBootsPkgManagementPublicService {

    /* renamed from: d */
    public final String f235713d = "surface/MagicAdPublicService.wspkg";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MagicAdPublicServicePkgManagement(String str) {
        super(str);
        C87412m.m108594g(str, "instanceName");
    }

    /* renamed from: c */
    public String mo109579c() {
        return MagicBrushConstants$PublicServiceNames.BIZ_AD_PUBLIC_SERVICE;
    }

    /* renamed from: i */
    public C86425a mo112232i() {
        return new C86425a("jsapi/" + this.f235713d, 3, "ef35c50cc2b9da5168cbaef0c867c6ef");
    }

    /* renamed from: k */
    public C86427c mo112233k() {
        return new C86427c(this.f235713d, C86426b.DEFAULT);
    }

    /* renamed from: m */
    public String mo112234m() {
        return "/publicservice.js";
    }

    /* renamed from: q */
    public Collection<String> mo112235q() {
        return C110826x0.m151014b(MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_AD_MINI_PROGRAM, MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_AD_BRAND_SERVICE, MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_AD_LAND_PAGE, MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_AD_PLAYABLE);
    }
}
