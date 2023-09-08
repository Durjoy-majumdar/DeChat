package com.tencent.p014mm.plugin.appbrand.jsapi.miniprogram_navigator;

import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.b */
public enum C82793b {
    RELEASE(0),
    DEVELOP(1);
    

    /* renamed from: d */
    public final int f242156d;

    /* access modifiers changed from: public */
    C82793b(int i) {
        this.f242156d = i;
    }

    /* renamed from: a */
    public static C82793b m101536a(String str, C82793b bVar) {
        if (Util.isNullOrNil(str)) {
            return bVar;
        }
        for (C82793b bVar2 : values()) {
            if (bVar2.name().toLowerCase().equals(str)) {
                return bVar2;
            }
        }
        return bVar;
    }
}
