package xp1;

import android.content.DialogInterface;
import android.text.Editable;
import android.widget.EditText;
import fy3.C32228q;
import gy3.C87412m;
import rx3.C13598b0;

/* renamed from: xp1.d */
public final class C15875d implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C32228q<DialogInterface, Integer, CharSequence, C13598b0> f42732d;

    /* renamed from: e */
    public final /* synthetic */ EditText f42733e;

    public C15875d(C32228q<? super DialogInterface, ? super Integer, ? super CharSequence, C13598b0> qVar, EditText editText) {
        this.f42732d = qVar;
        this.f42733e = editText;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C32228q<DialogInterface, Integer, CharSequence, C13598b0> qVar = this.f42732d;
        C87412m.m108593f(dialogInterface, "dialog");
        Integer valueOf = Integer.valueOf(i);
        Editable text = this.f42733e.getText();
        C87412m.m108593f(text, "et.text");
        qVar.invoke(dialogInterface, valueOf, text);
    }
}
