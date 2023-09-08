package androidx.recyclerview.widget;

/* renamed from: androidx.recyclerview.widget.d */
public class C54233d implements C54258u {

    /* renamed from: a */
    public final C54258u f152207a;

    /* renamed from: b */
    public int f152208b = 0;

    /* renamed from: c */
    public int f152209c = -1;

    /* renamed from: d */
    public int f152210d = -1;

    /* renamed from: e */
    public Object f152211e = null;

    public C54233d(C54258u uVar) {
        this.f152207a = uVar;
    }

    /* renamed from: a */
    public void mo2860a(int i, int i2) {
        int i3;
        if (this.f152208b != 2 || (i3 = this.f152209c) < i || i3 > i + i2) {
            mo75011e();
            this.f152209c = i;
            this.f152210d = i2;
            this.f152208b = 2;
            return;
        }
        this.f152210d += i2;
        this.f152209c = i;
    }

    /* renamed from: b */
    public void mo2861b(int i, int i2) {
        int i3;
        if (this.f152208b == 1 && i >= (i3 = this.f152209c)) {
            int i4 = this.f152210d;
            if (i <= i3 + i4) {
                this.f152210d = i4 + i2;
                this.f152209c = Math.min(i, i3);
                return;
            }
        }
        mo75011e();
        this.f152209c = i;
        this.f152210d = i2;
        this.f152208b = 1;
    }

    /* renamed from: c */
    public void mo2862c(int i, int i2, Object obj) {
        int i3;
        if (this.f152208b == 3) {
            int i4 = this.f152209c;
            int i5 = this.f152210d;
            if (i <= i4 + i5 && (i3 = i + i2) >= i4 && this.f152211e == obj) {
                this.f152209c = Math.min(i, i4);
                this.f152210d = Math.max(i5 + i4, i3) - this.f152209c;
                return;
            }
        }
        mo75011e();
        this.f152209c = i;
        this.f152210d = i2;
        this.f152211e = obj;
        this.f152208b = 3;
    }

    /* renamed from: d */
    public void mo2863d(int i, int i2) {
        mo75011e();
        this.f152207a.mo2863d(i, i2);
    }

    /* renamed from: e */
    public void mo75011e() {
        int i = this.f152208b;
        if (i != 0) {
            if (i == 1) {
                this.f152207a.mo2861b(this.f152209c, this.f152210d);
            } else if (i == 2) {
                this.f152207a.mo2860a(this.f152209c, this.f152210d);
            } else if (i == 3) {
                this.f152207a.mo2862c(this.f152209c, this.f152210d, this.f152211e);
            }
            this.f152211e = null;
            this.f152208b = 0;
        }
    }
}
