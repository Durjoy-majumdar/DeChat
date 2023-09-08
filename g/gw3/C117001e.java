package gw3;

import com.p013qq.taf.jce.JceInputStream;
import com.p013qq.taf.jce.JceOutputStream;
import com.p013qq.taf.jce.JceStruct;

/* renamed from: gw3.e */
public final class C117001e extends JceStruct {

    /* renamed from: d */
    public int f350622d = 0;

    /* renamed from: e */
    public float f350623e = 0.0f;

    /* renamed from: f */
    public float f350624f = 0.0f;

    public void readFrom(JceInputStream jceInputStream) {
        this.f350622d = jceInputStream.read(this.f350622d, 0, false);
        this.f350623e = jceInputStream.read(this.f350623e, 1, false);
        this.f350624f = jceInputStream.read(this.f350624f, 2, false);
    }

    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.f350622d, 0);
        jceOutputStream.write(this.f350623e, 1);
        jceOutputStream.write(this.f350624f, 2);
    }
}
