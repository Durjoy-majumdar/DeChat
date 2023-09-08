package com.tencent.p014mm.plugin.appbrand.appcache;

import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import p749xh.C38527b0;
import tr0.C37240b;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.e */
public class C29207e extends C38527b0 implements C37240b {

    /* renamed from: r */
    public static final String[] f79850r;

    /* renamed from: s */
    public static final String[] f79851s;

    /* renamed from: t */
    public static final IAutoDBItem.MAutoDBInfo f79852t = C38527b0.initAutoDBInfo(C29207e.class);

    static {
        String[] strArr = {"appId", "versionType"};
        f79850r = strArr;
        String str = " PRIMARY KEY ( ";
        for (String str2 : strArr) {
            str = str + ", " + str2;
        }
        StringBuilder sb = new StringBuilder();
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = f79852t;
        sb.append(mAutoDBInfo.sql);
        sb.append(",");
        sb.append(str.replaceFirst(",", "") + " )");
        mAutoDBInfo.sql = sb.toString();
        f79851s = new String[]{MAutoStorage.getCreateSQLs(mAutoDBInfo, "AppBrandTestCodeVersionMarkTable")};
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f79852t;
    }

    public String[] getKeys() {
        return f79850r;
    }
}
