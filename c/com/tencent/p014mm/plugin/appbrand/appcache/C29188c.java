package com.tencent.p014mm.plugin.appbrand.appcache;

import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import p749xh.C38709z;
import tr0.C37240b;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.c */
public class C29188c extends C38709z implements C37240b {

    /* renamed from: r */
    public static final String[] f79822r;

    /* renamed from: s */
    public static final String[] f79823s;

    /* renamed from: t */
    public static final IAutoDBItem.MAutoDBInfo f79824t = C38709z.initAutoDBInfo(C29188c.class);

    static {
        String[] strArr = {"appId", "appVersion"};
        f79822r = strArr;
        String str = " PRIMARY KEY ( ";
        for (String str2 : strArr) {
            str = str + ", " + str2;
        }
        StringBuilder sb = new StringBuilder();
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = f79824t;
        sb.append(mAutoDBInfo.sql);
        sb.append(",");
        sb.append(str.replaceFirst(",", "") + " )");
        mAutoDBInfo.sql = sb.toString();
        f79823s = new String[]{MAutoStorage.getCreateSQLs(mAutoDBInfo, "AppBrandSeparatedPluginsCompatMarkTable")};
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f79824t;
    }

    public String[] getKeys() {
        return f79822r;
    }
}
