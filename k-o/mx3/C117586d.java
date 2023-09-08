package mx3;

import com.p013qq.taf.jce.JceInputStream;
import com.p013qq.taf.jce.JceOutputStream;
import com.p013qq.taf.jce.JceStruct;
import java.util.ArrayList;

/* renamed from: mx3.d */
public final class C117586d extends JceStruct implements Cloneable {

    /* renamed from: E */
    public static ArrayList<C117583a> f351755E;

    /* renamed from: F */
    public static ArrayList<C117584b> f351756F;

    /* renamed from: G */
    public static C117585c f351757G;

    /* renamed from: H */
    public static C117588f f351758H;

    /* renamed from: I */
    public static ArrayList<C117589g> f351759I;

    /* renamed from: J */
    public static C117590h f351760J;

    /* renamed from: A */
    public C117590h f351761A = null;

    /* renamed from: B */
    public String f351762B = "";

    /* renamed from: C */
    public String f351763C = "";

    /* renamed from: D */
    public String f351764D = "";

    /* renamed from: d */
    public String f351765d = "";

    /* renamed from: e */
    public ArrayList<C117583a> f351766e = null;

    /* renamed from: f */
    public String f351767f = "";

    /* renamed from: g */
    public String f351768g = "";

    /* renamed from: h */
    public String f351769h = "";

    /* renamed from: i */
    public ArrayList<C117584b> f351770i = null;

    /* renamed from: j */
    public String f351771j = "";

    /* renamed from: n */
    public long f351772n = 0;

    /* renamed from: o */
    public String f351773o = "";

    /* renamed from: p */
    public C117585c f351774p = null;

    /* renamed from: q */
    public long f351775q = 0;

    /* renamed from: r */
    public String f351776r = "";

    /* renamed from: s */
    public String f351777s = "";

    /* renamed from: t */
    public String f351778t = "";

    /* renamed from: u */
    public String f351779u = "";

    /* renamed from: v */
    public String f351780v = "";

    /* renamed from: w */
    public String f351781w = "";

    /* renamed from: x */
    public C117588f f351782x = null;

    /* renamed from: y */
    public ArrayList<C117589g> f351783y = null;

    /* renamed from: z */
    public String f351784z = "";

    public void display(StringBuilder sb, int i) {
    }

    public void readFrom(JceInputStream jceInputStream) {
        this.f351778t = jceInputStream.readString(0, true);
        this.f351777s = jceInputStream.readString(1, false);
        this.f351780v = jceInputStream.readString(2, false);
        this.f351772n = jceInputStream.read(this.f351772n, 3, true);
        if (f351756F == null) {
            ArrayList<C117584b> arrayList = new ArrayList<>();
            f351756F = arrayList;
            arrayList.add(new C117584b());
        }
        this.f351770i = (ArrayList) jceInputStream.read(f351756F, 4, true);
        this.f351763C = jceInputStream.readString(5, false);
        this.f351771j = jceInputStream.readString(6, false);
        this.f351773o = jceInputStream.readString(7, false);
        if (f351758H == null) {
            f351758H = new C117588f();
        }
        this.f351782x = (C117588f) jceInputStream.read((JceStruct) f351758H, 8, false);
        if (f351760J == null) {
            f351760J = new C117590h();
        }
        this.f351761A = (C117590h) jceInputStream.read((JceStruct) f351760J, 9, false);
        if (f351757G == null) {
            f351757G = new C117585c();
        }
        this.f351774p = (C117585c) jceInputStream.read((JceStruct) f351757G, 10, false);
        this.f351776r = jceInputStream.readString(11, false);
        if (f351755E == null) {
            ArrayList<C117583a> arrayList2 = new ArrayList<>();
            f351755E = arrayList2;
            arrayList2.add(new C117583a());
        }
        this.f351766e = (ArrayList) jceInputStream.read(f351755E, 12, false);
        this.f351775q = jceInputStream.read(this.f351775q, 13, false);
        this.f351781w = jceInputStream.readString(14, false);
        this.f351768g = jceInputStream.readString(15, false);
        this.f351784z = jceInputStream.readString(16, false);
        this.f351767f = jceInputStream.readString(17, false);
        this.f351764D = jceInputStream.readString(18, false);
        this.f351769h = jceInputStream.readString(19, false);
        this.f351765d = jceInputStream.readString(20, false);
        if (f351759I == null) {
            ArrayList<C117589g> arrayList3 = new ArrayList<>();
            f351759I = arrayList3;
            arrayList3.add(new C117589g());
        }
        this.f351783y = (ArrayList) jceInputStream.read(f351759I, 21, false);
        this.f351779u = jceInputStream.readString(22, false);
        this.f351762B = jceInputStream.readString(23, false);
    }

    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.f351778t, 0);
        String str = this.f351777s;
        if (str != null) {
            jceOutputStream.write(str, 1);
        }
        String str2 = this.f351780v;
        if (str2 != null) {
            jceOutputStream.write(str2, 2);
        }
        jceOutputStream.write(this.f351772n, 3);
        jceOutputStream.write(this.f351770i, 4);
        String str3 = this.f351763C;
        if (str3 != null) {
            jceOutputStream.write(str3, 5);
        }
        String str4 = this.f351771j;
        if (str4 != null) {
            jceOutputStream.write(str4, 6);
        }
        String str5 = this.f351773o;
        if (str5 != null) {
            jceOutputStream.write(str5, 7);
        }
        C117588f fVar = this.f351782x;
        if (fVar != null) {
            jceOutputStream.write((JceStruct) fVar, 8);
        }
        C117590h hVar = this.f351761A;
        if (hVar != null) {
            jceOutputStream.write((JceStruct) hVar, 9);
        }
        C117585c cVar = this.f351774p;
        if (cVar != null) {
            jceOutputStream.write((JceStruct) cVar, 10);
        }
        String str6 = this.f351776r;
        if (str6 != null) {
            jceOutputStream.write(str6, 11);
        }
        ArrayList<C117583a> arrayList = this.f351766e;
        if (arrayList != null) {
            jceOutputStream.write(arrayList, 12);
        }
        jceOutputStream.write(this.f351775q, 13);
        String str7 = this.f351781w;
        if (str7 != null) {
            jceOutputStream.write(str7, 14);
        }
        String str8 = this.f351768g;
        if (str8 != null) {
            jceOutputStream.write(str8, 15);
        }
        String str9 = this.f351784z;
        if (str9 != null) {
            jceOutputStream.write(str9, 16);
        }
        String str10 = this.f351767f;
        if (str10 != null) {
            jceOutputStream.write(str10, 17);
        }
        String str11 = this.f351764D;
        if (str11 != null) {
            jceOutputStream.write(str11, 18);
        }
        String str12 = this.f351769h;
        if (str12 != null) {
            jceOutputStream.write(str12, 19);
        }
        String str13 = this.f351765d;
        if (str13 != null) {
            jceOutputStream.write(str13, 20);
        }
        ArrayList<C117589g> arrayList2 = this.f351783y;
        if (arrayList2 != null) {
            jceOutputStream.write(arrayList2, 21);
        }
        String str14 = this.f351779u;
        if (str14 != null) {
            jceOutputStream.write(str14, 22);
        }
        String str15 = this.f351762B;
        if (str15 != null) {
            jceOutputStream.write(str15, 23);
        }
    }
}
