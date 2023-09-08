package com.tencent.mapsdk.internal;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.tmsqmsp.oaid2.IVendorCallback;
import com.tencent.tmsqmsp.oaid2.VendorManager;

/* renamed from: com.tencent.mapsdk.internal.sh */
public final class C114202sh {

    /* renamed from: a */
    private static final String f341925a = "TMS-Oaid";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static String f341926b = "";
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static boolean f341927c = true;

    /* renamed from: d */
    private static IVendorCallback f341928d = new IVendorCallback() {
        public final void onResult(boolean z, String str, String str2) {
            boolean unused = C114202sh.f341927c = z;
            if (z) {
                String unused2 = C114202sh.f341926b = str2;
            }
        }
    };

    /* renamed from: a */
    public static String m159630a(Context context) {
        if (!f341927c) {
            return "undefined";
        }
        if (!TextUtils.isEmpty(f341926b) && f341927c) {
            return f341926b;
        }
        try {
            new VendorManager().getVendorInfo(context, f341928d);
        } catch (Exception unused) {
        }
        return f341926b;
    }
}
