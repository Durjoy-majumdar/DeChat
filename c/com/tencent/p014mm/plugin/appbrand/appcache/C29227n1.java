package com.tencent.p014mm.plugin.appbrand.appcache;

import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import p749xh.C38608l7;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.n1 */
public final class C29227n1 extends C38608l7 {

    /* renamed from: t */
    public static final String[] f79879t;

    /* renamed from: u */
    public static final IAutoDBItem.MAutoDBInfo f79880u = C38608l7.initAutoDBInfo(C29227n1.class);

    static {
        String[] strArr = {"appId", "type"};
        f79879t = strArr;
        String str = " PRIMARY KEY (";
        for (String str2 : strArr) {
            str = str + ", " + str2;
        }
        StringBuilder sb = new StringBuilder();
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = f79880u;
        sb.append(mAutoDBInfo.sql);
        sb.append(",");
        sb.append(str.replaceFirst(",", "") + " )");
        mAutoDBInfo.sql = sb.toString();
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f79880u;
    }
}
