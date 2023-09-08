package p386u7;

import android.text.Layout;
import p383t7.C22439a;

/* renamed from: u7.b */
public final class C22603b extends C22439a implements Comparable<C22603b> {

    /* renamed from: g */
    public final int f64971g;

    public C22603b(CharSequence charSequence, Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3, boolean z, int i4, int i5) {
        super(charSequence, alignment, f, i, i2, f2, i3, f3, z, i4);
        this.f64971g = i5;
    }

    public int compareTo(Object obj) {
        int i = ((C22603b) obj).f64971g;
        int i2 = this.f64971g;
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }
}
