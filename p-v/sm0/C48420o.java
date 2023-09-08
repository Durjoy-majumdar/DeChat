package sm0;

import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Arrays;

/* renamed from: sm0.o */
public final class C48420o extends C87413o implements C32226l<Byte, CharSequence> {

    /* renamed from: d */
    public static final C48420o f129601d = new C48420o();

    public C48420o() {
        super(1);
    }

    public Object invoke(Object obj) {
        String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(((Number) obj).byteValue())}, 1));
        C87412m.m108593f(format, "format(this, *args)");
        return format;
    }
}
