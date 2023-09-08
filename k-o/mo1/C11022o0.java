package mo1;

import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileHeaderUIC;
import dp1.C7435f2;
import fy3.C32227p;
import gy3.C87413o;
import org.json.JSONObject;
import rs1.C13442s8;
import rx3.C13598b0;

/* renamed from: mo1.o0 */
public final class C11022o0 extends C87413o implements C32227p<Boolean, Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderProfileHeaderUIC f32747d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11022o0(FinderProfileHeaderUIC finderProfileHeaderUIC) {
        super(2);
        this.f32747d = finderProfileHeaderUIC;
    }

    public Object invoke(Object obj, Object obj2) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (((Boolean) obj2).booleanValue()) {
            if (booleanValue) {
                this.f32747d.mo3835o3().setBtnVisible(false);
                C7435f2 f2Var = C7435f2.f25626a;
                C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f32747d.getContext());
                f2Var.mo8577a(f != null ? f.mo12861q3() : null, "description_fold", 0, (JSONObject) null);
            } else {
                C7435f2 f2Var2 = C7435f2.f25626a;
                C13442s8 f2 = C13442s8.f38060Q0.mo12873f(this.f32747d.getContext());
                f2Var2.mo8577a(f2 != null ? f2.mo12861q3() : null, "description_unfold", 0, (JSONObject) null);
            }
        }
        return C13598b0.f38549a;
    }
}
