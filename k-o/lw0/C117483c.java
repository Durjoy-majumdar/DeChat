package lw0;

import java.util.Arrays;

/* renamed from: lw0.c */
public final class C117483c {

    /* renamed from: a */
    public C88657e f351585a = null;

    /* renamed from: b */
    public double f351586b = 0.0d;

    /* renamed from: c */
    public String f351587c = "";

    public boolean equals(Object obj) {
        C88657e eVar = this.f351585a;
        if (eVar == null || obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return Arrays.equals(((C117483c) obj).f351585a.f255971b.f255973c, eVar.f255971b.f255973c);
    }

    public int hashCode() {
        C88657e eVar = this.f351585a;
        if (eVar == null) {
            return 0;
        }
        return Arrays.hashCode(eVar.f255971b.f255973c);
    }
}
