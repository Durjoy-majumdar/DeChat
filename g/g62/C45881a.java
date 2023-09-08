package g62;

import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72976h2;

/* renamed from: g62.a */
public class C45881a {
    /* renamed from: a */
    public static long m51164a(long j, int i, long j2) {
        if (j2 == 0) {
            j2 = Util.nowMilliSecond();
        }
        switch (i) {
            case 2:
                return m51166c(j, j2) | 4611686018427387904L;
            case 3:
                return m51166c(j, j2) & -4611686018427387905L;
            case 4:
                return m51166c(j, j2) & 4611686018427387904L;
            case 5:
                return m51166c(j, j2) | 1152921504606846976L;
            case 6:
                return m51166c(j, j2) & -1152921504606846977L;
            case 7:
                return m51166c(j, j2) & 1152921504606846976L;
            default:
                return m51166c(j, j2);
        }
    }

    /* renamed from: b */
    public static long m51165b(C72976h2 h2Var, int i, long j) {
        if (h2Var == null) {
            return 0;
        }
        return m51164a(h2Var.mo108828u2(), i, j);
    }

    /* renamed from: c */
    public static long m51166c(long j, long j2) {
        return (j & -72057594037927936L) | (j2 & 72057594037927935L);
    }
}
