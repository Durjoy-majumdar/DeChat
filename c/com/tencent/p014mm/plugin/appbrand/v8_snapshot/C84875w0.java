package com.tencent.p014mm.plugin.appbrand.v8_snapshot;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import gy3.C87412m;
import p749xh.C91208ma;

/* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.w0 */
public final class C84875w0 extends C91208ma {

    /* renamed from: Q */
    public static final String[] f247384Q;

    /* renamed from: R */
    public static final IAutoDBItem.MAutoDBInfo f247385R = C91208ma.initAutoDBInfo(C84875w0.class);

    static {
        String[] strArr = {"arch", "wxaPkgPath", "snapshotCategory"};
        f247384Q = strArr;
        StringBuilder sb = new StringBuilder();
        sb.append("PRIMARY KEY ( ");
        int i = 0;
        int i2 = 0;
        while (i < 3) {
            String str = strArr[i];
            int i3 = i2 + 1;
            if (i2 != 0) {
                sb.append(", ");
            }
            sb.append(str);
            i++;
            i2 = i3;
        }
        sb.append(" )");
        String sb4 = sb.toString();
        C87412m.m108593f(sb4, "StringBuilder().apply(builderAction).toString()");
        Log.m105918d("MicroMsg.WxaPkgV8SnapshotInfo", "<cinit>, primaryKey: " + sb4);
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = f247385R;
        mAutoDBInfo.sql += ", " + sb4;
    }
}
