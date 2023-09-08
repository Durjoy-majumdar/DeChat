package ws3;

import com.p013qq.taf.jce.JceInputStream;
import com.p013qq.taf.jce.JceOutputStream;
import com.p013qq.taf.jce.JceStruct;

/* renamed from: ws3.c */
public final class C118786c extends JceStruct {

    /* renamed from: s */
    public static byte[] f355399s;

    /* renamed from: t */
    public static byte[] f355400t;

    /* renamed from: d */
    public int f355401d = 0;

    /* renamed from: e */
    public int f355402e = 0;

    /* renamed from: f */
    public int f355403f = 0;

    /* renamed from: g */
    public int f355404g = 0;

    /* renamed from: h */
    public int f355405h = 0;

    /* renamed from: i */
    public byte[] f355406i = null;

    /* renamed from: j */
    public int f355407j = 0;

    /* renamed from: n */
    public int f355408n = 0;

    /* renamed from: o */
    public long f355409o = 0;

    /* renamed from: p */
    public byte[] f355410p = null;

    /* renamed from: q */
    public int f355411q = 0;

    /* renamed from: r */
    public int f355412r = 0;

    static {
        byte[] bArr = new byte[1];
        f355399s = bArr;
        bArr[0] = 0;
        byte[] bArr2 = new byte[1];
        f355400t = bArr2;
        bArr2[0] = 0;
    }

    public JceStruct newInit() {
        return new C118786c();
    }

    public void readFrom(JceInputStream jceInputStream) {
        this.f355401d = jceInputStream.read(this.f355401d, 0, false);
        this.f355402e = jceInputStream.read(this.f355402e, 1, false);
        this.f355403f = jceInputStream.read(this.f355403f, 2, false);
        this.f355404g = jceInputStream.read(this.f355404g, 3, false);
        this.f355405h = jceInputStream.read(this.f355405h, 4, false);
        this.f355406i = jceInputStream.read(f355399s, 5, false);
        this.f355407j = jceInputStream.read(this.f355407j, 6, false);
        this.f355408n = jceInputStream.read(this.f355408n, 7, false);
        this.f355409o = jceInputStream.read(this.f355409o, 8, false);
        this.f355410p = jceInputStream.read(f355400t, 9, false);
        this.f355411q = jceInputStream.read(this.f355411q, 10, false);
        this.f355412r = jceInputStream.read(this.f355412r, 11, false);
    }

    public void writeTo(JceOutputStream jceOutputStream) {
        int i = this.f355401d;
        if (i != 0) {
            jceOutputStream.write(i, 0);
        }
        jceOutputStream.write(this.f355402e, 1);
        jceOutputStream.write(this.f355403f, 2);
        int i2 = this.f355404g;
        if (i2 != 0) {
            jceOutputStream.write(i2, 3);
        }
        int i3 = this.f355405h;
        if (i3 != 0) {
            jceOutputStream.write(i3, 4);
        }
        byte[] bArr = this.f355406i;
        if (bArr != null) {
            jceOutputStream.write(bArr, 5);
        }
        int i4 = this.f355407j;
        if (i4 != 0) {
            jceOutputStream.write(i4, 6);
        }
        int i5 = this.f355408n;
        if (i5 != 0) {
            jceOutputStream.write(i5, 7);
        }
        long j = this.f355409o;
        if (j != 0) {
            jceOutputStream.write(j, 8);
        }
        byte[] bArr2 = this.f355410p;
        if (bArr2 != null) {
            jceOutputStream.write(bArr2, 9);
        }
        int i6 = this.f355411q;
        if (i6 != 0) {
            jceOutputStream.write(i6, 10);
        }
        int i7 = this.f355412r;
        if (i7 != 0) {
            jceOutputStream.write(i7, 11);
        }
    }
}
