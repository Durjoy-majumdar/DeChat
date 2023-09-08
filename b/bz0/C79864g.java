package bz0;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;
import gy3.C87412m;
import z04.C91602g0;

/* renamed from: bz0.g */
public final class C79864g implements InputFilter {

    /* renamed from: d */
    public final /* synthetic */ C79856a f234015d;

    public C79864g(C79856a aVar) {
        this.f234015d = aVar;
    }

    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        Character l0;
        boolean z = false;
        if (charSequence == null || charSequence.length() == 0) {
            return charSequence;
        }
        TextView[] textViewArr = this.f234015d.f234007f;
        if (textViewArr != null) {
            TextView textView = textViewArr[6];
            C87412m.m108591d(textView);
            CharSequence text = textView.getText();
            if (!(text == null || (l0 = C91602g0.m114944l0(text)) == null)) {
                char charValue = l0.charValue();
                if (19968 <= charValue && charValue < 40892) {
                    z = true;
                }
            }
            return z ? "" : charSequence;
        }
        C87412m.m108603p("charViews");
        throw null;
    }
}
