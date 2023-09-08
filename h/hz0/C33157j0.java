package hz0;

import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import p749xh.C38568g7;

/* renamed from: hz0.j0 */
public class C33157j0 extends C38568g7 {

    /* renamed from: p */
    public static IAutoDBItem.MAutoDBInfo f90007p = C38568g7.initAutoDBInfo(C33157j0.class);

    public boolean equals(Object obj) {
        return (obj instanceof C33157j0) && this.field_cardUserId == ((C33157j0) obj).field_cardUserId;
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f90007p;
    }

    public int hashCode() {
        String str = this.field_cardUserId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
