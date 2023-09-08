package al1;

import android.os.Bundle;
import gy3.C87412m;

/* renamed from: al1.d */
public final class C27914d {

    /* renamed from: a */
    public String f77099a;

    /* renamed from: b */
    public Bundle f77100b;

    /* renamed from: c */
    public Object f77101c;

    public C27914d(String str, Bundle bundle, Object obj) {
        this.f77099a = str;
        this.f77100b = bundle;
        this.f77101c = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27914d)) {
            return false;
        }
        C27914d dVar = (C27914d) obj;
        return C87412m.m108589b(this.f77099a, dVar.f77099a) && C87412m.m108589b(this.f77100b, dVar.f77100b) && C87412m.m108589b(this.f77101c, dVar.f77101c);
    }

    public int hashCode() {
        String str = this.f77099a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Bundle bundle = this.f77100b;
        int hashCode2 = (hashCode + (bundle == null ? 0 : bundle.hashCode())) * 31;
        Object obj = this.f77101c;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "StateWrapper:" + this.f77099a + ',' + this.f77100b;
    }
}
