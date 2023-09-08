package cm1;

import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import er1.C58741j5;
import gy3.C87412m;
import p749xh.C66273s3;

/* renamed from: cm1.f1 */
public final class C55015f1 extends C66273s3 {

    /* renamed from: Q0 */
    public static final IAutoDBItem.MAutoDBInfo f154478Q0 = C66273s3.initAutoDBInfo(C55015f1.class);

    public boolean equals(Object obj) {
        if (obj instanceof C55015f1) {
            return C87412m.m108589b(this.field_mediaId, ((C55015f1) obj).field_mediaId);
        }
        return false;
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = f154478Q0;
        C87412m.m108593f(mAutoDBInfo, "info");
        return mAutoDBInfo;
    }

    public int hashCode() {
        return this.field_mediaId.hashCode();
    }

    /* renamed from: l2 */
    public final String mo76071l2() {
        C58741j5 j5Var = C58741j5.f168184a;
        String str = this.field_fileFormat;
        String str2 = this.field_originMediaId;
        String str3 = this.field_url;
        return C58741j5.f168189f + j5Var.mo83736j(str, str2, str3);
    }

    /* renamed from: m2 */
    public final int mo76072m2() {
        long j = this.field_totalSize;
        if (j <= 0) {
            return 0;
        }
        return (int) ((((float) this.field_cacheSize) / ((float) j)) * ((float) 100));
    }

    /* renamed from: n2 */
    public final boolean mo76073n2() {
        return this.field_totalSize > 0 && this.field_cacheSize > 0 && this.field_state == 3;
    }

    /* renamed from: o2 */
    public final boolean mo76074o2() {
        return this.field_totalSize > 0 && this.field_cacheSize > 0 && this.field_state >= 2;
    }

    public String toString() {
        return this.field_mediaId + ", " + this.field_fileFormat + ' ' + this.field_moovReady + " state:" + this.field_state + " codingFormat=" + this.field_reqFormat + " cacheSize=" + this.field_cacheSize + " totalSize=" + this.field_totalSize + " percent=" + mo76072m2() + ", " + mo76071l2() + ", " + this.field_url;
    }
}
