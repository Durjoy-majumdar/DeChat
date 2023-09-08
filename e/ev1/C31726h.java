package ev1;

import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import p749xh.C38520a4;

/* renamed from: ev1.h */
public class C31726h extends C38520a4 {

    /* renamed from: D */
    public static IAutoDBItem.MAutoDBInfo f84713D = C38520a4.initAutoDBInfo(C38520a4.class);

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f84713D;
    }

    public String toString() {
        return this.field_ForcePushId + " " + this.field_UserName + " " + this.field_CreateTime + " " + this.field_ExpiredTime + " " + this.field_Status;
    }
}
