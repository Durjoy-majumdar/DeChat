package vt0;

import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.file.XVFSFile;

/* renamed from: vt0.n */
public final class C15009n {
    /* renamed from: a */
    public static boolean m14189a(int i) {
        return i >= 0 && i <= 23;
    }

    /* renamed from: b */
    public static int[] m14190b(String str) {
        String[] split;
        int i;
        if (Util.isNullOrNil(str) || (split = str.split(XVFSFile.PATH_SEPARATOR)) == null || split.length != 2) {
            return null;
        }
        int i2 = -1;
        try {
            i = Integer.parseInt(split[0], 10);
        } catch (Exception unused) {
            i = -1;
        }
        try {
            i2 = Integer.parseInt(split[1], 10);
        } catch (Exception unused2) {
        }
        if (!m14189a(i)) {
            return null;
        }
        if (!(i2 >= 0 && i2 <= 59)) {
            return null;
        }
        return new int[]{i, i2};
    }
}
