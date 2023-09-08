package e61;

import gy3.C87412m;

/* renamed from: e61.c */
public final class C31422c {

    /* renamed from: a */
    public final String f84107a;

    /* renamed from: b */
    public final int f84108b;

    public C31422c(String str, int i) {
        C87412m.m108594g(str, "appId");
        this.f84107a = str;
        this.f84108b = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31422c)) {
            return false;
        }
        C31422c cVar = (C31422c) obj;
        return C87412m.m108589b(this.f84107a, cVar.f84107a) && this.f84108b == cVar.f84108b;
    }

    public int hashCode() {
        return (this.f84107a.hashCode() * 31) + this.f84108b;
    }

    public String toString() {
        return "MagicEmojiPkgInfo(appId=" + this.f84107a + ", version=" + this.f84108b + ')';
    }
}
