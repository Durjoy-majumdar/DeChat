package fl0;

import java.util.Objects;

/* renamed from: fl0.c */
public class C86918c {

    /* renamed from: a */
    public final int f252304a;

    /* renamed from: b */
    public final String f252305b;

    public C86918c(int i, String str) {
        this.f252304a = i;
        this.f252305b = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C86918c.class == obj.getClass() && this.f252304a == ((C86918c) obj).f252304a;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(this.f252304a)});
    }

    public String toString() {
        return "ErrorInfo{errno=" + this.f252304a + ", errMsg='" + this.f252305b + '\'' + '}';
    }
}
