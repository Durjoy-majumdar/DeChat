package up1;

import com.tencent.p014mm.p136ui.MMActivity;
import gy3.C8480h;
import gy3.C87412m;

/* renamed from: up1.r */
public final class C14359r {

    /* renamed from: a */
    public final MMActivity f39915a;

    public C14359r(String str, String str2, MMActivity mMActivity, int i, C8480h hVar) {
        str = (i & 1) != 0 ? "" : str;
        str2 = (i & 2) != 0 ? "" : str2;
        C87412m.m108594g(str, "contextId");
        C87412m.m108594g(str2, "clickTabContextId");
        C87412m.m108594g(mMActivity, "context");
        this.f39915a = mMActivity;
    }
}
