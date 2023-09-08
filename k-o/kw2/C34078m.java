package kw2;

import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.vfs.C86013q1;
import gy3.C87412m;
import p749xh.C38714z8;

/* renamed from: kw2.m */
public final class C34078m extends C38714z8 {

    /* renamed from: v */
    public static final IAutoDBItem.MAutoDBInfo f91952v = C38714z8.initAutoDBInfo(C34078m.class);

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = f91952v;
        C87412m.m108593f(mAutoDBInfo, "info");
        return mAutoDBInfo;
    }

    /* renamed from: l2 */
    public final boolean mo59431l2() {
        int i = this.field_totalSize;
        return i > 0 && this.field_cacheSize == i;
    }

    /* renamed from: m2 */
    public final boolean mo59432m2() {
        return mo59431l2() && C86013q1.m106450k(this.field_filePath);
    }

    public String toString() {
        return this.field_storyId + ", " + this.field_filePath + ", cacheSize:" + this.field_cacheSize + ", totalSize:" + this.field_totalSize;
    }
}
