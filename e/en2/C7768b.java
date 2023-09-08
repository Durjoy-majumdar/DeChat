package en2;

import android.view.View;
import android.widget.TextView;

/* renamed from: en2.b */
public final class C7768b implements View.OnScrollChangeListener {

    /* renamed from: a */
    public final /* synthetic */ int f26262a;

    /* renamed from: b */
    public final /* synthetic */ TextView f26263b;

    public C7768b(int i, TextView textView) {
        this.f26262a = i;
        this.f26263b = textView;
    }

    public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
        this.f26263b.setAlpha(((float) i2) / ((float) this.f26262a));
    }
}
