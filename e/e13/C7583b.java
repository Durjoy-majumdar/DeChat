package e13;

import gy3.C87412m;

/* renamed from: e13.b */
public final class C7583b {

    /* renamed from: a */
    public final int f25851a;

    /* renamed from: b */
    public final String f25852b;

    public C7583b(int i, String str) {
        C87412m.m108594g(str, "TranslatedText");
        this.f25851a = i;
        this.f25852b = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7583b)) {
            return false;
        }
        C7583b bVar = (C7583b) obj;
        return this.f25851a == bVar.f25851a && C87412m.m108589b(this.f25852b, bVar.f25852b);
    }

    public int hashCode() {
        return (this.f25851a * 31) + this.f25852b.hashCode();
    }

    public String toString() {
        return "TransResult(clientMsgId=" + this.f25851a + ", TranslatedText=" + this.f25852b + ')';
    }
}
