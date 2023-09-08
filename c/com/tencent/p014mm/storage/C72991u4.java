package com.tencent.p014mm.storage;

import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import p749xh.C78809g8;

/* renamed from: com.tencent.mm.storage.u4 */
public class C72991u4 extends C78809g8 {

    /* renamed from: H */
    public static IAutoDBItem.MAutoDBInfo f212827H;

    static {
        Class<C72991u4> cls = C72991u4.class;
        IAutoDBItem.getValidFields(cls);
        f212827H = C78809g8.initAutoDBInfo(cls);
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f212827H;
    }
}
