package com.tencent.p014mm.plugin.appbrand.utils;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82560l0;
import com.tencent.p014mm.sdk.platformtools.ChannelUtil;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;

/* renamed from: com.tencent.mm.plugin.appbrand.utils.m2 */
public final class C29677m2 implements C82560l0 {
    /* renamed from: eO */
    public boolean mo56895eO() {
        return !ChannelUtil.shouldShowGprsAlert || !MMApplicationContext.getContext().getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0).getBoolean("gprs_alert", true);
    }
}
