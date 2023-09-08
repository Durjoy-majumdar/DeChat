package np1;

import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import nj3.C76912y0;
import pp1.C62461j;
import rx3.C13598b0;
import te3.C50912q41;

/* renamed from: np1.j */
public final class C61872j extends C87413o implements C32228q<Boolean, String, C50912q41, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C61817a f175936d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61872j(C61817a aVar) {
        super(3);
        this.f175936d = aVar;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C87412m.m108594g((String) obj2, "errmsg");
        C87412m.m108594g((C50912q41) obj3, "<anonymous parameter 2>");
        if (booleanValue) {
            C61817a.m72531L(this.f175936d, (Bundle) null, 0, true, false, 8, (Object) null);
            C62461j jVar = this.f175936d.f175777j;
            if (jVar != null) {
                jVar.mo87499c();
            } else {
                C87412m.m108603p("headerHolder");
                throw null;
            }
        } else {
            C76912y0.makeText(this.f175936d.f175772e.getContext(), (CharSequence) this.f175936d.f175772e.getContext().getResources().getString(C0966R.string.e86), 0).show();
        }
        return C13598b0.f38549a;
    }
}
