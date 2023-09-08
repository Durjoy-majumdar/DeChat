package p544h2;

import gy3.C87412m;
import java.util.ArrayList;

/* renamed from: h2.f */
public final class C108014f {

    /* renamed from: b */
    public static final C108014f f323457b = new C108014f(0);

    /* renamed from: c */
    public static final C108014f f323458c = new C108014f(1);

    /* renamed from: d */
    public static final C108014f f323459d = new C108014f(2);

    /* renamed from: a */
    public final int f323460a;

    public C108014f(int i) {
        this.f323460a = i;
    }

    /* renamed from: a */
    public final boolean mo158410a(C108014f fVar) {
        C87412m.m108594g(fVar, "other");
        int i = this.f323460a;
        return (fVar.f323460a | i) == i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C108014f) && this.f323460a == ((C108014f) obj).f323460a;
    }

    public int hashCode() {
        return this.f323460a;
    }

    public String toString() {
        if (this.f323460a == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((this.f323460a & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((this.f323460a & 2) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            return "TextDecoration." + ((String) arrayList.get(0));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("TextDecoration[");
        StringBuilder sb4 = new StringBuilder();
        sb4.append("");
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = arrayList.get(i2);
            i++;
            if (i > 1) {
                sb4.append(", ");
            }
            if (obj == null ? true : obj instanceof CharSequence) {
                sb4.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb4.append(((Character) obj).charValue());
            } else {
                sb4.append(String.valueOf(obj));
            }
        }
        sb4.append("");
        String sb5 = sb4.toString();
        C87412m.m108593f(sb5, "fastJoinTo(StringBuilder…form)\n        .toString()");
        sb.append(sb5);
        sb.append(']');
        return sb.toString();
    }
}
