package il1;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import nj3.C76912y0;
import rx3.C13598b0;
import te3.C51613uy0;
import te3.C64247az0;

/* renamed from: il1.r7 */
public final class C9104r7 extends C87413o implements C32227p<Boolean, String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C60362c7 f28686d;

    /* renamed from: e */
    public final /* synthetic */ int f28687e;

    /* renamed from: f */
    public final /* synthetic */ C64247az0 f28688f;

    /* renamed from: g */
    public final /* synthetic */ C51613uy0 f28689g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9104r7(C60362c7 c7Var, int i, C64247az0 az02, C51613uy0 uy02) {
        super(2);
        this.f28686d = c7Var;
        this.f28687e = i;
        this.f28688f = az02;
        this.f28689g = uy02;
    }

    public Object invoke(Object obj, Object obj2) {
        String str = (String) obj2;
        if (((Boolean) obj).booleanValue()) {
            this.f28686d.mo85338m(this.f28687e, this.f28688f, this.f28689g);
        } else {
            Context context = this.f28686d.f172116a.getContext();
            if (str == null) {
                str = "";
            }
            C60362c7 c7Var = this.f28686d;
            if (str.length() == 0) {
                str = c7Var.f172116a.getContext().getString(C0966R.string.dnr);
                C87412m.m108593f(str, "root.context.getString(c…_live_game_prepare_error)");
            }
            C76912y0.m92767f(context, str);
        }
        return C13598b0.f38549a;
    }
}
