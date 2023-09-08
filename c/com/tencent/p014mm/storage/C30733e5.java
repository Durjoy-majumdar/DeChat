package com.tencent.p014mm.storage;

import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import p749xh.C38561f9;

/* renamed from: com.tencent.mm.storage.e5 */
public class C30733e5 extends C38561f9 {

    /* renamed from: r */
    public static IAutoDBItem.MAutoDBInfo f82657r = C38561f9.initAutoDBInfo(C30733e5.class);

    public C30733e5() {
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f82657r;
    }

    public C30733e5(String str, String str2, String str3) {
        this.field_appId = str;
        this.field_username = str2;
        this.field_openId = str3;
    }
}
