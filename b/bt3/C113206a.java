package bt3;

import com.p013qq.taf.jce.JceInputStream;
import com.p013qq.taf.jce.JceOutputStream;
import com.p013qq.taf.jce.JceStruct;
import java.util.ArrayList;

/* renamed from: bt3.a */
public final class C113206a extends JceStruct {

    /* renamed from: x */
    public static ArrayList<C113210e> f338715x;

    /* renamed from: d */
    public long f338716d = 0;

    /* renamed from: e */
    public String f338717e = "";

    /* renamed from: f */
    public ArrayList<C113210e> f338718f = null;

    /* renamed from: g */
    public int f338719g = 0;

    /* renamed from: h */
    public String f338720h = "";

    /* renamed from: i */
    public int f338721i = 0;

    /* renamed from: j */
    public int f338722j = 0;

    /* renamed from: n */
    public String f338723n = "";

    /* renamed from: o */
    public String f338724o = "";

    /* renamed from: p */
    public String f338725p = "";

    /* renamed from: q */
    public String f338726q = "";

    /* renamed from: r */
    public String f338727r = "";

    /* renamed from: s */
    public String f338728s = "";

    /* renamed from: t */
    public int f338729t = 0;

    /* renamed from: u */
    public int f338730u = 0;

    /* renamed from: v */
    public String f338731v = "";

    /* renamed from: w */
    public int f338732w = 0;

    public void readFrom(JceInputStream jceInputStream) {
        this.f338716d = jceInputStream.read(this.f338716d, 0, true);
        this.f338717e = jceInputStream.readString(1, true);
        if (f338715x == null) {
            f338715x = new ArrayList<>();
            f338715x.add(new C113210e());
        }
        this.f338718f = (ArrayList) jceInputStream.read(f338715x, 2, true);
        this.f338719g = jceInputStream.read(this.f338719g, 3, true);
        this.f338720h = jceInputStream.readString(4, true);
        this.f338721i = jceInputStream.read(this.f338721i, 5, true);
        this.f338722j = jceInputStream.read(this.f338722j, 6, true);
        this.f338723n = jceInputStream.readString(7, true);
        this.f338724o = jceInputStream.readString(8, false);
        this.f338725p = jceInputStream.readString(9, false);
        this.f338726q = jceInputStream.readString(10, false);
        this.f338727r = jceInputStream.readString(11, false);
        this.f338728s = jceInputStream.readString(12, false);
        this.f338729t = jceInputStream.read(this.f338729t, 13, false);
        this.f338730u = jceInputStream.read(this.f338730u, 14, false);
        this.f338731v = jceInputStream.readString(15, false);
        this.f338732w = jceInputStream.read(this.f338732w, 16, false);
    }

    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.f338716d, 0);
        jceOutputStream.write(this.f338717e, 1);
        jceOutputStream.write(this.f338718f, 2);
        jceOutputStream.write(this.f338719g, 3);
        jceOutputStream.write(this.f338720h, 4);
        jceOutputStream.write(this.f338721i, 5);
        jceOutputStream.write(this.f338722j, 6);
        jceOutputStream.write(this.f338723n, 7);
        String str = this.f338724o;
        if (str != null) {
            jceOutputStream.write(str, 8);
        }
        String str2 = this.f338725p;
        if (str2 != null) {
            jceOutputStream.write(str2, 9);
        }
        String str3 = this.f338726q;
        if (str3 != null) {
            jceOutputStream.write(str3, 10);
        }
        String str4 = this.f338727r;
        if (str4 != null) {
            jceOutputStream.write(str4, 11);
        }
        String str5 = this.f338728s;
        if (str5 != null) {
            jceOutputStream.write(str5, 12);
        }
        int i = this.f338729t;
        if (i != 0) {
            jceOutputStream.write(i, 13);
        }
        int i2 = this.f338730u;
        if (i2 != 0) {
            jceOutputStream.write(i2, 14);
        }
        String str6 = this.f338731v;
        if (str6 != null) {
            jceOutputStream.write(str6, 15);
        }
        jceOutputStream.write(this.f338732w, 16);
    }
}
