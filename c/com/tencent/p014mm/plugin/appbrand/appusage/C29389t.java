package com.tencent.p014mm.plugin.appbrand.appusage;

import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import p749xh.C38680v;

/* renamed from: com.tencent.mm.plugin.appbrand.appusage.t */
public final class C29389t extends C38680v {

    /* renamed from: r */
    public static final String[] f80179r;

    /* renamed from: s */
    public static final IAutoDBItem.MAutoDBInfo f80180s = C38680v.initAutoDBInfo(C29389t.class);

    static {
        String[] strArr = {"username", "versionType"};
        f80179r = strArr;
        String str = " PRIMARY KEY ( ";
        for (String str2 : strArr) {
            str = str + ", " + str2;
        }
        StringBuilder sb = new StringBuilder();
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = f80180s;
        sb.append(mAutoDBInfo.sql);
        sb.append(",");
        sb.append(str.replaceFirst(",", "") + " )");
        mAutoDBInfo.sql = sb.toString();
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return null;
    }
}
