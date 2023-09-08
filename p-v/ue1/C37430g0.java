package ue1;

import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import gy3.C87412m;
import p749xh.C38704y3;

/* renamed from: ue1.g0 */
public final class C37430g0 extends C38704y3 {

    /* renamed from: p */
    public static final IAutoDBItem.MAutoDBInfo f98936p = C38704y3.initAutoDBInfo(C37430g0.class);

    public boolean equals(Object obj) {
        return (obj instanceof C37430g0) && ((C37430g0) obj).systemRowid == this.systemRowid;
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = f98936p;
        C87412m.m108593f(mAutoDBInfo, "info");
        return mAutoDBInfo;
    }

    public int hashCode() {
        return (int) this.systemRowid;
    }
}
