package js0;

import com.tencent.p014mm.sdk.platformtools.Util;
import pe3.C47465a;

/* renamed from: js0.o */
public class C46572o {
    /* renamed from: a */
    public static <T extends C47465a> boolean m51895a(T t, T t2) {
        if (t == null && t2 == null) {
            throw new IllegalArgumentException("both null!!!");
        } else if (t == null || t2 == null) {
            return false;
        } else {
            try {
                return Util.isEqual(t.toByteArray(), t2.toByteArray());
            } catch (Exception unused) {
                return false;
            }
        }
    }
}
