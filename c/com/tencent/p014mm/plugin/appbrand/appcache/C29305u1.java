package com.tencent.p014mm.plugin.appbrand.appcache;

import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import p749xh.C38668t7;
import tr0.C37240b;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.u1 */
public class C29305u1 extends C38668t7 implements C37240b {

    /* renamed from: v */
    public static final String[] f80019v;

    /* renamed from: w */
    public static final IAutoDBItem.MAutoDBInfo f80020w = C38668t7.initAutoDBInfo(C29305u1.class);

    static {
        String[] strArr = {"appId", "appVersion"};
        f80019v = strArr;
        String str = " PRIMARY KEY ( ";
        for (String str2 : strArr) {
            str = str + ", " + str2;
        }
        StringBuilder sb = new StringBuilder();
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = f80020w;
        sb.append(mAutoDBInfo.sql);
        sb.append(",");
        sb.append(str.replaceFirst(",", "") + " )");
        mAutoDBInfo.sql = sb.toString();
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f80020w;
    }

    public String[] getKeys() {
        return f80019v;
    }
}
