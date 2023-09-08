package ve1;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87413o;
import jq3.C60905o;
import rx3.C13598b0;

/* renamed from: ve1.z1 */
public final class C14705z1 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C60905o f40654d;

    /* renamed from: e */
    public final /* synthetic */ LinearLayout f40655e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14705z1(C60905o oVar, LinearLayout linearLayout) {
        super(0);
        this.f40654d = oVar;
        this.f40655e = linearLayout;
    }

    public Object invoke() {
        View D = this.f40654d.mo85812D(C0966R.C0970id.f358728gq1);
        ViewGroup viewGroup = D instanceof ViewGroup ? (ViewGroup) D : null;
        if (viewGroup != null) {
            viewGroup.removeView(this.f40655e);
        }
        return C13598b0.f38549a;
    }
}
