package tv3;

import com.p013qq.taf.jce.JceInputStream;
import com.p013qq.taf.jce.JceOutputStream;
import com.p013qq.taf.jce.JceStruct;

/* renamed from: tv3.b */
public final class C118547b extends JceStruct {

    /* renamed from: H */
    public static C118546a f354761H = new C118546a();

    /* renamed from: A */
    public String f354762A = "";

    /* renamed from: B */
    public int f354763B = 0;

    /* renamed from: C */
    public String f354764C = "";

    /* renamed from: D */
    public String f354765D = "";

    /* renamed from: E */
    public String f354766E = "";

    /* renamed from: F */
    public String f354767F = "";

    /* renamed from: G */
    public String f354768G = "";

    /* renamed from: d */
    public String f354769d = "";

    /* renamed from: e */
    public String f354770e = "";

    /* renamed from: f */
    public String f354771f = "";

    /* renamed from: g */
    public String f354772g = "";

    /* renamed from: h */
    public String f354773h = "";

    /* renamed from: i */
    public String f354774i = "";

    /* renamed from: j */
    public String f354775j = "";

    /* renamed from: n */
    public int f354776n = 0;

    /* renamed from: o */
    public int f354777o = 0;

    /* renamed from: p */
    public C118546a f354778p = null;

    /* renamed from: q */
    public String f354779q = "";

    /* renamed from: r */
    public String f354780r = "";

    /* renamed from: s */
    public int f354781s = 0;

    /* renamed from: t */
    public int f354782t = 0;

    /* renamed from: u */
    public int f354783u = 0;

    /* renamed from: v */
    public int f354784v = 0;

    /* renamed from: w */
    public String f354785w = "";

    /* renamed from: x */
    public short f354786x = 0;

    /* renamed from: y */
    public double f354787y = 0.0d;

    /* renamed from: z */
    public double f354788z = 0.0d;

    public JceStruct newInit() {
        return new C118547b();
    }

    public void readFrom(JceInputStream jceInputStream) {
        this.f354769d = jceInputStream.readString(0, true);
        this.f354770e = jceInputStream.readString(1, false);
        this.f354771f = jceInputStream.readString(2, false);
        this.f354772g = jceInputStream.readString(3, false);
        this.f354773h = jceInputStream.readString(4, false);
        this.f354774i = jceInputStream.readString(5, false);
        this.f354775j = jceInputStream.readString(6, false);
        this.f354776n = jceInputStream.read(this.f354776n, 7, false);
        this.f354777o = jceInputStream.read(this.f354777o, 8, false);
        this.f354778p = (C118546a) jceInputStream.read((JceStruct) f354761H, 9, false);
        this.f354779q = jceInputStream.readString(10, false);
        this.f354780r = jceInputStream.readString(11, false);
        this.f354781s = jceInputStream.read(this.f354781s, 12, false);
        this.f354782t = jceInputStream.read(this.f354782t, 13, false);
        this.f354783u = jceInputStream.read(this.f354783u, 14, false);
        this.f354784v = jceInputStream.read(this.f354784v, 15, false);
        this.f354785w = jceInputStream.readString(16, false);
        this.f354786x = jceInputStream.read(this.f354786x, 17, false);
        this.f354787y = jceInputStream.read(this.f354787y, 18, false);
        this.f354788z = jceInputStream.read(this.f354788z, 19, false);
        this.f354762A = jceInputStream.readString(20, false);
        this.f354763B = jceInputStream.read(this.f354763B, 21, false);
        this.f354764C = jceInputStream.readString(22, false);
        this.f354765D = jceInputStream.readString(23, false);
        this.f354766E = jceInputStream.readString(24, false);
        this.f354767F = jceInputStream.readString(25, false);
        this.f354768G = jceInputStream.readString(26, false);
    }

    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.f354769d, 0);
        String str = this.f354770e;
        if (str != null) {
            jceOutputStream.write(str, 1);
        }
        String str2 = this.f354771f;
        if (str2 != null) {
            jceOutputStream.write(str2, 2);
        }
        String str3 = this.f354772g;
        if (str3 != null) {
            jceOutputStream.write(str3, 3);
        }
        String str4 = this.f354773h;
        if (str4 != null) {
            jceOutputStream.write(str4, 4);
        }
        String str5 = this.f354774i;
        if (str5 != null) {
            jceOutputStream.write(str5, 5);
        }
        String str6 = this.f354775j;
        if (str6 != null) {
            jceOutputStream.write(str6, 6);
        }
        int i = this.f354776n;
        if (i != 0) {
            jceOutputStream.write(i, 7);
        }
        int i2 = this.f354777o;
        if (i2 != 0) {
            jceOutputStream.write(i2, 8);
        }
        C118546a aVar = this.f354778p;
        if (aVar != null) {
            jceOutputStream.write((JceStruct) aVar, 9);
        }
        String str7 = this.f354779q;
        if (str7 != null) {
            jceOutputStream.write(str7, 10);
        }
        String str8 = this.f354780r;
        if (str8 != null) {
            jceOutputStream.write(str8, 11);
        }
        int i3 = this.f354781s;
        if (i3 != 0) {
            jceOutputStream.write(i3, 12);
        }
        int i4 = this.f354782t;
        if (i4 != 0) {
            jceOutputStream.write(i4, 13);
        }
        int i5 = this.f354783u;
        if (i5 != 0) {
            jceOutputStream.write(i5, 14);
        }
        int i6 = this.f354784v;
        if (i6 != 0) {
            jceOutputStream.write(i6, 15);
        }
        String str9 = this.f354785w;
        if (str9 != null) {
            jceOutputStream.write(str9, 16);
        }
        short s = this.f354786x;
        if (s != 0) {
            jceOutputStream.write(s, 17);
        }
        double d = this.f354787y;
        if (d != 0.0d) {
            jceOutputStream.write(d, 18);
        }
        double d2 = this.f354788z;
        if (d2 != 0.0d) {
            jceOutputStream.write(d2, 19);
        }
        String str10 = this.f354762A;
        if (str10 != null) {
            jceOutputStream.write(str10, 20);
        }
        int i7 = this.f354763B;
        if (i7 != 0) {
            jceOutputStream.write(i7, 21);
        }
        String str11 = this.f354764C;
        if (str11 != null) {
            jceOutputStream.write(str11, 22);
        }
        String str12 = this.f354765D;
        if (str12 != null) {
            jceOutputStream.write(str12, 23);
        }
        String str13 = this.f354766E;
        if (str13 != null) {
            jceOutputStream.write(str13, 24);
        }
        String str14 = this.f354767F;
        if (str14 != null) {
            jceOutputStream.write(str14, 25);
        }
        String str15 = this.f354768G;
        if (str15 != null) {
            jceOutputStream.write(str15, 26);
        }
    }
}
