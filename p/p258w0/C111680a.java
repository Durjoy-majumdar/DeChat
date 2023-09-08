package p258w0;

import android.view.View;
import android.view.autofill.AutofillManager;
import gy3.C87412m;

/* renamed from: w0.a */
public final class C111680a implements C111681b {

    /* renamed from: a */
    public final View f334307a;

    /* renamed from: b */
    public final C111685g f334308b;

    /* renamed from: c */
    public final AutofillManager f334309c;

    public C111680a(View view, C111685g gVar) {
        C87412m.m108594g(view, "view");
        C87412m.m108594g(gVar, "autofillTree");
        this.f334307a = view;
        this.f334308b = gVar;
        AutofillManager autofillManager = (AutofillManager) view.getContext().getSystemService(AutofillManager.class);
        if (autofillManager != null) {
            this.f334309c = autofillManager;
            view.setImportantForAutofill(1);
            return;
        }
        throw new IllegalStateException("Autofill service could not be located.".toString());
    }
}
