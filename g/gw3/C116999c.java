package gw3;

import com.p013qq.taf.jce.JceInputStream;
import com.p013qq.taf.jce.JceOutputStream;
import com.p013qq.taf.jce.JceStruct;
import java.util.ArrayList;

/* renamed from: gw3.c */
public final class C116999c extends JceStruct {

    /* renamed from: h */
    public static ArrayList<C117003g> f350615h = new ArrayList<>();

    /* renamed from: d */
    public long f350616d = 0;

    /* renamed from: e */
    public ArrayList<C117003g> f350617e = null;

    /* renamed from: f */
    public int f350618f = 0;

    /* renamed from: g */
    public int f350619g = 0;

    static {
        f350615h.add(new C117003g());
    }

    public void readFrom(JceInputStream jceInputStream) {
        this.f350616d = jceInputStream.read(this.f350616d, 0, true);
        this.f350617e = (ArrayList) jceInputStream.read(f350615h, 1, true);
        this.f350618f = jceInputStream.read(this.f350618f, 2, false);
        this.f350619g = jceInputStream.read(this.f350619g, 3, false);
    }

    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.f350616d, 0);
        jceOutputStream.write(this.f350617e, 1);
        jceOutputStream.write(this.f350618f, 2);
        jceOutputStream.write(this.f350619g, 3);
    }
}
