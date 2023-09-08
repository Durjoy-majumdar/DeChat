package s73;

import fy3.C32226l;
import gy3.C87413o;

/* renamed from: s73.d */
public final class C13630d extends C87413o implements C32226l<Object, CharSequence> {

    /* renamed from: d */
    public static final C13630d f38623d = new C13630d();

    public C13630d() {
        super(1);
    }

    public Object invoke(Object obj) {
        if (!(obj instanceof String)) {
            return obj instanceof Number ? ((Number) obj).toString() : "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('\'');
        sb.append(obj);
        sb.append('\'');
        return sb.toString();
    }
}
