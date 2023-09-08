package qj1;

import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import d60.C58124b;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import nj3.C76912y0;
import rx3.C13598b0;

/* renamed from: qj1.fc */
public final class C12398fc extends C87413o implements C32227p<Boolean, Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C12707vb f35716d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12398fc(C12707vb vbVar) {
        super(2);
        this.f35716d = vbVar;
    }

    public Object invoke(Object obj, Object obj2) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        ((Boolean) obj2).booleanValue();
        if (booleanValue) {
            C12707vb vbVar = this.f35716d;
            if (vbVar.f36410G) {
                C58124b.C7172a.m7372a(vbVar.f36415p, C58124b.C58125b.FINDER_LIVE_MEMBERS_LOADING, (Bundle) null, 2, (Object) null);
            }
            String string = this.f35716d.f166287d.getContext().getResources().getString(C0966R.string.m75);
            C87412m.m108593f(string, "root.context.resources.g…der_live_setting_success)");
            C76912y0.makeText(this.f35716d.f166287d.getContext(), (CharSequence) string, 0).show();
        } else {
            String string2 = this.f35716d.f166287d.getContext().getResources().getString(C0966R.string.m74);
            C87412m.m108593f(string2, "root.context.resources.g…finder_live_setting_fail)");
            C76912y0.makeText(this.f35716d.f166287d.getContext(), (CharSequence) string2, 0).show();
        }
        return C13598b0.f38549a;
    }
}
