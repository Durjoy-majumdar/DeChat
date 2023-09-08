package b03;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.transition.C103834d;
import androidx.transition.Transition;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.LinkedList;
import rx3.C13598b0;
import vl3.C102226d;

/* renamed from: b03.u */
public final class C67143u extends C87413o implements C32226l<CharSequence, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ Transition f192787d;

    /* renamed from: e */
    public final /* synthetic */ C32226l<CharSequence, C13598b0> f192788e;

    /* renamed from: f */
    public final /* synthetic */ TextView f192789f;

    /* renamed from: g */
    public final /* synthetic */ CharSequence f192790g;

    /* renamed from: h */
    public final /* synthetic */ C67133s f192791h;

    /* renamed from: i */
    public final /* synthetic */ ViewGroup f192792i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67143u(Transition transition, C32226l<? super CharSequence, C13598b0> lVar, TextView textView, CharSequence charSequence, C67133s sVar, ViewGroup viewGroup) {
        super(1);
        this.f192787d = transition;
        this.f192788e = lVar;
        this.f192789f = textView;
        this.f192790g = charSequence;
        this.f192791h = sVar;
        this.f192792i = viewGroup;
    }

    public Object invoke(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        C87412m.m108594g(charSequence, "result");
        if (this.f192787d == null) {
            C32226l<CharSequence, C13598b0> lVar = this.f192788e;
            if (lVar != null) {
                lVar.invoke(charSequence);
            }
        } else {
            CharSequence text = this.f192789f.getText();
            int height = this.f192789f.getLayout().getHeight() + this.f192789f.getPaddingTop() + this.f192789f.getPaddingBottom();
            this.f192789f.setText(C102226d.m134696a(MMApplicationContext.getContext(), this.f192790g));
            this.f192789f.getLayoutParams().height = height;
            TextView textView = this.f192789f;
            textView.setLayoutParams(textView.getLayoutParams());
            C67142t tVar = new C67142t(this.f192791h, this.f192789f, text, this.f192788e, charSequence);
            this.f192787d.mo145324a(tVar);
            ((LinkedList) this.f192791h.f192748b).add(tVar);
            C103834d.m138407a(this.f192792i, this.f192787d);
        }
        return C13598b0.f38549a;
    }
}
