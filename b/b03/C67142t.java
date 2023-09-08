package b03;

import android.widget.TextView;
import androidx.transition.C67095c;
import androidx.transition.Transition;
import b03.C67133s;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32226l;
import gy3.C87412m;
import rx3.C13598b0;
import vl3.C102226d;

/* renamed from: b03.t */
public final class C67142t extends C67095c {

    /* renamed from: d */
    public final /* synthetic */ C67133s f192782d;

    /* renamed from: e */
    public final /* synthetic */ TextView f192783e;

    /* renamed from: f */
    public final /* synthetic */ CharSequence f192784f;

    /* renamed from: g */
    public final /* synthetic */ C32226l<CharSequence, C13598b0> f192785g;

    /* renamed from: h */
    public final /* synthetic */ CharSequence f192786h;

    public C67142t(C67133s sVar, TextView textView, CharSequence charSequence, C32226l<? super CharSequence, C13598b0> lVar, CharSequence charSequence2) {
        this.f192782d = sVar;
        this.f192783e = textView;
        this.f192784f = charSequence;
        this.f192785g = lVar;
        this.f192786h = charSequence2;
    }

    /* renamed from: b */
    public void mo77557b(Transition transition) {
        C87412m.m108594g(transition, "transition");
        this.f192782d.mo91244f(this);
        this.f192783e.getLayoutParams().height = -2;
        TextView textView = this.f192783e;
        textView.setLayoutParams(textView.getLayoutParams());
        this.f192783e.setText(C102226d.m134696a(MMApplicationContext.getContext(), this.f192784f));
        C32226l<CharSequence, C13598b0> lVar = this.f192785g;
        if (lVar != null) {
            lVar.invoke(this.f192786h);
        }
        C67133s.C67135b bVar = this.f192782d.f192749c;
        if (bVar != null) {
            bVar.mo91248a();
        }
    }
}
