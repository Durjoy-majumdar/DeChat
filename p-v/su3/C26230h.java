package su3;

/* renamed from: su3.h */
public final class C26230h extends C26223a {

    /* renamed from: c */
    public short[] f73132c;

    public C26230h(int i) {
        if (i >= 0) {
            this.f73132c = new short[i];
            return;
        }
        throw new IllegalArgumentException("initSize < 0");
    }

    /* renamed from: b */
    public void mo53114b(short s) {
        int i = this.f73123b;
        short[] sArr = this.f73132c;
        if (sArr.length - i < 1) {
            short[] sArr2 = new short[(sArr.length + (sArr.length >> 1))];
            System.arraycopy(sArr, 0, sArr2, 0, i);
            this.f73132c = sArr2;
        }
        short[] sArr3 = this.f73132c;
        int i2 = this.f73123b;
        sArr3[i2] = s;
        this.f73123b = i2 + 1;
    }

    /* renamed from: c */
    public void mo53115c(short s, short s2) {
        mo53114b(s);
        mo53114b(s2);
    }

    /* renamed from: d */
    public void mo53116d(short s, short s2, short s3) {
        mo53114b(s);
        mo53114b(s2);
        mo53114b(s3);
    }

    /* renamed from: e */
    public void mo53117e(int i) {
        mo53114b((short) i);
        mo53114b((short) (i >> 16));
    }
}
