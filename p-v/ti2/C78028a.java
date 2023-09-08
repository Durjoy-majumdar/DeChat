package ti2;

import com.tencent.p014mm.platformtools.SpellMap;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.math.BigDecimal;

/* renamed from: ti2.a */
public class C78028a {
    /* renamed from: a */
    public static double m94173a(String str, String str2, int i, int i2) {
        try {
            return new BigDecimal(Util.getDouble(str.trim(), 0.0d) == 0.0d ? "0" : str.trim()).divide(new BigDecimal(str2.trim()), i, i2).doubleValue();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.BankRemitUtil", e, "", new Object[0]);
            return 0.0d;
        }
    }

    /* renamed from: b */
    public static char m94174b(String str, char c, boolean z) {
        String a = SpellMap.m80581a(str.charAt(0));
        Log.m105919d("MicroMsg.BankRemitUtil", "pinyin: %s", a);
        return !Util.isNullOrNil(a) ? z ? a.toUpperCase().charAt(0) : a.charAt(0) : c;
    }

    /* renamed from: c */
    public static double m94175c(String str, String str2) {
        try {
            double d = Util.getDouble(str, 0.0d);
            double d2 = Util.getDouble(str2, 0.0d);
            if (d == 0.0d) {
                str = "0";
            }
            BigDecimal bigDecimal = new BigDecimal(str);
            if (d2 == 0.0d) {
                str2 = "0";
            }
            return bigDecimal.multiply(new BigDecimal(str2)).doubleValue();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.BankRemitUtil", e, "", new Object[0]);
            return 0.0d;
        }
    }
}
