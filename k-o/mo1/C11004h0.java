package mo1;

import android.view.View;
import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileHeaderUIC;
import dp1.C7435f2;
import gy3.C87412m;
import org.json.JSONObject;
import rs1.C13442s8;
import zp3.C23555k;

/* renamed from: mo1.h0 */
public final class C11004h0 extends C23555k.C23562d {

    /* renamed from: a */
    public final /* synthetic */ FinderProfileHeaderUIC f32719a;

    /* renamed from: b */
    public final /* synthetic */ JSONObject f32720b;

    public C11004h0(FinderProfileHeaderUIC finderProfileHeaderUIC, JSONObject jSONObject) {
        this.f32719a = finderProfileHeaderUIC;
        this.f32720b = jSONObject;
    }

    /* renamed from: b */
    public void mo53b(View view, long j, long j2, boolean z) {
        C87412m.m108594g(view, "view");
        if (z) {
            C7435f2 f2Var = C7435f2.f25626a;
            C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f32719a.getContext());
            f2Var.mo8577a(f != null ? f.mo12861q3() : null, "get_red_cover_panel", 0, this.f32720b);
        }
    }
}
