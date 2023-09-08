package vt0;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.widget.EditText;
import android.widget.NumberPicker;
import p977hj.C87527b;

/* renamed from: vt0.m */
public final class C22790m {

    /* renamed from: vt0.m$a */
    public class C22791a extends Editable.Factory {

        /* renamed from: vt0.m$a$a */
        public class C22792a extends SpannableStringBuilder {
            public C22792a(C22791a aVar, CharSequence charSequence) {
                super(charSequence);
            }

            public void setSpan(Object obj, int i, int i2, int i3) {
                try {
                    super.setSpan(obj, i, i2, i3);
                } catch (Exception unused) {
                }
            }
        }

        public Editable newEditable(CharSequence charSequence) {
            return new C22792a(this, charSequence);
        }
    }

    /* renamed from: a */
    public static void m26712a(NumberPicker numberPicker) {
        if (numberPicker != null) {
            try {
                EditText editText = (EditText) new C87527b(numberPicker, "mInputText", (String) null).mo121998a();
                if (editText != null) {
                    editText.setEditableFactory(new C22791a());
                }
            } catch (Exception unused) {
            }
        }
    }
}
