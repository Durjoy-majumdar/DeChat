package com.tencent.p014mm.plugin.appbrand;

import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.sdk.platformtools.Log;
import p210o.C11323a;

/* renamed from: com.tencent.mm.plugin.appbrand.e$$g */
public class e$$g implements C11323a<WxaAttributes, Void> {
    public e$$g(C81810e eVar) {
    }

    public Object apply(Object obj) {
        WxaAttributes wxaAttributes = (WxaAttributes) obj;
        Object[] objArr = new Object[1];
        objArr[0] = wxaAttributes == null ? "null" : wxaAttributes.field_appId;
        Log.m105925i("AppBrandCommand", "prefetch contact get %s", objArr);
        return null;
    }
}
