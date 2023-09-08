package jx3;

import com.p013qq.taf.jce.JceInputStream;
import com.p013qq.taf.jce.JceOutputStream;
import com.p013qq.taf.jce.JceStruct;

/* renamed from: jx3.a */
public final class C117368a extends JceStruct {

    /* renamed from: x */
    public static byte[] f351358x;

    /* renamed from: d */
    public String f351359d = "";

    /* renamed from: e */
    public int f351360e = 0;

    /* renamed from: f */
    public byte f351361f = 0;

    /* renamed from: g */
    public String f351362g = "";

    /* renamed from: h */
    public byte f351363h = 0;

    /* renamed from: i */
    public String f351364i = "";

    /* renamed from: j */
    public String f351365j = "";

    /* renamed from: n */
    public String f351366n = "";

    /* renamed from: o */
    public String f351367o = "";

    /* renamed from: p */
    public String f351368p = "";

    /* renamed from: q */
    public String f351369q = "";

    /* renamed from: r */
    public String f351370r = "";

    /* renamed from: s */
    public byte[] f351371s = null;

    /* renamed from: t */
    public String f351372t = "";

    /* renamed from: u */
    public String f351373u = "";

    /* renamed from: v */
    public byte f351374v = 0;

    /* renamed from: w */
    public byte f351375w = 0;

    public void display(StringBuilder sb, int i) {
    }

    public void readFrom(JceInputStream jceInputStream) {
        this.f351363h = jceInputStream.read(this.f351363h, 0, true);
        this.f351364i = jceInputStream.readString(1, true);
        this.f351366n = jceInputStream.readString(2, true);
        this.f351372t = jceInputStream.readString(3, true);
        this.f351373u = jceInputStream.readString(4, true);
        this.f351360e = jceInputStream.read(this.f351360e, 5, true);
        if (f351358x == null) {
            byte[] bArr = new byte[1];
            f351358x = bArr;
            bArr[0] = 0;
        }
        this.f351371s = jceInputStream.read(f351358x, 6, true);
        this.f351362g = jceInputStream.readString(7, false);
        this.f351368p = jceInputStream.readString(8, false);
        this.f351361f = jceInputStream.read(this.f351361f, 9, false);
        this.f351375w = jceInputStream.read(this.f351375w, 10, false);
        this.f351365j = jceInputStream.readString(11, false);
        this.f351370r = jceInputStream.readString(12, false);
        this.f351359d = jceInputStream.readString(13, false);
        this.f351374v = jceInputStream.read(this.f351374v, 14, false);
        this.f351367o = jceInputStream.readString(15, false);
        this.f351369q = jceInputStream.readString(16, false);
    }

    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.f351363h, 0);
        jceOutputStream.write(this.f351364i, 1);
        jceOutputStream.write(this.f351366n, 2);
        jceOutputStream.write(this.f351372t, 3);
        jceOutputStream.write(this.f351373u, 4);
        jceOutputStream.write(this.f351360e, 5);
        jceOutputStream.write(this.f351371s, 6);
        String str = this.f351362g;
        if (str != null) {
            jceOutputStream.write(str, 7);
        }
        String str2 = this.f351368p;
        if (str2 != null) {
            jceOutputStream.write(str2, 8);
        }
        jceOutputStream.write(this.f351361f, 9);
        jceOutputStream.write(this.f351375w, 10);
        String str3 = this.f351365j;
        if (str3 != null) {
            jceOutputStream.write(str3, 11);
        }
        String str4 = this.f351370r;
        if (str4 != null) {
            jceOutputStream.write(str4, 12);
        }
        String str5 = this.f351359d;
        if (str5 != null) {
            jceOutputStream.write(str5, 13);
        }
        jceOutputStream.write(this.f351374v, 14);
        String str6 = this.f351367o;
        if (str6 != null) {
            jceOutputStream.write(str6, 15);
        }
        String str7 = this.f351369q;
        if (str7 != null) {
            jceOutputStream.write(str7, 16);
        }
    }
}
