package com.tencent.p014mm.plugin.appbrand.appcache;

import android.util.SparseIntArray;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.g */
public final class C81243g {

    /* renamed from: a */
    public static final SparseIntArray f238641a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(3);
        f238641a = sparseIntArray;
        sparseIntArray.put(0, 0);
        sparseIntArray.put(1, C0966R.string.f7602l3);
        sparseIntArray.put(2, C0966R.string.f7601l2);
    }

    /* renamed from: a */
    public static String m99551a(int i) {
        int i2 = f238641a.get(i, 0);
        return i2 == 0 ? "" : MMApplicationContext.getResources().getString(i2);
    }
}
