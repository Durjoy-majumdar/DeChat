package ro3;

import gy3.C87412m;
import java.util.HashMap;
import java.util.List;

/* renamed from: ro3.w */
public final class C110600w {

    /* renamed from: a */
    public final HashMap<String, List<C110601a>> f330865a = new HashMap<>();

    /* renamed from: ro3.w$a */
    public static final class C110601a {

        /* renamed from: a */
        public final String f330866a;

        /* renamed from: b */
        public final String f330867b;

        /* renamed from: c */
        public final String f330868c;

        /* renamed from: d */
        public final String f330869d;

        public C110601a(String str, String str2, String str3, String str4) {
            C87412m.m108594g(str, "idName");
            C87412m.m108594g(str2, "idPackage");
            C87412m.m108594g(str3, "titleName");
            C87412m.m108594g(str4, "titlePackage");
            this.f330866a = str;
            this.f330867b = str2;
            this.f330868c = str3;
            this.f330869d = str4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C110601a)) {
                return false;
            }
            C110601a aVar = (C110601a) obj;
            return C87412m.m108589b(this.f330866a, aVar.f330866a) && C87412m.m108589b(this.f330867b, aVar.f330867b) && C87412m.m108589b(this.f330868c, aVar.f330868c) && C87412m.m108589b(this.f330869d, aVar.f330869d);
        }

        public int hashCode() {
            return (((((this.f330866a.hashCode() * 31) + this.f330867b.hashCode()) * 31) + this.f330868c.hashCode()) * 31) + this.f330869d.hashCode();
        }

        public String toString() {
            return "SysMenuConfigItem(idName=" + this.f330866a + ", idPackage=" + this.f330867b + ", titleName=" + this.f330868c + ", titlePackage=" + this.f330869d + ')';
        }
    }
}
