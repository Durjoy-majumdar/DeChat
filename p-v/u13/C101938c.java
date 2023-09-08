package u13;

import com.tencent.p014mm.sdk.platformtools.Util;
import java.math.BigInteger;

/* renamed from: u13.c */
public class C101938c {
    /* renamed from: a */
    public static String m134167a(String str) {
        return Util.isNullOrNil(str) ? "" : new BigInteger(Long.toBinaryString(Util.getLong(str, 0)), 2).toString();
    }
}
