package com.tencent.p014mm.plugin.appbrand.appcache;

import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import p749xh.C38621na;
import tr0.C37240b;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.n3 */
public class C29228n3 extends C38621na implements C37240b {

    /* renamed from: r */
    public static final String[] f79881r;

    /* renamed from: s */
    public static final IAutoDBItem.MAutoDBInfo f79882s = C38621na.initAutoDBInfo(C29228n3.class);

    /* renamed from: t */
    public static final String[] f79883t;

    static {
        String[] strArr = {"pluginAppID", "pluginAppVersion"};
        f79881r = strArr;
        String str = " PRIMARY KEY (";
        for (String str2 : strArr) {
            str = str + ", " + str2;
        }
        StringBuilder sb = new StringBuilder();
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = f79882s;
        sb.append(mAutoDBInfo.sql);
        sb.append(",");
        sb.append(str.replaceFirst(",", "") + " )");
        mAutoDBInfo.sql = sb.toString();
        f79883t = new String[]{MAutoStorage.getCreateSQLs(mAutoDBInfo, "WxaPluginCodeVersionInfo")};
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f79882s;
    }

    public String[] getKeys() {
        return f79881r;
    }
}
