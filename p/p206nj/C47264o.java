package p206nj;

import android.content.Context;
import android.content.res.Resources;
import com.eclipsesource.mmv8.Platform;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: nj.o */
public class C47264o {
    /* renamed from: a */
    public static int m52556a(Context context, int i) {
        try {
            Resources resources = context.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", Platform.ANDROID);
            return identifier != 0 ? resources.getDimensionPixelSize(identifier) : i;
        } catch (Resources.NotFoundException e) {
            Log.printErrStackTrace("MicroMsg.ResourceCompat", e, "get res of status_bar_height fail", new Object[0]);
            return i;
        }
    }
}
