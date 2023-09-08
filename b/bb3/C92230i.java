package bb3;

import android.widget.EditText;
import java.io.Serializable;

/* renamed from: bb3.i */
public class C92230i implements Serializable {

    /* renamed from: d */
    public int f263989d;

    /* renamed from: e */
    public int f263990e;

    public C92230i(int i, int i2) {
        this.f263989d = i;
        this.f263990e = i2;
        if (i > i2) {
            this.f263990e = i;
            this.f263989d = i2;
        }
    }

    /* renamed from: a */
    public boolean mo126227a() {
        return this.f263989d == this.f263990e;
    }

    public String toString() {
        return "[" + this.f263989d + ", " + this.f263990e + "]";
    }

    public C92230i(EditText editText) {
        this(editText.getSelectionStart(), editText.getSelectionEnd());
    }
}
