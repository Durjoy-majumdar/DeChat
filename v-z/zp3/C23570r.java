package zp3;

import android.view.View;
import gy3.C87412m;
import zp3.C23555k;

/* renamed from: zp3.r */
public final class C23570r {

    /* renamed from: a */
    public View f67562a;

    /* renamed from: b */
    public boolean f67563b;

    /* renamed from: c */
    public long f67564c = -1;

    /* renamed from: d */
    public View.OnAttachStateChangeListener f67565d;

    /* renamed from: e */
    public C23555k.C23562d f67566e;

    /* renamed from: f */
    public C23555k.C23559e f67567f;

    /* renamed from: g */
    public long f67568g;

    /* renamed from: h */
    public long f67569h;

    /* renamed from: i */
    public boolean f67570i;

    /* renamed from: j */
    public boolean f67571j;

    public C23570r(View view) {
        C87412m.m108594g(view, "view");
        this.f67562a = view;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C23570r) && C87412m.m108589b(this.f67562a, ((C23570r) obj).f67562a);
    }

    public int hashCode() {
        return this.f67562a.hashCode();
    }

    public String toString() {
        return "ExposedData(view=" + this.f67562a + ')';
    }
}
