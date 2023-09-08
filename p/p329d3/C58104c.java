package p329d3;

import java.util.Objects;

/* renamed from: d3.c */
public class C58104c<F, S> {

    /* renamed from: a */
    public final F f166179a;

    /* renamed from: b */
    public final S f166180b;

    public C58104c(F f, S s) {
        this.f166179a = f;
        this.f166180b = s;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C58104c)) {
            return false;
        }
        C58104c cVar = (C58104c) obj;
        return Objects.equals(cVar.f166179a, this.f166179a) && Objects.equals(cVar.f166180b, this.f166180b);
    }

    public int hashCode() {
        F f = this.f166179a;
        int i = 0;
        int hashCode = f == null ? 0 : f.hashCode();
        S s = this.f166180b;
        if (s != null) {
            i = s.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "Pair{" + this.f166179a + " " + this.f166180b + "}";
    }
}
