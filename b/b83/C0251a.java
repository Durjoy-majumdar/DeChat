package b83;

import java.util.List;
import lv1.C99681n;

/* renamed from: b83.a */
public abstract class C0251a<T> {

    /* renamed from: a */
    public String f791a;

    /* renamed from: b */
    public int f792b;

    public C0251a(String str, int i) {
        this.f791a = str;
        this.f792b = i;
    }

    /* renamed from: a */
    public abstract void mo289a(List<C99681n> list);

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0251a)) {
            return false;
        }
        C0251a aVar = (C0251a) obj;
        String str = this.f791a;
        String str2 = aVar.f791a;
        return aVar.f792b == this.f792b && (str == str2 || (str != null && str.equalsIgnoreCase(str2)));
    }

    public int hashCode() {
        return super.hashCode();
    }
}
