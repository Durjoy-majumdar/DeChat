package ky3;

import gy3.C87412m;
import java.util.Random;

/* renamed from: ky3.b */
public final class C88332b extends C88331a {

    /* renamed from: f */
    public final C88333a f255321f = new C88333a();

    /* renamed from: ky3.b$a */
    public static final class C88333a extends ThreadLocal<Random> {
        public Object initialValue() {
            return new Random();
        }
    }

    /* renamed from: j */
    public Random mo122720j() {
        Object obj = this.f255321f.get();
        C87412m.m108593f(obj, "implStorage.get()");
        return (Random) obj;
    }
}
