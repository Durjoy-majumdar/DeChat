package vs3;

import com.p013qq.taf.jce.JceInputStream;
import com.p013qq.taf.jce.JceOutputStream;
import com.p013qq.taf.jce.JceStruct;

/* renamed from: vs3.c */
public final class C118697c extends JceStruct {

    /* renamed from: H */
    public static C118696b f355173H = new C118696b();

    /* renamed from: A */
    public String f355174A = "";

    /* renamed from: B */
    public int f355175B = 0;

    /* renamed from: C */
    public String f355176C = "";

    /* renamed from: D */
    public String f355177D = "";

    /* renamed from: E */
    public String f355178E = "";

    /* renamed from: F */
    public String f355179F = "";

    /* renamed from: G */
    public String f355180G = "";

    /* renamed from: d */
    public String f355181d = "";

    /* renamed from: e */
    public String f355182e = "";

    /* renamed from: f */
    public String f355183f = "";

    /* renamed from: g */
    public String f355184g = "";

    /* renamed from: h */
    public String f355185h = "";

    /* renamed from: i */
    public String f355186i = "";

    /* renamed from: j */
    public String f355187j = "";

    /* renamed from: n */
    public int f355188n = 0;

    /* renamed from: o */
    public int f355189o = 0;

    /* renamed from: p */
    public C118696b f355190p = null;

    /* renamed from: q */
    public String f355191q = "";

    /* renamed from: r */
    public String f355192r = "";

    /* renamed from: s */
    public int f355193s = 0;

    /* renamed from: t */
    public int f355194t = 0;

    /* renamed from: u */
    public int f355195u = 0;

    /* renamed from: v */
    public int f355196v = 0;

    /* renamed from: w */
    public String f355197w = "";

    /* renamed from: x */
    public short f355198x = 0;

    /* renamed from: y */
    public double f355199y = 0.0d;

    /* renamed from: z */
    public double f355200z = 0.0d;

    public JceStruct newInit() {
        return new C118697c();
    }

    public void readFrom(JceInputStream jceInputStream) {
        this.f355181d = jceInputStream.readString(0, true);
        this.f355182e = jceInputStream.readString(1, false);
        this.f355183f = jceInputStream.readString(2, false);
        this.f355184g = jceInputStream.readString(3, false);
        this.f355185h = jceInputStream.readString(4, false);
        this.f355186i = jceInputStream.readString(5, false);
        this.f355187j = jceInputStream.readString(6, false);
        this.f355188n = jceInputStream.read(this.f355188n, 7, false);
        this.f355189o = jceInputStream.read(this.f355189o, 8, false);
        this.f355190p = (C118696b) jceInputStream.read((JceStruct) f355173H, 9, false);
        this.f355191q = jceInputStream.readString(10, false);
        this.f355192r = jceInputStream.readString(11, false);
        this.f355193s = jceInputStream.read(this.f355193s, 12, false);
        this.f355194t = jceInputStream.read(this.f355194t, 13, false);
        this.f355195u = jceInputStream.read(this.f355195u, 14, false);
        this.f355196v = jceInputStream.read(this.f355196v, 15, false);
        this.f355197w = jceInputStream.readString(16, false);
        this.f355198x = jceInputStream.read(this.f355198x, 17, false);
        this.f355199y = jceInputStream.read(this.f355199y, 18, false);
        this.f355200z = jceInputStream.read(this.f355200z, 19, false);
        this.f355174A = jceInputStream.readString(20, false);
        this.f355175B = jceInputStream.read(this.f355175B, 21, false);
        this.f355176C = jceInputStream.readString(22, false);
        this.f355177D = jceInputStream.readString(23, false);
        this.f355178E = jceInputStream.readString(24, false);
        this.f355179F = jceInputStream.readString(25, false);
        this.f355180G = jceInputStream.readString(26, false);
    }

    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.f355181d, 0);
        String str = this.f355182e;
        if (str != null) {
            jceOutputStream.write(str, 1);
        }
        String str2 = this.f355183f;
        if (str2 != null) {
            jceOutputStream.write(str2, 2);
        }
        String str3 = this.f355184g;
        if (str3 != null) {
            jceOutputStream.write(str3, 3);
        }
        String str4 = this.f355185h;
        if (str4 != null) {
            jceOutputStream.write(str4, 4);
        }
        String str5 = this.f355186i;
        if (str5 != null) {
            jceOutputStream.write(str5, 5);
        }
        String str6 = this.f355187j;
        if (str6 != null) {
            jceOutputStream.write(str6, 6);
        }
        int i = this.f355188n;
        if (i != 0) {
            jceOutputStream.write(i, 7);
        }
        int i2 = this.f355189o;
        if (i2 != 0) {
            jceOutputStream.write(i2, 8);
        }
        C118696b bVar = this.f355190p;
        if (bVar != null) {
            jceOutputStream.write((JceStruct) bVar, 9);
        }
        String str7 = this.f355191q;
        if (str7 != null) {
            jceOutputStream.write(str7, 10);
        }
        String str8 = this.f355192r;
        if (str8 != null) {
            jceOutputStream.write(str8, 11);
        }
        int i3 = this.f355193s;
        if (i3 != 0) {
            jceOutputStream.write(i3, 12);
        }
        int i4 = this.f355194t;
        if (i4 != 0) {
            jceOutputStream.write(i4, 13);
        }
        int i5 = this.f355195u;
        if (i5 != 0) {
            jceOutputStream.write(i5, 14);
        }
        int i6 = this.f355196v;
        if (i6 != 0) {
            jceOutputStream.write(i6, 15);
        }
        String str9 = this.f355197w;
        if (str9 != null) {
            jceOutputStream.write(str9, 16);
        }
        short s = this.f355198x;
        if (s != 0) {
            jceOutputStream.write(s, 17);
        }
        double d = this.f355199y;
        if (d != 0.0d) {
            jceOutputStream.write(d, 18);
        }
        double d2 = this.f355200z;
        if (d2 != 0.0d) {
            jceOutputStream.write(d2, 19);
        }
        String str10 = this.f355174A;
        if (str10 != null) {
            jceOutputStream.write(str10, 20);
        }
        int i7 = this.f355175B;
        if (i7 != 0) {
            jceOutputStream.write(i7, 21);
        }
        String str11 = this.f355176C;
        if (str11 != null) {
            jceOutputStream.write(str11, 22);
        }
        String str12 = this.f355177D;
        if (str12 != null) {
            jceOutputStream.write(str12, 23);
        }
        String str13 = this.f355178E;
        if (str13 != null) {
            jceOutputStream.write(str13, 24);
        }
        String str14 = this.f355179F;
        if (str14 != null) {
            jceOutputStream.write(str14, 25);
        }
        String str15 = this.f355180G;
        if (str15 != null) {
            jceOutputStream.write(str15, 26);
        }
    }
}
