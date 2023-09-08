package er1;

import gy3.C8480h;
import gy3.C87412m;
import java.util.Arrays;

/* renamed from: er1.l5 */
public final class C7829l5 {

    /* renamed from: a */
    public String f26367a;

    /* renamed from: b */
    public byte[] f26368b;

    /* renamed from: c */
    public String f26369c;

    public C7829l5(String str, byte[] bArr, String str2, int i, C8480h hVar) {
        bArr = (i & 2) != 0 ? null : bArr;
        str2 = (i & 4) != 0 ? null : str2;
        C87412m.m108594g(str, "description");
        this.f26367a = str;
        this.f26368b = bArr;
        this.f26369c = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7829l5)) {
            return false;
        }
        C7829l5 l5Var = (C7829l5) obj;
        return C87412m.m108589b(this.f26367a, l5Var.f26367a) && C87412m.m108589b(this.f26368b, l5Var.f26368b) && C87412m.m108589b(this.f26369c, l5Var.f26369c);
    }

    public int hashCode() {
        int hashCode = this.f26367a.hashCode() * 31;
        byte[] bArr = this.f26368b;
        int i = 0;
        int hashCode2 = (hashCode + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
        String str = this.f26369c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "PreCheckInfo(description=" + this.f26367a + ", mediaSdkInfo=" + Arrays.toString(this.f26368b) + ", shortTitle=" + this.f26369c + ')';
    }
}
