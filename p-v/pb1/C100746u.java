package pb1;

import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import p749xh.C102657n2;

/* renamed from: pb1.u */
public class C100746u extends C102657n2 {

    /* renamed from: U */
    public static IAutoDBItem.MAutoDBInfo f295156U = C102657n2.initAutoDBInfo(C100746u.class);

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f295156U;
    }

    /* renamed from: n2 */
    public float mo140167n2() {
        return Math.max(0.0f, Math.min(99.0f, ((float) this.field_offset) / ((float) this.field_totalLen)) * 100.0f);
    }

    /* renamed from: o2 */
    public boolean mo140168o2() {
        return this.field_status == 3;
    }
}
