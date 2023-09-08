package com.tencent.p014mm.storage;

import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import p749xh.C53328a9;

/* renamed from: com.tencent.mm.storage.z4 */
public class C44673z4 extends C53328a9 {

    /* renamed from: v */
    public static IAutoDBItem.MAutoDBInfo f121103v = C53328a9.initAutoDBInfo(C44673z4.class);

    public C44673z4(String str, String str2) {
        this();
        this.field_encryptUsername = str == null ? "" : str;
        this.field_conRemark = str2 == null ? "" : str2;
    }

    public Object clone() {
        return super.clone();
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f121103v;
    }

    /* renamed from: l2 */
    public String mo69826l2() {
        return this.field_conRemark;
    }

    /* renamed from: m2 */
    public String mo69827m2() {
        return this.field_encryptUsername;
    }

    public C44673z4() {
        this.field_encryptUsername = "";
        this.field_conRemark = "";
    }
}
