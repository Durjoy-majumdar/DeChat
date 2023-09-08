package af2;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Util;
import te3.C49254ea0;

/* renamed from: af2.d */
public class C39552d {
    /* renamed from: a */
    public static String m42184a(Context context, C49254ea0 ea02) {
        if (ea02.f132822e <= 0) {
            return context.getString(C0966R.string.gon);
        }
        return ea02.f132821d + " " + m42185b((double) ea02.f132822e, ea02.f132823f);
    }

    /* renamed from: b */
    public static String m42185b(double d, String str) {
        if ("CNY".equals(str) || "1".equals(str) || Util.isNullOrNil(str)) {
            return String.format("¥%.2f", new Object[]{Double.valueOf(d / 100.0d)});
        }
        return String.format("%s%.2f", new Object[]{str, Double.valueOf(d / 100.0d)});
    }

    /* renamed from: c */
    public static String m42186c(int i, int i2, String str) {
        if (i == i2) {
            return m42185b((double) i, str);
        }
        return String.format("%s~%s", new Object[]{m42185b((double) i2, str), m42185b((double) i, str)});
    }
}
