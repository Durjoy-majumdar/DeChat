package p258w0;

import android.view.View;
import android.view.autofill.AutofillManager;
import gy3.C87412m;

/* renamed from: w0.e */
public final class C111684e extends AutofillManager.AutofillCallback {

    /* renamed from: a */
    public static final C111684e f334312a = new C111684e();

    /* renamed from: a */
    public final void mo163339a(C111680a aVar) {
        C87412m.m108594g(aVar, "autofill");
        aVar.f334309c.registerCallback(this);
    }

    /* renamed from: b */
    public final void mo163340b(C111680a aVar) {
        C87412m.m108594g(aVar, "autofill");
        aVar.f334309c.unregisterCallback(this);
    }

    public void onAutofillEvent(View view, int i, int i2) {
        C87412m.m108594g(view, "view");
        super.onAutofillEvent(view, i, i2);
    }
}
