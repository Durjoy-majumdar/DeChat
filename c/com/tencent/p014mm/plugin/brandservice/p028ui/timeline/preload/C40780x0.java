package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload;

import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import gy3.C87412m;
import java.util.Set;
import t73.C48558d;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.x0 */
public final class C40780x0 {

    /* renamed from: a */
    public static final Set<String> f109630a = C48558d.f129897I;

    static {
        C48558d.C48560b bVar = C48558d.f129896H;
    }

    /* renamed from: a */
    public static final MultiProcessMMKV m44078a() {
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("_webview_web_prefetcher_info");
        C87412m.m108593f(mmkv, "getMMKV(ConstantsPreload…KV_WEBVIEW_PREFETCH_INFO)");
        return mmkv;
    }
}
