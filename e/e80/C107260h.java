package e80;

import com.tencent.p014mm.C0966R;
import gy3.C8480h;

/* renamed from: e80.h */
public final class C107260h {

    /* renamed from: a */
    public int f320918a;

    /* renamed from: b */
    public boolean f320919b;

    public C107260h() {
        this(0, false, 3, (C8480h) null);
    }

    public C107260h(int i, boolean z, int i2, C8480h hVar) {
        i = (i2 & 1) != 0 ? C0966R.color.akw : i;
        z = (i2 & 2) != 0 ? true : z;
        this.f320918a = i;
        this.f320919b = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C107260h)) {
            return false;
        }
        C107260h hVar = (C107260h) obj;
        return this.f320918a == hVar.f320918a && this.f320919b == hVar.f320919b;
    }

    public int hashCode() {
        int i = this.f320918a * 31;
        boolean z = this.f320919b;
        if (z) {
            z = true;
        }
        return i + (z ? 1 : 0);
    }

    public String toString() {
        return "CameraKitUiSetting(themeColor=" + this.f320918a + ", enableDoubleClickSwitch=" + this.f320919b + ')';
    }
}
