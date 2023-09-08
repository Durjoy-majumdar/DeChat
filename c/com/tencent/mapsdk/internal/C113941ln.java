package com.tencent.mapsdk.internal;

import android.text.TextUtils;
import com.tencent.map.tools.net.NetManager;
import com.tencent.map.tools.net.NetResponse;

/* renamed from: com.tencent.mapsdk.internal.ln */
public final class C113941ln extends C113932lh {
    /* renamed from: f */
    public final byte[] mo172355f(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        NetResponse doGet = NetManager.getInstance().builder().url(str).doGet();
        return (doGet == null || !doGet.available()) ? super.mo172355f(str) : doGet.data;
    }
}
