package js0;

import android.util.DisplayMetrics;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;

/* renamed from: js0.t */
public class C76448t {

    /* renamed from: a */
    public static DisplayMetrics f223789a = MMApplicationContext.getContext().getResources().getDisplayMetrics();

    /* renamed from: a */
    public static int m91870a(int i) {
        DisplayMetrics displayMetrics = f223789a;
        return displayMetrics == null ? i : (int) (displayMetrics.density * ((float) i));
    }
}
