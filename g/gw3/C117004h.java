package gw3;

import com.p013qq.taf.jce.JceInputStream;
import com.p013qq.taf.jce.JceOutputStream;
import com.p013qq.taf.jce.JceStruct;
import java.util.ArrayList;

/* renamed from: gw3.h */
public final class C117004h extends JceStruct {

    /* renamed from: f */
    public static ArrayList<Double> f350640f = new ArrayList<>();

    /* renamed from: d */
    public long f350641d = 0;

    /* renamed from: e */
    public ArrayList<Double> f350642e = null;

    static {
        f350640f.add(Double.valueOf(0.0d));
    }

    public void readFrom(JceInputStream jceInputStream) {
        this.f350641d = jceInputStream.read(this.f350641d, 0, true);
        this.f350642e = (ArrayList) jceInputStream.read(f350640f, 1, true);
    }

    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.f350641d, 0);
        jceOutputStream.write(this.f350642e, 1);
    }
}
