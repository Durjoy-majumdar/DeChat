package com.tencent.p014mm.plugin.appbrand.appcache;

import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import java.util.Locale;
import p749xh.C38645q7;
import tr0.C37240b;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.s1 */
public class C29299s1 extends C38645q7 implements C37240b {

    /* renamed from: v */
    public static final String[] f80008v;

    /* renamed from: w */
    public static final IAutoDBItem.MAutoDBInfo f80009w = C38645q7.initAutoDBInfo(C38645q7.class);

    static {
        String[] strArr = {"appId", "type", ProviderConstants.API_COLNAME_FEATURE_VERSION};
        f80008v = strArr;
        String str = " PRIMARY KEY ( ";
        for (String str2 : strArr) {
            str = str + ", " + str2;
        }
        StringBuilder sb = new StringBuilder();
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = f80009w;
        sb.append(mAutoDBInfo.sql);
        sb.append(",");
        sb.append(str.replaceFirst(",", "") + " )");
        mAutoDBInfo.sql = sb.toString();
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f80009w;
    }

    public String[] getKeys() {
        return f80008v;
    }

    /* renamed from: l2 */
    public String mo56576l2() {
        return String.format(Locale.US, "EncryptPkgInfo[%s %d %d]", new Object[]{this.field_appId, Integer.valueOf(this.field_type), Integer.valueOf(this.field_version)});
    }
}
