package o81;

import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Comparator;
import v81.C118668c;

/* renamed from: o81.d */
public class C117718d implements Comparator<C118668c> {
    public C117718d(C117715c cVar) {
    }

    public int compare(Object obj, Object obj2) {
        int i = (Util.getLong(((C118668c) obj).f355094a, 0) > Util.getLong(((C118668c) obj2).f355094a, 0) ? 1 : (Util.getLong(((C118668c) obj).f355094a, 0) == Util.getLong(((C118668c) obj2).f355094a, 0) ? 0 : -1));
        if (i > 0) {
            return 1;
        }
        return i < 0 ? -1 : 0;
    }
}
