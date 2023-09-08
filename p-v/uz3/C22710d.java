package uz3;

import com.tencent.xweb.file.XVFSFile;
import gy3.C87412m;

/* renamed from: uz3.d */
public abstract class C22710d {

    /* renamed from: uz3.d$a */
    public static final class C22711a extends C22710d {

        /* renamed from: a */
        public final String f65290a;

        /* renamed from: b */
        public final String f65291b;

        public C22711a(String str, String str2) {
            C87412m.m108594g(str, "name");
            C87412m.m108594g(str2, "desc");
            this.f65290a = str;
            this.f65291b = str2;
        }

        /* renamed from: a */
        public String mo35800a() {
            return this.f65290a + XVFSFile.PATH_SEPARATOR_CHAR + this.f65291b;
        }

        /* renamed from: b */
        public String mo35801b() {
            return this.f65291b;
        }

        /* renamed from: c */
        public String mo35802c() {
            return this.f65290a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C22711a)) {
                return false;
            }
            C22711a aVar = (C22711a) obj;
            return C87412m.m108589b(this.f65290a, aVar.f65290a) && C87412m.m108589b(this.f65291b, aVar.f65291b);
        }

        public int hashCode() {
            return (this.f65290a.hashCode() * 31) + this.f65291b.hashCode();
        }
    }

    /* renamed from: uz3.d$b */
    public static final class C22712b extends C22710d {

        /* renamed from: a */
        public final String f65292a;

        /* renamed from: b */
        public final String f65293b;

        public C22712b(String str, String str2) {
            C87412m.m108594g(str, "name");
            C87412m.m108594g(str2, "desc");
            this.f65292a = str;
            this.f65293b = str2;
        }

        /* renamed from: a */
        public String mo35800a() {
            return this.f65292a + this.f65293b;
        }

        /* renamed from: b */
        public String mo35801b() {
            return this.f65293b;
        }

        /* renamed from: c */
        public String mo35802c() {
            return this.f65292a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C22712b)) {
                return false;
            }
            C22712b bVar = (C22712b) obj;
            return C87412m.m108589b(this.f65292a, bVar.f65292a) && C87412m.m108589b(this.f65293b, bVar.f65293b);
        }

        public int hashCode() {
            return (this.f65292a.hashCode() * 31) + this.f65293b.hashCode();
        }
    }

    /* renamed from: a */
    public abstract String mo35800a();

    /* renamed from: b */
    public abstract String mo35801b();

    /* renamed from: c */
    public abstract String mo35802c();

    public final String toString() {
        return mo35800a();
    }
}
