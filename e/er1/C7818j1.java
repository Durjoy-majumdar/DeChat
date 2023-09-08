package er1;

import android.content.Context;
import android.view.View;
import dp1.C7435f2;
import gy3.C87412m;
import org.json.JSONObject;
import rs1.C13442s8;
import te3.C49712hj1;
import zp3.C23555k;

/* renamed from: er1.j1 */
public final class C7818j1 extends C23555k.C23562d {

    /* renamed from: a */
    public final /* synthetic */ Context f26341a;

    public C7818j1(Context context) {
        this.f26341a = context;
    }

    /* renamed from: b */
    public void mo53b(View view, long j, long j2, boolean z) {
        C49712hj1 hj12;
        C87412m.m108594g(view, "view");
        if (z) {
            Context context = this.f26341a;
            C87412m.m108594g(context, "context");
            C13442s8 f = C13442s8.f38060Q0.mo12873f(context);
            if (f != null) {
                hj12 = f.mo12861q3();
                hj12.f134675i = 117;
            } else {
                hj12 = null;
            }
            C7435f2.f25626a.mo8577a(hj12, "protrait", 0, (JSONObject) null);
        }
    }
}
