package com.tencent.tmsqmsp.oaid2;

import android.content.Context;

/* renamed from: com.tencent.tmsqmsp.oaid2.VM */
public class C116440VM {
    public static int getVendorInfo(Context context, IVendorCallback iVendorCallback) {
        return new VendorManager().getVendorInfo(context, iVendorCallback);
    }
}
