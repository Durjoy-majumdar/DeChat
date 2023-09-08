package p748xd;

import android.view.View;
import android.view.ViewGroup;
import gy3.C87412m;
import java.util.HashMap;

/* renamed from: xd.e */
public final class C78798e {

    /* renamed from: a */
    public final HashMap<View, Integer> f230555a = new HashMap<>();

    /* renamed from: a */
    public final int mo108711a(ViewGroup viewGroup, View view, int i) {
        C87412m.m108594g(viewGroup, "viewGroup");
        C87412m.m108594g(view, "view");
        Integer num = this.f230555a.get(view);
        if (num != null && num.intValue() == i) {
            return -2;
        }
        this.f230555a.put(view, Integer.valueOf(i));
        int childCount = viewGroup.getChildCount();
        boolean z = false;
        int i2 = 0;
        for (int i3 = 0; i3 < childCount; i3++) {
            Integer num2 = this.f230555a.get(viewGroup.getChildAt(i3));
            C87412m.m108591d(num2);
            if (i < num2.intValue()) {
                z = true;
                i2 = i3;
            }
        }
        if (z) {
            return i2;
        }
        return -1;
    }
}
