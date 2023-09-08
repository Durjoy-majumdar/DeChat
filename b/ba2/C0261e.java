package ba2;

import android.graphics.Rect;
import android.view.View;
import gy3.C87412m;
import java.util.Arrays;

/* renamed from: ba2.e */
public final class C0261e {

    /* renamed from: a */
    public static final C0261e f806a = new C0261e();

    /* renamed from: a */
    public final String mo301a(View view) {
        if (view == null) {
            return "";
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        Rect rect = new Rect(i, i2, view.getWidth() + i, view.getHeight() + i2);
        String format = String.format("%d,%d,%d,%d", Arrays.copyOf(new Object[]{Integer.valueOf(rect.left), Integer.valueOf(rect.top), Integer.valueOf(rect.right), Integer.valueOf(rect.bottom)}, 4));
        C87412m.m108593f(format, "format(format, *args)");
        return format;
    }
}
