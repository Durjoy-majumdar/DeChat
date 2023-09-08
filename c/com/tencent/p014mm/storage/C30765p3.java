package com.tencent.p014mm.storage;

import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import p749xh.C38530b4;

/* renamed from: com.tencent.mm.storage.p3 */
public class C30765p3 extends C38530b4 {

    /* renamed from: r */
    public static IAutoDBItem.MAutoDBInfo f82733r = C38530b4.initAutoDBInfo(C30765p3.class);

    public C30765p3() {
        this.field_encryptUsername = "";
        this.field_username = "";
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f82733r;
    }

    /* renamed from: l2 */
    public String mo57686l2() {
        return this.field_encryptUsername;
    }

    /* renamed from: m2 */
    public String mo57687m2() {
        return this.field_username;
    }
}
