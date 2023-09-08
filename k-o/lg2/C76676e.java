package lg2;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: lg2.e */
public class C76676e implements TextWatcher {

    /* renamed from: d */
    public int f224362d = 0;

    /* renamed from: e */
    public final /* synthetic */ C76681j f224363e;

    public C76676e(C76681j jVar) {
        this.f224363e = jVar;
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String charSequence2 = charSequence.toString();
        int selectionStart = this.f224363e.f224372c.getContentEditText().getSelectionStart();
        String str = "";
        if (charSequence2 != null) {
            StringBuilder sb = new StringBuilder(charSequence2.replaceAll(" ", str));
            int length = sb.length();
            if (length >= 4) {
                sb.insert(3, ' ');
            }
            if (length >= 8) {
                sb.insert(8, ' ');
            }
            str = sb.toString();
            int length2 = str.length();
            int i4 = this.f224362d;
            if (length2 > i4) {
                if ((selectionStart == 4 || selectionStart == 9) && i3 == 1) {
                    selectionStart++;
                } else if ((selectionStart == 4 || selectionStart == 9) && i3 > 1) {
                    selectionStart += i3;
                }
            } else if (length2 < i4 && (selectionStart == 4 || selectionStart == 9)) {
                selectionStart--;
            }
            this.f224362d = length2;
        }
        if (!charSequence2.equals(str)) {
            this.f224363e.f224372c.getContentEditText().setText(str);
            if (selectionStart < this.f224362d) {
                this.f224363e.f224372c.getContentEditText().setSelection(selectionStart);
            } else {
                this.f224363e.f224372c.getContentEditText().setSelection(this.f224362d);
            }
        }
    }
}
