package gw3;

import com.p013qq.taf.jce.JceInputStream;
import com.p013qq.taf.jce.JceOutputStream;
import com.p013qq.taf.jce.JceStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: gw3.a */
public final class C116997a extends JceStruct {

    /* renamed from: G */
    public static ArrayList<C117002f> f350582G = new ArrayList<>();

    /* renamed from: H */
    public static ArrayList<C117000d> f350583H = new ArrayList<>();

    /* renamed from: I */
    public static C116998b f350584I = new C116998b();

    /* renamed from: J */
    public static byte[] f350585J;

    /* renamed from: K */
    public static Map<String, String> f350586K;

    /* renamed from: A */
    public int f350587A = 0;

    /* renamed from: B */
    public C116998b f350588B = null;

    /* renamed from: C */
    public String f350589C = "";

    /* renamed from: D */
    public byte[] f350590D = null;

    /* renamed from: E */
    public String f350591E = "";

    /* renamed from: F */
    public Map<String, String> f350592F = null;

    /* renamed from: d */
    public String f350593d = "";

    /* renamed from: e */
    public int f350594e = 0;

    /* renamed from: f */
    public long f350595f = 0;

    /* renamed from: g */
    public ArrayList<C117002f> f350596g = null;

    /* renamed from: h */
    public long f350597h = 0;

    /* renamed from: i */
    public int f350598i = 0;

    /* renamed from: j */
    public int f350599j = 0;

    /* renamed from: n */
    public int f350600n = 0;

    /* renamed from: o */
    public String f350601o = "";

    /* renamed from: p */
    public int f350602p = 0;

    /* renamed from: q */
    public String f350603q = "";

    /* renamed from: r */
    public String f350604r = "";

    /* renamed from: s */
    public ArrayList<C117000d> f350605s = null;

    /* renamed from: t */
    public int f350606t = 0;

    /* renamed from: u */
    public String f350607u = "";

    /* renamed from: v */
    public String f350608v = "";

    /* renamed from: w */
    public String f350609w = "";

    /* renamed from: x */
    public String f350610x = "";

    /* renamed from: y */
    public int f350611y = 0;

    /* renamed from: z */
    public String f350612z = "";

    static {
        f350582G.add(new C117002f());
        f350583H.add(new C117000d());
        byte[] bArr = new byte[1];
        f350585J = bArr;
        bArr[0] = 0;
        HashMap hashMap = new HashMap();
        f350586K = hashMap;
        hashMap.put("", "");
    }

    public void readFrom(JceInputStream jceInputStream) {
        this.f350593d = jceInputStream.readString(0, true);
        this.f350594e = jceInputStream.read(this.f350594e, 1, true);
        this.f350595f = jceInputStream.read(this.f350595f, 2, false);
        this.f350596g = (ArrayList) jceInputStream.read(f350582G, 3, false);
        this.f350597h = jceInputStream.read(this.f350597h, 4, false);
        this.f350598i = jceInputStream.read(this.f350598i, 5, false);
        this.f350599j = jceInputStream.read(this.f350599j, 6, false);
        this.f350600n = jceInputStream.read(this.f350600n, 7, false);
        this.f350601o = jceInputStream.readString(8, false);
        this.f350602p = jceInputStream.read(this.f350602p, 9, false);
        this.f350603q = jceInputStream.readString(10, false);
        this.f350604r = jceInputStream.readString(11, false);
        this.f350605s = (ArrayList) jceInputStream.read(f350583H, 12, false);
        this.f350606t = jceInputStream.read(this.f350606t, 14, false);
        this.f350607u = jceInputStream.readString(15, false);
        this.f350608v = jceInputStream.readString(16, false);
        this.f350609w = jceInputStream.readString(17, false);
        this.f350610x = jceInputStream.readString(18, false);
        this.f350611y = jceInputStream.read(this.f350611y, 19, false);
        this.f350612z = jceInputStream.readString(20, false);
        this.f350587A = jceInputStream.read(this.f350587A, 21, false);
        this.f350588B = (C116998b) jceInputStream.read((JceStruct) f350584I, 22, false);
        this.f350589C = jceInputStream.readString(23, false);
        this.f350590D = jceInputStream.read(f350585J, 24, false);
        this.f350591E = jceInputStream.readString(25, false);
        this.f350592F = (Map) jceInputStream.read(f350586K, 26, false);
    }

    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.f350593d, 0);
        jceOutputStream.write(this.f350594e, 1);
        jceOutputStream.write(this.f350595f, 2);
        ArrayList<C117002f> arrayList = this.f350596g;
        if (arrayList != null) {
            jceOutputStream.write(arrayList, 3);
        }
        jceOutputStream.write(this.f350597h, 4);
        jceOutputStream.write(this.f350598i, 5);
        jceOutputStream.write(this.f350599j, 6);
        jceOutputStream.write(this.f350600n, 7);
        String str = this.f350601o;
        if (str != null) {
            jceOutputStream.write(str, 8);
        }
        jceOutputStream.write(this.f350602p, 9);
        String str2 = this.f350603q;
        if (str2 != null) {
            jceOutputStream.write(str2, 10);
        }
        String str3 = this.f350604r;
        if (str3 != null) {
            jceOutputStream.write(str3, 11);
        }
        ArrayList<C117000d> arrayList2 = this.f350605s;
        if (arrayList2 != null) {
            jceOutputStream.write(arrayList2, 12);
        }
        jceOutputStream.write(this.f350606t, 14);
        String str4 = this.f350607u;
        if (str4 != null) {
            jceOutputStream.write(str4, 15);
        }
        String str5 = this.f350608v;
        if (str5 != null) {
            jceOutputStream.write(str5, 16);
        }
        String str6 = this.f350609w;
        if (str6 != null) {
            jceOutputStream.write(str6, 17);
        }
        String str7 = this.f350610x;
        if (str7 != null) {
            jceOutputStream.write(str7, 18);
        }
        jceOutputStream.write(this.f350611y, 19);
        String str8 = this.f350612z;
        if (str8 != null) {
            jceOutputStream.write(str8, 20);
        }
        jceOutputStream.write(this.f350587A, 21);
        C116998b bVar = this.f350588B;
        if (bVar != null) {
            jceOutputStream.write((JceStruct) bVar, 22);
        }
        String str9 = this.f350589C;
        if (str9 != null) {
            jceOutputStream.write(str9, 23);
        }
        byte[] bArr = this.f350590D;
        if (bArr != null) {
            jceOutputStream.write(bArr, 24);
        }
        String str10 = this.f350591E;
        if (str10 != null) {
            jceOutputStream.write(str10, 25);
        }
        Map<String, String> map = this.f350592F;
        if (map != null) {
            jceOutputStream.write(map, 26);
        }
    }
}
