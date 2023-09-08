package com.tencent.p014mm.plugin.appbrand.backgroundfetch;

import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import p749xh.C38622o;

/* renamed from: com.tencent.mm.plugin.appbrand.backgroundfetch.e */
public class C29420e extends C38622o {

    /* renamed from: z */
    public static IAutoDBItem.MAutoDBInfo f80238z = C38622o.initAutoDBInfo(C29420e.class);

    static {
        String[] strArr = {"username", "fetchType"};
        String str = " PRIMARY KEY ( ";
        for (int i = 0; i < 2; i++) {
            str = str + ", " + strArr[i];
        }
        StringBuilder sb = new StringBuilder();
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = f80238z;
        sb.append(mAutoDBInfo.sql);
        sb.append(",");
        sb.append(str.replaceFirst(",", "") + " )");
        mAutoDBInfo.sql = sb.toString();
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f80238z;
    }
}
