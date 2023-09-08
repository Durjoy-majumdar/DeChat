package sb0;

import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import p749xh.C53346q0;

/* renamed from: sb0.j */
public class C48353j extends C53346q0 {

    /* renamed from: F */
    public static IAutoDBItem.MAutoDBInfo f129455F = C53346q0.initAutoDBInfo(C48353j.class);

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f129455F;
    }

    /* renamed from: l2 */
    public boolean mo73073l2(int i) {
        return (i & this.field_bitFlag) != 0;
    }

    /* renamed from: m2 */
    public boolean mo73074m2() {
        if (this.field_needToUpdate) {
            return true;
        }
        if (!Util.isNullOrNil(this.field_profileUrl) || !Util.isNullOrNil(this.field_headImageUrl)) {
            return Util.isNullOrNil(this.field_userNamePY) && !Util.isNullOrNil(this.field_userName);
        }
        return true;
    }
}
