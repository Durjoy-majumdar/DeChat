package p268x1;

import android.text.Layout;
import gy3.C87412m;

/* renamed from: x1.o */
public final class C112008o {

    /* renamed from: a */
    public static final Layout.Alignment f335293a;

    /* renamed from: b */
    public static final Layout.Alignment f335294b;

    static {
        Layout.Alignment[] values = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : values) {
            if (C87412m.m108589b(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (C87412m.m108589b(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        f335293a = alignment;
        f335294b = alignment2;
    }
}
