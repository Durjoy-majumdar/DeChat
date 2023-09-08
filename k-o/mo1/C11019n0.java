package mo1;

import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileHeaderUIC;
import dp1.C7435f2;
import fy3.C32224a;
import gy3.C87413o;
import org.json.JSONObject;
import rs1.C13442s8;
import rx3.C13598b0;

/* renamed from: mo1.n0 */
public final class C11019n0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderProfileHeaderUIC f32743d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11019n0(FinderProfileHeaderUIC finderProfileHeaderUIC) {
        super(0);
        this.f32743d = finderProfileHeaderUIC;
    }

    public Object invoke() {
        if (this.f32743d.mo3835o3().f17602p) {
            C7435f2 f2Var = C7435f2.f25626a;
            C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f32743d.getContext());
            f2Var.mo8577a(f != null ? f.mo12861q3() : null, "description_fold", 1, (JSONObject) null);
        } else {
            C7435f2 f2Var2 = C7435f2.f25626a;
            C13442s8 f2 = C13442s8.f38060Q0.mo12873f(this.f32743d.getContext());
            f2Var2.mo8577a(f2 != null ? f2.mo12861q3() : null, "description_unfold", 1, (JSONObject) null);
        }
        return C13598b0.f38549a;
    }
}
