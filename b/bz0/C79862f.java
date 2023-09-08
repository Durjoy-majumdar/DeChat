package bz0;

import android.text.Editable;
import android.widget.TextView;
import go3.C87283v;
import gy3.C87412m;
import z04.C91602g0;

/* renamed from: bz0.f */
public final class C79862f extends C87283v {

    /* renamed from: d */
    public final /* synthetic */ C79856a f234011d;

    /* renamed from: e */
    public final /* synthetic */ int f234012e;

    /* renamed from: f */
    public final /* synthetic */ TextView f234013f;

    /* renamed from: bz0.f$a */
    public static final class C79863a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C79856a f234014d;

        public C79863a(C79856a aVar) {
            this.f234014d = aVar;
        }

        public final void run() {
            TextView[] textViewArr = this.f234014d.f234007f;
            if (textViewArr != null) {
                TextView textView = textViewArr[7];
                C87412m.m108591d(textView);
                textView.setText("");
                return;
            }
            C87412m.m108603p("charViews");
            throw null;
        }
    }

    public C79862f(C79856a aVar, int i, TextView textView) {
        this.f234011d = aVar;
        this.f234012e = i;
        this.f234013f = textView;
    }

    public void afterTextChanged(Editable editable) {
        String obj;
        Character l0;
        TextView[] textViewArr = this.f234011d.f234007f;
        if (textViewArr != null) {
            TextView textView = textViewArr[this.f234012e];
            C87412m.m108591d(textView);
            CharSequence text = textView.getText();
            boolean z = false;
            if (!(text == null || (obj = text.toString()) == null || (l0 = C91602g0.m114944l0(obj)) == null)) {
                char charValue = l0.charValue();
                if (19968 <= charValue && charValue < 40892) {
                    z = true;
                }
            }
            if (z) {
                this.f234013f.post(new C79863a(this.f234011d));
                return;
            }
            return;
        }
        C87412m.m108603p("charViews");
        throw null;
    }
}
