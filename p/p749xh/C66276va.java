package p749xh;

import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import te3.C64312dc1;

/* renamed from: xh.va */
public final class C66276va extends C66274t3 {

    /* renamed from: A1 */
    public static final IAutoDBItem.MAutoDBInfo f190699A1 = C66258d3.initAutoDBInfo(C66276va.class);

    /* renamed from: B1 */
    public static final String f190700B1 = "metion_Index";

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f190699A1;
    }

    /* renamed from: l2 */
    public boolean mo90403l2() {
        C64312dc1 dc12 = this.field_aggregatedContacts;
        return (dc12 == null || dc12.f182697e == 0) ? false : true;
    }

    /* renamed from: m2 */
    public int mo90404m2() {
        C64312dc1 dc12 = this.field_aggregatedContacts;
        if (dc12 != null) {
            return dc12.f182697e;
        }
        return 0;
    }
}
