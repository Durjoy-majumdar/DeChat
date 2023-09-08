package com.tencent.p014mm.plugin.appbrand.report;

import android.util.SparseIntArray;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.report.t */
public final class C84241t {

    /* renamed from: a */
    public static final SparseIntArray f246073a = new SparseIntArray();

    /* renamed from: a */
    public static final void m103847a(String str, int i) {
        if (str != null) {
            Log.m105918d("MicroMsg.AppBrandServiceTypeCache", "addServiceTypeMap appId: " + str + ", serviceType: " + i);
            f246073a.put(str.hashCode(), i);
        }
    }

    /* renamed from: b */
    public static final int m103848b(String str) {
        if (str == null) {
            return -1;
        }
        int i = f246073a.get(str.hashCode(), -1);
        Log.m105918d("MicroMsg.AppBrandServiceTypeCache", "getServiceTypeMap appId: " + str + ", ret " + i);
        return i;
    }
}
