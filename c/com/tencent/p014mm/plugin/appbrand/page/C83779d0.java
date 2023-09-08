package com.tencent.p014mm.plugin.appbrand.page;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82926s;
import com.tencent.p014mm.plugin.appbrand.jsapi.miniprogram_navigator.C82801g;
import java.util.HashMap;

/* renamed from: com.tencent.mm.plugin.appbrand.page.d0 */
public class C83779d0 extends C82926s {
    private static final int CTRL_INDEX = 49;
    public static final String NAME = "onAppEnterBackground";

    /* renamed from: s */
    public void mo116145s(AppBrandRuntime appBrandRuntime) {
        HashMap hashMap = new HashMap(1);
        int ordinal = C83231l.m102143d(appBrandRuntime.f238147j).ordinal();
        String str = "hide";
        if (ordinal == 0) {
            str = "close";
        } else if (ordinal == 1) {
            str = "back";
        } else if (ordinal != 2) {
            if (ordinal == 3) {
                str = "hang";
            } else if (!(ordinal == 4 || ordinal == 6 || ordinal != 7)) {
                str = C82801g.NAME;
            }
        }
        hashMap.put("mode", str);
        C82926s r = mo115165o(hashMap);
        r.mo115194p(appBrandRuntime.mo113047b0());
        r.mo115158h();
    }
}
