package bt3;

import com.p013qq.taf.jce.JceInputStream;
import com.p013qq.taf.jce.JceOutputStream;
import com.p013qq.taf.jce.JceStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: bt3.g */
public final class C113212g extends JceStruct {

    /* renamed from: n */
    public static Map<Integer, ArrayList<C113211f>> f338752n;

    /* renamed from: d */
    public long f338753d = 0;

    /* renamed from: e */
    public Map<Integer, ArrayList<C113211f>> f338754e = null;

    /* renamed from: f */
    public int f338755f = 0;

    /* renamed from: g */
    public int f338756g = 0;

    /* renamed from: h */
    public int f338757h = 0;

    /* renamed from: i */
    public int f338758i = 0;

    /* renamed from: j */
    public int f338759j = 0;

    public void readFrom(JceInputStream jceInputStream) {
        this.f338753d = jceInputStream.read(this.f338753d, 0, true);
        if (f338752n == null) {
            f338752n = new HashMap();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C113211f());
            f338752n.put(0, arrayList);
        }
        this.f338754e = (Map) jceInputStream.read(f338752n, 1, true);
        this.f338755f = jceInputStream.read(this.f338755f, 2, false);
        this.f338756g = jceInputStream.read(this.f338756g, 3, false);
        this.f338757h = jceInputStream.read(this.f338757h, 4, false);
        this.f338758i = jceInputStream.read(this.f338758i, 5, false);
        this.f338759j = jceInputStream.read(this.f338759j, 6, false);
    }

    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.f338753d, 0);
        jceOutputStream.write(this.f338754e, 1);
        jceOutputStream.write(this.f338755f, 2);
        jceOutputStream.write(this.f338756g, 3);
        jceOutputStream.write(this.f338757h, 4);
        jceOutputStream.write(this.f338758i, 5);
        int i = this.f338759j;
        if (i != 0) {
            jceOutputStream.write(i, 6);
        }
    }
}
