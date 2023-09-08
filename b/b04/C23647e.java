package b04;

import gy3.C87412m;
import java.util.Arrays;
import n04.C25143j0;
import n04.C25176s0;
import ty3.C22558j;
import ty3.C26336h;
import wy3.C26448e0;

/* renamed from: b04.e */
public final class C23647e extends C23661q<Character> {
    public C23647e(char c) {
        super(Character.valueOf(c));
    }

    /* renamed from: a */
    public C25143j0 mo37191a(C26448e0 e0Var) {
        C87412m.m108594g(e0Var, "module");
        C26336h m = e0Var.mo52623m();
        m.getClass();
        C25176s0 t = m.mo53327t(C22558j.CHAR);
        if (t != null) {
            return t;
        }
        C26336h.m33836a(62);
        throw null;
    }

    public String toString() {
        String str;
        Object[] objArr = new Object[2];
        boolean z = false;
        objArr[0] = Integer.valueOf(((Character) this.f67839a).charValue());
        char charValue = ((Character) this.f67839a).charValue();
        if (charValue == 8) {
            str = "\\b";
        } else if (charValue == 9) {
            str = "\\t";
        } else if (charValue == 10) {
            str = "\\n";
        } else if (charValue == 12) {
            str = "\\f";
        } else if (charValue == 13) {
            str = "\\r";
        } else {
            byte type = (byte) Character.getType(charValue);
            if (!(type == 0 || type == 13 || type == 14 || type == 15 || type == 16 || type == 18 || type == 19)) {
                z = true;
            }
            str = z ? String.valueOf(charValue) : "?";
        }
        objArr[1] = str;
        String format = String.format("\\u%04X ('%s')", Arrays.copyOf(objArr, 2));
        C87412m.m108593f(format, "format(this, *args)");
        return format;
    }
}
