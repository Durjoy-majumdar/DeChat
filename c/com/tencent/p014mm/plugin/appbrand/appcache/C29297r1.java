package com.tencent.p014mm.plugin.appbrand.appcache;

import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import p749xh.C38613m7;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.r1 */
public class C29297r1 extends C38613m7 {

    /* renamed from: t */
    public static final String[] f80003t;

    /* renamed from: u */
    public static final IAutoDBItem.MAutoDBInfo f80004u = C38613m7.initAutoDBInfo(C29297r1.class);

    static {
        String[] strArr = {"appId", ProviderConstants.API_COLNAME_FEATURE_VERSION};
        f80003t = strArr;
        String str = " PRIMARY KEY (";
        for (String str2 : strArr) {
            str = str + ", " + str2;
        }
        StringBuilder sb = new StringBuilder();
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = f80004u;
        sb.append(mAutoDBInfo.sql);
        sb.append(",");
        sb.append(str.replaceFirst(",", "") + " )");
        mAutoDBInfo.sql = sb.toString();
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f80004u;
    }
}
