package bz0;

import android.widget.TextView;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import u24.C90599h;

/* renamed from: bz0.j */
public final class C67331j extends C87413o implements C32226l<TextView, CharSequence> {

    /* renamed from: d */
    public static final C67331j f193172d = new C67331j();

    public C67331j() {
        super(1);
    }

    public Object invoke(Object obj) {
        TextView textView = (TextView) obj;
        C87412m.m108591d(textView);
        String o = C90599h.m113522o(textView.getText().toString(), 0, 1);
        return o == null ? "" : o;
    }
}
