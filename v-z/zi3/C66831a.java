package zi3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;

/* renamed from: zi3.a */
public final class C66831a extends C66832c {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C66831a(java.util.List r1, int r2, java.util.List r3, int r4, gy3.C8480h r5) {
        /*
            r0 = this;
            r5 = r4 & 2
            if (r5 == 0) goto L_0x0006
            r2 = 9
        L_0x0006:
            r4 = r4 & 4
            if (r4 == 0) goto L_0x000b
            r3 = 0
        L_0x000b:
            java.lang.String r4 = "dataList"
            gy3.C87412m.m108594g(r1, r4)
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zi3.C66831a.<init>(java.util.List, int, java.util.List, int, gy3.h):void");
    }

    /* renamed from: F4 */
    public C66833f onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.f6326bj, viewGroup, false);
        C87412m.m108593f(inflate, "view");
        return new C66833f(inflate);
    }
}
