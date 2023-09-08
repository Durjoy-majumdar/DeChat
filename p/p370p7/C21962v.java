package p370p7;

import java.util.Arrays;

/* renamed from: p7.v */
public final class C21962v {

    /* renamed from: d */
    public static final C21962v f62176d = new C21962v(new C21961u[0]);

    /* renamed from: a */
    public final int f62177a;

    /* renamed from: b */
    public final C21961u[] f62178b;

    /* renamed from: c */
    public int f62179c;

    public C21962v(C21961u... uVarArr) {
        this.f62178b = uVarArr;
        this.f62177a = uVarArr.length;
    }

    /* renamed from: a */
    public int mo35039a(C21961u uVar) {
        for (int i = 0; i < this.f62177a; i++) {
            if (this.f62178b[i] == uVar) {
                return i;
            }
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C21962v.class != obj.getClass()) {
            return false;
        }
        C21962v vVar = (C21962v) obj;
        return this.f62177a == vVar.f62177a && Arrays.equals(this.f62178b, vVar.f62178b);
    }

    public int hashCode() {
        if (this.f62179c == 0) {
            this.f62179c = Arrays.hashCode(this.f62178b);
        }
        return this.f62179c;
    }
}
