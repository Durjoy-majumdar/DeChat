package com.tencent.p014mm.plugin.appbrand.launching;

import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import p749xh.C38648r1;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.c1 */
public final class C29563c1 extends C38648r1 {

    /* renamed from: r */
    public static final String[] f80480r;

    /* renamed from: s */
    public static final IAutoDBItem.MAutoDBInfo f80481s = C38648r1.initAutoDBInfo(C29563c1.class);

    static {
        String[] strArr = {"appId", "versionType"};
        f80480r = strArr;
        String str = " PRIMARY KEY (";
        for (String str2 : strArr) {
            str = str + ", " + str2;
        }
        StringBuilder sb = new StringBuilder();
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = f80481s;
        sb.append(mAutoDBInfo.sql);
        sb.append(",");
        sb.append(str.replaceFirst(",", "") + " )");
        mAutoDBInfo.sql = sb.toString();
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f80481s;
    }
}
