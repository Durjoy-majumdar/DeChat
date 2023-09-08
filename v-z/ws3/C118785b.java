package ws3;

import com.p013qq.taf.jce.JceInputStream;
import com.p013qq.taf.jce.JceOutputStream;
import com.p013qq.taf.jce.JceStruct;
import java.util.ArrayList;

/* renamed from: ws3.b */
public final class C118785b extends JceStruct {

    /* renamed from: A */
    public static byte[] f355376A;

    /* renamed from: B */
    public static ArrayList<Integer> f355377B = new ArrayList<>();

    /* renamed from: C */
    public static ArrayList<byte[]> f355378C;

    /* renamed from: z */
    public static byte[] f355379z;

    /* renamed from: d */
    public int f355380d = 0;

    /* renamed from: e */
    public byte[] f355381e = null;

    /* renamed from: f */
    public String f355382f = "";

    /* renamed from: g */
    public byte[] f355383g = null;

    /* renamed from: h */
    public long f355384h = 0;

    /* renamed from: i */
    public String f355385i = "";

    /* renamed from: j */
    public int f355386j = 0;

    /* renamed from: n */
    public String f355387n = "";

    /* renamed from: o */
    public int f355388o = 0;

    /* renamed from: p */
    public String f355389p = "";

    /* renamed from: q */
    public int f355390q = 0;

    /* renamed from: r */
    public int f355391r = 0;

    /* renamed from: s */
    public int f355392s = 0;

    /* renamed from: t */
    public ArrayList<Integer> f355393t = null;

    /* renamed from: u */
    public int f355394u = 0;

    /* renamed from: v */
    public boolean f355395v = false;

    /* renamed from: w */
    public int f355396w = 0;

    /* renamed from: x */
    public int f355397x = 0;

    /* renamed from: y */
    public ArrayList<byte[]> f355398y = null;

    static {
        byte[] bArr = new byte[1];
        f355379z = bArr;
        bArr[0] = 0;
        byte[] bArr2 = new byte[1];
        f355376A = bArr2;
        bArr2[0] = 0;
        f355377B.add(0);
        ArrayList<byte[]> arrayList = new ArrayList<>();
        f355378C = arrayList;
        arrayList.add(new byte[]{0});
    }

    public JceStruct newInit() {
        return new C118785b();
    }

    public void readFrom(JceInputStream jceInputStream) {
        this.f355380d = jceInputStream.read(this.f355380d, 0, true);
        this.f355381e = jceInputStream.read(f355379z, 1, false);
        this.f355382f = jceInputStream.readString(2, false);
        this.f355383g = jceInputStream.read(f355376A, 3, false);
        this.f355384h = jceInputStream.read(this.f355384h, 4, false);
        this.f355385i = jceInputStream.readString(5, false);
        this.f355386j = jceInputStream.read(this.f355386j, 6, false);
        this.f355387n = jceInputStream.readString(7, false);
        this.f355388o = jceInputStream.read(this.f355388o, 8, false);
        this.f355389p = jceInputStream.readString(9, false);
        this.f355390q = jceInputStream.read(this.f355390q, 10, false);
        this.f355391r = jceInputStream.read(this.f355391r, 11, false);
        this.f355392s = jceInputStream.read(this.f355392s, 12, false);
        this.f355393t = (ArrayList) jceInputStream.read(f355377B, 13, false);
        this.f355394u = jceInputStream.read(this.f355394u, 14, false);
        this.f355395v = jceInputStream.read(this.f355395v, 15, false);
        this.f355396w = jceInputStream.read(this.f355396w, 16, false);
        this.f355397x = jceInputStream.read(this.f355397x, 17, false);
        this.f355398y = (ArrayList) jceInputStream.read(f355378C, 18, false);
    }

    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.f355380d, 0);
        byte[] bArr = this.f355381e;
        if (bArr != null) {
            jceOutputStream.write(bArr, 1);
        }
        String str = this.f355382f;
        if (str != null) {
            jceOutputStream.write(str, 2);
        }
        byte[] bArr2 = this.f355383g;
        if (bArr2 != null) {
            jceOutputStream.write(bArr2, 3);
        }
        long j = this.f355384h;
        if (j != 0) {
            jceOutputStream.write(j, 4);
        }
        String str2 = this.f355385i;
        if (str2 != null) {
            jceOutputStream.write(str2, 5);
        }
        int i = this.f355386j;
        if (i != 0) {
            jceOutputStream.write(i, 6);
        }
        String str3 = this.f355387n;
        if (str3 != null) {
            jceOutputStream.write(str3, 7);
        }
        int i2 = this.f355388o;
        if (i2 != 0) {
            jceOutputStream.write(i2, 8);
        }
        String str4 = this.f355389p;
        if (str4 != null) {
            jceOutputStream.write(str4, 9);
        }
        jceOutputStream.write(this.f355390q, 10);
        int i3 = this.f355391r;
        if (i3 != 0) {
            jceOutputStream.write(i3, 11);
        }
        int i4 = this.f355392s;
        if (i4 != 0) {
            jceOutputStream.write(i4, 12);
        }
        ArrayList<Integer> arrayList = this.f355393t;
        if (arrayList != null) {
            jceOutputStream.write(arrayList, 13);
        }
        int i5 = this.f355394u;
        if (i5 != 0) {
            jceOutputStream.write(i5, 14);
        }
        jceOutputStream.write(this.f355395v, 15);
        int i6 = this.f355396w;
        if (i6 != 0) {
            jceOutputStream.write(i6, 16);
        }
        jceOutputStream.write(this.f355397x, 17);
        ArrayList<byte[]> arrayList2 = this.f355398y;
        if (arrayList2 != null) {
            jceOutputStream.write(arrayList2, 18);
        }
    }
}
