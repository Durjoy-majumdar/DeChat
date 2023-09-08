package b60;

import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import p749xh.C38684v5;

/* renamed from: b60.d */
public class C28259d extends C38684v5 implements C54426a {

    /* renamed from: z */
    public static IAutoDBItem.MAutoDBInfo f77816z = C38684v5.initAutoDBInfo(C28259d.class);

    /* renamed from: A0 */
    public boolean mo55878A0() {
        return this.field_isSender;
    }

    /* renamed from: G */
    public String mo55879G() {
        return this.field_liveName;
    }

    /* renamed from: H */
    public long mo55880H() {
        return this.field_liveId;
    }

    /* renamed from: R */
    public String mo55881R() {
        return this.field_hostRoomId;
    }

    /* renamed from: Y1 */
    public String mo55882Y1() {
        return this.field_anchorUsername;
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f77816z;
    }

    public String getThumbUrl() {
        return this.field_thumbUrl;
    }

    public long getTimestamp() {
        return this.field_timeStamp;
    }
}
