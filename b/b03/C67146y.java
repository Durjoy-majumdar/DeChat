package b03;

import android.widget.TextView;
import androidx.transition.C67095c;
import androidx.transition.Transition;
import b03.C67133s;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import vl3.C102226d;

/* renamed from: b03.y */
public final class C67146y extends C67095c {

    /* renamed from: d */
    public final /* synthetic */ C67133s f192796d;

    /* renamed from: e */
    public final /* synthetic */ TextView f192797e;

    /* renamed from: f */
    public final /* synthetic */ CharSequence f192798f;

    public C67146y(C67133s sVar, TextView textView, CharSequence charSequence) {
        this.f192796d = sVar;
        this.f192797e = textView;
        this.f192798f = charSequence;
    }

    /* renamed from: b */
    public void mo77557b(Transition transition) {
        C87412m.m108594g(transition, "transition");
        this.f192796d.mo91244f(this);
        this.f192797e.getLayoutParams().height = -2;
        TextView textView = this.f192797e;
        textView.setLayoutParams(textView.getLayoutParams());
        TextView textView2 = this.f192797e;
        textView2.setPadding(textView2.getPaddingLeft(), this.f192797e.getPaddingTop(), this.f192797e.getPaddingRight(), this.f192796d.f192750d);
        this.f192797e.setText(C102226d.m134696a(MMApplicationContext.getContext(), this.f192798f));
        C67133s.C67135b bVar = this.f192796d.f192749c;
        if (bVar != null) {
            bVar.mo91248a();
        }
    }
}
