package com.tencent.p014mm.plugin.appbrand.launching;

import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import p749xh.C38618n7;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.k3 */
public class C29582k3 extends C38618n7 {

    /* renamed from: r */
    public static final String[] f80509r;

    /* renamed from: s */
    public static final IAutoDBItem.MAutoDBInfo f80510s = C38618n7.initAutoDBInfo(C29582k3.class);

    static {
        String[] strArr = {"appId", "versionDesc"};
        f80509r = strArr;
        String str = " PRIMARY KEY (";
        for (String str2 : strArr) {
            str = str + ", " + str2;
        }
        StringBuilder sb = new StringBuilder();
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = f80510s;
        sb.append(mAutoDBInfo.sql);
        sb.append(",");
        sb.append(str.replaceFirst(",", "") + " )");
        mAutoDBInfo.sql = sb.toString();
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return null;
    }
}
