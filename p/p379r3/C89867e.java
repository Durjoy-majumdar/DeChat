package p379r3;

import android.text.TextUtils;
import java.util.Objects;

/* renamed from: r3.e */
public class C89867e {

    /* renamed from: a */
    public String f258302a;

    /* renamed from: b */
    public int f258303b;

    /* renamed from: c */
    public int f258304c;

    public C89867e(String str, int i, int i2) {
        this.f258302a = str;
        this.f258303b = i;
        this.f258304c = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C89867e)) {
            return false;
        }
        C89867e eVar = (C89867e) obj;
        return (this.f258303b < 0 || eVar.f258303b < 0) ? TextUtils.equals(this.f258302a, eVar.f258302a) && this.f258304c == eVar.f258304c : TextUtils.equals(this.f258302a, eVar.f258302a) && this.f258303b == eVar.f258303b && this.f258304c == eVar.f258304c;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f258302a, Integer.valueOf(this.f258304c)});
    }
}
