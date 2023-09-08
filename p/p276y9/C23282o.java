package p276y9;

import java.util.HashMap;
import java.util.Map;
import p398x9.C23056k;

/* renamed from: y9.o */
public enum C23282o {
    OBJECT(2, 0),
    CHAR(5, 2),
    BYTE(8, 1);
    

    /* renamed from: i */
    public static Map<Integer, C23282o> f66917i;

    /* renamed from: d */
    public int f66919d;

    /* renamed from: e */
    public int f66920e;

    /* access modifiers changed from: public */
    static {
        int i;
        int i2 = C23056k.f66271a;
        f66917i = new HashMap();
        for (C23282o oVar : values()) {
            ((HashMap) f66917i).put(Integer.valueOf(oVar.f66919d), oVar);
        }
    }

    /* access modifiers changed from: public */
    C23282o(int i, int i2) {
        this.f66919d = i;
        this.f66920e = i2;
    }

    /* renamed from: a */
    public static C23282o m27763a(int i) {
        return (C23282o) ((HashMap) f66917i).get(Integer.valueOf(i));
    }
}
