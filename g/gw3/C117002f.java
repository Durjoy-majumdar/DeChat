package gw3;

import com.p013qq.taf.jce.JceInputStream;
import com.p013qq.taf.jce.JceOutputStream;
import com.p013qq.taf.jce.JceStruct;
import java.util.ArrayList;

/* renamed from: gw3.f */
public final class C117002f extends JceStruct {

    /* renamed from: j */
    public static ArrayList<C116999c> f350625j = new ArrayList<>();

    /* renamed from: n */
    public static ArrayList<C117005i> f350626n = new ArrayList<>();

    /* renamed from: o */
    public static ArrayList<C117004h> f350627o = new ArrayList<>();

    /* renamed from: p */
    public static C117001e f350628p = new C117001e();

    /* renamed from: d */
    public long f350629d = 0;

    /* renamed from: e */
    public ArrayList<C116999c> f350630e = null;

    /* renamed from: f */
    public int f350631f = 0;

    /* renamed from: g */
    public ArrayList<C117005i> f350632g = null;

    /* renamed from: h */
    public ArrayList<C117004h> f350633h = null;

    /* renamed from: i */
    public C117001e f350634i = null;

    static {
        f350625j.add(new C116999c());
        f350626n.add(new C117005i());
        f350627o.add(new C117004h());
    }

    public void readFrom(JceInputStream jceInputStream) {
        this.f350629d = jceInputStream.read(this.f350629d, 0, true);
        this.f350630e = (ArrayList) jceInputStream.read(f350625j, 1, false);
        this.f350631f = jceInputStream.read(this.f350631f, 2, false);
        this.f350632g = (ArrayList) jceInputStream.read(f350626n, 3, false);
        this.f350633h = (ArrayList) jceInputStream.read(f350627o, 4, false);
        this.f350634i = (C117001e) jceInputStream.read((JceStruct) f350628p, 5, false);
    }

    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.f350629d, 0);
        ArrayList<C116999c> arrayList = this.f350630e;
        if (arrayList != null) {
            jceOutputStream.write(arrayList, 1);
        }
        jceOutputStream.write(this.f350631f, 2);
        ArrayList<C117005i> arrayList2 = this.f350632g;
        if (arrayList2 != null) {
            jceOutputStream.write(arrayList2, 3);
        }
        ArrayList<C117004h> arrayList3 = this.f350633h;
        if (arrayList3 != null) {
            jceOutputStream.write(arrayList3, 4);
        }
        C117001e eVar = this.f350634i;
        if (eVar != null) {
            jceOutputStream.write((JceStruct) eVar, 5);
        }
    }
}
