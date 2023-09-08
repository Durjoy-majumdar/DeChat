package p864t5;

import android.content.Context;
import android.graphics.drawable.Drawable;
import gy3.C87412m;
import p1115h.C107922a;

/* renamed from: t5.c */
public final class C110904c {
    /* renamed from: a */
    public static final Drawable m151204a(Context context, int i) {
        C87412m.m108594g(context, "<this>");
        Drawable b = C107922a.m146228b(context, i);
        if (b != null) {
            return b;
        }
        throw new IllegalStateException(C87412m.m108600m("Invalid resource ID: ", Integer.valueOf(i)).toString());
    }
}
