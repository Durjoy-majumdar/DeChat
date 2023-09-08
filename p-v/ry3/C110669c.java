package ry3;

import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Arrays;
import java.util.Map;

/* renamed from: ry3.c */
public final class C110669c extends C87413o implements C32226l<Map.Entry<? extends String, ? extends Object>, CharSequence> {

    /* renamed from: d */
    public static final C110669c f331078d = new C110669c();

    public C110669c() {
        super(1);
    }

    public Object invoke(Object obj) {
        String str;
        Map.Entry entry = (Map.Entry) obj;
        C87412m.m108594g(entry, "entry");
        String str2 = (String) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof boolean[]) {
            str = Arrays.toString((boolean[]) value);
            C87412m.m108593f(str, "toString(this)");
        } else if (value instanceof char[]) {
            str = Arrays.toString((char[]) value);
            C87412m.m108593f(str, "toString(this)");
        } else if (value instanceof byte[]) {
            str = Arrays.toString((byte[]) value);
            C87412m.m108593f(str, "toString(this)");
        } else if (value instanceof short[]) {
            str = Arrays.toString((short[]) value);
            C87412m.m108593f(str, "toString(this)");
        } else if (value instanceof int[]) {
            str = Arrays.toString((int[]) value);
            C87412m.m108593f(str, "toString(this)");
        } else if (value instanceof float[]) {
            str = Arrays.toString((float[]) value);
            C87412m.m108593f(str, "toString(this)");
        } else if (value instanceof long[]) {
            str = Arrays.toString((long[]) value);
            C87412m.m108593f(str, "toString(this)");
        } else if (value instanceof double[]) {
            str = Arrays.toString((double[]) value);
            C87412m.m108593f(str, "toString(this)");
        } else if (value instanceof Object[]) {
            str = Arrays.toString((Object[]) value);
            C87412m.m108593f(str, "toString(this)");
        } else {
            str = value.toString();
        }
        return str2 + '=' + str;
    }
}
