package hi2;

import android.graphics.Rect;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import gy3.C87412m;
import te3.C64346ep3;

/* renamed from: hi2.v */
public final class C98467v {
    /* renamed from: a */
    public static final void m127917a(Rect rect, C64346ep3 ep32) {
        C87412m.m108594g(rect, "rect");
        C87412m.m108594g(ep32, TPReportKeys.Common.COMMON_PROTO);
        ep32.f183015d.clear();
        ep32.f183015d.add(Integer.valueOf(rect.left));
        ep32.f183015d.add(Integer.valueOf(rect.top));
        ep32.f183015d.add(Integer.valueOf(rect.right));
        ep32.f183015d.add(Integer.valueOf(rect.bottom));
    }

    /* renamed from: b */
    public static final int m127918b(int i) {
        return i % 2 != 0 ? i - 1 : i;
    }
}
