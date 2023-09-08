package androidx.appcompat.widget;

import android.graphics.Rect;
import android.view.View;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p849e3.C107168a0;
import p849e3.C107207u;

/* renamed from: androidx.appcompat.widget.n0 */
public class C103553n0 {

    /* renamed from: a */
    public static Method f305820a;

    static {
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", new Class[]{Rect.class, Rect.class});
            f305820a = declaredMethod;
            if (!declaredMethod.isAccessible()) {
                f305820a.setAccessible(true);
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    /* renamed from: a */
    public static boolean m137647a(View view) {
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        return C107207u.C107209c.m145195d(view) == 1;
    }
}
