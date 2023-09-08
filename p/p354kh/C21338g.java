package p354kh;

/* renamed from: kh.g */
public class C21338g extends C21336d {

    /* renamed from: i */
    public float f60328i = 1.0f;

    /* renamed from: j */
    public boolean f60329j = true;

    /* renamed from: b */
    public byte[] mo33380b(int i, int i2, int i3) {
        this.f60329j = true;
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = 0;
            for (int i6 = 0; i6 < i; i6++) {
                i5 += this.f60320a[i6][i4];
            }
            int d = mo33382d(i5, this.f60329j);
            if (i4 == i2 / 2) {
                this.f60329j = true;
            }
            this.f60323d[i4] = mo33381c(d);
        }
        return mo33379a(i3, i2);
    }

    /* renamed from: d */
    public final int mo33382d(int i, boolean z) {
        float f = this.f60328i;
        float f2 = (float) i;
        int i2 = (int) (f * f2);
        int i3 = this.f60325f;
        if (i2 > i3) {
            float f3 = ((float) i3) / f2;
            this.f60328i = f3;
            if (f3 < 1.0f) {
                this.f60328i = f3 - ((1.0f - f3) / 16.0f);
            }
            return mo33382d(i2, false);
        }
        int i4 = this.f60326g;
        if (i2 < i4) {
            float f4 = ((float) i4) / f2;
            this.f60328i = f4;
            if (f4 < 1.0f) {
                this.f60328i = f4 - ((1.0f - f4) / 16.0f);
            }
            return mo33382d(i2, false);
        }
        if (z && i < i3 && i > i4) {
            if (f < 1.0f) {
                this.f60328i = f + ((1.0f - f) / 16.0f);
            } else {
                this.f60328i = 1.0f;
            }
            this.f60329j = false;
        }
        return i2;
    }
}
