package androidx.core.widget;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

/* renamed from: androidx.core.widget.c */
public final class C92046c {

    /* renamed from: a */
    public static Field f263570a;

    /* renamed from: b */
    public static boolean f263571b;

    /* renamed from: a */
    public static Drawable m115680a(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 23) {
            return compoundButton.getButtonDrawable();
        }
        if (!f263571b) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                f263570a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f263571b = true;
        }
        Field field = f263570a;
        if (field != null) {
            try {
                return (Drawable) field.get(compoundButton);
            } catch (IllegalAccessException unused2) {
                f263570a = null;
            }
        }
        return null;
    }
}
