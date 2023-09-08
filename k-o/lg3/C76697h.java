package lg3;

import android.content.Context;
import android.content.res.Resources;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;

/* renamed from: lg3.h */
public final class C76697h {
    /* renamed from: a */
    public static Resources m92348a(Context context) {
        Resources resources = context != null ? context.getResources() : null;
        return resources instanceof C88496e ? resources : MMApplicationContext.getResources();
    }

    /* renamed from: b */
    public static String m92349b(Context context, int i) {
        return m92348a(context).getString(i);
    }
}
