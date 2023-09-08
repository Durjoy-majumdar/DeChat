package com.tencent.p014mm.pluginsdk.model.app;

import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import p749xh.C78817m;

/* renamed from: com.tencent.mm.pluginsdk.model.app.d */
public class C72683d extends C78817m {

    /* renamed from: p0 */
    public static IAutoDBItem.MAutoDBInfo f211492p0 = C78817m.initAutoDBInfo(C72683d.class);

    public C72683d() {
        this.field_netTimes = 0;
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f211492p0;
    }

    /* renamed from: l2 */
    public boolean mo100146l2() {
        long j = this.field_totalLen;
        return j > 0 && this.field_offset == j;
    }
}
