package com.tencent.p014mm.plugin.magicbrush.scldemo.biz;

import com.tencent.p014mm.plugin.magicbrush.base.MBBootsPkgManagementBiz;
import e42.C86425a;
import e42.C86426b;
import e42.C86427c;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.magicbrush.scldemo.biz.MagicSclDemoPkgManager */
public final class MagicSclDemoPkgManager extends MBBootsPkgManagementBiz {

    /* renamed from: d */
    public final String f248440d = "surface/app/wxf337cbaa27790mb2.wspkg";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MagicSclDemoPkgManager(String str) {
        super(str);
        C87412m.m108594g(str, "instanceName");
    }

    /* renamed from: c */
    public String mo109579c() {
        return "wxf337cbaa27790mb2";
    }

    /* renamed from: i */
    public C86425a mo112232i() {
        return new C86425a("jsapi/" + this.f248440d, 1, "");
    }

    /* renamed from: k */
    public C86427c mo112233k() {
        return new C86427c(this.f248440d, C86426b.DEFAULT);
    }

    /* renamed from: m */
    public String mo112234m() {
        return "/index.js";
    }
}
