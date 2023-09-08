package bz0;

import android.widget.TextView;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: bz0.i */
public final class C79865i extends C87413o implements C32224a<Boolean> {

    /* renamed from: d */
    public final /* synthetic */ C79856a f234016d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C79865i(C79856a aVar) {
        super(0);
        this.f234016d = aVar;
    }

    public Object invoke() {
        int i = 0;
        while (i < 7) {
            TextView[] textViewArr = this.f234016d.f234007f;
            if (textViewArr != null) {
                TextView textView = textViewArr[i];
                C87412m.m108591d(textView);
                CharSequence text = textView.getText();
                if (text == null || text.length() == 0) {
                    return Boolean.FALSE;
                }
                i++;
            } else {
                C87412m.m108603p("charViews");
                throw null;
            }
        }
        return Boolean.TRUE;
    }
}
