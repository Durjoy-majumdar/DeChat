package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload;

import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.w */
public final class C29783w {
    /* renamed from: a */
    public static final MultiProcessMMKV m38875a() {
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("_webview_tmpl_command");
        C87412m.m108593f(mmkv, "getMMKV(ConstantsPreload…MKV_WEBVIEW_TMPL_COMMAND)");
        return mmkv;
    }

    /* renamed from: b */
    public static final void m38876b(String str) {
        C29770h0.m38873a("MicroMsg.PreloadUtil", str);
    }
}
