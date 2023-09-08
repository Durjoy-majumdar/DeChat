package q30;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import k30.C99096a;

/* renamed from: q30.g0 */
public class C100988g0 implements C99096a.C99098b {
    public C100988g0(C100991j0 j0Var) {
    }

    public Object getData() {
        Context context = MMApplicationContext.getContext();
        int i = 1;
        if (context != null) {
            i = context.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0).getInt("current_text_size_index_key", 1);
        }
        return Integer.valueOf(i);
    }
}
