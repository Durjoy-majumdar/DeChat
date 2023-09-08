package r40;

import android.app.Activity;
import android.os.Build;
import java.lang.reflect.Field;

/* renamed from: r40.b */
public class C36247b {

    /* renamed from: a */
    public static Class<?> f96531a;
    private static Field field_mContext;
    private static Field field_mFastgrabConfigReader;

    /* renamed from: a */
    public static void m40929a(Activity activity) {
        if ("HUAWEI".equalsIgnoreCase(Build.MANUFACTURER) && Build.VERSION.SDK_INT == 24) {
            try {
                if (f96531a == null) {
                    Class<?> cls = Class.forName("android.rms.iaware.FastgrabConfigReader");
                    f96531a = cls;
                    Field declaredField = cls.getDeclaredField("mFastgrabConfigReader");
                    field_mFastgrabConfigReader = declaredField;
                    declaredField.setAccessible(true);
                    Field declaredField2 = f96531a.getDeclaredField("mContext");
                    field_mContext = declaredField2;
                    declaredField2.setAccessible(true);
                }
                Object obj = field_mFastgrabConfigReader.get(f96531a);
                if (field_mContext.get(obj) == activity) {
                    field_mContext.set(obj, (Object) null);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
