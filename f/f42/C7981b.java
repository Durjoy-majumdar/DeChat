package f42;

import com.google.android.gms.dynamite.ProviderConstants;
import gy3.C87412m;

/* renamed from: f42.b */
public final class C7981b {

    /* renamed from: a */
    public final String f26664a;

    /* renamed from: b */
    public final String f26665b;

    public C7981b(String str, String str2) {
        C87412m.m108594g(str, ProviderConstants.API_COLNAME_FEATURE_VERSION);
        C87412m.m108594g(str2, "provider");
        this.f26664a = str;
        this.f26665b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7981b)) {
            return false;
        }
        C7981b bVar = (C7981b) obj;
        return C87412m.m108589b(this.f26664a, bVar.f26664a) && C87412m.m108589b(this.f26665b, bVar.f26665b);
    }

    public int hashCode() {
        return (this.f26664a.hashCode() * 31) + this.f26665b.hashCode();
    }

    public String toString() {
        return "MBBizConfigProviderInfo(version=" + this.f26664a + ", provider=" + this.f26665b + ')';
    }
}
