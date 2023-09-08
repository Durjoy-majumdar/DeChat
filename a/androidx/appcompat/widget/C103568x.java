package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.x */
public class C103568x {

    /* renamed from: a */
    public int f305856a = 0;

    /* renamed from: b */
    public int f305857b = 0;

    /* renamed from: c */
    public int f305858c = Integer.MIN_VALUE;

    /* renamed from: d */
    public int f305859d = Integer.MIN_VALUE;

    /* renamed from: e */
    public int f305860e = 0;

    /* renamed from: f */
    public int f305861f = 0;

    /* renamed from: g */
    public boolean f305862g = false;

    /* renamed from: h */
    public boolean f305863h = false;

    /* renamed from: a */
    public void mo144446a(int i, int i2) {
        this.f305858c = i;
        this.f305859d = i2;
        this.f305863h = true;
        if (this.f305862g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f305856a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f305857b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f305856a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f305857b = i2;
        }
    }
}
