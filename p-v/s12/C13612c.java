package s12;

import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import java.util.ArrayList;
import p749xh.C38574h5;

/* renamed from: s12.c */
public class C13612c extends C38574h5 {

    /* renamed from: u */
    public static IAutoDBItem.MAutoDBInfo f38575u = C38574h5.initAutoDBInfo(C13612c.class);

    /* renamed from: t */
    public ArrayList<String> f38576t;

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f38575u;
    }

    /* renamed from: l2 */
    public boolean mo13004l2(String str, String str2) {
        if (str != null || str2 == null) {
            return str == null || str.equals(str2);
        }
        return false;
    }
}
