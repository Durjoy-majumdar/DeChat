package com.tencent.p014mm.plugin.appbrand.launching;

import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import p749xh.C38570ga;
import tr0.C37240b;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.z2 */
public class C29593z2 extends C38570ga implements C37240b {

    /* renamed from: t */
    public static final IAutoDBItem.MAutoDBInfo f80520t = C38570ga.initAutoDBInfo(C38570ga.class);

    /* renamed from: u */
    public static final String[] f80521u;

    /* renamed from: v */
    public static final String[] f80522v;

    static {
        String[] strArr = {"appId", "appType", "versionType"};
        f80521u = strArr;
        String str = " PRIMARY KEY ( ";
        for (String str2 : strArr) {
            str = str + ", " + str2;
        }
        StringBuilder sb = new StringBuilder();
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = f80520t;
        sb.append(mAutoDBInfo.sql);
        sb.append(",");
        sb.append(str.replaceFirst(",", "") + " )");
        mAutoDBInfo.sql = sb.toString();
        f80522v = new String[]{MAutoStorage.getCreateSQLs(mAutoDBInfo, "WxaAppidABTestInfo")};
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f80520t;
    }

    public String[] getKeys() {
        return f80521u;
    }
}
