package r40;

import android.os.Build;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.lang.reflect.Field;

/* renamed from: r40.d */
public class C36248d {
    /* renamed from: a */
    public static void m40930a() {
        try {
            if (Build.VERSION.SDK_INT >= 23 && Build.MANUFACTURER.equalsIgnoreCase("samsung")) {
                Object systemService = MMApplicationContext.getContext().getSystemService(Class.forName("com.samsung.android.content.clipboard.SemClipboardManager"));
                Field declaredField = systemService.getClass().getDeclaredField("mContext");
                declaredField.setAccessible(true);
                declaredField.set(systemService, MMApplicationContext.getContext());
            }
        } catch (Throwable unused) {
        }
    }
}
