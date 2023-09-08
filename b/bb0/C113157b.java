package bb0;

import cb0.C54711a;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import gy3.C87412m;
import p749xh.C118874c6;

/* renamed from: bb0.b */
public final class C113157b extends C118874c6 {

    /* renamed from: Y */
    public static final IAutoDBItem.MAutoDBInfo f338578Y = C118874c6.initAutoDBInfo(C113157b.class);

    public boolean equals(Object obj) {
        if (obj instanceof C113157b) {
            return C87412m.m108589b(this.field_mediaId, ((C113157b) obj).field_mediaId);
        }
        return false;
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = f338578Y;
        C87412m.m108593f(mAutoDBInfo, "info");
        return mAutoDBInfo;
    }

    public int hashCode() {
        return this.field_mediaId.hashCode();
    }

    /* renamed from: l2 */
    public final String mo165658l2() {
        return C54711a.f153346a.mo75606a("", this.field_originMediaId, this.field_url);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.field_mediaId);
        sb.append(", ");
        sb.append(this.field_codecFormat);
        sb.append(' ');
        sb.append(this.field_moovReady);
        sb.append(" state:");
        sb.append(this.field_state);
        sb.append(" specFormat=");
        sb.append(this.field_specFormat);
        sb.append(" cacheSize=");
        sb.append(this.field_cacheSize);
        sb.append(" totalSize=");
        sb.append(this.field_totalSize);
        sb.append(" percent=");
        long j = this.field_totalSize;
        sb.append(j <= 0 ? 0 : (int) ((((float) this.field_cacheSize) / ((float) j)) * ((float) 100)));
        sb.append(", ");
        sb.append(mo165658l2());
        sb.append(", ");
        sb.append(this.field_url);
        return sb.toString();
    }
}
