package bz0;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;
import gy3.C87412m;
import z04.C91602g0;

/* renamed from: bz0.e */
public final class C79861e implements InputFilter {

    /* renamed from: d */
    public final /* synthetic */ C79856a f234009d;

    /* renamed from: e */
    public final /* synthetic */ int f234010e;

    public C79861e(C79856a aVar, int i) {
        this.f234009d = aVar;
        this.f234010e = i;
    }

    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        Character l0;
        boolean z = false;
        if (!(charSequence == null || charSequence.length() == 0)) {
            char k0 = C91602g0.m114943k0(charSequence);
            if (19968 <= k0 && k0 < 40892) {
                TextView[] textViewArr = this.f234009d.f234007f;
                if (textViewArr != null) {
                    TextView textView = textViewArr[7];
                    C87412m.m108591d(textView);
                    CharSequence text = textView.getText();
                    if (!(text == null || (l0 = C91602g0.m114944l0(text)) == null)) {
                        char charValue = l0.charValue();
                        if (19968 <= charValue && charValue < 40892) {
                            z = true;
                        }
                    }
                    if (z) {
                        TextView[] textViewArr2 = this.f234009d.f234007f;
                        if (textViewArr2 != null) {
                            TextView textView2 = textViewArr2[this.f234010e];
                            C87412m.m108591d(textView2);
                            return textView2.getText();
                        }
                        C87412m.m108603p("charViews");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("charViews");
                    throw null;
                }
            }
        }
        return charSequence;
    }
}
