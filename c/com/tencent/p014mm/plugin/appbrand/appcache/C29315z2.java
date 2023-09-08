package com.tencent.p014mm.plugin.appbrand.appcache;

import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import p749xh.C38537c0;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.z2 */
public final class C29315z2 extends C29222i {

    /* renamed from: H */
    public static final String[] f80041H;

    /* renamed from: I */
    public static final IAutoDBItem.MAutoDBInfo f80042I = C38537c0.initAutoDBInfo(C29315z2.class);

    static {
        String[] strArr = {"appId", ProviderConstants.API_COLNAME_FEATURE_VERSION, "debugType"};
        f80041H = strArr;
        String str = " PRIMARY KEY (";
        for (String str2 : strArr) {
            str = str + ", " + str2;
        }
        StringBuilder sb = new StringBuilder();
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = f80042I;
        sb.append(mAutoDBInfo.sql);
        sb.append(",");
        sb.append(str.replaceFirst(",", "") + " )");
        mAutoDBInfo.sql = sb.toString();
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f80042I;
    }
}
