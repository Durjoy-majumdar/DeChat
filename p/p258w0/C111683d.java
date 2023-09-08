package p258w0;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import gy3.C87412m;

/* renamed from: w0.d */
public final class C111683d {

    /* renamed from: a */
    public static final C111683d f334311a = new C111683d();

    /* renamed from: a */
    public final AutofillId mo163330a(ViewStructure viewStructure) {
        C87412m.m108594g(viewStructure, "structure");
        return viewStructure.getAutofillId();
    }

    /* renamed from: b */
    public final boolean mo163331b(AutofillValue autofillValue) {
        C87412m.m108594g(autofillValue, "value");
        return autofillValue.isDate();
    }

    /* renamed from: c */
    public final boolean mo163332c(AutofillValue autofillValue) {
        C87412m.m108594g(autofillValue, "value");
        return autofillValue.isList();
    }

    /* renamed from: d */
    public final boolean mo163333d(AutofillValue autofillValue) {
        C87412m.m108594g(autofillValue, "value");
        return autofillValue.isText();
    }

    /* renamed from: e */
    public final boolean mo163334e(AutofillValue autofillValue) {
        C87412m.m108594g(autofillValue, "value");
        return autofillValue.isToggle();
    }

    /* renamed from: f */
    public final void mo163335f(ViewStructure viewStructure, String[] strArr) {
        C87412m.m108594g(viewStructure, "structure");
        C87412m.m108594g(strArr, "hints");
        viewStructure.setAutofillHints(strArr);
    }

    /* renamed from: g */
    public final void mo163336g(ViewStructure viewStructure, AutofillId autofillId, int i) {
        C87412m.m108594g(viewStructure, "structure");
        C87412m.m108594g(autofillId, "parent");
        viewStructure.setAutofillId(autofillId, i);
    }

    /* renamed from: h */
    public final void mo163337h(ViewStructure viewStructure, int i) {
        C87412m.m108594g(viewStructure, "structure");
        viewStructure.setAutofillType(i);
    }

    /* renamed from: i */
    public final CharSequence mo163338i(AutofillValue autofillValue) {
        C87412m.m108594g(autofillValue, "value");
        CharSequence textValue = autofillValue.getTextValue();
        C87412m.m108593f(textValue, "value.textValue");
        return textValue;
    }
}
