package qj1;

import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87413o;
import ok1.C62042e;
import rx3.C13598b0;

/* renamed from: qj1.v1 */
public final class C12703v1 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C12690u1 f36398d;

    /* renamed from: e */
    public final /* synthetic */ long f36399e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12703v1(C12690u1 u1Var, long j) {
        super(0);
        this.f36398d = u1Var;
        this.f36399e = j;
    }

    public Object invoke() {
        this.f36398d.f36364s.setText(C62042e.f176370a.mo87005G(this.f36399e));
        TextView textView = this.f36398d.f36364s;
        textView.setTextColor(textView.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_5));
        return C13598b0.f38549a;
    }
}
