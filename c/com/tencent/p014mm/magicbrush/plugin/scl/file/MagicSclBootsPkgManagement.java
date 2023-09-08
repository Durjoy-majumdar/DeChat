package com.tencent.p014mm.magicbrush.plugin.scl.file;

import com.tencent.p014mm.plugin.magicbrush.api.MagicBrushConstants$BizNames;
import com.tencent.p014mm.plugin.magicbrush.api.MagicBrushConstants$PublicServiceNames;
import com.tencent.p014mm.plugin.magicbrush.base.MBBootsPkgManagementPublicService;
import e42.C86425a;
import e42.C86426b;
import e42.C86427c;
import gy3.C87412m;
import java.util.Collection;
import sx3.C110826x0;

/* renamed from: com.tencent.mm.magicbrush.plugin.scl.file.MagicSclBootsPkgManagement */
public final class MagicSclBootsPkgManagement extends MBBootsPkgManagementPublicService {

    /* renamed from: d */
    public final String f237830d = "surface/wx2f3fb5db9f226462.wspkg";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MagicSclBootsPkgManagement(String str) {
        super(str);
        C87412m.m108594g(str, "instanceName");
    }

    /* renamed from: c */
    public String mo109579c() {
        return MagicBrushConstants$PublicServiceNames.BIZ_SCL_PUBLIC_SERVICE;
    }

    /* renamed from: i */
    public C86425a mo112232i() {
        return new C86425a("jsapi/" + this.f237830d, 2, "172b23f023bd24ac46bcee33e31f2eb7");
    }

    /* renamed from: k */
    public C86427c mo112233k() {
        return new C86427c(this.f237830d, C86426b.DEFAULT);
    }

    /* renamed from: m */
    public String mo112234m() {
        return "/index.js";
    }

    /* renamed from: q */
    public Collection<String> mo112235q() {
        return C110826x0.m151014b(MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_LIVE_CARD, MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_SCL_DEMO, MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_AD_MINI_PROGRAM, MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_BRAND_SERVICE, MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_AD_BRAND_SERVICE);
    }
}
