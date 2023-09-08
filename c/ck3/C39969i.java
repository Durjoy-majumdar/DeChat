package ck3;

import com.tencent.p014mm.storage.C72996z1;
import gy3.C87412m;

/* renamed from: ck3.i */
public final class C39969i {

    /* renamed from: a */
    public final String f107141a;

    /* renamed from: b */
    public final String f107142b;

    /* renamed from: c */
    public final C72996z1 f107143c;

    /* renamed from: d */
    public final boolean f107144d;

    /* renamed from: e */
    public final boolean f107145e;

    public C39969i(String str, String str2, C72996z1 z1Var, boolean z, boolean z2) {
        C87412m.m108594g(str, "talkerUserName");
        C87412m.m108594g(z1Var, "talker");
        this.f107141a = str;
        this.f107142b = str2;
        this.f107143c = z1Var;
        this.f107144d = z;
        this.f107145e = z2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39969i)) {
            return false;
        }
        C39969i iVar = (C39969i) obj;
        return C87412m.m108589b(this.f107141a, iVar.f107141a) && C87412m.m108589b(this.f107142b, iVar.f107142b) && C87412m.m108589b(this.f107143c, iVar.f107143c) && this.f107144d == iVar.f107144d && this.f107145e == iVar.f107145e;
    }

    public int hashCode() {
        int hashCode = this.f107141a.hashCode() * 31;
        String str = this.f107142b;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f107143c.hashCode()) * 31;
        boolean z = this.f107144d;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode2 + (z ? 1 : 0)) * 31;
        boolean z3 = this.f107145e;
        if (!z3) {
            z2 = z3;
        }
        return i + (z2 ? 1 : 0);
    }

    public String toString() {
        return "ChattingTalkerInfo(talkerUserName=" + this.f107141a + ", talkerNickName=" + this.f107142b + ", talker=" + this.f107143c + ", isGroupChat=" + this.f107144d + ", isAppBrandServiceChat=" + this.f107145e + ')';
    }
}
