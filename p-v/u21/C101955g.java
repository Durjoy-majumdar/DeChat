package u21;

import android.widget.EditText;
import java.io.Serializable;

/* renamed from: u21.g */
public class C101955g implements Serializable {

    /* renamed from: d */
    public int f300151d;

    /* renamed from: e */
    public int f300152e;

    public C101955g(int i, int i2) {
        this.f300151d = i;
        this.f300152e = i2;
        if (i > i2) {
            this.f300152e = i;
            this.f300151d = i2;
        }
    }

    /* renamed from: a */
    public boolean mo141479a() {
        return this.f300151d == this.f300152e;
    }

    public String toString() {
        return "[" + this.f300151d + ", " + this.f300152e + "]";
    }

    public C101955g(EditText editText) {
        this(editText.getSelectionStart(), editText.getSelectionEnd());
    }
}
