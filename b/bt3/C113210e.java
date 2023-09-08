package bt3;

import com.p013qq.taf.jce.JceInputStream;
import com.p013qq.taf.jce.JceOutputStream;
import com.p013qq.taf.jce.JceStruct;
import java.util.ArrayList;

/* renamed from: bt3.e */
public final class C113210e extends JceStruct {

    /* renamed from: j */
    public static ArrayList<C113212g> f338741j;

    /* renamed from: d */
    public long f338742d = 0;

    /* renamed from: e */
    public ArrayList<C113212g> f338743e = null;

    /* renamed from: f */
    public int f338744f = 0;

    /* renamed from: g */
    public int f338745g = 0;

    /* renamed from: h */
    public double f338746h = 0.0d;

    /* renamed from: i */
    public double f338747i = 0.0d;

    public void readFrom(JceInputStream jceInputStream) {
        this.f338742d = jceInputStream.read(this.f338742d, 0, true);
        if (f338741j == null) {
            f338741j = new ArrayList<>();
            f338741j.add(new C113212g());
        }
        this.f338743e = (ArrayList) jceInputStream.read(f338741j, 1, true);
        this.f338744f = jceInputStream.read(this.f338744f, 2, false);
        this.f338745g = jceInputStream.read(this.f338745g, 3, false);
        this.f338746h = jceInputStream.read(this.f338746h, 4, false);
        this.f338747i = jceInputStream.read(this.f338747i, 5, false);
    }

    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.f338742d, 0);
        jceOutputStream.write(this.f338743e, 1);
        int i = this.f338744f;
        if (i != 0) {
            jceOutputStream.write(i, 2);
        }
        int i2 = this.f338745g;
        if (i2 != 0) {
            jceOutputStream.write(i2, 3);
        }
        double d = this.f338746h;
        if (d != 0.0d) {
            jceOutputStream.write(d, 4);
        }
        double d2 = this.f338747i;
        if (d2 != 0.0d) {
            jceOutputStream.write(d2, 5);
        }
    }
}
