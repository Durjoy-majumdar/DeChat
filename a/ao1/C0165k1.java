package ao1;

import android.widget.LinearLayout;
import fy3.C32227p;
import gy3.C87413o;
import rx3.C13598b0;
import z04.C112550d0;

/* renamed from: ao1.k1 */
public final class C0165k1 extends C87413o implements C32227p<String, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C0157h1 f616d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0165k1(C0157h1 h1Var) {
        super(2);
        this.f616d = h1Var;
    }

    public Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        int intValue = ((Number) obj2).intValue();
        if (str != null) {
            C0157h1 h1Var = this.f616d;
            String str2 = C112550d0.m153801u(str, h1Var.f607n, false) ? h1Var.f607n : "";
            C32227p<? super String, ? super String, C13598b0> pVar = h1Var.f603g;
            if (pVar != null) {
                pVar.invoke(str, str2);
            }
        }
        C0157h1 h1Var2 = this.f616d;
        LinearLayout linearLayout = h1Var2.f600d;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        h1Var2.f606j = -1;
        h1Var2.f607n = "";
        C0157h1 h1Var3 = this.f616d;
        if (str == null) {
            str = "";
        }
        h1Var3.mo148c3(1, str, intValue);
        return C13598b0.f38549a;
    }
}
