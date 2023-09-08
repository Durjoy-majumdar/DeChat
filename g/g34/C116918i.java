package g34;

import j34.C117296c;
import java.io.Serializable;

/* renamed from: g34.i */
public class C116918i implements Serializable {

    /* renamed from: d */
    public final String f350347d;

    /* renamed from: e */
    public final String f350348e;

    public C116918i(String str, String str2, String str3) {
        C117296c.m165375b(str, "Token can't be null");
        C117296c.m165375b(str2, "Secret can't be null");
        this.f350347d = str;
        this.f350348e = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C116918i.class == obj.getClass()) {
            C116918i iVar = (C116918i) obj;
            return this.f350347d.equals(iVar.f350347d) && this.f350348e.equals(iVar.f350348e);
        }
    }

    public int hashCode() {
        return (this.f350347d.hashCode() * 31) + this.f350348e.hashCode();
    }

    public String toString() {
        return String.format("Token[%s , %s]", new Object[]{this.f350347d, this.f350348e});
    }
}
