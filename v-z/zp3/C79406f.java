package zp3;

import android.content.Context;
import android.util.TypedValue;

/* renamed from: zp3.f */
public class C79406f {
    /* renamed from: a */
    public static int m96347a(Context context, float f) {
        return (int) TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    /* renamed from: b */
    public static float m96348b(Context context, float f) {
        return f / context.getResources().getDisplayMetrics().density;
    }
}
