package ny2;

import android.content.Context;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import ky2.C10428a;

/* renamed from: ny2.j */
public final class C11315j extends C11313h {
    /* renamed from: d */
    public String mo10175d(Context context) {
        C87412m.m108594g(context, "context");
        String string = context.getString(C0966R.string.lh_);
        C87412m.m108593f(string, "context.getString(com.te…_teen_mode_out_link_desc)");
        return string;
    }

    /* renamed from: q */
    public void mo10176q(Context context, C10428a.C10430b bVar, C10428a.C10429a aVar) {
        Context context2;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(bVar, "state");
        if (aVar != null) {
            LinearLayout linearLayout = aVar.f31655i;
            if (linearLayout == null || (context2 = linearLayout.getContext()) == null) {
                context2 = MMApplicationContext.getContext();
            }
            C87412m.m108593f(context2, "context");
            mo11347D(context2, bVar, aVar, false);
            mo11346B(context2, bVar, aVar, false);
        }
    }
}
