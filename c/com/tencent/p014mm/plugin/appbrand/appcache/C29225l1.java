package com.tencent.p014mm.plugin.appbrand.appcache;

import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import p749xh.C38598k7;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.l1 */
public final class C29225l1 extends C38598k7 {

    /* renamed from: t */
    public static final IAutoDBItem.MAutoDBInfo f79877t = C38598k7.initAutoDBInfo(C29225l1.class);

    static {
        String[] strArr = {"key", ProviderConstants.API_COLNAME_FEATURE_VERSION};
        String str = " PRIMARY KEY (";
        for (int i = 0; i < 2; i++) {
            str = str + ", " + strArr[i];
        }
        StringBuilder sb = new StringBuilder();
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = f79877t;
        sb.append(mAutoDBInfo.sql);
        sb.append(",");
        sb.append(str.replaceFirst(",", "") + " )");
        mAutoDBInfo.sql = sb.toString();
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f79877t;
    }
}
