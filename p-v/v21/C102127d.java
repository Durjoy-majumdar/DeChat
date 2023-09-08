package v21;

import p21.C100616a;
import u21.C101941c;

/* renamed from: v21.d */
public class C102127d {

    /* renamed from: a */
    public int f300735a;

    /* renamed from: b */
    public int f300736b;

    /* renamed from: c */
    public int f300737c;

    /* renamed from: d */
    public int f300738d;

    public C102127d() {
        this.f300735a = -1;
        this.f300736b = -1;
        this.f300737c = -1;
        this.f300738d = -1;
    }

    /* renamed from: a */
    public int mo141642a() {
        int i;
        int i2;
        int i3;
        int i4 = this.f300735a;
        if (i4 >= 0 && (i = this.f300736b) >= 0 && (i2 = this.f300737c) >= 0 && (i3 = this.f300738d) >= 0 && i4 <= i2 && (i4 != i2 || i <= i3)) {
            C100616a l = C101941c.m134173q().mo141456l(this.f300735a);
            C100616a l2 = C101941c.m134173q().mo141456l(this.f300737c);
            if (!(l == null || l2 == null)) {
                int i5 = this.f300735a;
                int i6 = this.f300737c;
                if (i5 == i6 && this.f300736b == this.f300738d) {
                    return 1;
                }
                return (i5 == i6 && l.mo140076b() == 1) ? 2 : 3;
            }
        }
        return 0;
    }

    public C102127d(int i, int i2, int i3, int i4) {
        this.f300735a = i;
        this.f300736b = i2;
        this.f300737c = i3;
        this.f300738d = i4;
    }
}
