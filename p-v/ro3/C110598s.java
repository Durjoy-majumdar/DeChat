package ro3;

import android.text.Editable;
import android.text.Spannable;
import android.text.TextWatcher;
import gy3.C87412m;

/* renamed from: ro3.s */
public final class C110598s implements TextWatcher {

    /* renamed from: d */
    public final /* synthetic */ C110588j f330863d;

    public C110598s(C110588j jVar) {
        this.f330863d = jVar;
    }

    public void afterTextChanged(Editable editable) {
        C87412m.m108594g(editable, "s");
        C110588j jVar = this.f330863d;
        CharSequence text = jVar.f330833h.getText();
        jVar.f330834i = text instanceof Spannable ? (Spannable) text : null;
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C87412m.m108594g(charSequence, "s");
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C87412m.m108594g(charSequence, "s");
        C110588j jVar = this.f330863d;
        if (!jVar.f330849x) {
            jVar.mo148760m();
            this.f330863d.mo148759l();
        }
        this.f330863d.mo162135d();
        this.f330863d.f330833h.setCursorVisible(true);
        C110588j jVar2 = this.f330863d;
        jVar2.f330815P = jVar2.f330833h.getSelectionStart();
    }
}
