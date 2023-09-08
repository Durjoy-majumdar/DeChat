package ti2;

import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Comparator;
import te3.C51360t9;

/* renamed from: ti2.b */
public class C52344b implements Comparator<C51360t9> {
    public int compare(Object obj, Object obj2) {
        C51360t9 t9Var = (C51360t9) obj;
        C51360t9 t9Var2 = (C51360t9) obj2;
        if (!Util.isNullOrNil(t9Var.f142040e) && !Util.isNullOrNil(t9Var2.f142040e)) {
            char charAt = !Util.isNullOrNil(t9Var.f142048p) ? t9Var.f142048p.toUpperCase().charAt(0) : C78028a.m94174b(t9Var.f142040e, '#', true);
            char charAt2 = !Util.isNullOrNil(t9Var2.f142048p) ? t9Var2.f142048p.toUpperCase().charAt(0) : C78028a.m94174b(t9Var2.f142040e, '#', true);
            if (charAt < charAt2) {
                return -1;
            }
            if (charAt > charAt2) {
                return 1;
            }
        } else if (!Util.isNullOrNil(t9Var.f142040e) || !Util.isNullOrNil(t9Var2.f142040e)) {
            if (!Util.isNullOrNil(t9Var.f142040e)) {
                if (Util.isNullOrNil(t9Var2.f142040e)) {
                    return -1;
                }
            }
            return 1;
        }
        return 0;
    }
}
